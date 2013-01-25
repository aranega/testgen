package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

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
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(BottleConfigurationBuilderTest.class).justTryToPersiste();
		//Start of user code main of BottleConfiguration
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		BottleConfiguration unsavedProject = bottleConfigurationBuilder.build();
		BottleConfiguration savedProject = manager.save(unsavedProject);
		BottleConfiguration dbProject = manager.get(BottleConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for BottleConfiguration
		
		//End of user code
	}
	private void setterNGetterLoad() throws Exception {
		//Start of user code getter and setter for load attribute
		BottleConfiguration unsavedProject = bottleConfigurationBuilder.load(0.0).build();
		BottleConfiguration savedProject = manager.save(unsavedProject);
		BottleConfiguration dbProject = manager.get(BottleConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getload());
		//End of user code
	}
	private void setterNGetterUnit() throws Exception {
		//Start of user code getter and setter for unit attribute
		BottleConfiguration unsavedProject = bottleConfigurationBuilder.unit("").build();
		BottleConfiguration savedProject = manager.save(unsavedProject);
		BottleConfiguration dbProject = manager.get(BottleConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getunit());
		//End of user code
	}
	private void setterNGetterQuantity() throws Exception {
		//Start of user code getter and setter for quantity attribute
		BottleConfiguration unsavedProject = bottleConfigurationBuilder.quantity(0).build();
		BottleConfiguration savedProject = manager.save(unsavedProject);
		BottleConfiguration dbProject = manager.get(BottleConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getquantity());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		BottleConfiguration unsavedProject = bottleConfigurationBuilder.id(0L).build();
		BottleConfiguration savedProject = manager.save(unsavedProject);
		BottleConfiguration dbProject = manager.get(BottleConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		BottleConfiguration unsavedProject = bottleConfigurationBuilder.creationDate(new java.util.Date()).build();
		BottleConfiguration savedProject = manager.save(unsavedProject);
		BottleConfiguration dbProject = manager.get(BottleConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		BottleConfiguration unsavedProject = bottleConfigurationBuilder.updateDate(new java.util.Date()).build();
		BottleConfiguration savedProject = manager.save(unsavedProject);
		BottleConfiguration dbProject = manager.get(BottleConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		BottleConfiguration unsavedProject = bottleConfigurationBuilder.version(0).build();
		BottleConfiguration savedProject = manager.save(unsavedProject);
		BottleConfiguration dbProject = manager.get(BottleConfiguration.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
