package servlets;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
 * Servlet implementation class ServletRegistroUsuario
 */

@MultipartConfig
@WebServlet("/ServletRegistroUsuario")
public class ServletRegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistroUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("campoNombre");
		String email = request.getParameter("campoEmail");
		String pass = request.getParameter("campoPass");
		
		//todo lo recibido de un form se recoge como String
		//Una vez recogido todo lo necesario ya puedo 
		//Validar y hacer transformaciones y si es necesario
		
		//ruta a la que el usuario irá cuando este Servlet
		//Acabe de hacer su trabajo
		String ruta = "";
		String errorNombre = "";
		String errorEmail = "";
		String errorPass = "";
		
		//parte de validaciones:
		String reglaNombre = "[a-zA-Z ]{3,20}";
		//en java si queremos una sola \ hay que poner \\
		String reglaEmail = "^[^@]+@[^@]+\\.[a-zA-Z]{2,}$";
		String reglaPass = "[a-zA-Z 0-9]{3,20}";
		
		Pattern p = Pattern.compile(reglaNombre);
		Matcher m = p.matcher(nombre);
		if(!m.matches()) {
			errorNombre = "nombre incorrecto";
		}
		//podemos hacer lo mismo en una sola linea
		if(!Pattern.compile(reglaEmail).matcher(email).matches()) {
			errorEmail="email no valido";
		}
		if(!Pattern.compile(reglaPass).matcher(pass).matches()) {
			errorPass = "pass incorrecto";
		}
		
		if( !errorEmail.equals("") || !errorNombre.equals("") || 
				!errorPass.equals("")) {
			ruta = "/registrarme.jsp";
			request.setAttribute("errorNombre", errorNombre);
			request.setAttribute("errorPass", errorPass);
			request.setAttribute("errorEmail", errorEmail);
			request.setAttribute("nombre", nombre);
			request.setAttribute("email", email);
			request.setAttribute("pass", pass);
		}else {
			UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
			Usuario nuevo = new Usuario(nombre, pass, email);
			try {
				int idGenerada = usuariosDAO.registrarUsuario(nuevo);
				System.out.println("id generada: " + idGenerada);
				
				
				//vamos a guardar la foto subida en la carpeta
				//imagenes
				String carpetaSubidas = getServletContext().getRealPath("") + File.separator + "usuarios";
				File uploadDir = new File(carpetaSubidas);
				if (!uploadDir.exists()) {
					uploadDir.mkdir();
					System.out.println("creada la carpeta: " + 
							carpetaSubidas);
				}
				System.out.println("guardando archivo subido en: " 
						+ carpetaSubidas);
				Part imagenSubida = request.getPart("campoImagen");//name del input type file
				
				imagenSubida.write(carpetaSubidas + File.separator + 
						idGenerada + ".jpg");
				
				ruta = "/registroOk.jsp";
			} catch (Exception e) {
				ruta = "/error.jsp";
			}
		}//end else comprobar que ha habido algun error
		RequestDispatcher rd = 
				getServletContext().getRequestDispatcher(ruta);
		rd.forward(request, response);		
	}//end doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
