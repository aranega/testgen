package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.firea.entity.PressureType;

import com.dooapp.firea.wrapper.BlowHoleConfiguration;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class BlowHoleConfigurationBuilderTest
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
	private BlowHoleConfigurationBuilder<?> blowHoleConfigurationBuilder;
	
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
		BlowHoleConfiguration unsavedBlowHoleConfiguration= blowHoleConfigurationBuilder.build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterReferencePressure() throws Exception {
		BlowHoleConfiguration unsavedBlowHoleConfiguration = blowHoleConfigurationBuilder.referencePressure(0.0).build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration.getReferencePressure());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterReferencePressureType() throws Exception {
		BlowHoleConfiguration unsavedBlowHoleConfiguration = blowHoleConfigurationBuilder.referencePressureType(PressureType.STANDARD).build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration.getReferencePressureType());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterBlowHoleSafetyFactor() throws Exception {
		BlowHoleConfiguration unsavedBlowHoleConfiguration = blowHoleConfigurationBuilder.blowHoleSafetyFactor(0.0).build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration.getBlowHoleSafetyFactor());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterReferencePressureJustification() throws Exception {
		BlowHoleConfiguration unsavedBlowHoleConfiguration = blowHoleConfigurationBuilder.referencePressureJustification("").build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration.getReferencePressureJustification());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterElaIncluded() throws Exception {
		BlowHoleConfiguration unsavedBlowHoleConfiguration = blowHoleConfigurationBuilder.elaIncluded(false).build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration.isElaIncluded());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		BlowHoleConfiguration unsavedBlowHoleConfiguration = blowHoleConfigurationBuilder.id(0L).build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		BlowHoleConfiguration unsavedBlowHoleConfiguration = blowHoleConfigurationBuilder.creationDate(new java.util.Date()).build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		BlowHoleConfiguration unsavedBlowHoleConfiguration = blowHoleConfigurationBuilder.updateDate(new java.util.Date()).build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		BlowHoleConfiguration unsavedBlowHoleConfiguration = blowHoleConfigurationBuilder.version(0).build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration.getVersion());
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
	public void refSetterBlowholeTest() throws Exception {
		com.dooapp.firea.wrapper.BlowHole elem1 = new com.dooapp.firea.wrapper.BlowHole();
		BlowHoleConfiguration unsavedBlowHoleConfiguration =  blowHoleConfigurationBuilder.blowhole(elem1).build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration);
		Assert.assertFalse(dbBlowHoleConfiguration.getBlowhole().isEmpty());
		Assert.assertEquals(1, dbBlowHoleConfiguration.getBlowhole().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterTestedroomTest() throws Exception {	
		com.dooapp.firea.wrapper.TestedRoom elem1 = new com.dooapp.firea.wrapper.TestedRoom();
		BlowHoleConfiguration unsavedBlowHoleConfiguration =  blowHoleConfigurationBuilder.testedroom(elem1).build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration);
		Assert.assertNotNull(dbBlowHoleConfiguration.getTestedroom());
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
	public void oppositeBlowholeTest() throws Exception {
		com.dooapp.firea.wrapper.BlowHole elem1 = new com.dooapp.firea.wrapper.BlowHole();
		BlowHoleConfiguration unsavedBlowHoleConfiguration =  blowHoleConfigurationBuilder.blowhole(elem1).build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration);
		Assert.assertNotNull(dbBlowHoleConfiguration.getBlowhole().get(0).getBlowholeconfiguration());
		Assert.assertEquals(dbBlowHoleConfiguration, dbBlowHoleConfiguration.getBlowhole().get(0).getBlowholeconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeTestedroomTest() throws Exception {
		com.dooapp.firea.wrapper.TestedRoom elem1 = new com.dooapp.firea.wrapper.TestedRoom();
		BlowHoleConfiguration unsavedBlowHoleConfiguration =  blowHoleConfigurationBuilder.testedroom(elem1).build();
		BlowHoleConfiguration savedBlowHoleConfiguration = manager.save(unsavedBlowHoleConfiguration);
		BlowHoleConfiguration dbBlowHoleConfiguration = manager.get(BlowHoleConfiguration.class, savedBlowHoleConfiguration.getId());
		Assert.assertNotNull(dbBlowHoleConfiguration);
		Assert.assertNotNull(dbBlowHoleConfiguration.getTestedroom().getBlowholeconfiguration());
		Assert.assertEquals(dbBlowHoleConfiguration, dbBlowHoleConfiguration.getTestedroom().getBlowholeconfiguration());
	}
	
	

}
