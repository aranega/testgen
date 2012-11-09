package com.dooapp.firea.entity.services;

import java.util.List;
import com.dooapp.firea.entity.domain.AbstractEntity;
import com.dooapp.firea.entity.repositories.AbstractEntityRepository;
import com.dooapp.firea.entity.repositories.criteria.AbstractEntityCriteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Service(value = "abstractentityService")
@Transactional(readOnly = true)
public class AbstractEntityServiceImpl implements AbstractEntityService
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@Autowired
	private AbstractEntityRepository abstractEntityRepository;
    

	public List<AbstractEntity> findAll () 
	{
		return this.abstractEntityRepository.findAll();	
	}

	public List<AbstractEntity> findByCriteria (AbstractEntityCriteria criteria) 
	{
		return this.abstractEntityRepository.findByCriteria (criteria);	
	}

	public AbstractEntity findById (Long id) 
	{
		return this.abstractEntityRepository.findById(id);	
	}

	public AbstractEntity save (AbstractEntity abstractentity) 
	{
		return this.abstractEntityRepository.save (abstractentity);	
	}


}
