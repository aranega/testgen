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
 * <!-- Start of user code comment for GazConfiguration Test Class
 * End of user code -->
 */


public class GazConfigurationTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private GazConfiguration wrapper;	

	@Before
	public void setup(){
		this.wrapper = new GazConfiguration();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetLeekRepartitionPercent() {
		//Start of user code basic set and get for leekRepartitionPercent attribute
		Double tmp = 0.0;
		this.wrapper.setLeekRepartitionPercent(tmp);
		Double result = this.wrapper.getLeekRepartitionPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRetentionInterface() {
		//Start of user code basic set and get for retentionInterface attribute
		Boolean tmp = false;
		this.wrapper.setRetentionInterface(tmp);
		Boolean result = this.wrapper.isRetentionInterface();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDroppedCeilFull() {
		//Start of user code basic set and get for droppedCeilFull attribute
		Boolean tmp = false;
		this.wrapper.setDroppedCeilFull(tmp);
		Boolean result = this.wrapper.isDroppedCeilFull();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRetentionGoal() {
		//Start of user code basic set and get for retentionGoal attribute
		Double tmp = 0.0;
		this.wrapper.setRetentionGoal(tmp);
		Double result = this.wrapper.getRetentionGoal();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetSlowUnloadingValue() {
		//Start of user code basic set and get for slowUnloadingValue attribute
		Double tmp = 0.0;
		this.wrapper.setSlowUnloadingValue(tmp);
		Double result = this.wrapper.getSlowUnloadingValue();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetSlowUnloading() {
		//Start of user code basic set and get for slowUnloading attribute
		Boolean tmp = false;
		this.wrapper.setSlowUnloading(tmp);
		Boolean result = this.wrapper.isSlowUnloading();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDroppedFloorFull() {
		//Start of user code basic set and get for droppedFloorFull attribute
		Boolean tmp = false;
		this.wrapper.setDroppedFloorFull(tmp);
		Boolean result = this.wrapper.isDroppedFloorFull();
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
	public void setAndGetBottleconfigurations() {
		//Start of user code basic set and get for bottleconfigurations reference
		BottleConfiguration tmp = new BottleConfiguration();
		this.wrapper.getBottleconfigurations().add(tmp);
		List<BottleConfiguration> result = this.wrapper.getBottleconfigurations();
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
