package com.dooapp.firea.wrapper;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
import com.dooapp.firea.entity.ProjectBean;
import com.dooapp.firea.enumeration.ProjectStatus;
import com.dooapp.firea.enumeration.ProjectKind;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class ProjectTest
{
	/**
	 * @generated
	 */
	private Project wrapper;	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Before
	public void setup(){
		this.wrapper = (new ProjectBean()).getWrapper();
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
	public void setAndGetStatus() {
		ProjectStatus tmp = ProjectStatus.TO_PLAN;
		this.wrapper.setStatus(tmp);
		ProjectStatus result = this.wrapper.getStatus();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetKind() {
		ProjectKind tmp = ProjectKind.R13_APSAD;
		this.wrapper.setKind(tmp);
		ProjectKind result = this.wrapper.getKind();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetDescription() {
		String tmp = "";
		this.wrapper.setDescription(tmp);
		String result = this.wrapper.getDescription();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetReference() {
		String tmp = "";
		this.wrapper.setReference(tmp);
		String result = this.wrapper.getReference();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetNameDo() {
		String tmp = "";
		this.wrapper.setNameDo(tmp);
		String result = this.wrapper.getNameDo();
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
	public void setAndGetRisque() {
		Risque tmp = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		this.wrapper.setRisque(tmp);
		Risque result = this.wrapper.getRisque();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetFirmMaintenance() {
		Contact tmp = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		this.wrapper.setFirmMaintenance(tmp);
		Contact result = this.wrapper.getFirmMaintenance();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetImage() {
		PersistentImage tmp = (new com.dooapp.firea.entity.PersistentImageBean()).getWrapper();
		this.wrapper.setImage(tmp);
		PersistentImage result = this.wrapper.getImage();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetFirmCustomer() {
		Contact tmp = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		this.wrapper.setFirmCustomer(tmp);
		Contact result = this.wrapper.getFirmCustomer();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetTestedroom() {
		TestedRoom tmp = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper();
		this.wrapper.setTestedroom(tmp);
		TestedRoom result = this.wrapper.getTestedroom();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetTechnician() {
		Contact tmp = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		this.wrapper.setTechnician(tmp);
		Contact result = this.wrapper.getTechnician();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetSample() {
		Sample tmp = (new com.dooapp.firea.entity.SampleBean()).getWrapper();
		this.wrapper.getSample().add(tmp);
		List<Sample> result = this.wrapper.getSample();
		Assert.assertTrue(result.contains(tmp));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetFirmMoe() {
		Contact tmp = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		this.wrapper.setFirmMoe(tmp);
		Contact result = this.wrapper.getFirmMoe();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setAndGetGazconfiguration() {
		GazConfiguration tmp = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		this.wrapper.setGazconfiguration(tmp);
		GazConfiguration result = this.wrapper.getGazconfiguration();
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

	/*******************
	 * Methods owned by Project
	 *******************/

	

}
