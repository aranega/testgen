package com.dooapp.firea.entity.repositories;

import com.dooapp.firea.entity.domain.PersistentImageData;
import com.dooapp.firea.entity.repositories.criteria.PersistentImageDataCriteria;
import java.util.List;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface PersistentImageDataRepository 
{

	public List<PersistentImageData> findAll () ;
	public List<PersistentImageData> findByCriteria (PersistentImageDataCriteria persistentImageDataCriteria) ;
	public PersistentImageData findById (Long id) ;
	public PersistentImageData save (PersistentImageData persistentimagedata) ;

}
