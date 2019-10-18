package filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//filtro para proteger la ruta /admin
public class FiltroAdmin implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(
			ServletRequest requestPrimitivo, 
			ServletResponse responsePrimitivo, FilterChain chain)
			throws IOException, ServletException {
		//codigo que se va a ejecutar antes de lo 
		//que se ejecute en la ruta indicada para el filtro, 
		//que será /admin
		//eso debe ir en el web.xml
		
		//en un filtro nos dan un request y un response
		//que no son los mismos que los que estamos acostumbrados
		// a travar en los servlet. Pero haciendo un casting
		//podemos tener el request y el response con los 
		//que hemos trabajado en los servlet.
		HttpServletRequest request = 
				(HttpServletRequest)requestPrimitivo;
		HttpServletResponse response = 
				(HttpServletResponse)responsePrimitivo;
		
		
		//este mismo filtro mira si se ha mandado una pass
		//correcta por el formulario de login de admin, 
		//y si la pass es la correcta puesta ya meto en sesion
		//un elemento llamado admin que valga ok
		if(request.getParameter("pass") != null && 
				request.getParameter("pass").equals("123")) {
			request.getSession().setAttribute("admin", "ok");
		}
		
		
		//en este ejemplo vamos a entender que un administrador
		//es administrador si tiene en sesión un elemento
		//admin al valor "ok"
		if(request.getSession().getAttribute("admin")!=null 
				&& 
		request.getSession().getAttribute("admin").equals("ok")){
	  //si se cumple if, permito que la peticion siga adelante
			chain.doFilter(request, response);
			
		}else {
			RequestDispatcher rd = 
					request.getServletContext().
						getRequestDispatcher("/admin/login.jsp");
			rd.forward(request, response);
		}
		
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
