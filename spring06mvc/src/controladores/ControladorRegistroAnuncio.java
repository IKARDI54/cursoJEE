package controladores;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import daos.AnunciosDAO;
import modelo.Anuncio;

@Controller
public class ControladorRegistroAnuncio {
	
	private AnunciosDAO miAnunciosDAO;

	@RequestMapping("prepararRegistro")
	public String prepararRegistro(Map model) {
		System.out.println("preparar registro de anuncio");
		//"nuevoAnuncio" es el commandName del form de spring
		//y no es mas que el objeto que esta esperando el form
		//para poder mostrar su informacion en él.
		//Esto es obligatorio y si le damos directamente
		//un new Anuncios(), al form le llega un nuevo 
		//objeto de la clase Anuncio sin informacion.
		model.put("nuevoAnuncio", new Anuncio());
		return "/WEB-INF/jsps/registrarAnuncio.jsp";
	}//end prepararregistro
	
	@RequestMapping("guardarAnuncio")
	public String guardarAnuncio(Anuncio nuevoAnuncio) {
		//una gran ventaja de usar spring mvc, es que 
		//este metodo recibe automaticamente un objeto
		//con todo lo que ha introducido el usuario en el form
		System.out.println("he recibido: " + 
				nuevoAnuncio.toString());
		
		miAnunciosDAO.registrarAnuncio(nuevoAnuncio);
		
		System.out.println("anuncio registrado ok");
		
		return "/WEB-INF/jsps/inicio.jsp";
	}//end guardarAnuncio

	public void setMiAnunciosDAO(AnunciosDAO miAnunciosDAO) {
		this.miAnunciosDAO = miAnunciosDAO;
	}
	
}//end class
