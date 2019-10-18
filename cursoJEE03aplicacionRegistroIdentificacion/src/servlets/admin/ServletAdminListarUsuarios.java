package servlets.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class ServletAdminListarUsuarios
 */
@WebServlet("/admin/ServletAdminListarUsuarios")
public class ServletAdminListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//buscador
		
		String campoBusqueda = 
				request.getParameter("campoBusqueda");
		String nombreAbuscar = "";
		if(campoBusqueda != null) {
			//nombreAbuscar es lo que voy a buscar en la base 
			//de datos, si han introducido algo en el campo 
			//de busqueda pues eso es lo que voy a buscar
			nombreAbuscar = campoBusqueda;
		}
		
		//paginaciones
		
		int comienzo = 0;
		int cuantos = 10;
		//de primeras sacamos desde el primer resultado, eso 
		//es comienzo igual a cero
		//si tras pinchar en siguiente digo que el comienzo
		//sea otro, pues ya no empiezo en cero si no en lo 
		//indicado por el parametro comienzo
		if(request.getParameter("comienzo")!=null) {
			comienzo = Integer.parseInt(
					request.getParameter("comienzo"));
		}
		int siguiente = comienzo + cuantos;
		int anterior = comienzo - cuantos;
		request.setAttribute("siguiente", siguiente);
		request.setAttribute("anterior", anterior);
		
		
		
		//obtener el listado de usuarios y darselo 
		//A usuarios.jsp para que los muestre
		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
		List<Usuario> usuarios = usuariosDAO.
			obtenerUsuariosPorNombreIndicandoComienzoYCuantos(
					nombreAbuscar,comienzo,cuantos);
		request.setAttribute("usuarios", usuarios);
		//vamos a pedir al dao que nos indique cuantos
		//resultados hay de la informacion indicada
		int totalResultados = 
				usuariosDAO.
				obtenerTotalUsuarios(nombreAbuscar);
		request.setAttribute("totalResultados", totalResultados);
		
		RequestDispatcher rd = 
				getServletContext().
					getRequestDispatcher("/admin/usuarios.jsp");
		rd.forward(request, response);
	}

}
