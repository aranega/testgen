package com.dooapp.firea.entity.domain;

import java.util.UUID;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class AbstractEntity
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private java.util.Date creationDate;
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	private java.util.Date updateDate;
	
	private UUID uuid;
	@Column(name = "VERSIONCOLUMN")
	private Integer version;
    

	public AbstractEntity () 
	{
		uuid = UUID.randomUUID();	
	}

	public java.util.Date getCreationDate () 
	{
		return this.creationDate;	
	}

	public Long getId () 
	{
		return this.id;	
	}

	public java.util.Date getUpdateDate () 
	{
		return this.updateDate;	
	}

	public UUID getUuid () 
	{
		return uuid;	
	}

	public Integer getVersion () 
	{
		return this.version;	
	}

	public void setCreationDate (java.util.Date myCreationDate) 
	{
		this.creationDate = myCreationDate;	
	}

	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	public void setUpdateDate (java.util.Date myUpdateDate) 
	{
		this.updateDate = myUpdateDate;	
	}

	public void setVersion (Integer myVersion) 
	{
		this.version = myVersion;	
	}

	public void unsetCreationDate () 
	{
		this.creationDate = null;	
	}

	public void unsetId () 
	{
		this.id = null;	
	}

	public void unsetUpdateDate () 
	{
		this.updateDate = null;	
	}

	public void unsetVersion () 
	{
		this.version = null;	
	}


}
