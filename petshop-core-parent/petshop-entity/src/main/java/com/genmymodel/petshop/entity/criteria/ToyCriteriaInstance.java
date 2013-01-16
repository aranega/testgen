package com.genmymodel.petshop.entity.criteria;

import com.genmymodel.petshop.wrapper.criteria.ToyCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for ToyCriteria Class
 * End of user code -->
 */

public class ToyCriteriaInstance extends ProductCriteriaInstance implements Bean
{
	
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private ToyCriteria wrapper;

	/*
	 * <!-- Start of user code comment for ToyCriteria wrapper getter
	 * End of user code -->
	 */
	public ToyCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new ToyCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for ToyCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(ToyCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

    


	//Start of user code for methods
	// Other methods
	//End of user code

}
