package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.MainStepCriteriaInstance;

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




// Start of user code comment for MainStepCriteria Class

// End of user code

public class MainStepCriteria 
// Start of user code bloc for inheritance
 extends StepCriteria
// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private DoubleProperty calculatedELAMaxProperty;
	
	private DoubleProperty calculatedELAMinProperty;
	
	private DoubleProperty clMaxProperty;
	
	private DoubleProperty clMinProperty;
	
	private DoubleProperty correlationMaxProperty;
	
	private DoubleProperty correlationMinProperty;
	
	private StringProperty directionProperty;
	
	private DoubleProperty nMaxProperty;
	
	private DoubleProperty nMinProperty;

	/**
	 * Handled Criteria
	 */
	private MainStepCriteriaInstance mainStepCriteria;

	/*
	 * Constructors
	 * <!-- Start of user code comment for MainStepCriteria constructor
	 * End of user code -->
	 */
	public MainStepCriteria(){
		this(new MainStepCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for MainStepCriteria constructor with parameters
	 * End of user code -->
	 */
	public MainStepCriteria(MainStepCriteriaInstance entity) {
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
		this.mainStepCriteria = entity;
		// Start of user code constructor with parameters
		// End of user code
	}
	
	public MainStepCriteriaInstance getMainStepCriteriaInstance(){
		return this.mainStepCriteria;
	}
	
	
	public MainStepCriteriaInstance getBean() {
		return  this.mainStepCriteria;
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

	/*
	 * <!-- Start of user code comment for calculatedELAMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty calculatedELAMaxProperty(){
		if (this.calculatedELAMaxProperty == null) {
			this.calculatedELAMaxProperty = new SimpleDoubleProperty(mainStepCriteria.getCalculatedELAMax());
			this.calculatedELAMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStepCriteria.setCalculatedELAMax((Double) arg2);
				}
			});
			//Start of user code calculatedELAMaxproperty method
			//End of user code
		}
		return this.calculatedELAMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for calculatedELAMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getCalculatedELAMax(){
		return calculatedELAMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for calculatedELAMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCalculatedELAMax(double myCalculatedELAMax){
		this.calculatedELAMaxProperty().set(myCalculatedELAMax);
	}
	
	public void updateCalculatedELAMax(final double myCalculatedELAMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCalculatedELAMax(myCalculatedELAMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCalculatedELAMax(myCalculatedELAMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCalculatedELAMax(final double myCalculatedELAMax) {
		updateCalculatedELAMax(myCalculatedELAMax, null);
	}

	/*
	 * <!-- Start of user code comment for calculatedELAMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty calculatedELAMinProperty(){
		if (this.calculatedELAMinProperty == null) {
			this.calculatedELAMinProperty = new SimpleDoubleProperty(mainStepCriteria.getCalculatedELAMin());
			this.calculatedELAMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStepCriteria.setCalculatedELAMin((Double) arg2);
				}
			});
			//Start of user code calculatedELAMinproperty method
			//End of user code
		}
		return this.calculatedELAMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for calculatedELAMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getCalculatedELAMin(){
		return calculatedELAMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for calculatedELAMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCalculatedELAMin(double myCalculatedELAMin){
		this.calculatedELAMinProperty().set(myCalculatedELAMin);
	}
	
	public void updateCalculatedELAMin(final double myCalculatedELAMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCalculatedELAMin(myCalculatedELAMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCalculatedELAMin(myCalculatedELAMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCalculatedELAMin(final double myCalculatedELAMin) {
		updateCalculatedELAMin(myCalculatedELAMin, null);
	}

	/*
	 * <!-- Start of user code comment for clMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty clMaxProperty(){
		if (this.clMaxProperty == null) {
			this.clMaxProperty = new SimpleDoubleProperty(mainStepCriteria.getClMax());
			this.clMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStepCriteria.setClMax((Double) arg2);
				}
			});
			//Start of user code clMaxproperty method
			//End of user code
		}
		return this.clMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for clMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getClMax(){
		return clMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for clMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setClMax(double myClMax){
		this.clMaxProperty().set(myClMax);
	}
	
	public void updateClMax(final double myClMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClMax(myClMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClMax(myClMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateClMax(final double myClMax) {
		updateClMax(myClMax, null);
	}

	/*
	 * <!-- Start of user code comment for clMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty clMinProperty(){
		if (this.clMinProperty == null) {
			this.clMinProperty = new SimpleDoubleProperty(mainStepCriteria.getClMin());
			this.clMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStepCriteria.setClMin((Double) arg2);
				}
			});
			//Start of user code clMinproperty method
			//End of user code
		}
		return this.clMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for clMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getClMin(){
		return clMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for clMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setClMin(double myClMin){
		this.clMinProperty().set(myClMin);
	}
	
	public void updateClMin(final double myClMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClMin(myClMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClMin(myClMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateClMin(final double myClMin) {
		updateClMin(myClMin, null);
	}

	/*
	 * <!-- Start of user code comment for correlationMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty correlationMaxProperty(){
		if (this.correlationMaxProperty == null) {
			this.correlationMaxProperty = new SimpleDoubleProperty(mainStepCriteria.getCorrelationMax());
			this.correlationMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStepCriteria.setCorrelationMax((Double) arg2);
				}
			});
			//Start of user code correlationMaxproperty method
			//End of user code
		}
		return this.correlationMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for correlationMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getCorrelationMax(){
		return correlationMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for correlationMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCorrelationMax(double myCorrelationMax){
		this.correlationMaxProperty().set(myCorrelationMax);
	}
	
	public void updateCorrelationMax(final double myCorrelationMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCorrelationMax(myCorrelationMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCorrelationMax(myCorrelationMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCorrelationMax(final double myCorrelationMax) {
		updateCorrelationMax(myCorrelationMax, null);
	}

	/*
	 * <!-- Start of user code comment for correlationMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty correlationMinProperty(){
		if (this.correlationMinProperty == null) {
			this.correlationMinProperty = new SimpleDoubleProperty(mainStepCriteria.getCorrelationMin());
			this.correlationMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStepCriteria.setCorrelationMin((Double) arg2);
				}
			});
			//Start of user code correlationMinproperty method
			//End of user code
		}
		return this.correlationMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for correlationMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getCorrelationMin(){
		return correlationMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for correlationMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCorrelationMin(double myCorrelationMin){
		this.correlationMinProperty().set(myCorrelationMin);
	}
	
	public void updateCorrelationMin(final double myCorrelationMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCorrelationMin(myCorrelationMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCorrelationMin(myCorrelationMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCorrelationMin(final double myCorrelationMin) {
		updateCorrelationMin(myCorrelationMin, null);
	}

	/*
	 * <!-- Start of user code comment for direction property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty directionProperty(){
		if (this.directionProperty == null) {
			this.directionProperty = new SimpleStringProperty(mainStepCriteria.getDirection());
			this.directionProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					mainStepCriteria.setDirection((String) arg2);
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
	 * <!-- Start of user code comment for nMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty nMaxProperty(){
		if (this.nMaxProperty == null) {
			this.nMaxProperty = new SimpleDoubleProperty(mainStepCriteria.getNMax());
			this.nMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStepCriteria.setNMax((Double) arg2);
				}
			});
			//Start of user code nMaxproperty method
			//End of user code
		}
		return this.nMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for nMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getNMax(){
		return nMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for nMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setNMax(double myNMax){
		this.nMaxProperty().set(myNMax);
	}
	
	public void updateNMax(final double myNMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNMax(myNMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNMax(myNMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateNMax(final double myNMax) {
		updateNMax(myNMax, null);
	}

	/*
	 * <!-- Start of user code comment for nMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty nMinProperty(){
		if (this.nMinProperty == null) {
			this.nMinProperty = new SimpleDoubleProperty(mainStepCriteria.getNMin());
			this.nMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStepCriteria.setNMin((Double) arg2);
				}
			});
			//Start of user code nMinproperty method
			//End of user code
		}
		return this.nMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for nMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getNMin(){
		return nMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for nMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setNMin(double myNMin){
		this.nMinProperty().set(myNMin);
	}
	
	public void updateNMin(final double myNMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNMin(myNMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNMin(myNMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateNMin(final double myNMin) {
		updateNMin(myNMin, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
