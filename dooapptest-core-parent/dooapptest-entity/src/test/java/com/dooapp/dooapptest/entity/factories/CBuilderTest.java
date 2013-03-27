package com.dooapp.dooapptest.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;


import com.dooapp.dooapptest.wrapper.C;

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
	
	public void setterNGetterName() throws Exception {
		C unsavedC = cBuilder.name("").build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC.getName());
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
	public void refSetterA2Test() throws Exception {	
		com.dooapp.dooapptest.wrapper.A elem1 = new com.dooapp.dooapptest.wrapper.A();
		C unsavedC =  cBuilder.a2(elem1).build();
		Assert.assertNotNull(unsavedC);
		Assert.assertNotNull(unsavedC.getA2());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeA2Test() throws Exception {
		com.dooapp.dooapptest.wrapper.A elem1 = new com.dooapp.dooapptest.wrapper.A();
		C unsavedC =  cBuilder.a2(elem1).build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC);
		Assert.assertNotNull(dbC.getA2());
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
	
	public void oppositeA2Test() throws Exception {
		com.dooapp.dooapptest.wrapper.A elem1 = new com.dooapp.dooapptest.wrapper.A();
		C unsavedC =  cBuilder.a2(elem1).build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC);
		Assert.assertNotNull(dbC.getA2().getC());
		Assert.assertEquals(dbC, dbC.getA2().getC());
	}
	
	
}
