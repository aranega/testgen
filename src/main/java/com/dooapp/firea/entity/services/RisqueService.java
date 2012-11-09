package com.dooapp.firea.entity.services;

import java.util.List;
import com.dooapp.firea.entity.domain.Risque;
import com.dooapp.firea.entity.repositories.criteria.RisqueCriteria;
import org.springframework.transaction.annotation.Transactional;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface RisqueService 
{

	public List<Risque> findAll () ;
	public List<Risque> findByCriteria (RisqueCriteria criteria) ;
	public Risque findById (Long id) ;
	public Risque save (Risque risque) ;

}
