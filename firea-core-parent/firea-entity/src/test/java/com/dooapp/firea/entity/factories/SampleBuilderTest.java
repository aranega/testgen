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

//import com.dooapp.firea.entity.factories.SampleBuilder;
import com.dooapp.firea.wrapper.Sample;

/*
 * Test Class
 * <!-- Start of user code comment for Sample Test Class
 * End of user code -->
 */


public class SampleBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private SampleBuilder<?> sampleBuilder;
	
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
		IOC.getInjector().getInstance(SampleBuilderTest.class).justTryToPersiste();
		//Start of user code main of Sample
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Sample unsavedSample= sampleBuilder.build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		//Start of user code try to persist for Sample
		
		//End of user code
	}
	@Test
	public void setterNGetterTetaI() throws Exception {
		//Start of user code getter and setter for tetaI attribute
		Sample unsavedSample = sampleBuilder.tetaI(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getTetaI());
		//End of user code
	}
	@Test
	public void setterNGetterRoI() throws Exception {
		//Start of user code getter and setter for roI attribute
		Sample unsavedSample = sampleBuilder.roI(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getRoI());
		//End of user code
	}
	@Test
	public void setterNGetterDate() throws Exception {
		//Start of user code getter and setter for date attribute
		Sample unsavedSample = sampleBuilder.date(new java.util.Date()).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getDate());
		//End of user code
	}
	@Test
	public void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for status attribute
		Sample unsavedSample = sampleBuilder.status("").build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getStatus());
		//End of user code
	}
	@Test
	public void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		Sample unsavedSample = sampleBuilder.name("").build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getName());
		//End of user code
	}
	@Test
	public void setterNGetterAirPressureCalculationMethod() throws Exception {
		//Start of user code getter and setter for airPressureCalculationMethod attribute
		Sample unsavedSample = sampleBuilder.airPressureCalculationMethod("").build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getAirPressureCalculationMethod());
		//End of user code
	}
	@Test
	public void setterNGetterAirPressure() throws Exception {
		//Start of user code getter and setter for airPressure attribute
		Sample unsavedSample = sampleBuilder.airPressure(0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getAirPressure());
		//End of user code
	}
	@Test
	public void setterNGetterHighUp() throws Exception {
		//Start of user code getter and setter for highUp attribute
		Sample unsavedSample = sampleBuilder.highUp(0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getHighUp());
		//End of user code
	}
	@Test
	public void setterNGetterWindMeasure() throws Exception {
		//Start of user code getter and setter for windMeasure attribute
		Sample unsavedSample = sampleBuilder.windMeasure(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getWindMeasure());
		//End of user code
	}
	@Test
	public void setterNGetterPhiIPercent() throws Exception {
		//Start of user code getter and setter for phiIPercent attribute
		Sample unsavedSample = sampleBuilder.phiIPercent(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getPhiIPercent());
		//End of user code
	}
	@Test
	public void setterNGetterTetaE() throws Exception {
		//Start of user code getter and setter for tetaE attribute
		Sample unsavedSample = sampleBuilder.tetaE(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getTetaE());
		//End of user code
	}
	@Test
	public void setterNGetterBeaufortScale() throws Exception {
		//Start of user code getter and setter for beaufortScale attribute
		Sample unsavedSample = sampleBuilder.beaufortScale("").build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getBeaufortScale());
		//End of user code
	}
	@Test
	public void setterNGetterPhiEPercent() throws Exception {
		//Start of user code getter and setter for phiEPercent attribute
		Sample unsavedSample = sampleBuilder.phiEPercent(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getPhiEPercent());
		//End of user code
	}
	@Test
	public void setterNGetterRoE() throws Exception {
		//Start of user code getter and setter for roE attribute
		Sample unsavedSample = sampleBuilder.roE(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getRoE());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Sample unsavedSample = sampleBuilder.id(0L).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Sample unsavedSample = sampleBuilder.creationDate(new java.util.Date()).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Sample unsavedSample = sampleBuilder.updateDate(new java.util.Date()).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Sample unsavedSample = sampleBuilder.version(0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterStepTest() throws Exception {
		//Start of user code basic reference test for step reference
		com.dooapp.firea.wrapper.Step elem1 = new com.dooapp.firea.wrapper.Step();
		Sample unsavedSample =  sampleBuilder.step(elem1).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertFalse(dbSample.getStep().isEmpty());
		Assert.assertEquals(1, dbSample.getStep().size());
		//End of user code
	}
	
	@Test
	public void refSetterProjectTest() throws Exception {	
		//Start of user code basic reference test for project reference
		com.dooapp.firea.wrapper.Project elem1 = new com.dooapp.firea.wrapper.Project();
		Sample unsavedSample =  sampleBuilder.project(elem1).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertNotNull(dbSample.getProject());
		//End of user code
	}
	
	@Test
	public void refSetterProjectClassicTest() throws Exception {
		//Start of user code basic classic reference test for project reference
		Sample unsavedSample =  sampleBuilder.build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertNotNull(dbSample.getProject());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeStepTest() throws Exception {
		//Start of user code basic opposite test for step reference
		com.dooapp.firea.wrapper.Step elem1 = new com.dooapp.firea.wrapper.Step();
		Sample unsavedSample =  sampleBuilder.step(elem1).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertNotNull(dbSample.getStep().get(0).getSample());
		Assert.assertEquals(dbSample, dbSample.getStep().get(0).getSample());
		//End of user code
	}
	
	@Test
	public void oppositeProjectTest() throws Exception {
		//Start of user code basic opposite test for project reference
		com.dooapp.firea.wrapper.Project elem1 = new com.dooapp.firea.wrapper.Project();
		Sample unsavedSample =  sampleBuilder.project(elem1).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertFalse(dbSample.getProject().getSample().isEmpty());
		Assert.assertTrue(dbSample.getProject().getSample().contains(dbSample));
		//End of user code
	}
	
	@Test
	public void oppositeProjectClassicTest() throws Exception {
		//Start of user code basic classic reference test for project reference
		Sample unsavedSample =  sampleBuilder.build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertFalse(dbSample.getProject().getSample().isEmpty());
		Assert.assertTrue(dbSample.getProject().getSample().contains(dbSample));
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
