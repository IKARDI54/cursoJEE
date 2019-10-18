package controladores.admin;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import daos.AnunciosDAO;
import modelo.Anuncio;

@Controller
public class ControladorAnuncios {

	@Autowired
	private AnunciosDAO anunciosDAO;
	
	@RequestMapping("admin/anuncios")
	public String adminAnuncios(Map model) {
		List<Anuncio> anuncios = 
				anunciosDAO.obtenerAnuncios();
		model.put("anuncios", anuncios);
		return "admin/anuncios";
	}
	
	@RequestMapping("admin/borrarAnuncio")
	public String adminBorrarAnuncio(int id,Map model) {
		System.out.println("id a borrar: " + id);
		anunciosDAO.borrarAnuncio(id);
		return adminAnuncios(model);
	}
	
	@RequestMapping("admin/editarAnuncio")
	public String adminEditarAnuncio(int id, Map model) {
		Anuncio anuncioAeditar = 
				anunciosDAO.obtenerAnuncioPorId(id);
		model.put("anuncioAeditar", anuncioAeditar);
		return "admin/editarAnuncio";		
	}	
	
	@RequestMapping("admin/actualizarAnuncio")
	public String 
		adminActualizarAnuncio(
				Anuncio anuncioAeditar,Map model) {
		
		anunciosDAO.actualizarAnuncio(anuncioAeditar);
		return adminAnuncios(model);
	}
	
}






