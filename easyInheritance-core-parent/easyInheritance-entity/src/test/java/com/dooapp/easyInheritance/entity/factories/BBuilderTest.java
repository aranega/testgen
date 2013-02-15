package com.dooapp.easyInheritance.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.easyInheritance.wrapper.B;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class BBuilderTest
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
	private BBuilder<?> bBuilder;
	
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
		B unsavedB= bBuilder.build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterAttribute() throws Exception {
		B unsavedB = bBuilder.attribute("").build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB.getAttribute());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterAttribute2() throws Exception {
		B unsavedB = bBuilder.attribute2("").build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB.getAttribute2());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		B unsavedB = bBuilder.id(0L).build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		B unsavedB = bBuilder.creationDate(new java.util.Date()).build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		B unsavedB = bBuilder.updateDate(new java.util.Date()).build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		B unsavedB = bBuilder.version(0).build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB.getVersion());
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
	public void refSetterDTest() throws Exception {	
		com.dooapp.easyInheritance.wrapper.D elem1 = new com.dooapp.easyInheritance.wrapper.D();
		B unsavedB =  bBuilder.d(elem1).build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB);
		Assert.assertNotNull(dbB.getD());
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
	public void oppositeDTest() throws Exception {
		com.dooapp.easyInheritance.wrapper.D elem1 = new com.dooapp.easyInheritance.wrapper.D();
		B unsavedB =  bBuilder.d(elem1).build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB);
		Assert.assertNotNull(dbB.getD().getB());
		Assert.assertEquals(dbB, dbB.getD().getB());
	}
	
	

}
