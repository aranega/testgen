package com.dooapp.fireaOLD.wrapper;

import com.dooapp.fireaOLD.entity.EventStepBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
//Start of user code for imports
// TODO: import me!
//End of user code


//Start of user code comment for EventStep Class

//End of user code

public class EventStep extends Step implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<com.dooapp.fireaOLD.entity.Direction> directionProperty;

	/**
	 * Handled Entity
	 */
	private final EventStepBean eventStep;

	/*
	 * Constructors
	 * <!-- Start of user code comment for EventStep constructor
	 * End of user code -->
	 */
	public EventStep(){
		this(new EventStepBean());	
	}
	
	
	public EventStep(EventStepBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.eventStep = entity;
	}
	
	public EventStepBean getEventStepBean(){
		return this.eventStep;
	}
	
	public EventStepBean getBean() {
		return  this.eventStep;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for direction property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<com.dooapp.fireaOLD.entity.Direction> directionProperty() {
		if (directionProperty == null) {
			directionProperty = new SimpleObjectProperty<com.dooapp.fireaOLD.entity.Direction>(eventStep.getDirection());
			directionProperty.addListener(new ChangeListener<com.dooapp.fireaOLD.entity.Direction>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.fireaOLD.entity.Direction> arg0, com.dooapp.fireaOLD.entity.Direction arg1, com.dooapp.fireaOLD.entity.Direction arg2) {
					eventStep.setDirection(arg2);
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
				eventStep.setDirection(myDirection);
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
