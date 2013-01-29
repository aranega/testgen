package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.ContactBuilder;
//import com.dooapp.firea.wrapper.Contact;

/*
 * Test Class
 * <!-- Start of user code comment for Contact Test Class
 * End of user code -->
 */


public class ContactBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private ContactBean bean;	

	@Before
	public void setup(){
		this.bean = new ContactBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetEmail() {
		//Start of user code basic set and get for email attribute
		String tmp = "";
		this.bean.setEmail(tmp);
		String result = this.bean.getEmail();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetAddress2() {
		//Start of user code basic set and get for address2 attribute
		String tmp = "";
		this.bean.setAddress2(tmp);
		String result = this.bean.getAddress2();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetPhone() {
		//Start of user code basic set and get for phone attribute
		String tmp = "";
		this.bean.setPhone(tmp);
		String result = this.bean.getPhone();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetPerson() {
		//Start of user code basic set and get for person attribute
		String tmp = "";
		this.bean.setPerson(tmp);
		String result = this.bean.getPerson();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCity() {
		//Start of user code basic set and get for city attribute
		String tmp = "";
		this.bean.setCity(tmp);
		String result = this.bean.getCity();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetSiret() {
		//Start of user code basic set and get for siret attribute
		String tmp = "";
		this.bean.setSiret(tmp);
		String result = this.bean.getSiret();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetAdress1() {
		//Start of user code basic set and get for adress1 attribute
		String tmp = "";
		this.bean.setAdress1(tmp);
		String result = this.bean.getAdress1();
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
	public void setAndGetName() {
		//Start of user code basic set and get for name attribute
		String tmp = "";
		this.bean.setName(tmp);
		String result = this.bean.getName();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetZipCode() {
		//Start of user code basic set and get for zipCode attribute
		String tmp = "";
		this.bean.setZipCode(tmp);
		String result = this.bean.getZipCode();
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
	public void setAndGetImage() {
		//Start of user code basic set and get for image reference
		PersistentImageBean tmp = new PersistentImageBean();
		this.bean.setImage(tmp);
		PersistentImageBean result = this.bean.getImage();
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
