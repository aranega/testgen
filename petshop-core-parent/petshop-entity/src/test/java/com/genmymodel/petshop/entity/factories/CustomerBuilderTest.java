package com.genmymodel.petshop.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.genmymodel.petshop.entity.factories.CustomerBuilder;
import com.genmymodel.petshop.wrapper.Customer;

/*
 * Test Class
 * <!-- Start of user code comment for Customer Test Class
 * End of user code -->
 */

/**
 *  
 */

public class CustomerBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private CustomerBuilder<?> customerBuilder;
	
	@Before
	public void setup() {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().injectMembers(this);
	}
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(CustomerBuilderTest.class).justTryToPersiste();
		//Start of user code main of Customer
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Customer unsavedCustomer= customerBuilder.build();
		Customer savedCustomer = manager.save(unsavedCustomer);
		Customer dbCustomer = manager.get(Customer.class, savedCustomer.getId());
		Assert.assertNotNull(dbCustomer);
		//Start of user code try to persist for Customer
		
		//End of user code
	}
	@Test
	public void setterNGetterFirstName() throws Exception {
		//Start of user code getter and setter for firstName attribute
		Customer unsavedCustomer = customerBuilder.firstName("").build();
		Customer savedCustomer = manager.save(unsavedCustomer);
		Customer dbCustomer = manager.get(Customer.class, savedCustomer.getId());
		Assert.assertNotNull(dbCustomer.getFirstName());
		//End of user code
	}
	@Test
	public void setterNGetterLastName() throws Exception {
		//Start of user code getter and setter for lastName attribute
		Customer unsavedCustomer = customerBuilder.lastName("").build();
		Customer savedCustomer = manager.save(unsavedCustomer);
		Customer dbCustomer = manager.get(Customer.class, savedCustomer.getId());
		Assert.assertNotNull(dbCustomer.getLastName());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Customer unsavedCustomer = customerBuilder.id(0L).build();
		Customer savedCustomer = manager.save(unsavedCustomer);
		Customer dbCustomer = manager.get(Customer.class, savedCustomer.getId());
		Assert.assertNotNull(dbCustomer.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Customer unsavedCustomer = customerBuilder.creationDate(new java.util.Date()).build();
		Customer savedCustomer = manager.save(unsavedCustomer);
		Customer dbCustomer = manager.get(Customer.class, savedCustomer.getId());
		Assert.assertNotNull(dbCustomer.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Customer unsavedCustomer = customerBuilder.updateDate(new java.util.Date()).build();
		Customer savedCustomer = manager.save(unsavedCustomer);
		Customer dbCustomer = manager.get(Customer.class, savedCustomer.getId());
		Assert.assertNotNull(dbCustomer.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Customer unsavedCustomer = customerBuilder.version(0).build();
		Customer savedCustomer = manager.save(unsavedCustomer);
		Customer dbCustomer = manager.get(Customer.class, savedCustomer.getId());
		Assert.assertNotNull(dbCustomer.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterCartsTest() throws Exception {	
		//Start of user code basic reference test for carts reference
		com.genmymodel.petshop.wrapper.Cart elem1 = new com.genmymodel.petshop.wrapper.Cart();
		Customer unsavedCustomer =  customerBuilder.carts(elem1).build();
		Customer savedCustomer = manager.save(unsavedCustomer);
		Customer dbCustomer = manager.get(Customer.class, savedCustomer.getId());
		Assert.assertNotNull(dbCustomer);
		Assert.assertNotNull(dbCustomer.getCarts());
		//End of user code
	}
	
	@Test
	public void refSetterOrdersTest() throws Exception {
		//Start of user code basic reference test for orders reference
		com.genmymodel.petshop.wrapper.Order elem1 = new com.genmymodel.petshop.wrapper.Order();
		Customer unsavedCustomer =  customerBuilder.orders(elem1).build();
		Customer savedCustomer = manager.save(unsavedCustomer);
		Customer dbCustomer = manager.get(Customer.class, savedCustomer.getId());
		Assert.assertNotNull(dbCustomer);
		Assert.assertFalse(dbCustomer.getOrders().isEmpty());
		Assert.assertEquals(1, dbCustomer.getOrders().size());
		//End of user code
	}
	
	@Test
	public void refSetterAddressTest() throws Exception {	
		//Start of user code basic reference test for address reference
		com.genmymodel.petshop.wrapper.Address elem1 = new com.genmymodel.petshop.wrapper.Address();
		Customer unsavedCustomer =  customerBuilder.address(elem1).build();
		Customer savedCustomer = manager.save(unsavedCustomer);
		Customer dbCustomer = manager.get(Customer.class, savedCustomer.getId());
		Assert.assertNotNull(dbCustomer);
		Assert.assertNotNull(dbCustomer.getAddress());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeCartsTest() throws Exception {
		//Start of user code basic opposite test for carts reference
		com.genmymodel.petshop.wrapper.Cart elem1 = new com.genmymodel.petshop.wrapper.Cart();
		Customer unsavedCustomer =  customerBuilder.carts(elem1).build();
		Customer savedCustomer = manager.save(unsavedCustomer);
		Customer dbCustomer = manager.get(Customer.class, savedCustomer.getId());
		Assert.assertNotNull(dbCustomer);
		Assert.assertNotNull(dbCustomer.getCarts().getCustomer());
		Assert.assertEquals(dbCustomer, dbCustomer.getCarts().getCustomer());
		//End of user code
	}
	
	@Test
	public void oppositeOrdersTest() throws Exception {
		//Start of user code basic opposite test for orders reference
		com.genmymodel.petshop.wrapper.Order elem1 = new com.genmymodel.petshop.wrapper.Order();
		Customer unsavedCustomer =  customerBuilder.orders(elem1).build();
		Customer savedCustomer = manager.save(unsavedCustomer);
		Customer dbCustomer = manager.get(Customer.class, savedCustomer.getId());
		Assert.assertNotNull(dbCustomer);
		Assert.assertNotNull(dbCustomer.getOrders().get(0).getCustomer());
		Assert.assertEquals(dbCustomer, dbCustomer.getOrders().get(0).getCustomer());
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
