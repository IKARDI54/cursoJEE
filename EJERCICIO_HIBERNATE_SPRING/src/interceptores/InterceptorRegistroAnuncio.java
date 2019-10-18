package interceptores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterceptorRegistroAnuncio extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//		Object idUsuario = 
//				request.getSession().getAttribute("idUsuario");
//		
//		if(idUsuario != null) {
//			return true;
//		}else {
//			return false;
//		}
		return true;
	}//end preHandle
	
}//end class
