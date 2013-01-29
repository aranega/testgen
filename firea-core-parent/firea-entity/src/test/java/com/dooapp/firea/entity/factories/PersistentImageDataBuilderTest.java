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
		IOC.getInjector().getInstance(PersistentImageDataBuilderTest.class).justTryToPersiste();
		//Start of user code main of PersistentImageData
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		PersistentImageData unsavedPersistentImageData= persistentImageDataBuilder.build();
		PersistentImageData savedPersistentImageData = manager.save(unsavedPersistentImageData);
		PersistentImageData dbPersistentImageData = manager.get(PersistentImageData.class, savedPersistentImageData.getId());
		Assert.assertNotNull(dbPersistentImageData);
		//Start of user code try to persist for PersistentImageData
		
		//End of user code
	}
	@Test
	public void setterNGetterData() throws Exception {
		//Start of user code getter and setter for data attribute
		PersistentImageData unsavedPersistentImageData = persistentImageDataBuilder.data("").build();
		PersistentImageData savedPersistentImageData = manager.save(unsavedPersistentImageData);
		PersistentImageData dbPersistentImageData = manager.get(PersistentImageData.class, savedPersistentImageData.getId());
		Assert.assertNotNull(dbPersistentImageData.getData());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		PersistentImageData unsavedPersistentImageData = persistentImageDataBuilder.id(0L).build();
		PersistentImageData savedPersistentImageData = manager.save(unsavedPersistentImageData);
		PersistentImageData dbPersistentImageData = manager.get(PersistentImageData.class, savedPersistentImageData.getId());
		Assert.assertNotNull(dbPersistentImageData.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		PersistentImageData unsavedPersistentImageData = persistentImageDataBuilder.creationDate(new java.util.Date()).build();
		PersistentImageData savedPersistentImageData = manager.save(unsavedPersistentImageData);
		PersistentImageData dbPersistentImageData = manager.get(PersistentImageData.class, savedPersistentImageData.getId());
		Assert.assertNotNull(dbPersistentImageData.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		PersistentImageData unsavedPersistentImageData = persistentImageDataBuilder.updateDate(new java.util.Date()).build();
		PersistentImageData savedPersistentImageData = manager.save(unsavedPersistentImageData);
		PersistentImageData dbPersistentImageData = manager.get(PersistentImageData.class, savedPersistentImageData.getId());
		Assert.assertNotNull(dbPersistentImageData.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		PersistentImageData unsavedPersistentImageData = persistentImageDataBuilder.version(0).build();
		PersistentImageData savedPersistentImageData = manager.save(unsavedPersistentImageData);
		PersistentImageData dbPersistentImageData = manager.get(PersistentImageData.class, savedPersistentImageData.getId());
		Assert.assertNotNull(dbPersistentImageData.getVersion());
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
