package servlets.admin;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import modelo.Usuario;
import modelo.UsuariosDAO;
import modelo.UsuariosDAOImpl;

/**
 * Servlet implementation class ServletAdminGuardarCambiosUsuario
 */
@MultipartConfig
@WebServlet("/admin/ServletAdminGuardarCambiosUsuario")
public class ServletAdminGuardarCambiosUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recoger todo en forma de string
		String nombre = request.getParameter("campoNombre");
		String email = request.getParameter("campoEmail");
		String pass = request.getParameter("campoPass");
		String id = request.getParameter("campoId");
		
		//validar las informaciones usando expresiones regulares
		
		//una vez validado todo, puedo hacer la transformacion
		//a tipo int del id donde quiera, incluso directamente
		//cuando creo el objeto con los datos a guardar cambios
		Usuario usuarioGuardarCambios = 
			new Usuario(nombre, pass, email, Integer.parseInt(id));
		
		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
		usuariosDAO.actualizarUsuario(usuarioGuardarCambios);
		
		//si todo ha ido bien y se ha validado todo
		Part imagen = request.getPart("campoImagen");
		String carpetaSubidas = getServletContext().getRealPath("") + File.separator + "usuarios";
		
		String ruta = carpetaSubidas+File.separator+id+".jpg";
		imagen.write(ruta);
		System.out.println(ruta);
		
		RequestDispatcher rd = 
				getServletContext().getRequestDispatcher(
				"/admin/ServletAdminListarUsuarios");
		rd.forward(request, response);
	}

}
