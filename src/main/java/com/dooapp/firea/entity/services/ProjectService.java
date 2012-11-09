package com.dooapp.firea.entity.services;

import com.dooapp.firea.entity.domain.Project;
import com.dooapp.firea.entity.repositories.criteria.ProjectCriteria;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface ProjectService 
{

	public List<Project> findAll () ;
	public List<Project> findByCriteria (ProjectCriteria criteria) ;
	public Project findById (Long id) ;
	public Project save (Project project) ;

}
