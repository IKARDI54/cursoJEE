package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.PeliculasDAOImpl;

public class Principal {

	public static void main(String[] args) {
		//para crear un contenedor de spring con lo 
		//puesto en el applicationContext.xml
		ApplicationContext contenedor = 
				new ClassPathXmlApplicationContext(
						"applicationContext.xml");
		//ahora mismo contenedor tiene todas las bean/objetos
		//especificados en el applicationContext.xml
		
		//a lo largo de la aplicacion cuando queramos 
		//una de esas bean/objetos se lo pedimos al contenedor
		//de spring
		
		PeliculasDAOImpl pDAO = 
				contenedor.getBean(
						"peliculasDAO",PeliculasDAOImpl.class);
		//Así he obtenido la bean de id="peliculasDAO"
		//la cual tiene que ser objeto de la clase 
		//PeliculasDAOImpl
		pDAO.borrarPelicula(55);
		
		//aunque parezca lo más logico pedir las bean por id 
		//lo mas normal es pedirlas por tipo de dato
		
		PeliculasDAOImpl pDAO2 = 
				contenedor.getBean(PeliculasDAOImpl.class);
		pDAO2.borrarPelicula(33);
		
		//Esta ultima forma es la más comun ya que 
		//es inusual tener más de una bean/objeto de un mismo 
		//tipo en el contenedor
		//ej: El contenedor solo deberia tener un PeliculasDAO
		//    El contenedor solo deberia tener un UsuariosDAO
		//    etc...
	}

}
