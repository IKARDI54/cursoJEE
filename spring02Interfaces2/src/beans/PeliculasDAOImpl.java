package beans;

public class PeliculasDAOImpl implements PeliculasDAO{

	@Override
	public void borrarPelicula(int id) {
		
		System.out.println("borrando peli: "+id);
	}
	
}
