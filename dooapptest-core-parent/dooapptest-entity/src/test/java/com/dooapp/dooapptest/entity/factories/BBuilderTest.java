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
	public void refSetterCTest() throws Exception {	
		
		com.dooapp.dooapptest.wrapper.C elem1 = new com.dooapp.dooapptest.wrapper.C(); 
		B unsavedB =  bBuilder.c(elem1).build();
		Assert.assertNotNull(unsavedB);
		Assert.assertNotNull(unsavedB.getC());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refAutoSetterCTest() throws Exception {	
	
		B unsavedB =  bBuilder.build();
		Assert.assertNotNull(unsavedB);
		Assert.assertNotNull(unsavedB.getC());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeCTest() throws Exception {
	
		com.dooapp.dooapptest.wrapper.C elem1 = new com.dooapp.dooapptest.wrapper.C(); 
		B unsavedB =  bBuilder.c(elem1).build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB);
		Assert.assertNotNull(dbB.getC());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refAutoSetterSerializeCTest() throws Exception {
	
		B unsavedB =  bBuilder.build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB);
		Assert.assertNotNull(dbB.getC());
	}
	
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
	
	
	
	/*****************************
	 * Basic Refs opposite tester
	 *****************************/

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void oppositeCTest() throws Exception {
	
		com.dooapp.dooapptest.wrapper.C elem1 = new com.dooapp.dooapptest.wrapper.C(); 
		B unsavedB =  bBuilder.c(elem1).build();
		B savedB = manager.save(unsavedB);
		B dbB = manager.get(B.class, savedB.getId());
		Assert.assertNotNull(dbB);
		Assert.assertNotNull(dbB.getC().getB());
		Assert.assertEquals(dbB, dbB.getC().getB());
	}
	
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
	
	
}
