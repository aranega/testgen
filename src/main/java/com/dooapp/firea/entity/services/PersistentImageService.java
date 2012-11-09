package com.dooapp.firea.entity.services;

import com.dooapp.firea.entity.repositories.criteria.PersistentImageCriteria;
import java.util.List;
import com.dooapp.firea.entity.domain.PersistentImage;
import org.springframework.transaction.annotation.Transactional;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface PersistentImageService 
{

	public List<PersistentImage> findAll () ;
	public List<PersistentImage> findByCriteria (PersistentImageCriteria criteria) ;
	public PersistentImage findById (Long id) ;
	public PersistentImage save (PersistentImage persistentimage) ;

}
