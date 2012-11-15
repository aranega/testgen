package test.entity.factories;

import test.entity.SimpleClass;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class SimpleClassBuilder
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private SimpleClass simpleclass;
    

	
	public SimpleClass build () 
	{
		return simpleclass;	
	}

	
	public static SimpleClassBuilder create () 
	{
		return new SimpleClassBuilder();	
	}

	
	public SimpleClassBuilder id (Long id) 
	{
		simpleclass.setId (id);
		return this;	
	}

	
	public SimpleClassBuilder initSimpleClass () 
	{
		simpleclass = new SimpleClass();
		return this;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
