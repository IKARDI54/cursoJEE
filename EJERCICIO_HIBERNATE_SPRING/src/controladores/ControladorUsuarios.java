package controladores;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.org.apache.bcel.internal.generic.NEW;

import daos.UsuariosDAO;
import modelo.Usuario;

/**
 * @author Ares
 * Controlador que atiende las rutas:
 * + login
 * + identificarUsuario
 * + registrarUsuario
 * + guardarUsuario
 *
 */
@Controller
public class ControladorUsuarios {
	
	@Autowired
	private UsuariosDAO usuariosDAO;
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("identificarUsuario")
	public String identificarUsuario(HttpServletRequest request, String email, String pass) {
		System.out.println("email: " + email);
		System.out.println("pass: " + pass);
		Usuario u = 
		  usuariosDAO.obtenerUsuarioPorEmailYpass(email, pass);
		if(u == null) {
			return "login";
		}else {
			request.getSession().setAttribute("idUsuario", 
					u.getId());
			request.getSession().setAttribute("nombre", 
					u.getNombre());
			return "loginCorrecto";
		}
	}
	
	@RequestMapping("registrarUsuario")
	public String registrarUsuario(Map model) {
		model.put("nuevoUsuario", new Usuario());
		return "registrarUsuario";
	}
	
	@RequestMapping("guardarUsuario")
	public String guardarUsuario(Usuario nuevoUsuario) {
		usuariosDAO.registrarUsuario(nuevoUsuario);
		return "registroCorrecto";
	}

}
