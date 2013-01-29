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
		IOC.getInjector().getInstance(FolderBuilderTest.class).justTryToPersiste();
		//Start of user code main of Folder
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Folder unsavedFolder= folderBuilder.build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder);
		//Start of user code try to persist for Folder
		
		//End of user code
	}
	@Test
	public void setterNGetterDisplayOrder() throws Exception {
		//Start of user code getter and setter for displayOrder attribute
		Folder unsavedFolder = folderBuilder.displayOrder(0).build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder.getDisplayOrder());
		//End of user code
	}
	@Test
	public void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		Folder unsavedFolder = folderBuilder.name("").build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder.getName());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Folder unsavedFolder = folderBuilder.id(0L).build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Folder unsavedFolder = folderBuilder.creationDate(new java.util.Date()).build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Folder unsavedFolder = folderBuilder.updateDate(new java.util.Date()).build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Folder unsavedFolder = folderBuilder.version(0).build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
		
	/*
	 * Basic Refs opposite tester
	 */
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
