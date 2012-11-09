package com.dooapp.firea.entity.repositories;

import com.dooapp.firea.entity.domain.PersistentImage;
import java.util.List;
import com.dooapp.firea.entity.repositories.criteria.PersistentImageCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface PersistentImageRepository 
{

	public List<PersistentImage> findAll () ;
	public List<PersistentImage> findByCriteria (PersistentImageCriteria persistentImageCriteria) ;
	public PersistentImage findById (Long id) ;
	public PersistentImage save (PersistentImage persistentimage) ;

}
