package com.dooapp.testpackage.wrapper;

import javafx.beans.property.SimpleLongProperty;
import com.dooapp.testpackage.entity.CInstanceBean;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import com.dooapp.testpackage.entity.BInstanceBean;
import javafx.beans.property.LongProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class BInstance {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private LongProperty attributeProperty;
	
	private BInstanceBean bInstance;
	private ObjectProperty<CInstance> cinstanceProperty;
	
	private LongProperty idProperty;
    

	
	public BInstance(final BInstanceBean entity) {
		this.bInstance = entity;
		attributeProperty = new SimpleLongProperty()
			{
				@Override
				public long get()
				{
					return 0;
				};
				
				@Override
				public void set(long arg0)
				{
					
						bInstance.setAttribute(arg0);
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
					
						bInstance.setId(arg0);
				};
			};
		cinstanceProperty = new SimpleObjectProperty<CInstance>()
					{
						@Override
						public CInstance get()
						{
							return new CInstance(bInstance.getCinstance());
						};
						
						@Override
						public void set(CInstance arg0)
						{
							//if (arg0 != null)
							bInstance.setCinstance(arg0.getCInstance());
						};
					};
			
	}

	
	public BInstance ()  {
		this(new BInstanceBean());	
	}

	
	public LongProperty attributeProperty ()  {
		return this.attributeProperty;	
	}

	
	public ObjectProperty<CInstance> cinstanceProperty() {
		return this.cinstanceProperty;	
	}

	
	public Long getAttribute ()  {
		return this.attributeProperty.get();	
	}

	
	public BInstanceBean getBInstance ()  {
		return this.bInstance;	
	}

	
	public CInstance getCinstance()  {
		return this.cinstanceProperty.get();	
	}

	
	public Long getId ()  {
		return this.idProperty.get();	
	}

	
	public LongProperty idProperty ()  {
		return this.idProperty;	
	}

	
	public void setAttribute (Long myAttribute)  {
		this.attributeProperty.set(myAttribute);	
	}

	
	public void setAttributeProperty (LongProperty myAttributeProperty)  {
		this.attributeProperty = myAttributeProperty;	
	}

	
	public void setBInstance (BInstanceBean myBInstance)  {
		this.bInstance = myBInstance;	
	}

	
	public void setCinstance(CInstance myCinstance)  {
		this.cinstanceProperty.set(myCinstance);	
	}

	
	public void setId (Long myId)  {
		this.idProperty.set(myId);	
	}

	
	public void setIdProperty (LongProperty myIdProperty)  {
		this.idProperty = myIdProperty;	
	}

	
	public void unsetAttributeProperty ()  {
		this.attributeProperty = null;	
	}

	
	public void unsetBInstance ()  {
		this.bInstance = null;	
	}

	
	public void unsetIdProperty ()  {
		this.idProperty = null;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
