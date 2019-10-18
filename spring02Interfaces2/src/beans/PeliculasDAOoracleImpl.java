package beans;

public class PeliculasDAOoracleImpl implements PeliculasDAO{

	@Override
	public void borrarPelicula(int id) {
		System.out.println("usando base de datos oracle");
		System.out.println("borrando id: " + id);
	}

}
