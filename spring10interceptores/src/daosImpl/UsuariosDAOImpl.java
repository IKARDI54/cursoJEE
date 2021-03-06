package daosImpl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import constantes.ConstantesSQL;
import constantes.NombresTablas;
import daos.UsuariosDAO;
import mappers.UsuarioMapper;
import modelo.Usuario;

@Repository
public class UsuariosDAOImpl implements UsuariosDAO{
	
	@Autowired
	private DataSource dataSource;
	private SimpleJdbcInsert simpleInsert;
	private JdbcTemplate jdbcTemplate;
	
	@PostConstruct
	public void preparElementos() {
		simpleInsert = new SimpleJdbcInsert(dataSource);
		simpleInsert.setTableName(
				NombresTablas.TABLA_USUARIOS);
		simpleInsert.usingGeneratedKeyColumns("id");
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void registrarUsuario(Usuario u) {
		Map<String, Object> valores = 
				new HashMap<String, Object>();
		valores.put("nombre",u.getNombre());
		valores.put("email", u.getEmail());
		valores.put("pass",u.getPass());
		simpleInsert.execute(valores);
	}

	@Override
	public Usuario obtenerUsuarioPorEmailYpass(String email, String pass) {
		
		Usuario u = null;
		try {
			
			
			
			u = jdbcTemplate.queryForObject(
					ConstantesSQL.SQL_OBTENER_USUARIO_POR_EMAIL_Y_PASS, 
					new UsuarioMapper(),email,pass);
			
			
			
			
		} catch (Exception e) {
			System.out.println("usuario no encontrado");
		}
		return u;
	}
		
}
