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

//import com.dooapp.firea.entity.factories.BottleConfigurationBuilder;
import com.dooapp.firea.wrapper.BottleConfiguration;

/*
 * Test Class
 * <!-- Start of user code comment for BottleConfiguration Test Class
 * End of user code -->
 */


public class BottleConfigurationBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private BottleConfigurationBuilder<?> bottleConfigurationBuilder;
	
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
		IOC.getInjector().getInstance(BottleConfigurationBuilderTest.class).justTryToPersiste();
		//Start of user code main of BottleConfiguration
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		BottleConfiguration unsavedBottleConfiguration= bottleConfigurationBuilder.build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration);
		//Start of user code try to persist for BottleConfiguration
		
		//End of user code
	}
	@Test
	public void setterNGetterQuantity() throws Exception {
		//Start of user code getter and setter for quantity attribute
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.quantity(0).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getQuantity());
		//End of user code
	}
	@Test
	public void setterNGetterLoad() throws Exception {
		//Start of user code getter and setter for load attribute
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.load(0.0).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getLoad());
		//End of user code
	}
	@Test
	public void setterNGetterUnit() throws Exception {
		//Start of user code getter and setter for unit attribute
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.unit("").build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getUnit());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.id(0L).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.creationDate(new java.util.Date()).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.updateDate(new java.util.Date()).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.version(0).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterGazconfigurationTest() throws Exception {	
		//Start of user code basic reference test for gazconfiguration reference
		com.dooapp.firea.wrapper.GazConfiguration elem1 = new com.dooapp.firea.wrapper.GazConfiguration();
		BottleConfiguration unsavedBottleConfiguration =  bottleConfigurationBuilder.gazconfiguration(elem1).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration);
		Assert.assertNotNull(dbBottleConfiguration.getGazconfiguration());
		//End of user code
	}
	
	@Test
	public void refSetterGazconfigurationClassicTest() throws Exception {
		//Start of user code basic classic reference test for gazconfiguration reference
		BottleConfiguration unsavedBottleConfiguration =  bottleConfigurationBuilder.build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration);
		Assert.assertNotNull(dbBottleConfiguration.getGazconfiguration());
		//End of user code
	}
	
	@Test
	public void refSetterBottletypeTest() throws Exception {	
		//Start of user code basic reference test for bottletype reference
		com.dooapp.firea.wrapper.BottleType elem1 = new com.dooapp.firea.wrapper.BottleType();
		BottleConfiguration unsavedBottleConfiguration =  bottleConfigurationBuilder.bottletype(elem1).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration);
		Assert.assertNotNull(dbBottleConfiguration.getBottletype());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeGazconfigurationTest() throws Exception {
		//Start of user code basic opposite test for gazconfiguration reference
		com.dooapp.firea.wrapper.GazConfiguration elem1 = new com.dooapp.firea.wrapper.GazConfiguration();
		BottleConfiguration unsavedBottleConfiguration =  bottleConfigurationBuilder.gazconfiguration(elem1).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration);
		Assert.assertFalse(dbBottleConfiguration.getGazconfiguration().getBottleconfigurations().isEmpty());
		Assert.assertTrue(dbBottleConfiguration.getGazconfiguration().getBottleconfigurations().contains(dbBottleConfiguration));
		//End of user code
	}
	
	@Test
	public void oppositeGazconfigurationClassicTest() throws Exception {
		//Start of user code basic classic reference test for gazconfiguration reference
		BottleConfiguration unsavedBottleConfiguration =  bottleConfigurationBuilder.build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration);
		Assert.assertFalse(dbBottleConfiguration.getGazconfiguration().getBottleconfigurations().isEmpty());
		Assert.assertTrue(dbBottleConfiguration.getGazconfiguration().getBottleconfigurations().contains(dbBottleConfiguration));
		//End of user code
	}
	
	@Test
	public void oppositeBottletypeTest() throws Exception {
		//Start of user code basic opposite test for bottletype reference
		com.dooapp.firea.wrapper.BottleType elem1 = new com.dooapp.firea.wrapper.BottleType();
		BottleConfiguration unsavedBottleConfiguration =  bottleConfigurationBuilder.bottletype(elem1).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration);
		Assert.assertFalse(dbBottleConfiguration.getBottletype().getBottleconfiguration().isEmpty());
		Assert.assertTrue(dbBottleConfiguration.getBottletype().getBottleconfiguration().contains(dbBottleConfiguration));
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
