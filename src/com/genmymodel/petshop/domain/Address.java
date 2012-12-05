package com.genmymodel.petshop.domain;




public class Address
{

	
	
	private String city;
	
	
	private String country;
	
	
	private Long id;
	
	
	private String line1;
	
	
	private String line2;
    

	
	public String getCity () 
	{
		return this.city;	
	}

	
	public String getCountry () 
	{
		return this.country;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public String getLine1 () 
	{
		return this.line1;	
	}

	
	public String getLine2 () 
	{
		return this.line2;	
	}

	
	public void setCity (String myCity) 
	{
		this.city = myCity;	
	}

	
	public void setCountry (String myCountry) 
	{
		this.country = myCountry;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setLine1 (String myLine1) 
	{
		this.line1 = myLine1;	
	}

	
	public void setLine2 (String myLine2) 
	{
		this.line2 = myLine2;	
	}

	
	public void unsetCity () 
	{
		this.city = null;	
	}

	
	public void unsetCountry () 
	{
		this.country = null;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetLine1 () 
	{
		this.line1 = null;	
	}

	
	public void unsetLine2 () 
	{
		this.line2 = null;	
	}


}
