package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.CalibrationStepCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;


import com.dooapp.firea.enumeration.StepStatus;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
//@BeanClass(CalibrationStepCriteriaBean.class)
public class CalibrationStepCriteria 
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
	private DoubleProperty afterHoleELAMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty afterHoleELAMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty beforeHoleELAMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty beforeHoleELAMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty errorPercentMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty errorPercentMinProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private CalibrationStepCriteriaInstance calibrationStepCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public CalibrationStepCriteria(CalibrationStepCriteriaInstance entity) {
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
		this.calibrationStepCriteria = entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public CalibrationStepCriteriaInstance getBean() {
		return  this.calibrationStepCriteria;
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
	public DoubleProperty afterHoleELAMaxProperty(){
		if (this.afterHoleELAMaxProperty == null) {
			this.afterHoleELAMaxProperty = createAfterHoleELAMaxProperty();
			getBean().setAfterHoleELAMax(getBean().getAfterHoleELAMax());
			this.afterHoleELAMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setAfterHoleELAMax((Double) arg2);
				}
			});
		}
		return this.afterHoleELAMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createAfterHoleELAMaxProperty(){
		return new SimpleDoubleProperty(getBean().getAfterHoleELAMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getAfterHoleELAMax(){
		return afterHoleELAMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAfterHoleELAMax(double myAfterHoleELAMax){
		this.afterHoleELAMaxProperty().set(myAfterHoleELAMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAfterHoleELAMax(final Double myAfterHoleELAMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAfterHoleELAMax(myAfterHoleELAMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAfterHoleELAMax(myAfterHoleELAMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAfterHoleELAMaxAndWait(final Double myAfterHoleELAMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAfterHoleELAMax(myAfterHoleELAMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAfterHoleELAMax(myAfterHoleELAMax);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty afterHoleELAMinProperty(){
		if (this.afterHoleELAMinProperty == null) {
			this.afterHoleELAMinProperty = createAfterHoleELAMinProperty();
			getBean().setAfterHoleELAMin(getBean().getAfterHoleELAMin());
			this.afterHoleELAMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setAfterHoleELAMin((Double) arg2);
				}
			});
		}
		return this.afterHoleELAMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createAfterHoleELAMinProperty(){
		return new SimpleDoubleProperty(getBean().getAfterHoleELAMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getAfterHoleELAMin(){
		return afterHoleELAMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAfterHoleELAMin(double myAfterHoleELAMin){
		this.afterHoleELAMinProperty().set(myAfterHoleELAMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAfterHoleELAMin(final Double myAfterHoleELAMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAfterHoleELAMin(myAfterHoleELAMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAfterHoleELAMin(myAfterHoleELAMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAfterHoleELAMinAndWait(final Double myAfterHoleELAMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAfterHoleELAMin(myAfterHoleELAMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAfterHoleELAMin(myAfterHoleELAMin);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty beforeHoleELAMaxProperty(){
		if (this.beforeHoleELAMaxProperty == null) {
			this.beforeHoleELAMaxProperty = createBeforeHoleELAMaxProperty();
			getBean().setBeforeHoleELAMax(getBean().getBeforeHoleELAMax());
			this.beforeHoleELAMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setBeforeHoleELAMax((Double) arg2);
				}
			});
		}
		return this.beforeHoleELAMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createBeforeHoleELAMaxProperty(){
		return new SimpleDoubleProperty(getBean().getBeforeHoleELAMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getBeforeHoleELAMax(){
		return beforeHoleELAMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setBeforeHoleELAMax(double myBeforeHoleELAMax){
		this.beforeHoleELAMaxProperty().set(myBeforeHoleELAMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateBeforeHoleELAMax(final Double myBeforeHoleELAMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBeforeHoleELAMax(myBeforeHoleELAMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBeforeHoleELAMax(myBeforeHoleELAMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateBeforeHoleELAMaxAndWait(final Double myBeforeHoleELAMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBeforeHoleELAMax(myBeforeHoleELAMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBeforeHoleELAMax(myBeforeHoleELAMax);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty beforeHoleELAMinProperty(){
		if (this.beforeHoleELAMinProperty == null) {
			this.beforeHoleELAMinProperty = createBeforeHoleELAMinProperty();
			getBean().setBeforeHoleELAMin(getBean().getBeforeHoleELAMin());
			this.beforeHoleELAMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setBeforeHoleELAMin((Double) arg2);
				}
			});
		}
		return this.beforeHoleELAMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createBeforeHoleELAMinProperty(){
		return new SimpleDoubleProperty(getBean().getBeforeHoleELAMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getBeforeHoleELAMin(){
		return beforeHoleELAMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setBeforeHoleELAMin(double myBeforeHoleELAMin){
		this.beforeHoleELAMinProperty().set(myBeforeHoleELAMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateBeforeHoleELAMin(final Double myBeforeHoleELAMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBeforeHoleELAMin(myBeforeHoleELAMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBeforeHoleELAMin(myBeforeHoleELAMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateBeforeHoleELAMinAndWait(final Double myBeforeHoleELAMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBeforeHoleELAMin(myBeforeHoleELAMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBeforeHoleELAMin(myBeforeHoleELAMin);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty errorPercentMaxProperty(){
		if (this.errorPercentMaxProperty == null) {
			this.errorPercentMaxProperty = createErrorPercentMaxProperty();
			getBean().setErrorPercentMax(getBean().getErrorPercentMax());
			this.errorPercentMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setErrorPercentMax((Double) arg2);
				}
			});
		}
		return this.errorPercentMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createErrorPercentMaxProperty(){
		return new SimpleDoubleProperty(getBean().getErrorPercentMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getErrorPercentMax(){
		return errorPercentMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setErrorPercentMax(double myErrorPercentMax){
		this.errorPercentMaxProperty().set(myErrorPercentMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateErrorPercentMax(final Double myErrorPercentMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setErrorPercentMax(myErrorPercentMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setErrorPercentMax(myErrorPercentMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateErrorPercentMaxAndWait(final Double myErrorPercentMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setErrorPercentMax(myErrorPercentMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setErrorPercentMax(myErrorPercentMax);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty errorPercentMinProperty(){
		if (this.errorPercentMinProperty == null) {
			this.errorPercentMinProperty = createErrorPercentMinProperty();
			getBean().setErrorPercentMin(getBean().getErrorPercentMin());
			this.errorPercentMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setErrorPercentMin((Double) arg2);
				}
			});
		}
		return this.errorPercentMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createErrorPercentMinProperty(){
		return new SimpleDoubleProperty(getBean().getErrorPercentMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getErrorPercentMin(){
		return errorPercentMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setErrorPercentMin(double myErrorPercentMin){
		this.errorPercentMinProperty().set(myErrorPercentMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateErrorPercentMin(final Double myErrorPercentMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setErrorPercentMin(myErrorPercentMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setErrorPercentMin(myErrorPercentMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateErrorPercentMinAndWait(final Double myErrorPercentMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setErrorPercentMin(myErrorPercentMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setErrorPercentMin(myErrorPercentMin);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

}
