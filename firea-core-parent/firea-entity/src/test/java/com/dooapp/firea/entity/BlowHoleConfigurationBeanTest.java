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
public class BlowHoleConfigurationBeanTest
{
	/**
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
   	 * @generated
	 */
	private BlowHoleConfigurationBean bean;	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Before
	public void setup(){
		this.bean = new BlowHoleConfigurationBean();
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
	public void setAndGetReferencePressure() {
		Double tmp = 0.0;
		this.bean.setReferencePressure(tmp);
		Double result = this.bean.getReferencePressure();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetReferencePressureType() {
		PressureType tmp = PressureType.STANDARD;
		this.bean.setReferencePressureType(tmp);
		PressureType result = this.bean.getReferencePressureType();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetBlowHoleSafetyFactor() {
		Double tmp = 0.0;
		this.bean.setBlowHoleSafetyFactor(tmp);
		Double result = this.bean.getBlowHoleSafetyFactor();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetReferencePressureJustification() {
		String tmp = "";
		this.bean.setReferencePressureJustification(tmp);
		String result = this.bean.getReferencePressureJustification();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetElaIncluded() {
		Boolean tmp = false;
		this.bean.setElaIncluded(tmp);
		Boolean result = this.bean.isElaIncluded();
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
	public void setAndGetBlowhole() {
		BlowHoleBean tmp = new BlowHoleBean();
		this.bean.addBlowhole(tmp);
		List<BlowHoleBean> result = this.bean.getBlowhole();
		Assert.assertTrue(result.contains(tmp));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetTestedroom() {
		TestedRoomBean tmp = new TestedRoomBean();
		this.bean.setTestedroom(tmp);
		TestedRoomBean result = this.bean.getTestedroom();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	
	
	/*******************
	 * Methods owned by BlowHoleConfigurationBean
	 *******************/

	

}
