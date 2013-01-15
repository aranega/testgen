package com.genmymodel.petshop.entity.criteria;

//com.genmymodel.petshop.entity.criteria

import com.genmymodel.petshop.wrapper.criteria.ToyingCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


public class ToyingCriteriaInstance extends ProductCriteriaInstance implements Bean
{
	
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private ToyingCriteria wrapper;

	public ToyingCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new ToyingCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(ToyingCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

    


	//Start of user code for methods
	// Other methods
	//End of user code

}
