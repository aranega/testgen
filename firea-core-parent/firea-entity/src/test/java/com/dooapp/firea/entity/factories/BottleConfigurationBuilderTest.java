package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;

import com.dooapp.firea.enumeration.BottleUnit;

import com.dooapp.firea.wrapper.BottleConfiguration;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class BottleConfigurationBuilderTest
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
	private BottleConfigurationBuilder<?> bottleConfigurationBuilder;
	
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
		com.dooapp.firea.wrapper.GazConfiguration gazconfigurationWrapper = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		bottleConfigurationBuilder.gazconfiguration(gazconfigurationWrapper);
		
	
		BottleConfiguration unsavedBottleConfiguration= bottleConfigurationBuilder.build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterCreationDate() throws Exception {
		com.dooapp.firea.wrapper.GazConfiguration gazconfigurationWrapper = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		bottleConfigurationBuilder.gazconfiguration(gazconfigurationWrapper);
		
	
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.creationDate(new java.util.Date()).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getCreationDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterId() throws Exception {
		com.dooapp.firea.wrapper.GazConfiguration gazconfigurationWrapper = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		bottleConfigurationBuilder.gazconfiguration(gazconfigurationWrapper);
		
	
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.id(0L).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getId());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterLoad() throws Exception {
		com.dooapp.firea.wrapper.GazConfiguration gazconfigurationWrapper = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		bottleConfigurationBuilder.gazconfiguration(gazconfigurationWrapper);
		
	
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.load(0.0).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getLoad());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterQuantity() throws Exception {
		com.dooapp.firea.wrapper.GazConfiguration gazconfigurationWrapper = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		bottleConfigurationBuilder.gazconfiguration(gazconfigurationWrapper);
		
	
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.quantity(0).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getQuantity());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterUnit() throws Exception {
		com.dooapp.firea.wrapper.GazConfiguration gazconfigurationWrapper = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		bottleConfigurationBuilder.gazconfiguration(gazconfigurationWrapper);
		
	
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.unit(BottleUnit.WEIGHT).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getUnit());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterUpdateDate() throws Exception {
		com.dooapp.firea.wrapper.GazConfiguration gazconfigurationWrapper = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		bottleConfigurationBuilder.gazconfiguration(gazconfigurationWrapper);
		
	
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.updateDate(new java.util.Date()).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getUpdateDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterVersion() throws Exception {
		com.dooapp.firea.wrapper.GazConfiguration gazconfigurationWrapper = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		bottleConfigurationBuilder.gazconfiguration(gazconfigurationWrapper);
		
	
		BottleConfiguration unsavedBottleConfiguration = bottleConfigurationBuilder.version(0).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration.getVersion());
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
	public void refSetterBottletypeTest() throws Exception {	
		com.dooapp.firea.wrapper.GazConfiguration gazconfigurationWrapper = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		bottleConfigurationBuilder.gazconfiguration(gazconfigurationWrapper);
		
		
		com.dooapp.firea.wrapper.BottleType elem1 = (new com.dooapp.firea.entity.BottleTypeBean()).getWrapper(); 
		BottleConfiguration unsavedBottleConfiguration =  bottleConfigurationBuilder.bottletype(elem1).build();
		Assert.assertNotNull(unsavedBottleConfiguration);
		Assert.assertNotNull(unsavedBottleConfiguration.getBottletype());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeBottletypeTest() throws Exception {
		com.dooapp.firea.wrapper.GazConfiguration gazconfigurationWrapper = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		bottleConfigurationBuilder.gazconfiguration(gazconfigurationWrapper);
		
	
		com.dooapp.firea.wrapper.BottleType elem1 = (new com.dooapp.firea.entity.BottleTypeBean()).getWrapper();
		BottleConfiguration unsavedBottleConfiguration =  bottleConfigurationBuilder.bottletype(elem1).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration);
		Assert.assertNotNull(dbBottleConfiguration.getBottletype());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterGazconfigurationTest() throws Exception {	
		
		com.dooapp.firea.wrapper.GazConfiguration elem1 = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper(); 
		BottleConfiguration unsavedBottleConfiguration =  bottleConfigurationBuilder.gazconfiguration(elem1).build();
		Assert.assertNotNull(unsavedBottleConfiguration);
		Assert.assertNotNull(unsavedBottleConfiguration.getGazconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeGazconfigurationTest() throws Exception {
	
		com.dooapp.firea.wrapper.GazConfiguration elem1 = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		BottleConfiguration unsavedBottleConfiguration =  bottleConfigurationBuilder.gazconfiguration(elem1).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration);
		Assert.assertNotNull(dbBottleConfiguration.getGazconfiguration());
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
	
	public void oppositeBottletypeTest() throws Exception {
		com.dooapp.firea.wrapper.GazConfiguration gazconfigurationWrapper = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		bottleConfigurationBuilder.gazconfiguration(gazconfigurationWrapper);
		
	
		com.dooapp.firea.wrapper.BottleType elem1 = (new com.dooapp.firea.entity.BottleTypeBean()).getWrapper(); 
		BottleConfiguration unsavedBottleConfiguration =  bottleConfigurationBuilder.bottletype(elem1).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration);
		Assert.assertFalse(dbBottleConfiguration.getBottletype().getBottleconfiguration().isEmpty());
		Assert.assertTrue(dbBottleConfiguration.getBottletype().getBottleconfiguration().contains(dbBottleConfiguration));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void oppositeGazconfigurationTest() throws Exception {
	
		com.dooapp.firea.wrapper.GazConfiguration elem1 = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper(); 
		BottleConfiguration unsavedBottleConfiguration =  bottleConfigurationBuilder.gazconfiguration(elem1).build();
		BottleConfiguration savedBottleConfiguration = manager.save(unsavedBottleConfiguration);
		BottleConfiguration dbBottleConfiguration = manager.get(BottleConfiguration.class, savedBottleConfiguration.getId());
		Assert.assertNotNull(dbBottleConfiguration);
		Assert.assertFalse(dbBottleConfiguration.getGazconfiguration().getBottleconfigurations().isEmpty());
		Assert.assertTrue(dbBottleConfiguration.getGazconfiguration().getBottleconfigurations().contains(dbBottleConfiguration));
	}
	
	
}
