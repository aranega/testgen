package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.FolderBuilder;
import com.dooapp.firea.wrapper.Folder;

/*
 * Test Class
 * <!-- Start of user code comment for Folder Test Class
 * End of user code -->
 */


public class FolderBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private FolderBuilder<?> folderBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(FolderBuilderTest.class).justTryToPersiste();
		//Start of user code main of Folder
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		Folder unsavedProject = folderBuilder.build();
		Folder savedProject = manager.save(unsavedProject);
		Folder dbProject = manager.get(Folder.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for Folder
		
		//End of user code
	}
	private void setterNGetterDisplayOrder() throws Exception {
		//Start of user code getter and setter for displayOrder attribute
		Folder unsavedProject = folderBuilder.displayOrder(0).build();
		Folder savedProject = manager.save(unsavedProject);
		Folder dbProject = manager.get(Folder.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdisplayOrder());
		//End of user code
	}
	private void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		Folder unsavedProject = folderBuilder.name("").build();
		Folder savedProject = manager.save(unsavedProject);
		Folder dbProject = manager.get(Folder.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getname());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Folder unsavedProject = folderBuilder.id(0L).build();
		Folder savedProject = manager.save(unsavedProject);
		Folder dbProject = manager.get(Folder.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Folder unsavedProject = folderBuilder.creationDate(new java.util.Date()).build();
		Folder savedProject = manager.save(unsavedProject);
		Folder dbProject = manager.get(Folder.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Folder unsavedProject = folderBuilder.updateDate(new java.util.Date()).build();
		Folder savedProject = manager.save(unsavedProject);
		Folder dbProject = manager.get(Folder.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Folder unsavedProject = folderBuilder.version(0).build();
		Folder savedProject = manager.save(unsavedProject);
		Folder dbProject = manager.get(Folder.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
