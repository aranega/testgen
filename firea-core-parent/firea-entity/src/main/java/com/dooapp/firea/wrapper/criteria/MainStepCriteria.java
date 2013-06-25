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


import com.dooapp.firea.enumeration.StepStatus;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
//@BeanClass(MainStepCriteriaBean.class)
public class MainStepCriteria 
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
	private DoubleProperty calculatedELAMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty calculatedELAMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty clMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty clMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty correlationMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty correlationMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty directionProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty nMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty nMinProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private MainStepCriteriaInstance mainStepCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MainStepCriteriaInstance getBean() {
		return  this.mainStepCriteria;
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
	public DoubleProperty calculatedELAMaxProperty(){
		if (this.calculatedELAMaxProperty == null) {
			this.calculatedELAMaxProperty = createCalculatedELAMaxProperty();
			getBean().setCalculatedELAMax(getBean().getCalculatedELAMax());
			this.calculatedELAMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setCalculatedELAMax((Double) arg2);
				}
			});
		}
		return this.calculatedELAMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createCalculatedELAMaxProperty(){
		return new SimpleDoubleProperty(getBean().getCalculatedELAMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getCalculatedELAMax(){
		return calculatedELAMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCalculatedELAMax(double myCalculatedELAMax){
		this.calculatedELAMaxProperty().set(myCalculatedELAMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCalculatedELAMax(final Double myCalculatedELAMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCalculatedELAMax(myCalculatedELAMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCalculatedELAMax(myCalculatedELAMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCalculatedELAMaxAndWait(final Double myCalculatedELAMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCalculatedELAMax(myCalculatedELAMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCalculatedELAMax(myCalculatedELAMax);
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
	public DoubleProperty calculatedELAMinProperty(){
		if (this.calculatedELAMinProperty == null) {
			this.calculatedELAMinProperty = createCalculatedELAMinProperty();
			getBean().setCalculatedELAMin(getBean().getCalculatedELAMin());
			this.calculatedELAMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setCalculatedELAMin((Double) arg2);
				}
			});
		}
		return this.calculatedELAMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createCalculatedELAMinProperty(){
		return new SimpleDoubleProperty(getBean().getCalculatedELAMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getCalculatedELAMin(){
		return calculatedELAMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCalculatedELAMin(double myCalculatedELAMin){
		this.calculatedELAMinProperty().set(myCalculatedELAMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCalculatedELAMin(final Double myCalculatedELAMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCalculatedELAMin(myCalculatedELAMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCalculatedELAMin(myCalculatedELAMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCalculatedELAMinAndWait(final Double myCalculatedELAMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCalculatedELAMin(myCalculatedELAMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCalculatedELAMin(myCalculatedELAMin);
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
	public DoubleProperty clMaxProperty(){
		if (this.clMaxProperty == null) {
			this.clMaxProperty = createClMaxProperty();
			getBean().setClMax(getBean().getClMax());
			this.clMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setClMax((Double) arg2);
				}
			});
		}
		return this.clMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createClMaxProperty(){
		return new SimpleDoubleProperty(getBean().getClMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getClMax(){
		return clMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClMax(double myClMax){
		this.clMaxProperty().set(myClMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClMax(final Double myClMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClMax(myClMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClMax(myClMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClMaxAndWait(final Double myClMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClMax(myClMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClMax(myClMax);
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
	public DoubleProperty clMinProperty(){
		if (this.clMinProperty == null) {
			this.clMinProperty = createClMinProperty();
			getBean().setClMin(getBean().getClMin());
			this.clMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setClMin((Double) arg2);
				}
			});
		}
		return this.clMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createClMinProperty(){
		return new SimpleDoubleProperty(getBean().getClMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getClMin(){
		return clMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClMin(double myClMin){
		this.clMinProperty().set(myClMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClMin(final Double myClMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClMin(myClMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClMin(myClMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClMinAndWait(final Double myClMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClMin(myClMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClMin(myClMin);
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
	public DoubleProperty correlationMaxProperty(){
		if (this.correlationMaxProperty == null) {
			this.correlationMaxProperty = createCorrelationMaxProperty();
			getBean().setCorrelationMax(getBean().getCorrelationMax());
			this.correlationMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setCorrelationMax((Double) arg2);
				}
			});
		}
		return this.correlationMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createCorrelationMaxProperty(){
		return new SimpleDoubleProperty(getBean().getCorrelationMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getCorrelationMax(){
		return correlationMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCorrelationMax(double myCorrelationMax){
		this.correlationMaxProperty().set(myCorrelationMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCorrelationMax(final Double myCorrelationMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCorrelationMax(myCorrelationMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCorrelationMax(myCorrelationMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCorrelationMaxAndWait(final Double myCorrelationMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCorrelationMax(myCorrelationMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCorrelationMax(myCorrelationMax);
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
	public DoubleProperty correlationMinProperty(){
		if (this.correlationMinProperty == null) {
			this.correlationMinProperty = createCorrelationMinProperty();
			getBean().setCorrelationMin(getBean().getCorrelationMin());
			this.correlationMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setCorrelationMin((Double) arg2);
				}
			});
		}
		return this.correlationMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createCorrelationMinProperty(){
		return new SimpleDoubleProperty(getBean().getCorrelationMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getCorrelationMin(){
		return correlationMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCorrelationMin(double myCorrelationMin){
		this.correlationMinProperty().set(myCorrelationMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCorrelationMin(final Double myCorrelationMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCorrelationMin(myCorrelationMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCorrelationMin(myCorrelationMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCorrelationMinAndWait(final Double myCorrelationMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCorrelationMin(myCorrelationMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCorrelationMin(myCorrelationMin);
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
	public StringProperty directionProperty(){
		if (this.directionProperty == null) {
			this.directionProperty = createDirectionProperty();
			getBean().setDirection(getBean().getDirection());
			this.directionProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setDirection((String) arg2);
				}
			});
		}
		return this.directionProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createDirectionProperty(){
		return new SimpleStringProperty(getBean().getDirection());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getDirection(){
		return directionProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDirection(String myDirection){
		this.directionProperty().set(myDirection);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDirection(final String myDirection) {
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
	public void updateDirectionAndWait(final String myDirection) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDirection(myDirection);
		} else {
			final Object mutex = new Object();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty nMaxProperty(){
		if (this.nMaxProperty == null) {
			this.nMaxProperty = createNMaxProperty();
			getBean().setNMax(getBean().getNMax());
			this.nMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setNMax((Double) arg2);
				}
			});
		}
		return this.nMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createNMaxProperty(){
		return new SimpleDoubleProperty(getBean().getNMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getNMax(){
		return nMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setNMax(double myNMax){
		this.nMaxProperty().set(myNMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNMax(final Double myNMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNMax(myNMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNMax(myNMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNMaxAndWait(final Double myNMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNMax(myNMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNMax(myNMax);
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
	public DoubleProperty nMinProperty(){
		if (this.nMinProperty == null) {
			this.nMinProperty = createNMinProperty();
			getBean().setNMin(getBean().getNMin());
			this.nMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setNMin((Double) arg2);
				}
			});
		}
		return this.nMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createNMinProperty(){
		return new SimpleDoubleProperty(getBean().getNMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getNMin(){
		return nMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setNMin(double myNMin){
		this.nMinProperty().set(myNMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNMin(final Double myNMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNMin(myNMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNMin(myNMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNMinAndWait(final Double myNMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNMin(myNMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNMin(myNMin);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

}
