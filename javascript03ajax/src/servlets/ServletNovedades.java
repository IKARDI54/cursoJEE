package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import daos.NovedadesDAO;
import daos.NovedadesDAOImpl;
import modelo.Novedad;


@WebServlet("/ServletNovedades")
public class ServletNovedades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NovedadesDAO dao = new NovedadesDAOImpl();
		List<Novedad> novedades = dao.obtenerNovedades();
		//usar gson para obtener el json de las novedades
		Gson gson = new Gson();
		String json = gson.toJson(novedades);
		response.getWriter().print(json);
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String json = request.getParameter("json");
		System.out.println("json recibido: " + json);
		Gson gson = new Gson();
		Novedad novedad = gson.fromJson(json, Novedad.class);
		System.out.println("objeto novedad formado: " + 
				novedad.toString());
		NovedadesDAO dao = new NovedadesDAOImpl();
		dao.registrarNovedad(novedad);
		response.getWriter().print(
				"novedad registrada correctamente");
	}

}
