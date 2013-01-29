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
 * <!-- Start of user code comment for Sample Test Class
 * End of user code -->
 */


public class SampleTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private Sample wrapper;	

	@Before
	public void setup(){
		this.wrapper = new Sample();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetTetaI() {
		//Start of user code basic set and get for tetaI attribute
		Double tmp = 0.0;
		this.wrapper.setTetaI(tmp);
		Double result = this.wrapper.getTetaI();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRoI() {
		//Start of user code basic set and get for roI attribute
		Double tmp = 0.0;
		this.wrapper.setRoI(tmp);
		Double result = this.wrapper.getRoI();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
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
	public void setAndGetName() {
		//Start of user code basic set and get for name attribute
		String tmp = "";
		this.wrapper.setName(tmp);
		String result = this.wrapper.getName();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetAirPressureCalculationMethod() {
		//Start of user code basic set and get for airPressureCalculationMethod attribute
		String tmp = "";
		this.wrapper.setAirPressureCalculationMethod(tmp);
		String result = this.wrapper.getAirPressureCalculationMethod();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetAirPressure() {
		//Start of user code basic set and get for airPressure attribute
		Integer tmp = 0;
		this.wrapper.setAirPressure(tmp);
		Integer result = this.wrapper.getAirPressure();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetHighUp() {
		//Start of user code basic set and get for highUp attribute
		Integer tmp = 0;
		this.wrapper.setHighUp(tmp);
		Integer result = this.wrapper.getHighUp();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetWindMeasure() {
		//Start of user code basic set and get for windMeasure attribute
		Double tmp = 0.0;
		this.wrapper.setWindMeasure(tmp);
		Double result = this.wrapper.getWindMeasure();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetPhiIPercent() {
		//Start of user code basic set and get for phiIPercent attribute
		Double tmp = 0.0;
		this.wrapper.setPhiIPercent(tmp);
		Double result = this.wrapper.getPhiIPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetTetaE() {
		//Start of user code basic set and get for tetaE attribute
		Double tmp = 0.0;
		this.wrapper.setTetaE(tmp);
		Double result = this.wrapper.getTetaE();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetBeaufortScale() {
		//Start of user code basic set and get for beaufortScale attribute
		String tmp = "";
		this.wrapper.setBeaufortScale(tmp);
		String result = this.wrapper.getBeaufortScale();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetPhiEPercent() {
		//Start of user code basic set and get for phiEPercent attribute
		Double tmp = 0.0;
		this.wrapper.setPhiEPercent(tmp);
		Double result = this.wrapper.getPhiEPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRoE() {
		//Start of user code basic set and get for roE attribute
		Double tmp = 0.0;
		this.wrapper.setRoE(tmp);
		Double result = this.wrapper.getRoE();
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
	public void setAndGetStep() {
		//Start of user code basic set and get for step reference
		Step tmp = new Step();
		this.wrapper.getStep().add(tmp);
		List<Step> result = this.wrapper.getStep();
		Assert.assertTrue(result.contains(tmp));
		//End of user code
	}
	@Test
	public void setAndGetProject() {
		//Start of user code basic set and get for project reference
		Project tmp = new Project();
		this.wrapper.setProject(tmp);
		Project result = this.wrapper.getProject();
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
