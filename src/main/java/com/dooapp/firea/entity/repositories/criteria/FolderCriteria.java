package com.dooapp.firea.entity.repositories.criteria;


//Start of user code for imports
// TODO: import me!
//End of user code

//



public class FolderCriteria extends AbstractEntityCriteria
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private Integer displayOrderMax;
	
	private Integer displayOrderMin;
	
	private String name;
    

	public Integer getDisplayOrderMax () 
	{
		return this.displayOrderMax;	
	}

	public Integer getDisplayOrderMin () 
	{
		return this.displayOrderMin;	
	}

	public String getName () 
	{
		return this.name;	
	}

	public void setDisplayOrderMax (Integer myDisplayOrderMax) 
	{
		this.displayOrderMax = myDisplayOrderMax;	
	}

	public void setDisplayOrderMin (Integer myDisplayOrderMin) 
	{
		this.displayOrderMin = myDisplayOrderMin;	
	}

	public void setName (String myName) 
	{
		this.name = myName;	
	}

	public void unsetDisplayOrderMax () 
	{
		this.displayOrderMax = null;	
	}

	public void unsetDisplayOrderMin () 
	{
		this.displayOrderMin = null;	
	}

	public void unsetName () 
	{
		this.name = null;	
	}


}
