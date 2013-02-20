package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.StaticStepCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class StaticStepCriteria 
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
	private DoubleProperty deltaPMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty deltaPMinProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private StaticStepCriteriaInstance staticStepCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStepCriteria(){
		this(new StaticStepCriteriaInstance());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStepCriteria(StaticStepCriteriaInstance entity) {
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
		this.staticStepCriteria = entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStepCriteriaInstance getStaticStepCriteriaInstance(){
		return this.staticStepCriteria;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStepCriteriaInstance getBean() {
		return  this.staticStepCriteria;
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
	public DoubleProperty deltaPMaxProperty(){
		if (this.deltaPMaxProperty == null) {
			this.deltaPMaxProperty = new SimpleDoubleProperty(staticStepCriteria.getDeltaPMax());
			this.deltaPMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					staticStepCriteria.setDeltaPMax((Double) arg2);
				}
			});
		}
		return this.deltaPMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getDeltaPMax(){
		return deltaPMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDeltaPMax(double myDeltaPMax){
		this.deltaPMaxProperty().set(myDeltaPMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDeltaPMax(final double myDeltaPMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDeltaPMax(myDeltaPMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDeltaPMax(myDeltaPMax);
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
	public void updateDeltaPMax(final double myDeltaPMax) {
		updateDeltaPMax(myDeltaPMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty deltaPMinProperty(){
		if (this.deltaPMinProperty == null) {
			this.deltaPMinProperty = new SimpleDoubleProperty(staticStepCriteria.getDeltaPMin());
			this.deltaPMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					staticStepCriteria.setDeltaPMin((Double) arg2);
				}
			});
		}
		return this.deltaPMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getDeltaPMin(){
		return deltaPMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDeltaPMin(double myDeltaPMin){
		this.deltaPMinProperty().set(myDeltaPMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDeltaPMin(final double myDeltaPMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDeltaPMin(myDeltaPMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDeltaPMin(myDeltaPMin);
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
	public void updateDeltaPMin(final double myDeltaPMin) {
		updateDeltaPMin(myDeltaPMin, null);
	}

}
