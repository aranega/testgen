package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.SampleCriteriaInstance;

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
//Start of user code for imports
// TODO: import me!
//End of user code




public class SampleCriteria implements com.dooapp.lib.common.entity.Wrapper 
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<com.dooapp.firea.entity.AirPressureCalculationMethod> airPressureCalculationMethodProperty;
	
	private IntegerProperty airPressureMaxProperty;
	
	private IntegerProperty airPressureMinProperty;
	
	private ObjectProperty<com.dooapp.firea.entity.BeaufortScale> beaufortScaleProperty;
	
	private ObjectProperty<java.util.Date> creationDateMaxProperty;
	
	private ObjectProperty<java.util.Date> creationDateMinProperty;
	
	private ObjectProperty<java.util.Date> dateMaxProperty;
	
	private ObjectProperty<java.util.Date> dateMinProperty;
	
	private LongProperty idMaxProperty;
	
	private LongProperty idMinProperty;
	
	private StringProperty nameProperty;
	
	private DoubleProperty phiEPercentMaxProperty;
	
	private DoubleProperty phiEPercentMinProperty;
	
	private DoubleProperty phiIPercentMaxProperty;
	
	private DoubleProperty phiIPercentMinProperty;
	
	private DoubleProperty roEMaxProperty;
	
	private DoubleProperty roEMinProperty;
	
	private DoubleProperty roIMaxProperty;
	
	private DoubleProperty roIMinProperty;
	
	private ObjectProperty<com.dooapp.firea.entity.SampleStatus> statusProperty;
	
	private DoubleProperty tetaEMaxProperty;
	
	private DoubleProperty tetaEMinProperty;
	
	private DoubleProperty tetaIMaxProperty;
	
	private DoubleProperty tetaIMinProperty;
	
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	
	private ObjectProperty<java.util.Date> updateDateMinProperty;
	
	private IntegerProperty versionProperty;
	
	private DoubleProperty windMeasureMaxProperty;
	
	private DoubleProperty windMeasureMinProperty;

	/**
	 * Handled Criteria
	 */
	private SampleCriteriaInstance sampleCriteria;

	/*
	 * Constructors 
	 */
	public SampleCriteria(){
		this(new SampleCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	public SampleCriteria(SampleCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.sampleCriteria = entity;
		//Start of user code constructor with parameters
		//End of user code
	}
	
	public SampleCriteriaInstance getSampleCriteriaInstance(){
		return this.sampleCriteria;
	}
	
	
	public SampleCriteriaInstance getBean() {
		return  this.sampleCriteria;
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

	public ObjectProperty<com.dooapp.firea.entity.AirPressureCalculationMethod> airPressureCalculationMethodProperty() {
		if (airPressureCalculationMethodProperty == null) {
			airPressureCalculationMethodProperty = new SimpleObjectProperty<com.dooapp.firea.entity.AirPressureCalculationMethod>(sampleCriteria.getAirPressureCalculationMethod());
			airPressureCalculationMethodProperty.addListener(new ChangeListener<com.dooapp.firea.entity.AirPressureCalculationMethod>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.AirPressureCalculationMethod> arg0, com.dooapp.firea.entity.AirPressureCalculationMethod arg1, com.dooapp.firea.entity.AirPressureCalculationMethod arg2) {
					sampleCriteria.setAirPressureCalculationMethod(arg2);
				}
			});
			//Start of user code airPressureCalculationMethodproperty method
			//End of user code
		}
		return airPressureCalculationMethodProperty;
	}
	
	public com.dooapp.firea.entity.AirPressureCalculationMethod getAirPressureCalculationMethod(){
		return airPressureCalculationMethodProperty().get();
	} 
	
	public void setAirPressureCalculationMethod(com.dooapp.firea.entity.AirPressureCalculationMethod myAirPressureCalculationMethod){
		if (airPressureCalculationMethodProperty == null) {
				sampleCriteria.setAirPressureCalculationMethod(myAirPressureCalculationMethod);
			} else {
				this.airPressureCalculationMethodProperty().set(myAirPressureCalculationMethod);
			}
	}
	
	public void updateAirPressureCalculationMethod(final com.dooapp.firea.entity.AirPressureCalculationMethod myAirPressureCalculationMethod, final Object mutex) {
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
	
	public void updateAirPressureCalculationMethod(final com.dooapp.firea.entity.AirPressureCalculationMethod myAirPressureCalculationMethod) {
		updateAirPressureCalculationMethod(myAirPressureCalculationMethod, null);
	}

	public IntegerProperty airPressureMaxProperty(){
		if (this.airPressureMaxProperty == null) {
			this.airPressureMaxProperty = new SimpleIntegerProperty(sampleCriteria.getAirPressureMax());
			this.airPressureMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setAirPressureMax((Integer) arg2);
				}
			});
			//Start of user code airPressureMaxproperty method
			//End of user code
		}
		return this.airPressureMaxProperty;
	}
	
	public int getAirPressureMax(){
		return airPressureMaxProperty().get();
	} 
	
	public void setAirPressureMax(int myAirPressureMax){
		this.airPressureMaxProperty().set(myAirPressureMax);
	}
	
	public void updateAirPressureMax(final int myAirPressureMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAirPressureMax(myAirPressureMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAirPressureMax(myAirPressureMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateAirPressureMax(final int myAirPressureMax) {
		updateAirPressureMax(myAirPressureMax, null);
	}

	public IntegerProperty airPressureMinProperty(){
		if (this.airPressureMinProperty == null) {
			this.airPressureMinProperty = new SimpleIntegerProperty(sampleCriteria.getAirPressureMin());
			this.airPressureMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setAirPressureMin((Integer) arg2);
				}
			});
			//Start of user code airPressureMinproperty method
			//End of user code
		}
		return this.airPressureMinProperty;
	}
	
	public int getAirPressureMin(){
		return airPressureMinProperty().get();
	} 
	
	public void setAirPressureMin(int myAirPressureMin){
		this.airPressureMinProperty().set(myAirPressureMin);
	}
	
	public void updateAirPressureMin(final int myAirPressureMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAirPressureMin(myAirPressureMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAirPressureMin(myAirPressureMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateAirPressureMin(final int myAirPressureMin) {
		updateAirPressureMin(myAirPressureMin, null);
	}

	public ObjectProperty<com.dooapp.firea.entity.BeaufortScale> beaufortScaleProperty() {
		if (beaufortScaleProperty == null) {
			beaufortScaleProperty = new SimpleObjectProperty<com.dooapp.firea.entity.BeaufortScale>(sampleCriteria.getBeaufortScale());
			beaufortScaleProperty.addListener(new ChangeListener<com.dooapp.firea.entity.BeaufortScale>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.BeaufortScale> arg0, com.dooapp.firea.entity.BeaufortScale arg1, com.dooapp.firea.entity.BeaufortScale arg2) {
					sampleCriteria.setBeaufortScale(arg2);
				}
			});
			//Start of user code beaufortScaleproperty method
			//End of user code
		}
		return beaufortScaleProperty;
	}
	
	public com.dooapp.firea.entity.BeaufortScale getBeaufortScale(){
		return beaufortScaleProperty().get();
	} 
	
	public void setBeaufortScale(com.dooapp.firea.entity.BeaufortScale myBeaufortScale){
		if (beaufortScaleProperty == null) {
				sampleCriteria.setBeaufortScale(myBeaufortScale);
			} else {
				this.beaufortScaleProperty().set(myBeaufortScale);
			}
	}
	
	public void updateBeaufortScale(final com.dooapp.firea.entity.BeaufortScale myBeaufortScale, final Object mutex) {
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
	
	public void updateBeaufortScale(final com.dooapp.firea.entity.BeaufortScale myBeaufortScale) {
		updateBeaufortScale(myBeaufortScale, null);
	}

	public ObjectProperty<java.util.Date> creationDateMaxProperty() {
		if (creationDateMaxProperty == null) {
			creationDateMaxProperty = new SimpleObjectProperty<java.util.Date>(sampleCriteria.getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					sampleCriteria.setCreationDateMax(arg2);
				}
			});
			//Start of user code creationDateMaxproperty method
			//End of user code
		}
		return creationDateMaxProperty;
	}
	
	public java.util.Date getCreationDateMax(){
		return creationDateMaxProperty().get();
	} 
	
	public void setCreationDateMax(java.util.Date myCreationDateMax){
		if (creationDateMaxProperty == null) {
				sampleCriteria.setCreationDateMax(myCreationDateMax);
			} else {
				this.creationDateMaxProperty().set(myCreationDateMax);
			}
	}
	
	public void updateCreationDateMax(final java.util.Date myCreationDateMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDateMax(myCreationDateMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDateMax(myCreationDateMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCreationDateMax(final java.util.Date myCreationDateMax) {
		updateCreationDateMax(myCreationDateMax, null);
	}

	public ObjectProperty<java.util.Date> creationDateMinProperty() {
		if (creationDateMinProperty == null) {
			creationDateMinProperty = new SimpleObjectProperty<java.util.Date>(sampleCriteria.getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					sampleCriteria.setCreationDateMin(arg2);
				}
			});
			//Start of user code creationDateMinproperty method
			//End of user code
		}
		return creationDateMinProperty;
	}
	
	public java.util.Date getCreationDateMin(){
		return creationDateMinProperty().get();
	} 
	
	public void setCreationDateMin(java.util.Date myCreationDateMin){
		if (creationDateMinProperty == null) {
				sampleCriteria.setCreationDateMin(myCreationDateMin);
			} else {
				this.creationDateMinProperty().set(myCreationDateMin);
			}
	}
	
	public void updateCreationDateMin(final java.util.Date myCreationDateMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDateMin(myCreationDateMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDateMin(myCreationDateMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCreationDateMin(final java.util.Date myCreationDateMin) {
		updateCreationDateMin(myCreationDateMin, null);
	}

	public ObjectProperty<java.util.Date> dateMaxProperty() {
		if (dateMaxProperty == null) {
			dateMaxProperty = new SimpleObjectProperty<java.util.Date>(sampleCriteria.getDateMax());
			dateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					sampleCriteria.setDateMax(arg2);
				}
			});
			//Start of user code dateMaxproperty method
			//End of user code
		}
		return dateMaxProperty;
	}
	
	public java.util.Date getDateMax(){
		return dateMaxProperty().get();
	} 
	
	public void setDateMax(java.util.Date myDateMax){
		if (dateMaxProperty == null) {
				sampleCriteria.setDateMax(myDateMax);
			} else {
				this.dateMaxProperty().set(myDateMax);
			}
	}
	
	public void updateDateMax(final java.util.Date myDateMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDateMax(myDateMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDateMax(myDateMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDateMax(final java.util.Date myDateMax) {
		updateDateMax(myDateMax, null);
	}

	public ObjectProperty<java.util.Date> dateMinProperty() {
		if (dateMinProperty == null) {
			dateMinProperty = new SimpleObjectProperty<java.util.Date>(sampleCriteria.getDateMin());
			dateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					sampleCriteria.setDateMin(arg2);
				}
			});
			//Start of user code dateMinproperty method
			//End of user code
		}
		return dateMinProperty;
	}
	
	public java.util.Date getDateMin(){
		return dateMinProperty().get();
	} 
	
	public void setDateMin(java.util.Date myDateMin){
		if (dateMinProperty == null) {
				sampleCriteria.setDateMin(myDateMin);
			} else {
				this.dateMinProperty().set(myDateMin);
			}
	}
	
	public void updateDateMin(final java.util.Date myDateMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDateMin(myDateMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDateMin(myDateMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDateMin(final java.util.Date myDateMin) {
		updateDateMin(myDateMin, null);
	}

	public LongProperty idMaxProperty(){
		if (this.idMaxProperty == null) {
			this.idMaxProperty = new SimpleLongProperty(sampleCriteria.getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setIdMax((Long) arg2);
				}
			});
			//Start of user code idMaxproperty method
			//End of user code
		}
		return this.idMaxProperty;
	}
	
	public long getIdMax(){
		return idMaxProperty().get();
	} 
	
	public void setIdMax(long myIdMax){
		this.idMaxProperty().set(myIdMax);
	}
	
	public void updateIdMax(final long myIdMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIdMax(myIdMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIdMax(myIdMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateIdMax(final long myIdMax) {
		updateIdMax(myIdMax, null);
	}

	public LongProperty idMinProperty(){
		if (this.idMinProperty == null) {
			this.idMinProperty = new SimpleLongProperty(sampleCriteria.getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setIdMin((Long) arg2);
				}
			});
			//Start of user code idMinproperty method
			//End of user code
		}
		return this.idMinProperty;
	}
	
	public long getIdMin(){
		return idMinProperty().get();
	} 
	
	public void setIdMin(long myIdMin){
		this.idMinProperty().set(myIdMin);
	}
	
	public void updateIdMin(final long myIdMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIdMin(myIdMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIdMin(myIdMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateIdMin(final long myIdMin) {
		updateIdMin(myIdMin, null);
	}

	public StringProperty nameProperty(){
		if (this.nameProperty == null) {
			this.nameProperty = new SimpleStringProperty(sampleCriteria.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					sampleCriteria.setName((String) arg2);
				}
			});
			//Start of user code nameproperty method
			//End of user code
		}
		return this.nameProperty;
	}
	
	public String getName(){
		return nameProperty().get();
	} 
	
	public void setName(String myName){
		this.nameProperty().set(myName);
	}
	
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
	
	public void updateName(final String myName) {
		updateName(myName, null);
	}

	public DoubleProperty phiEPercentMaxProperty(){
		if (this.phiEPercentMaxProperty == null) {
			this.phiEPercentMaxProperty = new SimpleDoubleProperty(sampleCriteria.getPhiEPercentMax());
			this.phiEPercentMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setPhiEPercentMax((Double) arg2);
				}
			});
			//Start of user code phiEPercentMaxproperty method
			//End of user code
		}
		return this.phiEPercentMaxProperty;
	}
	
	public double getPhiEPercentMax(){
		return phiEPercentMaxProperty().get();
	} 
	
	public void setPhiEPercentMax(double myPhiEPercentMax){
		this.phiEPercentMaxProperty().set(myPhiEPercentMax);
	}
	
	public void updatePhiEPercentMax(final double myPhiEPercentMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPhiEPercentMax(myPhiEPercentMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPhiEPercentMax(myPhiEPercentMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updatePhiEPercentMax(final double myPhiEPercentMax) {
		updatePhiEPercentMax(myPhiEPercentMax, null);
	}

	public DoubleProperty phiEPercentMinProperty(){
		if (this.phiEPercentMinProperty == null) {
			this.phiEPercentMinProperty = new SimpleDoubleProperty(sampleCriteria.getPhiEPercentMin());
			this.phiEPercentMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setPhiEPercentMin((Double) arg2);
				}
			});
			//Start of user code phiEPercentMinproperty method
			//End of user code
		}
		return this.phiEPercentMinProperty;
	}
	
	public double getPhiEPercentMin(){
		return phiEPercentMinProperty().get();
	} 
	
	public void setPhiEPercentMin(double myPhiEPercentMin){
		this.phiEPercentMinProperty().set(myPhiEPercentMin);
	}
	
	public void updatePhiEPercentMin(final double myPhiEPercentMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPhiEPercentMin(myPhiEPercentMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPhiEPercentMin(myPhiEPercentMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updatePhiEPercentMin(final double myPhiEPercentMin) {
		updatePhiEPercentMin(myPhiEPercentMin, null);
	}

	public DoubleProperty phiIPercentMaxProperty(){
		if (this.phiIPercentMaxProperty == null) {
			this.phiIPercentMaxProperty = new SimpleDoubleProperty(sampleCriteria.getPhiIPercentMax());
			this.phiIPercentMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setPhiIPercentMax((Double) arg2);
				}
			});
			//Start of user code phiIPercentMaxproperty method
			//End of user code
		}
		return this.phiIPercentMaxProperty;
	}
	
	public double getPhiIPercentMax(){
		return phiIPercentMaxProperty().get();
	} 
	
	public void setPhiIPercentMax(double myPhiIPercentMax){
		this.phiIPercentMaxProperty().set(myPhiIPercentMax);
	}
	
	public void updatePhiIPercentMax(final double myPhiIPercentMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPhiIPercentMax(myPhiIPercentMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPhiIPercentMax(myPhiIPercentMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updatePhiIPercentMax(final double myPhiIPercentMax) {
		updatePhiIPercentMax(myPhiIPercentMax, null);
	}

	public DoubleProperty phiIPercentMinProperty(){
		if (this.phiIPercentMinProperty == null) {
			this.phiIPercentMinProperty = new SimpleDoubleProperty(sampleCriteria.getPhiIPercentMin());
			this.phiIPercentMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setPhiIPercentMin((Double) arg2);
				}
			});
			//Start of user code phiIPercentMinproperty method
			//End of user code
		}
		return this.phiIPercentMinProperty;
	}
	
	public double getPhiIPercentMin(){
		return phiIPercentMinProperty().get();
	} 
	
	public void setPhiIPercentMin(double myPhiIPercentMin){
		this.phiIPercentMinProperty().set(myPhiIPercentMin);
	}
	
	public void updatePhiIPercentMin(final double myPhiIPercentMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPhiIPercentMin(myPhiIPercentMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPhiIPercentMin(myPhiIPercentMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updatePhiIPercentMin(final double myPhiIPercentMin) {
		updatePhiIPercentMin(myPhiIPercentMin, null);
	}

	public DoubleProperty roEMaxProperty(){
		if (this.roEMaxProperty == null) {
			this.roEMaxProperty = new SimpleDoubleProperty(sampleCriteria.getRoEMax());
			this.roEMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setRoEMax((Double) arg2);
				}
			});
			//Start of user code roEMaxproperty method
			//End of user code
		}
		return this.roEMaxProperty;
	}
	
	public double getRoEMax(){
		return roEMaxProperty().get();
	} 
	
	public void setRoEMax(double myRoEMax){
		this.roEMaxProperty().set(myRoEMax);
	}
	
	public void updateRoEMax(final double myRoEMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRoEMax(myRoEMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRoEMax(myRoEMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRoEMax(final double myRoEMax) {
		updateRoEMax(myRoEMax, null);
	}

	public DoubleProperty roEMinProperty(){
		if (this.roEMinProperty == null) {
			this.roEMinProperty = new SimpleDoubleProperty(sampleCriteria.getRoEMin());
			this.roEMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setRoEMin((Double) arg2);
				}
			});
			//Start of user code roEMinproperty method
			//End of user code
		}
		return this.roEMinProperty;
	}
	
	public double getRoEMin(){
		return roEMinProperty().get();
	} 
	
	public void setRoEMin(double myRoEMin){
		this.roEMinProperty().set(myRoEMin);
	}
	
	public void updateRoEMin(final double myRoEMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRoEMin(myRoEMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRoEMin(myRoEMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRoEMin(final double myRoEMin) {
		updateRoEMin(myRoEMin, null);
	}

	public DoubleProperty roIMaxProperty(){
		if (this.roIMaxProperty == null) {
			this.roIMaxProperty = new SimpleDoubleProperty(sampleCriteria.getRoIMax());
			this.roIMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setRoIMax((Double) arg2);
				}
			});
			//Start of user code roIMaxproperty method
			//End of user code
		}
		return this.roIMaxProperty;
	}
	
	public double getRoIMax(){
		return roIMaxProperty().get();
	} 
	
	public void setRoIMax(double myRoIMax){
		this.roIMaxProperty().set(myRoIMax);
	}
	
	public void updateRoIMax(final double myRoIMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRoIMax(myRoIMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRoIMax(myRoIMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRoIMax(final double myRoIMax) {
		updateRoIMax(myRoIMax, null);
	}

	public DoubleProperty roIMinProperty(){
		if (this.roIMinProperty == null) {
			this.roIMinProperty = new SimpleDoubleProperty(sampleCriteria.getRoIMin());
			this.roIMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setRoIMin((Double) arg2);
				}
			});
			//Start of user code roIMinproperty method
			//End of user code
		}
		return this.roIMinProperty;
	}
	
	public double getRoIMin(){
		return roIMinProperty().get();
	} 
	
	public void setRoIMin(double myRoIMin){
		this.roIMinProperty().set(myRoIMin);
	}
	
	public void updateRoIMin(final double myRoIMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRoIMin(myRoIMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRoIMin(myRoIMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRoIMin(final double myRoIMin) {
		updateRoIMin(myRoIMin, null);
	}

	public ObjectProperty<com.dooapp.firea.entity.SampleStatus> statusProperty() {
		if (statusProperty == null) {
			statusProperty = new SimpleObjectProperty<com.dooapp.firea.entity.SampleStatus>(sampleCriteria.getStatus());
			statusProperty.addListener(new ChangeListener<com.dooapp.firea.entity.SampleStatus>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.SampleStatus> arg0, com.dooapp.firea.entity.SampleStatus arg1, com.dooapp.firea.entity.SampleStatus arg2) {
					sampleCriteria.setStatus(arg2);
				}
			});
			//Start of user code statusproperty method
			//End of user code
		}
		return statusProperty;
	}
	
	public com.dooapp.firea.entity.SampleStatus getStatus(){
		return statusProperty().get();
	} 
	
	public void setStatus(com.dooapp.firea.entity.SampleStatus myStatus){
		if (statusProperty == null) {
				sampleCriteria.setStatus(myStatus);
			} else {
				this.statusProperty().set(myStatus);
			}
	}
	
	public void updateStatus(final com.dooapp.firea.entity.SampleStatus myStatus, final Object mutex) {
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
	
	public void updateStatus(final com.dooapp.firea.entity.SampleStatus myStatus) {
		updateStatus(myStatus, null);
	}

	public DoubleProperty tetaEMaxProperty(){
		if (this.tetaEMaxProperty == null) {
			this.tetaEMaxProperty = new SimpleDoubleProperty(sampleCriteria.getTetaEMax());
			this.tetaEMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setTetaEMax((Double) arg2);
				}
			});
			//Start of user code tetaEMaxproperty method
			//End of user code
		}
		return this.tetaEMaxProperty;
	}
	
	public double getTetaEMax(){
		return tetaEMaxProperty().get();
	} 
	
	public void setTetaEMax(double myTetaEMax){
		this.tetaEMaxProperty().set(myTetaEMax);
	}
	
	public void updateTetaEMax(final double myTetaEMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTetaEMax(myTetaEMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTetaEMax(myTetaEMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTetaEMax(final double myTetaEMax) {
		updateTetaEMax(myTetaEMax, null);
	}

	public DoubleProperty tetaEMinProperty(){
		if (this.tetaEMinProperty == null) {
			this.tetaEMinProperty = new SimpleDoubleProperty(sampleCriteria.getTetaEMin());
			this.tetaEMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setTetaEMin((Double) arg2);
				}
			});
			//Start of user code tetaEMinproperty method
			//End of user code
		}
		return this.tetaEMinProperty;
	}
	
	public double getTetaEMin(){
		return tetaEMinProperty().get();
	} 
	
	public void setTetaEMin(double myTetaEMin){
		this.tetaEMinProperty().set(myTetaEMin);
	}
	
	public void updateTetaEMin(final double myTetaEMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTetaEMin(myTetaEMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTetaEMin(myTetaEMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTetaEMin(final double myTetaEMin) {
		updateTetaEMin(myTetaEMin, null);
	}

	public DoubleProperty tetaIMaxProperty(){
		if (this.tetaIMaxProperty == null) {
			this.tetaIMaxProperty = new SimpleDoubleProperty(sampleCriteria.getTetaIMax());
			this.tetaIMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setTetaIMax((Double) arg2);
				}
			});
			//Start of user code tetaIMaxproperty method
			//End of user code
		}
		return this.tetaIMaxProperty;
	}
	
	public double getTetaIMax(){
		return tetaIMaxProperty().get();
	} 
	
	public void setTetaIMax(double myTetaIMax){
		this.tetaIMaxProperty().set(myTetaIMax);
	}
	
	public void updateTetaIMax(final double myTetaIMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTetaIMax(myTetaIMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTetaIMax(myTetaIMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTetaIMax(final double myTetaIMax) {
		updateTetaIMax(myTetaIMax, null);
	}

	public DoubleProperty tetaIMinProperty(){
		if (this.tetaIMinProperty == null) {
			this.tetaIMinProperty = new SimpleDoubleProperty(sampleCriteria.getTetaIMin());
			this.tetaIMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setTetaIMin((Double) arg2);
				}
			});
			//Start of user code tetaIMinproperty method
			//End of user code
		}
		return this.tetaIMinProperty;
	}
	
	public double getTetaIMin(){
		return tetaIMinProperty().get();
	} 
	
	public void setTetaIMin(double myTetaIMin){
		this.tetaIMinProperty().set(myTetaIMin);
	}
	
	public void updateTetaIMin(final double myTetaIMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTetaIMin(myTetaIMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTetaIMin(myTetaIMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTetaIMin(final double myTetaIMin) {
		updateTetaIMin(myTetaIMin, null);
	}

	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = new SimpleObjectProperty<java.util.Date>(sampleCriteria.getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					sampleCriteria.setUpdateDateMax(arg2);
				}
			});
			//Start of user code updateDateMaxproperty method
			//End of user code
		}
		return updateDateMaxProperty;
	}
	
	public java.util.Date getUpdateDateMax(){
		return updateDateMaxProperty().get();
	} 
	
	public void setUpdateDateMax(java.util.Date myUpdateDateMax){
		if (updateDateMaxProperty == null) {
				sampleCriteria.setUpdateDateMax(myUpdateDateMax);
			} else {
				this.updateDateMaxProperty().set(myUpdateDateMax);
			}
	}
	
	public void updateUpdateDateMax(final java.util.Date myUpdateDateMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDateMax(myUpdateDateMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDateMax(myUpdateDateMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateUpdateDateMax(final java.util.Date myUpdateDateMax) {
		updateUpdateDateMax(myUpdateDateMax, null);
	}

	public ObjectProperty<java.util.Date> updateDateMinProperty() {
		if (updateDateMinProperty == null) {
			updateDateMinProperty = new SimpleObjectProperty<java.util.Date>(sampleCriteria.getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					sampleCriteria.setUpdateDateMin(arg2);
				}
			});
			//Start of user code updateDateMinproperty method
			//End of user code
		}
		return updateDateMinProperty;
	}
	
	public java.util.Date getUpdateDateMin(){
		return updateDateMinProperty().get();
	} 
	
	public void setUpdateDateMin(java.util.Date myUpdateDateMin){
		if (updateDateMinProperty == null) {
				sampleCriteria.setUpdateDateMin(myUpdateDateMin);
			} else {
				this.updateDateMinProperty().set(myUpdateDateMin);
			}
	}
	
	public void updateUpdateDateMin(final java.util.Date myUpdateDateMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDateMin(myUpdateDateMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDateMin(myUpdateDateMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateUpdateDateMin(final java.util.Date myUpdateDateMin) {
		updateUpdateDateMin(myUpdateDateMin, null);
	}

	public IntegerProperty versionProperty(){
		if (this.versionProperty == null) {
			this.versionProperty = new SimpleIntegerProperty(sampleCriteria.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setVersion((Integer) arg2);
				}
			});
			//Start of user code versionproperty method
			//End of user code
		}
		return this.versionProperty;
	}
	
	public int getVersion(){
		return versionProperty().get();
	} 
	
	public void setVersion(int myVersion){
		this.versionProperty().set(myVersion);
	}
	
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
	
	public void updateVersion(final int myVersion) {
		updateVersion(myVersion, null);
	}

	public DoubleProperty windMeasureMaxProperty(){
		if (this.windMeasureMaxProperty == null) {
			this.windMeasureMaxProperty = new SimpleDoubleProperty(sampleCriteria.getWindMeasureMax());
			this.windMeasureMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setWindMeasureMax((Double) arg2);
				}
			});
			//Start of user code windMeasureMaxproperty method
			//End of user code
		}
		return this.windMeasureMaxProperty;
	}
	
	public double getWindMeasureMax(){
		return windMeasureMaxProperty().get();
	} 
	
	public void setWindMeasureMax(double myWindMeasureMax){
		this.windMeasureMaxProperty().set(myWindMeasureMax);
	}
	
	public void updateWindMeasureMax(final double myWindMeasureMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setWindMeasureMax(myWindMeasureMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setWindMeasureMax(myWindMeasureMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateWindMeasureMax(final double myWindMeasureMax) {
		updateWindMeasureMax(myWindMeasureMax, null);
	}

	public DoubleProperty windMeasureMinProperty(){
		if (this.windMeasureMinProperty == null) {
			this.windMeasureMinProperty = new SimpleDoubleProperty(sampleCriteria.getWindMeasureMin());
			this.windMeasureMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sampleCriteria.setWindMeasureMin((Double) arg2);
				}
			});
			//Start of user code windMeasureMinproperty method
			//End of user code
		}
		return this.windMeasureMinProperty;
	}
	
	public double getWindMeasureMin(){
		return windMeasureMinProperty().get();
	} 
	
	public void setWindMeasureMin(double myWindMeasureMin){
		this.windMeasureMinProperty().set(myWindMeasureMin);
	}
	
	public void updateWindMeasureMin(final double myWindMeasureMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setWindMeasureMin(myWindMeasureMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setWindMeasureMin(myWindMeasureMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateWindMeasureMin(final double myWindMeasureMin) {
		updateWindMeasureMin(myWindMeasureMin, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
