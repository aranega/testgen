package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.MainStepBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

//Start of user code for imports
// TODO: import me!
//End of user code




// Start of user code comment for MainStep Class

// End of user code

public class MainStep
// Start of user code bloc for inheritance
 extends Step
// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private DoubleProperty calculatedELAProperty;
	
	private DoubleProperty clProperty;
	
	private DoubleProperty correlationProperty;
	
	private StringProperty directionProperty;
	
	private DoubleProperty nProperty;

	/**
	 * Handled Entity
	 */
	private final MainStepBean mainStep;

	/*
	 * Constructors
	 * <!-- Start of user code comment for MainStep constructor
	 * End of user code -->
	 */
	public MainStep(){
		this(new MainStepBean());	
	}
	
	
	public MainStep(MainStepBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.mainStep = entity;
	}
	
	public MainStepBean getMainStepBean(){
		return this.mainStep;
	}
	
	public MainStepBean getBean() {
		return  this.mainStep;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for calculatedELA property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty calculatedELAProperty(){
		if (this.calculatedELAProperty == null) {
			this.calculatedELAProperty = new SimpleDoubleProperty(mainStep.getCalculatedELA());
			this.calculatedELAProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStep.setCalculatedELA((Double) arg2);
				}
			});
			//Start of user code calculatedELAproperty method
			//End of user code
		}
		return this.calculatedELAProperty;
	}
	
	/*
	 * <!-- Start of user code comment for calculatedELA getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getCalculatedELA(){
		return calculatedELAProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for calculatedELA setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCalculatedELA(double myCalculatedELA){
		this.calculatedELAProperty().set(myCalculatedELA);
	}
	
	public void updateCalculatedELA(final double myCalculatedELA, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCalculatedELA(myCalculatedELA);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCalculatedELA(myCalculatedELA);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCalculatedELA(final double myCalculatedELA) {
		updateCalculatedELA(myCalculatedELA, null);
	}

	/*
	 * <!-- Start of user code comment for cl property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty clProperty(){
		if (this.clProperty == null) {
			this.clProperty = new SimpleDoubleProperty(mainStep.getCl());
			this.clProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStep.setCl((Double) arg2);
				}
			});
			//Start of user code clproperty method
			//End of user code
		}
		return this.clProperty;
	}
	
	/*
	 * <!-- Start of user code comment for cl getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getCl(){
		return clProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for cl setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCl(double myCl){
		this.clProperty().set(myCl);
	}
	
	public void updateCl(final double myCl, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCl(myCl);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCl(myCl);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCl(final double myCl) {
		updateCl(myCl, null);
	}

	/*
	 * <!-- Start of user code comment for correlation property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty correlationProperty(){
		if (this.correlationProperty == null) {
			this.correlationProperty = new SimpleDoubleProperty(mainStep.getCorrelation());
			this.correlationProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStep.setCorrelation((Double) arg2);
				}
			});
			//Start of user code correlationproperty method
			//End of user code
		}
		return this.correlationProperty;
	}
	
	/*
	 * <!-- Start of user code comment for correlation getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getCorrelation(){
		return correlationProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for correlation setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCorrelation(double myCorrelation){
		this.correlationProperty().set(myCorrelation);
	}
	
	public void updateCorrelation(final double myCorrelation, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCorrelation(myCorrelation);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCorrelation(myCorrelation);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCorrelation(final double myCorrelation) {
		updateCorrelation(myCorrelation, null);
	}

	/*
	 * <!-- Start of user code comment for direction property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty directionProperty(){
		if (this.directionProperty == null) {
			this.directionProperty = new SimpleStringProperty(mainStep.getDirection());
			this.directionProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					mainStep.setDirection((String) arg2);
				}
			});
			//Start of user code directionproperty method
			//End of user code
		}
		return this.directionProperty;
	}
	
	/*
	 * <!-- Start of user code comment for direction getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getDirection(){
		return directionProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for direction setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDirection(String myDirection){
		this.directionProperty().set(myDirection);
	}
	
	public void updateDirection(final String myDirection, final Object mutex) {
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
	
	public void updateDirection(final String myDirection) {
		updateDirection(myDirection, null);
	}

	/*
	 * <!-- Start of user code comment for n property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty nProperty(){
		if (this.nProperty == null) {
			this.nProperty = new SimpleDoubleProperty(mainStep.getN());
			this.nProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStep.setN((Double) arg2);
				}
			});
			//Start of user code nproperty method
			//End of user code
		}
		return this.nProperty;
	}
	
	/*
	 * <!-- Start of user code comment for n getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getN(){
		return nProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for n setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setN(double myN){
		this.nProperty().set(myN);
	}
	
	public void updateN(final double myN, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setN(myN);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setN(myN);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateN(final double myN) {
		updateN(myN, null);
	}


	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getMainStepBean() != null ? serializer.outputString(getMainStepBean().toXML()) : "";
		
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
