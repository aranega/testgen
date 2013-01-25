package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

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
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(BottleTypeBuilderTest.class).justTryToPersiste();
		//Start of user code main of BottleType
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		BottleType unsavedProject = bottleTypeBuilder.build();
		BottleType savedProject = manager.save(unsavedProject);
		BottleType dbProject = manager.get(BottleType.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for BottleType
		
		//End of user code
	}
	private void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		BottleType unsavedProject = bottleTypeBuilder.name("").build();
		BottleType savedProject = manager.save(unsavedProject);
		BottleType dbProject = manager.get(BottleType.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getname());
		//End of user code
	}
	private void setterNGetterWeight() throws Exception {
		//Start of user code getter and setter for weight attribute
		BottleType unsavedProject = bottleTypeBuilder.weight(0.0).build();
		BottleType savedProject = manager.save(unsavedProject);
		BottleType dbProject = manager.get(BottleType.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getweight());
		//End of user code
	}
	private void setterNGetterVolume() throws Exception {
		//Start of user code getter and setter for volume attribute
		BottleType unsavedProject = bottleTypeBuilder.volume(0.0).build();
		BottleType savedProject = manager.save(unsavedProject);
		BottleType dbProject = manager.get(BottleType.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getvolume());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		BottleType unsavedProject = bottleTypeBuilder.id(0L).build();
		BottleType savedProject = manager.save(unsavedProject);
		BottleType dbProject = manager.get(BottleType.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		BottleType unsavedProject = bottleTypeBuilder.creationDate(new java.util.Date()).build();
		BottleType savedProject = manager.save(unsavedProject);
		BottleType dbProject = manager.get(BottleType.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		BottleType unsavedProject = bottleTypeBuilder.updateDate(new java.util.Date()).build();
		BottleType savedProject = manager.save(unsavedProject);
		BottleType dbProject = manager.get(BottleType.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		BottleType unsavedProject = bottleTypeBuilder.version(0).build();
		BottleType savedProject = manager.save(unsavedProject);
		BottleType dbProject = manager.get(BottleType.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
