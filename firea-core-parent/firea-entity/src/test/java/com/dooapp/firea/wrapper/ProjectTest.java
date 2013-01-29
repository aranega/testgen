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
 * <!-- Start of user code comment for Project Test Class
 * End of user code -->
 */


public class ProjectTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private Project wrapper;	

	@Before
	public void setup(){
		this.wrapper = new Project();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetDescription() {
		//Start of user code basic set and get for description attribute
		String tmp = "";
		this.wrapper.setDescription(tmp);
		String result = this.wrapper.getDescription();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetKind() {
		//Start of user code basic set and get for kind attribute
		String tmp = "";
		this.wrapper.setKind(tmp);
		String result = this.wrapper.getKind();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetStatus() {
		//Start of user code basic set and get for Status attribute
		String tmp = "";
		this.wrapper.setStatus(tmp);
		String result = this.wrapper.getStatus();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetReference() {
		//Start of user code basic set and get for reference attribute
		String tmp = "";
		this.wrapper.setReference(tmp);
		String result = this.wrapper.getReference();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetNameDo() {
		//Start of user code basic set and get for nameDo attribute
		String tmp = "";
		this.wrapper.setNameDo(tmp);
		String result = this.wrapper.getNameDo();
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
	public void setAndGetTechnician() {
		//Start of user code basic set and get for technician reference
		Contact tmp = new Contact();
		this.wrapper.setTechnician(tmp);
		Contact result = this.wrapper.getTechnician();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetFirmMaintenance() {
		//Start of user code basic set and get for firmMaintenance reference
		Contact tmp = new Contact();
		this.wrapper.setFirmMaintenance(tmp);
		Contact result = this.wrapper.getFirmMaintenance();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetRisque() {
		//Start of user code basic set and get for risque reference
		Risque tmp = new Risque();
		this.wrapper.setRisque(tmp);
		Risque result = this.wrapper.getRisque();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetGazconfiguration() {
		//Start of user code basic set and get for gazconfiguration reference
		GazConfiguration tmp = new GazConfiguration();
		this.wrapper.setGazconfiguration(tmp);
		GazConfiguration result = this.wrapper.getGazconfiguration();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetFirmCustomer() {
		//Start of user code basic set and get for firmCustomer reference
		Contact tmp = new Contact();
		this.wrapper.setFirmCustomer(tmp);
		Contact result = this.wrapper.getFirmCustomer();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetTestedroom() {
		//Start of user code basic set and get for testedroom reference
		TestedRoom tmp = new TestedRoom();
		this.wrapper.setTestedroom(tmp);
		TestedRoom result = this.wrapper.getTestedroom();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetSample() {
		//Start of user code basic set and get for sample reference
		Sample tmp = new Sample();
		this.wrapper.getSample().add(tmp);
		List<Sample> result = this.wrapper.getSample();
		Assert.assertTrue(result.contains(tmp));
		//End of user code
	}
	@Test
	public void setAndGetImage() {
		//Start of user code basic set and get for image reference
		PersistentImage tmp = new PersistentImage();
		this.wrapper.setImage(tmp);
		PersistentImage result = this.wrapper.getImage();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetFirmMoe() {
		//Start of user code basic set and get for firmMoe reference
		Contact tmp = new Contact();
		this.wrapper.setFirmMoe(tmp);
		Contact result = this.wrapper.getFirmMoe();
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
