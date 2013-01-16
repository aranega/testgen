package com.genmymodel.petshop.entity.criteria;

import com.genmymodel.petshop.wrapper.criteria.FoodCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for FoodCriteria Class
 * End of user code -->
 */

public class FoodCriteriaInstance extends ProductCriteriaInstance implements Bean
{
	
	
	private String attribute;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private FoodCriteria wrapper;

	/*
	 * <!-- Start of user code comment for FoodCriteria wrapper getter
	 * End of user code -->
	 */
	public FoodCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new FoodCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for FoodCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(FoodCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/*
	 * <!-- Start of user code comment for attribute getter
	 * End of user code -->
	 */
	public String getAttribute(){
		return this.attribute;
	}
	
	/*
	 * <!-- Start of user code comment for attribute setter
	 * End of user code -->
	 */
	public void setAttribute(String arg0){
		this.attribute = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
