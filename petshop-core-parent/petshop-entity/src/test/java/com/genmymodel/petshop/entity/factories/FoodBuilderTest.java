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

//import com.genmymodel.petshop.entity.factories.FoodBuilder;
import com.genmymodel.petshop.wrapper.Food;

/*
 * Test Class
 * <!-- Start of user code comment for Food Test Class
 * End of user code -->
 */


public class FoodBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private FoodBuilder<?> foodBuilder;
	
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
		IOC.getInjector().getInstance(FoodBuilderTest.class).justTryToPersiste();
		//Start of user code main of Food
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Food unsavedFood= foodBuilder.build();
		Food savedFood = manager.save(unsavedFood);
		Food dbFood = manager.get(Food.class, savedFood.getId());
		Assert.assertNotNull(dbFood);
		//Start of user code try to persist for Food
		
		//End of user code
	}
	@Test
	public void setterNGetterDescription() throws Exception {
		//Start of user code getter and setter for description attribute
		Food unsavedFood = foodBuilder.description("").build();
		Food savedFood = manager.save(unsavedFood);
		Food dbFood = manager.get(Food.class, savedFood.getId());
		Assert.assertNotNull(dbFood.getDescription());
		//End of user code
	}
	@Test
	public void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		Food unsavedFood = foodBuilder.name("").build();
		Food savedFood = manager.save(unsavedFood);
		Food dbFood = manager.get(Food.class, savedFood.getId());
		Assert.assertNotNull(dbFood.getName());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Food unsavedFood = foodBuilder.id(0L).build();
		Food savedFood = manager.save(unsavedFood);
		Food dbFood = manager.get(Food.class, savedFood.getId());
		Assert.assertNotNull(dbFood.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Food unsavedFood = foodBuilder.creationDate(new java.util.Date()).build();
		Food savedFood = manager.save(unsavedFood);
		Food dbFood = manager.get(Food.class, savedFood.getId());
		Assert.assertNotNull(dbFood.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Food unsavedFood = foodBuilder.updateDate(new java.util.Date()).build();
		Food savedFood = manager.save(unsavedFood);
		Food dbFood = manager.get(Food.class, savedFood.getId());
		Assert.assertNotNull(dbFood.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Food unsavedFood = foodBuilder.version(0).build();
		Food savedFood = manager.save(unsavedFood);
		Food dbFood = manager.get(Food.class, savedFood.getId());
		Assert.assertNotNull(dbFood.getVersion());
		//End of user code
	}
	@Test
	public void setterNGetterAttribute() throws Exception {
		//Start of user code getter and setter for attribute attribute
		Food unsavedFood = foodBuilder.attribute("").build();
		Food savedFood = manager.save(unsavedFood);
		Food dbFood = manager.get(Food.class, savedFood.getId());
		Assert.assertNotNull(dbFood.getAttribute());
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
