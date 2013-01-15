package com.genmymodel.petshop.entity.factories;


import com.genmymodel.petshop.wrapper.Food;
//Start of user code for imports
// TODO: import me!
//End of user code




public class FoodBuilder<BUILDER extends FoodBuilder<?>> extends ProductBuilder<BUILDER>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	
	/*
	 * Constructors 
	 */
	@javax.inject.Inject
	protected FoodBuilder() {
	}
	
	protected Food createValue() {
		return new Food();
	}
	
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
