package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.GazBuilder;
import com.dooapp.firea.wrapper.Gaz;

/*
 * Test Class
 * <!-- Start of user code comment for Gaz Test Class
 * End of user code -->
 */


public class GazBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private GazBuilder<?> gazBuilder;
	
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
		IOC.getInjector().getInstance(GazBuilderTest.class).justTryToPersiste();
		//Start of user code main of Gaz
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Gaz unsavedGaz= gazBuilder.build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz);
		//Start of user code try to persist for Gaz
		
		//End of user code
	}
	@Test
	public void setterNGetterWeight() throws Exception {
		//Start of user code getter and setter for weight attribute
		Gaz unsavedGaz = gazBuilder.weight("").build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getWeight());
		//End of user code
	}
	@Test
	public void setterNGetterDensity() throws Exception {
		//Start of user code getter and setter for density attribute
		Gaz unsavedGaz = gazBuilder.density(0.0).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getDensity());
		//End of user code
	}
	@Test
	public void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		Gaz unsavedGaz = gazBuilder.name("").build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getName());
		//End of user code
	}
	@Test
	public void setterNGetterType() throws Exception {
		//Start of user code getter and setter for type attribute
		Gaz unsavedGaz = gazBuilder.type(0).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getType());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Gaz unsavedGaz = gazBuilder.id(0L).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Gaz unsavedGaz = gazBuilder.creationDate(new java.util.Date()).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Gaz unsavedGaz = gazBuilder.updateDate(new java.util.Date()).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Gaz unsavedGaz = gazBuilder.version(0).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterBottletypesTest() throws Exception {
		//Start of user code basic reference test for bottletypes reference
		com.dooapp.firea.wrapper.BottleType elem1 = new com.dooapp.firea.wrapper.BottleType();
		Gaz unsavedGaz =  gazBuilder.bottletypes(elem1).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz);
		Assert.assertFalse(dbGaz.getBottletypes().isEmpty());
		Assert.assertEquals(1, dbGaz.getBottletypes().size());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
