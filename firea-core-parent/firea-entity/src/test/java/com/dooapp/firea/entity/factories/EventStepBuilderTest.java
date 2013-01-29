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

//import com.dooapp.firea.entity.factories.EventStepBuilder;
import com.dooapp.firea.wrapper.EventStep;

/*
 * Test Class
 * <!-- Start of user code comment for EventStep Test Class
 * End of user code -->
 */


public class EventStepBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private EventStepBuilder<?> eventStepBuilder;
	
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
		IOC.getInjector().getInstance(EventStepBuilderTest.class).justTryToPersiste();
		//Start of user code main of EventStep
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		EventStep unsavedEventStep= eventStepBuilder.build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		//Start of user code try to persist for EventStep
		
		//End of user code
	}
	@Test
	public void setterNGetterDate() throws Exception {
		//Start of user code getter and setter for date attribute
		EventStep unsavedEventStep = eventStepBuilder.date(new java.util.Date()).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getDate());
		//End of user code
	}
	@Test
	public void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for status attribute
		EventStep unsavedEventStep = eventStepBuilder.status("").build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getStatus());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		EventStep unsavedEventStep = eventStepBuilder.id(0L).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		EventStep unsavedEventStep = eventStepBuilder.creationDate(new java.util.Date()).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		EventStep unsavedEventStep = eventStepBuilder.updateDate(new java.util.Date()).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		EventStep unsavedEventStep = eventStepBuilder.version(0).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getVersion());
		//End of user code
	}
	@Test
	public void setterNGetterDirection() throws Exception {
		//Start of user code getter and setter for direction attribute
		EventStep unsavedEventStep = eventStepBuilder.direction("").build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep.getDirection());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterPointsTest() throws Exception {
		//Start of user code basic reference test for points reference
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		EventStep unsavedEventStep =  eventStepBuilder.points(elem1).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertFalse(dbEventStep.getPoints().isEmpty());
		Assert.assertEquals(1, dbEventStep.getPoints().size());
		//End of user code
	}
	
	@Test
	public void refSetterSampleTest() throws Exception {	
		//Start of user code basic reference test for sample reference
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		EventStep unsavedEventStep =  eventStepBuilder.sample(elem1).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getSample());
		//End of user code
	}
	
	@Test
	public void refSetterSampleClassicTest() throws Exception {
		//Start of user code basic classic reference test for sample reference
		EventStep unsavedEventStep =  eventStepBuilder.build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getSample());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositePointsTest() throws Exception {
		//Start of user code basic opposite test for points reference
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		EventStep unsavedEventStep =  eventStepBuilder.points(elem1).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertNotNull(dbEventStep.getPoints().get(0).getStep());
		Assert.assertEquals(dbEventStep, dbEventStep.getPoints().get(0).getStep());
		//End of user code
	}
	
	@Test
	public void oppositeSampleTest() throws Exception {
		//Start of user code basic opposite test for sample reference
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		EventStep unsavedEventStep =  eventStepBuilder.sample(elem1).build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertFalse(dbEventStep.getSample().getStep().isEmpty());
		Assert.assertTrue(dbEventStep.getSample().getStep().contains(dbEventStep));
		//End of user code
	}
	
	@Test
	public void oppositeSampleClassicTest() throws Exception {
		//Start of user code basic classic reference test for sample reference
		EventStep unsavedEventStep =  eventStepBuilder.build();
		EventStep savedEventStep = manager.save(unsavedEventStep);
		EventStep dbEventStep = manager.get(EventStep.class, savedEventStep.getId());
		Assert.assertNotNull(dbEventStep);
		Assert.assertFalse(dbEventStep.getSample().getStep().isEmpty());
		Assert.assertTrue(dbEventStep.getSample().getStep().contains(dbEventStep));
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
