package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.Step;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class StepBuilderTest
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
	private StepBuilder<?> stepBuilder;
	
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
		Step unsavedStep= stepBuilder.build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterStatus() throws Exception {
		Step unsavedStep = stepBuilder.status("").build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep.getStatus());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		Step unsavedStep = stepBuilder.id(0L).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		Step unsavedStep = stepBuilder.creationDate(new java.util.Date()).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		Step unsavedStep = stepBuilder.updateDate(new java.util.Date()).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		Step unsavedStep = stepBuilder.version(0).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep.getVersion());
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
		Step unsavedStep =  stepBuilder.sample(elem1).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterSampleClassicTest() throws Exception {
		Step unsavedStep =  stepBuilder.build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterPointsTest() throws Exception {	
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		Step unsavedStep =  stepBuilder.points(elem1).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getPoints());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterPointsClassicTest() throws Exception {
		Step unsavedStep =  stepBuilder.build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getPoints());
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
		Step unsavedStep =  stepBuilder.sample(elem1).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getSample().getStep());
		Assert.assertEquals(dbStep, dbStep.getSample().getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeSampleClassicTest() throws Exception {
		Step unsavedStep =  stepBuilder.build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getSample().getStep());
		Assert.assertEquals(dbStep, dbStep.getSample().getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositePointsTest() throws Exception {
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		Step unsavedStep =  stepBuilder.points(elem1).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getPoints().getStep());
		Assert.assertEquals(dbStep, dbStep.getPoints().getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositePointsClassicTest() throws Exception {
		Step unsavedStep =  stepBuilder.build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getPoints().getStep());
		Assert.assertEquals(dbStep, dbStep.getPoints().getStep());
	}
	
	

}
