package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.BlowHoleBuilder;
//import com.dooapp.firea.wrapper.BlowHole;

/*
 * Test Class
 * <!-- Start of user code comment for BlowHole Test Class
 * End of user code -->
 */


public class BlowHoleBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private BlowHoleBean bean;	

	@Before
	public void setup(){
		this.bean = new BlowHoleBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetSurface() {
		//Start of user code basic set and get for surface attribute
		Double tmp = 0.0;
		this.bean.setSurface(tmp);
		Double result = this.bean.getSurface();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDischarge() {
		//Start of user code basic set and get for Discharge attribute
		String tmp = "";
		this.bean.setDischarge(tmp);
		String result = this.bean.getDischarge();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetQuantity() {
		//Start of user code basic set and get for quantity attribute
		Integer tmp = 0;
		this.bean.setQuantity(tmp);
		Integer result = this.bean.getQuantity();
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
	public void setAndGetTestedroom() {
		//Start of user code basic set and get for testedroom reference
		TestedRoomBean tmp = new TestedRoomBean();
		this.bean.setTestedroom(tmp);
		TestedRoomBean result = this.bean.getTestedroom();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	
	/*
	 * Basic Refs opposite tester
	 */	
	
	//Start of user code for test methods
	// Other test methods
	//End of user code
}
