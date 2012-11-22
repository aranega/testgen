package com.dooapp.testpackage.wrapper;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleLongProperty;
import com.dooapp.testpackage.entity.MyClassBean;
import javafx.beans.property.LongProperty;
import javafx.beans.property.StringProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class MyClass {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private StringProperty attributeProperty;
	
	private LongProperty idProperty;
	
	private MyClassBean myClass;
    

	
	public MyClass(final MyClassBean entity) {
		this.myClass = entity;
		attributeProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (myClass.getAttribute() != null)
						return myClass.getAttribute();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						myClass.setAttribute(arg0);
				};
			};
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
					
						myClass.setId(arg0);
				};
			};
			
	}

	
	public MyClass ()  {
		this(new MyClassBean());	
	}

	
	public StringProperty attributeProperty ()  {
		return this.attributeProperty;	
	}

	
	public String getAttribute ()  {
		return this.attributeProperty.get();	
	}

	
	public Long getId ()  {
		return this.idProperty.get();	
	}

	
	public MyClassBean getMyClass ()  {
		return this.myClass;	
	}

	
	public LongProperty idProperty ()  {
		return this.idProperty;	
	}

	
	public void setAttribute (String myAttribute)  {
		this.attributeProperty.set(myAttribute);	
	}

	
	public void setAttributeProperty (StringProperty myAttributeProperty)  {
		this.attributeProperty = myAttributeProperty;	
	}

	
	public void setId (Long myId)  {
		this.idProperty.set(myId);	
	}

	
	public void setIdProperty (LongProperty myIdProperty)  {
		this.idProperty = myIdProperty;	
	}

	
	public void setMyClass (MyClassBean myMyClass)  {
		this.myClass = myMyClass;	
	}

	
	public void unsetAttributeProperty ()  {
		this.attributeProperty = null;	
	}

	
	public void unsetIdProperty ()  {
		this.idProperty = null;	
	}

	
	public void unsetMyClass ()  {
		this.myClass = null;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
