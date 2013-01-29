package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.DeviceBuilder;
import com.dooapp.firea.wrapper.Device;

/*
 * Test Class
 * <!-- Start of user code comment for Device Test Class
 * End of user code -->
 */


public class DeviceBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private DeviceBuilder<?> deviceBuilder;
	
	@Before
	public void setup() {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().injectMembers(this);
	}
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(DeviceBuilderTest.class).justTryToPersiste();
		//Start of user code main of Device
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Device unsavedDevice= deviceBuilder.build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice);
		//Start of user code try to persist for Device
		
		//End of user code
	}
	@Test
	public void setterNGetterLastCalibrationDate() throws Exception {
		//Start of user code getter and setter for lastCalibrationDate attribute
		Device unsavedDevice = deviceBuilder.lastCalibrationDate(new java.util.Date()).build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice.getLastCalibrationDate());
		//End of user code
	}
	@Test
	public void setterNGetterSerialNumber() throws Exception {
		//Start of user code getter and setter for serialNumber attribute
		Device unsavedDevice = deviceBuilder.serialNumber("").build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice.getSerialNumber());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Device unsavedDevice = deviceBuilder.id(0L).build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Device unsavedDevice = deviceBuilder.creationDate(new java.util.Date()).build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Device unsavedDevice = deviceBuilder.updateDate(new java.util.Date()).build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Device unsavedDevice = deviceBuilder.version(0).build();
		Device savedDevice = manager.save(unsavedDevice);
		Device dbDevice = manager.get(Device.class, savedDevice.getId());
		Assert.assertNotNull(dbDevice.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
		
	/*
	 * Basic Refs opposite tester
	 */
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
