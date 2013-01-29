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
		IOC.getInjector().getInstance(CalibrationStepBuilderTest.class).justTryToPersiste();
		//Start of user code main of CalibrationStep
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		CalibrationStep unsavedCalibrationStep= calibrationStepBuilder.build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		//Start of user code try to persist for CalibrationStep
		
		//End of user code
	}
	@Test
	public void setterNGetterDate() throws Exception {
		//Start of user code getter and setter for date attribute
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.date(new java.util.Date()).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getDate());
		//End of user code
	}
	@Test
	public void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for status attribute
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.status("").build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getStatus());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.id(0L).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.creationDate(new java.util.Date()).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.updateDate(new java.util.Date()).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.version(0).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getVersion());
		//End of user code
	}
	@Test
	public void setterNGetterAfterHoleELA() throws Exception {
		//Start of user code getter and setter for afterHoleELA attribute
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.afterHoleELA(0.0).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getAfterHoleELA());
		//End of user code
	}
	@Test
	public void setterNGetterErrorPercent() throws Exception {
		//Start of user code getter and setter for errorPercent attribute
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.errorPercent(0.0).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getErrorPercent());
		//End of user code
	}
	@Test
	public void setterNGetterBeforeHoleELA() throws Exception {
		//Start of user code getter and setter for beforeHoleELA attribute
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.beforeHoleELA(0.0).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getBeforeHoleELA());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterPointsTest() throws Exception {
		//Start of user code basic reference test for points reference
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.points(elem1).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertFalse(dbCalibrationStep.getPoints().isEmpty());
		Assert.assertEquals(1, dbCalibrationStep.getPoints().size());
		//End of user code
	}
	
	@Test
	public void refSetterSampleTest() throws Exception {	
		//Start of user code basic reference test for sample reference
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.sample(elem1).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getSample());
		//End of user code
	}
	
	@Test
	public void refSetterSampleClassicTest() throws Exception {
		//Start of user code basic classic reference test for sample reference
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getSample());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositePointsTest() throws Exception {
		//Start of user code basic opposite test for points reference
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.points(elem1).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getPoints().get(0).getStep());
		Assert.assertEquals(dbCalibrationStep, dbCalibrationStep.getPoints().get(0).getStep());
		//End of user code
	}
	
	@Test
	public void oppositeSampleTest() throws Exception {
		//Start of user code basic opposite test for sample reference
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.sample(elem1).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertFalse(dbCalibrationStep.getSample().getStep().isEmpty());
		Assert.assertTrue(dbCalibrationStep.getSample().getStep().contains(dbCalibrationStep));
		//End of user code
	}
	
	@Test
	public void oppositeSampleClassicTest() throws Exception {
		//Start of user code basic classic reference test for sample reference
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertFalse(dbCalibrationStep.getSample().getStep().isEmpty());
		Assert.assertTrue(dbCalibrationStep.getSample().getStep().contains(dbCalibrationStep));
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
