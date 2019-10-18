package daosImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import constantes.ConstantesSQL;
import daos.AnunciosDAO;
import mappers.AnuncioMapper;
import modelo.Anuncio;

public class AnunciosDAOImpl implements AnunciosDAO{

	//a diferencia de otros DAO realizados anteriormente
	//vasmo a usar spring jdbc para facilitarnos la tarea
	//con bases de datos. Para ello la clase actual necesita
	//un DataSource. Un datasource no es mas que un elemento
	//que tiene informacion para poder conectarse con una 
	//base de datos.
	
	private DataSource miDataSource;
	private SimpleJdbcInsert simpleInsert;
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void registrarAnuncio(Anuncio a) {
		//vamos a usar el simple jdbc insert, que es un recurso
		//de spring jdbc, el cual ha necesitado de un data source
		Map<String, Object> valores = 
				new HashMap<String, Object>();
		valores.put("titulo", a.getTitulo());
		valores.put("email",a.getEmail());
		valores.put("descripcion", a.getDescripcion());
		simpleInsert.execute(valores);
	}

	@Override
	public List<Anuncio> obtenerAnuncios() {
		//spring jdbc nos pide en una clase tipo Mapper
		//como transformar de un resultado de base de datos
		//de la tabla_anuncios a un objeto de la clase Anuncio
		//una vez tengamos esa clase, va a ser muy facil 
		//obtener datos.
		
		List<Anuncio> anuncios = 
				jdbcTemplate.query(
					ConstantesSQL.SQL_OBTENER_ANUNCIOS,
					new AnuncioMapper());
		
		
		return anuncios;
	}
	
	public void setMiDataSource(DataSource miDataSource) {
		this.miDataSource = miDataSource;
		simpleInsert = new SimpleJdbcInsert(miDataSource);
		simpleInsert.setTableName("tabla_anuncios");
		jdbcTemplate = new JdbcTemplate(miDataSource);
	}

}
