package com.dooapp.easyInheritance.entity.factories;


import com.dooapp.easyInheritance.wrapper.A;





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ABuilder<BUILDER extends ABuilder<?>>
// Start of user code bloc for inerithance
 extends BBuilder<BUILDER>
// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.inject.Inject
	protected ABuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected A createValue() {
		return new A();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public A build() throws NullPointerException {
		A result =  (A) super.build();
		return result;	
	}

	/*
	 * Generated getters and setters
	 */

}
