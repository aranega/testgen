package com.dooapp.firea.wrapper;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
import com.dooapp.firea.entity.AirPressureCalculationMethod;
import com.dooapp.firea.entity.PointDirection;
import com.dooapp.firea.entity.BeaufortScale;
import com.dooapp.firea.entity.SampleStatus;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class SampleTest
{
	/**
	 * @generated
	 */
	private Sample wrapper;	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Before
	public void setup(){
		this.wrapper = new Sample();
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
	public void setAndGetPhiIPercent() {
		Double tmp = 0.0;
		this.wrapper.setPhiIPercent(tmp);
		Double result = this.wrapper.getPhiIPercent();
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
		this.wrapper.setRoE(tmp);
		Double result = this.wrapper.getRoE();
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
		this.wrapper.setTetaE(tmp);
		Double result = this.wrapper.getTetaE();
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
		this.wrapper.setLowTarget(tmp);
		Double result = this.wrapper.getLowTarget();
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
		this.wrapper.setHighUp(tmp);
		Integer result = this.wrapper.getHighUp();
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
		this.wrapper.setWindMeasure(tmp);
		Double result = this.wrapper.getWindMeasure();
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
		this.wrapper.setAirPressureCalculationMethod(tmp);
		AirPressureCalculationMethod result = this.wrapper.getAirPressureCalculationMethod();
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
		this.wrapper.setAirPressure(tmp);
		Integer result = this.wrapper.getAirPressure();
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
		this.wrapper.setName(tmp);
		String result = this.wrapper.getName();
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
		this.wrapper.setRoI(tmp);
		Double result = this.wrapper.getRoI();
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
		this.wrapper.setNumberOfPoint(tmp);
		Integer result = this.wrapper.getNumberOfPoint();
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
		this.wrapper.setHighTarget(tmp);
		Double result = this.wrapper.getHighTarget();
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
		this.wrapper.setPointDirection(tmp);
		PointDirection result = this.wrapper.getPointDirection();
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
		this.wrapper.setBeaufortScale(tmp);
		BeaufortScale result = this.wrapper.getBeaufortScale();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetDate() {
		java.util.Date tmp = new java.util.Date();
		this.wrapper.setDate(tmp);
		java.util.Date result = this.wrapper.getDate();
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
		this.wrapper.setTetaI(tmp);
		Double result = this.wrapper.getTetaI();
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
		this.wrapper.setPhiEPercent(tmp);
		Double result = this.wrapper.getPhiEPercent();
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
		this.wrapper.setElevation(tmp);
		Integer result = this.wrapper.getElevation();
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
		this.wrapper.setStatus(tmp);
		SampleStatus result = this.wrapper.getStatus();
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
	public void setAndGetPostStaticStep() {
		StaticStep tmp = new StaticStep();
		this.wrapper.setPostStaticStep(tmp);
		StaticStep result = this.wrapper.getPostStaticStep();
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
		MainStep tmp = new MainStep();
		this.wrapper.setDepressureMainStep(tmp);
		MainStep result = this.wrapper.getDepressureMainStep();
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
		BlowHoleStep tmp = new BlowHoleStep();
		this.wrapper.setDepressureEventStep(tmp);
		BlowHoleStep result = this.wrapper.getDepressureEventStep();
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
		CalibrationStep tmp = new CalibrationStep();
		this.wrapper.setCalibrationStep(tmp);
		CalibrationStep result = this.wrapper.getCalibrationStep();
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
		StaticStep tmp = new StaticStep();
		this.wrapper.setPreStaticStep(tmp);
		StaticStep result = this.wrapper.getPreStaticStep();
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
		Project tmp = new Project();
		this.wrapper.setProject(tmp);
		Project result = this.wrapper.getProject();
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
		MainStep tmp = new MainStep();
		this.wrapper.setPressureMainStep(tmp);
		MainStep result = this.wrapper.getPressureMainStep();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetPressureEventStep() {
		BlowHoleStep tmp = new BlowHoleStep();
		this.wrapper.setPressureEventStep(tmp);
		BlowHoleStep result = this.wrapper.getPressureEventStep();
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
