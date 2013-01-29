package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.ReadingBuilder;
//import com.dooapp.firea.wrapper.Reading;

/*
 * Test Class
 * <!-- Start of user code comment for Reading Test Class
 * End of user code -->
 */


public class ReadingBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private ReadingBean bean;	

	@Before
	public void setup(){
		this.bean = new ReadingBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetTimeAverage() {
		//Start of user code basic set and get for timeAverage attribute
		Integer tmp = 0;
		this.bean.setTimeAverage(tmp);
		Integer result = this.bean.getTimeAverage();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetLowFlow() {
		//Start of user code basic set and get for lowFlow attribute
		Boolean tmp = false;
		this.bean.setLowFlow(tmp);
		Boolean result = this.bean.isLowFlow();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetBuildingPressure() {
		//Start of user code basic set and get for buildingPressure attribute
		Double tmp = 0.0;
		this.bean.setBuildingPressure(tmp);
		Double result = this.bean.getBuildingPressure();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetFanPressure() {
		//Start of user code basic set and get for fanPressure attribute
		Double tmp = 0.0;
		this.bean.setFanPressure(tmp);
		Double result = this.bean.getFanPressure();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetId() {
		//Start of user code basic set and get for id attribute
		Long tmp = 0L;
		this.bean.setId(tmp);
		Long result = this.bean.getId();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCreationDate() {
		//Start of user code basic set and get for creationDate attribute
		java.util.Date tmp = new java.util.Date();
		this.bean.setCreationDate(tmp);
		java.util.Date result = this.bean.getCreationDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetUpdateDate() {
		//Start of user code basic set and get for updateDate attribute
		java.util.Date tmp = new java.util.Date();
		this.bean.setUpdateDate(tmp);
		java.util.Date result = this.bean.getUpdateDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetVersion() {
		//Start of user code basic set and get for version attribute
		Integer tmp = 0;
		this.bean.setVersion(tmp);
		Integer result = this.bean.getVersion();
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
		PointBean tmp = new PointBean();
		this.bean.setPoint(tmp);
		PointBean result = this.bean.getPoint();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetGaugemode() {
		//Start of user code basic set and get for gaugemode reference
		GaugeModeBean tmp = new GaugeModeBean();
		this.bean.setGaugemode(tmp);
		GaugeModeBean result = this.bean.getGaugemode();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDevice() {
		//Start of user code basic set and get for device reference
		DeviceBean tmp = new DeviceBean();
		this.bean.addDevice(tmp);
		List<DeviceBean> result = this.bean.getDevice();
		Assert.assertTrue(result.contains(tmp));
		//End of user code
	}
	
	/*
	 * Basic Refs opposite tester
	 */	
	

	/*
     *  toXML
     */
    @Test
    public void toXMLTest() { 
    	//Start of user code XML production
    	this.bean.toXML();
    	//End of user code
    }
	//Start of user code for test methods
	// Other test methods
	//End of user code
}
