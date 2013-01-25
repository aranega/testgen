package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

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
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(DeviceBuilderTest.class).justTryToPersiste();
		//Start of user code main of Device
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		Device unsavedProject = deviceBuilder.build();
		Device savedProject = manager.save(unsavedProject);
		Device dbProject = manager.get(Device.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for Device
		
		//End of user code
	}
	private void setterNGetterSerialNumber() throws Exception {
		//Start of user code getter and setter for serialNumber attribute
		Device unsavedProject = deviceBuilder.serialNumber("").build();
		Device savedProject = manager.save(unsavedProject);
		Device dbProject = manager.get(Device.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getserialNumber());
		//End of user code
	}
	private void setterNGetterLastCalibrationDate() throws Exception {
		//Start of user code getter and setter for lastCalibrationDate attribute
		Device unsavedProject = deviceBuilder.lastCalibrationDate(new java.util.Date()).build();
		Device savedProject = manager.save(unsavedProject);
		Device dbProject = manager.get(Device.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getlastCalibrationDate());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Device unsavedProject = deviceBuilder.id(0L).build();
		Device savedProject = manager.save(unsavedProject);
		Device dbProject = manager.get(Device.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Device unsavedProject = deviceBuilder.creationDate(new java.util.Date()).build();
		Device savedProject = manager.save(unsavedProject);
		Device dbProject = manager.get(Device.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Device unsavedProject = deviceBuilder.updateDate(new java.util.Date()).build();
		Device savedProject = manager.save(unsavedProject);
		Device dbProject = manager.get(Device.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Device unsavedProject = deviceBuilder.version(0).build();
		Device savedProject = manager.save(unsavedProject);
		Device dbProject = manager.get(Device.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
