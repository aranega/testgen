package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.MainStep;





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class MainStepBuilder<BUILDER extends MainStepBuilder<?>>
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
	
	private Double calculatedELA;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Double cl;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Double correlation;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String direction;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Double n;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.inject.Inject
	protected MainStepBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected MainStep createValue() {
		return new MainStep();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MainStep build() throws NullPointerException {
		MainStep result =  (MainStep) super.build();
		if (calculatedELA == null) {
			handleDefaultCalculatedELA(result);
		} else { 
			result.setCalculatedELA(calculatedELA);
		}
		if (cl == null) {
			handleDefaultCl(result);
		} else { 
			result.setCl(cl);
		}
		if (correlation == null) {
			handleDefaultCorrelation(result);
		} else { 
			result.setCorrelation(correlation);
		}
		if (direction == null) {
			handleDefaultDirection(result);
		} else { 
			result.setDirection(direction);
		}
		if (n == null) {
			handleDefaultN(result);
		} else { 
			result.setN(n);
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
	private void handleDefaultCalculatedELA(MainStep result) {
		result.setCalculatedELA(Double.valueOf(cfg.getProperty("defaultValue.MainStep.calculatedELA", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultCl(MainStep result) {
		result.setCl(Double.valueOf(cfg.getProperty("defaultValue.MainStep.cl", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultCorrelation(MainStep result) {
		result.setCorrelation(Double.valueOf(cfg.getProperty("defaultValue.MainStep.correlation", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultDirection(MainStep result) {
		result.setDirection(cfg.getProperty("defaultValue.MainStep.direction"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultN(MainStep result) {
		result.setN(Double.valueOf(cfg.getProperty("defaultValue.MainStep.n", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER calculatedELA(Double myCalculatedELA) {
		this.calculatedELA = myCalculatedELA;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER cl(Double myCl) {
		this.cl = myCl;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER correlation(Double myCorrelation) {
		this.correlation = myCorrelation;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER direction(String myDirection) {
		this.direction = myDirection;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER n(Double myN) {
		this.n = myN;
		return (BUILDER) this;
	}

}
