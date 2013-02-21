package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.firea.entity.StepStatus;
import com.dooapp.firea.entity.Direction;

import com.dooapp.firea.wrapper.BlowHoleStep;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class BlowHoleStepBuilderTest
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
	private BlowHoleStepBuilder<?> blowHoleStepBuilder;
	
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
		BlowHoleStep unsavedBlowHoleStep= blowHoleStepBuilder.build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterStatus() throws Exception {
		BlowHoleStep unsavedBlowHoleStep = blowHoleStepBuilder.status(StepStatus.NO_STARTED).build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep.getStatus());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDate() throws Exception {
		BlowHoleStep unsavedBlowHoleStep = blowHoleStepBuilder.date(new java.util.Date()).build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep.getDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		BlowHoleStep unsavedBlowHoleStep = blowHoleStepBuilder.id(0L).build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		BlowHoleStep unsavedBlowHoleStep = blowHoleStepBuilder.creationDate(new java.util.Date()).build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		BlowHoleStep unsavedBlowHoleStep = blowHoleStepBuilder.updateDate(new java.util.Date()).build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		BlowHoleStep unsavedBlowHoleStep = blowHoleStepBuilder.version(0).build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep.getVersion());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDirection() throws Exception {
		BlowHoleStep unsavedBlowHoleStep = blowHoleStepBuilder.direction(Direction.PRESSURE).build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep.getDirection());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterPressureGoal() throws Exception {
		BlowHoleStep unsavedBlowHoleStep = blowHoleStepBuilder.pressureGoal(0.0).build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep.getPressureGoal());
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
		BlowHoleStep unsavedBlowHoleStep =  blowHoleStepBuilder.sample(elem1).build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep);
		Assert.assertNotNull(dbBlowHoleStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterSampleClassicTest() throws Exception {
		BlowHoleStep unsavedBlowHoleStep =  blowHoleStepBuilder.build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep);
		Assert.assertNotNull(dbBlowHoleStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterPointsTest() throws Exception {
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		BlowHoleStep unsavedBlowHoleStep =  blowHoleStepBuilder.points(elem1).build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep);
		Assert.assertFalse(dbBlowHoleStep.getPoints().isEmpty());
		Assert.assertEquals(1, dbBlowHoleStep.getPoints().size());
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
	public void oppositePointsTest() throws Exception {
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		BlowHoleStep unsavedBlowHoleStep =  blowHoleStepBuilder.points(elem1).build();
		BlowHoleStep savedBlowHoleStep = manager.save(unsavedBlowHoleStep);
		BlowHoleStep dbBlowHoleStep = manager.get(BlowHoleStep.class, savedBlowHoleStep.getId());
		Assert.assertNotNull(dbBlowHoleStep);
		Assert.assertNotNull(dbBlowHoleStep.getPoints().get(0).getStep());
		Assert.assertEquals(dbBlowHoleStep, dbBlowHoleStep.getPoints().get(0).getStep());
	}
	
	

}
