package com.dooapp.dooapptest.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;


import com.dooapp.dooapptest.wrapper.D;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class DBuilderTest
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
	private DBuilder<?> dBuilder;
	
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
	
		D unsavedD= dBuilder.build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterId() throws Exception {
	
		D unsavedD = dBuilder.id(0L).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD.getId());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterCreationDate() throws Exception {
	
		D unsavedD = dBuilder.creationDate(new java.util.Date()).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD.getCreationDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterUpdateDate() throws Exception {
	
		D unsavedD = dBuilder.updateDate(new java.util.Date()).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD.getUpdateDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterVersion() throws Exception {
	
		D unsavedD = dBuilder.version(0).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD.getVersion());
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
		D unsavedD =  dBuilder.a(elem1).build();
		Assert.assertNotNull(unsavedD);
		Assert.assertNotNull(unsavedD.getA());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeATest() throws Exception {
	
		com.dooapp.dooapptest.wrapper.A elem1 = new com.dooapp.dooapptest.wrapper.A(); 
		D unsavedD =  dBuilder.a(elem1).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD);
		Assert.assertNotNull(dbD.getA());
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
		D unsavedD =  dBuilder.a(elem1).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD);
		Assert.assertNotNull(dbD.getA().getD());
		Assert.assertEquals(dbD, dbD.getA().getD());
	}
	
	
}
