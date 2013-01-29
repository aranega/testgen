package com.dooapp.firea.entity;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.PersistentImageBuilder;
//import com.dooapp.firea.wrapper.PersistentImage;

/*
 * Test Class
 * <!-- Start of user code comment for PersistentImage Test Class
 * End of user code -->
 */


public class PersistentImageBeanTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private PersistentImageBean bean;	

	@Before
	public void setup(){
		this.bean = new PersistentImageBean();
	}
	
	@After
	public void teardown(){
		this.bean = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetTitle() {
		//Start of user code basic set and get for title attribute
		String tmp = "";
		this.bean.setTitle(tmp);
		String result = this.bean.getTitle();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDataId() {
		//Start of user code basic set and get for dataId attribute
		String tmp = "";
		this.bean.setDataId(tmp);
		String result = this.bean.getDataId();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetError() {
		//Start of user code basic set and get for error attribute
		Boolean tmp = false;
		this.bean.setError(tmp);
		Boolean result = this.bean.isError();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetSourceFile() {
		//Start of user code basic set and get for sourceFile attribute
		String tmp = "";
		this.bean.setSourceFile(tmp);
		String result = this.bean.getSourceFile();
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
