package com.dooapp.dooapp-test.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;


import com.dooapp.dooapp-test.wrapper.C;

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
		com.dooapp.dooapp-test.wrapper.E eWrapper = new com.dooapp.dooapp-test.wrapper.E();
		cBuilder.e(eWrapper);
		
	
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
	
	public void setterNGetterId() throws Exception {
		com.dooapp.dooapp-test.wrapper.E eWrapper = new com.dooapp.dooapp-test.wrapper.E();
		cBuilder.e(eWrapper);
		
	
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
		com.dooapp.dooapp-test.wrapper.E eWrapper = new com.dooapp.dooapp-test.wrapper.E();
		cBuilder.e(eWrapper);
		
	
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
		com.dooapp.dooapp-test.wrapper.E eWrapper = new com.dooapp.dooapp-test.wrapper.E();
		cBuilder.e(eWrapper);
		
	
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
		com.dooapp.dooapp-test.wrapper.E eWrapper = new com.dooapp.dooapp-test.wrapper.E();
		cBuilder.e(eWrapper);
		
	
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
	public void refSetterBTest() throws Exception {	
		com.dooapp.dooapp-test.wrapper.E eWrapper = new com.dooapp.dooapp-test.wrapper.E();
		cBuilder.e(eWrapper);
		
		
		com.dooapp.dooapp-test.wrapper.B elem1 = new com.dooapp.dooapp-test.wrapper.B(); 
		C unsavedC =  cBuilder.b(elem1).build();
		Assert.assertNotNull(unsavedC);
		Assert.assertNotNull(unsavedC.getB());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeBTest() throws Exception {
		com.dooapp.dooapp-test.wrapper.E eWrapper = new com.dooapp.dooapp-test.wrapper.E();
		cBuilder.e(eWrapper);
		
	
		com.dooapp.dooapp-test.wrapper.B elem1 = new com.dooapp.dooapp-test.wrapper.B(); 
		C unsavedC =  cBuilder.b(elem1).build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC);
		Assert.assertNotNull(dbC.getB());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterETest() throws Exception {	
		
		com.dooapp.dooapp-test.wrapper.E elem1 = new com.dooapp.dooapp-test.wrapper.E(); 
		C unsavedC =  cBuilder.e(elem1).build();
		Assert.assertNotNull(unsavedC);
		Assert.assertNotNull(unsavedC.getE());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeETest() throws Exception {
	
		com.dooapp.dooapp-test.wrapper.E elem1 = new com.dooapp.dooapp-test.wrapper.E(); 
		C unsavedC =  cBuilder.e(elem1).build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC);
		Assert.assertNotNull(dbC.getE());
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
		com.dooapp.dooapp-test.wrapper.E eWrapper = new com.dooapp.dooapp-test.wrapper.E();
		cBuilder.e(eWrapper);
		
	
		com.dooapp.dooapp-test.wrapper.B elem1 = new com.dooapp.dooapp-test.wrapper.B(); 
		C unsavedC =  cBuilder.b(elem1).build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC);
		Assert.assertNotNull(dbC.getB().getC());
		Assert.assertEquals(dbC, dbC.getB().getC());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void oppositeETest() throws Exception {
	
		com.dooapp.dooapp-test.wrapper.E elem1 = new com.dooapp.dooapp-test.wrapper.E(); 
		C unsavedC =  cBuilder.e(elem1).build();
		C savedC = manager.save(unsavedC);
		C dbC = manager.get(C.class, savedC.getId());
		Assert.assertNotNull(dbC);
		Assert.assertNotNull(dbC.getE().getC());
		Assert.assertEquals(dbC, dbC.getE().getC());
	}
	
	
}
