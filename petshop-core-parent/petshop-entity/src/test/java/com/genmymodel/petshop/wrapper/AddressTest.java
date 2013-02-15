package com.genmymodel.petshop.wrapper;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Test Class
 * <!-- Start of user code comment for Address Test Class
 * End of user code -->
 */

/**
 *  
 */

public class AddressTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private Address wrapper;	

	@Before
	public void setup(){
		this.wrapper = new Address();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetLine1() {
		//Start of user code basic set and get for line1 attribute
		String tmp = "";
		this.wrapper.setLine1(tmp);
		String result = this.wrapper.getLine1();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetLine2() {
		//Start of user code basic set and get for line2 attribute
		String tmp = "";
		this.wrapper.setLine2(tmp);
		String result = this.wrapper.getLine2();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
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
	public void setAndGetCountry() {
		//Start of user code basic set and get for country attribute
		String tmp = "";
		this.wrapper.setCountry(tmp);
		String result = this.wrapper.getCountry();
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
