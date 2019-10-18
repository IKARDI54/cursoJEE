package servlets.admin;

import java.io.IOException;

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
 * Servlet implementation class ServletAdminRegistrarProducto
 */
@WebServlet("/admin/ServletAdminRegistrarProducto")
public class ServletAdminRegistrarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//recoger campos:
		String nombre = request.getParameter("campoNombre");
		String precio = request.getParameter("campoPrecio");
		String descripcion = request.getParameter("campoDescripcion");
		String idCategoria = 
				request.getParameter("campoCategoria");
		
		
		String ruta ="/admin/registroOk.jsp";//a donde ir cuando termine este servlet
		//validaciones usarndo expresiones regulares
		//...
		//una vez validado todo ya puedo hacer transformaciones
		double precioDouble = Double.parseDouble(precio);
		long idCategoriaLong = Long.parseLong(idCategoria);
		
		Producto p = new Producto(nombre, precioDouble, descripcion, idCategoriaLong);
		//ahora voy a acceder a la capa de datos para registrar
		//el producto
		ProductosDAO pDAO = new ProductosDAOImpl();
		pDAO.registrarProducto(p);
		
		RequestDispatcher rd = getServletContext().
				getRequestDispatcher(ruta);
		rd.forward(request, response);
	}

}
