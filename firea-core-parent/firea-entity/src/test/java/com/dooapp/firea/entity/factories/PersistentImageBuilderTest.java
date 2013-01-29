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
		IOC.getInjector().getInstance(PersistentImageBuilderTest.class).justTryToPersiste();
		//Start of user code main of PersistentImage
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		PersistentImage unsavedPersistentImage= persistentImageBuilder.build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage);
		//Start of user code try to persist for PersistentImage
		
		//End of user code
	}
	@Test
	public void setterNGetterTitle() throws Exception {
		//Start of user code getter and setter for title attribute
		PersistentImage unsavedPersistentImage = persistentImageBuilder.title("").build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getTitle());
		//End of user code
	}
	@Test
	public void setterNGetterDataId() throws Exception {
		//Start of user code getter and setter for dataId attribute
		PersistentImage unsavedPersistentImage = persistentImageBuilder.dataId("").build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getDataId());
		//End of user code
	}
	@Test
	public void setterNGetterError() throws Exception {
		//Start of user code getter and setter for error attribute
		PersistentImage unsavedPersistentImage = persistentImageBuilder.error(false).build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.isError());
		//End of user code
	}
	@Test
	public void setterNGetterSourceFile() throws Exception {
		//Start of user code getter and setter for sourceFile attribute
		PersistentImage unsavedPersistentImage = persistentImageBuilder.sourceFile("").build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getSourceFile());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		PersistentImage unsavedPersistentImage = persistentImageBuilder.id(0L).build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		PersistentImage unsavedPersistentImage = persistentImageBuilder.creationDate(new java.util.Date()).build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		PersistentImage unsavedPersistentImage = persistentImageBuilder.updateDate(new java.util.Date()).build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		PersistentImage unsavedPersistentImage = persistentImageBuilder.version(0).build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getVersion());
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
