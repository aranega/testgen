package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.StaticStepCriteria;



import com.dooapp.lib.common.entity.Bean;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StaticStepCriteriaInstance
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
	private Double deltaPMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double deltaPMin;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StaticStepCriteria wrapper;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStepCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new StaticStepCriteria(this);
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
	public void setWrapper(StaticStepCriteria wrapper) {
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
	public Double getDeltaPMax(){
		return this.deltaPMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDeltaPMax(Double arg0){
		this.deltaPMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getDeltaPMin(){
		return this.deltaPMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDeltaPMin(Double arg0){
		this.deltaPMin = arg0;
	} 


}
