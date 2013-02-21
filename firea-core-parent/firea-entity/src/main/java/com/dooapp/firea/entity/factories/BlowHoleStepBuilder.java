package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.BlowHoleStep;


import com.dooapp.firea.entity.Direction;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class BlowHoleStepBuilder<BUILDER extends BlowHoleStepBuilder<?>>
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
	private Direction direction;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double pressureGoal;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.inject.Inject
	protected BlowHoleStepBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BlowHoleStep createValue() {
		return new BlowHoleStep();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BlowHoleStep build() throws NullPointerException {
		BlowHoleStep result =  (BlowHoleStep) super.build();
		if (direction == null) {
			handleDefaultDirection(result);
		} else { 
			result.setDirection(direction);
		}
		if (pressureGoal == null) {
			handleDefaultPressureGoal(result);
		} else { 
			result.setPressureGoal(pressureGoal);
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
	private void handleDefaultDirection(BlowHoleStep result) {
		result.setDirection(Direction.valueOf(cfg.getProperty("defaultValue.BlowHoleStep.direction", "PRESSURE")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultPressureGoal(BlowHoleStep result) {
		result.setPressureGoal(Double.valueOf(cfg.getProperty("defaultValue.BlowHoleStep.pressureGoal", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER direction(Direction myDirection) {
		this.direction = myDirection;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER pressureGoal(Double myPressureGoal) {
		this.pressureGoal = myPressureGoal;
		return (BUILDER) this;
	}

}
