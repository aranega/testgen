package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.DeviceBuilder;
//import com.dooapp.firea.wrapper.Device;

/*
 * Test Class
 * <!-- Start of user code comment for Device Test Class
 * End of user code -->
 */


public class DeviceBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private DeviceBean bean;	

	@Before
	public void setup(){
		this.bean = new DeviceBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetSerialNumber() {
		//Start of user code basic set and get for serialNumber attribute
		String tmp = "";
		this.bean.setSerialNumber(tmp);
		String result = this.bean.getSerialNumber();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetLastCalibrationDate() {
		//Start of user code basic set and get for lastCalibrationDate attribute
		java.util.Date tmp = new java.util.Date();
		this.bean.setLastCalibrationDate(tmp);
		java.util.Date result = this.bean.getLastCalibrationDate();
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
	
	/*
	 * Basic Refs opposite tester
	 */	
	
	//Start of user code for test methods
	// Other test methods
	//End of user code
}
