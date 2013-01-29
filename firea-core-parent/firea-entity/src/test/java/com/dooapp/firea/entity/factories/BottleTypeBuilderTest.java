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

//import com.dooapp.firea.entity.factories.BottleTypeBuilder;
import com.dooapp.firea.wrapper.BottleType;

/*
 * Test Class
 * <!-- Start of user code comment for BottleType Test Class
 * End of user code -->
 */


public class BottleTypeBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private BottleTypeBuilder<?> bottleTypeBuilder;
	
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
		IOC.getInjector().getInstance(BottleTypeBuilderTest.class).justTryToPersiste();
		//Start of user code main of BottleType
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		BottleType unsavedBottleType= bottleTypeBuilder.build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType);
		//Start of user code try to persist for BottleType
		
		//End of user code
	}
	@Test
	public void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		BottleType unsavedBottleType = bottleTypeBuilder.name("").build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getName());
		//End of user code
	}
	@Test
	public void setterNGetterWeight() throws Exception {
		//Start of user code getter and setter for weight attribute
		BottleType unsavedBottleType = bottleTypeBuilder.weight(0.0).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getWeight());
		//End of user code
	}
	@Test
	public void setterNGetterVolume() throws Exception {
		//Start of user code getter and setter for volume attribute
		BottleType unsavedBottleType = bottleTypeBuilder.volume(0.0).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getVolume());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		BottleType unsavedBottleType = bottleTypeBuilder.id(0L).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		BottleType unsavedBottleType = bottleTypeBuilder.creationDate(new java.util.Date()).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		BottleType unsavedBottleType = bottleTypeBuilder.updateDate(new java.util.Date()).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		BottleType unsavedBottleType = bottleTypeBuilder.version(0).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterBottleconfigurationTest() throws Exception {
		//Start of user code basic reference test for bottleconfiguration reference
		com.dooapp.firea.wrapper.BottleConfiguration elem1 = new com.dooapp.firea.wrapper.BottleConfiguration();
		BottleType unsavedBottleType =  bottleTypeBuilder.bottleconfiguration(elem1).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType);
		Assert.assertFalse(dbBottleType.getBottleconfiguration().isEmpty());
		Assert.assertEquals(1, dbBottleType.getBottleconfiguration().size());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeBottleconfigurationTest() throws Exception {
		//Start of user code basic opposite test for bottleconfiguration reference
		com.dooapp.firea.wrapper.BottleConfiguration elem1 = new com.dooapp.firea.wrapper.BottleConfiguration();
		BottleType unsavedBottleType =  bottleTypeBuilder.bottleconfiguration(elem1).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType);
		Assert.assertNotNull(dbBottleType.getBottleconfiguration().get(0).getBottletype());
		Assert.assertEquals(dbBottleType, dbBottleType.getBottleconfiguration().get(0).getBottletype());
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
