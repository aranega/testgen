package com.dooapp.firea.entity.repositories.criteria;


//Start of user code for imports
// TODO: import me!
//End of user code

//



public class AbstractEntityCriteria
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Long id;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer versionMax;
	
	private Integer versionMin;
    

	public java.util.Date getCreationDateMax () 
	{
		return this.creationDateMax;	
	}

	public java.util.Date getCreationDateMin () 
	{
		return this.creationDateMin;	
	}

	public Long getId () 
	{
		return this.id;	
	}

	public java.util.Date getUpdateDateMax () 
	{
		return this.updateDateMax;	
	}

	public java.util.Date getUpdateDateMin () 
	{
		return this.updateDateMin;	
	}

	public Integer getVersionMax () 
	{
		return this.versionMax;	
	}

	public Integer getVersionMin () 
	{
		return this.versionMin;	
	}

	public void setCreationDateMax (java.util.Date myCreationDateMax) 
	{
		this.creationDateMax = myCreationDateMax;	
	}

	public void setCreationDateMin (java.util.Date myCreationDateMin) 
	{
		this.creationDateMin = myCreationDateMin;	
	}

	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	public void setUpdateDateMax (java.util.Date myUpdateDateMax) 
	{
		this.updateDateMax = myUpdateDateMax;	
	}

	public void setUpdateDateMin (java.util.Date myUpdateDateMin) 
	{
		this.updateDateMin = myUpdateDateMin;	
	}

	public void setVersionMax (Integer myVersionMax) 
	{
		this.versionMax = myVersionMax;	
	}

	public void setVersionMin (Integer myVersionMin) 
	{
		this.versionMin = myVersionMin;	
	}

	public void unsetCreationDateMax () 
	{
		this.creationDateMax = null;	
	}

	public void unsetCreationDateMin () 
	{
		this.creationDateMin = null;	
	}

	public void unsetId () 
	{
		this.id = null;	
	}

	public void unsetUpdateDateMax () 
	{
		this.updateDateMax = null;	
	}

	public void unsetUpdateDateMin () 
	{
		this.updateDateMin = null;	
	}

	public void unsetVersionMax () 
	{
		this.versionMax = null;	
	}

	public void unsetVersionMin () 
	{
		this.versionMin = null;	
	}


}
