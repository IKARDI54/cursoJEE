package daos;

import java.util.ArrayList;
import java.util.List;

import modelo.Novedad;

public class NovedadesDAOImpl implements NovedadesDAO {

	private static List<Novedad> novedades = 
			new ArrayList<Novedad>();
	
	static {
		//bloque de codigo que sirve para preparar elementos
		//static antes de que sean usados
		novedades.add(new Novedad(
				"nueva version de java", "cambios menores", 1));
		novedades.add(new Novedad(
				"nuevo libro de jquery","Facil de aprender",2));
		novedades.add(new Novedad(
				"tutorial uso de jax-ws","practico y funcional",3));
	}
	
	@Override
	public List<Novedad> obtenerNovedades(){
		return novedades;
	}

	@Override
	public void registrarNovedad(Novedad novedad) {
		novedad.setId(novedades.size()+1);
		novedades.add(novedad);		
	}
	
}