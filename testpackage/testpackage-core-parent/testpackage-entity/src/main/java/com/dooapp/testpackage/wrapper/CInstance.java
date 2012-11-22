package com.dooapp.testpackage.wrapper;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.LongProperty;
import com.dooapp.testpackage.entity.CInstanceBean;
import javafx.beans.property.StringProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class CInstance {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<byte[]> attribute2Property;
	
	private StringProperty attributeProperty;
	
	private CInstanceBean cInstance;
	
	private LongProperty idProperty;
    

	
	public CInstance(final CInstanceBean entity) {
		this.cInstance = entity;
		attributeProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (cInstance.getAttribute() != null)
						return cInstance.getAttribute();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						cInstance.setAttribute(arg0);
				};
			};
		attribute2Property = new SimpleObjectProperty<byte[]>()
			{
				@Override
				public byte[] get()
				{
					return null;
				};
				
				@Override
				public void set(byte[] arg0)
				{
					
						cInstance.setAttribute2(arg0);
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
					
						cInstance.setId(arg0);
				};
			};
			
	}

	
	public CInstance ()  {
		this(new CInstanceBean());	
	}

	
	public ObjectProperty<byte[]> attribute2Property ()  {
		return this.attribute2Property;	
	}

	
	public StringProperty attributeProperty ()  {
		return this.attributeProperty;	
	}

	
	public String getAttribute ()  {
		return this.attributeProperty.get();	
	}

	
	public byte[] getAttribute2 ()  {
		return this.attribute2Property.get();	
	}

	
	public CInstanceBean getCInstance ()  {
		return this.cInstance;	
	}

	
	public Long getId ()  {
		return this.idProperty.get();	
	}

	
	public LongProperty idProperty ()  {
		return this.idProperty;	
	}

	
	public void setAttribute (String myAttribute)  {
		this.attributeProperty.set(myAttribute);	
	}

	
	public void setAttribute2 (byte[] myAttribute2)  {
		this.attribute2Property.set(myAttribute2);	
	}

	
	public void setAttribute2Property (ObjectProperty<byte[]> myAttribute2Property)  {
		this.attribute2Property = myAttribute2Property;	
	}

	
	public void setAttributeProperty (StringProperty myAttributeProperty)  {
		this.attributeProperty = myAttributeProperty;	
	}

	
	public void setCInstance (CInstanceBean myCInstance)  {
		this.cInstance = myCInstance;	
	}

	
	public void setId (Long myId)  {
		this.idProperty.set(myId);	
	}

	
	public void setIdProperty (LongProperty myIdProperty)  {
		this.idProperty = myIdProperty;	
	}

	
	public void unsetAttribute2Property ()  {
		this.attribute2Property = null;	
	}

	
	public void unsetAttributeProperty ()  {
		this.attributeProperty = null;	
	}

	
	public void unsetCInstance ()  {
		this.cInstance = null;	
	}

	
	public void unsetIdProperty ()  {
		this.idProperty = null;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
