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

//import com.dooapp.firea.entity.factories.PointBuilder;
import com.dooapp.firea.wrapper.Point;

/*
 * Test Class
 * <!-- Start of user code comment for Point Test Class
 * End of user code -->
 */


public class PointBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private PointBuilder<?> pointBuilder;
	
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
		IOC.getInjector().getInstance(PointBuilderTest.class).justTryToPersiste();
		//Start of user code main of Point
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Point unsavedPoint= pointBuilder.build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		//Start of user code try to persist for Point
		
		//End of user code
	}
	@Test
	public void setterNGetterPressureGoal() throws Exception {
		//Start of user code getter and setter for pressureGoal attribute
		Point unsavedPoint = pointBuilder.pressureGoal(0.0).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getPressureGoal());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Point unsavedPoint = pointBuilder.id(0L).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Point unsavedPoint = pointBuilder.creationDate(new java.util.Date()).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Point unsavedPoint = pointBuilder.updateDate(new java.util.Date()).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Point unsavedPoint = pointBuilder.version(0).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterStepTest() throws Exception {	
		//Start of user code basic reference test for step reference
		com.dooapp.firea.wrapper.Step elem1 = new com.dooapp.firea.wrapper.Step();
		Point unsavedPoint =  pointBuilder.step(elem1).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertNotNull(dbPoint.getStep());
		//End of user code
	}
	
	@Test
	public void refSetterStepClassicTest() throws Exception {
		//Start of user code basic classic reference test for step reference
		Point unsavedPoint =  pointBuilder.build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertNotNull(dbPoint.getStep());
		//End of user code
	}
	
	@Test
	public void refSetterReadingsTest() throws Exception {
		//Start of user code basic reference test for readings reference
		com.dooapp.firea.wrapper.Reading elem1 = new com.dooapp.firea.wrapper.Reading();
		Point unsavedPoint =  pointBuilder.readings(elem1).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertFalse(dbPoint.getReadings().isEmpty());
		Assert.assertEquals(1, dbPoint.getReadings().size());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeStepTest() throws Exception {
		//Start of user code basic opposite test for step reference
		com.dooapp.firea.wrapper.Step elem1 = new com.dooapp.firea.wrapper.Step();
		Point unsavedPoint =  pointBuilder.step(elem1).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertFalse(dbPoint.getStep().getPoints().isEmpty());
		Assert.assertTrue(dbPoint.getStep().getPoints().contains(dbPoint));
		//End of user code
	}
	
	@Test
	public void oppositeStepClassicTest() throws Exception {
		//Start of user code basic classic reference test for step reference
		Point unsavedPoint =  pointBuilder.build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertFalse(dbPoint.getStep().getPoints().isEmpty());
		Assert.assertTrue(dbPoint.getStep().getPoints().contains(dbPoint));
		//End of user code
	}
	
	@Test
	public void oppositeReadingsTest() throws Exception {
		//Start of user code basic opposite test for readings reference
		com.dooapp.firea.wrapper.Reading elem1 = new com.dooapp.firea.wrapper.Reading();
		Point unsavedPoint =  pointBuilder.readings(elem1).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertNotNull(dbPoint.getReadings().get(0).getPoint());
		Assert.assertEquals(dbPoint, dbPoint.getReadings().get(0).getPoint());
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
