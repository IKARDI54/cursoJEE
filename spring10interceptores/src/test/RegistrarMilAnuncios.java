package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import daos.AnunciosDAO;
import modelo.Anuncio;

//lo siguiente es para poder lanzar una unidad de test
//usando el contenedor de spring indicado
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("spring-context-test.xml")
public class RegistrarMilAnuncios {

	@Autowired
	private AnunciosDAO anunciosDAO;
	
	@Test
	public void test() {
		System.out.println("se inicia la unidad de testeo");
		//generalmente tenemos dos tipos de testing 
		//testeo unitario - codigo que comprueba funciones
		//					del propio sistema
		//testeo de integracion - codigo que comprueba
		//						como funciona nuestro sistema
		//						con otros
		
		Anuncio anuncio =  new Anuncio();
		String titulo = "pruebas";
		anuncio.setDescripcion("descripcion de pruebas");
		anuncio.setEmail("pruebas@pruebas.com");
		
		anuncio.setTitulo("titulo de pruebas");
		anunciosDAO.registrarAnuncio(anuncio);
		
//		for (int i = 0; i < 1000; i++) {
//			anuncio.setTitulo(titulo+i);
//			anunciosDAO.registrarAnuncio(anuncio);
//		}		
		
		System.out.println("fin de la unidad de testeo");
	}

}
