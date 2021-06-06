
import java.util.Optional;

import java.util.List;


	public interface Interface<T> {
	    
	    Optional<T> get(long id);
	    
	    List<T> getAll();
	    
	    void save(T t);
	    
	    void update(T t);
	    
	    void delete(T t);
	}



