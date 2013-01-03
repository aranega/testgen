package com.genmymodel.petshop.wrapper;

import com.genmymodel.petshop.entity.FoodBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
//Start of user code for imports
// TODO: import me!
//End of user code




public class Food extends Product implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * Handled Entity
	 */
	private final FoodBean food;

	/*
	 * Constructors 
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
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
