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
		stepBuilder.sample(sampleWrapper);
		
	
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
	@Ignore
	public void setterNGetterCreationDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		stepBuilder.sample(sampleWrapper);
		
	
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
	@Ignore
	public void setterNGetterDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		stepBuilder.sample(sampleWrapper);
		
	
		Step unsavedStep = stepBuilder.date(new java.util.Date()).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep.getDate());
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
		stepBuilder.sample(sampleWrapper);
		
	
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
	@Ignore
	public void setterNGetterStatus() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		stepBuilder.sample(sampleWrapper);
		
	
		Step unsavedStep = stepBuilder.status(StepStatus.NO_STARTED).build();
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
	@Ignore
	public void setterNGetterUpdateDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		stepBuilder.sample(sampleWrapper);
		
	
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
	@Ignore
	public void setterNGetterVersion() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		stepBuilder.sample(sampleWrapper);
		
	
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
	@Ignore
	public void refSetterPointsTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		stepBuilder.sample(sampleWrapper);
		
	
		com.dooapp.firea.wrapper.Point elem1 = (new com.dooapp.firea.entity.PointBean()).getWrapper(); 
		Step unsavedStep =  stepBuilder.points(elem1).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertFalse(dbStep.getPoints().isEmpty());
		Assert.assertEquals(1, dbStep.getPoints().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterSampleTest() throws Exception {	
		
		com.dooapp.firea.wrapper.Sample elem1 = (new com.dooapp.firea.entity.SampleBean()).getWrapper(); 
		Step unsavedStep =  stepBuilder.sample(elem1).build();
		Assert.assertNotNull(unsavedStep);
		Assert.assertNotNull(unsavedStep.getSample());
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
		Step unsavedStep =  stepBuilder.sample(elem1).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getSample());
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
		stepBuilder.sample(sampleWrapper);
		
	
		com.dooapp.firea.wrapper.Point elem1 = (new com.dooapp.firea.entity.PointBean()).getWrapper(); 
		Step unsavedStep =  stepBuilder.points(elem1).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getPoints().get(0).getStep());
		Assert.assertEquals(dbStep, dbStep.getPoints().get(0).getStep());
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
		Step unsavedStep =  stepBuilder.sample(elem1).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertFalse(dbStep.getSample().getStep().isEmpty());
		Assert.assertTrue(dbStep.getSample().getStep().contains(dbStep));
	}
	
	
}
