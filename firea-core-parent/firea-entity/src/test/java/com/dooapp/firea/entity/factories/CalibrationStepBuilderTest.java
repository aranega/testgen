package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;

import com.dooapp.firea.enumeration.StepStatus;

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
	@Ignore
	public void justTryToPersiste() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		calibrationStepBuilder.sample(sampleWrapper);
		
	
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
	@Ignore
	public void setterNGetterAfterHoleELA() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		calibrationStepBuilder.sample(sampleWrapper);
		
	
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
	@Ignore
	public void setterNGetterBeforeHoleELA() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		calibrationStepBuilder.sample(sampleWrapper);
		
	
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.beforeHoleELA(0.0).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getBeforeHoleELA());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterCreationDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		calibrationStepBuilder.sample(sampleWrapper);
		
	
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
	@Ignore
	public void setterNGetterDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		calibrationStepBuilder.sample(sampleWrapper);
		
	
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.date(new java.util.Date()).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterErrorPercent() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		calibrationStepBuilder.sample(sampleWrapper);
		
	
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
	@Ignore
	public void setterNGetterId() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		calibrationStepBuilder.sample(sampleWrapper);
		
	
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
	@Ignore
	public void setterNGetterStatus() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		calibrationStepBuilder.sample(sampleWrapper);
		
	
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.status(StepStatus.NO_STARTED).build();
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
	@Ignore
	public void setterNGetterUpdateDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		calibrationStepBuilder.sample(sampleWrapper);
		
	
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
	@Ignore
	public void setterNGetterVersion() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		calibrationStepBuilder.sample(sampleWrapper);
		
	
		CalibrationStep unsavedCalibrationStep = calibrationStepBuilder.version(0).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep.getVersion());
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
	@Ignore
	public void refSetterPointsTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		calibrationStepBuilder.sample(sampleWrapper);
		
	
		com.dooapp.firea.wrapper.Point elem1 = (new com.dooapp.firea.entity.PointBean()).getWrapper(); 
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.points(elem1).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertFalse(dbCalibrationStep.getPoints().isEmpty());
		Assert.assertEquals(1, dbCalibrationStep.getPoints().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterSampleTest() throws Exception {	
		
		com.dooapp.firea.wrapper.Sample elem1 = (new com.dooapp.firea.entity.SampleBean()).getWrapper(); 
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.sample(elem1).build();
		Assert.assertNotNull(unsavedCalibrationStep);
		Assert.assertNotNull(unsavedCalibrationStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refSetterSerializeSampleTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
	
		com.dooapp.firea.wrapper.Sample elem1 = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.sample(elem1).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getSample());
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
	@Ignore
	public void oppositePointsTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		calibrationStepBuilder.sample(sampleWrapper);
		
	
		com.dooapp.firea.wrapper.Point elem1 = (new com.dooapp.firea.entity.PointBean()).getWrapper(); 
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.points(elem1).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertNotNull(dbCalibrationStep.getPoints().get(0).getStep());
		Assert.assertEquals(dbCalibrationStep, dbCalibrationStep.getPoints().get(0).getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void oppositeSampleTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
	
		com.dooapp.firea.wrapper.Sample elem1 = (new com.dooapp.firea.entity.SampleBean()).getWrapper(); 
		CalibrationStep unsavedCalibrationStep =  calibrationStepBuilder.sample(elem1).build();
		CalibrationStep savedCalibrationStep = manager.save(unsavedCalibrationStep);
		CalibrationStep dbCalibrationStep = manager.get(CalibrationStep.class, savedCalibrationStep.getId());
		Assert.assertNotNull(dbCalibrationStep);
		Assert.assertFalse(dbCalibrationStep.getSample().getStep().isEmpty());
		Assert.assertTrue(dbCalibrationStep.getSample().getStep().contains(dbCalibrationStep));
	}
	
	
}
