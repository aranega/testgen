package com.dooapp.taskManger.entity.factories;


import com.dooapp.taskManger.wrapper.DelayedTask;





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class DelayedTaskBuilder<BUILDER extends DelayedTaskBuilder<?>>
// Start of user code bloc for inerithance
 extends TaskBuilder<BUILDER>
// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String endAt;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String startAt;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.inject.Inject
	protected DelayedTaskBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DelayedTask createValue() {
		return new DelayedTask();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DelayedTask build() throws NullPointerException {
		DelayedTask result =  (DelayedTask) super.build();
		if (endAt == null) {
			handleDefaultEndAt(result);
		} else { 
			result.setEndAt(endAt);
		}
		if (startAt == null) {
			handleDefaultStartAt(result);
		} else { 
			result.setStartAt(startAt);
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
	private void handleDefaultEndAt(DelayedTask result) {
		result.setEndAt(cfg.getProperty("defaultValue.DelayedTask.endAt"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultStartAt(DelayedTask result) {
		result.setStartAt(cfg.getProperty("defaultValue.DelayedTask.startAt"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER endAt(String myEndAt) {
		this.endAt = myEndAt;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER startAt(String myStartAt) {
		this.startAt = myStartAt;
		return (BUILDER) this;
	}

}
