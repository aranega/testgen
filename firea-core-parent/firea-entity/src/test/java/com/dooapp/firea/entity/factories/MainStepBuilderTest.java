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

import com.dooapp.firea.wrapper.MainStep;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class MainStepBuilderTest
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
	private MainStepBuilder<?> mainStepBuilder;
	
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
		mainStepBuilder.sample(sampleWrapper);
		
	
		MainStep unsavedMainStep= mainStepBuilder.build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterCalculatedELA() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		mainStepBuilder.sample(sampleWrapper);
		
	
		MainStep unsavedMainStep = mainStepBuilder.calculatedELA(0.0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getCalculatedELA());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterCl() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		mainStepBuilder.sample(sampleWrapper);
		
	
		MainStep unsavedMainStep = mainStepBuilder.cl(0.0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getCl());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterCorrelation() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		mainStepBuilder.sample(sampleWrapper);
		
	
		MainStep unsavedMainStep = mainStepBuilder.correlation(0.0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getCorrelation());
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
		mainStepBuilder.sample(sampleWrapper);
		
	
		MainStep unsavedMainStep = mainStepBuilder.creationDate(new java.util.Date()).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getCreationDate());
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
		mainStepBuilder.sample(sampleWrapper);
		
	
		MainStep unsavedMainStep = mainStepBuilder.date(new java.util.Date()).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterDirection() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		mainStepBuilder.sample(sampleWrapper);
		
	
		MainStep unsavedMainStep = mainStepBuilder.direction("").build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getDirection());
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
		mainStepBuilder.sample(sampleWrapper);
		
	
		MainStep unsavedMainStep = mainStepBuilder.id(0L).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getId());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterN() throws Exception {
		// FIXME: Warning, the test will probably failed because Sample required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Sample sampleWrapper = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		mainStepBuilder.sample(sampleWrapper);
		
	
		MainStep unsavedMainStep = mainStepBuilder.n(0.0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getN());
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
		mainStepBuilder.sample(sampleWrapper);
		
	
		MainStep unsavedMainStep = mainStepBuilder.status(StepStatus.NO_STARTED).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getStatus());
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
		mainStepBuilder.sample(sampleWrapper);
		
	
		MainStep unsavedMainStep = mainStepBuilder.updateDate(new java.util.Date()).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getUpdateDate());
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
		mainStepBuilder.sample(sampleWrapper);
		
	
		MainStep unsavedMainStep = mainStepBuilder.version(0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getVersion());
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
		mainStepBuilder.sample(sampleWrapper);
		
	
		com.dooapp.firea.wrapper.Point elem1 = (new com.dooapp.firea.entity.PointBean()).getWrapper(); 
		MainStep unsavedMainStep =  mainStepBuilder.points(elem1).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertFalse(dbMainStep.getPoints().isEmpty());
		Assert.assertEquals(1, dbMainStep.getPoints().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterSampleTest() throws Exception {	
		
		com.dooapp.firea.wrapper.Sample elem1 = (new com.dooapp.firea.entity.SampleBean()).getWrapper(); 
		MainStep unsavedMainStep =  mainStepBuilder.sample(elem1).build();
		Assert.assertNotNull(unsavedMainStep);
		Assert.assertNotNull(unsavedMainStep.getSample());
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
		MainStep unsavedMainStep =  mainStepBuilder.sample(elem1).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getSample());
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
		mainStepBuilder.sample(sampleWrapper);
		
	
		com.dooapp.firea.wrapper.Point elem1 = (new com.dooapp.firea.entity.PointBean()).getWrapper(); 
		MainStep unsavedMainStep =  mainStepBuilder.points(elem1).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getPoints().get(0).getStep());
		Assert.assertEquals(dbMainStep, dbMainStep.getPoints().get(0).getStep());
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
		MainStep unsavedMainStep =  mainStepBuilder.sample(elem1).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertFalse(dbMainStep.getSample().getStep().isEmpty());
		Assert.assertTrue(dbMainStep.getSample().getStep().contains(dbMainStep));
	}
	
	
}
