package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.MainStepBuilder;
//import com.dooapp.firea.wrapper.MainStep;

/*
 * Test Class
 * <!-- Start of user code comment for MainStep Test Class
 * End of user code -->
 */


public class MainStepBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private MainStepBean bean;	

	@Before
	public void setup(){
		this.bean = new MainStepBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetDate() {
		//Start of user code basic set and get for date attribute
		java.util.Date tmp = new java.util.Date();
		this.bean.setDate(tmp);
		java.util.Date result = this.bean.getDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetStatus() {
		//Start of user code basic set and get for status attribute
		String tmp = "";
		this.bean.setStatus(tmp);
		String result = this.bean.getStatus();
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
	@Test
	public void setAndGetDirection() {
		//Start of user code basic set and get for direction attribute
		String tmp = "";
		this.bean.setDirection(tmp);
		String result = this.bean.getDirection();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCorrelation() {
		//Start of user code basic set and get for correlation attribute
		Double tmp = 0.0;
		this.bean.setCorrelation(tmp);
		Double result = this.bean.getCorrelation();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetN() {
		//Start of user code basic set and get for n attribute
		Double tmp = 0.0;
		this.bean.setN(tmp);
		Double result = this.bean.getN();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCl() {
		//Start of user code basic set and get for cl attribute
		Double tmp = 0.0;
		this.bean.setCl(tmp);
		Double result = this.bean.getCl();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCalculatedELA() {
		//Start of user code basic set and get for calculatedELA attribute
		Double tmp = 0.0;
		this.bean.setCalculatedELA(tmp);
		Double result = this.bean.getCalculatedELA();
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
		PointBean tmp = new PointBean();
		this.bean.addPoints(tmp);
		List<PointBean> result = this.bean.getPoints();
		Assert.assertTrue(result.contains(tmp));
		//End of user code
	}
	@Test
	public void setAndGetSample() {
		//Start of user code basic set and get for sample reference
		SampleBean tmp = new SampleBean();
		this.bean.setSample(tmp);
		SampleBean result = this.bean.getSample();
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
