package com.dooapp.firea.entity.repositories;

import com.dooapp.firea.entity.domain.Project;
import com.dooapp.firea.entity.repositories.criteria.ProjectCriteria;
import java.util.List;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface ProjectRepository 
{

	public List<Project> findAll () ;
	public List<Project> findByCriteria (ProjectCriteria projectCriteria) ;
	public Project findById (Long id) ;
	public Project save (Project project) ;

}
