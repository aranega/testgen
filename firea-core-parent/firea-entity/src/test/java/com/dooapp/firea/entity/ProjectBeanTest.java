package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.ProjectBuilder;
//import com.dooapp.firea.wrapper.Project;

/*
 * Test Class
 * <!-- Start of user code comment for Project Test Class
 * End of user code -->
 */


public class ProjectBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private ProjectBean bean;	

	@Before
	public void setup(){
		this.bean = new ProjectBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetReference() {
		//Start of user code basic set and get for reference attribute
		String tmp = "";
		this.bean.setReference(tmp);
		String result = this.bean.getReference();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDescription() {
		//Start of user code basic set and get for description attribute
		String tmp = "";
		this.bean.setDescription(tmp);
		String result = this.bean.getDescription();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetNameDo() {
		//Start of user code basic set and get for nameDo attribute
		String tmp = "";
		this.bean.setNameDo(tmp);
		String result = this.bean.getNameDo();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetStatus() {
		//Start of user code basic set and get for Status attribute
		String tmp = "";
		this.bean.setStatus(tmp);
		String result = this.bean.getStatus();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetKind() {
		//Start of user code basic set and get for kind attribute
		String tmp = "";
		this.bean.setKind(tmp);
		String result = this.bean.getKind();
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
	public void setAndGetSample() {
		//Start of user code basic set and get for sample reference
		SampleBean tmp = new SampleBean();
		this.bean.addSample(tmp);
		List<SampleBean> result = this.bean.getSample();
		Assert.assertTrue(result.contains(tmp));
		//End of user code
	}
	@Test
	public void setAndGetFirmMaintenance() {
		//Start of user code basic set and get for firmMaintenance reference
		ContactBean tmp = new ContactBean();
		this.bean.setFirmMaintenance(tmp);
		ContactBean result = this.bean.getFirmMaintenance();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetImage() {
		//Start of user code basic set and get for image reference
		PersistentImageBean tmp = new PersistentImageBean();
		this.bean.setImage(tmp);
		PersistentImageBean result = this.bean.getImage();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetFirmCustomer() {
		//Start of user code basic set and get for firmCustomer reference
		ContactBean tmp = new ContactBean();
		this.bean.setFirmCustomer(tmp);
		ContactBean result = this.bean.getFirmCustomer();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetGazconfiguration() {
		//Start of user code basic set and get for gazconfiguration reference
		GazConfigurationBean tmp = new GazConfigurationBean();
		this.bean.setGazconfiguration(tmp);
		GazConfigurationBean result = this.bean.getGazconfiguration();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetFirmMoe() {
		//Start of user code basic set and get for firmMoe reference
		ContactBean tmp = new ContactBean();
		this.bean.setFirmMoe(tmp);
		ContactBean result = this.bean.getFirmMoe();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRisque() {
		//Start of user code basic set and get for risque reference
		RisqueBean tmp = new RisqueBean();
		this.bean.setRisque(tmp);
		RisqueBean result = this.bean.getRisque();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetTestedroom() {
		//Start of user code basic set and get for testedroom reference
		TestedRoomBean tmp = new TestedRoomBean();
		this.bean.setTestedroom(tmp);
		TestedRoomBean result = this.bean.getTestedroom();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetTechnician() {
		//Start of user code basic set and get for technician reference
		ContactBean tmp = new ContactBean();
		this.bean.setTechnician(tmp);
		ContactBean result = this.bean.getTechnician();
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
