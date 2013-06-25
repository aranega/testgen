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
import com.dooapp.firea.enumeration.Direction;

import com.dooapp.firea.wrapper.EventStep;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class EventStepBuilderTest
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
	private EventStepBuilder<?> eventStepBuilder;
	
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
		eventStepBuilder.sample(sampleWrapper);
		
	
		EventStep unsavedEventStep= eventStepBuilder.build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);	
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
		eventStepBuilder.sample(sampleWrapper);
		
	
		EventStep unsavedEventStep = eventStepBuilder.creationDate(new java.util.Date()).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getCreationDate());
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
		eventStepBuilder.sample(sampleWrapper);
		
	
		EventStep unsavedEventStep = eventStepBuilder.date(new java.util.Date()).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getDate());
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
		eventStepBuilder.sample(sampleWrapper);
		
	
		EventStep unsavedEventStep = eventStepBuilder.direction(Direction.PRESSURE).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getDirection());
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
		eventStepBuilder.sample(sampleWrapper);
		
	
		EventStep unsavedEventStep = eventStepBuilder.id(0L).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getId());
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
		eventStepBuilder.sample(sampleWrapper);
		
	
		EventStep unsavedEventStep = eventStepBuilder.status(StepStatus.NO_STARTED).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getStatus());
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
		eventStepBuilder.sample(sampleWrapper);
		
	
		EventStep unsavedEventStep = eventStepBuilder.updateDate(new java.util.Date()).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getUpdateDate());
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
		eventStepBuilder.sample(sampleWrapper);
		
	
		EventStep unsavedEventStep = eventStepBuilder.version(0).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getVersion());
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
		eventStepBuilder.sample(sampleWrapper);
		
	
		com.dooapp.firea.wrapper.Point elem1 = (new com.dooapp.firea.entity.PointBean()).getWrapper(); 
		EventStep unsavedEventStep =  eventStepBuilder.points(elem1).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertFalse(dbEventStep.getPoints().isEmpty());
		Assert.assertEquals(1, dbEventStep.getPoints().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterSampleTest() throws Exception {	
		
		com.dooapp.firea.wrapper.Sample elem1 = (new com.dooapp.firea.entity.SampleBean()).getWrapper(); 
		EventStep unsavedEventStep =  eventStepBuilder.sample(elem1).build();
		Assert.assertNotNull(unsavedEventStep);
		Assert.assertNotNull(unsavedEventStep.getSample());
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
		EventStep unsavedEventStep =  eventStepBuilder.sample(elem1).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getSample());
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
		eventStepBuilder.sample(sampleWrapper);
		
	
		com.dooapp.firea.wrapper.Point elem1 = (new com.dooapp.firea.entity.PointBean()).getWrapper(); 
		EventStep unsavedEventStep =  eventStepBuilder.points(elem1).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getPoints().get(0).getStep());
		Assert.assertEquals(dbEventStep, dbEventStep.getPoints().get(0).getStep());
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
		EventStep unsavedEventStep =  eventStepBuilder.sample(elem1).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertFalse(dbEventStep.getSample().getStep().isEmpty());
		Assert.assertTrue(dbEventStep.getSample().getStep().contains(dbEventStep));
	}
	
	
}
