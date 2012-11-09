package com.dooapp.firea.entity.domain.factories;

import com.dooapp.firea.entity.domain.Project;
import com.dooapp.firea.entity.domain.ProjectKind;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class ProjectBuilder extends AbstractEntityBuilder
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private Project project;
    

	public Project build () 
	{
		return project;	
	}

	public static ProjectBuilder create () 
	{
		return new ProjectBuilder();	
	}

	public ProjectBuilder description (String description) 
	{
		project.setDescription (description);
		return this;	
	}

	public ProjectBuilder initProject () 
	{
		project = new Project();
		return this;	
	}

	public ProjectBuilder kind (com.dooapp.firea.entity.domain.ProjectKind kind) 
	{
		project.setKind (kind);
		return this;	
	}

	public ProjectBuilder name (String name) 
	{
		project.setName (name);
		return this;	
	}


}
