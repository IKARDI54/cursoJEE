package controladores;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import daos.AnunciosDAO;
import modelo.Anuncio;
import serviciosHibernate.ServicioAnuncios;

@Controller
public class ControladorInicio {
	
	//si desde aqui quiero usar el anuncios dao, pues lo pido
	@Autowired
	private ServicioAnuncios servicioAnuncios;
	
	//de esta forma el siguiente metodo se ejecuta
	//cuando el usuario acceda a la ruta inicio
	//cuando pinche en el enlace de index.jsp
	@RequestMapping("inicio")
	public String inicio(Map model,String campoBusqueda,Integer comienzo ) {
		System.out.println("busqueda: " + campoBusqueda);
		System.out.println("comienzo: " + comienzo);
		
		if(campoBusqueda == null) {
			campoBusqueda = "";
		}
		if(comienzo == null) {
			comienzo = 0;
		}
		
		int cuantos = 3;
		int siguiente = comienzo + cuantos;
		int anterior = comienzo - cuantos;
		
		model.put("anterior", anterior);
		model.put("siguiente", siguiente);
		model.put("campoBusqueda", campoBusqueda);
		
		
		List<Anuncio> anuncios = 
				servicioAnuncios.obtenerAnuncios();
		
		model.put("anuncios", anuncios);
		//lo siguiente lleva a la vista inicio.jsp
		//de las vistas gracias a la bean que acabamos de 
		//insertar en el dispatcher-servlet.xml
		return "inicio";
	}
	
}
