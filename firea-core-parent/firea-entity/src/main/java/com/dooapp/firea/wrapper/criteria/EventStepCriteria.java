package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.EventStepCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;


import com.dooapp.firea.enumeration.Direction;
import com.dooapp.firea.enumeration.StepStatus;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
//@BeanClass(EventStepCriteriaBean.class)
public class EventStepCriteria 
// Start of user code bloc for inheritance
 extends StepCriteria
// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Direction> directionProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private EventStepCriteriaInstance eventStepCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public EventStepCriteria(EventStepCriteriaInstance entity) {
		 super(entity);
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.eventStepCriteria = entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public EventStepCriteriaInstance getBean() {
		return  this.eventStepCriteria;
	}

	/*
	 * Generated getters and setters
	 */

	/**
	 * For compliance purpose only always return 0!
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public long getId(){
		return 0;
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Direction> directionProperty() {
		if (directionProperty == null) {
			directionProperty = createDirectionProperty();
			getBean().setDirection(getBean().getDirection());
			directionProperty.addListener(new ChangeListener<Direction>() {
				@Override
				public void changed(ObservableValue<? extends Direction> arg0, Direction arg1, Direction arg2) {
					getBean().setDirection(arg2);
				}
			});
		}
		return directionProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<Direction> createDirectionProperty(){
		return  new SimpleObjectProperty<Direction>(getBean().getDirection());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Direction getDirection(){
		return directionProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDirection(Direction myDirection){
		if (directionProperty == null) {
				getBean().setDirection(myDirection);
			} else {
				this.directionProperty().set(myDirection);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDirection(final Direction myDirection) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDirection(myDirection);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDirection(myDirection);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDirectionAndWait(final Direction myDirection) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDirection(myDirection);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDirection(myDirection);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

}
