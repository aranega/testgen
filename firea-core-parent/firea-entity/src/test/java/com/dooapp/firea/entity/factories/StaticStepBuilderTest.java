package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.firea.entity.StepStatus;

import com.dooapp.firea.wrapper.StaticStep;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class StaticStepBuilderTest
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
	private StaticStepBuilder<?> staticStepBuilder;
	
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
		StaticStep unsavedStaticStep= staticStepBuilder.build();
		StaticStep savedStaticStep = manager.save(unsavedStaticStep);
		StaticStep dbStaticStep = manager.get(StaticStep.class, savedStaticStep.getId());
		Assert.assertNotNull(dbStaticStep);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterStatus() throws Exception {
		StaticStep unsavedStaticStep = staticStepBuilder.status(StepStatus.NO_STARTED).build();
		StaticStep savedStaticStep = manager.save(unsavedStaticStep);
		StaticStep dbStaticStep = manager.get(StaticStep.class, savedStaticStep.getId());
		Assert.assertNotNull(dbStaticStep.getStatus());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDate() throws Exception {
		StaticStep unsavedStaticStep = staticStepBuilder.date(new java.util.Date()).build();
		StaticStep savedStaticStep = manager.save(unsavedStaticStep);
		StaticStep dbStaticStep = manager.get(StaticStep.class, savedStaticStep.getId());
		Assert.assertNotNull(dbStaticStep.getDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		StaticStep unsavedStaticStep = staticStepBuilder.id(0L).build();
		StaticStep savedStaticStep = manager.save(unsavedStaticStep);
		StaticStep dbStaticStep = manager.get(StaticStep.class, savedStaticStep.getId());
		Assert.assertNotNull(dbStaticStep.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		StaticStep unsavedStaticStep = staticStepBuilder.creationDate(new java.util.Date()).build();
		StaticStep savedStaticStep = manager.save(unsavedStaticStep);
		StaticStep dbStaticStep = manager.get(StaticStep.class, savedStaticStep.getId());
		Assert.assertNotNull(dbStaticStep.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		StaticStep unsavedStaticStep = staticStepBuilder.updateDate(new java.util.Date()).build();
		StaticStep savedStaticStep = manager.save(unsavedStaticStep);
		StaticStep dbStaticStep = manager.get(StaticStep.class, savedStaticStep.getId());
		Assert.assertNotNull(dbStaticStep.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		StaticStep unsavedStaticStep = staticStepBuilder.version(0).build();
		StaticStep savedStaticStep = manager.save(unsavedStaticStep);
		StaticStep dbStaticStep = manager.get(StaticStep.class, savedStaticStep.getId());
		Assert.assertNotNull(dbStaticStep.getVersion());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDeltaP() throws Exception {
		StaticStep unsavedStaticStep = staticStepBuilder.deltaP(0.0).build();
		StaticStep savedStaticStep = manager.save(unsavedStaticStep);
		StaticStep dbStaticStep = manager.get(StaticStep.class, savedStaticStep.getId());
		Assert.assertNotNull(dbStaticStep.getDeltaP());
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
		StaticStep unsavedStaticStep =  staticStepBuilder.sample(elem1).build();
		StaticStep savedStaticStep = manager.save(unsavedStaticStep);
		StaticStep dbStaticStep = manager.get(StaticStep.class, savedStaticStep.getId());
		Assert.assertNotNull(dbStaticStep);
		Assert.assertNotNull(dbStaticStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterSampleClassicTest() throws Exception {
		StaticStep unsavedStaticStep =  staticStepBuilder.build();
		StaticStep savedStaticStep = manager.save(unsavedStaticStep);
		StaticStep dbStaticStep = manager.get(StaticStep.class, savedStaticStep.getId());
		Assert.assertNotNull(dbStaticStep);
		Assert.assertNotNull(dbStaticStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterPointsTest() throws Exception {
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		StaticStep unsavedStaticStep =  staticStepBuilder.points(elem1).build();
		StaticStep savedStaticStep = manager.save(unsavedStaticStep);
		StaticStep dbStaticStep = manager.get(StaticStep.class, savedStaticStep.getId());
		Assert.assertNotNull(dbStaticStep);
		Assert.assertFalse(dbStaticStep.getPoints().isEmpty());
		Assert.assertEquals(1, dbStaticStep.getPoints().size());
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
		StaticStep unsavedStaticStep =  staticStepBuilder.points(elem1).build();
		StaticStep savedStaticStep = manager.save(unsavedStaticStep);
		StaticStep dbStaticStep = manager.get(StaticStep.class, savedStaticStep.getId());
		Assert.assertNotNull(dbStaticStep);
		Assert.assertNotNull(dbStaticStep.getPoints().get(0).getStep());
		Assert.assertEquals(dbStaticStep, dbStaticStep.getPoints().get(0).getStep());
	}
	
	

}
