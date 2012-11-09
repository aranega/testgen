package com.dooapp.firea.entity.repositories;

import com.dooapp.firea.entity.domain.Risque;
import com.dooapp.firea.entity.repositories.criteria.RisqueCriteria;
import java.util.List;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface RisqueRepository 
{

	public List<Risque> findAll () ;
	public List<Risque> findByCriteria (RisqueCriteria risqueCriteria) ;
	public Risque findById (Long id) ;
	public Risque save (Risque risque) ;

}
