package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.GazBuilder;
//import com.dooapp.firea.wrapper.Gaz;

/*
 * Test Class
 * <!-- Start of user code comment for Gaz Test Class
 * End of user code -->
 */


public class GazBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private GazBean bean;	

	@Before
	public void setup(){
		this.bean = new GazBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetName() {
		//Start of user code basic set and get for name attribute
		String tmp = "";
		this.bean.setName(tmp);
		String result = this.bean.getName();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetWeight() {
		//Start of user code basic set and get for weight attribute
		String tmp = "";
		this.bean.setWeight(tmp);
		String result = this.bean.getWeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetType() {
		//Start of user code basic set and get for type attribute
		String tmp = "";
		this.bean.setType(tmp);
		String result = this.bean.getType();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDensity() {
		//Start of user code basic set and get for density attribute
		Double tmp = 0.0;
		this.bean.setDensity(tmp);
		Double result = this.bean.getDensity();
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
	public void setAndGetBottletypes() {
		//Start of user code basic set and get for bottletypes reference
		BottleTypeBean tmp = new BottleTypeBean();
		this.bean.setBottletypes(tmp);
		BottleTypeBean result = this.bean.getBottletypes();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetGazconfiguration() {
		//Start of user code basic set and get for gazconfiguration reference
		GazConfigurationBean tmp = new GazConfigurationBean();
		this.bean.setGazconfiguration(tmp);
		GazConfigurationBean result = this.bean.getGazconfiguration();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	
	/*
	 * Basic Refs opposite tester
	 */	
	
	//Start of user code for test methods
	// Other test methods
	//End of user code
}
