package com.genmymodel.petshop.domain;




public class Product
{

	
	
	private String description;
	
	
	private Long id;
	
	
	private String name;
    

	
	public String getDescription () 
	{
		return this.description;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public String getName () 
	{
		return this.name;	
	}

	
	public void setDescription (String myDescription) 
	{
		this.description = myDescription;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setName (String myName) 
	{
		this.name = myName;	
	}

	
	public void unsetDescription () 
	{
		this.description = null;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetName () 
	{
		this.name = null;	
	}


}
