package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.TestedRoomBuilder;
//import com.dooapp.firea.wrapper.TestedRoom;

/*
 * Test Class
 * <!-- Start of user code comment for TestedRoom Test Class
 * End of user code -->
 */


public class TestedRoomBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private TestedRoomBean bean;	

	@Before
	public void setup(){
		this.bean = new TestedRoomBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetClimDuct() {
		//Start of user code basic set and get for climDuct attribute
		Boolean tmp = false;
		this.bean.setClimDuct(tmp);
		Boolean result = this.bean.isClimDuct();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetIndicatedVolume() {
		//Start of user code basic set and get for indicatedVolume attribute
		Integer tmp = 0;
		this.bean.setIndicatedVolume(tmp);
		Integer result = this.bean.getIndicatedVolume();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRisqueHeightPercent() {
		//Start of user code basic set and get for risqueHeightPercent attribute
		Double tmp = 0.0;
		this.bean.setRisqueHeightPercent(tmp);
		Double result = this.bean.getRisqueHeightPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCommissioningDate() {
		//Start of user code basic set and get for CommissioningDate attribute
		java.util.Date tmp = new java.util.Date();
		this.bean.setCommissioningDate(tmp);
		java.util.Date result = this.bean.getCommissioningDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetUnloadTime() {
		//Start of user code basic set and get for unloadTime attribute
		Integer tmp = 0;
		this.bean.setUnloadTime(tmp);
		Integer result = this.bean.getUnloadTime();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetNetVolume() {
		//Start of user code basic set and get for netVolume attribute
		Integer tmp = 0;
		this.bean.setNetVolume(tmp);
		Integer result = this.bean.getNetVolume();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetAltitude() {
		//Start of user code basic set and get for altitude attribute
		Integer tmp = 0;
		this.bean.setAltitude(tmp);
		Integer result = this.bean.getAltitude();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetVolumeCorrection() {
		//Start of user code basic set and get for volumeCorrection attribute
		Integer tmp = 0;
		this.bean.setVolumeCorrection(tmp);
		Integer result = this.bean.getVolumeCorrection();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetUniformHorizontality() {
		//Start of user code basic set and get for uniformHorizontality attribute
		Boolean tmp = false;
		this.bean.setUniformHorizontality(tmp);
		Boolean result = this.bean.isUniformHorizontality();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetChoosenProtectedHeight() {
		//Start of user code basic set and get for choosenProtectedHeight attribute
		Integer tmp = 0;
		this.bean.setChoosenProtectedHeight(tmp);
		Integer result = this.bean.getChoosenProtectedHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRisqueHeight() {
		//Start of user code basic set and get for risqueHeight attribute
		Integer tmp = 0;
		this.bean.setRisqueHeight(tmp);
		Integer result = this.bean.getRisqueHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDroppedCeiling() {
		//Start of user code basic set and get for droppedCeiling attribute
		Integer tmp = 0;
		this.bean.setDroppedCeiling(tmp);
		Integer result = this.bean.getDroppedCeiling();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClapetsCF() {
		//Start of user code basic set and get for clapetsCF attribute
		Boolean tmp = false;
		this.bean.setClapetsCF(tmp);
		Boolean result = this.bean.isClapetsCF();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClimWithNewAir() {
		//Start of user code basic set and get for climWithNewAir attribute
		Boolean tmp = false;
		this.bean.setClimWithNewAir(tmp);
		Boolean result = this.bean.isClimWithNewAir();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetMinimalProtectedHeight() {
		//Start of user code basic set and get for minimalProtectedHeight attribute
		Integer tmp = 0;
		this.bean.setMinimalProtectedHeight(tmp);
		Integer result = this.bean.getMinimalProtectedHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetMeasuredVolume() {
		//Start of user code basic set and get for measuredVolume attribute
		Integer tmp = 0;
		this.bean.setMeasuredVolume(tmp);
		Integer result = this.bean.getMeasuredVolume();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDroppedFloor() {
		//Start of user code basic set and get for droppedFloor attribute
		Integer tmp = 0;
		this.bean.setDroppedFloor(tmp);
		Integer result = this.bean.getDroppedFloor();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClimVMC() {
		//Start of user code basic set and get for climVMC attribute
		Boolean tmp = false;
		this.bean.setClimVMC(tmp);
		Boolean result = this.bean.isClimVMC();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClimReclycleAuto() {
		//Start of user code basic set and get for climReclycleAuto attribute
		Boolean tmp = false;
		this.bean.setClimReclycleAuto(tmp);
		Boolean result = this.bean.isClimReclycleAuto();
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
	public void setAndGetMecanicalStrength() {
		//Start of user code basic set and get for mecanicalStrength attribute
		Integer tmp = 0;
		this.bean.setMecanicalStrength(tmp);
		Integer result = this.bean.getMecanicalStrength();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClimWithNewAirAuto() {
		//Start of user code basic set and get for climWithNewAirAuto attribute
		Boolean tmp = false;
		this.bean.setClimWithNewAirAuto(tmp);
		Boolean result = this.bean.isClimWithNewAirAuto();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetTotalHeight() {
		//Start of user code basic set and get for totalHeight attribute
		Integer tmp = 0;
		this.bean.setTotalHeight(tmp);
		Integer result = this.bean.getTotalHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClimVMCAuto() {
		//Start of user code basic set and get for climVMCAuto attribute
		Boolean tmp = false;
		this.bean.setClimVMCAuto(tmp);
		Boolean result = this.bean.isClimVMCAuto();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClimReclycle() {
		//Start of user code basic set and get for climReclycle attribute
		Boolean tmp = false;
		this.bean.setClimReclycle(tmp);
		Boolean result = this.bean.isClimReclycle();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetMainHeight() {
		//Start of user code basic set and get for mainHeight attribute
		Integer tmp = 0;
		this.bean.setMainHeight(tmp);
		Integer result = this.bean.getMainHeight();
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
	public void setAndGetBlowholes() {
		//Start of user code basic set and get for blowholes reference
		BlowHoleBean tmp = new BlowHoleBean();
		this.bean.addBlowholes(tmp);
		List<BlowHoleBean> result = this.bean.getBlowholes();
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
