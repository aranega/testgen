package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;


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
	public void setterNGetterStatus() throws Exception {
		EventStep unsavedEventStep = eventStepBuilder.status("").build();
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
	public void setterNGetterId() throws Exception {
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
	public void setterNGetterCreationDate() throws Exception {
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
	public void setterNGetterUpdateDate() throws Exception {
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
	public void setterNGetterVersion() throws Exception {
		EventStep unsavedEventStep = eventStepBuilder.version(0).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getVersion());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDirection() throws Exception {
		EventStep unsavedEventStep = eventStepBuilder.direction("").build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getDirection());
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
		EventStep unsavedEventStep =  eventStepBuilder.sample(elem1).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterSampleClassicTest() throws Exception {
		EventStep unsavedEventStep =  eventStepBuilder.build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterPointsTest() throws Exception {	
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		EventStep unsavedEventStep =  eventStepBuilder.points(elem1).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getPoints());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterPointsClassicTest() throws Exception {
		EventStep unsavedEventStep =  eventStepBuilder.build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getPoints());
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
		EventStep unsavedEventStep =  eventStepBuilder.sample(elem1).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getSample().getStep());
		Assert.assertEquals(dbEventStep, dbEventStep.getSample().getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeSampleClassicTest() throws Exception {
		EventStep unsavedEventStep =  eventStepBuilder.build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getSample().getStep());
		Assert.assertEquals(dbEventStep, dbEventStep.getSample().getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositePointsTest() throws Exception {
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		EventStep unsavedEventStep =  eventStepBuilder.points(elem1).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getPoints().getStep());
		Assert.assertEquals(dbEventStep, dbEventStep.getPoints().getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositePointsClassicTest() throws Exception {
		EventStep unsavedEventStep =  eventStepBuilder.build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getPoints().getStep());
		Assert.assertEquals(dbEventStep, dbEventStep.getPoints().getStep());
	}
	
	

}
