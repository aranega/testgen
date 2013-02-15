package com.dooapp.easyInheritance.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.easyInheritance.wrapper.D;

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
	public void refSetterBTest() throws Exception {	
		com.dooapp.easyInheritance.wrapper.B elem1 = new com.dooapp.easyInheritance.wrapper.B();
		D unsavedD =  dBuilder.b(elem1).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD);
		Assert.assertNotNull(dbD.getB());
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
	public void oppositeBTest() throws Exception {
		com.dooapp.easyInheritance.wrapper.B elem1 = new com.dooapp.easyInheritance.wrapper.B();
		D unsavedD =  dBuilder.b(elem1).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD);
		Assert.assertNotNull(dbD.getB().getD());
		Assert.assertEquals(dbD, dbD.getB().getD());
	}
	
	

}
