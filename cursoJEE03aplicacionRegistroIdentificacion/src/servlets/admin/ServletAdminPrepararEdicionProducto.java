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
import modelo.Producto;
import modelo.ProductosDAO;
import modelo.ProductosDAOImpl;

/**
 * Servlet implementation class ServletAdminPrepararEdicionProducto
 */
@WebServlet("/admin/ServletAdminPrepararEdicionProducto")
public class ServletAdminPrepararEdicionProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//a partir de la id recibida, sacar todos los 
		//datos del producto y mostrarlos en un formulario
		//que se pueda editar
		String idProducto = request.getParameter("id");
		
		ProductosDAO pDAO = new ProductosDAOImpl();
		CategoriasDAO cDAO = new CategoriasDAOImpl();
		Producto p = pDAO.obtenerProductoPorId(
				Integer.parseInt(idProducto));
		List<Categoria> categorias = 
				cDAO.obtenerCategorias();
		
		//el formulario necesita tanto los datos 
		//del producto a editar, como las categorias que hay 
		//para mostrarlas en el desplegable
		
		request.setAttribute("productoAeditar", p);
		request.setAttribute("categorias", categorias);
		RequestDispatcher rd = 
				getServletContext().getRequestDispatcher(
						"/admin/editarProducto.jsp");	
		rd.forward(request, response);
	}

}
