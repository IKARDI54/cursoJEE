package servlets.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Producto;
import modelo.ProductosDAO;
import modelo.ProductosDAOImpl;

/**
 * Servlet implementation class ServletAdminListarProductos
 */
@WebServlet("/admin/ServletAdminListarProductos")
public class ServletAdminListarProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductosDAO pDAO = new ProductosDAOImpl();
		List<Producto> productos = pDAO.obtenerProductos();
		request.setAttribute("informaciones", productos);
		RequestDispatcher rd = 
				getServletContext().getRequestDispatcher(
						"/admin/productos.jsp");
		rd.forward(request, response);
		
	}

}
