package com.dooapp.firea.entity.services;

import java.util.List;
import com.dooapp.firea.entity.repositories.criteria.PersistentImageDataCriteria;
import com.dooapp.firea.entity.domain.PersistentImageData;
import org.springframework.transaction.annotation.Transactional;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface PersistentImageDataService 
{

	public List<PersistentImageData> findAll () ;
	public List<PersistentImageData> findByCriteria (PersistentImageDataCriteria criteria) ;
	public PersistentImageData findById (Long id) ;
	public PersistentImageData save (PersistentImageData persistentimagedata) ;

}
