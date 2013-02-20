package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.StaticStep;





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StaticStepBuilder<BUILDER extends StaticStepBuilder<?>>
// Start of user code bloc for inerithance
 extends StepBuilder<BUILDER>
// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Double deltaP;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.inject.Inject
	protected StaticStepBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StaticStep createValue() {
		return new StaticStep();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStep build() throws NullPointerException {
		StaticStep result =  (StaticStep) super.build();
		if (deltaP == null) {
			handleDefaultDeltaP(result);
		} else { 
			result.setDeltaP(deltaP);
		}
		return result;	
	}

	/*
	 * Generated getters and setters
	 */

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultDeltaP(StaticStep result) {
		result.setDeltaP(Double.valueOf(cfg.getProperty("defaultValue.StaticStep.deltaP", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER deltaP(Double myDeltaP) {
		this.deltaP = myDeltaP;
		return (BUILDER) this;
	}

}
