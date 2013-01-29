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
 * <!-- Start of user code comment for BlowHole Test Class
 * End of user code -->
 */


public class BlowHoleTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private BlowHole wrapper;	

	@Before
	public void setup(){
		this.wrapper = new BlowHole();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetDischarge() {
		//Start of user code basic set and get for Discharge attribute
		String tmp = "";
		this.wrapper.setDischarge(tmp);
		String result = this.wrapper.getDischarge();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetSurface() {
		//Start of user code basic set and get for surface attribute
		Double tmp = 0.0;
		this.wrapper.setSurface(tmp);
		Double result = this.wrapper.getSurface();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetQuantity() {
		//Start of user code basic set and get for quantity attribute
		Integer tmp = 0;
		this.wrapper.setQuantity(tmp);
		Integer result = this.wrapper.getQuantity();
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
	public void setAndGetTestedroom() {
		//Start of user code basic set and get for testedroom reference
		TestedRoom tmp = new TestedRoom();
		this.wrapper.setTestedroom(tmp);
		TestedRoom result = this.wrapper.getTestedroom();
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
