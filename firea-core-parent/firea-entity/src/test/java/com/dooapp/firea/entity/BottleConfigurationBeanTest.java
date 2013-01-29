package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.BottleConfigurationBuilder;
//import com.dooapp.firea.wrapper.BottleConfiguration;

/*
 * Test Class
 * <!-- Start of user code comment for BottleConfiguration Test Class
 * End of user code -->
 */


public class BottleConfigurationBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private BottleConfigurationBean bean;	

	@Before
	public void setup(){
		this.bean = new BottleConfigurationBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetQuantity() {
		//Start of user code basic set and get for quantity attribute
		Integer tmp = 0;
		this.bean.setQuantity(tmp);
		Integer result = this.bean.getQuantity();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetLoad() {
		//Start of user code basic set and get for load attribute
		Double tmp = 0.0;
		this.bean.setLoad(tmp);
		Double result = this.bean.getLoad();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetUnit() {
		//Start of user code basic set and get for unit attribute
		String tmp = "";
		this.bean.setUnit(tmp);
		String result = this.bean.getUnit();
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
	public void setAndGetGazconfiguration() {
		//Start of user code basic set and get for gazconfiguration reference
		GazConfigurationBean tmp = new GazConfigurationBean();
		this.bean.setGazconfiguration(tmp);
		GazConfigurationBean result = this.bean.getGazconfiguration();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetBottletype() {
		//Start of user code basic set and get for bottletype reference
		BottleTypeBean tmp = new BottleTypeBean();
		this.bean.setBottletype(tmp);
		BottleTypeBean result = this.bean.getBottletype();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
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
