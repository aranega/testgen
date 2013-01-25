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
 * <!-- Start of user code comment for Reading Test Class
 * End of user code -->
 */


public class ReadingTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private Reading wrapper;	

	@Before
	public void setup(){
		this.wrapper = new Reading();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetTimeAverage() {
		//Start of user code basic set and get for timeAverage attribute
		Integer tmp = 0;
		this.wrapper.setTimeAverage(tmp);
		Integer result = this.wrapper.getTimeAverage();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetFanPressure() {
		//Start of user code basic set and get for fanPressure attribute
		Double tmp = 0.0;
		this.wrapper.setFanPressure(tmp);
		Double result = this.wrapper.getFanPressure();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetLowFlow() {
		//Start of user code basic set and get for lowFlow attribute
		Boolean tmp = false;
		this.wrapper.setLowFlow(tmp);
		Boolean result = this.wrapper.isLowFlow();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetBuildingPressure() {
		//Start of user code basic set and get for buildingPressure attribute
		Double tmp = 0.0;
		this.wrapper.setBuildingPressure(tmp);
		Double result = this.wrapper.getBuildingPressure();
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
	public void setAndGetPoint() {
		//Start of user code basic set and get for point reference
		Point tmp = new Point();
		this.wrapper.setPoint(tmp);
		Point result = this.wrapper.getPoint();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDevice() {
		//Start of user code basic set and get for device reference
		Device tmp = new Device();
		this.wrapper.setDevice(tmp);
		Device result = this.wrapper.getDevice();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetGaugemode() {
		//Start of user code basic set and get for gaugemode reference
		GaugeMode tmp = new GaugeMode();
		this.wrapper.setGaugemode(tmp);
		GaugeMode result = this.wrapper.getGaugemode();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositePointTest() {
		//Start of user code basic opposite test for point reference
		Point elem1 = new Point();
		this.wrapper.setPoint(elem1);
		//Reading elem2 = elem1.getReadings();
		Reading elem2 = elem1.getReadings();
		Assert.assertNotNull(elem2);
		Assert.assertEquals(elem1, elem2);
		//End of user code
	}
	
	//Start of user code for test methods
	// Other test methods
	//End of user code
}
