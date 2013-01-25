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
 * <!-- Start of user code comment for Contact Test Class
 * End of user code -->
 */


public class ContactTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private Contact wrapper;	

	@Before
	public void setup(){
		this.wrapper = new Contact();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetCity() {
		//Start of user code basic set and get for city attribute
		String tmp = "";
		this.wrapper.setCity(tmp);
		String result = this.wrapper.getCity();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetPhone() {
		//Start of user code basic set and get for phone attribute
		String tmp = "";
		this.wrapper.setPhone(tmp);
		String result = this.wrapper.getPhone();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetAdress1() {
		//Start of user code basic set and get for adress1 attribute
		String tmp = "";
		this.wrapper.setAdress1(tmp);
		String result = this.wrapper.getAdress1();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetZipCode() {
		//Start of user code basic set and get for zipCode attribute
		String tmp = "";
		this.wrapper.setZipCode(tmp);
		String result = this.wrapper.getZipCode();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetSiret() {
		//Start of user code basic set and get for siret attribute
		String tmp = "";
		this.wrapper.setSiret(tmp);
		String result = this.wrapper.getSiret();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetEmail() {
		//Start of user code basic set and get for email attribute
		String tmp = "";
		this.wrapper.setEmail(tmp);
		String result = this.wrapper.getEmail();
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
	public void setAndGetAddress2() {
		//Start of user code basic set and get for address2 attribute
		String tmp = "";
		this.wrapper.setAddress2(tmp);
		String result = this.wrapper.getAddress2();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetPerson() {
		//Start of user code basic set and get for person attribute
		String tmp = "";
		this.wrapper.setPerson(tmp);
		String result = this.wrapper.getPerson();
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
	public void oppositeImageTest() {
		//Start of user code basic opposite test for image reference
		PersistentImage elem1 = new PersistentImage();
		this.wrapper.setImage(elem1);
		//Contact elem2 = elem1.getContact();
		Contact elem2 = elem1.getContact();
		Assert.assertNotNull(elem2);
		Assert.assertEquals(elem1, elem2);
		//End of user code
	}
	
	//Start of user code for test methods
	// Other test methods
	//End of user code
}
