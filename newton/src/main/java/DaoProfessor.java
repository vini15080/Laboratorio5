import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DaoProfessor implements Interface<Professor>{
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	public DaoProfessor() {
		entityManagerFactory = Persistence.createEntityManagerFactory("professor");
	    entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public Optional<Professor> get(long id) {
		String queryText = "select * from Professor";
		
		if(id > 0) 
			queryText += " where id = :id";
		
		
		Query query = entityManager.createQuery(queryText);
		
		if(id > 0) 
			query.setParameter("id", id);
		
		return Optional.ofNullable((Professor) query.getSingleResult());
	}

	@Override
	public List<Professor> getAll() {
		String queryText = "select * from Professor";
		
		Query query = entityManager.createQuery(queryText);
		
		return query.getResultList();
	}

	@Override
	public void save(Professor t) {
		try {
			entityManager.getTransaction().begin();
			
			entityManager.persist(t);
			
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
		}
		
	}

	@Override
	public void update(Professor t) {
		try {
			entityManager.getTransaction().begin();
			
			entityManager.merge(t);
			
			entityManager.getTransaction().commit();
		} catch(Exception e) {
			entityManager.getTransaction().rollback();
		}
		
	}

	@Override
	public void delete(Professor t) {
		try {
			entityManager.getTransaction().begin();
			
			entityManager.remove(t);
			
			entityManager.getTransaction().commit();
		} catch(Exception e) {
			entityManager.getTransaction().rollback();
		}
	}

	
	
	

}
