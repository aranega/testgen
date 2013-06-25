package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.CalibrationStep;
import com.dooapp.firea.entity.CalibrationStepBean;


import com.dooapp.firea.enumeration.StepStatus;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class CalibrationStepBuilder<BUILDER extends CalibrationStepBuilder<?>>
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
	private Double afterHoleELA;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double beforeHoleELA;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double errorPercent;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.inject.Inject
	protected CalibrationStepBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected CalibrationStep createValue() {
		return new CalibrationStep(new CalibrationStepBean());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public CalibrationStep build() throws NullPointerException {
		CalibrationStep result =  (CalibrationStep) super.build();
		if (afterHoleELA == null) {
			handleDefaultAfterHoleELA(result);
		} else {
			result.setAfterHoleELA(afterHoleELA);
		}
		if (beforeHoleELA == null) {
			handleDefaultBeforeHoleELA(result);
		} else {
			result.setBeforeHoleELA(beforeHoleELA);
		}
		if (errorPercent == null) {
			handleDefaultErrorPercent(result);
		} else {
			result.setErrorPercent(errorPercent);
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
	protected void handleDefaultAfterHoleELA(CalibrationStep result) {
		result.setAfterHoleELA(Double.valueOf(cfg.getProperty("defaultValue.CalibrationStep.afterHoleELA", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultBeforeHoleELA(CalibrationStep result) {
		result.setBeforeHoleELA(Double.valueOf(cfg.getProperty("defaultValue.CalibrationStep.beforeHoleELA", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultErrorPercent(CalibrationStep result) {
		result.setErrorPercent(Double.valueOf(cfg.getProperty("defaultValue.CalibrationStep.errorPercent", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER afterHoleELA(Double myAfterHoleELA) {
		this.afterHoleELA = myAfterHoleELA;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER beforeHoleELA(Double myBeforeHoleELA) {
		this.beforeHoleELA = myBeforeHoleELA;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER errorPercent(Double myErrorPercent) {
		this.errorPercent = myErrorPercent;
		return (BUILDER) this;
	}

}
