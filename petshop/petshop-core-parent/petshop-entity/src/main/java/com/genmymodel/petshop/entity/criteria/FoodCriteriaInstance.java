package com.genmymodel.petshop.entity.criteria;

//com.genmymodel.petshop.entity.criteria

import com.genmymodel.petshop.wrapper.criteria.FoodCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


public class FoodCriteriaInstance extends ProductCriteriaInstance implements Bean
{
	
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private FoodCriteria wrapper;

	public FoodCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new FoodCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(FoodCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

    


	//Start of user code for methods
	// Other methods
	//End of user code

}
