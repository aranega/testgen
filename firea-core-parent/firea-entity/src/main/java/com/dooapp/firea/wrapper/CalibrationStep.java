package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.CalibrationStepBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;
//Start of user code for imports
// TODO: import me!
//End of user code


//Start of user code comment for CalibrationStep Class

//End of user code

public class CalibrationStep extends Step implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private DoubleProperty afterHoleELAProperty;
	
	private DoubleProperty beforeHoleELAProperty;
	
	private DoubleProperty errorPercentProperty;

	/**
	 * Handled Entity
	 */
	private final CalibrationStepBean calibrationStep;

	/*
	 * Constructors
	 * <!-- Start of user code comment for CalibrationStep constructor
	 * End of user code -->
	 */
	public CalibrationStep(){
		this(new CalibrationStepBean());	
	}
	
	
	public CalibrationStep(CalibrationStepBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.calibrationStep = entity;
	}
	
	public CalibrationStepBean getCalibrationStepBean(){
		return this.calibrationStep;
	}
	
	public CalibrationStepBean getBean() {
		return  this.calibrationStep;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for afterHoleELA property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty afterHoleELAProperty(){
		if (this.afterHoleELAProperty == null) {
			this.afterHoleELAProperty = new SimpleDoubleProperty(calibrationStep.getAfterHoleELA());
			this.afterHoleELAProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStep.setAfterHoleELA((Double) arg2);
				}
			});
			//Start of user code afterHoleELAproperty method
			//End of user code
		}
		return this.afterHoleELAProperty;
	}
	
	/*
	 * <!-- Start of user code comment for afterHoleELA getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getAfterHoleELA(){
		return afterHoleELAProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for afterHoleELA setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setAfterHoleELA(double myAfterHoleELA){
		this.afterHoleELAProperty().set(myAfterHoleELA);
	}
	
	public void updateAfterHoleELA(final double myAfterHoleELA, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAfterHoleELA(myAfterHoleELA);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAfterHoleELA(myAfterHoleELA);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateAfterHoleELA(final double myAfterHoleELA) {
		updateAfterHoleELA(myAfterHoleELA, null);
	}

	/*
	 * <!-- Start of user code comment for beforeHoleELA property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty beforeHoleELAProperty(){
		if (this.beforeHoleELAProperty == null) {
			this.beforeHoleELAProperty = new SimpleDoubleProperty(calibrationStep.getBeforeHoleELA());
			this.beforeHoleELAProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStep.setBeforeHoleELA((Double) arg2);
				}
			});
			//Start of user code beforeHoleELAproperty method
			//End of user code
		}
		return this.beforeHoleELAProperty;
	}
	
	/*
	 * <!-- Start of user code comment for beforeHoleELA getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getBeforeHoleELA(){
		return beforeHoleELAProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for beforeHoleELA setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setBeforeHoleELA(double myBeforeHoleELA){
		this.beforeHoleELAProperty().set(myBeforeHoleELA);
	}
	
	public void updateBeforeHoleELA(final double myBeforeHoleELA, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBeforeHoleELA(myBeforeHoleELA);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBeforeHoleELA(myBeforeHoleELA);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateBeforeHoleELA(final double myBeforeHoleELA) {
		updateBeforeHoleELA(myBeforeHoleELA, null);
	}

	/*
	 * <!-- Start of user code comment for errorPercent property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty errorPercentProperty(){
		if (this.errorPercentProperty == null) {
			this.errorPercentProperty = new SimpleDoubleProperty(calibrationStep.getErrorPercent());
			this.errorPercentProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStep.setErrorPercent((Double) arg2);
				}
			});
			//Start of user code errorPercentproperty method
			//End of user code
		}
		return this.errorPercentProperty;
	}
	
	/*
	 * <!-- Start of user code comment for errorPercent getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getErrorPercent(){
		return errorPercentProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for errorPercent setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setErrorPercent(double myErrorPercent){
		this.errorPercentProperty().set(myErrorPercent);
	}
	
	public void updateErrorPercent(final double myErrorPercent, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setErrorPercent(myErrorPercent);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setErrorPercent(myErrorPercent);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateErrorPercent(final double myErrorPercent) {
		updateErrorPercent(myErrorPercent, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
