package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.EventStepBean;

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




// Start of user code comment for EventStep Class

// End of user code

public class EventStep
// Start of user code bloc for inheritance
 extends Step
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
	public StringProperty directionProperty(){
		if (this.directionProperty == null) {
			this.directionProperty = new SimpleStringProperty(eventStep.getDirection());
			this.directionProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					eventStep.setDirection((String) arg2);
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


	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getEventStepBean() != null ? serializer.outputString(getEventStepBean().toXML()) : "";
		
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
