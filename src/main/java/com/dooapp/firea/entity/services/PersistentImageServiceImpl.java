package com.dooapp.firea.entity.services;

import com.dooapp.firea.entity.repositories.criteria.PersistentImageCriteria;
import com.dooapp.firea.entity.domain.PersistentImage;
import java.util.List;
import com.dooapp.firea.entity.repositories.PersistentImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Service(value = "persistentimageService")
@Transactional(readOnly = true)
public class PersistentImageServiceImpl implements PersistentImageService
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@Autowired
	private PersistentImageRepository persistentImageRepository;
    

	public List<PersistentImage> findAll () 
	{
		return this.persistentImageRepository.findAll();	
	}

	public List<PersistentImage> findByCriteria (PersistentImageCriteria criteria) 
	{
		return this.persistentImageRepository.findByCriteria (criteria);	
	}

	public PersistentImage findById (Long id) 
	{
		return this.persistentImageRepository.findById(id);	
	}

	public PersistentImage save (PersistentImage persistentimage) 
	{
		return this.persistentImageRepository.save (persistentimage);	
	}


}
