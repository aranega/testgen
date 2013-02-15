package com.genmymodel.petshop.wrapper;



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
 * <!-- Start of user code comment for Cart Test Class
 * End of user code -->
 */


public class CartTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private Cart wrapper;	

	@Before
	public void setup(){
		this.wrapper = new Cart();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
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

	/*
	 * Basic Atts setter/getter
	 */
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
	public void setAndGetItems() {
		//Start of user code basic set and get for items reference
		Item tmp = new Item();
		this.wrapper.getItems().add(tmp);
		List<Item> result = this.wrapper.getItems();
		Assert.assertTrue(result.contains(tmp));
		//End of user code
	}
	@Test
	public void setAndGetCustomer() {
		//Start of user code basic set and get for customer reference
		Customer tmp = new Customer();
		this.wrapper.setCustomer(tmp);
		Customer result = this.wrapper.getCustomer();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetOrder() {
		//Start of user code basic set and get for order reference
		Order tmp = new Order();
		this.wrapper.setOrder(tmp);
		Order result = this.wrapper.getOrder();
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
