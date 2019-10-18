package daos;

import java.util.List;

import modelo.Anuncio;

public interface AnunciosDAO {

	public int registrarAnuncio(Anuncio a);
	public List<Anuncio> obtenerAnuncios();
	public void borrarAnuncio(int id);
	public Anuncio obtenerAnuncioPorId(int id);
	public void actualizarAnuncio(Anuncio anuncioAeditar);
	public List<Anuncio> obtenerAnunciosPorTituloIndicandoComienzoYCuantos(String campoBusqueda, Integer comienzo,
			int cuantos);
	
}