package com.dooapp.easyInheritance.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.easyInheritance.wrapper.C;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class CBuilderTest
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
	private CBuilder<?> cBuilder;
	
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
		C unsavedC= cBuilder.build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterAttribute() throws Exception {
		C unsavedC = cBuilder.attribute("").build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC.getAttribute());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterAttribute2() throws Exception {
		C unsavedC = cBuilder.attribute2("").build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC.getAttribute2());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		C unsavedC = cBuilder.id(0L).build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		C unsavedC = cBuilder.creationDate(new java.util.Date()).build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		C unsavedC = cBuilder.updateDate(new java.util.Date()).build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		C unsavedC = cBuilder.version(0).build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC.getVersion());
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
		C unsavedC =  cBuilder.d(elem1).build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC);
		Assert.assertNotNull(dbC.getD());
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
		C unsavedC =  cBuilder.d(elem1).build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC);
		Assert.assertNotNull(dbC.getD().getB());
		Assert.assertEquals(dbC, dbC.getD().getB());
	}
	
	

}
