package serviciosHibernate;

import java.util.List;

import modelo.Anuncio;

public interface ServicioAnuncios {
	
	public void registrarAnuncio(Anuncio a);
	public List<Anuncio> obtenerAnuncios();
	
}
