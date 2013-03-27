package com.dooapp.dooapptest.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;


import com.dooapp.dooapptest.wrapper.E;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class EBuilderTest
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
	private EBuilder<?> eBuilder;
	
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
		com.dooapp.dooapptest.wrapper.D dWrapper = new com.dooapp.dooapptest.wrapper.D();
		eBuilder.d(dWrapper);
		
		E unsavedE= eBuilder.build();
		E savedE = manager.save(unsavedE);
		E dbE = manager.get(E.class, savedE.getId());
		Assert.assertNotNull(dbE);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterHuge() throws Exception {
		com.dooapp.dooapptest.wrapper.D dWrapper = new com.dooapp.dooapptest.wrapper.D();
		eBuilder.d(dWrapper);
		
		E unsavedE = eBuilder.huge(0.0).build();
		E savedE = manager.save(unsavedE);
		E dbE = manager.get(E.class, savedE.getId());
		Assert.assertNotNull(dbE.getHuge());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterId() throws Exception {
		com.dooapp.dooapptest.wrapper.D dWrapper = new com.dooapp.dooapptest.wrapper.D();
		eBuilder.d(dWrapper);
		
		E unsavedE = eBuilder.id(0L).build();
		E savedE = manager.save(unsavedE);
		E dbE = manager.get(E.class, savedE.getId());
		Assert.assertNotNull(dbE.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterCreationDate() throws Exception {
		com.dooapp.dooapptest.wrapper.D dWrapper = new com.dooapp.dooapptest.wrapper.D();
		eBuilder.d(dWrapper);
		
		E unsavedE = eBuilder.creationDate(new java.util.Date()).build();
		E savedE = manager.save(unsavedE);
		E dbE = manager.get(E.class, savedE.getId());
		Assert.assertNotNull(dbE.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterUpdateDate() throws Exception {
		com.dooapp.dooapptest.wrapper.D dWrapper = new com.dooapp.dooapptest.wrapper.D();
		eBuilder.d(dWrapper);
		
		E unsavedE = eBuilder.updateDate(new java.util.Date()).build();
		E savedE = manager.save(unsavedE);
		E dbE = manager.get(E.class, savedE.getId());
		Assert.assertNotNull(dbE.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterVersion() throws Exception {
		com.dooapp.dooapptest.wrapper.D dWrapper = new com.dooapp.dooapptest.wrapper.D();
		eBuilder.d(dWrapper);
		
		E unsavedE = eBuilder.version(0).build();
		E savedE = manager.save(unsavedE);
		E dbE = manager.get(E.class, savedE.getId());
		Assert.assertNotNull(dbE.getVersion());
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
		com.dooapp.dooapptest.wrapper.D elem1 = new com.dooapp.dooapptest.wrapper.D();
		E unsavedE =  eBuilder.d(elem1).build();
		Assert.assertNotNull(unsavedE);
		Assert.assertNotNull(unsavedE.getD());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeDTest() throws Exception {
		com.dooapp.dooapptest.wrapper.D elem1 = new com.dooapp.dooapptest.wrapper.D();
		E unsavedE =  eBuilder.d(elem1).build();
		E savedE = manager.save(unsavedE);
		E dbE = manager.get(E.class, savedE.getId());
		Assert.assertNotNull(dbE);
		Assert.assertNotNull(dbE.getD());
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
		com.dooapp.dooapptest.wrapper.D elem1 = new com.dooapp.dooapptest.wrapper.D();
		E unsavedE =  eBuilder.d(elem1).build();
		E savedE = manager.save(unsavedE);
		E dbE = manager.get(E.class, savedE.getId());
		Assert.assertNotNull(dbE);
		Assert.assertNotNull(dbE.getD().getE());
		Assert.assertEquals(dbE, dbE.getD().getE());
	}
	
	
}
