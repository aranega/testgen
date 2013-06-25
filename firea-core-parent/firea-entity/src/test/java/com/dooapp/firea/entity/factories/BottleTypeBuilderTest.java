package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.BottleType;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class BottleTypeBuilderTest
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
	private BottleTypeBuilder<?> bottleTypeBuilder;
	
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
	
		BottleType unsavedBottleType= bottleTypeBuilder.build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterCreationDate() throws Exception {
	
		BottleType unsavedBottleType = bottleTypeBuilder.creationDate(new java.util.Date()).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getCreationDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterId() throws Exception {
	
		BottleType unsavedBottleType = bottleTypeBuilder.id(0L).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getId());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterName() throws Exception {
	
		BottleType unsavedBottleType = bottleTypeBuilder.name("").build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getName());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterUpdateDate() throws Exception {
	
		BottleType unsavedBottleType = bottleTypeBuilder.updateDate(new java.util.Date()).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getUpdateDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterVersion() throws Exception {
	
		BottleType unsavedBottleType = bottleTypeBuilder.version(0).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getVersion());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterVolume() throws Exception {
	
		BottleType unsavedBottleType = bottleTypeBuilder.volume(0.0).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getVolume());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterWeight() throws Exception {
	
		BottleType unsavedBottleType = bottleTypeBuilder.weight(0.0).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType.getWeight());
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
	
	public void refSetterBottleconfigurationTest() throws Exception {
	
		com.dooapp.firea.wrapper.BottleConfiguration elem1 = (new com.dooapp.firea.entity.BottleConfigurationBean()).getWrapper(); 
		BottleType unsavedBottleType =  bottleTypeBuilder.bottleconfiguration(elem1).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType);
		Assert.assertFalse(dbBottleType.getBottleconfiguration().isEmpty());
		Assert.assertEquals(1, dbBottleType.getBottleconfiguration().size());
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
	
	public void oppositeBottleconfigurationTest() throws Exception {
	
		com.dooapp.firea.wrapper.BottleConfiguration elem1 = (new com.dooapp.firea.entity.BottleConfigurationBean()).getWrapper(); 
		BottleType unsavedBottleType =  bottleTypeBuilder.bottleconfiguration(elem1).build();
		BottleType savedBottleType = manager.save(unsavedBottleType);
		BottleType dbBottleType = manager.get(BottleType.class, savedBottleType.getId());
		Assert.assertNotNull(dbBottleType);
		Assert.assertNotNull(dbBottleType.getBottleconfiguration().get(0).getBottletype());
		Assert.assertEquals(dbBottleType, dbBottleType.getBottleconfiguration().get(0).getBottletype());
	}
	
	
}
