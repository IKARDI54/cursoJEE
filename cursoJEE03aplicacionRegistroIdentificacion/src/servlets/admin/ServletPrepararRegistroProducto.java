package servlets.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Categoria;
import modelo.CategoriasDAO;
import modelo.CategoriasDAOImpl;

/**
 * Servlet implementation class ServletPrepararRegistroProducto
 */
@WebServlet("/admin/ServletPrepararRegistroProducto")
public class ServletPrepararRegistroProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//sacando las categorias para poder mostrarlas
		//en un desplegable en el formulario de registro
		// de producto
		
		CategoriasDAO categoriasDAO = new CategoriasDAOImpl();
		List<Categoria> categorias = 
				categoriasDAO.obtenerCategorias();
		request.setAttribute("categorias", categorias);
		RequestDispatcher rd = 
				getServletContext().getRequestDispatcher(
				"/admin/registrarProducto.jsp");
		rd.forward(request, response);
		
	}

}
