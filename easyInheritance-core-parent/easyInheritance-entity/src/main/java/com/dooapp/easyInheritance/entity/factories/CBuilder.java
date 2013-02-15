package com.dooapp.easyInheritance.entity.factories;


import com.dooapp.easyInheritance.wrapper.C;





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class CBuilder<BUILDER extends CBuilder<?>>
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
	protected CBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected C createValue() {
		return new C();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public C build() throws NullPointerException {
		C result =  (C) super.build();
		return result;	
	}

	/*
	 * Generated getters and setters
	 */

}
