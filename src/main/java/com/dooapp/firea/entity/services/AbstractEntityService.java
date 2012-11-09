package com.dooapp.firea.entity.services;

import com.dooapp.firea.entity.domain.AbstractEntity;
import java.util.List;
import com.dooapp.firea.entity.repositories.criteria.AbstractEntityCriteria;
import org.springframework.transaction.annotation.Transactional;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface AbstractEntityService 
{

	public List<AbstractEntity> findAll () ;
	public List<AbstractEntity> findByCriteria (AbstractEntityCriteria criteria) ;
	public AbstractEntity findById (Long id) ;
	public AbstractEntity save (AbstractEntity abstractentity) ;

}
