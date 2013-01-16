package com.genmymodel.petshop.wrapper;

import com.genmymodel.petshop.entity.ToyBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
//Start of user code for imports
// TODO: import me!
//End of user code


//Start of user code comment for Toy Class

//End of user code

public class Toy extends Product implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * Handled Entity
	 */
	private final ToyBean toy;

	/*
	 * Constructors
	 * <!-- Start of user code comment for Toy constructor
	 * End of user code -->
	 */
	public Toy(){
		this(new ToyBean());	
	}
	
	
	public Toy(ToyBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.toy = entity;
	}
	
	public ToyBean getToyBean(){
		return this.toy;
	}
	
	public ToyBean getBean() {
		return  this.toy;
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
