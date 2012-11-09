package com.dooapp.firea.entity.services;

import java.util.List;
import com.dooapp.firea.entity.repositories.ProjectRepository;
import com.dooapp.firea.entity.repositories.criteria.ProjectCriteria;
import com.dooapp.firea.entity.domain.Project;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Service(value = "projectService")
@Transactional(readOnly = true)
public class ProjectServiceImpl implements ProjectService
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@Autowired
	private ProjectRepository projectRepository;
    

	public List<Project> findAll () 
	{
		return this.projectRepository.findAll();	
	}

	public List<Project> findByCriteria (ProjectCriteria criteria) 
	{
		return this.projectRepository.findByCriteria (criteria);	
	}

	public Project findById (Long id) 
	{
		return this.projectRepository.findById(id);	
	}

	public Project save (Project project) 
	{
		return this.projectRepository.save (project);	
	}


}
