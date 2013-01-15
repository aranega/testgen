package com.dooapp.fireaOLD.wrapper.criteria;

import com.dooapp.fireaOLD.entity.criteria.EventStepCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
//Start of user code for imports
// TODO: import me!
//End of user code


//Start of user code comment for EventStepCriteria Class

//End of user code

public class EventStepCriteria extends StepCriteria implements com.dooapp.lib.common.entity.Wrapper 
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<com.dooapp.fireaOLD.entity.Direction> directionProperty;

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
		//Start of user code constructor with parameters
		//End of user code
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
	public ObjectProperty<com.dooapp.fireaOLD.entity.Direction> directionProperty() {
		if (directionProperty == null) {
			directionProperty = new SimpleObjectProperty<com.dooapp.fireaOLD.entity.Direction>(eventStepCriteria.getDirection());
			directionProperty.addListener(new ChangeListener<com.dooapp.fireaOLD.entity.Direction>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.fireaOLD.entity.Direction> arg0, com.dooapp.fireaOLD.entity.Direction arg1, com.dooapp.fireaOLD.entity.Direction arg2) {
					eventStepCriteria.setDirection(arg2);
				}
			});
			//Start of user code directionproperty method
			//End of user code
		}
		return directionProperty;
	}
	
	/*
	 * <!-- Start of user code comment for direction getter 
		-->
	 * <!-- End of user code -->
	 */
	public com.dooapp.fireaOLD.entity.Direction getDirection(){
		return directionProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for direction setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDirection(com.dooapp.fireaOLD.entity.Direction myDirection){
		if (directionProperty == null) {
				eventStepCriteria.setDirection(myDirection);
			} else {
				this.directionProperty().set(myDirection);
			}
	}
	
	public void updateDirection(final com.dooapp.fireaOLD.entity.Direction myDirection, final Object mutex) {
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
	
	public void updateDirection(final com.dooapp.fireaOLD.entity.Direction myDirection) {
		updateDirection(myDirection, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
