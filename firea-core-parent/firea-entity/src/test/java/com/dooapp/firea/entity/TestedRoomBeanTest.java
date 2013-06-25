package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class TestedRoomBeanTest
{
	/**
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
   	 * @generated
	 */
	private TestedRoomBean bean;	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Before
	public void setup(){
		this.bean = new TestedRoomBean();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@After
	public void teardown(){
		this.bean = null;
	}

	/***************************
	 * Basic Atts setter/getter
	 ***************************/

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetClimWithNewAir() {
		Boolean tmp = false;
		this.bean.setClimWithNewAir(tmp);
		Boolean result = this.bean.isClimWithNewAir();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetMinimalProtectedHeight() {
		Integer tmp = 0;
		this.bean.setMinimalProtectedHeight(tmp);
		Integer result = this.bean.getMinimalProtectedHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetClapetsCF() {
		Boolean tmp = false;
		this.bean.setClapetsCF(tmp);
		Boolean result = this.bean.isClapetsCF();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetVolumeCorrection() {
		Integer tmp = 0;
		this.bean.setVolumeCorrection(tmp);
		Integer result = this.bean.getVolumeCorrection();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetClimDuct() {
		Boolean tmp = false;
		this.bean.setClimDuct(tmp);
		Boolean result = this.bean.isClimDuct();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetNetVolume() {
		Integer tmp = 0;
		this.bean.setNetVolume(tmp);
		Integer result = this.bean.getNetVolume();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetUnloadTime() {
		Integer tmp = 0;
		this.bean.setUnloadTime(tmp);
		Integer result = this.bean.getUnloadTime();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetClimVMC() {
		Boolean tmp = false;
		this.bean.setClimVMC(tmp);
		Boolean result = this.bean.isClimVMC();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetClimVMCAuto() {
		Boolean tmp = false;
		this.bean.setClimVMCAuto(tmp);
		Boolean result = this.bean.isClimVMCAuto();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetRisqueHeightPercent() {
		Double tmp = 0.0;
		this.bean.setRisqueHeightPercent(tmp);
		Double result = this.bean.getRisqueHeightPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetClimReclycleAuto() {
		Boolean tmp = false;
		this.bean.setClimReclycleAuto(tmp);
		Boolean result = this.bean.isClimReclycleAuto();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetClimReclycle() {
		Boolean tmp = false;
		this.bean.setClimReclycle(tmp);
		Boolean result = this.bean.isClimReclycle();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetClimWithNewAirAuto() {
		Boolean tmp = false;
		this.bean.setClimWithNewAirAuto(tmp);
		Boolean result = this.bean.isClimWithNewAirAuto();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetDroppedFloor() {
		Integer tmp = 0;
		this.bean.setDroppedFloor(tmp);
		Integer result = this.bean.getDroppedFloor();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetAltitude() {
		Integer tmp = 0;
		this.bean.setAltitude(tmp);
		Integer result = this.bean.getAltitude();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetMecanicalStrength() {
		Integer tmp = 0;
		this.bean.setMecanicalStrength(tmp);
		Integer result = this.bean.getMecanicalStrength();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetTotalHeight() {
		Integer tmp = 0;
		this.bean.setTotalHeight(tmp);
		Integer result = this.bean.getTotalHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetChoosenProtectedHeight() {
		Integer tmp = 0;
		this.bean.setChoosenProtectedHeight(tmp);
		Integer result = this.bean.getChoosenProtectedHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetUniformHorizontality() {
		Boolean tmp = false;
		this.bean.setUniformHorizontality(tmp);
		Boolean result = this.bean.isUniformHorizontality();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetDroppedCeiling() {
		Integer tmp = 0;
		this.bean.setDroppedCeiling(tmp);
		Integer result = this.bean.getDroppedCeiling();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetIndicatedVolume() {
		Integer tmp = 0;
		this.bean.setIndicatedVolume(tmp);
		Integer result = this.bean.getIndicatedVolume();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetCommissioningDate() {
		java.util.Date tmp = new java.util.Date();
		this.bean.setCommissioningDate(tmp);
		java.util.Date result = this.bean.getCommissioningDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetRisqueHeight() {
		Integer tmp = 0;
		this.bean.setRisqueHeight(tmp);
		Integer result = this.bean.getRisqueHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetMainHeight() {
		Integer tmp = 0;
		this.bean.setMainHeight(tmp);
		Integer result = this.bean.getMainHeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetMeasuredVolume() {
		Integer tmp = 0;
		this.bean.setMeasuredVolume(tmp);
		Integer result = this.bean.getMeasuredVolume();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetName() {
		String tmp = "";
		this.bean.setName(tmp);
		String result = this.bean.getName();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetId() {
		Long tmp = 0L;
		this.bean.setId(tmp);
		Long result = this.bean.getId();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetCreationDate() {
		java.util.Date tmp = new java.util.Date();
		this.bean.setCreationDate(tmp);
		java.util.Date result = this.bean.getCreationDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetUpdateDate() {
		java.util.Date tmp = new java.util.Date();
		this.bean.setUpdateDate(tmp);
		java.util.Date result = this.bean.getUpdateDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetVersion() {
		Integer tmp = 0;
		this.bean.setVersion(tmp);
		Integer result = this.bean.getVersion();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	

	/***************************
	 * Basic Refs setter/getter
	 ***************************/

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetProject() {
		ProjectBean tmp = new ProjectBean();
		this.bean.setProject(tmp);
		ProjectBean result = this.bean.getProject();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetBlowholes() {
		BlowHoleBean tmp = new BlowHoleBean();
		this.bean.addBlowholes(tmp);
		List<BlowHoleBean> result = this.bean.getBlowholes();
		Assert.assertTrue(result.contains(tmp));
	}
	
	

}
