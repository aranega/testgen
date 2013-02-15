package com.genmymodel.petshop.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.genmymodel.petshop.entity.factories.AddressBuilder;
//import com.genmymodel.petshop.wrapper.Address;

/*
 * Test Class
 * <!-- Start of user code comment for Address Test Class
 * End of user code -->
 */

/**
 *  
 */

public class AddressBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private AddressBean bean;	

	@Before
	public void setup(){
		this.bean = new AddressBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetLine1() {
		//Start of user code basic set and get for line1 attribute
		String tmp = "";
		this.bean.setLine1(tmp);
		String result = this.bean.getLine1();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetLine2() {
		//Start of user code basic set and get for line2 attribute
		String tmp = "";
		this.bean.setLine2(tmp);
		String result = this.bean.getLine2();
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
	public void setAndGetCountry() {
		//Start of user code basic set and get for country attribute
		String tmp = "";
		this.bean.setCountry(tmp);
		String result = this.bean.getCountry();
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
