package controladores;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import daos.AnunciosDAO;
import modelo.Anuncio;

@Controller
public class ControladorInicio {
	
	//si desde aqui quiero usar el anuncios dao, pues lo pido
	private AnunciosDAO miAnunciosDAO;
	
	//de esta forma el siguiente metodo se ejecuta
	//cuando el usuario acceda a la ruta inicio
	//cuando pinche en el enlace de index.jsp
	@RequestMapping("inicio")
	public String inicio(Map model) {
		System.out.println("se ejecuta el metodo inicio");
		
		List<Anuncio> anuncios = 
				miAnunciosDAO.obtenerAnuncios();
		model.put("anuncios", anuncios);
		
		return "/WEB-INF/jsps/inicio.jsp";
	}

	public void setMiAnunciosDAO(AnunciosDAO miAnunciosDAO) {
		this.miAnunciosDAO = miAnunciosDAO;
	}
	
}
