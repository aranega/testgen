package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.EventStep;
import com.dooapp.firea.entity.EventStepBean;


import com.dooapp.firea.enumeration.Direction;
import com.dooapp.firea.enumeration.StepStatus;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class EventStepBuilder<BUILDER extends EventStepBuilder<?>>
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
	@javax.inject.Inject
	protected EventStepBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected EventStep createValue() {
		return new EventStep(new EventStepBean());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public EventStep build() throws NullPointerException {
		EventStep result =  (EventStep) super.build();
		if (direction == null) {
			handleDefaultDirection(result);
		} else {
			result.setDirection(direction);
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
	protected void handleDefaultDirection(EventStep result) {
		result.setDirection(Direction.valueOf(cfg.getProperty("defaultValue.EventStep.direction", "PRESSURE")));
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

}
