package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.SampleBuilder;
//import com.dooapp.firea.wrapper.Sample;

/*
 * Test Class
 * <!-- Start of user code comment for Sample Test Class
 * End of user code -->
 */


public class SampleBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private SampleBean bean;	

	@Before
	public void setup(){
		this.bean = new SampleBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetTetaI() {
		//Start of user code basic set and get for tetaI attribute
		Double tmp = 0.0;
		this.bean.setTetaI(tmp);
		Double result = this.bean.getTetaI();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRoI() {
		//Start of user code basic set and get for roI attribute
		Double tmp = 0.0;
		this.bean.setRoI(tmp);
		Double result = this.bean.getRoI();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
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
	public void setAndGetAirPressureCalculationMethod() {
		//Start of user code basic set and get for airPressureCalculationMethod attribute
		String tmp = "";
		this.bean.setAirPressureCalculationMethod(tmp);
		String result = this.bean.getAirPressureCalculationMethod();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetAirPressure() {
		//Start of user code basic set and get for airPressure attribute
		Integer tmp = 0;
		this.bean.setAirPressure(tmp);
		Integer result = this.bean.getAirPressure();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetHighUp() {
		//Start of user code basic set and get for highUp attribute
		Integer tmp = 0;
		this.bean.setHighUp(tmp);
		Integer result = this.bean.getHighUp();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetWindMeasure() {
		//Start of user code basic set and get for windMeasure attribute
		Double tmp = 0.0;
		this.bean.setWindMeasure(tmp);
		Double result = this.bean.getWindMeasure();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetPhiIPercent() {
		//Start of user code basic set and get for phiIPercent attribute
		Double tmp = 0.0;
		this.bean.setPhiIPercent(tmp);
		Double result = this.bean.getPhiIPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetTetaE() {
		//Start of user code basic set and get for tetaE attribute
		Double tmp = 0.0;
		this.bean.setTetaE(tmp);
		Double result = this.bean.getTetaE();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetBeaufortScale() {
		//Start of user code basic set and get for beaufortScale attribute
		String tmp = "";
		this.bean.setBeaufortScale(tmp);
		String result = this.bean.getBeaufortScale();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetPhiEPercent() {
		//Start of user code basic set and get for phiEPercent attribute
		Double tmp = 0.0;
		this.bean.setPhiEPercent(tmp);
		Double result = this.bean.getPhiEPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRoE() {
		//Start of user code basic set and get for roE attribute
		Double tmp = 0.0;
		this.bean.setRoE(tmp);
		Double result = this.bean.getRoE();
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
	public void setAndGetStep() {
		//Start of user code basic set and get for step reference
		StepBean tmp = new StepBean();
		this.bean.addStep(tmp);
		List<StepBean> result = this.bean.getStep();
		Assert.assertTrue(result.contains(tmp));
		//End of user code
	}
	@Test
	public void setAndGetProject() {
		//Start of user code basic set and get for project reference
		ProjectBean tmp = new ProjectBean();
		this.bean.setProject(tmp);
		ProjectBean result = this.bean.getProject();
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
