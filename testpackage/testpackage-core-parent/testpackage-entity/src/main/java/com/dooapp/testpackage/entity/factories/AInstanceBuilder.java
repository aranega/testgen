package com.dooapp.testpackage.entity.factories;

import com.dooapp.testpackage.entity.AInstanceBean;
import com.dooapp.testpackage.wrapper.AInstance;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class AInstanceBuilder {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private AInstanceBean ainstance;
    

	
	public AInstanceBuilder attribute (Double attribute)  {
		ainstance.setAttribute (attribute);
		return this;	
	}

	
	public AInstanceBuilder attribute2 (Integer attribute2)  {
		ainstance.setAttribute2 (attribute2);
		return this;	
	}

	
	public AInstanceBuilder attribute5 (String attribute5)  {
		ainstance.setAttribute5 (attribute5);
		return this;	
	}

	
	public AInstance build ()  {
		return new AInstance (ainstance);	
	}

	
	public static AInstanceBuilder create ()  {
		return new AInstanceBuilder();	
	}

	
	public AInstanceBuilder id (Long id)  {
		ainstance.setId (id);
		return this;	
	}

	
	public AInstanceBuilder initAInstance ()  {
		ainstance = new AInstanceBean();
		return this;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
