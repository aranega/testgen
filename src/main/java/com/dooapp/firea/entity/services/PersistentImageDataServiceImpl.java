package com.dooapp.firea.entity.services;

import com.dooapp.firea.entity.repositories.PersistentImageDataRepository;
import com.dooapp.firea.entity.repositories.criteria.PersistentImageDataCriteria;
import com.dooapp.firea.entity.domain.PersistentImageData;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Service(value = "persistentimagedataService")
@Transactional(readOnly = true)
public class PersistentImageDataServiceImpl implements PersistentImageDataService
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@Autowired
	private PersistentImageDataRepository persistentImageDataRepository;
    

	public List<PersistentImageData> findAll () 
	{
		return this.persistentImageDataRepository.findAll();	
	}

	public List<PersistentImageData> findByCriteria (PersistentImageDataCriteria criteria) 
	{
		return this.persistentImageDataRepository.findByCriteria (criteria);	
	}

	public PersistentImageData findById (Long id) 
	{
		return this.persistentImageDataRepository.findById(id);	
	}

	public PersistentImageData save (PersistentImageData persistentimagedata) 
	{
		return this.persistentImageDataRepository.save (persistentimagedata);	
	}


}
