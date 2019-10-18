package servlets;

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
 * Servlet implementation class ServletLogIn
 */
@WebServlet("/ServletLogIn")
public class ServletLogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("campoEmail");
		String pass = request.getParameter("campoPass");
		System.out.println("identificar: " + email + 
				" " + pass);
		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
		int idUsuario = usuariosDAO.obtenerIdUsuario(email, pass);
		//si hemos obtenido un id valido, entendemos que el usuario 
		//se ha identificado correctamente, y en caso contrario 
		//entendemos que el email introducido y pass son incorrectos
		String ruta = "";
		if( idUsuario > 0 ) {
			request.setAttribute("mensaje", "identificado correctamente");
			ruta = "/privada.jsp";
			//con lo siguiente marcamos que el usuario actual
			//Se ha identificado correctamente
			request.getSession().setAttribute("id", idUsuario);
			request.getSession().setAttribute("email", email);
			
		}else {
			request.setAttribute("mensaje", "email o pass incorrectos");
			ruta = "/login.jsp";
		}
		//asi indicamos que la peticion, siga procesandose en la ruta indicada
		RequestDispatcher rd = getServletContext().getRequestDispatcher(ruta);
		rd.forward(request, response);
	}//end doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//con la siguiente linea, tanto si se ha llegado una peticion 
		//por get como por post, la peticion sera atendida en el doGet
		doGet(request, response);
	}

}
