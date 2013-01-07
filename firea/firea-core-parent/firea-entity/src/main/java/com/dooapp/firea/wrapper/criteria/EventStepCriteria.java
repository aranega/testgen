package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.EventStepCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
//Start of user code for imports
// TODO: import me!
//End of user code




public class EventStepCriteria extends StepCriteria implements com.dooapp.lib.common.entity.Wrapper 
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<com.dooapp.firea.entity.Direction> directionProperty;

	/**
	 * Handled Criteria
	 */
	private EventStepCriteriaInstance eventStepCriteria;

	/*
	 * Constructors 
	 */
	public EventStepCriteria(){
		this(new EventStepCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
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

	public ObjectProperty<com.dooapp.firea.entity.Direction> directionProperty() {
		if (directionProperty == null) {
			directionProperty = new SimpleObjectProperty<com.dooapp.firea.entity.Direction>(eventStepCriteria.getDirection());
			directionProperty.addListener(new ChangeListener<com.dooapp.firea.entity.Direction>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.Direction> arg0, com.dooapp.firea.entity.Direction arg1, com.dooapp.firea.entity.Direction arg2) {
					eventStepCriteria.setDirection(arg2);
				}
			});
			//Start of user code directionproperty method
			//End of user code
		}
		return directionProperty;
	}
	
	public com.dooapp.firea.entity.Direction getDirection(){
		return directionProperty().get();
	} 
	
	public void setDirection(com.dooapp.firea.entity.Direction myDirection){
		if (directionProperty == null) {
				eventStepCriteria.setDirection(myDirection);
			} else {
				this.directionProperty().set(myDirection);
			}
	}
	
	public void updateDirection(final com.dooapp.firea.entity.Direction myDirection, final Object mutex) {
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
	
	public void updateDirection(final com.dooapp.firea.entity.Direction myDirection) {
		updateDirection(myDirection, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
