package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.PersistentImageData;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class PersistentImageDataBuilderTest
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
	private PersistentImageDataBuilder<?> persistentImageDataBuilder;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@BeforeClass
	public static void setupBefore() {
		
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
	
		PersistentImageData unsavedPersistentImageData= persistentImageDataBuilder.build();
		PersistentImageData savedPersistentImageData = manager.save(unsavedPersistentImageData);
		PersistentImageData dbPersistentImageData = manager.get(PersistentImageData.class, savedPersistentImageData.getId());
		Assert.assertNotNull(dbPersistentImageData);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterCreationDate() throws Exception {
	
		PersistentImageData unsavedPersistentImageData = persistentImageDataBuilder.creationDate(new java.util.Date()).build();
		PersistentImageData savedPersistentImageData = manager.save(unsavedPersistentImageData);
		PersistentImageData dbPersistentImageData = manager.get(PersistentImageData.class, savedPersistentImageData.getId());
		Assert.assertNotNull(dbPersistentImageData.getCreationDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterData() throws Exception {
	
		PersistentImageData unsavedPersistentImageData = persistentImageDataBuilder.data("").build();
		PersistentImageData savedPersistentImageData = manager.save(unsavedPersistentImageData);
		PersistentImageData dbPersistentImageData = manager.get(PersistentImageData.class, savedPersistentImageData.getId());
		Assert.assertNotNull(dbPersistentImageData.getData());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterId() throws Exception {
	
		PersistentImageData unsavedPersistentImageData = persistentImageDataBuilder.id(0L).build();
		PersistentImageData savedPersistentImageData = manager.save(unsavedPersistentImageData);
		PersistentImageData dbPersistentImageData = manager.get(PersistentImageData.class, savedPersistentImageData.getId());
		Assert.assertNotNull(dbPersistentImageData.getId());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterUpdateDate() throws Exception {
	
		PersistentImageData unsavedPersistentImageData = persistentImageDataBuilder.updateDate(new java.util.Date()).build();
		PersistentImageData savedPersistentImageData = manager.save(unsavedPersistentImageData);
		PersistentImageData dbPersistentImageData = manager.get(PersistentImageData.class, savedPersistentImageData.getId());
		Assert.assertNotNull(dbPersistentImageData.getUpdateDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterVersion() throws Exception {
	
		PersistentImageData unsavedPersistentImageData = persistentImageDataBuilder.version(0).build();
		PersistentImageData savedPersistentImageData = manager.save(unsavedPersistentImageData);
		PersistentImageData dbPersistentImageData = manager.get(PersistentImageData.class, savedPersistentImageData.getId());
		Assert.assertNotNull(dbPersistentImageData.getVersion());
	}
	
	
	
	/********************
	 * Basic Refs tester
	 ********************/
	
	
	/*****************************
	 * Basic Refs opposite tester
	 *****************************/

	
}
