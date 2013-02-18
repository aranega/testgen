package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.CalibrationStep;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class CalibrationStepBuilderTest
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
	private CalibrationStepBuilder<?> calibrationStepBuilder;
	
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
		CalibrationStep unsavedCalibrationStep= calibrationStepBuilder.build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterStatus() throws Exception {
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.status("").build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getStatus());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.id(0L).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.creationDate(new java.util.Date()).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.updateDate(new java.util.Date()).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.version(0).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getVersion());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterAfterHoleELA() throws Exception {
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.afterHoleELA(0.0).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getAfterHoleELA());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterErrorPercent() throws Exception {
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.errorPercent(0.0).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getErrorPercent());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterBeforeHoleELA() throws Exception {
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.beforeHoleELA(0.0).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getBeforeHoleELA());
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
	public void refSetterSampleTest() throws Exception {	
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.sample(elem1).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterSampleClassicTest() throws Exception {
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterPointsTest() throws Exception {	
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.points(elem1).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getPoints());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterPointsClassicTest() throws Exception {
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getPoints());
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
	public void oppositeSampleTest() throws Exception {
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.sample(elem1).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getSample().getStep());
		Assert.assertEquals(dbCalibrationStep, dbCalibrationStep.getSample().getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeSampleClassicTest() throws Exception {
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getSample().getStep());
		Assert.assertEquals(dbCalibrationStep, dbCalibrationStep.getSample().getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositePointsTest() throws Exception {
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.points(elem1).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getPoints().getStep());
		Assert.assertEquals(dbCalibrationStep, dbCalibrationStep.getPoints().getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositePointsClassicTest() throws Exception {
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getPoints().getStep());
		Assert.assertEquals(dbCalibrationStep, dbCalibrationStep.getPoints().getStep());
	}
	
	

}
