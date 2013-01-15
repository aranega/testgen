package com.genmymodel.petshop.entity.factories;


import com.genmymodel.petshop.wrapper.Customer;
import com.genmymodel.petshop.wrapper.Address;
import com.genmymodel.petshop.wrapper.Order;
import com.genmymodel.petshop.wrapper.Cart;
//Start of user code for imports
// TODO: import me!
//End of user code




public class CustomerBuilder<BUILDER extends CustomerBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private Address address;
	
	private Cart carts;
	
	private java.util.Date creationDate;
	
	private String firstName;
	
	private Long id;
	
	private String lastName;
	
	private java.util.Set<Order> orders;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	AddressBuilder<?> addressBuilder;
	@javax.inject.Inject
	CartBuilder<?> cartBuilder;
	@javax.inject.Inject
	OrderBuilder<?> orderBuilder;
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
	protected CustomerBuilder() {
	}
	
	protected Customer createValue() {
		return new Customer();
	}
	
	public Customer build() throws NullPointerException {
		Customer result =  this.createValue() ;
		if (address == null) {
			handleDefaultAddress(result);
		} else {
			result.setAddress(address);
		}
		if (carts == null) {
			handleDefaultCarts(result);
		} else {
			result.setCarts(carts);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else {
			result.setCreationDate(creationDate);
		}
		if (firstName == null) {
			handleDefaultFirstName(result);
		} else {
			result.setFirstName(firstName);
		}
		if (id == null) {
			handleDefaultId(result);
		} else {
			result.setId(id);
		}
		if (lastName == null) {
			handleDefaultLastName(result);
		} else {
			result.setLastName(lastName);
		}
		if (orders == null) {
			handleDefaultOrders(result);
		} else {
			result.ordersProperty().get().addAll(orders);
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
	private void handleDefaultAddress(Customer result) {
		//Start of user code default feature for handleDefaultAddress
		//result.setAddress(null);
		//End of user code
	}

	private void handleDefaultCarts(Customer result) {
		//Start of user code default feature for handleDefaultCarts
		//result.setCarts(null);
		//End of user code
	}

	private void handleDefaultCreationDate(Customer result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Customer.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Customer.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultFirstName(Customer result) {
		//Start of user code default feature for handleDefaultFirstName
		result.setFirstName(cfg.getProperty("defaultValue.Customer.firstName"));
		//End of user code
	}

	private void handleDefaultId(Customer result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Customer.id", "0")));
		//End of user code
	}

	private void handleDefaultLastName(Customer result) {
		//Start of user code default feature for handleDefaultLastName
		result.setLastName(cfg.getProperty("defaultValue.Customer.lastName"));
		//End of user code
	}

	private void handleDefaultOrders(Customer result) {
		//Start of user code default feature for handleDefaultOrders
		//do nothing
		//End of user code
	}

	private void handleDefaultUpdateDate(Customer result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Customer.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Customer.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultVersion(Customer result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Customer.version", "0")));
		//End of user code
	}

	public BUILDER address(Address myAddress) {
			this.address = myAddress;
			return (BUILDER) this;
	}

	public BUILDER carts(Cart myCarts) {
			this.carts = myCarts;
			return (BUILDER) this;
	}

	public BUILDER creationDate(java.util.Date myCreationDate) {
			this.creationDate = myCreationDate;
			return (BUILDER) this;
	}

	public BUILDER firstName(String myFirstName) {
			this.firstName = myFirstName;
			return (BUILDER) this;
	}

	public BUILDER id(Long myId) {
			this.id = myId;
			return (BUILDER) this;
	}

	public BUILDER lastName(String myLastName) {
			this.lastName = myLastName;
			return (BUILDER) this;
	}

	public BUILDER orders(Order... myOrders) {
			this.orders = new java.util.HashSet<Order>(java.util.Arrays.asList(myOrders));
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
