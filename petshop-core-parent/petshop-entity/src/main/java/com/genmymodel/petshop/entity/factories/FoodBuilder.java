package com.genmymodel.petshop.entity.factories;


import com.genmymodel.petshop.wrapper.Food;
//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Class
 * <!-- Start of user code comment for Food Builder
 * End of user code -->
 */

public class FoodBuilder<BUILDER extends FoodBuilder<?>> extends ProductBuilder<BUILDER>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for Food getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected FoodBuilder() {
	}
	
	protected Food createValue() {
		return new Food();
	}
	
	/*
	 * <!-- Start of user code comment for Food build method
	 * End of user code -->
	 */
	public Food build() throws NullPointerException {
		Food result =  (Food) super.build();
		return result;	
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
