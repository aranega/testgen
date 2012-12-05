package com.genmymodel.petshop.domain;




public class Item
{

	
	
	private Long id;
	
	
	private Double price;
	
	
	private Product product;
	
	
	private String quantity;
    

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public Double getPrice () 
	{
		return this.price;	
	}

	
	public Product getProduct () 
	{
		return this.product;	
	}

	
	public String getQuantity () 
	{
		return this.quantity;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setPrice (Double myPrice) 
	{
		this.price = myPrice;	
	}

	
	public void setProduct (Product myProduct) 
	{
		this.product = myProduct;	
	}

	
	public void setQuantity (String myQuantity) 
	{
		this.quantity = myQuantity;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetPrice () 
	{
		this.price = null;	
	}

	
	public void unsetProduct () 
	{
		this.product = null;	
	}

	
	public void unsetQuantity () 
	{
		this.quantity = null;	
	}


}
