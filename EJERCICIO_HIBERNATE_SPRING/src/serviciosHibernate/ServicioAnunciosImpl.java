package serviciosHibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import modelo.Anuncio;

@Service
@Transactional
public class ServicioAnunciosImpl implements ServicioAnuncios{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void registrarAnuncio(Anuncio a) {
		sessionFactory.getCurrentSession().save(a);
	}

	@Override
	public List<Anuncio> obtenerAnuncios() {
		Criteria c = 
				sessionFactory.getCurrentSession().
					createCriteria(Anuncio.class);
		return c.list();
	}

}
