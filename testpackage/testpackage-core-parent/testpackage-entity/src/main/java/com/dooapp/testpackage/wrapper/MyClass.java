package com.dooapp.testpackage.wrapper;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import java.util.Date;
import javafx.beans.property.LongProperty;
import com.dooapp.testpackage.entity.MyClassBean;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class MyClass {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<Date> dateMeProperty;
	
	private LongProperty idProperty;
	
	private MyClassBean myClass;
    

	
	public MyClass(final MyClassBean entity) {
		this.myClass = entity;
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
		dateMeProperty = new SimpleObjectProperty<Date>()
			{
				@Override
				public Date get()
				{
					if (myClass.getDateMe() != null)
						return myClass.getDateMe();
					else
						return new Date();
				};
				
				@Override
				public void set(Date arg0)
				{
					
						myClass.setDateMe(arg0);
				};
			};
			
	}

	
	public MyClass ()  {
		this(new MyClassBean());	
	}

	
	public ObjectProperty<Date> dateMeProperty ()  {
		return this.dateMeProperty;	
	}

	
	public Date getDateMe ()  {
		return this.dateMeProperty.get();	
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

	
	public void setDateMe (Date myDateMe)  {
		this.dateMeProperty.set(myDateMe);	
	}

	
	public void setDateMeProperty (ObjectProperty<Date> myDateMeProperty)  {
		this.dateMeProperty = myDateMeProperty;	
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

	
	public void unsetDateMeProperty ()  {
		this.dateMeProperty = null;	
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
