package com.genmymodel.petshop.entity.factories;


import com.genmymodel.petshop.wrapper.Order;
import com.genmymodel.petshop.wrapper.Customer;
import com.genmymodel.petshop.wrapper.Address;
import com.genmymodel.petshop.wrapper.Item;
import com.genmymodel.petshop.wrapper.Cart;
import com.genmymodel.petshop.entity.OrderStatus;
//Start of user code for imports
// TODO: import me!
//End of user code




public class OrderBuilder<BUILDER extends OrderBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private Cart cart;
	
	private java.util.Date creationDate;
	
	private Customer customer;
	
	private String date;
	
	private Address deliveryAddress;
	
	private Long id;
	
	private java.util.Set<Item> items;
	
	private Address paymentAddress;
	
	private String reference;
	
	private com.genmymodel.petshop.entity.OrderStatus status;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	AddressBuilder<?> addressBuilder;
	@javax.inject.Inject
	CartBuilder<?> cartBuilder;
	@javax.inject.Inject
	CustomerBuilder<?> customerBuilder;
	@javax.inject.Inject
	ItemBuilder<?> itemBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	/*
	 * Constructors 
	 */
	@javax.inject.Inject
	protected OrderBuilder() {
	}
	
	protected Order createValue() {
		return new Order();
	}
	
	public Order build() throws NullPointerException {
		Order result =  this.createValue() ;
		if (cart == null) {
			handleDefaultCart(result);
		} else {
			result.setCart(cart);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else {
			result.setCreationDate(creationDate);
		}
		if (customer == null) {
			throw new NullPointerException("Order must be contained by a Order which has not been set.");
		} else {
			result.setCustomer(customer);
		}
		if (date == null) {
			handleDefaultDate(result);
		} else {
			result.setDate(date);
		}
		if (deliveryAddress == null) {
			handleDefaultDeliveryAddress(result);
		} else {
			result.setDeliveryAddress(deliveryAddress);
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
		if (paymentAddress == null) {
			handleDefaultPaymentAddress(result);
		} else {
			result.setPaymentAddress(paymentAddress);
		}
		if (reference == null) {
			handleDefaultReference(result);
		} else {
			result.setReference(reference);
		}
		if (status == null) {
			handleDefaultStatus(result);
		} else {
			result.setStatus(status);
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
	private void handleDefaultCart(Order result) {
		//Start of user code default feature for handleDefaultCart
		//result.setCart(null);
		//End of user code
	}

	private void handleDefaultCreationDate(Order result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Order.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Order.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	

	private void handleDefaultDate(Order result) {
		//Start of user code default feature for handleDefaultDate
		result.setDate(cfg.getProperty("defaultValue.Order.date"));
		//End of user code
	}

	private void handleDefaultDeliveryAddress(Order result) {
		//Start of user code default feature for handleDefaultDeliveryAddress
		result.setDeliveryAddress(addressBuilder.build());
		//End of user code
	}

	private void handleDefaultId(Order result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Order.id", "0")));
		//End of user code
	}

	private void handleDefaultItems(Order result) {
		//Start of user code default feature for handleDefaultItems
		//do nothing
		//End of user code
	}

	private void handleDefaultPaymentAddress(Order result) {
		//Start of user code default feature for handleDefaultPaymentAddress
		result.setPaymentAddress(addressBuilder.build());
		//End of user code
	}

	private void handleDefaultReference(Order result) {
		//Start of user code default feature for handleDefaultReference
		result.setReference(cfg.getProperty("defaultValue.Order.reference"));
		//End of user code
	}

	private void handleDefaultStatus(Order result) {
		//Start of user code default feature for handleDefaultStatus
		result.setStatus(OrderStatus.valueOf(cfg.getProperty("defaultValue.Order.status", "preparation")));
		//End of user code
	}

	private void handleDefaultUpdateDate(Order result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Order.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Order.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultVersion(Order result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Order.version", "0")));
		//End of user code
	}

	public BUILDER cart(Cart myCart) {
			this.cart = myCart;
			return (BUILDER) this;
	}

	public BUILDER creationDate(java.util.Date myCreationDate) {
			this.creationDate = myCreationDate;
			return (BUILDER) this;
	}

	public BUILDER customer(Customer myCustomer) {
			this.customer = myCustomer;
			return (BUILDER) this;
	}

	public BUILDER date(String myDate) {
			this.date = myDate;
			return (BUILDER) this;
	}

	public BUILDER deliveryAddress(Address myDeliveryAddress) {
			this.deliveryAddress = myDeliveryAddress;
			return (BUILDER) this;
	}

	public BUILDER id(Long myId) {
			this.id = myId;
			return (BUILDER) this;
	}

	public BUILDER items(Item... myItems) {
			this.items = new java.util.HashSet<Item>(java.util.Arrays.asList(myItems));
			return (BUILDER) this;
	}

	public BUILDER paymentAddress(Address myPaymentAddress) {
			this.paymentAddress = myPaymentAddress;
			return (BUILDER) this;
	}

	public BUILDER reference(String myReference) {
			this.reference = myReference;
			return (BUILDER) this;
	}

	public BUILDER status(com.genmymodel.petshop.entity.OrderStatus myStatus) {
			this.status = myStatus;
			return (BUILDER) this;
	}

	public BUILDER updateDate(java.util.Date myUpdateDate) {
			this.updateDate = myUpdateDate;
			return (BUILDER) this;
	}

	public BUILDER version(Integer myVersion) {
			this.version = myVersion;
			return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
