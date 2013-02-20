package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.BlowHoleStepCriteria;


import com.dooapp.firea.entity.Direction;

import com.dooapp.lib.common.entity.Bean;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class BlowHoleStepCriteriaInstance
// Start of user code bloc for inheritance
 extends StepCriteriaInstance
// End of user code
// Start of user code bloc for interface
 implements Bean
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
	private Double pressureGoalMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double pressureGoalMin;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BlowHoleStepCriteria wrapper;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BlowHoleStepCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new BlowHoleStepCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setWrapper(BlowHoleStepCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Direction getDirection(){
		return this.direction;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDirection(Direction arg0){
		this.direction = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getPressureGoalMax(){
		return this.pressureGoalMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPressureGoalMax(Double arg0){
		this.pressureGoalMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getPressureGoalMin(){
		return this.pressureGoalMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPressureGoalMin(Double arg0){
		this.pressureGoalMin = arg0;
	} 


}
