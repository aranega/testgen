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

//import com.dooapp.firea.entity.factories.StepBuilder;
import com.dooapp.firea.wrapper.Step;

/*
 * Test Class
 * <!-- Start of user code comment for Step Test Class
 * End of user code -->
 */


public class StepBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private StepBuilder<?> stepBuilder;
	
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
		IOC.getInjector().getInstance(StepBuilderTest.class).justTryToPersiste();
		//Start of user code main of Step
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Step unsavedStep= stepBuilder.build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		//Start of user code try to persist for Step
		
		//End of user code
	}
	@Test
	public void setterNGetterDate() throws Exception {
		//Start of user code getter and setter for date attribute
		Step unsavedStep = stepBuilder.date(new java.util.Date()).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep.getDate());
		//End of user code
	}
	@Test
	public void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for status attribute
		Step unsavedStep = stepBuilder.status("").build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep.getStatus());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Step unsavedStep = stepBuilder.id(0L).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Step unsavedStep = stepBuilder.creationDate(new java.util.Date()).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Step unsavedStep = stepBuilder.updateDate(new java.util.Date()).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Step unsavedStep = stepBuilder.version(0).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterPointsTest() throws Exception {
		//Start of user code basic reference test for points reference
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		Step unsavedStep =  stepBuilder.points(elem1).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertFalse(dbStep.getPoints().isEmpty());
		Assert.assertEquals(1, dbStep.getPoints().size());
		//End of user code
	}
	
	@Test
	public void refSetterSampleTest() throws Exception {	
		//Start of user code basic reference test for sample reference
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		Step unsavedStep =  stepBuilder.sample(elem1).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getSample());
		//End of user code
	}
	
	@Test
	public void refSetterSampleClassicTest() throws Exception {
		//Start of user code basic classic reference test for sample reference
		Step unsavedStep =  stepBuilder.build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getSample());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositePointsTest() throws Exception {
		//Start of user code basic opposite test for points reference
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		Step unsavedStep =  stepBuilder.points(elem1).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertNotNull(dbStep.getPoints().get(0).getStep());
		Assert.assertEquals(dbStep, dbStep.getPoints().get(0).getStep());
		//End of user code
	}
	
	@Test
	public void oppositeSampleTest() throws Exception {
		//Start of user code basic opposite test for sample reference
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		Step unsavedStep =  stepBuilder.sample(elem1).build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertFalse(dbStep.getSample().getStep().isEmpty());
		Assert.assertTrue(dbStep.getSample().getStep().contains(dbStep));
		//End of user code
	}
	
	@Test
	public void oppositeSampleClassicTest() throws Exception {
		//Start of user code basic classic reference test for sample reference
		Step unsavedStep =  stepBuilder.build();
		Step savedStep = manager.save(unsavedStep);
		Step dbStep = manager.get(Step.class, savedStep.getId());
		Assert.assertNotNull(dbStep);
		Assert.assertFalse(dbStep.getSample().getStep().isEmpty());
		Assert.assertTrue(dbStep.getSample().getStep().contains(dbStep));
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
