package servlets.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;
import modelo.UsuariosDAO;
import modelo.UsuariosDAOImpl;

/**
 * Servlet implementation class ServletAdminPrepararEdicionUsuario
 */
@WebServlet("/admin/ServletAdminPrepararEdicionUsuario")
public class ServletAdminPrepararEdicionUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//esta es la id de lo que habia a la derecha de la ? 
		//en la ruta del enlace EDITAR
		String id = request.getParameter("id");
		
		//lo suyo seria comprobar que es un numero
		
		//transformaciones siempre despues de validar
		int idInt = Integer.parseInt(id);
		//ahora necesito todos los datos del usuario del que 
		//se pincho en EDITAR, por lo que como están en base 
		//de datos, eso me lo tiene que dar un DAO
		
		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
		Usuario usuarioAeditar = 
				usuariosDAO.obtenerUsuarioPorId(idInt);
		//el return de u en el metodo obtenerUsuarioPorId de 
		//UsuariosDAOImpl, es lo que yo recojo aquí
		//como usuarioAeditar
		request.setAttribute("usuarioAeditar", usuarioAeditar);
		
		RequestDispatcher rs = 
				getServletContext().getRequestDispatcher(
				"/admin/editarUsuario.jsp");
		rs.forward(request, response);//si no pongo esto
		//generalemnte la pantalla del navegador se queda en blanco

	}

}
