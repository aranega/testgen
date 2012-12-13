package com.genmymodel.petshop.domain;

import java.util.Set;
import java.util.List;



public class Cart
{

	
	
	private Boolean active;
	
	
	private java.util.Date creationDate;
	
	
	private Customer customer;
	
	
	private Set<Item> items;
	
	
	private Order order;
    

	
	public void addItems (Item newItems) 
	{
		if(this.items==null) {
			this.items= new java.util.HashSet<Item>();
		}
			
		this.items.add (newItems);
			
	}

	
	public Boolean getActive () 
	{
		return this.active;	
	}

	
	public java.util.Date getCreationDate () 
	{
		return this.creationDate;	
	}

	
	public Customer getCustomer () 
	{
		return this.customer;	
	}

	
	public List<Item> getItems () 
	{
		if(this.items==null) {
			this.items= new java.util.HashSet<Item>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<Item>(this.items));	
	}

	
	public Order getOrder () 
	{
		return this.order;	
	}

	
	public void removeItems (Item oldItems) 
	{
		if(this.items==null) {
			return;
		}
		
		this.items.remove (oldItems);
			
	}

	
	public void setActive (Boolean myActive) 
	{
		this.active = myActive;	
	}

	
	public void setCreationDate (java.util.Date myCreationDate) 
	{
		this.creationDate = myCreationDate;	
	}

	
	public void setCustomer (Customer myCustomer) 
	{
		if (this.customer != myCustomer) {
			Customer oldcustomer = this.customer;
			this.customer = myCustomer;
			if (oldcustomer != null)
				oldcustomer.unsetCarts ();
			if (myCustomer != null)
				myCustomer.setCarts (this);
		}	
	}

	
	public void setOrder (Order myOrder) 
	{
		if (this.order != myOrder) {
			Order oldorder = this.order;
			this.order = myOrder;
			if (oldorder != null)
				oldorder.unsetCart ();
			if (myOrder != null)
				myOrder.setCart (this);
		}	
	}

	
	public void unsetCreationDate () 
	{
		this.creationDate = null;	
	}

	
	public void unsetCustomer () 
	{
		if (this.customer == null)
			return;
		Customer oldcustomer = this.customer;
		this.customer = null;
		oldcustomer.unsetCarts ();	
	}

	
	public void unsetOrder () 
	{
		if (this.order == null)
			return;
		Order oldorder = this.order;
		this.order = null;
		oldorder.unsetCart ();	
	}


}
