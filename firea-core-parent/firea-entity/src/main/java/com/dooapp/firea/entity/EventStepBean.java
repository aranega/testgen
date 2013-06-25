package com.dooapp.firea.entity;



import com.dooapp.firea.enumeration.Direction;
import com.dooapp.firea.enumeration.StepStatus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.EventStep;

import com.dooapp.lib.common.entity.Bean;
import com.dooapp.lib.common.entity.WrapperClass;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
@WrapperClass(EventStep.class)
public class EventStepBean
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
	private static final Logger logger = LoggerFactory.getLogger(EventStepBean.class);

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private Direction direction;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Transient
	@Override
	public EventStep getWrapper() {
		if (!isWrapped()) {
			setWrapper(new EventStep(this));
		}
		return (EventStep)super.getWrapper();
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
	public void unsetDirection(Direction arg0){
		this.direction = null;
	}
}
