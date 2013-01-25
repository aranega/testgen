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
 * <!-- Start of user code comment for MainStep Test Class
 * End of user code -->
 */


public class MainStepTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private MainStep wrapper;	

	@Before
	public void setup(){
		this.wrapper = new MainStep();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetDate() {
		//Start of user code basic set and get for date attribute
		java.util.Date tmp = new java.util.Date();
		this.wrapper.setDate(tmp);
		java.util.Date result = this.wrapper.getDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetStatus() {
		//Start of user code basic set and get for status attribute
		String tmp = "";
		this.wrapper.setStatus(tmp);
		String result = this.wrapper.getStatus();
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
	@Test
	public void setAndGetCorrelation() {
		//Start of user code basic set and get for correlation attribute
		Double tmp = 0.0;
		this.wrapper.setCorrelation(tmp);
		Double result = this.wrapper.getCorrelation();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCl() {
		//Start of user code basic set and get for cl attribute
		Double tmp = 0.0;
		this.wrapper.setCl(tmp);
		Double result = this.wrapper.getCl();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetN() {
		//Start of user code basic set and get for n attribute
		Double tmp = 0.0;
		this.wrapper.setN(tmp);
		Double result = this.wrapper.getN();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCalculatedELA() {
		//Start of user code basic set and get for calculatedELA attribute
		Double tmp = 0.0;
		this.wrapper.setCalculatedELA(tmp);
		Double result = this.wrapper.getCalculatedELA();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDirection() {
		//Start of user code basic set and get for direction attribute
		String tmp = "";
		this.wrapper.setDirection(tmp);
		String result = this.wrapper.getDirection();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	
	/*
	 * Basic Refs setter/getter
	 */
	@Test
	public void setAndGetSample() {
		//Start of user code basic set and get for sample reference
		Sample tmp = new Sample();
		this.wrapper.setSample(tmp);
		Sample result = this.wrapper.getSample();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetPoints() {
		//Start of user code basic set and get for points reference
		Point tmp = new Point();
		this.wrapper.setPoints(tmp);
		Point result = this.wrapper.getPoints();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeSampleTest() {
		//Start of user code basic opposite test for sample reference
		Sample elem1 = new Sample();
		this.wrapper.setSample(elem1);
		//MainStep elem2 = elem1.getStep();
		Step elem2 = elem1.getStep();
		Assert.assertNotNull(elem2);
		Assert.assertEquals(elem1, elem2);
		//End of user code
	}
	@Test
	public void oppositePointsTest() {
		//Start of user code basic opposite test for points reference
		Point elem1 = new Point();
		this.wrapper.setPoints(elem1);
		//MainStep elem2 = elem1.getStep();
		Step elem2 = elem1.getStep();
		Assert.assertNotNull(elem2);
		Assert.assertEquals(elem1, elem2);
		//End of user code
	}
	
	//Start of user code for test methods
	// Other test methods
	//End of user code
}
