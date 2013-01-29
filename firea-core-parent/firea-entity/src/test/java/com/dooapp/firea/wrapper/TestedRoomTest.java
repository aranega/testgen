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
 * <!-- Start of user code comment for TestedRoom Test Class
 * End of user code -->
 */


public class TestedRoomTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private TestedRoom wrapper;	

	@Before
	public void setup(){
		this.wrapper = new TestedRoom();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetClimDuct() {
		//Start of user code basic set and get for climDuct attribute
		Boolean tmp = false;
		this.wrapper.setClimDuct(tmp);
		Boolean result = this.wrapper.isClimDuct();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetIndicatedVolume() {
		//Start of user code basic set and get for indicatedVolume attribute
		Integer tmp = 0;
		this.wrapper.setIndicatedVolume(tmp);
		Integer result = this.wrapper.getIndicatedVolume();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRisqueHeightPercent() {
		//Start of user code basic set and get for risqueHeightPercent attribute
		Double tmp = 0.0;
		this.wrapper.setRisqueHeightPercent(tmp);
		Double result = this.wrapper.getRisqueHeightPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCommissioningDate() {
		//Start of user code basic set and get for CommissioningDate attribute
		java.util.Date tmp = new java.util.Date();
		this.wrapper.setCommissioningDate(tmp);
		java.util.Date result = this.wrapper.getCommissioningDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetUnloadTime() {
		//Start of user code basic set and get for unloadTime attribute
		Integer tmp = 0;
		this.wrapper.setUnloadTime(tmp);
		Integer result = this.wrapper.getUnloadTime();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetNetVolume() {
		//Start of user code basic set and get for netVolume attribute
		Integer tmp = 0;
		this.wrapper.setNetVolume(tmp);
		Integer result = this.wrapper.getNetVolume();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetAltitude() {
		//Start of user code basic set and get for altitude attribute
		Integer tmp = 0;
		this.wrapper.setAltitude(tmp);
		Integer result = this.wrapper.getAltitude();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetVolumeCorrection() {
		//Start of user code basic set and get for volumeCorrection attribute
		Integer tmp = 0;
		this.wrapper.setVolumeCorrection(tmp);
		Integer result = this.wrapper.getVolumeCorrection();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetUniformHorizontality() {
		//Start of user code basic set and get for uniformHorizontality attribute
		Boolean tmp = false;
		this.wrapper.setUniformHorizontality(tmp);
		Boolean result = this.wrapper.isUniformHorizontality();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetChoosenProtectedHeight() {
		//Start of user code basic set and get for choosenProtectedHeight attribute
		Integer tmp = 0;
		this.wrapper.setChoosenProtectedHeight(tmp);
		Integer result = this.wrapper.getChoosenProtectedHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRisqueHeight() {
		//Start of user code basic set and get for risqueHeight attribute
		Integer tmp = 0;
		this.wrapper.setRisqueHeight(tmp);
		Integer result = this.wrapper.getRisqueHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDroppedCeiling() {
		//Start of user code basic set and get for droppedCeiling attribute
		Integer tmp = 0;
		this.wrapper.setDroppedCeiling(tmp);
		Integer result = this.wrapper.getDroppedCeiling();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClapetsCF() {
		//Start of user code basic set and get for clapetsCF attribute
		Boolean tmp = false;
		this.wrapper.setClapetsCF(tmp);
		Boolean result = this.wrapper.isClapetsCF();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClimWithNewAir() {
		//Start of user code basic set and get for climWithNewAir attribute
		Boolean tmp = false;
		this.wrapper.setClimWithNewAir(tmp);
		Boolean result = this.wrapper.isClimWithNewAir();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetMinimalProtectedHeight() {
		//Start of user code basic set and get for minimalProtectedHeight attribute
		Integer tmp = 0;
		this.wrapper.setMinimalProtectedHeight(tmp);
		Integer result = this.wrapper.getMinimalProtectedHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetMeasuredVolume() {
		//Start of user code basic set and get for measuredVolume attribute
		Integer tmp = 0;
		this.wrapper.setMeasuredVolume(tmp);
		Integer result = this.wrapper.getMeasuredVolume();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDroppedFloor() {
		//Start of user code basic set and get for droppedFloor attribute
		Integer tmp = 0;
		this.wrapper.setDroppedFloor(tmp);
		Integer result = this.wrapper.getDroppedFloor();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClimVMC() {
		//Start of user code basic set and get for climVMC attribute
		Boolean tmp = false;
		this.wrapper.setClimVMC(tmp);
		Boolean result = this.wrapper.isClimVMC();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClimReclycleAuto() {
		//Start of user code basic set and get for climReclycleAuto attribute
		Boolean tmp = false;
		this.wrapper.setClimReclycleAuto(tmp);
		Boolean result = this.wrapper.isClimReclycleAuto();
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
	public void setAndGetMecanicalStrength() {
		//Start of user code basic set and get for mecanicalStrength attribute
		Integer tmp = 0;
		this.wrapper.setMecanicalStrength(tmp);
		Integer result = this.wrapper.getMecanicalStrength();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClimWithNewAirAuto() {
		//Start of user code basic set and get for climWithNewAirAuto attribute
		Boolean tmp = false;
		this.wrapper.setClimWithNewAirAuto(tmp);
		Boolean result = this.wrapper.isClimWithNewAirAuto();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetTotalHeight() {
		//Start of user code basic set and get for totalHeight attribute
		Integer tmp = 0;
		this.wrapper.setTotalHeight(tmp);
		Integer result = this.wrapper.getTotalHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClimVMCAuto() {
		//Start of user code basic set and get for climVMCAuto attribute
		Boolean tmp = false;
		this.wrapper.setClimVMCAuto(tmp);
		Boolean result = this.wrapper.isClimVMCAuto();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetClimReclycle() {
		//Start of user code basic set and get for climReclycle attribute
		Boolean tmp = false;
		this.wrapper.setClimReclycle(tmp);
		Boolean result = this.wrapper.isClimReclycle();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetMainHeight() {
		//Start of user code basic set and get for mainHeight attribute
		Integer tmp = 0;
		this.wrapper.setMainHeight(tmp);
		Integer result = this.wrapper.getMainHeight();
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
	public void setAndGetBlowholes() {
		//Start of user code basic set and get for blowholes reference
		BlowHole tmp = new BlowHole();
		this.wrapper.getBlowholes().add(tmp);
		List<BlowHole> result = this.wrapper.getBlowholes();
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
