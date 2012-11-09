package com.dooapp.firea.entity.repositories;

import com.dooapp.firea.entity.domain.AbstractEntity;
import java.util.List;
import com.dooapp.firea.entity.repositories.criteria.AbstractEntityCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface AbstractEntityRepository 
{

	public List<AbstractEntity> findAll () ;
	public List<AbstractEntity> findByCriteria (AbstractEntityCriteria abstractEntityCriteria) ;
	public AbstractEntity findById (Long id) ;
	public AbstractEntity save (AbstractEntity abstractentity) ;

}
