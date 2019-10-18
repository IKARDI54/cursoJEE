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
		//asi he pedido una bean/objeto de tipo PeliculasDAO,
		//PeliculasDAO es un interfaz. De un interfaz no se 
		//puede crear un objeto. Por lo que el contenedor
		//De spring me devuelve la única bean que tiene 
		//como class PeliculasDAOImpl. Esto es así porque 
		//spring y java entienden que la unica bean 
		//disponible de tipo PeliculasDAO es la bean 
		//de class PeliculasDAOImpl
		
		//resumiendo: si yo pido a spring una bean indicandole
		//un interfaz, spring me devuelve la bean de la clase
		//que implementa(implements) el interfaz
		
		
		pDAO.borrarPelicula(11);
	}

}
