package com.genmymodel.petshop.wrapper.criteria;

import com.genmymodel.petshop.entity.criteria.FoodCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
//Start of user code for imports
// TODO: import me!
//End of user code


//Start of user code comment for FoodCriteria Class

//End of user code

public class FoodCriteria extends ProductCriteria implements com.dooapp.lib.common.entity.Wrapper 
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private StringProperty attributeProperty;

	/**
	 * Handled Criteria
	 */
	private FoodCriteriaInstance foodCriteria;

	/*
	 * Constructors
	 * <!-- Start of user code comment for FoodCriteria constructor
	 * End of user code -->
	 */
	public FoodCriteria(){
		this(new FoodCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for FoodCriteria constructor with parameters
	 * End of user code -->
	 */
	public FoodCriteria(FoodCriteriaInstance entity) {
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
		this.foodCriteria = entity;
		//Start of user code constructor with parameters
		//End of user code
	}
	
	public FoodCriteriaInstance getFoodCriteriaInstance(){
		return this.foodCriteria;
	}
	
	
	public FoodCriteriaInstance getBean() {
		return  this.foodCriteria;
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
	 * <!-- Start of user code comment for attribute property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty attributeProperty(){
		if (this.attributeProperty == null) {
			this.attributeProperty = new SimpleStringProperty(foodCriteria.getAttribute());
			this.attributeProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					foodCriteria.setAttribute((String) arg2);
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


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
