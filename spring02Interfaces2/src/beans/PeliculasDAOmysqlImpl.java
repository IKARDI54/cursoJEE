package beans;

public class PeliculasDAOmysqlImpl implements PeliculasDAO{

	@Override
	public void borrarPelicula(int id) {
		System.out.println("usando base de datos mysql");
		System.out.println("borrando id: " + id);
	}

}
