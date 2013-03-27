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
	
	public void setterNGetterIsOk() throws Exception {
		D unsavedD = dBuilder.isOk(false).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD.isIsOk());
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
		com.dooapp.dooapptest.wrapper.B elem1 = new com.dooapp.dooapptest.wrapper.B();
		D unsavedD =  dBuilder.b(elem1).build();
		Assert.assertNotNull(unsavedD);
		Assert.assertNotNull(unsavedD.getB());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeBTest() throws Exception {
		com.dooapp.dooapptest.wrapper.B elem1 = new com.dooapp.dooapptest.wrapper.B();
		D unsavedD =  dBuilder.b(elem1).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD);
		Assert.assertNotNull(dbD.getB());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterETest() throws Exception {	
		com.dooapp.dooapptest.wrapper.E elem1 = new com.dooapp.dooapptest.wrapper.E();
		D unsavedD =  dBuilder.e(elem1).build();
		Assert.assertNotNull(unsavedD);
		Assert.assertNotNull(unsavedD.getE());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeETest() throws Exception {
		com.dooapp.dooapptest.wrapper.E elem1 = new com.dooapp.dooapptest.wrapper.E();
		D unsavedD =  dBuilder.e(elem1).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD);
		Assert.assertNotNull(dbD.getE());
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
		com.dooapp.dooapptest.wrapper.B elem1 = new com.dooapp.dooapptest.wrapper.B();
		D unsavedD =  dBuilder.b(elem1).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD);
		Assert.assertNotNull(dbD.getB().getD());
		Assert.assertEquals(dbD, dbD.getB().getD());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void oppositeETest() throws Exception {
		com.dooapp.dooapptest.wrapper.E elem1 = new com.dooapp.dooapptest.wrapper.E();
		D unsavedD =  dBuilder.e(elem1).build();
		D savedD = manager.save(unsavedD);
		D dbD = manager.get(D.class, savedD.getId());
		Assert.assertNotNull(dbD);
		Assert.assertNotNull(dbD.getE().getD());
		Assert.assertEquals(dbD, dbD.getE().getD());
	}
	
	
}
