package com.genmymodel.petshop.wrapper;

import com.genmymodel.petshop.entity.FoodBean;

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




// Start of user code comment for Food Class

// End of user code

public class Food
// Start of user code bloc for inheritance
 extends Product
// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	/**
	 *  
	 */
	private StringProperty attributeProperty;

	/**
	 * Handled Entity
	 */
	private final FoodBean food;

	/*
	 * Constructors
	 * <!-- Start of user code comment for Food constructor
	 * End of user code -->
	 */
	public Food(){
		this(new FoodBean());	
	}
	
	
	public Food(FoodBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.food = entity;
	}
	
	public FoodBean getFoodBean(){
		return this.food;
	}
	
	public FoodBean getBean() {
		return  this.food;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for attribute property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty attributeProperty(){
		if (this.attributeProperty == null) {
			this.attributeProperty = new SimpleStringProperty(food.getAttribute());
			this.attributeProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					food.setAttribute((String) arg2);
				}
			});
			//Start of user code attributeproperty method
			//End of user code
		}
		return this.attributeProperty;
	}
	
	/*
	 * <!-- Start of user code comment for attribute getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getAttribute(){
		return attributeProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for attribute setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setAttribute(String myAttribute){
		this.attributeProperty().set(myAttribute);
	}
	
	public void updateAttribute(final String myAttribute, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAttribute(myAttribute);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAttribute(myAttribute);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateAttribute(final String myAttribute) {
		updateAttribute(myAttribute, null);
	}


	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getFoodBean() != null ? serializer.outputString(getFoodBean().toXML()) : "";
		
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
