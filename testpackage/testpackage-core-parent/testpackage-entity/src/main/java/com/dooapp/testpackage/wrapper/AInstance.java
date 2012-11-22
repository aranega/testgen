package com.dooapp.testpackage.wrapper;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleLongProperty;
import com.dooapp.testpackage.entity.BInstanceBean;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.DoubleProperty;
import com.dooapp.testpackage.entity.AInstanceBean;
import javafx.beans.property.StringProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class AInstance {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private AInstanceBean aInstance;
	
	private IntegerProperty attribute2Property;
	
	private StringProperty attribute5Property;
	
	private DoubleProperty attributeProperty;
	private ObservableList<BInstance> binstanceProperty;
	
	private LongProperty idProperty;
    

	
	public AInstance(final AInstanceBean entity) {
		this.aInstance = entity;
		attributeProperty = new SimpleDoubleProperty()
			{
				@Override
				public double get()
				{
					return 0.0;
				};
				
				@Override
				public void set(double arg0)
				{
					
						aInstance.setAttribute(arg0);
				};
			};
		attribute2Property = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						aInstance.setAttribute2(arg0);
				};
			};
		attribute5Property = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (aInstance.getAttribute5() != null)
						return aInstance.getAttribute5();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						aInstance.setAttribute5(arg0);
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
					
						aInstance.setId(arg0);
				};
			};
		binstanceProperty = FXCollections.observableList(new ArrayList<BInstance>());
		for (BInstanceBean tmp : entity.getBinstance()) {
			binstanceProperty.add(new BInstance(tmp));
		}
		binstanceProperty.addListener(new javafx.collections.ListChangeListener<BInstance>() {
			@Override
			public void onChanged(javafx.collections.ListChangeListener.Change<? extends BInstance> change) {
				while (change.next()) {
					if (change.getAddedSize() > 0) {
						for (BInstance tmp : change.getAddedSubList()) {
							entity.addBinstance(tmp.getBInstance());
						}
					}
					if (change.getRemovedSize() > 0) {
						for (BInstance tmp : change.getRemoved()) {
							entity.getBinstance().remove(tmp.getBInstance());
						}
					}
				}
			}
		});
			
	}

	
	public AInstance ()  {
		this(new AInstanceBean());	
	}

	
	public IntegerProperty attribute2Property ()  {
		return this.attribute2Property;	
	}

	
	public StringProperty attribute5Property ()  {
		return this.attribute5Property;	
	}

	
	public DoubleProperty attributeProperty ()  {
		return this.attributeProperty;	
	}

	
	public ObservableList<BInstance> binstanceProperty() {
		return this.binstanceProperty;	
	}

	
	public AInstanceBean getAInstance ()  {
		return this.aInstance;	
	}

	
	public Double getAttribute ()  {
		return this.attributeProperty.get();	
	}

	
	public Integer getAttribute2 ()  {
		return this.attribute2Property.get();	
	}

	
	public String getAttribute5 ()  {
		return this.attribute5Property.get();	
	}

	
	public Long getId ()  {
		return this.idProperty.get();	
	}

	
	public LongProperty idProperty ()  {
		return this.idProperty;	
	}

	
	public void setAInstance (AInstanceBean myAInstance)  {
		this.aInstance = myAInstance;	
	}

	
	public void setAttribute (Double myAttribute)  {
		this.attributeProperty.set(myAttribute);	
	}

	
	public void setAttribute2 (Integer myAttribute2)  {
		this.attribute2Property.set(myAttribute2);	
	}

	
	public void setAttribute2Property (IntegerProperty myAttribute2Property)  {
		this.attribute2Property = myAttribute2Property;	
	}

	
	public void setAttribute5 (String myAttribute5)  {
		this.attribute5Property.set(myAttribute5);	
	}

	
	public void setAttribute5Property (StringProperty myAttribute5Property)  {
		this.attribute5Property = myAttribute5Property;	
	}

	
	public void setAttributeProperty (DoubleProperty myAttributeProperty)  {
		this.attributeProperty = myAttributeProperty;	
	}

	
	public void setId (Long myId)  {
		this.idProperty.set(myId);	
	}

	
	public void setIdProperty (LongProperty myIdProperty)  {
		this.idProperty = myIdProperty;	
	}

	
	public void unsetAInstance ()  {
		this.aInstance = null;	
	}

	
	public void unsetAttribute2Property ()  {
		this.attribute2Property = null;	
	}

	
	public void unsetAttribute5Property ()  {
		this.attribute5Property = null;	
	}

	
	public void unsetAttributeProperty ()  {
		this.attributeProperty = null;	
	}

	
	public void unsetIdProperty ()  {
		this.idProperty = null;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
