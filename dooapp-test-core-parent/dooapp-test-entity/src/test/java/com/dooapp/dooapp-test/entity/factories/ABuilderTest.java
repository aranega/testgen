package com.dooapp.dooapp-test.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;


import com.dooapp.dooapp-test.wrapper.A;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class ABuilderTest
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
	private ABuilder<?> aBuilder;
	
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
	
		A unsavedA= aBuilder.build();
		A savedA = manager.save(unsavedA);
		A dbA = manager.get(A.class, savedA.getId());
		Assert.assertNotNull(dbA);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterId() throws Exception {
	
		A unsavedA = aBuilder.id(0L).build();
		A savedA = manager.save(unsavedA);
		A dbA = manager.get(A.class, savedA.getId());
		Assert.assertNotNull(dbA.getId());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterCreationDate() throws Exception {
	
		A unsavedA = aBuilder.creationDate(new java.util.Date()).build();
		A savedA = manager.save(unsavedA);
		A dbA = manager.get(A.class, savedA.getId());
		Assert.assertNotNull(dbA.getCreationDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterUpdateDate() throws Exception {
	
		A unsavedA = aBuilder.updateDate(new java.util.Date()).build();
		A savedA = manager.save(unsavedA);
		A dbA = manager.get(A.class, savedA.getId());
		Assert.assertNotNull(dbA.getUpdateDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterVersion() throws Exception {
	
		A unsavedA = aBuilder.version(0).build();
		A savedA = manager.save(unsavedA);
		A dbA = manager.get(A.class, savedA.getId());
		Assert.assertNotNull(dbA.getVersion());
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
	
		com.dooapp.dooapp-test.wrapper.B elem1 = new com.dooapp.dooapp-test.wrapper.B(); 
		A unsavedA =  aBuilder.b(elem1).build();
		A savedA = manager.save(unsavedA);
		A dbA = manager.get(A.class, savedA.getId());
		Assert.assertNotNull(dbA);
		Assert.assertFalse(dbA.getB().isEmpty());
		Assert.assertEquals(1, dbA.getB().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refAutoSetterSerializeBTest() throws Exception {
	
		A unsavedA =  aBuilder.build();
		A savedA = manager.save(unsavedA);
		A dbA = manager.get(A.class, savedA.getId());
		Assert.assertNotNull(dbA);
		Assert.assertFalse(dbA.getB().isEmpty());
		Assert.assertEquals(1, dbA.getB().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterDTest() throws Exception {	
		
		com.dooapp.dooapp-test.wrapper.D elem1 = new com.dooapp.dooapp-test.wrapper.D(); 
		A unsavedA =  aBuilder.d(elem1).build();
		Assert.assertNotNull(unsavedA);
		Assert.assertNotNull(unsavedA.getD());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refAutoSetterDTest() throws Exception {	
	
		A unsavedA =  aBuilder.build();
		Assert.assertNotNull(unsavedA);
		Assert.assertNotNull(unsavedA.getD());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeDTest() throws Exception {
	
		com.dooapp.dooapp-test.wrapper.D elem1 = new com.dooapp.dooapp-test.wrapper.D(); 
		A unsavedA =  aBuilder.d(elem1).build();
		A savedA = manager.save(unsavedA);
		A dbA = manager.get(A.class, savedA.getId());
		Assert.assertNotNull(dbA);
		Assert.assertNotNull(dbA.getD());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refAutoSetterSerializeDTest() throws Exception {
	
		A unsavedA =  aBuilder.build();
		A savedA = manager.save(unsavedA);
		A dbA = manager.get(A.class, savedA.getId());
		Assert.assertNotNull(dbA);
		Assert.assertNotNull(dbA.getD());
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
	
		com.dooapp.dooapp-test.wrapper.B elem1 = new com.dooapp.dooapp-test.wrapper.B(); 
		A unsavedA =  aBuilder.b(elem1).build();
		A savedA = manager.save(unsavedA);
		A dbA = manager.get(A.class, savedA.getId());
		Assert.assertNotNull(dbA);
		Assert.assertNotNull(dbA.getB().get(0).getA());
		Assert.assertEquals(dbA, dbA.getB().get(0).getA());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void oppositeDTest() throws Exception {
	
		com.dooapp.dooapp-test.wrapper.D elem1 = new com.dooapp.dooapp-test.wrapper.D(); 
		A unsavedA =  aBuilder.d(elem1).build();
		A savedA = manager.save(unsavedA);
		A dbA = manager.get(A.class, savedA.getId());
		Assert.assertNotNull(dbA);
		Assert.assertNotNull(dbA.getD().getA());
		Assert.assertEquals(dbA, dbA.getD().getA());
	}
	
	
}
