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
public class StaticStepBeanTest
{
	/**
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
   	 * @generated
	 */
	private StaticStepBean bean;	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Before
	public void setup(){
		this.bean = new StaticStepBean();
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
	public void setAndGetStatus() {
		StepStatus tmp = StepStatus.NO_STARTED;
		this.bean.setStatus(tmp);
		StepStatus result = this.bean.getStatus();
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
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetDeltaP() {
		Double tmp = 0.0;
		this.bean.setDeltaP(tmp);
		Double result = this.bean.getDeltaP();
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
	public void setAndGetPoints() {
		PointBean tmp = new PointBean();
		this.bean.addPoints(tmp);
		List<PointBean> result = this.bean.getPoints();
		Assert.assertTrue(result.contains(tmp));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetSample() {
		SampleBean tmp = new SampleBean();
		this.bean.setSample(tmp);
		SampleBean result = this.bean.getSample();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	
	
	/*******************
	 * Methods owned by StaticStepBean
	 *******************/

	

}
