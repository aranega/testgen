package com.dooapp.firea.wrapper;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Test Class
 * <!-- Start of user code comment for Point Test Class
 * End of user code -->
 */


public class PointTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private Point wrapper;	

	@Before
	public void setup(){
		this.wrapper = new Point();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetPressureGoal() {
		//Start of user code basic set and get for pressureGoal attribute
		Double tmp = 0.0;
		this.wrapper.setPressureGoal(tmp);
		Double result = this.wrapper.getPressureGoal();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetId() {
		//Start of user code basic set and get for id attribute
		Long tmp = 0L;
		this.wrapper.setId(tmp);
		Long result = this.wrapper.getId();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCreationDate() {
		//Start of user code basic set and get for creationDate attribute
		java.util.Date tmp = new java.util.Date();
		this.wrapper.setCreationDate(tmp);
		java.util.Date result = this.wrapper.getCreationDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetUpdateDate() {
		//Start of user code basic set and get for updateDate attribute
		java.util.Date tmp = new java.util.Date();
		this.wrapper.setUpdateDate(tmp);
		java.util.Date result = this.wrapper.getUpdateDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetVersion() {
		//Start of user code basic set and get for version attribute
		Integer tmp = 0;
		this.wrapper.setVersion(tmp);
		Integer result = this.wrapper.getVersion();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	
	/*
	 * Basic Refs setter/getter
	 */
	@Test
	public void setAndGetReadings() {
		//Start of user code basic set and get for readings reference
		Reading tmp = new Reading();
		this.wrapper.setReadings(tmp);
		Reading result = this.wrapper.getReadings();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetStep() {
		//Start of user code basic set and get for step reference
		Step tmp = new Step();
		this.wrapper.setStep(tmp);
		Step result = this.wrapper.getStep();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeReadingsTest() {
		//Start of user code basic opposite test for readings reference
		Reading elem1 = new Reading();
		this.wrapper.setReadings(elem1);
		//Point elem2 = elem1.getPoint();
		Point elem2 = elem1.getPoint();
		Assert.assertNotNull(elem2);
		Assert.assertEquals(elem1, elem2);
		//End of user code
	}
	@Test
	public void oppositeStepTest() {
		//Start of user code basic opposite test for step reference
		Step elem1 = new Step();
		this.wrapper.setStep(elem1);
		//Point elem2 = elem1.getPoints();
		Point elem2 = elem1.getPoints();
		Assert.assertNotNull(elem2);
		Assert.assertEquals(elem1, elem2);
		//End of user code
	}
	
	//Start of user code for test methods
	// Other test methods
	//End of user code
}
