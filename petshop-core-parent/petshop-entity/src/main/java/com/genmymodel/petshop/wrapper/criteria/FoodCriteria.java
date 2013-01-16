package com.genmymodel.petshop.wrapper.criteria;

import com.genmymodel.petshop.entity.criteria.FoodCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
