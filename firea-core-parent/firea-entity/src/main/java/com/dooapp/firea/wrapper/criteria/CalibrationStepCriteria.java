package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.CalibrationStepCriteriaInstance;

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
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty holeSizeMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty holeSizeMinProperty;

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
	public CalibrationStepCriteria(){
		this(new CalibrationStepCriteriaInstance());
	}
	
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
	public CalibrationStepCriteriaInstance getCalibrationStepCriteriaInstance(){
		return this.calibrationStepCriteria;
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
			this.afterHoleELAMaxProperty = new SimpleDoubleProperty(calibrationStepCriteria.getAfterHoleELAMax());
			this.afterHoleELAMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setAfterHoleELAMax((Double) arg2);
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
	public void updateAfterHoleELAMax(final double myAfterHoleELAMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAfterHoleELAMax(myAfterHoleELAMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAfterHoleELAMax(myAfterHoleELAMax);
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
	public void updateAfterHoleELAMax(final double myAfterHoleELAMax) {
		updateAfterHoleELAMax(myAfterHoleELAMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty afterHoleELAMinProperty(){
		if (this.afterHoleELAMinProperty == null) {
			this.afterHoleELAMinProperty = new SimpleDoubleProperty(calibrationStepCriteria.getAfterHoleELAMin());
			this.afterHoleELAMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setAfterHoleELAMin((Double) arg2);
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
	public void updateAfterHoleELAMin(final double myAfterHoleELAMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAfterHoleELAMin(myAfterHoleELAMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAfterHoleELAMin(myAfterHoleELAMin);
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
	public void updateAfterHoleELAMin(final double myAfterHoleELAMin) {
		updateAfterHoleELAMin(myAfterHoleELAMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty beforeHoleELAMaxProperty(){
		if (this.beforeHoleELAMaxProperty == null) {
			this.beforeHoleELAMaxProperty = new SimpleDoubleProperty(calibrationStepCriteria.getBeforeHoleELAMax());
			this.beforeHoleELAMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setBeforeHoleELAMax((Double) arg2);
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
	public void updateBeforeHoleELAMax(final double myBeforeHoleELAMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBeforeHoleELAMax(myBeforeHoleELAMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBeforeHoleELAMax(myBeforeHoleELAMax);
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
	public void updateBeforeHoleELAMax(final double myBeforeHoleELAMax) {
		updateBeforeHoleELAMax(myBeforeHoleELAMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty beforeHoleELAMinProperty(){
		if (this.beforeHoleELAMinProperty == null) {
			this.beforeHoleELAMinProperty = new SimpleDoubleProperty(calibrationStepCriteria.getBeforeHoleELAMin());
			this.beforeHoleELAMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setBeforeHoleELAMin((Double) arg2);
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
	public void updateBeforeHoleELAMin(final double myBeforeHoleELAMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBeforeHoleELAMin(myBeforeHoleELAMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBeforeHoleELAMin(myBeforeHoleELAMin);
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
	public void updateBeforeHoleELAMin(final double myBeforeHoleELAMin) {
		updateBeforeHoleELAMin(myBeforeHoleELAMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty errorPercentMaxProperty(){
		if (this.errorPercentMaxProperty == null) {
			this.errorPercentMaxProperty = new SimpleDoubleProperty(calibrationStepCriteria.getErrorPercentMax());
			this.errorPercentMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setErrorPercentMax((Double) arg2);
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
	public void updateErrorPercentMax(final double myErrorPercentMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setErrorPercentMax(myErrorPercentMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setErrorPercentMax(myErrorPercentMax);
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
	public void updateErrorPercentMax(final double myErrorPercentMax) {
		updateErrorPercentMax(myErrorPercentMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty errorPercentMinProperty(){
		if (this.errorPercentMinProperty == null) {
			this.errorPercentMinProperty = new SimpleDoubleProperty(calibrationStepCriteria.getErrorPercentMin());
			this.errorPercentMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setErrorPercentMin((Double) arg2);
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
	public void updateErrorPercentMin(final double myErrorPercentMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setErrorPercentMin(myErrorPercentMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setErrorPercentMin(myErrorPercentMin);
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
	public void updateErrorPercentMin(final double myErrorPercentMin) {
		updateErrorPercentMin(myErrorPercentMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty holeSizeMaxProperty(){
		if (this.holeSizeMaxProperty == null) {
			this.holeSizeMaxProperty = new SimpleDoubleProperty(calibrationStepCriteria.getHoleSizeMax());
			this.holeSizeMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setHoleSizeMax((Double) arg2);
				}
			});
		}
		return this.holeSizeMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getHoleSizeMax(){
		return holeSizeMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setHoleSizeMax(double myHoleSizeMax){
		this.holeSizeMaxProperty().set(myHoleSizeMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateHoleSizeMax(final double myHoleSizeMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setHoleSizeMax(myHoleSizeMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setHoleSizeMax(myHoleSizeMax);
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
	public void updateHoleSizeMax(final double myHoleSizeMax) {
		updateHoleSizeMax(myHoleSizeMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty holeSizeMinProperty(){
		if (this.holeSizeMinProperty == null) {
			this.holeSizeMinProperty = new SimpleDoubleProperty(calibrationStepCriteria.getHoleSizeMin());
			this.holeSizeMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setHoleSizeMin((Double) arg2);
				}
			});
		}
		return this.holeSizeMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getHoleSizeMin(){
		return holeSizeMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setHoleSizeMin(double myHoleSizeMin){
		this.holeSizeMinProperty().set(myHoleSizeMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateHoleSizeMin(final double myHoleSizeMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setHoleSizeMin(myHoleSizeMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setHoleSizeMin(myHoleSizeMin);
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
	public void updateHoleSizeMin(final double myHoleSizeMin) {
		updateHoleSizeMin(myHoleSizeMin, null);
	}

}
