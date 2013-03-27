package com.dooapp.dooapptest.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;


import com.dooapp.dooapptest.wrapper.B;

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
	
	public void setterNGetterMyAtt() throws Exception {
		B unsavedB = bBuilder.myAtt("").build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB.getMyAtt());
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
	public void refSetterATest() throws Exception {	
		com.dooapp.dooapptest.wrapper.A elem1 = new com.dooapp.dooapptest.wrapper.A();
		B unsavedB =  bBuilder.a(elem1).build();
		Assert.assertNotNull(unsavedB);
		Assert.assertNotNull(unsavedB.getA());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeATest() throws Exception {
		com.dooapp.dooapptest.wrapper.A elem1 = new com.dooapp.dooapptest.wrapper.A();
		B unsavedB =  bBuilder.a(elem1).build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB);
		Assert.assertNotNull(dbB.getA());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterDTest() throws Exception {	
		com.dooapp.dooapptest.wrapper.D elem1 = new com.dooapp.dooapptest.wrapper.D();
		B unsavedB =  bBuilder.d(elem1).build();
		Assert.assertNotNull(unsavedB);
		Assert.assertNotNull(unsavedB.getD());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refAutoSetterDTest() throws Exception {	
		B unsavedB =  bBuilder.build();
		Assert.assertNotNull(unsavedB);
		Assert.assertNotNull(unsavedB.getD());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeDTest() throws Exception {
		com.dooapp.dooapptest.wrapper.D elem1 = new com.dooapp.dooapptest.wrapper.D();
		B unsavedB =  bBuilder.d(elem1).build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB);
		Assert.assertNotNull(dbB.getD());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refAutoSetterSerializeDTest() throws Exception {
		B unsavedB =  bBuilder.build();
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
	
	public void oppositeATest() throws Exception {
		com.dooapp.dooapptest.wrapper.A elem1 = new com.dooapp.dooapptest.wrapper.A();
		B unsavedB =  bBuilder.a(elem1).build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB);
		Assert.assertFalse(dbB.getA().getB().isEmpty());
		Assert.assertTrue(dbB.getA().getB().contains(dbB));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void oppositeDTest() throws Exception {
		com.dooapp.dooapptest.wrapper.D elem1 = new com.dooapp.dooapptest.wrapper.D();
		B unsavedB =  bBuilder.d(elem1).build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB);
		Assert.assertNotNull(dbB.getD().getB());
		Assert.assertEquals(dbB, dbB.getD().getB());
	}
	
	
}
