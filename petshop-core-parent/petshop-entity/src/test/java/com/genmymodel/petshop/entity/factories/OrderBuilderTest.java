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

//import com.genmymodel.petshop.entity.factories.OrderBuilder;
import com.genmymodel.petshop.wrapper.Order;

/*
 * Test Class
 * <!-- Start of user code comment for Order Test Class
 * End of user code -->
 */



public class OrderBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private OrderBuilder<?> orderBuilder;
	
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
		IOC.getInjector().getInstance(OrderBuilderTest.class).justTryToPersiste();
		//Start of user code main of Order
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Order unsavedOrder= orderBuilder.build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		//Start of user code try to persist for Order
		
		//End of user code
	}
	@Test
	public void setterNGetterReference() throws Exception {
		//Start of user code getter and setter for reference attribute
		Order unsavedOrder = orderBuilder.reference("").build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder.getReference());
		//End of user code
	}
	@Test
	public void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for status attribute
		Order unsavedOrder = orderBuilder.status("").build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder.getStatus());
		//End of user code
	}
	@Test
	public void setterNGetterDate() throws Exception {
		//Start of user code getter and setter for date attribute
		Order unsavedOrder = orderBuilder.date("").build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder.getDate());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Order unsavedOrder = orderBuilder.id(0L).build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Order unsavedOrder = orderBuilder.creationDate(new java.util.Date()).build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Order unsavedOrder = orderBuilder.updateDate(new java.util.Date()).build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Order unsavedOrder = orderBuilder.version(0).build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterDeliveryAddressTest() throws Exception {	
		//Start of user code basic reference test for deliveryAddress reference
		com.genmymodel.petshop.wrapper.Address elem1 = new com.genmymodel.petshop.wrapper.Address();
		Order unsavedOrder =  orderBuilder.deliveryAddress(elem1).build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		Assert.assertNotNull(dbOrder.getDeliveryAddress());
		//End of user code
	}
	
	@Test
	public void refSetterDeliveryAddressClassicTest() throws Exception {
		//Start of user code basic classic reference test for deliveryAddress reference
		Order unsavedOrder =  orderBuilder.build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		Assert.assertNotNull(dbOrder.getDeliveryAddress());
		//End of user code
	}
	
	@Test
	public void refSetterCartTest() throws Exception {	
		//Start of user code basic reference test for cart reference
		com.genmymodel.petshop.wrapper.Cart elem1 = new com.genmymodel.petshop.wrapper.Cart();
		Order unsavedOrder =  orderBuilder.cart(elem1).build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		Assert.assertNotNull(dbOrder.getCart());
		//End of user code
	}
	
	@Test
	public void refSetterItemsTest() throws Exception {
		//Start of user code basic reference test for items reference
		com.genmymodel.petshop.wrapper.Item elem1 = new com.genmymodel.petshop.wrapper.Item();
		Order unsavedOrder =  orderBuilder.items(elem1).build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		Assert.assertFalse(dbOrder.getItems().isEmpty());
		Assert.assertEquals(1, dbOrder.getItems().size());
		//End of user code
	}
	
	@Test
	public void refSetterItemsClassicTest() throws Exception {
		//Start of user code basic classic reference test for items reference
		Order unsavedOrder =  orderBuilder.build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		Assert.assertFalse(dbOrder.getItems().isEmpty());
		Assert.assertEquals(1, dbOrder.getItems().size());
		//End of user code
	}
	
	@Test
	public void refSetterCustomerTest() throws Exception {	
		//Start of user code basic reference test for customer reference
		com.genmymodel.petshop.wrapper.Customer elem1 = new com.genmymodel.petshop.wrapper.Customer();
		Order unsavedOrder =  orderBuilder.customer(elem1).build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		Assert.assertNotNull(dbOrder.getCustomer());
		//End of user code
	}
	
	@Test
	public void refSetterCustomerClassicTest() throws Exception {
		//Start of user code basic classic reference test for customer reference
		Order unsavedOrder =  orderBuilder.build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		Assert.assertNotNull(dbOrder.getCustomer());
		//End of user code
	}
	
	@Test
	public void refSetterPaymentAddressTest() throws Exception {	
		//Start of user code basic reference test for paymentAddress reference
		com.genmymodel.petshop.wrapper.Address elem1 = new com.genmymodel.petshop.wrapper.Address();
		Order unsavedOrder =  orderBuilder.paymentAddress(elem1).build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		Assert.assertNotNull(dbOrder.getPaymentAddress());
		//End of user code
	}
	
	@Test
	public void refSetterPaymentAddressClassicTest() throws Exception {
		//Start of user code basic classic reference test for paymentAddress reference
		Order unsavedOrder =  orderBuilder.build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		Assert.assertNotNull(dbOrder.getPaymentAddress());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeCartTest() throws Exception {
		//Start of user code basic opposite test for cart reference
		com.genmymodel.petshop.wrapper.Cart elem1 = new com.genmymodel.petshop.wrapper.Cart();
		Order unsavedOrder =  orderBuilder.cart(elem1).build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		Assert.assertNotNull(dbOrder.getCart().getOrder());
		Assert.assertEquals(dbOrder, dbOrder.getCart().getOrder());
		//End of user code
	}
	
	@Test
	public void oppositeCustomerTest() throws Exception {
		//Start of user code basic opposite test for customer reference
		com.genmymodel.petshop.wrapper.Customer elem1 = new com.genmymodel.petshop.wrapper.Customer();
		Order unsavedOrder =  orderBuilder.customer(elem1).build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		Assert.assertFalse(dbOrder.getCustomer().getOrders().isEmpty());
		Assert.assertTrue(dbOrder.getCustomer().getOrders().contains(dbOrder));
		//End of user code
	}
	
	@Test
	public void oppositeCustomerClassicTest() throws Exception {
		//Start of user code basic classic reference test for customer reference
		Order unsavedOrder =  orderBuilder.build();
		Order savedOrder = manager.save(unsavedOrder);
		Order dbOrder = manager.get(Order.class, savedOrder.getId());
		Assert.assertNotNull(dbOrder);
		Assert.assertFalse(dbOrder.getCustomer().getOrders().isEmpty());
		Assert.assertTrue(dbOrder.getCustomer().getOrders().contains(dbOrder));
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
