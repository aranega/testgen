package com.genmymodel.petshop.entity.factories;


import com.genmymodel.petshop.wrapper.Toy;

//Start of user code for imports
// TODO: import me!
//End of user code




/*
 * Class
 * <!-- Start of user code comment for Toy Builder
 * End of user code -->
 */
/**
 *  
 */
public class ToyBuilder<BUILDER extends ToyBuilder<?>>
// Start of user code bloc for inerithance
 extends ProductBuilder<BUILDER>
// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for Toy getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected ToyBuilder() {
	}
	
	protected Toy createValue() {
		return new Toy();
	}
	
	/*
	 * <!-- Start of user code comment for Toy build method
	 * End of user code -->
	 */
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
	// Start of user code for methods
	// Other methods
	// End of user code

}