package servlets;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;
import modelo.UsuariosDAO;
import modelo.UsuariosDAOImpl;

/**
 * Servlet implementation class ServletRegistroUsuario
 */
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
		
		//parte de validaciones:
		String reglaNombre = "[a-zA-Z ]{3,20}";
		//en java si queremos una sola \ hay que poner \\
		String reglaEmail = "^[^@]+@[^@]+\\.[a-zA-Z]{2,}$";
		String reglaPass = "[a-zA-Z 0-9]{3,20}";
		
		Pattern p = Pattern.compile(reglaNombre);
		Matcher m = p.matcher(nombre);
		if(!m.matches()) {
			//redirigir a registro indicando el error
		}
		

		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();

		Usuario nuevo = new Usuario(nombre, pass, email);
		try {
			usuariosDAO.registrarUsuario(nuevo);
			response.sendRedirect("registroOk.jsp");
		} catch (Exception e) {
			response.sendRedirect("error.jsp");
		}
	}//end doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
