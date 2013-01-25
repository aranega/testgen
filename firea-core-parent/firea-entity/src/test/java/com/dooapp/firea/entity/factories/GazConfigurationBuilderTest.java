package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

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
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(GazConfigurationBuilderTest.class).justTryToPersiste();
		//Start of user code main of GazConfiguration
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		GazConfiguration unsavedProject = gazConfigurationBuilder.build();
		GazConfiguration savedProject = manager.save(unsavedProject);
		GazConfiguration dbProject = manager.get(GazConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for GazConfiguration
		
		//End of user code
	}
	private void setterNGetterDroppedCeilFull() throws Exception {
		//Start of user code getter and setter for droppedCeilFull attribute
		GazConfiguration unsavedProject = gazConfigurationBuilder.droppedCeilFull(false).build();
		GazConfiguration savedProject = manager.save(unsavedProject);
		GazConfiguration dbProject = manager.get(GazConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdroppedCeilFull());
		//End of user code
	}
	private void setterNGetterSlowUnloadingValue() throws Exception {
		//Start of user code getter and setter for slowUnloadingValue attribute
		GazConfiguration unsavedProject = gazConfigurationBuilder.slowUnloadingValue(0.0).build();
		GazConfiguration savedProject = manager.save(unsavedProject);
		GazConfiguration dbProject = manager.get(GazConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getslowUnloadingValue());
		//End of user code
	}
	private void setterNGetterSlowUnloading() throws Exception {
		//Start of user code getter and setter for slowUnloading attribute
		GazConfiguration unsavedProject = gazConfigurationBuilder.slowUnloading(false).build();
		GazConfiguration savedProject = manager.save(unsavedProject);
		GazConfiguration dbProject = manager.get(GazConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getslowUnloading());
		//End of user code
	}
	private void setterNGetterLeekRepartitionPercent() throws Exception {
		//Start of user code getter and setter for leekRepartitionPercent attribute
		GazConfiguration unsavedProject = gazConfigurationBuilder.leekRepartitionPercent(0.0).build();
		GazConfiguration savedProject = manager.save(unsavedProject);
		GazConfiguration dbProject = manager.get(GazConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getleekRepartitionPercent());
		//End of user code
	}
	private void setterNGetterRetentionInterface() throws Exception {
		//Start of user code getter and setter for retentionInterface attribute
		GazConfiguration unsavedProject = gazConfigurationBuilder.retentionInterface(false).build();
		GazConfiguration savedProject = manager.save(unsavedProject);
		GazConfiguration dbProject = manager.get(GazConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getretentionInterface());
		//End of user code
	}
	private void setterNGetterRetentionGoal() throws Exception {
		//Start of user code getter and setter for retentionGoal attribute
		GazConfiguration unsavedProject = gazConfigurationBuilder.retentionGoal(0.0).build();
		GazConfiguration savedProject = manager.save(unsavedProject);
		GazConfiguration dbProject = manager.get(GazConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getretentionGoal());
		//End of user code
	}
	private void setterNGetterDroppedFloorFull() throws Exception {
		//Start of user code getter and setter for droppedFloorFull attribute
		GazConfiguration unsavedProject = gazConfigurationBuilder.droppedFloorFull(false).build();
		GazConfiguration savedProject = manager.save(unsavedProject);
		GazConfiguration dbProject = manager.get(GazConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdroppedFloorFull());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		GazConfiguration unsavedProject = gazConfigurationBuilder.id(0L).build();
		GazConfiguration savedProject = manager.save(unsavedProject);
		GazConfiguration dbProject = manager.get(GazConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		GazConfiguration unsavedProject = gazConfigurationBuilder.creationDate(new java.util.Date()).build();
		GazConfiguration savedProject = manager.save(unsavedProject);
		GazConfiguration dbProject = manager.get(GazConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		GazConfiguration unsavedProject = gazConfigurationBuilder.updateDate(new java.util.Date()).build();
		GazConfiguration savedProject = manager.save(unsavedProject);
		GazConfiguration dbProject = manager.get(GazConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		GazConfiguration unsavedProject = gazConfigurationBuilder.version(0).build();
		GazConfiguration savedProject = manager.save(unsavedProject);
		GazConfiguration dbProject = manager.get(GazConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
