package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.BlowHoleStepCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;


import com.dooapp.firea.entity.Direction;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class BlowHoleStepCriteria 
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
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty pressureGoalMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty pressureGoalMinProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private BlowHoleStepCriteriaInstance blowHoleStepCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BlowHoleStepCriteria(){
		this(new BlowHoleStepCriteriaInstance());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BlowHoleStepCriteria(BlowHoleStepCriteriaInstance entity) {
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
		this.blowHoleStepCriteria = entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BlowHoleStepCriteriaInstance getBlowHoleStepCriteriaInstance(){
		return this.blowHoleStepCriteria;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BlowHoleStepCriteriaInstance getBean() {
		return  this.blowHoleStepCriteria;
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
			directionProperty = new SimpleObjectProperty<Direction>(blowHoleStepCriteria.getDirection());
			directionProperty.addListener(new ChangeListener<Direction>() {
				@Override
				public void changed(ObservableValue<? extends Direction> arg0, Direction arg1, Direction arg2) {
					blowHoleStepCriteria.setDirection(arg2);
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
				blowHoleStepCriteria.setDirection(myDirection);
			} else {
				this.directionProperty().set(myDirection);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDirection(final Direction myDirection, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDirection(myDirection);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDirection(myDirection);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDirection(final Direction myDirection) {
		updateDirection(myDirection, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty pressureGoalMaxProperty(){
		if (this.pressureGoalMaxProperty == null) {
			this.pressureGoalMaxProperty = new SimpleDoubleProperty(blowHoleStepCriteria.getPressureGoalMax());
			this.pressureGoalMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHoleStepCriteria.setPressureGoalMax((Double) arg2);
				}
			});
		}
		return this.pressureGoalMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPressureGoalMax(){
		return pressureGoalMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPressureGoalMax(double myPressureGoalMax){
		this.pressureGoalMaxProperty().set(myPressureGoalMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePressureGoalMax(final double myPressureGoalMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPressureGoalMax(myPressureGoalMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPressureGoalMax(myPressureGoalMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePressureGoalMax(final double myPressureGoalMax) {
		updatePressureGoalMax(myPressureGoalMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty pressureGoalMinProperty(){
		if (this.pressureGoalMinProperty == null) {
			this.pressureGoalMinProperty = new SimpleDoubleProperty(blowHoleStepCriteria.getPressureGoalMin());
			this.pressureGoalMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHoleStepCriteria.setPressureGoalMin((Double) arg2);
				}
			});
		}
		return this.pressureGoalMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPressureGoalMin(){
		return pressureGoalMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPressureGoalMin(double myPressureGoalMin){
		this.pressureGoalMinProperty().set(myPressureGoalMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePressureGoalMin(final double myPressureGoalMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPressureGoalMin(myPressureGoalMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPressureGoalMin(myPressureGoalMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePressureGoalMin(final double myPressureGoalMin) {
		updatePressureGoalMin(myPressureGoalMin, null);
	}

}
