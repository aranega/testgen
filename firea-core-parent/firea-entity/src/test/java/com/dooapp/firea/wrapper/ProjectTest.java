package com.dooapp.firea.wrapper;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

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
	public void setAndGetName() {
		//Start of user code basic set and get for name attribute
		String tmp = "";
		this.wrapper.setName(tmp);
		String result = this.wrapper.getName();
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
	public void setAndGetSample() {
		//Start of user code basic set and get for sample reference
		Sample tmp = new Sample();
		this.wrapper.setSample(tmp);
		Sample result = this.wrapper.getSample();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetContacts() {
		//Start of user code basic set and get for contacts reference
		Contact tmp = new Contact();
		this.wrapper.setContacts(tmp);
		Contact result = this.wrapper.getContacts();
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
	public void setAndGetImage() {
		//Start of user code basic set and get for image reference
		PersistentImage tmp = new PersistentImage();
		this.wrapper.setImage(tmp);
		PersistentImage result = this.wrapper.getImage();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeSampleTest() {
		//Start of user code basic opposite test for sample reference
		Sample elem1 = new Sample();
		this.wrapper.setSample(elem1);
		//Project elem2 = elem1.getProject();
		Project elem2 = elem1.getProject();
		Assert.assertNotNull(elem2);
		Assert.assertEquals(elem1, elem2);
		//End of user code
	}
	@Test
	public void oppositeGazconfigurationTest() {
		//Start of user code basic opposite test for gazconfiguration reference
		GazConfiguration elem1 = new GazConfiguration();
		this.wrapper.setGazconfiguration(elem1);
		//Project elem2 = elem1.getProject();
		Project elem2 = elem1.getProject();
		Assert.assertNotNull(elem2);
		Assert.assertEquals(elem1, elem2);
		//End of user code
	}
	
	//Start of user code for test methods
	// Other test methods
	//End of user code
}
