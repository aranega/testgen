package com.dooapp.firea.wrapper;



import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Test Class
 * <!-- Start of user code comment for PersistentImage Test Class
 * End of user code -->
 */


public class PersistentImageTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private PersistentImage wrapper;	

	@Before
	public void setup(){
		this.wrapper = new PersistentImage();
	}
	
	@After
	public void teardown(){
		this.wrapper = null;
	}

	/*
	 * Basic Atts setter/getter
	 */
	@Test
	public void setAndGetTitle() {
		//Start of user code basic set and get for title attribute
		String tmp = "";
		this.wrapper.setTitle(tmp);
		String result = this.wrapper.getTitle();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetDataId() {
		//Start of user code basic set and get for dataId attribute
		String tmp = "";
		this.wrapper.setDataId(tmp);
		String result = this.wrapper.getDataId();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetError() {
		//Start of user code basic set and get for error attribute
		Boolean tmp = false;
		this.wrapper.setError(tmp);
		Boolean result = this.wrapper.isError();
		Assert.assertNotNull(result);
		Assert.assertEquals(tmp, result);
		//End of user code
	}
	@Test
	public void setAndGetSourceFile() {
		//Start of user code basic set and get for sourceFile attribute
		String tmp = "";
		this.wrapper.setSourceFile(tmp);
		String result = this.wrapper.getSourceFile();
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
