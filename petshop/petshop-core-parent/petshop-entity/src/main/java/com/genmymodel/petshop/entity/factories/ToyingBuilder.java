package com.genmymodel.petshop.entity.factories;


import com.genmymodel.petshop.wrapper.Toying;
//Start of user code for imports
// TODO: import me!
//End of user code




public class ToyingBuilder<BUILDER extends ToyingBuilder<?>> extends ProductBuilder<BUILDER>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	
	/*
	 * Constructors 
	 */
	@javax.inject.Inject
	protected ToyingBuilder() {
	}
	
	protected Toying createValue() {
		return new Toying();
	}
	
	public Toying build() throws NullPointerException {
		Toying result =  (Toying) super.build();
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
