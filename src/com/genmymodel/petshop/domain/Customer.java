package com.genmymodel.petshop.domain;

import java.util.List;
import java.util.Set;



public class Customer
{

	
	
	private Address address;
	
	
	private Cart carts;
	
	
	private String firstName;
	
	
	private Long id;
	
	
	private String lastName;
	
	
	private Set<Order> orders;
    

	
	public void addOrders (Order newOrders) 
	{
		if(this.orders==null) {
			this.orders= new java.util.HashSet<Order>();
		}
			
		if (this.orders.add (newOrders))
			newOrders.setCustomer (this);
			
	}

	
	public Address getAddress () 
	{
		return this.address;	
	}

	
	public Cart getCarts () 
	{
		return this.carts;	
	}

	
	public String getFirstName () 
	{
		return this.firstName;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public String getLastName () 
	{
		return this.lastName;	
	}

	
	public List<Order> getOrders () 
	{
		if(this.orders==null) {
			this.orders= new java.util.HashSet<Order>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<Order>(this.orders));	
	}

	
	public void removeOrders (Order oldOrders) 
	{
		if(this.orders==null) {
			return;
		}
		
		this.orders.remove (oldOrders);
			
	}

	
	public void setAddress (Address myAddress) 
	{
		this.address = myAddress;	
	}

	
	public void setCarts (Cart myCarts) 
	{
		if (this.carts != myCarts) {
			Cart oldcarts = this.carts;
			this.carts = myCarts;
			if (oldcarts != null)
				oldcarts.unsetCustomer ();
			if (myCarts != null)
				myCarts.setCustomer (this);
		}	
	}

	
	public void setFirstName (String myFirstName) 
	{
		this.firstName = myFirstName;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setLastName (String myLastName) 
	{
		this.lastName = myLastName;	
	}

	
	public void unsetAddress () 
	{
		this.address = null;	
	}

	
	public void unsetCarts () 
	{
		if (this.carts == null)
			return;
		Cart oldcarts = this.carts;
		this.carts = null;
		oldcarts.unsetCustomer ();	
	}

	
	public void unsetFirstName () 
	{
		this.firstName = null;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetLastName () 
	{
		this.lastName = null;	
	}


}
