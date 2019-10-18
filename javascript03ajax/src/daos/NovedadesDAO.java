package daos;

import java.util.List;

import modelo.Novedad;

public interface NovedadesDAO {

	List<Novedad> obtenerNovedades();

	void registrarNovedad(Novedad novedad);

}