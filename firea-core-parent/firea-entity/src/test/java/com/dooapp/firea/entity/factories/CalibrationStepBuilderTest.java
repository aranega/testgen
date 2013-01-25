package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.CalibrationStepBuilder;
import com.dooapp.firea.wrapper.CalibrationStep;

/*
 * Test Class
 * <!-- Start of user code comment for CalibrationStep Test Class
 * End of user code -->
 */


public class CalibrationStepBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private CalibrationStepBuilder<?> calibrationStepBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(CalibrationStepBuilderTest.class).justTryToPersiste();
		//Start of user code main of CalibrationStep
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		CalibrationStep unsavedProject = calibrationStepBuilder.build();
		CalibrationStep savedProject = manager.save(unsavedProject);
		CalibrationStep dbProject = manager.get(CalibrationStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for CalibrationStep
		
		//End of user code
	}
	private void setterNGetterDate() throws Exception {
		//Start of user code getter and setter for date attribute
		CalibrationStep unsavedProject = calibrationStepBuilder.date(new java.util.Date()).build();
		CalibrationStep savedProject = manager.save(unsavedProject);
		CalibrationStep dbProject = manager.get(CalibrationStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdate());
		//End of user code
	}
	private void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for status attribute
		CalibrationStep unsavedProject = calibrationStepBuilder.status("").build();
		CalibrationStep savedProject = manager.save(unsavedProject);
		CalibrationStep dbProject = manager.get(CalibrationStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getstatus());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		CalibrationStep unsavedProject = calibrationStepBuilder.id(0L).build();
		CalibrationStep savedProject = manager.save(unsavedProject);
		CalibrationStep dbProject = manager.get(CalibrationStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		CalibrationStep unsavedProject = calibrationStepBuilder.creationDate(new java.util.Date()).build();
		CalibrationStep savedProject = manager.save(unsavedProject);
		CalibrationStep dbProject = manager.get(CalibrationStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		CalibrationStep unsavedProject = calibrationStepBuilder.updateDate(new java.util.Date()).build();
		CalibrationStep savedProject = manager.save(unsavedProject);
		CalibrationStep dbProject = manager.get(CalibrationStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		CalibrationStep unsavedProject = calibrationStepBuilder.version(0).build();
		CalibrationStep savedProject = manager.save(unsavedProject);
		CalibrationStep dbProject = manager.get(CalibrationStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	private void setterNGetterBeforeHoleELA() throws Exception {
		//Start of user code getter and setter for beforeHoleELA attribute
		CalibrationStep unsavedProject = calibrationStepBuilder.beforeHoleELA(0.0).build();
		CalibrationStep savedProject = manager.save(unsavedProject);
		CalibrationStep dbProject = manager.get(CalibrationStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getbeforeHoleELA());
		//End of user code
	}
	private void setterNGetterErrorPercent() throws Exception {
		//Start of user code getter and setter for errorPercent attribute
		CalibrationStep unsavedProject = calibrationStepBuilder.errorPercent(0.0).build();
		CalibrationStep savedProject = manager.save(unsavedProject);
		CalibrationStep dbProject = manager.get(CalibrationStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.geterrorPercent());
		//End of user code
	}
	private void setterNGetterAfterHoleELA() throws Exception {
		//Start of user code getter and setter for afterHoleELA attribute
		CalibrationStep unsavedProject = calibrationStepBuilder.afterHoleELA(0.0).build();
		CalibrationStep savedProject = manager.save(unsavedProject);
		CalibrationStep dbProject = manager.get(CalibrationStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getafterHoleELA());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
