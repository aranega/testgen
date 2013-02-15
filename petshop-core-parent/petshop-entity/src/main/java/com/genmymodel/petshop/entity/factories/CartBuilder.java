package com.genmymodel.petshop.entity.factories;


import com.genmymodel.petshop.wrapper.Cart;
import com.genmymodel.petshop.wrapper.Customer;
import com.genmymodel.petshop.wrapper.Item;
import com.genmymodel.petshop.wrapper.Order;

//Start of user code for imports
// TODO: import me!
//End of user code




/*
 * Class
 * <!-- Start of user code comment for Cart Builder
 * End of user code -->
 */

public class CartBuilder<BUILDER extends CartBuilder<?>>
// Start of user code bloc for inerithance

// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	/**
	 *  
	 */
	private java.util.Date creationDate;
	
	private java.util.Date creationDate;
	
	private Customer customer;
	
	private Long id;
	
	private java.util.Set<Item> items;
	
	private Order order;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	OrderBuilder<?> orderBuilder;
	@javax.inject.Inject
	ItemBuilder<?> itemBuilder;
	@javax.inject.Inject
	CustomerBuilder<?> customerBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for Cart getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected CartBuilder() {
	}
	
	protected Cart createValue() {
		return new Cart();
	}
	
	/*
	 * <!-- Start of user code comment for Cart build method
	 * End of user code -->
	 */
	public Cart build() throws NullPointerException {
		Cart result =  this.createValue() ;
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else { 
			result.setCreationDate(creationDate);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else { 
			result.setCreationDate(creationDate);
		}
		if (customer == null) {
			throw new NullPointerException("Cart must be contained by a Customer which has not been set.");
		} else { 
				customer.setCarts(result);
			result.setCustomer(customer);
		}
		if (id == null) {
			handleDefaultId(result);
		} else { 
			result.setId(id);
		}
		if (items == null) {
			handleDefaultItems(result);
		} else { 
			result.itemsProperty().get().addAll(items);
		}
		if (order == null) {
			handleDefaultOrder(result);
		} else { 
				order.setCart(result);
			result.setOrder(order);
		}
		if (updateDate == null) {
			handleDefaultUpdateDate(result);
		} else { 
			result.setUpdateDate(updateDate);
		}
		if (version == null) {
			handleDefaultVersion(result);
		} else { 
			result.setVersion(version);
		}
		return result;	
	}

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
	private void handleDefaultCreationDate(Cart result) {
		// Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Cart.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Cart.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
	private void handleDefaultCreationDate(Cart result) {
		// Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Cart.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Cart.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(Cart result) {
		// Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Cart.id", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for items default method
	 * End of user code -->
	 */
	private void handleDefaultItems(Cart result) {
		// Start of user code default feature for handleDefaultItems
		result.getItems().add(itemBuilder.build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for order default method
	 * End of user code -->
	 */
	private void handleDefaultOrder(Cart result) {
		// Start of user code default feature for handleDefaultOrder
		// result.setOrder(null);
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(Cart result) {
		// Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Cart.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Cart.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(Cart result) {
		// Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Cart.version", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate
	 * End of user code -->
	 */
	public BUILDER creationDate(java.util.Date myCreationDate) {
		this.creationDate = myCreationDate;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for creationDate
	 * End of user code -->
	 */
	public BUILDER creationDate(java.util.Date myCreationDate) {
		this.creationDate = myCreationDate;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for customer
	 * End of user code -->
	 */
	public BUILDER customer(Customer myCustomer) {
		this.customer = myCustomer;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for id
	 * End of user code -->
	 */
	public BUILDER id(Long myId) {
		this.id = myId;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for items
	 * End of user code -->
	 */
	public BUILDER items(Item... myItems) {
		this.items = new java.util.HashSet<Item>(java.util.Arrays.asList(myItems));
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for order
	 * End of user code -->
	 */
	public BUILDER order(Order myOrder) {
		this.order = myOrder;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for updateDate
	 * End of user code -->
	 */
	public BUILDER updateDate(java.util.Date myUpdateDate) {
		this.updateDate = myUpdateDate;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for version
	 * End of user code -->
	 */
	public BUILDER version(Integer myVersion) {
		this.version = myVersion;
		return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
