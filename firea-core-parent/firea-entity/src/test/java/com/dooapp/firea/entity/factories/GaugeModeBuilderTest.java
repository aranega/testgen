package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.GaugeMode;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class GaugeModeBuilderTest
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
	private GaugeModeBuilder<?> gaugeModeBuilder;
	
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
		GaugeMode unsavedGaugeMode= gaugeModeBuilder.build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterGaugeType() throws Exception {
		GaugeMode unsavedGaugeMode = gaugeModeBuilder.gaugeType("").build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode.getGaugeType());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterName() throws Exception {
		GaugeMode unsavedGaugeMode = gaugeModeBuilder.name("").build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode.getName());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		GaugeMode unsavedGaugeMode = gaugeModeBuilder.id(0L).build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		GaugeMode unsavedGaugeMode = gaugeModeBuilder.creationDate(new java.util.Date()).build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		GaugeMode unsavedGaugeMode = gaugeModeBuilder.updateDate(new java.util.Date()).build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		GaugeMode unsavedGaugeMode = gaugeModeBuilder.version(0).build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode.getVersion());
	}
	
	
	/********************
	 * Basic Refs tester
	 ********************/

	

	/*****************************
	 * Basic Refs opposite tester
	 *****************************/

	

}
