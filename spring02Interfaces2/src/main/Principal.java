package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.PeliculasDAO;
import beans.PeliculasDAOImpl;

public class Principal {

	public static void main(String[] args) {
		//para crear un contenedor de spring con lo 
		//puesto en el applicationContext.xml
		ApplicationContext contenedor = 
				new ClassPathXmlApplicationContext(
						"applicationContext.xml");
		//cuando se pida un DAO, o cualquier clase
		//que implemente un interfaz, lo suyo es pedirla
		//por el interfaz:
		PeliculasDAO pDAO = 
				contenedor.getBean(PeliculasDAO.class);
		//ahora mismo hay 3 implementaciones de PeliculasDAO
		//¿cual se va a usar?
		//pues la que diga en el applicationContext.xml
		//de esta forma, este mismo proyecto ofrecido en 
		//otro sitio, segun lo que dicha el xml usara
		//una implementacion u otra.
		
		pDAO.borrarPelicula(11);
	}

}
