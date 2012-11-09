package com.dooapp.firea.entity.repositories.criteria;

import com.dooapp.firea.entity.domain.ProjectKind;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class ProjectCriteria extends AbstractEntityCriteria
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private String description;
	
	private com.dooapp.firea.entity.domain.ProjectKind kind;
	
	private String name;
    

	public String getDescription () 
	{
		return this.description;	
	}

	public com.dooapp.firea.entity.domain.ProjectKind getKind () 
	{
		return this.kind;	
	}

	public String getName () 
	{
		return this.name;	
	}

	public void setDescription (String myDescription) 
	{
		this.description = myDescription;	
	}

	public void setKind (com.dooapp.firea.entity.domain.ProjectKind myKind) 
	{
		this.kind = myKind;	
	}

	public void setName (String myName) 
	{
		this.name = myName;	
	}

	public void unsetDescription () 
	{
		this.description = null;	
	}

	public void unsetKind () 
	{
		this.kind = null;	
	}

	public void unsetName () 
	{
		this.name = null;	
	}


}
