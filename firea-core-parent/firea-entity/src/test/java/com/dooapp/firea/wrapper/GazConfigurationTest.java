package com.dooapp.firea.wrapper;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
import com.dooapp.firea.entity.GazWeight;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class GazConfigurationTest
{
	/**
	 * @generated
	 */
	private GazConfiguration wrapper;	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Before
	public void setup(){
		this.wrapper = new GazConfiguration();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/********************
	 * Basic Refs tester
	 ********************/

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetForcedGazWeight() {
		GazWeight tmp = GazWeight.HEAVY;
		this.wrapper.setForcedGazWeight(tmp);
		GazWeight result = this.wrapper.getForcedGazWeight();
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
		this.wrapper.setTotalLoadToInstall(tmp);
		Double result = this.wrapper.getTotalLoadToInstall();
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
		this.wrapper.setSlowUnloadingValue(tmp);
		Double result = this.wrapper.getSlowUnloadingValue();
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
		this.wrapper.setLeekRepartitionPercent(tmp);
		Double result = this.wrapper.getLeekRepartitionPercent();
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
		this.wrapper.setPrescribedRetention(tmp);
		Double result = this.wrapper.getPrescribedRetention();
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
		this.wrapper.setDroppedFloorFull(tmp);
		Boolean result = this.wrapper.isDroppedFloorFull();
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
		this.wrapper.setSlowUnloading(tmp);
		Boolean result = this.wrapper.isSlowUnloading();
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
		this.wrapper.setInstalledInitialConcentration(tmp);
		Double result = this.wrapper.getInstalledInitialConcentration();
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
		this.wrapper.setChosenInitialConcentration(tmp);
		Double result = this.wrapper.getChosenInitialConcentration();
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
		this.wrapper.setBoundInitialConcentration(tmp);
		Boolean result = this.wrapper.isBoundInitialConcentration();
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
		this.wrapper.setPrescribedFinalConcentration(tmp);
		Double result = this.wrapper.getPrescribedFinalConcentration();
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
		this.wrapper.setChosenFinalConcentration(tmp);
		Double result = this.wrapper.getChosenFinalConcentration();
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
		this.wrapper.setDroppedCeilFull(tmp);
		Boolean result = this.wrapper.isDroppedCeilFull();
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
		this.wrapper.setRetentionGoal(tmp);
		Double result = this.wrapper.getRetentionGoal();
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
		this.wrapper.setPrescribedInitialConcentration(tmp);
		Double result = this.wrapper.getPrescribedInitialConcentration();
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
		this.wrapper.setRetentionInterface(tmp);
		Boolean result = this.wrapper.isRetentionInterface();
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
		this.wrapper.setId(tmp);
		Long result = this.wrapper.getId();
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
		this.wrapper.setCreationDate(tmp);
		java.util.Date result = this.wrapper.getCreationDate();
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
		this.wrapper.setUpdateDate(tmp);
		java.util.Date result = this.wrapper.getUpdateDate();
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
		this.wrapper.setVersion(tmp);
		Integer result = this.wrapper.getVersion();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	

	/*****************************
	 * Basic Refs opposite tester
	 *****************************/

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetGaz() {
		Gaz tmp = new Gaz();
		this.wrapper.setGaz(tmp);
		Gaz result = this.wrapper.getGaz();
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
		BottleConfiguration tmp = new BottleConfiguration();
		this.wrapper.getBottleConfigurations().add(tmp);
		List<BottleConfiguration> result = this.wrapper.getBottleConfigurations();
		Assert.assertTrue(result.contains(tmp));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetProject() {
		Project tmp = new Project();
		this.wrapper.setProject(tmp);
		Project result = this.wrapper.getProject();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	

	/**
	 * toXML
	 * @generated
	 */
	@Test
	public void toXML() { 
		this.wrapper.toXML();
	}

}
