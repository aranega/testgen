package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.Device;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class DeviceBuilderTest
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
	private DeviceBuilder<?> deviceBuilder;
	
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
	
		Device unsavedDevice= deviceBuilder.build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterCreationDate() throws Exception {
	
		Device unsavedDevice = deviceBuilder.creationDate(new java.util.Date()).build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice.getCreationDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterId() throws Exception {
	
		Device unsavedDevice = deviceBuilder.id(0L).build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice.getId());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterLastCalibrationDate() throws Exception {
	
		Device unsavedDevice = deviceBuilder.lastCalibrationDate(new java.util.Date()).build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice.getLastCalibrationDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterSerialNumber() throws Exception {
	
		Device unsavedDevice = deviceBuilder.serialNumber("").build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice.getSerialNumber());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterUpdateDate() throws Exception {
	
		Device unsavedDevice = deviceBuilder.updateDate(new java.util.Date()).build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice.getUpdateDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterVersion() throws Exception {
	
		Device unsavedDevice = deviceBuilder.version(0).build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice.getVersion());
	}
	
	
	
	/********************
	 * Basic Refs tester
	 ********************/
	
	
	/*****************************
	 * Basic Refs opposite tester
	 *****************************/

	
}
