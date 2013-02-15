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

//import com.genmymodel.petshop.entity.factories.ToyBuilder;
import com.genmymodel.petshop.wrapper.Toy;

/*
 * Test Class
 * <!-- Start of user code comment for Toy Test Class
 * End of user code -->
 */

/**
 *  
 */

public class ToyBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private ToyBuilder<?> toyBuilder;
	
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
		IOC.getInjector().getInstance(ToyBuilderTest.class).justTryToPersiste();
		//Start of user code main of Toy
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Toy unsavedToy= toyBuilder.build();
		Toy savedToy = manager.save(unsavedToy);
		Toy dbToy = manager.get(Toy.class, savedToy.getId());
		Assert.assertNotNull(dbToy);
		//Start of user code try to persist for Toy
		
		//End of user code
	}
	@Test
	public void setterNGetterDescription() throws Exception {
		//Start of user code getter and setter for description attribute
		Toy unsavedToy = toyBuilder.description("").build();
		Toy savedToy = manager.save(unsavedToy);
		Toy dbToy = manager.get(Toy.class, savedToy.getId());
		Assert.assertNotNull(dbToy.getDescription());
		//End of user code
	}
	@Test
	public void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		Toy unsavedToy = toyBuilder.name("").build();
		Toy savedToy = manager.save(unsavedToy);
		Toy dbToy = manager.get(Toy.class, savedToy.getId());
		Assert.assertNotNull(dbToy.getName());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Toy unsavedToy = toyBuilder.id(0L).build();
		Toy savedToy = manager.save(unsavedToy);
		Toy dbToy = manager.get(Toy.class, savedToy.getId());
		Assert.assertNotNull(dbToy.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Toy unsavedToy = toyBuilder.creationDate(new java.util.Date()).build();
		Toy savedToy = manager.save(unsavedToy);
		Toy dbToy = manager.get(Toy.class, savedToy.getId());
		Assert.assertNotNull(dbToy.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Toy unsavedToy = toyBuilder.updateDate(new java.util.Date()).build();
		Toy savedToy = manager.save(unsavedToy);
		Toy dbToy = manager.get(Toy.class, savedToy.getId());
		Assert.assertNotNull(dbToy.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Toy unsavedToy = toyBuilder.version(0).build();
		Toy savedToy = manager.save(unsavedToy);
		Toy dbToy = manager.get(Toy.class, savedToy.getId());
		Assert.assertNotNull(dbToy.getVersion());
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
