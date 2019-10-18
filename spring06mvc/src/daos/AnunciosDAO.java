package daos;

import java.util.List;

import modelo.Anuncio;

public interface AnunciosDAO {

	public void registrarAnuncio(Anuncio a);
	public List<Anuncio> obtenerAnuncios();
	
}
