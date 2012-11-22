package com.dooapp.testpackage.entity.factories;

import com.dooapp.testpackage.entity.BInstanceBean;
import com.dooapp.testpackage.wrapper.BInstance;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class BInstanceBuilder {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private BInstanceBean binstance;
    

	
	public BInstanceBuilder attribute (Long attribute)  {
		binstance.setAttribute (attribute);
		return this;	
	}

	
	public BInstance build ()  {
		return new BInstance (binstance);	
	}

	
	public static BInstanceBuilder create ()  {
		return new BInstanceBuilder();	
	}

	
	public BInstanceBuilder id (Long id)  {
		binstance.setId (id);
		return this;	
	}

	
	public BInstanceBuilder initBInstance ()  {
		binstance = new BInstanceBean();
		return this;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
