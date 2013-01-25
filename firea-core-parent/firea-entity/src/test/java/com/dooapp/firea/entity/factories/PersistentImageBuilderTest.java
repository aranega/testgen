package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.PersistentImageBuilder;
import com.dooapp.firea.wrapper.PersistentImage;

/*
 * Test Class
 * <!-- Start of user code comment for PersistentImage Test Class
 * End of user code -->
 */


public class PersistentImageBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private PersistentImageBuilder<?> persistentImageBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(PersistentImageBuilderTest.class).justTryToPersiste();
		//Start of user code main of PersistentImage
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		PersistentImage unsavedProject = persistentImageBuilder.build();
		PersistentImage savedProject = manager.save(unsavedProject);
		PersistentImage dbProject = manager.get(PersistentImage.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for PersistentImage
		
		//End of user code
	}
	private void setterNGetterDataId() throws Exception {
		//Start of user code getter and setter for dataId attribute
		PersistentImage unsavedProject = persistentImageBuilder.dataId("").build();
		PersistentImage savedProject = manager.save(unsavedProject);
		PersistentImage dbProject = manager.get(PersistentImage.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdataId());
		//End of user code
	}
	private void setterNGetterPreview() throws Exception {
		//Start of user code getter and setter for preview attribute
		PersistentImage unsavedProject = persistentImageBuilder.preview("").build();
		PersistentImage savedProject = manager.save(unsavedProject);
		PersistentImage dbProject = manager.get(PersistentImage.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getpreview());
		//End of user code
	}
	private void setterNGetterSourceFile() throws Exception {
		//Start of user code getter and setter for sourceFile attribute
		PersistentImage unsavedProject = persistentImageBuilder.sourceFile("").build();
		PersistentImage savedProject = manager.save(unsavedProject);
		PersistentImage dbProject = manager.get(PersistentImage.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getsourceFile());
		//End of user code
	}
	private void setterNGetterTitle() throws Exception {
		//Start of user code getter and setter for title attribute
		PersistentImage unsavedProject = persistentImageBuilder.title("").build();
		PersistentImage savedProject = manager.save(unsavedProject);
		PersistentImage dbProject = manager.get(PersistentImage.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.gettitle());
		//End of user code
	}
	private void setterNGetterError() throws Exception {
		//Start of user code getter and setter for error attribute
		PersistentImage unsavedProject = persistentImageBuilder.error(false).build();
		PersistentImage savedProject = manager.save(unsavedProject);
		PersistentImage dbProject = manager.get(PersistentImage.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.geterror());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		PersistentImage unsavedProject = persistentImageBuilder.id(0L).build();
		PersistentImage savedProject = manager.save(unsavedProject);
		PersistentImage dbProject = manager.get(PersistentImage.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		PersistentImage unsavedProject = persistentImageBuilder.creationDate(new java.util.Date()).build();
		PersistentImage savedProject = manager.save(unsavedProject);
		PersistentImage dbProject = manager.get(PersistentImage.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		PersistentImage unsavedProject = persistentImageBuilder.updateDate(new java.util.Date()).build();
		PersistentImage savedProject = manager.save(unsavedProject);
		PersistentImage dbProject = manager.get(PersistentImage.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		PersistentImage unsavedProject = persistentImageBuilder.version(0).build();
		PersistentImage savedProject = manager.save(unsavedProject);
		PersistentImage dbProject = manager.get(PersistentImage.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
