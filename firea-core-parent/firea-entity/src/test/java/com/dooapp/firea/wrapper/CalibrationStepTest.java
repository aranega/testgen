package com.dooapp.firea.wrapper;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Test Class
 * <!-- Start of user code comment for CalibrationStep Test Class
 * End of user code -->
 */


public class CalibrationStepTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private CalibrationStep wrapper;	

	@Before
	public void setup(){
		this.wrapper = new CalibrationStep();
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
	public void setAndGetAfterHoleELA() {
		//Start of user code basic set and get for afterHoleELA attribute
		Double tmp = 0.0;
		this.wrapper.setAfterHoleELA(tmp);
		Double result = this.wrapper.getAfterHoleELA();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetErrorPercent() {
		//Start of user code basic set and get for errorPercent attribute
		Double tmp = 0.0;
		this.wrapper.setErrorPercent(tmp);
		Double result = this.wrapper.getErrorPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetBeforeHoleELA() {
		//Start of user code basic set and get for beforeHoleELA attribute
		Double tmp = 0.0;
		this.wrapper.setBeforeHoleELA(tmp);
		Double result = this.wrapper.getBeforeHoleELA();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	
	/*
	 * Basic Refs setter/getter
	 */
	@Test
	public void setAndGetPoints() {
		//Start of user code basic set and get for points reference
		Point tmp = new Point();
		this.wrapper.getPoints().add(tmp);
		List<Point> result = this.wrapper.getPoints();
		Assert.assertTrue(result.contains(tmp));
		//End of user code
	}
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
	

	/*
	 * toXML
	 */
	@Test
	public void toXML() { 
		//Start of user code XML production
		this.wrapper.toXML();
		//End of user code
	}
	
	//Start of user code for test methods
	// Other test methods
	//End of user code
}
