package com.dooapp.firea.entity;



import com.dooapp.firea.enumeration.StepStatus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.CalibrationStep;

import com.dooapp.lib.common.entity.Bean;
import com.dooapp.lib.common.entity.WrapperClass;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
@WrapperClass(CalibrationStep.class)
public class CalibrationStepBean
//Start of user code bloc for inheritance
 extends StepBean
//End of user code
//Start of user code bloc for interfaces
 implements Bean
//End of user code
{
	/**
	 * The logger
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	private static final Logger logger = LoggerFactory.getLogger(CalibrationStepBean.class);

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double afterHoleELA;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double beforeHoleELA;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double errorPercent;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Transient
	@Override
	public CalibrationStep getWrapper() {
		if (!isWrapped()) {
			setWrapper(new CalibrationStep(this));
		}
		return (CalibrationStep)super.getWrapper();
	}

	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getAfterHoleELA(){
		return this.afterHoleELA;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAfterHoleELA(double arg0){
		this.afterHoleELA = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getBeforeHoleELA(){
		return this.beforeHoleELA;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setBeforeHoleELA(double arg0){
		this.beforeHoleELA = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getErrorPercent(){
		return this.errorPercent;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setErrorPercent(double arg0){
		this.errorPercent = arg0;
	}
}
