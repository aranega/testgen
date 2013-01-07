package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.CalibrationStepCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;
//Start of user code for imports
// TODO: import me!
//End of user code




public class CalibrationStepCriteria extends StepCriteria implements com.dooapp.lib.common.entity.Wrapper 
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private DoubleProperty afterHoleELAMaxProperty;
	
	private DoubleProperty afterHoleELAMinProperty;
	
	private DoubleProperty beforeHoleELAMaxProperty;
	
	private DoubleProperty beforeHoleELAMinProperty;
	
	private DoubleProperty errorPercentMaxProperty;
	
	private DoubleProperty errorPercentMinProperty;

	/**
	 * Handled Criteria
	 */
	private CalibrationStepCriteriaInstance calibrationStepCriteria;

	/*
	 * Constructors 
	 */
	public CalibrationStepCriteria(){
		this(new CalibrationStepCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
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
		//Start of user code constructor with parameters
		//End of user code
	}
	
	public CalibrationStepCriteriaInstance getCalibrationStepCriteriaInstance(){
		return this.calibrationStepCriteria;
	}
	
	
	public CalibrationStepCriteriaInstance getBean() {
		return  this.calibrationStepCriteria;
	}
	

	/*
	 * Generated getters and setters
	 */
	/**
	 * For compliance purpose only always return 0!
     */
	public long getId(){
		return 0;
	}	

	public DoubleProperty afterHoleELAMaxProperty(){
		if (this.afterHoleELAMaxProperty == null) {
			this.afterHoleELAMaxProperty = new SimpleDoubleProperty(calibrationStepCriteria.getAfterHoleELAMax());
			this.afterHoleELAMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setAfterHoleELAMax((Double) arg2);
				}
			});
			//Start of user code afterHoleELAMaxproperty method
			//End of user code
		}
		return this.afterHoleELAMaxProperty;
	}
	
	public double getAfterHoleELAMax(){
		return afterHoleELAMaxProperty().get();
	} 
	
	public void setAfterHoleELAMax(double myAfterHoleELAMax){
		this.afterHoleELAMaxProperty().set(myAfterHoleELAMax);
	}
	
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
	
	public void updateAfterHoleELAMax(final double myAfterHoleELAMax) {
		updateAfterHoleELAMax(myAfterHoleELAMax, null);
	}

	public DoubleProperty afterHoleELAMinProperty(){
		if (this.afterHoleELAMinProperty == null) {
			this.afterHoleELAMinProperty = new SimpleDoubleProperty(calibrationStepCriteria.getAfterHoleELAMin());
			this.afterHoleELAMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setAfterHoleELAMin((Double) arg2);
				}
			});
			//Start of user code afterHoleELAMinproperty method
			//End of user code
		}
		return this.afterHoleELAMinProperty;
	}
	
	public double getAfterHoleELAMin(){
		return afterHoleELAMinProperty().get();
	} 
	
	public void setAfterHoleELAMin(double myAfterHoleELAMin){
		this.afterHoleELAMinProperty().set(myAfterHoleELAMin);
	}
	
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
	
	public void updateAfterHoleELAMin(final double myAfterHoleELAMin) {
		updateAfterHoleELAMin(myAfterHoleELAMin, null);
	}

	public DoubleProperty beforeHoleELAMaxProperty(){
		if (this.beforeHoleELAMaxProperty == null) {
			this.beforeHoleELAMaxProperty = new SimpleDoubleProperty(calibrationStepCriteria.getBeforeHoleELAMax());
			this.beforeHoleELAMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setBeforeHoleELAMax((Double) arg2);
				}
			});
			//Start of user code beforeHoleELAMaxproperty method
			//End of user code
		}
		return this.beforeHoleELAMaxProperty;
	}
	
	public double getBeforeHoleELAMax(){
		return beforeHoleELAMaxProperty().get();
	} 
	
	public void setBeforeHoleELAMax(double myBeforeHoleELAMax){
		this.beforeHoleELAMaxProperty().set(myBeforeHoleELAMax);
	}
	
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
	
	public void updateBeforeHoleELAMax(final double myBeforeHoleELAMax) {
		updateBeforeHoleELAMax(myBeforeHoleELAMax, null);
	}

	public DoubleProperty beforeHoleELAMinProperty(){
		if (this.beforeHoleELAMinProperty == null) {
			this.beforeHoleELAMinProperty = new SimpleDoubleProperty(calibrationStepCriteria.getBeforeHoleELAMin());
			this.beforeHoleELAMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setBeforeHoleELAMin((Double) arg2);
				}
			});
			//Start of user code beforeHoleELAMinproperty method
			//End of user code
		}
		return this.beforeHoleELAMinProperty;
	}
	
	public double getBeforeHoleELAMin(){
		return beforeHoleELAMinProperty().get();
	} 
	
	public void setBeforeHoleELAMin(double myBeforeHoleELAMin){
		this.beforeHoleELAMinProperty().set(myBeforeHoleELAMin);
	}
	
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
	
	public void updateBeforeHoleELAMin(final double myBeforeHoleELAMin) {
		updateBeforeHoleELAMin(myBeforeHoleELAMin, null);
	}

	public DoubleProperty errorPercentMaxProperty(){
		if (this.errorPercentMaxProperty == null) {
			this.errorPercentMaxProperty = new SimpleDoubleProperty(calibrationStepCriteria.getErrorPercentMax());
			this.errorPercentMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setErrorPercentMax((Double) arg2);
				}
			});
			//Start of user code errorPercentMaxproperty method
			//End of user code
		}
		return this.errorPercentMaxProperty;
	}
	
	public double getErrorPercentMax(){
		return errorPercentMaxProperty().get();
	} 
	
	public void setErrorPercentMax(double myErrorPercentMax){
		this.errorPercentMaxProperty().set(myErrorPercentMax);
	}
	
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
	
	public void updateErrorPercentMax(final double myErrorPercentMax) {
		updateErrorPercentMax(myErrorPercentMax, null);
	}

	public DoubleProperty errorPercentMinProperty(){
		if (this.errorPercentMinProperty == null) {
			this.errorPercentMinProperty = new SimpleDoubleProperty(calibrationStepCriteria.getErrorPercentMin());
			this.errorPercentMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					calibrationStepCriteria.setErrorPercentMin((Double) arg2);
				}
			});
			//Start of user code errorPercentMinproperty method
			//End of user code
		}
		return this.errorPercentMinProperty;
	}
	
	public double getErrorPercentMin(){
		return errorPercentMinProperty().get();
	} 
	
	public void setErrorPercentMin(double myErrorPercentMin){
		this.errorPercentMinProperty().set(myErrorPercentMin);
	}
	
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
	
	public void updateErrorPercentMin(final double myErrorPercentMin) {
		updateErrorPercentMin(myErrorPercentMin, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
