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

//import com.genmymodel.petshop.entity.factories.ItemBuilder;
import com.genmymodel.petshop.wrapper.Item;

/*
 * Test Class
 * <!-- Start of user code comment for Item Test Class
 * End of user code -->
 */

/**
 *  
 */

public class ItemBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private ItemBuilder<?> itemBuilder;
	
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
		IOC.getInjector().getInstance(ItemBuilderTest.class).justTryToPersiste();
		//Start of user code main of Item
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Item unsavedItem= itemBuilder.build();
		Item savedItem = manager.save(unsavedItem);
		Item dbItem = manager.get(Item.class, savedItem.getId());
		Assert.assertNotNull(dbItem);
		//Start of user code try to persist for Item
		
		//End of user code
	}
	@Test
	public void setterNGetterPrice() throws Exception {
		//Start of user code getter and setter for price attribute
		Item unsavedItem = itemBuilder.price(0.0).build();
		Item savedItem = manager.save(unsavedItem);
		Item dbItem = manager.get(Item.class, savedItem.getId());
		Assert.assertNotNull(dbItem.getPrice());
		//End of user code
	}
	@Test
	public void setterNGetterQuantity() throws Exception {
		//Start of user code getter and setter for quantity attribute
		Item unsavedItem = itemBuilder.quantity("").build();
		Item savedItem = manager.save(unsavedItem);
		Item dbItem = manager.get(Item.class, savedItem.getId());
		Assert.assertNotNull(dbItem.getQuantity());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Item unsavedItem = itemBuilder.id(0L).build();
		Item savedItem = manager.save(unsavedItem);
		Item dbItem = manager.get(Item.class, savedItem.getId());
		Assert.assertNotNull(dbItem.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Item unsavedItem = itemBuilder.creationDate(new java.util.Date()).build();
		Item savedItem = manager.save(unsavedItem);
		Item dbItem = manager.get(Item.class, savedItem.getId());
		Assert.assertNotNull(dbItem.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Item unsavedItem = itemBuilder.updateDate(new java.util.Date()).build();
		Item savedItem = manager.save(unsavedItem);
		Item dbItem = manager.get(Item.class, savedItem.getId());
		Assert.assertNotNull(dbItem.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Item unsavedItem = itemBuilder.version(0).build();
		Item savedItem = manager.save(unsavedItem);
		Item dbItem = manager.get(Item.class, savedItem.getId());
		Assert.assertNotNull(dbItem.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterProductTest() throws Exception {	
		//Start of user code basic reference test for product reference
		com.genmymodel.petshop.wrapper.Product elem1 = new com.genmymodel.petshop.wrapper.Product();
		Item unsavedItem =  itemBuilder.product(elem1).build();
		Item savedItem = manager.save(unsavedItem);
		Item dbItem = manager.get(Item.class, savedItem.getId());
		Assert.assertNotNull(dbItem);
		Assert.assertNotNull(dbItem.getProduct());
		//End of user code
	}
	
	@Test
	public void refSetterProductClassicTest() throws Exception {
		//Start of user code basic classic reference test for product reference
		Item unsavedItem =  itemBuilder.build();
		Item savedItem = manager.save(unsavedItem);
		Item dbItem = manager.get(Item.class, savedItem.getId());
		Assert.assertNotNull(dbItem);
		Assert.assertNotNull(dbItem.getProduct());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
