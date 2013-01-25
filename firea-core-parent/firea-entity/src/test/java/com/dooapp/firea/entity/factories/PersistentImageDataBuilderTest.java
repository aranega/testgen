package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.PersistentImageDataBuilder;
import com.dooapp.firea.wrapper.PersistentImageData;

/*
 * Test Class
 * <!-- Start of user code comment for PersistentImageData Test Class
 * End of user code -->
 */


public class PersistentImageDataBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private PersistentImageDataBuilder<?> persistentImageDataBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(PersistentImageDataBuilderTest.class).justTryToPersiste();
		//Start of user code main of PersistentImageData
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		PersistentImageData unsavedProject = persistentImageDataBuilder.build();
		PersistentImageData savedProject = manager.save(unsavedProject);
		PersistentImageData dbProject = manager.get(PersistentImageData.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for PersistentImageData
		
		//End of user code
	}
	private void setterNGetterData() throws Exception {
		//Start of user code getter and setter for data attribute
		PersistentImageData unsavedProject = persistentImageDataBuilder.data("").build();
		PersistentImageData savedProject = manager.save(unsavedProject);
		PersistentImageData dbProject = manager.get(PersistentImageData.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdata());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		PersistentImageData unsavedProject = persistentImageDataBuilder.id(0L).build();
		PersistentImageData savedProject = manager.save(unsavedProject);
		PersistentImageData dbProject = manager.get(PersistentImageData.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		PersistentImageData unsavedProject = persistentImageDataBuilder.creationDate(new java.util.Date()).build();
		PersistentImageData savedProject = manager.save(unsavedProject);
		PersistentImageData dbProject = manager.get(PersistentImageData.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		PersistentImageData unsavedProject = persistentImageDataBuilder.updateDate(new java.util.Date()).build();
		PersistentImageData savedProject = manager.save(unsavedProject);
		PersistentImageData dbProject = manager.get(PersistentImageData.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		PersistentImageData unsavedProject = persistentImageDataBuilder.version(0).build();
		PersistentImageData savedProject = manager.save(unsavedProject);
		PersistentImageData dbProject = manager.get(PersistentImageData.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
