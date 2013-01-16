package com.genmymodel.petshop.domain;




public class Item
{

	
	
	private Double price;
	
	
	private Product product;
	
	
	private String quantity;
    

	
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
