package com.dooapp.testpackage.entity.factories;

import com.dooapp.testpackage.entity.MyClassBean;
import java.util.Date;
import com.dooapp.testpackage.wrapper.MyClass;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class MyClassBuilder {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private MyClassBean myclass;
    

	
	public MyClass build ()  {
		return new MyClass (myclass);	
	}

	
	public static MyClassBuilder create ()  {
		return new MyClassBuilder();	
	}

	
	public MyClassBuilder dateMe (Date dateMe)  {
		myclass.setDateMe (dateMe);
		return this;	
	}

	
	public MyClassBuilder id (Long id)  {
		myclass.setId (id);
		return this;	
	}

	
	public MyClassBuilder initMyClass ()  {
		myclass = new MyClassBean();
		return this;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
