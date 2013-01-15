package com.genmymodel.petshop.entity.factories;


import com.genmymodel.petshop.wrapper.Toy;
//Start of user code for imports
// TODO: import me!
//End of user code




public class ToyBuilder<BUILDER extends ToyBuilder<?>> extends ProductBuilder<BUILDER>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	
	/*
	 * Constructors 
	 */
	@javax.inject.Inject
	protected ToyBuilder() {
	}
	
	protected Toy createValue() {
		return new Toy();
	}
	
	public Toy build() throws NullPointerException {
		Toy result =  (Toy) super.build();
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
