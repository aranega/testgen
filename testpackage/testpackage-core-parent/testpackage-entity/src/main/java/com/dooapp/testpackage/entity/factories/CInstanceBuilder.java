package com.dooapp.testpackage.entity.factories;

import com.dooapp.testpackage.wrapper.CInstance;
import com.dooapp.testpackage.entity.CInstanceBean;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class CInstanceBuilder {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private CInstanceBean cinstance;
    

	
	public CInstanceBuilder attribute (String attribute)  {
		cinstance.setAttribute (attribute);
		return this;	
	}

	
	public CInstanceBuilder attribute2 (byte[] attribute2)  {
		cinstance.setAttribute2 (attribute2);
		return this;	
	}

	
	public CInstance build ()  {
		return new CInstance (cinstance);	
	}

	
	public static CInstanceBuilder create ()  {
		return new CInstanceBuilder();	
	}

	
	public CInstanceBuilder id (Long id)  {
		cinstance.setId (id);
		return this;	
	}

	
	public CInstanceBuilder initCInstance ()  {
		cinstance = new CInstanceBean();
		return this;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
