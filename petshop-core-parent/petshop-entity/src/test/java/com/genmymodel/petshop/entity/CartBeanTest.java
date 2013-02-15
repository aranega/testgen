package com.genmymodel.petshop.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.List;
//Start of user code for imports
// TODO: import me!
//End of user code

//import com.genmymodel.petshop.entity.factories.CartBuilder;
//import com.genmymodel.petshop.wrapper.Cart;

/*
 * Test Class
 * <!-- Start of user code comment for Cart Test Class
 * End of user code -->
 */


public class CartBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private CartBean bean;	

	@Before
	public void setup(){
		this.bean = new CartBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
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
	public void setAndGetCustomer() {
		//Start of user code basic set and get for customer reference
		CustomerBean tmp = new CustomerBean();
		this.bean.setCustomer(tmp);
		CustomerBean result = this.bean.getCustomer();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetOrder() {
		//Start of user code basic set and get for order reference
		OrderBean tmp = new OrderBean();
		this.bean.setOrder(tmp);
		OrderBean result = this.bean.getOrder();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetItems() {
		//Start of user code basic set and get for items reference
		ItemBean tmp = new ItemBean();
		this.bean.addItems(tmp);
		List<ItemBean> result = this.bean.getItems();
		Assert.assertTrue(result.contains(tmp));
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
