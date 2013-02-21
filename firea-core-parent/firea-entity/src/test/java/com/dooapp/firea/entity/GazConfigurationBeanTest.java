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
public class GazConfigurationBeanTest
{
	/**
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
   	 * @generated
	 */
	private GazConfigurationBean bean;	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Before
	public void setup(){
		this.bean = new GazConfigurationBean();
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
	public void setAndGetForcedGazWeight() {
		GazWeight tmp = GazWeight.HEAVY;
		this.bean.setForcedGazWeight(tmp);
		GazWeight result = this.bean.getForcedGazWeight();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetTotalLoadToInstall() {
		Double tmp = 0.0;
		this.bean.setTotalLoadToInstall(tmp);
		Double result = this.bean.getTotalLoadToInstall();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetSlowUnloadingValue() {
		Double tmp = 0.0;
		this.bean.setSlowUnloadingValue(tmp);
		Double result = this.bean.getSlowUnloadingValue();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetLeekRepartitionPercent() {
		Double tmp = 0.0;
		this.bean.setLeekRepartitionPercent(tmp);
		Double result = this.bean.getLeekRepartitionPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetPrescribedRetention() {
		Double tmp = 0.0;
		this.bean.setPrescribedRetention(tmp);
		Double result = this.bean.getPrescribedRetention();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetDroppedFloorFull() {
		Boolean tmp = false;
		this.bean.setDroppedFloorFull(tmp);
		Boolean result = this.bean.isDroppedFloorFull();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetSlowUnloading() {
		Boolean tmp = false;
		this.bean.setSlowUnloading(tmp);
		Boolean result = this.bean.isSlowUnloading();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetInstalledInitialConcentration() {
		Double tmp = 0.0;
		this.bean.setInstalledInitialConcentration(tmp);
		Double result = this.bean.getInstalledInitialConcentration();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetChosenInitialConcentration() {
		Double tmp = 0.0;
		this.bean.setChosenInitialConcentration(tmp);
		Double result = this.bean.getChosenInitialConcentration();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetBoundInitialConcentration() {
		Boolean tmp = false;
		this.bean.setBoundInitialConcentration(tmp);
		Boolean result = this.bean.isBoundInitialConcentration();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetPrescribedFinalConcentration() {
		Double tmp = 0.0;
		this.bean.setPrescribedFinalConcentration(tmp);
		Double result = this.bean.getPrescribedFinalConcentration();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetChosenFinalConcentration() {
		Double tmp = 0.0;
		this.bean.setChosenFinalConcentration(tmp);
		Double result = this.bean.getChosenFinalConcentration();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetDroppedCeilFull() {
		Boolean tmp = false;
		this.bean.setDroppedCeilFull(tmp);
		Boolean result = this.bean.isDroppedCeilFull();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetRetentionGoal() {
		Double tmp = 0.0;
		this.bean.setRetentionGoal(tmp);
		Double result = this.bean.getRetentionGoal();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetPrescribedInitialConcentration() {
		Double tmp = 0.0;
		this.bean.setPrescribedInitialConcentration(tmp);
		Double result = this.bean.getPrescribedInitialConcentration();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetRetentionInterface() {
		Boolean tmp = false;
		this.bean.setRetentionInterface(tmp);
		Boolean result = this.bean.isRetentionInterface();
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
	public void setAndGetGaz() {
		GazBean tmp = new GazBean();
		this.bean.setGaz(tmp);
		GazBean result = this.bean.getGaz();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetBottleConfigurations() {
		BottleConfigurationBean tmp = new BottleConfigurationBean();
		this.bean.addBottleConfigurations(tmp);
		List<BottleConfigurationBean> result = this.bean.getBottleConfigurations();
		Assert.assertTrue(result.contains(tmp));
	}
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
	
	
	/*******************
	 * Methods owned by GazConfigurationBean
	 *******************/

	

}
