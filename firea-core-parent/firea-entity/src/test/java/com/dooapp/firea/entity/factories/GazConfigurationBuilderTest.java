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

//import com.dooapp.firea.entity.factories.GazConfigurationBuilder;
import com.dooapp.firea.wrapper.GazConfiguration;

/*
 * Test Class
 * <!-- Start of user code comment for GazConfiguration Test Class
 * End of user code -->
 */


public class GazConfigurationBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private GazConfigurationBuilder<?> gazConfigurationBuilder;
	
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
		IOC.getInjector().getInstance(GazConfigurationBuilderTest.class).justTryToPersiste();
		//Start of user code main of GazConfiguration
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		GazConfiguration unsavedGazConfiguration= gazConfigurationBuilder.build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		//Start of user code try to persist for GazConfiguration
		
		//End of user code
	}
	@Test
	public void setterNGetterRetentionInterface() throws Exception {
		//Start of user code getter and setter for retentionInterface attribute
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.retentionInterface(false).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.isRetentionInterface());
		//End of user code
	}
	@Test
	public void setterNGetterSlowUnloading() throws Exception {
		//Start of user code getter and setter for slowUnloading attribute
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.slowUnloading(false).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.isSlowUnloading());
		//End of user code
	}
	@Test
	public void setterNGetterDroppedFloorFull() throws Exception {
		//Start of user code getter and setter for droppedFloorFull attribute
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.droppedFloorFull(false).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.isDroppedFloorFull());
		//End of user code
	}
	@Test
	public void setterNGetterLeekRepartitionPercent() throws Exception {
		//Start of user code getter and setter for leekRepartitionPercent attribute
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.leekRepartitionPercent(0.0).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getLeekRepartitionPercent());
		//End of user code
	}
	@Test
	public void setterNGetterSlowUnloadingValue() throws Exception {
		//Start of user code getter and setter for slowUnloadingValue attribute
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.slowUnloadingValue(0.0).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getSlowUnloadingValue());
		//End of user code
	}
	@Test
	public void setterNGetterDroppedCeilFull() throws Exception {
		//Start of user code getter and setter for droppedCeilFull attribute
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.droppedCeilFull(false).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.isDroppedCeilFull());
		//End of user code
	}
	@Test
	public void setterNGetterRetentionGoal() throws Exception {
		//Start of user code getter and setter for retentionGoal attribute
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.retentionGoal(0.0).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getRetentionGoal());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.id(0L).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.creationDate(new java.util.Date()).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.updateDate(new java.util.Date()).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.version(0).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterProjectTest() throws Exception {	
		//Start of user code basic reference test for project reference
		com.dooapp.firea.wrapper.Project elem1 = new com.dooapp.firea.wrapper.Project();
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.project(elem1).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getProject());
		//End of user code
	}
	
	@Test
	public void refSetterBottleconfigurationsTest() throws Exception {
		//Start of user code basic reference test for bottleconfigurations reference
		com.dooapp.firea.wrapper.BottleConfiguration elem1 = new com.dooapp.firea.wrapper.BottleConfiguration();
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.bottleconfigurations(elem1).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertFalse(dbGazConfiguration.getBottleconfigurations().isEmpty());
		Assert.assertEquals(1, dbGazConfiguration.getBottleconfigurations().size());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeProjectTest() throws Exception {
		//Start of user code basic opposite test for project reference
		com.dooapp.firea.wrapper.Project elem1 = new com.dooapp.firea.wrapper.Project();
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.project(elem1).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getProject().getGazconfiguration());
		Assert.assertEquals(dbGazConfiguration, dbGazConfiguration.getProject().getGazconfiguration());
		//End of user code
	}
	
	@Test
	public void oppositeBottleconfigurationsTest() throws Exception {
		//Start of user code basic opposite test for bottleconfigurations reference
		com.dooapp.firea.wrapper.BottleConfiguration elem1 = new com.dooapp.firea.wrapper.BottleConfiguration();
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.bottleconfigurations(elem1).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getBottleconfigurations().get(0).getGazconfiguration());
		Assert.assertEquals(dbGazConfiguration, dbGazConfiguration.getBottleconfigurations().get(0).getGazconfiguration());
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
