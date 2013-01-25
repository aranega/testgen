package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.GazConfigurationBuilder;
//import com.dooapp.firea.wrapper.GazConfiguration;

/*
 * Test Class
 * <!-- Start of user code comment for GazConfiguration Test Class
 * End of user code -->
 */


public class GazConfigurationBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private GazConfigurationBean bean;	

	@Before
	public void setup(){
		this.bean = new GazConfigurationBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetDroppedCeilFull() {
		//Start of user code basic set and get for droppedCeilFull attribute
		Boolean tmp = false;
		this.bean.setDroppedCeilFull(tmp);
		Boolean result = this.bean.isDroppedCeilFull();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetSlowUnloadingValue() {
		//Start of user code basic set and get for slowUnloadingValue attribute
		Double tmp = 0.0;
		this.bean.setSlowUnloadingValue(tmp);
		Double result = this.bean.getSlowUnloadingValue();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetSlowUnloading() {
		//Start of user code basic set and get for slowUnloading attribute
		Boolean tmp = false;
		this.bean.setSlowUnloading(tmp);
		Boolean result = this.bean.isSlowUnloading();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetLeekRepartitionPercent() {
		//Start of user code basic set and get for leekRepartitionPercent attribute
		Double tmp = 0.0;
		this.bean.setLeekRepartitionPercent(tmp);
		Double result = this.bean.getLeekRepartitionPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRetentionInterface() {
		//Start of user code basic set and get for retentionInterface attribute
		Boolean tmp = false;
		this.bean.setRetentionInterface(tmp);
		Boolean result = this.bean.isRetentionInterface();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRetentionGoal() {
		//Start of user code basic set and get for retentionGoal attribute
		Double tmp = 0.0;
		this.bean.setRetentionGoal(tmp);
		Double result = this.bean.getRetentionGoal();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDroppedFloorFull() {
		//Start of user code basic set and get for droppedFloorFull attribute
		Boolean tmp = false;
		this.bean.setDroppedFloorFull(tmp);
		Boolean result = this.bean.isDroppedFloorFull();
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
	public void setAndGetGaz() {
		//Start of user code basic set and get for gaz reference
		GazBean tmp = new GazBean();
		this.bean.setGaz(tmp);
		GazBean result = this.bean.getGaz();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
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
	@Test
	public void setAndGetBottleconfigurations() {
		//Start of user code basic set and get for bottleconfigurations reference
		BottleConfigurationBean tmp = new BottleConfigurationBean();
		this.bean.setBottleconfigurations(tmp);
		BottleConfigurationBean result = this.bean.getBottleconfigurations();
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
