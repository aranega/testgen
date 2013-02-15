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

//import com.genmymodel.petshop.entity.factories.CartBuilder;
import com.genmymodel.petshop.wrapper.Cart;

/*
 * Test Class
 * <!-- Start of user code comment for Cart Test Class
 * End of user code -->
 */


public class CartBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private CartBuilder<?> cartBuilder;
	
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
		IOC.getInjector().getInstance(CartBuilderTest.class).justTryToPersiste();
		//Start of user code main of Cart
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Cart unsavedCart= cartBuilder.build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart);
		//Start of user code try to persist for Cart
		
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Cart unsavedCart = cartBuilder.creationDate(new java.util.Date()).build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Cart unsavedCart = cartBuilder.id(0L).build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Cart unsavedCart = cartBuilder.creationDate(new java.util.Date()).build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Cart unsavedCart = cartBuilder.updateDate(new java.util.Date()).build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Cart unsavedCart = cartBuilder.version(0).build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterItemsTest() throws Exception {
		//Start of user code basic reference test for items reference
		com.genmymodel.petshop.wrapper.Item elem1 = new com.genmymodel.petshop.wrapper.Item();
		Cart unsavedCart =  cartBuilder.items(elem1).build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart);
		Assert.assertFalse(dbCart.getItems().isEmpty());
		Assert.assertEquals(1, dbCart.getItems().size());
		//End of user code
	}
	
	@Test
	public void refSetterItemsClassicTest() throws Exception {
		//Start of user code basic classic reference test for items reference
		Cart unsavedCart =  cartBuilder.build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart);
		Assert.assertFalse(dbCart.getItems().isEmpty());
		Assert.assertEquals(1, dbCart.getItems().size());
		//End of user code
	}
	
	@Test
	public void refSetterCustomerTest() throws Exception {	
		//Start of user code basic reference test for customer reference
		com.genmymodel.petshop.wrapper.Customer elem1 = new com.genmymodel.petshop.wrapper.Customer();
		Cart unsavedCart =  cartBuilder.customer(elem1).build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart);
		Assert.assertNotNull(dbCart.getCustomer());
		//End of user code
	}
	
	@Test
	public void refSetterCustomerClassicTest() throws Exception {
		//Start of user code basic classic reference test for customer reference
		Cart unsavedCart =  cartBuilder.build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart);
		Assert.assertNotNull(dbCart.getCustomer());
		//End of user code
	}
	
	@Test
	public void refSetterOrderTest() throws Exception {	
		//Start of user code basic reference test for order reference
		com.genmymodel.petshop.wrapper.Order elem1 = new com.genmymodel.petshop.wrapper.Order();
		Cart unsavedCart =  cartBuilder.order(elem1).build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart);
		Assert.assertNotNull(dbCart.getOrder());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeCustomerTest() throws Exception {
		//Start of user code basic opposite test for customer reference
		com.genmymodel.petshop.wrapper.Customer elem1 = new com.genmymodel.petshop.wrapper.Customer();
		Cart unsavedCart =  cartBuilder.customer(elem1).build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart);
		Assert.assertNotNull(dbCart.getCustomer().getCarts());
		Assert.assertEquals(dbCart, dbCart.getCustomer().getCarts());
		//End of user code
	}
	
	@Test
	public void oppositeCustomerClassicTest() throws Exception {
		//Start of user code basic classic opposite test for customer reference
		Cart unsavedCart =  cartBuilder.build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart);
		Assert.assertNotNull(dbCart.getCustomer().getCarts());
		Assert.assertEquals(dbCart, dbCart.getCustomer().getCarts());
		//End of user code
	}
	
	@Test
	public void oppositeOrderTest() throws Exception {
		//Start of user code basic opposite test for order reference
		com.genmymodel.petshop.wrapper.Order elem1 = new com.genmymodel.petshop.wrapper.Order();
		Cart unsavedCart =  cartBuilder.order(elem1).build();
		Cart savedCart = manager.save(unsavedCart);
		Cart dbCart = manager.get(Cart.class, savedCart.getId());
		Assert.assertNotNull(dbCart);
		Assert.assertNotNull(dbCart.getOrder().getCart());
		Assert.assertEquals(dbCart, dbCart.getOrder().getCart());
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
