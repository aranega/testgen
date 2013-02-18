package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.PersistentImage;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class PersistentImageBuilderTest
{	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	private EntityManager manager;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	private PersistentImageBuilder<?> persistentImageBuilder;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@BeforeClass
	public void setupBefore() {
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Before
	public void setup() {
		/*	System.setProperty("WORKSPACE", "target");
			System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
			System.setProperty("hibernate.connection.username", "sa");
			System.setProperty("hibernate.connection.password", "");
		*/
		IOC.getInjector().injectMembers(this);
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void justTryToPersiste() throws Exception {
		PersistentImage unsavedPersistentImage= persistentImageBuilder.build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterTitle() throws Exception {
		PersistentImage unsavedPersistentImage = persistentImageBuilder.title("").build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getTitle());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDataId() throws Exception {
		PersistentImage unsavedPersistentImage = persistentImageBuilder.dataId("").build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getDataId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterPreview() throws Exception {
		PersistentImage unsavedPersistentImage = persistentImageBuilder.preview("").build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getPreview());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterSourceFile() throws Exception {
		PersistentImage unsavedPersistentImage = persistentImageBuilder.sourceFile("").build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getSourceFile());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterError() throws Exception {
		PersistentImage unsavedPersistentImage = persistentImageBuilder.error(false).build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.isError());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		PersistentImage unsavedPersistentImage = persistentImageBuilder.id(0L).build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		PersistentImage unsavedPersistentImage = persistentImageBuilder.creationDate(new java.util.Date()).build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		PersistentImage unsavedPersistentImage = persistentImageBuilder.updateDate(new java.util.Date()).build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		PersistentImage unsavedPersistentImage = persistentImageBuilder.version(0).build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage.getVersion());
	}
	
	
	/********************
	 * Basic Refs tester
	 ********************/

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterContactTest() throws Exception {	
		com.dooapp.firea.wrapper.Contact elem1 = new com.dooapp.firea.wrapper.Contact();
		PersistentImage unsavedPersistentImage =  persistentImageBuilder.contact(elem1).build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage);
		Assert.assertNotNull(dbPersistentImage.getContact());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterContactClassicTest() throws Exception {
		PersistentImage unsavedPersistentImage =  persistentImageBuilder.build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage);
		Assert.assertNotNull(dbPersistentImage.getContact());
	}
	
	

	/*****************************
	 * Basic Refs opposite tester
	 *****************************/

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeContactTest() throws Exception {
		com.dooapp.firea.wrapper.Contact elem1 = new com.dooapp.firea.wrapper.Contact();
		PersistentImage unsavedPersistentImage =  persistentImageBuilder.contact(elem1).build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage);
		Assert.assertNotNull(dbPersistentImage.getContact().getImage());
		Assert.assertEquals(dbPersistentImage, dbPersistentImage.getContact().getImage());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeContactClassicTest() throws Exception {
		PersistentImage unsavedPersistentImage =  persistentImageBuilder.build();
		PersistentImage savedPersistentImage = manager.save(unsavedPersistentImage);
		PersistentImage dbPersistentImage = manager.get(PersistentImage.class, savedPersistentImage.getId());
		Assert.assertNotNull(dbPersistentImage);
		Assert.assertNotNull(dbPersistentImage.getContact().getImage());
		Assert.assertEquals(dbPersistentImage, dbPersistentImage.getContact().getImage());
	}
	
	

}
