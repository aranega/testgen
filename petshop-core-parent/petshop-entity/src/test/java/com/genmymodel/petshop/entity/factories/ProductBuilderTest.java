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

//import com.genmymodel.petshop.entity.factories.ProductBuilder;
import com.genmymodel.petshop.wrapper.Product;

/*
 * Test Class
 * <!-- Start of user code comment for Product Test Class
 * End of user code -->
 */

/**
 *  
 */

public class ProductBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private ProductBuilder<?> productBuilder;
	
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
		IOC.getInjector().getInstance(ProductBuilderTest.class).justTryToPersiste();
		//Start of user code main of Product
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Product unsavedProduct= productBuilder.build();
		Product savedProduct = manager.save(unsavedProduct);
		Product dbProduct = manager.get(Product.class, savedProduct.getId());
		Assert.assertNotNull(dbProduct);
		//Start of user code try to persist for Product
		
		//End of user code
	}
	@Test
	public void setterNGetterDescription() throws Exception {
		//Start of user code getter and setter for description attribute
		Product unsavedProduct = productBuilder.description("").build();
		Product savedProduct = manager.save(unsavedProduct);
		Product dbProduct = manager.get(Product.class, savedProduct.getId());
		Assert.assertNotNull(dbProduct.getDescription());
		//End of user code
	}
	@Test
	public void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		Product unsavedProduct = productBuilder.name("").build();
		Product savedProduct = manager.save(unsavedProduct);
		Product dbProduct = manager.get(Product.class, savedProduct.getId());
		Assert.assertNotNull(dbProduct.getName());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Product unsavedProduct = productBuilder.id(0L).build();
		Product savedProduct = manager.save(unsavedProduct);
		Product dbProduct = manager.get(Product.class, savedProduct.getId());
		Assert.assertNotNull(dbProduct.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Product unsavedProduct = productBuilder.creationDate(new java.util.Date()).build();
		Product savedProduct = manager.save(unsavedProduct);
		Product dbProduct = manager.get(Product.class, savedProduct.getId());
		Assert.assertNotNull(dbProduct.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Product unsavedProduct = productBuilder.updateDate(new java.util.Date()).build();
		Product savedProduct = manager.save(unsavedProduct);
		Product dbProduct = manager.get(Product.class, savedProduct.getId());
		Assert.assertNotNull(dbProduct.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Product unsavedProduct = productBuilder.version(0).build();
		Product savedProduct = manager.save(unsavedProduct);
		Product dbProduct = manager.get(Product.class, savedProduct.getId());
		Assert.assertNotNull(dbProduct.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
		
	/*
	 * Basic Refs opposite tester
	 */
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
