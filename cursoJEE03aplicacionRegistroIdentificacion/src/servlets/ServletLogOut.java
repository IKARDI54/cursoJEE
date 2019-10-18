package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletLogOut")
public class ServletLogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//este metodo se ejecuta tanto ante peticiones tipo
		//get como post 
		
		//vaciar la sesion:
		request.getSession().invalidate();
		RequestDispatcher rd = getServletContext().
				getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}

}
