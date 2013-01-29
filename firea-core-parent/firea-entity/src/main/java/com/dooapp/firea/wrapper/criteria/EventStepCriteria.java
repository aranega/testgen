package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.EventStepCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

//Start of user code for imports
// TODO: import me!
//End of user code




// Start of user code comment for EventStepCriteria Class

// End of user code

public class EventStepCriteria 
// Start of user code bloc for inheritance
 extends StepCriteria
// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private StringProperty directionProperty;

	/**
	 * Handled Criteria
	 */
	private EventStepCriteriaInstance eventStepCriteria;

	/*
	 * Constructors
	 * <!-- Start of user code comment for EventStepCriteria constructor
	 * End of user code -->
	 */
	public EventStepCriteria(){
		this(new EventStepCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for EventStepCriteria constructor with parameters
	 * End of user code -->
	 */
	public EventStepCriteria(EventStepCriteriaInstance entity) {
		 super(entity);
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.eventStepCriteria = entity;
		// Start of user code constructor with parameters
		// End of user code
	}
	
	public EventStepCriteriaInstance getEventStepCriteriaInstance(){
		return this.eventStepCriteria;
	}
	
	
	public EventStepCriteriaInstance getBean() {
		return  this.eventStepCriteria;
	}
	

	/*
	 * Generated getters and setters
	 */
	/**
	 * For compliance purpose only always return 0!
     */
	public long getId(){
		return 0;
	}	

	/*
	 * <!-- Start of user code comment for direction property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty directionProperty(){
		if (this.directionProperty == null) {
			this.directionProperty = new SimpleStringProperty(eventStepCriteria.getDirection());
			this.directionProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					eventStepCriteria.setDirection((String) arg2);
				}
			});
			//Start of user code directionproperty method
			//End of user code
		}
		return this.directionProperty;
	}
	
	/*
	 * <!-- Start of user code comment for direction getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getDirection(){
		return directionProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for direction setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDirection(String myDirection){
		this.directionProperty().set(myDirection);
	}
	
	public void updateDirection(final String myDirection, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDirection(myDirection);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDirection(myDirection);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDirection(final String myDirection) {
		updateDirection(myDirection, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
