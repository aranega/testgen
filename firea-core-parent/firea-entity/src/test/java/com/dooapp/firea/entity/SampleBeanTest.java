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
public class SampleBeanTest
{
	/**
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
   	 * @generated
	 */
	private SampleBean bean;	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Before
	public void setup(){
		this.bean = new SampleBean();
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
	public void setAndGetDate() {
		java.util.Date tmp = new java.util.Date();
		this.bean.setDate(tmp);
		java.util.Date result = this.bean.getDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetWindMeasure() {
		Double tmp = 0.0;
		this.bean.setWindMeasure(tmp);
		Double result = this.bean.getWindMeasure();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetRoI() {
		Double tmp = 0.0;
		this.bean.setRoI(tmp);
		Double result = this.bean.getRoI();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetPhiEPercent() {
		Double tmp = 0.0;
		this.bean.setPhiEPercent(tmp);
		Double result = this.bean.getPhiEPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetStatus() {
		SampleStatus tmp = SampleStatus.NO_STARTED;
		this.bean.setStatus(tmp);
		SampleStatus result = this.bean.getStatus();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetTetaE() {
		Double tmp = 0.0;
		this.bean.setTetaE(tmp);
		Double result = this.bean.getTetaE();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetHighUp() {
		Integer tmp = 0;
		this.bean.setHighUp(tmp);
		Integer result = this.bean.getHighUp();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetAirPressure() {
		Integer tmp = 0;
		this.bean.setAirPressure(tmp);
		Integer result = this.bean.getAirPressure();
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
	public void setAndGetPhiIPercent() {
		Double tmp = 0.0;
		this.bean.setPhiIPercent(tmp);
		Double result = this.bean.getPhiIPercent();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetElevation() {
		Integer tmp = 0;
		this.bean.setElevation(tmp);
		Integer result = this.bean.getElevation();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetTetaI() {
		Double tmp = 0.0;
		this.bean.setTetaI(tmp);
		Double result = this.bean.getTetaI();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetBeaufortScale() {
		BeaufortScale tmp = BeaufortScale.FORCE0;
		this.bean.setBeaufortScale(tmp);
		BeaufortScale result = this.bean.getBeaufortScale();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetLowTarget() {
		Double tmp = 0.0;
		this.bean.setLowTarget(tmp);
		Double result = this.bean.getLowTarget();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetPointDirection() {
		PointDirection tmp = PointDirection.ASC;
		this.bean.setPointDirection(tmp);
		PointDirection result = this.bean.getPointDirection();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetAirPressureCalculationMethod() {
		AirPressureCalculationMethod tmp = AirPressureCalculationMethod.MEASURE;
		this.bean.setAirPressureCalculationMethod(tmp);
		AirPressureCalculationMethod result = this.bean.getAirPressureCalculationMethod();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetRoE() {
		Double tmp = 0.0;
		this.bean.setRoE(tmp);
		Double result = this.bean.getRoE();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetHighTarget() {
		Double tmp = 0.0;
		this.bean.setHighTarget(tmp);
		Double result = this.bean.getHighTarget();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetNumberOfPoint() {
		Integer tmp = 0;
		this.bean.setNumberOfPoint(tmp);
		Integer result = this.bean.getNumberOfPoint();
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
	public void setAndGetPressureEventStep() {
		BlowHoleStepBean tmp = new BlowHoleStepBean();
		this.bean.setPressureEventStep(tmp);
		BlowHoleStepBean result = this.bean.getPressureEventStep();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
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
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetDepressureEventStep() {
		BlowHoleStepBean tmp = new BlowHoleStepBean();
		this.bean.setDepressureEventStep(tmp);
		BlowHoleStepBean result = this.bean.getDepressureEventStep();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetCalibrationStep() {
		CalibrationStepBean tmp = new CalibrationStepBean();
		this.bean.setCalibrationStep(tmp);
		CalibrationStepBean result = this.bean.getCalibrationStep();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetPostStaticStep() {
		StaticStepBean tmp = new StaticStepBean();
		this.bean.setPostStaticStep(tmp);
		StaticStepBean result = this.bean.getPostStaticStep();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetPreStaticStep() {
		StaticStepBean tmp = new StaticStepBean();
		this.bean.setPreStaticStep(tmp);
		StaticStepBean result = this.bean.getPreStaticStep();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetDepressureMainStep() {
		MainStepBean tmp = new MainStepBean();
		this.bean.setDepressureMainStep(tmp);
		MainStepBean result = this.bean.getDepressureMainStep();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetPressureMainStep() {
		MainStepBean tmp = new MainStepBean();
		this.bean.setPressureMainStep(tmp);
		MainStepBean result = this.bean.getPressureMainStep();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	
	
	/*******************
	 * Methods owned by SampleBean
	 *******************/

	

}
