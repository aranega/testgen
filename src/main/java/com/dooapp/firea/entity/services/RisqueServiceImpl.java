package com.dooapp.firea.entity.services;

import java.util.List;
import com.dooapp.firea.entity.repositories.RisqueRepository;
import com.dooapp.firea.entity.repositories.criteria.RisqueCriteria;
import com.dooapp.firea.entity.domain.Risque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Service(value = "risqueService")
@Transactional(readOnly = true)
public class RisqueServiceImpl implements RisqueService
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@Autowired
	private RisqueRepository risqueRepository;
    

	public List<Risque> findAll () 
	{
		return this.risqueRepository.findAll();	
	}

	public List<Risque> findByCriteria (RisqueCriteria criteria) 
	{
		return this.risqueRepository.findByCriteria (criteria);	
	}

	public Risque findById (Long id) 
	{
		return this.risqueRepository.findById(id);	
	}

	public Risque save (Risque risque) 
	{
		return this.risqueRepository.save (risque);	
	}


}
