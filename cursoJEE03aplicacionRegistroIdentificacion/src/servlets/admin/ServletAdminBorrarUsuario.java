package servlets.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.UsuariosDAO;
import modelo.UsuariosDAOImpl;

/**
 * Servlet implementation class ServletAdminBorrarUsuario
 */
@WebServlet("/admin/ServletAdminBorrarUsuario")
public class ServletAdminBorrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//asi recojo una informacion incluida despues de la ?
		String idUsuarioAborrar = request.getParameter("id");
		System.out.println("id a borrar: " + idUsuarioAborrar);
		UsuariosDAO uDAO = new UsuariosDAOImpl();
		uDAO.borrarUsuario(idUsuarioAborrar);
		RequestDispatcher rd = 
				getServletContext().getRequestDispatcher(
						"/admin/ServletAdminListarUsuarios");
		rd.forward(request, response);
	}

}
