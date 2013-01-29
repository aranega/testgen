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

//import com.dooapp.firea.entity.factories.MainStepBuilder;
import com.dooapp.firea.wrapper.MainStep;

/*
 * Test Class
 * <!-- Start of user code comment for MainStep Test Class
 * End of user code -->
 */


public class MainStepBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private MainStepBuilder<?> mainStepBuilder;
	
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
		IOC.getInjector().getInstance(MainStepBuilderTest.class).justTryToPersiste();
		//Start of user code main of MainStep
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		MainStep unsavedMainStep= mainStepBuilder.build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		//Start of user code try to persist for MainStep
		
		//End of user code
	}
	@Test
	public void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for status attribute
		MainStep unsavedMainStep = mainStepBuilder.status("").build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getStatus());
		//End of user code
	}
	@Test
	public void setterNGetterDate() throws Exception {
		//Start of user code getter and setter for date attribute
		MainStep unsavedMainStep = mainStepBuilder.date(new java.util.Date()).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getDate());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		MainStep unsavedMainStep = mainStepBuilder.id(0L).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		MainStep unsavedMainStep = mainStepBuilder.creationDate(new java.util.Date()).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		MainStep unsavedMainStep = mainStepBuilder.updateDate(new java.util.Date()).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		MainStep unsavedMainStep = mainStepBuilder.version(0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getVersion());
		//End of user code
	}
	@Test
	public void setterNGetterN() throws Exception {
		//Start of user code getter and setter for n attribute
		MainStep unsavedMainStep = mainStepBuilder.n(0.0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getN());
		//End of user code
	}
	@Test
	public void setterNGetterCl() throws Exception {
		//Start of user code getter and setter for cl attribute
		MainStep unsavedMainStep = mainStepBuilder.cl(0.0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getCl());
		//End of user code
	}
	@Test
	public void setterNGetterDirection() throws Exception {
		//Start of user code getter and setter for direction attribute
		MainStep unsavedMainStep = mainStepBuilder.direction("").build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getDirection());
		//End of user code
	}
	@Test
	public void setterNGetterCalculatedELA() throws Exception {
		//Start of user code getter and setter for calculatedELA attribute
		MainStep unsavedMainStep = mainStepBuilder.calculatedELA(0.0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getCalculatedELA());
		//End of user code
	}
	@Test
	public void setterNGetterCorrelation() throws Exception {
		//Start of user code getter and setter for correlation attribute
		MainStep unsavedMainStep = mainStepBuilder.correlation(0.0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getCorrelation());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterPointsTest() throws Exception {
		//Start of user code basic reference test for points reference
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		MainStep unsavedMainStep =  mainStepBuilder.points(elem1).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertFalse(dbMainStep.getPoints().isEmpty());
		Assert.assertEquals(1, dbMainStep.getPoints().size());
		//End of user code
	}
	
	@Test
	public void refSetterSampleTest() throws Exception {	
		//Start of user code basic reference test for sample reference
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		MainStep unsavedMainStep =  mainStepBuilder.sample(elem1).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getSample());
		//End of user code
	}
	
	@Test
	public void refSetterSampleClassicTest() throws Exception {
		//Start of user code basic classic reference test for sample reference
		MainStep unsavedMainStep =  mainStepBuilder.build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getSample());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositePointsTest() throws Exception {
		//Start of user code basic opposite test for points reference
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		MainStep unsavedMainStep =  mainStepBuilder.points(elem1).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getPoints().get(0).getStep());
		Assert.assertEquals(dbMainStep, dbMainStep.getPoints().get(0).getStep());
		//End of user code
	}
	
	@Test
	public void oppositeSampleTest() throws Exception {
		//Start of user code basic opposite test for sample reference
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		MainStep unsavedMainStep =  mainStepBuilder.sample(elem1).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertFalse(dbMainStep.getSample().getStep().isEmpty());
		Assert.assertTrue(dbMainStep.getSample().getStep().contains(dbMainStep));
		//End of user code
	}
	
	@Test
	public void oppositeSampleClassicTest() throws Exception {
		//Start of user code basic classic reference test for sample reference
		MainStep unsavedMainStep =  mainStepBuilder.build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertFalse(dbMainStep.getSample().getStep().isEmpty());
		Assert.assertTrue(dbMainStep.getSample().getStep().contains(dbMainStep));
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
