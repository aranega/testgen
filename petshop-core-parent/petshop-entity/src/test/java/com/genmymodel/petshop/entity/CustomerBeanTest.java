package com.genmymodel.petshop.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
//Start of user code for imports
// TODO: import me!
//End of user code

//import com.genmymodel.petshop.entity.factories.CustomerBuilder;
//import com.genmymodel.petshop.wrapper.Customer;

/*
 * Test Class
 * <!-- Start of user code comment for Customer Test Class
 * End of user code -->
 */

/**
 *  
 */

public class CustomerBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private CustomerBean bean;	

	@Before
	public void setup(){
		this.bean = new CustomerBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetLastName() {
		//Start of user code basic set and get for lastName attribute
		String tmp = "";
		this.bean.setLastName(tmp);
		String result = this.bean.getLastName();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetFirstName() {
		//Start of user code basic set and get for firstName attribute
		String tmp = "";
		this.bean.setFirstName(tmp);
		String result = this.bean.getFirstName();
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
	public void setAndGetOrders() {
		//Start of user code basic set and get for orders reference
		OrderBean tmp = new OrderBean();
		this.bean.addOrders(tmp);
		List<OrderBean> result = this.bean.getOrders();
		Assert.assertTrue(result.contains(tmp));
		//End of user code
	}
	@Test
	public void setAndGetAddress() {
		//Start of user code basic set and get for address reference
		AddressBean tmp = new AddressBean();
		this.bean.setAddress(tmp);
		AddressBean result = this.bean.getAddress();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetCarts() {
		//Start of user code basic set and get for carts reference
		CartBean tmp = new CartBean();
		this.bean.setCarts(tmp);
		CartBean result = this.bean.getCarts();
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
