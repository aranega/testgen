package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.SampleBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;


import com.dooapp.firea.entity.BeaufortScale;
import com.dooapp.firea.entity.AirPressureCalculationMethod;
import com.dooapp.firea.entity.SampleStatus;
import com.dooapp.firea.entity.PointDirection;


import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Attribute;
import org.jdom2.Element;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Sample
// Start of user code bloc for inheritance

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
	
	private IntegerProperty airPressureProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<AirPressureCalculationMethod> airPressureCalculationMethodProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<BeaufortScale> beaufortScaleProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<CalibrationStep> calibrationStepProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<java.util.Date> dateProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<BlowHoleStep> depressureEventStepProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<MainStep> depressureMainStepProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private IntegerProperty elevationProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private DoubleProperty highTargetProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private IntegerProperty highUpProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private LongProperty idProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private DoubleProperty lowTargetProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private StringProperty nameProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private IntegerProperty numberOfPointProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private DoubleProperty phiEPercentProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private DoubleProperty phiIPercentProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<PointDirection> pointDirectionProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<StaticStep> postStaticStepProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<StaticStep> preStaticStepProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<BlowHoleStep> pressureEventStepProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<MainStep> pressureMainStepProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<Project> projectProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private DoubleProperty roEProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private DoubleProperty roIProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<SampleStatus> statusProperty;
	/**
	 *  
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private DoubleProperty tetaEProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private DoubleProperty tetaIProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private IntegerProperty versionProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private DoubleProperty windMeasureProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private final SampleBean sample;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Sample(){
		this(new SampleBean());	
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Sample(SampleBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.sample = entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public SampleBean getSampleBean(){
		return this.sample;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public SampleBean getBean() {
		return  this.sample;
	}
	

	/*
	 * Generated getters and setters
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public IntegerProperty airPressureProperty(){
		if (this.airPressureProperty == null) {
			this.airPressureProperty = new SimpleIntegerProperty(sample.getAirPressure());
			this.airPressureProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setAirPressure((Integer) arg2);
				}
			});
		}
		return this.airPressureProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getAirPressure(){
		return airPressureProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAirPressure(int myAirPressure){
		this.airPressureProperty().set(myAirPressure);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAirPressure(final int myAirPressure, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAirPressure(myAirPressure);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAirPressure(myAirPressure);
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
	public void updateAirPressure(final int myAirPressure) {
		updateAirPressure(myAirPressure, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<AirPressureCalculationMethod> airPressureCalculationMethodProperty() {
		if (airPressureCalculationMethodProperty == null) {
			airPressureCalculationMethodProperty = new SimpleObjectProperty<AirPressureCalculationMethod>(sample.getAirPressureCalculationMethod());
			airPressureCalculationMethodProperty.addListener(new ChangeListener<AirPressureCalculationMethod>() {
				@Override
				public void changed(ObservableValue<? extends AirPressureCalculationMethod> arg0, AirPressureCalculationMethod arg1, AirPressureCalculationMethod arg2) {
					sample.setAirPressureCalculationMethod(arg2);
				}
			});
		}
		return airPressureCalculationMethodProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public AirPressureCalculationMethod getAirPressureCalculationMethod(){
		return airPressureCalculationMethodProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAirPressureCalculationMethod(AirPressureCalculationMethod myAirPressureCalculationMethod){
		if (airPressureCalculationMethodProperty == null) {
				sample.setAirPressureCalculationMethod(myAirPressureCalculationMethod);
			} else {
				this.airPressureCalculationMethodProperty().set(myAirPressureCalculationMethod);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAirPressureCalculationMethod(final AirPressureCalculationMethod myAirPressureCalculationMethod, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAirPressureCalculationMethod(myAirPressureCalculationMethod);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAirPressureCalculationMethod(myAirPressureCalculationMethod);
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
	public void updateAirPressureCalculationMethod(final AirPressureCalculationMethod myAirPressureCalculationMethod) {
		updateAirPressureCalculationMethod(myAirPressureCalculationMethod, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<BeaufortScale> beaufortScaleProperty() {
		if (beaufortScaleProperty == null) {
			beaufortScaleProperty = new SimpleObjectProperty<BeaufortScale>(sample.getBeaufortScale());
			beaufortScaleProperty.addListener(new ChangeListener<BeaufortScale>() {
				@Override
				public void changed(ObservableValue<? extends BeaufortScale> arg0, BeaufortScale arg1, BeaufortScale arg2) {
					sample.setBeaufortScale(arg2);
				}
			});
		}
		return beaufortScaleProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BeaufortScale getBeaufortScale(){
		return beaufortScaleProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setBeaufortScale(BeaufortScale myBeaufortScale){
		if (beaufortScaleProperty == null) {
				sample.setBeaufortScale(myBeaufortScale);
			} else {
				this.beaufortScaleProperty().set(myBeaufortScale);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateBeaufortScale(final BeaufortScale myBeaufortScale, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBeaufortScale(myBeaufortScale);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBeaufortScale(myBeaufortScale);
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
	public void updateBeaufortScale(final BeaufortScale myBeaufortScale) {
		updateBeaufortScale(myBeaufortScale, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<CalibrationStep> calibrationStepProperty() {
		if (calibrationStepProperty == null) {
			calibrationStepProperty = new SimpleObjectProperty<CalibrationStep>(sample.getCalibrationStep() == null ? null : sample
					.getCalibrationStep().getWrapper());
			calibrationStepProperty.addListener(new ChangeListener<CalibrationStep>() {
				@Override
				public void changed(ObservableValue<? extends CalibrationStep> obj, CalibrationStep oldValue, CalibrationStep newValue) {
					sample.setCalibrationStep(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return calibrationStepProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public CalibrationStep getCalibrationStep(){
		return calibrationStepProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCalibrationStep(CalibrationStep myCalibrationStep){
		if (calibrationStepProperty == null) {
				sample.setCalibrationStep(myCalibrationStep == null ? null : myCalibrationStep.getBean());
			} else {
				this.calibrationStepProperty().set(myCalibrationStep);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCalibrationStep(final CalibrationStep myCalibrationStep, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCalibrationStep(myCalibrationStep);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCalibrationStep(myCalibrationStep);
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
	public void updateCalibrationStep(final CalibrationStep myCalibrationStep) {
		updateCalibrationStep(myCalibrationStep, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(sample.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					sample.setCreationDate(arg2);
				}
			});
		}
		return creationDateProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCreationDate(){
		return creationDateProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCreationDate(java.util.Date myCreationDate){
		if (creationDateProperty == null) {
				sample.setCreationDate(myCreationDate);
			} else {
				this.creationDateProperty().set(myCreationDate);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDate(final java.util.Date myCreationDate, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDate(myCreationDate);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDate(myCreationDate);
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
	public void updateCreationDate(final java.util.Date myCreationDate) {
		updateCreationDate(myCreationDate, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<java.util.Date> dateProperty() {
		if (dateProperty == null) {
			dateProperty = new SimpleObjectProperty<java.util.Date>(sample.getDate());
			dateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					sample.setDate(arg2);
				}
			});
		}
		return dateProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getDate(){
		return dateProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDate(java.util.Date myDate){
		if (dateProperty == null) {
				sample.setDate(myDate);
			} else {
				this.dateProperty().set(myDate);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDate(final java.util.Date myDate, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDate(myDate);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDate(myDate);
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
	public void updateDate(final java.util.Date myDate) {
		updateDate(myDate, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<BlowHoleStep> depressureEventStepProperty() {
		if (depressureEventStepProperty == null) {
			depressureEventStepProperty = new SimpleObjectProperty<BlowHoleStep>(sample.getDepressureEventStep() == null ? null : sample
					.getDepressureEventStep().getWrapper());
			depressureEventStepProperty.addListener(new ChangeListener<BlowHoleStep>() {
				@Override
				public void changed(ObservableValue<? extends BlowHoleStep> obj, BlowHoleStep oldValue, BlowHoleStep newValue) {
					sample.setDepressureEventStep(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return depressureEventStepProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BlowHoleStep getDepressureEventStep(){
		return depressureEventStepProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDepressureEventStep(BlowHoleStep myDepressureEventStep){
		if (depressureEventStepProperty == null) {
				sample.setDepressureEventStep(myDepressureEventStep == null ? null : myDepressureEventStep.getBean());
			} else {
				this.depressureEventStepProperty().set(myDepressureEventStep);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDepressureEventStep(final BlowHoleStep myDepressureEventStep, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDepressureEventStep(myDepressureEventStep);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDepressureEventStep(myDepressureEventStep);
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
	public void updateDepressureEventStep(final BlowHoleStep myDepressureEventStep) {
		updateDepressureEventStep(myDepressureEventStep, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<MainStep> depressureMainStepProperty() {
		if (depressureMainStepProperty == null) {
			depressureMainStepProperty = new SimpleObjectProperty<MainStep>(sample.getDepressureMainStep() == null ? null : sample
					.getDepressureMainStep().getWrapper());
			depressureMainStepProperty.addListener(new ChangeListener<MainStep>() {
				@Override
				public void changed(ObservableValue<? extends MainStep> obj, MainStep oldValue, MainStep newValue) {
					sample.setDepressureMainStep(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return depressureMainStepProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MainStep getDepressureMainStep(){
		return depressureMainStepProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDepressureMainStep(MainStep myDepressureMainStep){
		if (depressureMainStepProperty == null) {
				sample.setDepressureMainStep(myDepressureMainStep == null ? null : myDepressureMainStep.getBean());
			} else {
				this.depressureMainStepProperty().set(myDepressureMainStep);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDepressureMainStep(final MainStep myDepressureMainStep, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDepressureMainStep(myDepressureMainStep);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDepressureMainStep(myDepressureMainStep);
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
	public void updateDepressureMainStep(final MainStep myDepressureMainStep) {
		updateDepressureMainStep(myDepressureMainStep, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public IntegerProperty elevationProperty(){
		if (this.elevationProperty == null) {
			this.elevationProperty = new SimpleIntegerProperty(sample.getElevation());
			this.elevationProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setElevation((Integer) arg2);
				}
			});
		}
		return this.elevationProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getElevation(){
		return elevationProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setElevation(int myElevation){
		this.elevationProperty().set(myElevation);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateElevation(final int myElevation, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setElevation(myElevation);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setElevation(myElevation);
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
	public void updateElevation(final int myElevation) {
		updateElevation(myElevation, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty highTargetProperty(){
		if (this.highTargetProperty == null) {
			this.highTargetProperty = new SimpleDoubleProperty(sample.getHighTarget());
			this.highTargetProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setHighTarget((Double) arg2);
				}
			});
		}
		return this.highTargetProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getHighTarget(){
		return highTargetProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setHighTarget(double myHighTarget){
		this.highTargetProperty().set(myHighTarget);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateHighTarget(final double myHighTarget, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setHighTarget(myHighTarget);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setHighTarget(myHighTarget);
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
	public void updateHighTarget(final double myHighTarget) {
		updateHighTarget(myHighTarget, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public IntegerProperty highUpProperty(){
		if (this.highUpProperty == null) {
			this.highUpProperty = new SimpleIntegerProperty(sample.getHighUp());
			this.highUpProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setHighUp((Integer) arg2);
				}
			});
		}
		return this.highUpProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getHighUp(){
		return highUpProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setHighUp(int myHighUp){
		this.highUpProperty().set(myHighUp);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateHighUp(final int myHighUp, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setHighUp(myHighUp);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setHighUp(myHighUp);
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
	public void updateHighUp(final int myHighUp) {
		updateHighUp(myHighUp, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(sample.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setId((Long) arg2);
				}
			});
		}
		return this.idProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public long getId(){
		return idProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setId(long myId){
		this.idProperty().set(myId);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateId(final long myId, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setId(myId);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setId(myId);
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
	public void updateId(final long myId) {
		updateId(myId, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty lowTargetProperty(){
		if (this.lowTargetProperty == null) {
			this.lowTargetProperty = new SimpleDoubleProperty(sample.getLowTarget());
			this.lowTargetProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setLowTarget((Double) arg2);
				}
			});
		}
		return this.lowTargetProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getLowTarget(){
		return lowTargetProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLowTarget(double myLowTarget){
		this.lowTargetProperty().set(myLowTarget);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLowTarget(final double myLowTarget, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLowTarget(myLowTarget);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLowTarget(myLowTarget);
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
	public void updateLowTarget(final double myLowTarget) {
		updateLowTarget(myLowTarget, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StringProperty nameProperty(){
		if (this.nameProperty == null) {
			this.nameProperty = new SimpleStringProperty(sample.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					sample.setName((String) arg2);
				}
			});
		}
		return this.nameProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getName(){
		return nameProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setName(String myName){
		this.nameProperty().set(myName);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateName(final String myName, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setName(myName);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setName(myName);
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
	public void updateName(final String myName) {
		updateName(myName, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public IntegerProperty numberOfPointProperty(){
		if (this.numberOfPointProperty == null) {
			this.numberOfPointProperty = new SimpleIntegerProperty(sample.getNumberOfPoint());
			this.numberOfPointProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setNumberOfPoint((Integer) arg2);
				}
			});
		}
		return this.numberOfPointProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getNumberOfPoint(){
		return numberOfPointProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setNumberOfPoint(int myNumberOfPoint){
		this.numberOfPointProperty().set(myNumberOfPoint);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNumberOfPoint(final int myNumberOfPoint, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNumberOfPoint(myNumberOfPoint);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNumberOfPoint(myNumberOfPoint);
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
	public void updateNumberOfPoint(final int myNumberOfPoint) {
		updateNumberOfPoint(myNumberOfPoint, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty phiEPercentProperty(){
		if (this.phiEPercentProperty == null) {
			this.phiEPercentProperty = new SimpleDoubleProperty(sample.getPhiEPercent());
			this.phiEPercentProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setPhiEPercent((Double) arg2);
				}
			});
		}
		return this.phiEPercentProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPhiEPercent(){
		return phiEPercentProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPhiEPercent(double myPhiEPercent){
		this.phiEPercentProperty().set(myPhiEPercent);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePhiEPercent(final double myPhiEPercent, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPhiEPercent(myPhiEPercent);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPhiEPercent(myPhiEPercent);
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
	public void updatePhiEPercent(final double myPhiEPercent) {
		updatePhiEPercent(myPhiEPercent, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty phiIPercentProperty(){
		if (this.phiIPercentProperty == null) {
			this.phiIPercentProperty = new SimpleDoubleProperty(sample.getPhiIPercent());
			this.phiIPercentProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setPhiIPercent((Double) arg2);
				}
			});
		}
		return this.phiIPercentProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPhiIPercent(){
		return phiIPercentProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPhiIPercent(double myPhiIPercent){
		this.phiIPercentProperty().set(myPhiIPercent);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePhiIPercent(final double myPhiIPercent, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPhiIPercent(myPhiIPercent);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPhiIPercent(myPhiIPercent);
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
	public void updatePhiIPercent(final double myPhiIPercent) {
		updatePhiIPercent(myPhiIPercent, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<PointDirection> pointDirectionProperty() {
		if (pointDirectionProperty == null) {
			pointDirectionProperty = new SimpleObjectProperty<PointDirection>(sample.getPointDirection());
			pointDirectionProperty.addListener(new ChangeListener<PointDirection>() {
				@Override
				public void changed(ObservableValue<? extends PointDirection> arg0, PointDirection arg1, PointDirection arg2) {
					sample.setPointDirection(arg2);
				}
			});
		}
		return pointDirectionProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public PointDirection getPointDirection(){
		return pointDirectionProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPointDirection(PointDirection myPointDirection){
		if (pointDirectionProperty == null) {
				sample.setPointDirection(myPointDirection);
			} else {
				this.pointDirectionProperty().set(myPointDirection);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePointDirection(final PointDirection myPointDirection, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPointDirection(myPointDirection);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPointDirection(myPointDirection);
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
	public void updatePointDirection(final PointDirection myPointDirection) {
		updatePointDirection(myPointDirection, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<StaticStep> postStaticStepProperty() {
		if (postStaticStepProperty == null) {
			postStaticStepProperty = new SimpleObjectProperty<StaticStep>(sample.getPostStaticStep() == null ? null : sample
					.getPostStaticStep().getWrapper());
			postStaticStepProperty.addListener(new ChangeListener<StaticStep>() {
				@Override
				public void changed(ObservableValue<? extends StaticStep> obj, StaticStep oldValue, StaticStep newValue) {
					sample.setPostStaticStep(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return postStaticStepProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStep getPostStaticStep(){
		return postStaticStepProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPostStaticStep(StaticStep myPostStaticStep){
		if (postStaticStepProperty == null) {
				sample.setPostStaticStep(myPostStaticStep == null ? null : myPostStaticStep.getBean());
			} else {
				this.postStaticStepProperty().set(myPostStaticStep);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePostStaticStep(final StaticStep myPostStaticStep, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPostStaticStep(myPostStaticStep);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPostStaticStep(myPostStaticStep);
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
	public void updatePostStaticStep(final StaticStep myPostStaticStep) {
		updatePostStaticStep(myPostStaticStep, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<StaticStep> preStaticStepProperty() {
		if (preStaticStepProperty == null) {
			preStaticStepProperty = new SimpleObjectProperty<StaticStep>(sample.getPreStaticStep() == null ? null : sample
					.getPreStaticStep().getWrapper());
			preStaticStepProperty.addListener(new ChangeListener<StaticStep>() {
				@Override
				public void changed(ObservableValue<? extends StaticStep> obj, StaticStep oldValue, StaticStep newValue) {
					sample.setPreStaticStep(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return preStaticStepProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStep getPreStaticStep(){
		return preStaticStepProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPreStaticStep(StaticStep myPreStaticStep){
		if (preStaticStepProperty == null) {
				sample.setPreStaticStep(myPreStaticStep == null ? null : myPreStaticStep.getBean());
			} else {
				this.preStaticStepProperty().set(myPreStaticStep);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePreStaticStep(final StaticStep myPreStaticStep, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPreStaticStep(myPreStaticStep);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPreStaticStep(myPreStaticStep);
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
	public void updatePreStaticStep(final StaticStep myPreStaticStep) {
		updatePreStaticStep(myPreStaticStep, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<BlowHoleStep> pressureEventStepProperty() {
		if (pressureEventStepProperty == null) {
			pressureEventStepProperty = new SimpleObjectProperty<BlowHoleStep>(sample.getPressureEventStep() == null ? null : sample
					.getPressureEventStep().getWrapper());
			pressureEventStepProperty.addListener(new ChangeListener<BlowHoleStep>() {
				@Override
				public void changed(ObservableValue<? extends BlowHoleStep> obj, BlowHoleStep oldValue, BlowHoleStep newValue) {
					sample.setPressureEventStep(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return pressureEventStepProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BlowHoleStep getPressureEventStep(){
		return pressureEventStepProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPressureEventStep(BlowHoleStep myPressureEventStep){
		if (pressureEventStepProperty == null) {
				sample.setPressureEventStep(myPressureEventStep == null ? null : myPressureEventStep.getBean());
			} else {
				this.pressureEventStepProperty().set(myPressureEventStep);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePressureEventStep(final BlowHoleStep myPressureEventStep, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPressureEventStep(myPressureEventStep);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPressureEventStep(myPressureEventStep);
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
	public void updatePressureEventStep(final BlowHoleStep myPressureEventStep) {
		updatePressureEventStep(myPressureEventStep, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<MainStep> pressureMainStepProperty() {
		if (pressureMainStepProperty == null) {
			pressureMainStepProperty = new SimpleObjectProperty<MainStep>(sample.getPressureMainStep() == null ? null : sample
					.getPressureMainStep().getWrapper());
			pressureMainStepProperty.addListener(new ChangeListener<MainStep>() {
				@Override
				public void changed(ObservableValue<? extends MainStep> obj, MainStep oldValue, MainStep newValue) {
					sample.setPressureMainStep(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return pressureMainStepProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MainStep getPressureMainStep(){
		return pressureMainStepProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPressureMainStep(MainStep myPressureMainStep){
		if (pressureMainStepProperty == null) {
				sample.setPressureMainStep(myPressureMainStep == null ? null : myPressureMainStep.getBean());
			} else {
				this.pressureMainStepProperty().set(myPressureMainStep);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePressureMainStep(final MainStep myPressureMainStep, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPressureMainStep(myPressureMainStep);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPressureMainStep(myPressureMainStep);
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
	public void updatePressureMainStep(final MainStep myPressureMainStep) {
		updatePressureMainStep(myPressureMainStep, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Project> projectProperty() {
		if (projectProperty == null) {
			projectProperty = new SimpleObjectProperty<Project>(sample.getProject() == null ? null : sample
					.getProject().getWrapper());
			projectProperty.addListener(new ChangeListener<Project>() {
				@Override
				public void changed(ObservableValue<? extends Project> obj, Project oldValue, Project newValue) {
					sample.setProject(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return projectProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Project getProject(){
		return projectProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setProject(Project myProject){
		if (projectProperty == null) {
				sample.setProject(myProject == null ? null : myProject.getBean());
			} else {
				this.projectProperty().set(myProject);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateProject(final Project myProject, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setProject(myProject);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setProject(myProject);
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
	public void updateProject(final Project myProject) {
		updateProject(myProject, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty roEProperty(){
		if (this.roEProperty == null) {
			this.roEProperty = new SimpleDoubleProperty(sample.getRoE());
			this.roEProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setRoE((Double) arg2);
				}
			});
		}
		return this.roEProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRoE(){
		return roEProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRoE(double myRoE){
		this.roEProperty().set(myRoE);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRoE(final double myRoE, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRoE(myRoE);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRoE(myRoE);
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
	public void updateRoE(final double myRoE) {
		updateRoE(myRoE, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty roIProperty(){
		if (this.roIProperty == null) {
			this.roIProperty = new SimpleDoubleProperty(sample.getRoI());
			this.roIProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setRoI((Double) arg2);
				}
			});
		}
		return this.roIProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRoI(){
		return roIProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRoI(double myRoI){
		this.roIProperty().set(myRoI);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRoI(final double myRoI, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRoI(myRoI);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRoI(myRoI);
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
	public void updateRoI(final double myRoI) {
		updateRoI(myRoI, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<SampleStatus> statusProperty() {
		if (statusProperty == null) {
			statusProperty = new SimpleObjectProperty<SampleStatus>(sample.getStatus());
			statusProperty.addListener(new ChangeListener<SampleStatus>() {
				@Override
				public void changed(ObservableValue<? extends SampleStatus> arg0, SampleStatus arg1, SampleStatus arg2) {
					sample.setStatus(arg2);
				}
			});
		}
		return statusProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public SampleStatus getStatus(){
		return statusProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setStatus(SampleStatus myStatus){
		if (statusProperty == null) {
				sample.setStatus(myStatus);
			} else {
				this.statusProperty().set(myStatus);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateStatus(final SampleStatus myStatus, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setStatus(myStatus);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setStatus(myStatus);
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
	public void updateStatus(final SampleStatus myStatus) {
		updateStatus(myStatus, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty tetaEProperty(){
		if (this.tetaEProperty == null) {
			this.tetaEProperty = new SimpleDoubleProperty(sample.getTetaE());
			this.tetaEProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setTetaE((Double) arg2);
				}
			});
		}
		return this.tetaEProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getTetaE(){
		return tetaEProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTetaE(double myTetaE){
		this.tetaEProperty().set(myTetaE);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTetaE(final double myTetaE, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTetaE(myTetaE);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTetaE(myTetaE);
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
	public void updateTetaE(final double myTetaE) {
		updateTetaE(myTetaE, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty tetaIProperty(){
		if (this.tetaIProperty == null) {
			this.tetaIProperty = new SimpleDoubleProperty(sample.getTetaI());
			this.tetaIProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setTetaI((Double) arg2);
				}
			});
		}
		return this.tetaIProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getTetaI(){
		return tetaIProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTetaI(double myTetaI){
		this.tetaIProperty().set(myTetaI);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTetaI(final double myTetaI, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTetaI(myTetaI);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTetaI(myTetaI);
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
	public void updateTetaI(final double myTetaI) {
		updateTetaI(myTetaI, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(sample.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					sample.setUpdateDate(arg2);
				}
			});
		}
		return updateDateProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getUpdateDate(){
		return updateDateProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUpdateDate(java.util.Date myUpdateDate){
		if (updateDateProperty == null) {
				sample.setUpdateDate(myUpdateDate);
			} else {
				this.updateDateProperty().set(myUpdateDate);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDate(final java.util.Date myUpdateDate, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDate(myUpdateDate);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDate(myUpdateDate);
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
	public void updateUpdateDate(final java.util.Date myUpdateDate) {
		updateUpdateDate(myUpdateDate, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public IntegerProperty versionProperty(){
		if (this.versionProperty == null) {
			this.versionProperty = new SimpleIntegerProperty(sample.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setVersion((Integer) arg2);
				}
			});
		}
		return this.versionProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getVersion(){
		return versionProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setVersion(int myVersion){
		this.versionProperty().set(myVersion);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVersion(final int myVersion, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVersion(myVersion);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVersion(myVersion);
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
	public void updateVersion(final int myVersion) {
		updateVersion(myVersion, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty windMeasureProperty(){
		if (this.windMeasureProperty == null) {
			this.windMeasureProperty = new SimpleDoubleProperty(sample.getWindMeasure());
			this.windMeasureProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setWindMeasure((Double) arg2);
				}
			});
		}
		return this.windMeasureProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getWindMeasure(){
		return windMeasureProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setWindMeasure(double myWindMeasure){
		this.windMeasureProperty().set(myWindMeasure);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateWindMeasure(final double myWindMeasure, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setWindMeasure(myWindMeasure);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setWindMeasure(myWindMeasure);
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
	public void updateWindMeasure(final double myWindMeasure) {
		updateWindMeasure(myWindMeasure, null);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getSampleBean() != null ? serializer.outputString(this.toDomXML()) : "";
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Element toDomXML(){
		Element xmlElement = new Element("Sample");
		xmlElement.setAttribute(new Attribute("phiIPercent", String.valueOf(getPhiIPercent())));
		xmlElement.setAttribute(new Attribute("roE", String.valueOf(getRoE())));
		xmlElement.setAttribute(new Attribute("tetaE", String.valueOf(getTetaE())));
		xmlElement.setAttribute(new Attribute("lowTarget", String.valueOf(getLowTarget())));
		xmlElement.setAttribute(new Attribute("highUp", String.valueOf(getHighUp())));
		xmlElement.setAttribute(new Attribute("windMeasure", String.valueOf(getWindMeasure())));
		xmlElement.setAttribute(new Attribute("airPressureCalculationMethod", String.valueOf(getAirPressureCalculationMethod())));
		xmlElement.setAttribute(new Attribute("airPressure", String.valueOf(getAirPressure())));
		if (getName() != null)
			xmlElement.setAttribute(new Attribute("name", getName()));
		xmlElement.setAttribute(new Attribute("roI", String.valueOf(getRoI())));
		xmlElement.setAttribute(new Attribute("numberOfPoint", String.valueOf(getNumberOfPoint())));
		xmlElement.setAttribute(new Attribute("highTarget", String.valueOf(getHighTarget())));
		xmlElement.setAttribute(new Attribute("pointDirection", String.valueOf(getPointDirection())));
		xmlElement.setAttribute(new Attribute("beaufortScale", String.valueOf(getBeaufortScale())));
		if (getDate() != null)
			xmlElement.setAttribute(new Attribute("date", getDate().toString()));
		xmlElement.setAttribute(new Attribute("tetaI", String.valueOf(getTetaI())));
		xmlElement.setAttribute(new Attribute("phiEPercent", String.valueOf(getPhiEPercent())));
		xmlElement.setAttribute(new Attribute("elevation", String.valueOf(getElevation())));
		xmlElement.setAttribute(new Attribute("status", String.valueOf(getStatus())));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		
		if (getPostStaticStep() != null) {
			Element postStaticStep = new Element("postStaticStep");
			postStaticStep.addContent(getPostStaticStep().toXML());
			xmlElement.addContent(postStaticStep);
		}if (getDepressureMainStep() != null) {
			Element depressureMainStep = new Element("depressureMainStep");
			depressureMainStep.addContent(getDepressureMainStep().toXML());
			xmlElement.addContent(depressureMainStep);
		}if (getDepressureEventStep() != null) {
			Element depressureEventStep = new Element("depressureEventStep");
			depressureEventStep.addContent(getDepressureEventStep().toXML());
			xmlElement.addContent(depressureEventStep);
		}if (getCalibrationStep() != null) {
			Element calibrationStep = new Element("calibrationStep");
			calibrationStep.addContent(getCalibrationStep().toXML());
			xmlElement.addContent(calibrationStep);
		}if (getPreStaticStep() != null) {
			Element preStaticStep = new Element("preStaticStep");
			preStaticStep.addContent(getPreStaticStep().toXML());
			xmlElement.addContent(preStaticStep);
		}if (getProject() != null)
			xmlElement.setAttribute("project", String.valueOf(getProject().getId()));
		if (getPressureMainStep() != null) {
			Element pressureMainStep = new Element("pressureMainStep");
			pressureMainStep.addContent(getPressureMainStep().toXML());
			xmlElement.addContent(pressureMainStep);
		}if (getPressureEventStep() != null) {
			Element pressureEventStep = new Element("pressureEventStep");
			pressureEventStep.addContent(getPressureEventStep().toXML());
			xmlElement.addContent(pressureEventStep);
		}
		
		// For custom purposes
		xmlElement = this.customDomXML(xmlElement);
		
		return xmlElement;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Element customDomXML(Element e) {
		return e;
	}

}
