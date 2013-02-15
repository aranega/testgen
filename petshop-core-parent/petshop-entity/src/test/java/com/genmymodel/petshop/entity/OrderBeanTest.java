package com.genmymodel.petshop.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
//Start of user code for imports
// TODO: import me!
//End of user code

//import com.genmymodel.petshop.entity.factories.OrderBuilder;
//import com.genmymodel.petshop.wrapper.Order;

/*
 * Test Class
 * <!-- Start of user code comment for Order Test Class
 * End of user code -->
 */



public class OrderBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private OrderBean bean;	

	@Before
	public void setup(){
		this.bean = new OrderBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetDate() {
		//Start of user code basic set and get for date attribute
		String tmp = "";
		this.bean.setDate(tmp);
		String result = this.bean.getDate();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetReference() {
		//Start of user code basic set and get for reference attribute
		String tmp = "";
		this.bean.setReference(tmp);
		String result = this.bean.getReference();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetStatus() {
		//Start of user code basic set and get for status attribute
		String tmp = "";
		this.bean.setStatus(tmp);
		String result = this.bean.getStatus();
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
	public void setAndGetItems() {
		//Start of user code basic set and get for items reference
		ItemBean tmp = new ItemBean();
		this.bean.addItems(tmp);
		List<ItemBean> result = this.bean.getItems();
		Assert.assertTrue(result.contains(tmp));
		//End of user code
	}
	@Test
	public void setAndGetPaymentAddress() {
		//Start of user code basic set and get for paymentAddress reference
		AddressBean tmp = new AddressBean();
		this.bean.setPaymentAddress(tmp);
		AddressBean result = this.bean.getPaymentAddress();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDeliveryAddress() {
		//Start of user code basic set and get for deliveryAddress reference
		AddressBean tmp = new AddressBean();
		this.bean.setDeliveryAddress(tmp);
		AddressBean result = this.bean.getDeliveryAddress();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCart() {
		//Start of user code basic set and get for cart reference
		CartBean tmp = new CartBean();
		this.bean.setCart(tmp);
		CartBean result = this.bean.getCart();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCustomer() {
		//Start of user code basic set and get for customer reference
		CustomerBean tmp = new CustomerBean();
		this.bean.setCustomer(tmp);
		CustomerBean result = this.bean.getCustomer();
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
