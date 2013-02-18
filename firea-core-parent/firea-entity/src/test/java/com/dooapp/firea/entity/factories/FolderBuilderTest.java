package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.Folder;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class FolderBuilderTest
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
	private FolderBuilder<?> folderBuilder;
	
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
		Folder unsavedFolder= folderBuilder.build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDisplayOrder() throws Exception {
		Folder unsavedFolder = folderBuilder.displayOrder(0).build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder.getDisplayOrder());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterName() throws Exception {
		Folder unsavedFolder = folderBuilder.name("").build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder.getName());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		Folder unsavedFolder = folderBuilder.id(0L).build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		Folder unsavedFolder = folderBuilder.creationDate(new java.util.Date()).build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		Folder unsavedFolder = folderBuilder.updateDate(new java.util.Date()).build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		Folder unsavedFolder = folderBuilder.version(0).build();
		Folder savedFolder = manager.save(unsavedFolder);
		Folder dbFolder = manager.get(Folder.class, savedFolder.getId());
		Assert.assertNotNull(dbFolder.getVersion());
	}
	
	
	/********************
	 * Basic Refs tester
	 ********************/

	

	/*****************************
	 * Basic Refs opposite tester
	 *****************************/

	

}
