package com.dooapp.firea.entity.domain.factories;

import com.dooapp.firea.entity.domain.AbstractEntity;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class AbstractEntityBuilder
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private AbstractEntity abstractentity;
    

	public AbstractEntity build () 
	{
		return abstractentity;	
	}

	public static AbstractEntityBuilder create () 
	{
		return new AbstractEntityBuilder();	
	}

	public AbstractEntityBuilder creationDate (java.util.Date creationDate) 
	{
		abstractentity.setCreationDate (creationDate);
		return this;	
	}

	public AbstractEntityBuilder id (Long id) 
	{
		abstractentity.setId (id);
		return this;	
	}

	public AbstractEntityBuilder initAbstractEntity () 
	{
		abstractentity = new AbstractEntity();
		return this;	
	}

	public AbstractEntityBuilder updateDate (java.util.Date updateDate) 
	{
		abstractentity.setUpdateDate (updateDate);
		return this;	
	}

	public AbstractEntityBuilder version (Integer version) 
	{
		abstractentity.setVersion (version);
		return this;	
	}


}
