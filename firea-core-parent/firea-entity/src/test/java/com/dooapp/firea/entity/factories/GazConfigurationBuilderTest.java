package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.GazConfiguration;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class GazConfigurationBuilderTest
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
	private GazConfigurationBuilder<?> gazConfigurationBuilder;
	
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
		GazConfiguration unsavedGazConfiguration= gazConfigurationBuilder.build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDroppedFloorFull() throws Exception {
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.droppedFloorFull(false).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.isDroppedFloorFull());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterRetentionInterface() throws Exception {
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.retentionInterface(false).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.isRetentionInterface());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterSlowUnloadingValue() throws Exception {
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.slowUnloadingValue(0.0).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getSlowUnloadingValue());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterLeekRepartitionPercent() throws Exception {
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.leekRepartitionPercent(0.0).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getLeekRepartitionPercent());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDroppedCeilFull() throws Exception {
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.droppedCeilFull(false).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.isDroppedCeilFull());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterRetentionGoal() throws Exception {
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.retentionGoal(0.0).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getRetentionGoal());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterSlowUnloading() throws Exception {
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.slowUnloading(false).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.isSlowUnloading());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.id(0L).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.creationDate(new java.util.Date()).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.updateDate(new java.util.Date()).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		GazConfiguration unsavedGazConfiguration = gazConfigurationBuilder.version(0).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration.getVersion());
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
	public void refSetterBottleconfigurationsTest() throws Exception {	
		com.dooapp.firea.wrapper.BottleConfiguration elem1 = new com.dooapp.firea.wrapper.BottleConfiguration();
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.bottleconfigurations(elem1).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getBottleconfigurations());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterBottleconfigurationsClassicTest() throws Exception {
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getBottleconfigurations());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterGazTest() throws Exception {	
		com.dooapp.firea.wrapper.Gaz elem1 = new com.dooapp.firea.wrapper.Gaz();
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.gaz(elem1).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getGaz());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterGazClassicTest() throws Exception {
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getGaz());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterProjectTest() throws Exception {	
		com.dooapp.firea.wrapper.Project elem1 = new com.dooapp.firea.wrapper.Project();
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.project(elem1).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getProject());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterProjectClassicTest() throws Exception {
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getProject());
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
	public void oppositeBottleconfigurationsTest() throws Exception {
		com.dooapp.firea.wrapper.BottleConfiguration elem1 = new com.dooapp.firea.wrapper.BottleConfiguration();
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.bottleconfigurations(elem1).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getBottleconfigurations().getGazconfiguration());
		Assert.assertEquals(dbGazConfiguration, dbGazConfiguration.getBottleconfigurations().getGazconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeBottleconfigurationsClassicTest() throws Exception {
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getBottleconfigurations().getGazconfiguration());
		Assert.assertEquals(dbGazConfiguration, dbGazConfiguration.getBottleconfigurations().getGazconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeGazTest() throws Exception {
		com.dooapp.firea.wrapper.Gaz elem1 = new com.dooapp.firea.wrapper.Gaz();
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.gaz(elem1).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getGaz().getGazconfiguration());
		Assert.assertEquals(dbGazConfiguration, dbGazConfiguration.getGaz().getGazconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeGazClassicTest() throws Exception {
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getGaz().getGazconfiguration());
		Assert.assertEquals(dbGazConfiguration, dbGazConfiguration.getGaz().getGazconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeProjectTest() throws Exception {
		com.dooapp.firea.wrapper.Project elem1 = new com.dooapp.firea.wrapper.Project();
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.project(elem1).build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getProject().getGazconfiguration());
		Assert.assertEquals(dbGazConfiguration, dbGazConfiguration.getProject().getGazconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeProjectClassicTest() throws Exception {
		GazConfiguration unsavedGazConfiguration =  gazConfigurationBuilder.build();
		GazConfiguration savedGazConfiguration = manager.save(unsavedGazConfiguration);
		GazConfiguration dbGazConfiguration = manager.get(GazConfiguration.class, savedGazConfiguration.getId());
		Assert.assertNotNull(dbGazConfiguration);
		Assert.assertNotNull(dbGazConfiguration.getProject().getGazconfiguration());
		Assert.assertEquals(dbGazConfiguration, dbGazConfiguration.getProject().getGazconfiguration());
	}
	
	

}
