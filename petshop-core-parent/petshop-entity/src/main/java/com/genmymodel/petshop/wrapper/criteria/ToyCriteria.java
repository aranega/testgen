package com.genmymodel.petshop.wrapper.criteria;

import com.genmymodel.petshop.entity.criteria.ToyCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

//Start of user code for imports
// TODO: import me!
//End of user code




// Start of user code comment for ToyCriteria Class

// End of user code

public class ToyCriteria 
// Start of user code bloc for inheritance
 extends ProductCriteria
// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code

	/**
	 * Handled Criteria
	 */
	private ToyCriteriaInstance toyCriteria;

	/*
	 * Constructors
	 * <!-- Start of user code comment for ToyCriteria constructor
	 * End of user code -->
	 */
	public ToyCriteria(){
		this(new ToyCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for ToyCriteria constructor with parameters
	 * End of user code -->
	 */
	public ToyCriteria(ToyCriteriaInstance entity) {
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
		this.toyCriteria = entity;
		// Start of user code constructor with parameters
		// End of user code
	}
	
	public ToyCriteriaInstance getToyCriteriaInstance(){
		return this.toyCriteria;
	}
	
	
	public ToyCriteriaInstance getBean() {
		return  this.toyCriteria;
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
