package com.genmymodel.petshop.domain;

import java.util.Set;
import java.util.List;
import com.genmymodel.petshop.domain.OrderStatus;



public class Order
{

	
	
	private Cart cart;
	
	
	private Customer customer;
	
	
	private String date;
	
	
	private Address deliveryAddress;
	
	
	private Set<Item> items;
	
	
	private Address paymentAddress;
	
	
	private String reference;
	
	
	private OrderStatus status;
    

	
	public void addItems (Item newItems) 
	{
		if(this.items==null) {
			this.items= new java.util.HashSet<Item>();
		}
			
		this.items.add (newItems);
			
	}

	
	public Cart getCart () 
	{
		return this.cart;	
	}

	
	public Customer getCustomer () 
	{
		return this.customer;	
	}

	
	public String getDate () 
	{
		return this.date;	
	}

	
	public Address getDeliveryAddress () 
	{
		return this.deliveryAddress;	
	}

	
	public List<Item> getItems () 
	{
		if(this.items==null) {
			this.items= new java.util.HashSet<Item>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<Item>(this.items));	
	}

	
	public Address getPaymentAddress () 
	{
		return this.paymentAddress;	
	}

	
	public String getReference () 
	{
		return this.reference;	
	}

	
	public OrderStatus getStatus () 
	{
		return this.status;	
	}

	
	public void removeItems (Item oldItems) 
	{
		if(this.items==null) {
			return;
		}
		
		this.items.remove (oldItems);
			
	}

	
	public void setCart (Cart myCart) 
	{
		if (this.cart != myCart) {
			Cart oldcart = this.cart;
			this.cart = myCart;
			if (oldcart != null)
				oldcart.unsetOrder ();
			if (myCart != null)
				myCart.setOrder (this);
		}	
	}

	
	public void setCustomer (Customer myCustomer) 
	{
		if (this.customer != myCustomer) {
			Customer oldcustomer = this.customer;
			this.customer = myCustomer;
			if (oldcustomer != null)
				oldcustomer.removeOrders (this);
			if (myCustomer != null)
				myCustomer.addOrders (this);
		}	
	}

	
	public void setDate (String myDate) 
	{
		this.date = myDate;	
	}

	
	public void setDeliveryAddress (Address myDeliveryAddress) 
	{
		this.deliveryAddress = myDeliveryAddress;	
	}

	
	public void setPaymentAddress (Address myPaymentAddress) 
	{
		this.paymentAddress = myPaymentAddress;	
	}

	
	public void setReference (String myReference) 
	{
		this.reference = myReference;	
	}

	
	public void setStatus (OrderStatus myStatus) 
	{
		this.status = myStatus;	
	}

	
	public void unsetCart () 
	{
		if (this.cart == null)
			return;
		Cart oldcart = this.cart;
		this.cart = null;
		oldcart.unsetOrder ();	
	}

	
	public void unsetCustomer () 
	{
		if (this.customer == null)
			return;
		Customer oldcustomer = this.customer;
		this.customer = null;
		oldcustomer.removeOrders (this);	
	}

	
	public void unsetDate () 
	{
		this.date = null;	
	}

	
	public void unsetDeliveryAddress () 
	{
		this.deliveryAddress = null;	
	}

	
	public void unsetPaymentAddress () 
	{
		this.paymentAddress = null;	
	}

	
	public void unsetReference () 
	{
		this.reference = null;	
	}

	
	public void unsetStatus () 
	{
		this.status = null;	
	}


}
