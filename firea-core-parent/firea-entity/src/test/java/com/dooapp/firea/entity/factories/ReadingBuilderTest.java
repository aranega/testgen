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

//import com.dooapp.firea.entity.factories.ReadingBuilder;
import com.dooapp.firea.wrapper.Reading;

/*
 * Test Class
 * <!-- Start of user code comment for Reading Test Class
 * End of user code -->
 */


public class ReadingBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private ReadingBuilder<?> readingBuilder;
	
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
		IOC.getInjector().getInstance(ReadingBuilderTest.class).justTryToPersiste();
		//Start of user code main of Reading
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Reading unsavedReading= readingBuilder.build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading);
		//Start of user code try to persist for Reading
		
		//End of user code
	}
	@Test
	public void setterNGetterTimeAverage() throws Exception {
		//Start of user code getter and setter for timeAverage attribute
		Reading unsavedReading = readingBuilder.timeAverage(0).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getTimeAverage());
		//End of user code
	}
	@Test
	public void setterNGetterBuildingPressure() throws Exception {
		//Start of user code getter and setter for buildingPressure attribute
		Reading unsavedReading = readingBuilder.buildingPressure(0.0).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getBuildingPressure());
		//End of user code
	}
	@Test
	public void setterNGetterFanPressure() throws Exception {
		//Start of user code getter and setter for fanPressure attribute
		Reading unsavedReading = readingBuilder.fanPressure(0.0).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getFanPressure());
		//End of user code
	}
	@Test
	public void setterNGetterLowFlow() throws Exception {
		//Start of user code getter and setter for lowFlow attribute
		Reading unsavedReading = readingBuilder.lowFlow(false).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.isLowFlow());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Reading unsavedReading = readingBuilder.id(0L).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Reading unsavedReading = readingBuilder.creationDate(new java.util.Date()).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Reading unsavedReading = readingBuilder.updateDate(new java.util.Date()).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Reading unsavedReading = readingBuilder.version(0).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterGaugemodeTest() throws Exception {	
		//Start of user code basic reference test for gaugemode reference
		com.dooapp.firea.wrapper.GaugeMode elem1 = new com.dooapp.firea.wrapper.GaugeMode();
		Reading unsavedReading =  readingBuilder.gaugemode(elem1).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading);
		Assert.assertNotNull(dbReading.getGaugemode());
		//End of user code
	}
	
	@Test
	public void refSetterDeviceTest() throws Exception {
		//Start of user code basic reference test for device reference
		com.dooapp.firea.wrapper.Device elem1 = new com.dooapp.firea.wrapper.Device();
		Reading unsavedReading =  readingBuilder.device(elem1).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading);
		Assert.assertFalse(dbReading.getDevice().isEmpty());
		Assert.assertEquals(1, dbReading.getDevice().size());
		//End of user code
	}
	
	@Test
	public void refSetterPointTest() throws Exception {	
		//Start of user code basic reference test for point reference
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		Reading unsavedReading =  readingBuilder.point(elem1).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading);
		Assert.assertNotNull(dbReading.getPoint());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositePointTest() throws Exception {
		//Start of user code basic opposite test for point reference
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		Reading unsavedReading =  readingBuilder.point(elem1).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading);
		Assert.assertFalse(dbReading.getPoint().getReadings().isEmpty());
		Assert.assertTrue(dbReading.getPoint().getReadings().contains(dbReading));
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
