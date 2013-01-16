package com.genmymodel.petshop.domain;




public class Product
{

	
	
	private String description;
	
	
	private String name;
    

	
	public String getDescription () 
	{
		return this.description;	
	}

	
	public String getName () 
	{
		return this.name;	
	}

	
	public void setDescription (String myDescription) 
	{
		this.description = myDescription;	
	}

	
	public void setName (String myName) 
	{
		this.name = myName;	
	}

	
	public void unsetDescription () 
	{
		this.description = null;	
	}

	
	public void unsetName () 
	{
		this.name = null;	
	}


}
