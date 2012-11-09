package com.dooapp.firea.entity.domain;

import javax.persistence.Entity;
import javax.persistence.Column;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class Folder extends AbstractEntity
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private Integer displayOrder;
	@Column(name = "NAMECOLUMN")
	private String name;
    

	public Integer getDisplayOrder () 
	{
		return this.displayOrder;	
	}

	public String getName () 
	{
		return this.name;	
	}

	public void setDisplayOrder (Integer myDisplayOrder) 
	{
		this.displayOrder = myDisplayOrder;	
	}

	public void setName (String myName) 
	{
		this.name = myName;	
	}

	public void unsetDisplayOrder () 
	{
		this.displayOrder = null;	
	}

	public void unsetName () 
	{
		this.name = null;	
	}


}
