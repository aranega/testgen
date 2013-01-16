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
	
	private String attribute;
	
	
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
		if (attribute == null) {
			handleDefaultAttribute(result);
		} else {
			result.setAttribute(attribute);
		}
		return result;	
	}

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for attribute default method
	 * End of user code -->
	 */
	private void handleDefaultAttribute(Food result) {
		//Start of user code default feature for handleDefaultAttribute
		result.setAttribute(cfg.getProperty("defaultValue.Food.attribute"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for attribute
	 * End of user code -->
	 */
	public BUILDER attribute(String myAttribute) {
			this.attribute = myAttribute;
			return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
