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
 * <!-- Start of user code comment for Order Test Class
 * End of user code -->
 */



public class OrderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private Order wrapper;	

	@Before
	public void setup(){
		this.wrapper = new Order();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetDate() {
		//Start of user code basic set and get for date attribute
		String tmp = "";
		this.wrapper.setDate(tmp);
		String result = this.wrapper.getDate();
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
	public void setAndGetStatus() {
		//Start of user code basic set and get for status attribute
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
	public void setAndGetItems() {
		//Start of user code basic set and get for items reference
		Item tmp = new Item();
		this.wrapper.getItems().add(tmp);
		List<Item> result = this.wrapper.getItems();
		Assert.assertTrue(result.contains(tmp));
		//End of user code
	}
	@Test
	public void setAndGetPaymentAddress() {
		//Start of user code basic set and get for paymentAddress reference
		Address tmp = new Address();
		this.wrapper.setPaymentAddress(tmp);
		Address result = this.wrapper.getPaymentAddress();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDeliveryAddress() {
		//Start of user code basic set and get for deliveryAddress reference
		Address tmp = new Address();
		this.wrapper.setDeliveryAddress(tmp);
		Address result = this.wrapper.getDeliveryAddress();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCart() {
		//Start of user code basic set and get for cart reference
		Cart tmp = new Cart();
		this.wrapper.setCart(tmp);
		Cart result = this.wrapper.getCart();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
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
