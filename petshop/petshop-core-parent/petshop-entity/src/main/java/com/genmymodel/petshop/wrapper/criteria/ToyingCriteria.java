package com.genmymodel.petshop.wrapper.criteria;

import com.genmymodel.petshop.entity.criteria.ToyingCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
//Start of user code for imports
// TODO: import me!
//End of user code




public class ToyingCriteria extends ProductCriteria implements com.dooapp.lib.common.entity.Wrapper 
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * Handled Criteria
	 */
	private ToyingCriteriaInstance toyingCriteria;

	/*
	 * Constructors 
	 */
	public ToyingCriteria(){
		this(new ToyingCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	public ToyingCriteria(ToyingCriteriaInstance entity) {
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
		this.toyingCriteria = entity;
		//Start of user code constructor with parameters
		//End of user code
	}
	
	public ToyingCriteriaInstance getToyingCriteriaInstance(){
		return this.toyingCriteria;
	}
	
	
	public ToyingCriteriaInstance getBean() {
		return  this.toyingCriteria;
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
