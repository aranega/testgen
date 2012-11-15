package test.wrapper;

import javafx.beans.property.SimpleLongProperty;
import test.entity.SimpleClass;
import javafx.beans.property.LongProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class SimpleClassWrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private LongProperty idProperty;
	
	private SimpleClass simpleClass;
    

	
	public SimpleClassWrapper(final SimpleClass entity)
	{
		this.simpleClass = entity;
		idProperty = new SimpleLongProperty()
			{
				@Override
				public long get()
				{
					return 0;
				};
				
				@Override
				public void set(long arg0)
				{
					
						simpleClass.setId(arg0);
				};
			};
			
	}

	
	public SimpleClassWrapper () 
	{
		this(new SimpleClass());	
	}

	
	public Long getId () 
	{
		return this.idProperty.get();	
	}

	
	public SimpleClass getSimpleClass () 
	{
		return this.simpleClass;	
	}

	
	public LongProperty idProperty () 
	{
		return this.idProperty;	
	}

	
	public void setId (Long myId) 
	{
		this.idProperty.set(myId);	
	}

	
	public void setIdProperty (LongProperty myIdProperty) 
	{
		this.idProperty = myIdProperty;	
	}

	
	public void setSimpleClass (SimpleClass mySimpleClass) 
	{
		this.simpleClass = mySimpleClass;	
	}

	
	public void unsetIdProperty () 
	{
		this.idProperty = null;	
	}

	
	public void unsetSimpleClass () 
	{
		this.simpleClass = null;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
