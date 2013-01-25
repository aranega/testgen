package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.CalibrationStepBuilder;
//import com.dooapp.firea.wrapper.CalibrationStep;

/*
 * Test Class
 * <!-- Start of user code comment for CalibrationStep Test Class
 * End of user code -->
 */


public class CalibrationStepBeanTest extends StepBean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private CalibrationStepBean bean;	

	@Before
	public void setup(){
		this.bean = new CalibrationStepBean();
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
	public void setAndGetBeforeHoleELA() {
		//Start of user code basic set and get for beforeHoleELA attribute
		Double tmp = 0.0;
		this.bean.setBeforeHoleELA(tmp);
		Double result = this.bean.getBeforeHoleELA();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetErrorPercent() {
		//Start of user code basic set and get for errorPercent attribute
		Double tmp = 0.0;
		this.bean.setErrorPercent(tmp);
		Double result = this.bean.getErrorPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetAfterHoleELA() {
		//Start of user code basic set and get for afterHoleELA attribute
		Double tmp = 0.0;
		this.bean.setAfterHoleELA(tmp);
		Double result = this.bean.getAfterHoleELA();
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
		SampleBean tmp = new SampleBean();
		this.bean.setSample(tmp);
		SampleBean result = this.bean.getSample();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetPoints() {
		//Start of user code basic set and get for points reference
		PointBean tmp = new PointBean();
		this.bean.setPoints(tmp);
		PointBean result = this.bean.getPoints();
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
