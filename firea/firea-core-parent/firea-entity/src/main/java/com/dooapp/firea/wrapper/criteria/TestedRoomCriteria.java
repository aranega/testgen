package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.TestedRoomCriteriaInstance;

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
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
//Start of user code for imports
// TODO: import me!
//End of user code




public class TestedRoomCriteria implements com.dooapp.lib.common.entity.Wrapper 
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<java.util.Date> commissioningDateMaxProperty;
	
	private ObjectProperty<java.util.Date> commissioningDateMinProperty;
	
	private IntegerProperty altitudeMaxProperty;
	
	private IntegerProperty altitudeMinProperty;
	
	private IntegerProperty choosenProtectedHeightMaxProperty;
	
	private IntegerProperty choosenProtectedHeightMinProperty;
	
	private BooleanProperty clapetsCFProperty;
	
	private BooleanProperty climDuctProperty;
	
	private BooleanProperty climReclycleProperty;
	
	private BooleanProperty climReclycleAutoProperty;
	
	private BooleanProperty climVMCProperty;
	
	private BooleanProperty climVMCAutoProperty;
	
	private BooleanProperty climWithNewAirProperty;
	
	private BooleanProperty climWithNewAirAutoProperty;
	
	private ObjectProperty<java.util.Date> creationDateMaxProperty;
	
	private ObjectProperty<java.util.Date> creationDateMinProperty;
	
	private IntegerProperty droppedCeilingMaxProperty;
	
	private IntegerProperty droppedCeilingMinProperty;
	
	private IntegerProperty droppedFloorMaxProperty;
	
	private IntegerProperty droppedFloorMinProperty;
	
	private LongProperty idMaxProperty;
	
	private LongProperty idMinProperty;
	
	private IntegerProperty indicatedVolumeMaxProperty;
	
	private IntegerProperty indicatedVolumeMinProperty;
	
	private IntegerProperty mainHeightMaxProperty;
	
	private IntegerProperty mainHeightMinProperty;
	
	private IntegerProperty measuredVolumeMaxProperty;
	
	private IntegerProperty measuredVolumeMinProperty;
	
	private IntegerProperty mecanicalStrengthMaxProperty;
	
	private IntegerProperty mecanicalStrengthMinProperty;
	
	private IntegerProperty minimalProtectedHeightMaxProperty;
	
	private IntegerProperty minimalProtectedHeightMinProperty;
	
	private StringProperty nameProperty;
	
	private IntegerProperty netVolumeMaxProperty;
	
	private IntegerProperty netVolumeMinProperty;
	
	private IntegerProperty risqueHeightMaxProperty;
	
	private IntegerProperty risqueHeightMinProperty;
	
	private DoubleProperty risqueHeightPercentMaxProperty;
	
	private DoubleProperty risqueHeightPercentMinProperty;
	
	private IntegerProperty totalHeightMaxProperty;
	
	private IntegerProperty totalHeightMinProperty;
	
	private BooleanProperty uniformHorizontalityProperty;
	
	private IntegerProperty unloadTimeMaxProperty;
	
	private IntegerProperty unloadTimeMinProperty;
	
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	
	private ObjectProperty<java.util.Date> updateDateMinProperty;
	
	private IntegerProperty versionProperty;
	
	private IntegerProperty volumeCorrectionMaxProperty;
	
	private IntegerProperty volumeCorrectionMinProperty;

	/**
	 * Handled Criteria
	 */
	private TestedRoomCriteriaInstance testedRoomCriteria;

	/*
	 * Constructors 
	 */
	public TestedRoomCriteria(){
		this(new TestedRoomCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	public TestedRoomCriteria(TestedRoomCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.testedRoomCriteria = entity;
		//Start of user code constructor with parameters
		//End of user code
	}
	
	public TestedRoomCriteriaInstance getTestedRoomCriteriaInstance(){
		return this.testedRoomCriteria;
	}
	
	
	public TestedRoomCriteriaInstance getBean() {
		return  this.testedRoomCriteria;
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

	public ObjectProperty<java.util.Date> commissioningDateMaxProperty() {
		if (commissioningDateMaxProperty == null) {
			commissioningDateMaxProperty = new SimpleObjectProperty<java.util.Date>(testedRoomCriteria.getCommissioningDateMax());
			commissioningDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoomCriteria.setCommissioningDateMax(arg2);
				}
			});
			//Start of user code CommissioningDateMaxproperty method
			//End of user code
		}
		return commissioningDateMaxProperty;
	}
	
	public java.util.Date getCommissioningDateMax(){
		return commissioningDateMaxProperty().get();
	} 
	
	public void setCommissioningDateMax(java.util.Date myCommissioningDateMax){
		if (commissioningDateMaxProperty == null) {
				testedRoomCriteria.setCommissioningDateMax(myCommissioningDateMax);
			} else {
				this.commissioningDateMaxProperty().set(myCommissioningDateMax);
			}
	}
	
	public void updateCommissioningDateMax(final java.util.Date myCommissioningDateMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCommissioningDateMax(myCommissioningDateMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCommissioningDateMax(myCommissioningDateMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCommissioningDateMax(final java.util.Date myCommissioningDateMax) {
		updateCommissioningDateMax(myCommissioningDateMax, null);
	}

	public ObjectProperty<java.util.Date> commissioningDateMinProperty() {
		if (commissioningDateMinProperty == null) {
			commissioningDateMinProperty = new SimpleObjectProperty<java.util.Date>(testedRoomCriteria.getCommissioningDateMin());
			commissioningDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoomCriteria.setCommissioningDateMin(arg2);
				}
			});
			//Start of user code CommissioningDateMinproperty method
			//End of user code
		}
		return commissioningDateMinProperty;
	}
	
	public java.util.Date getCommissioningDateMin(){
		return commissioningDateMinProperty().get();
	} 
	
	public void setCommissioningDateMin(java.util.Date myCommissioningDateMin){
		if (commissioningDateMinProperty == null) {
				testedRoomCriteria.setCommissioningDateMin(myCommissioningDateMin);
			} else {
				this.commissioningDateMinProperty().set(myCommissioningDateMin);
			}
	}
	
	public void updateCommissioningDateMin(final java.util.Date myCommissioningDateMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCommissioningDateMin(myCommissioningDateMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCommissioningDateMin(myCommissioningDateMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCommissioningDateMin(final java.util.Date myCommissioningDateMin) {
		updateCommissioningDateMin(myCommissioningDateMin, null);
	}

	public IntegerProperty altitudeMaxProperty(){
		if (this.altitudeMaxProperty == null) {
			this.altitudeMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getAltitudeMax());
			this.altitudeMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setAltitudeMax((Integer) arg2);
				}
			});
			//Start of user code altitudeMaxproperty method
			//End of user code
		}
		return this.altitudeMaxProperty;
	}
	
	public int getAltitudeMax(){
		return altitudeMaxProperty().get();
	} 
	
	public void setAltitudeMax(int myAltitudeMax){
		this.altitudeMaxProperty().set(myAltitudeMax);
	}
	
	public void updateAltitudeMax(final int myAltitudeMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAltitudeMax(myAltitudeMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAltitudeMax(myAltitudeMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateAltitudeMax(final int myAltitudeMax) {
		updateAltitudeMax(myAltitudeMax, null);
	}

	public IntegerProperty altitudeMinProperty(){
		if (this.altitudeMinProperty == null) {
			this.altitudeMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getAltitudeMin());
			this.altitudeMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setAltitudeMin((Integer) arg2);
				}
			});
			//Start of user code altitudeMinproperty method
			//End of user code
		}
		return this.altitudeMinProperty;
	}
	
	public int getAltitudeMin(){
		return altitudeMinProperty().get();
	} 
	
	public void setAltitudeMin(int myAltitudeMin){
		this.altitudeMinProperty().set(myAltitudeMin);
	}
	
	public void updateAltitudeMin(final int myAltitudeMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAltitudeMin(myAltitudeMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAltitudeMin(myAltitudeMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateAltitudeMin(final int myAltitudeMin) {
		updateAltitudeMin(myAltitudeMin, null);
	}

	public IntegerProperty choosenProtectedHeightMaxProperty(){
		if (this.choosenProtectedHeightMaxProperty == null) {
			this.choosenProtectedHeightMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getChoosenProtectedHeightMax());
			this.choosenProtectedHeightMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setChoosenProtectedHeightMax((Integer) arg2);
				}
			});
			//Start of user code choosenProtectedHeightMaxproperty method
			//End of user code
		}
		return this.choosenProtectedHeightMaxProperty;
	}
	
	public int getChoosenProtectedHeightMax(){
		return choosenProtectedHeightMaxProperty().get();
	} 
	
	public void setChoosenProtectedHeightMax(int myChoosenProtectedHeightMax){
		this.choosenProtectedHeightMaxProperty().set(myChoosenProtectedHeightMax);
	}
	
	public void updateChoosenProtectedHeightMax(final int myChoosenProtectedHeightMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setChoosenProtectedHeightMax(myChoosenProtectedHeightMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setChoosenProtectedHeightMax(myChoosenProtectedHeightMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateChoosenProtectedHeightMax(final int myChoosenProtectedHeightMax) {
		updateChoosenProtectedHeightMax(myChoosenProtectedHeightMax, null);
	}

	public IntegerProperty choosenProtectedHeightMinProperty(){
		if (this.choosenProtectedHeightMinProperty == null) {
			this.choosenProtectedHeightMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getChoosenProtectedHeightMin());
			this.choosenProtectedHeightMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setChoosenProtectedHeightMin((Integer) arg2);
				}
			});
			//Start of user code choosenProtectedHeightMinproperty method
			//End of user code
		}
		return this.choosenProtectedHeightMinProperty;
	}
	
	public int getChoosenProtectedHeightMin(){
		return choosenProtectedHeightMinProperty().get();
	} 
	
	public void setChoosenProtectedHeightMin(int myChoosenProtectedHeightMin){
		this.choosenProtectedHeightMinProperty().set(myChoosenProtectedHeightMin);
	}
	
	public void updateChoosenProtectedHeightMin(final int myChoosenProtectedHeightMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setChoosenProtectedHeightMin(myChoosenProtectedHeightMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setChoosenProtectedHeightMin(myChoosenProtectedHeightMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateChoosenProtectedHeightMin(final int myChoosenProtectedHeightMin) {
		updateChoosenProtectedHeightMin(myChoosenProtectedHeightMin, null);
	}

	public BooleanProperty clapetsCFProperty(){
		if (this.clapetsCFProperty == null) {
			this.clapetsCFProperty = new SimpleBooleanProperty(testedRoomCriteria.isClapetsCF());
			this.clapetsCFProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClapetsCF((Boolean) arg2);
				}
			});
			//Start of user code clapetsCFproperty method
			//End of user code
		}
		return this.clapetsCFProperty;
	}
	
	public boolean isClapetsCF(){
		return clapetsCFProperty().get();
	} 
	
	public void setClapetsCF(boolean myClapetsCF){
		this.clapetsCFProperty().set(myClapetsCF);
	}
	
	public void updateClapetsCF(final boolean myClapetsCF, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClapetsCF(myClapetsCF);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClapetsCF(myClapetsCF);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateClapetsCF(final boolean myClapetsCF) {
		updateClapetsCF(myClapetsCF, null);
	}

	public BooleanProperty climDuctProperty(){
		if (this.climDuctProperty == null) {
			this.climDuctProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimDuct());
			this.climDuctProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimDuct((Boolean) arg2);
				}
			});
			//Start of user code climDuctproperty method
			//End of user code
		}
		return this.climDuctProperty;
	}
	
	public boolean isClimDuct(){
		return climDuctProperty().get();
	} 
	
	public void setClimDuct(boolean myClimDuct){
		this.climDuctProperty().set(myClimDuct);
	}
	
	public void updateClimDuct(final boolean myClimDuct, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimDuct(myClimDuct);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimDuct(myClimDuct);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateClimDuct(final boolean myClimDuct) {
		updateClimDuct(myClimDuct, null);
	}

	public BooleanProperty climReclycleProperty(){
		if (this.climReclycleProperty == null) {
			this.climReclycleProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimReclycle());
			this.climReclycleProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimReclycle((Boolean) arg2);
				}
			});
			//Start of user code climReclycleproperty method
			//End of user code
		}
		return this.climReclycleProperty;
	}
	
	public boolean isClimReclycle(){
		return climReclycleProperty().get();
	} 
	
	public void setClimReclycle(boolean myClimReclycle){
		this.climReclycleProperty().set(myClimReclycle);
	}
	
	public void updateClimReclycle(final boolean myClimReclycle, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimReclycle(myClimReclycle);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimReclycle(myClimReclycle);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateClimReclycle(final boolean myClimReclycle) {
		updateClimReclycle(myClimReclycle, null);
	}

	public BooleanProperty climReclycleAutoProperty(){
		if (this.climReclycleAutoProperty == null) {
			this.climReclycleAutoProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimReclycleAuto());
			this.climReclycleAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimReclycleAuto((Boolean) arg2);
				}
			});
			//Start of user code climReclycleAutoproperty method
			//End of user code
		}
		return this.climReclycleAutoProperty;
	}
	
	public boolean isClimReclycleAuto(){
		return climReclycleAutoProperty().get();
	} 
	
	public void setClimReclycleAuto(boolean myClimReclycleAuto){
		this.climReclycleAutoProperty().set(myClimReclycleAuto);
	}
	
	public void updateClimReclycleAuto(final boolean myClimReclycleAuto, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimReclycleAuto(myClimReclycleAuto);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimReclycleAuto(myClimReclycleAuto);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateClimReclycleAuto(final boolean myClimReclycleAuto) {
		updateClimReclycleAuto(myClimReclycleAuto, null);
	}

	public BooleanProperty climVMCProperty(){
		if (this.climVMCProperty == null) {
			this.climVMCProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimVMC());
			this.climVMCProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimVMC((Boolean) arg2);
				}
			});
			//Start of user code climVMCproperty method
			//End of user code
		}
		return this.climVMCProperty;
	}
	
	public boolean isClimVMC(){
		return climVMCProperty().get();
	} 
	
	public void setClimVMC(boolean myClimVMC){
		this.climVMCProperty().set(myClimVMC);
	}
	
	public void updateClimVMC(final boolean myClimVMC, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimVMC(myClimVMC);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimVMC(myClimVMC);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateClimVMC(final boolean myClimVMC) {
		updateClimVMC(myClimVMC, null);
	}

	public BooleanProperty climVMCAutoProperty(){
		if (this.climVMCAutoProperty == null) {
			this.climVMCAutoProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimVMCAuto());
			this.climVMCAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimVMCAuto((Boolean) arg2);
				}
			});
			//Start of user code climVMCAutoproperty method
			//End of user code
		}
		return this.climVMCAutoProperty;
	}
	
	public boolean isClimVMCAuto(){
		return climVMCAutoProperty().get();
	} 
	
	public void setClimVMCAuto(boolean myClimVMCAuto){
		this.climVMCAutoProperty().set(myClimVMCAuto);
	}
	
	public void updateClimVMCAuto(final boolean myClimVMCAuto, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimVMCAuto(myClimVMCAuto);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimVMCAuto(myClimVMCAuto);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateClimVMCAuto(final boolean myClimVMCAuto) {
		updateClimVMCAuto(myClimVMCAuto, null);
	}

	public BooleanProperty climWithNewAirProperty(){
		if (this.climWithNewAirProperty == null) {
			this.climWithNewAirProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimWithNewAir());
			this.climWithNewAirProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimWithNewAir((Boolean) arg2);
				}
			});
			//Start of user code climWithNewAirproperty method
			//End of user code
		}
		return this.climWithNewAirProperty;
	}
	
	public boolean isClimWithNewAir(){
		return climWithNewAirProperty().get();
	} 
	
	public void setClimWithNewAir(boolean myClimWithNewAir){
		this.climWithNewAirProperty().set(myClimWithNewAir);
	}
	
	public void updateClimWithNewAir(final boolean myClimWithNewAir, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimWithNewAir(myClimWithNewAir);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimWithNewAir(myClimWithNewAir);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateClimWithNewAir(final boolean myClimWithNewAir) {
		updateClimWithNewAir(myClimWithNewAir, null);
	}

	public BooleanProperty climWithNewAirAutoProperty(){
		if (this.climWithNewAirAutoProperty == null) {
			this.climWithNewAirAutoProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimWithNewAirAuto());
			this.climWithNewAirAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimWithNewAirAuto((Boolean) arg2);
				}
			});
			//Start of user code climWithNewAirAutoproperty method
			//End of user code
		}
		return this.climWithNewAirAutoProperty;
	}
	
	public boolean isClimWithNewAirAuto(){
		return climWithNewAirAutoProperty().get();
	} 
	
	public void setClimWithNewAirAuto(boolean myClimWithNewAirAuto){
		this.climWithNewAirAutoProperty().set(myClimWithNewAirAuto);
	}
	
	public void updateClimWithNewAirAuto(final boolean myClimWithNewAirAuto, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimWithNewAirAuto(myClimWithNewAirAuto);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimWithNewAirAuto(myClimWithNewAirAuto);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateClimWithNewAirAuto(final boolean myClimWithNewAirAuto) {
		updateClimWithNewAirAuto(myClimWithNewAirAuto, null);
	}

	public ObjectProperty<java.util.Date> creationDateMaxProperty() {
		if (creationDateMaxProperty == null) {
			creationDateMaxProperty = new SimpleObjectProperty<java.util.Date>(testedRoomCriteria.getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoomCriteria.setCreationDateMax(arg2);
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
				testedRoomCriteria.setCreationDateMax(myCreationDateMax);
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
			creationDateMinProperty = new SimpleObjectProperty<java.util.Date>(testedRoomCriteria.getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoomCriteria.setCreationDateMin(arg2);
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
				testedRoomCriteria.setCreationDateMin(myCreationDateMin);
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

	public IntegerProperty droppedCeilingMaxProperty(){
		if (this.droppedCeilingMaxProperty == null) {
			this.droppedCeilingMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getDroppedCeilingMax());
			this.droppedCeilingMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setDroppedCeilingMax((Integer) arg2);
				}
			});
			//Start of user code droppedCeilingMaxproperty method
			//End of user code
		}
		return this.droppedCeilingMaxProperty;
	}
	
	public int getDroppedCeilingMax(){
		return droppedCeilingMaxProperty().get();
	} 
	
	public void setDroppedCeilingMax(int myDroppedCeilingMax){
		this.droppedCeilingMaxProperty().set(myDroppedCeilingMax);
	}
	
	public void updateDroppedCeilingMax(final int myDroppedCeilingMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedCeilingMax(myDroppedCeilingMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedCeilingMax(myDroppedCeilingMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDroppedCeilingMax(final int myDroppedCeilingMax) {
		updateDroppedCeilingMax(myDroppedCeilingMax, null);
	}

	public IntegerProperty droppedCeilingMinProperty(){
		if (this.droppedCeilingMinProperty == null) {
			this.droppedCeilingMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getDroppedCeilingMin());
			this.droppedCeilingMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setDroppedCeilingMin((Integer) arg2);
				}
			});
			//Start of user code droppedCeilingMinproperty method
			//End of user code
		}
		return this.droppedCeilingMinProperty;
	}
	
	public int getDroppedCeilingMin(){
		return droppedCeilingMinProperty().get();
	} 
	
	public void setDroppedCeilingMin(int myDroppedCeilingMin){
		this.droppedCeilingMinProperty().set(myDroppedCeilingMin);
	}
	
	public void updateDroppedCeilingMin(final int myDroppedCeilingMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedCeilingMin(myDroppedCeilingMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedCeilingMin(myDroppedCeilingMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDroppedCeilingMin(final int myDroppedCeilingMin) {
		updateDroppedCeilingMin(myDroppedCeilingMin, null);
	}

	public IntegerProperty droppedFloorMaxProperty(){
		if (this.droppedFloorMaxProperty == null) {
			this.droppedFloorMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getDroppedFloorMax());
			this.droppedFloorMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setDroppedFloorMax((Integer) arg2);
				}
			});
			//Start of user code droppedFloorMaxproperty method
			//End of user code
		}
		return this.droppedFloorMaxProperty;
	}
	
	public int getDroppedFloorMax(){
		return droppedFloorMaxProperty().get();
	} 
	
	public void setDroppedFloorMax(int myDroppedFloorMax){
		this.droppedFloorMaxProperty().set(myDroppedFloorMax);
	}
	
	public void updateDroppedFloorMax(final int myDroppedFloorMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedFloorMax(myDroppedFloorMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedFloorMax(myDroppedFloorMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDroppedFloorMax(final int myDroppedFloorMax) {
		updateDroppedFloorMax(myDroppedFloorMax, null);
	}

	public IntegerProperty droppedFloorMinProperty(){
		if (this.droppedFloorMinProperty == null) {
			this.droppedFloorMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getDroppedFloorMin());
			this.droppedFloorMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setDroppedFloorMin((Integer) arg2);
				}
			});
			//Start of user code droppedFloorMinproperty method
			//End of user code
		}
		return this.droppedFloorMinProperty;
	}
	
	public int getDroppedFloorMin(){
		return droppedFloorMinProperty().get();
	} 
	
	public void setDroppedFloorMin(int myDroppedFloorMin){
		this.droppedFloorMinProperty().set(myDroppedFloorMin);
	}
	
	public void updateDroppedFloorMin(final int myDroppedFloorMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedFloorMin(myDroppedFloorMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedFloorMin(myDroppedFloorMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDroppedFloorMin(final int myDroppedFloorMin) {
		updateDroppedFloorMin(myDroppedFloorMin, null);
	}

	public LongProperty idMaxProperty(){
		if (this.idMaxProperty == null) {
			this.idMaxProperty = new SimpleLongProperty(testedRoomCriteria.getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setIdMax((Long) arg2);
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
			this.idMinProperty = new SimpleLongProperty(testedRoomCriteria.getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setIdMin((Long) arg2);
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

	public IntegerProperty indicatedVolumeMaxProperty(){
		if (this.indicatedVolumeMaxProperty == null) {
			this.indicatedVolumeMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getIndicatedVolumeMax());
			this.indicatedVolumeMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setIndicatedVolumeMax((Integer) arg2);
				}
			});
			//Start of user code indicatedVolumeMaxproperty method
			//End of user code
		}
		return this.indicatedVolumeMaxProperty;
	}
	
	public int getIndicatedVolumeMax(){
		return indicatedVolumeMaxProperty().get();
	} 
	
	public void setIndicatedVolumeMax(int myIndicatedVolumeMax){
		this.indicatedVolumeMaxProperty().set(myIndicatedVolumeMax);
	}
	
	public void updateIndicatedVolumeMax(final int myIndicatedVolumeMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIndicatedVolumeMax(myIndicatedVolumeMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIndicatedVolumeMax(myIndicatedVolumeMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateIndicatedVolumeMax(final int myIndicatedVolumeMax) {
		updateIndicatedVolumeMax(myIndicatedVolumeMax, null);
	}

	public IntegerProperty indicatedVolumeMinProperty(){
		if (this.indicatedVolumeMinProperty == null) {
			this.indicatedVolumeMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getIndicatedVolumeMin());
			this.indicatedVolumeMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setIndicatedVolumeMin((Integer) arg2);
				}
			});
			//Start of user code indicatedVolumeMinproperty method
			//End of user code
		}
		return this.indicatedVolumeMinProperty;
	}
	
	public int getIndicatedVolumeMin(){
		return indicatedVolumeMinProperty().get();
	} 
	
	public void setIndicatedVolumeMin(int myIndicatedVolumeMin){
		this.indicatedVolumeMinProperty().set(myIndicatedVolumeMin);
	}
	
	public void updateIndicatedVolumeMin(final int myIndicatedVolumeMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIndicatedVolumeMin(myIndicatedVolumeMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIndicatedVolumeMin(myIndicatedVolumeMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateIndicatedVolumeMin(final int myIndicatedVolumeMin) {
		updateIndicatedVolumeMin(myIndicatedVolumeMin, null);
	}

	public IntegerProperty mainHeightMaxProperty(){
		if (this.mainHeightMaxProperty == null) {
			this.mainHeightMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getMainHeightMax());
			this.mainHeightMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMainHeightMax((Integer) arg2);
				}
			});
			//Start of user code mainHeightMaxproperty method
			//End of user code
		}
		return this.mainHeightMaxProperty;
	}
	
	public int getMainHeightMax(){
		return mainHeightMaxProperty().get();
	} 
	
	public void setMainHeightMax(int myMainHeightMax){
		this.mainHeightMaxProperty().set(myMainHeightMax);
	}
	
	public void updateMainHeightMax(final int myMainHeightMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMainHeightMax(myMainHeightMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMainHeightMax(myMainHeightMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateMainHeightMax(final int myMainHeightMax) {
		updateMainHeightMax(myMainHeightMax, null);
	}

	public IntegerProperty mainHeightMinProperty(){
		if (this.mainHeightMinProperty == null) {
			this.mainHeightMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getMainHeightMin());
			this.mainHeightMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMainHeightMin((Integer) arg2);
				}
			});
			//Start of user code mainHeightMinproperty method
			//End of user code
		}
		return this.mainHeightMinProperty;
	}
	
	public int getMainHeightMin(){
		return mainHeightMinProperty().get();
	} 
	
	public void setMainHeightMin(int myMainHeightMin){
		this.mainHeightMinProperty().set(myMainHeightMin);
	}
	
	public void updateMainHeightMin(final int myMainHeightMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMainHeightMin(myMainHeightMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMainHeightMin(myMainHeightMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateMainHeightMin(final int myMainHeightMin) {
		updateMainHeightMin(myMainHeightMin, null);
	}

	public IntegerProperty measuredVolumeMaxProperty(){
		if (this.measuredVolumeMaxProperty == null) {
			this.measuredVolumeMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getMeasuredVolumeMax());
			this.measuredVolumeMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMeasuredVolumeMax((Integer) arg2);
				}
			});
			//Start of user code measuredVolumeMaxproperty method
			//End of user code
		}
		return this.measuredVolumeMaxProperty;
	}
	
	public int getMeasuredVolumeMax(){
		return measuredVolumeMaxProperty().get();
	} 
	
	public void setMeasuredVolumeMax(int myMeasuredVolumeMax){
		this.measuredVolumeMaxProperty().set(myMeasuredVolumeMax);
	}
	
	public void updateMeasuredVolumeMax(final int myMeasuredVolumeMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMeasuredVolumeMax(myMeasuredVolumeMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMeasuredVolumeMax(myMeasuredVolumeMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateMeasuredVolumeMax(final int myMeasuredVolumeMax) {
		updateMeasuredVolumeMax(myMeasuredVolumeMax, null);
	}

	public IntegerProperty measuredVolumeMinProperty(){
		if (this.measuredVolumeMinProperty == null) {
			this.measuredVolumeMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getMeasuredVolumeMin());
			this.measuredVolumeMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMeasuredVolumeMin((Integer) arg2);
				}
			});
			//Start of user code measuredVolumeMinproperty method
			//End of user code
		}
		return this.measuredVolumeMinProperty;
	}
	
	public int getMeasuredVolumeMin(){
		return measuredVolumeMinProperty().get();
	} 
	
	public void setMeasuredVolumeMin(int myMeasuredVolumeMin){
		this.measuredVolumeMinProperty().set(myMeasuredVolumeMin);
	}
	
	public void updateMeasuredVolumeMin(final int myMeasuredVolumeMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMeasuredVolumeMin(myMeasuredVolumeMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMeasuredVolumeMin(myMeasuredVolumeMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateMeasuredVolumeMin(final int myMeasuredVolumeMin) {
		updateMeasuredVolumeMin(myMeasuredVolumeMin, null);
	}

	public IntegerProperty mecanicalStrengthMaxProperty(){
		if (this.mecanicalStrengthMaxProperty == null) {
			this.mecanicalStrengthMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getMecanicalStrengthMax());
			this.mecanicalStrengthMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMecanicalStrengthMax((Integer) arg2);
				}
			});
			//Start of user code mecanicalStrengthMaxproperty method
			//End of user code
		}
		return this.mecanicalStrengthMaxProperty;
	}
	
	public int getMecanicalStrengthMax(){
		return mecanicalStrengthMaxProperty().get();
	} 
	
	public void setMecanicalStrengthMax(int myMecanicalStrengthMax){
		this.mecanicalStrengthMaxProperty().set(myMecanicalStrengthMax);
	}
	
	public void updateMecanicalStrengthMax(final int myMecanicalStrengthMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMecanicalStrengthMax(myMecanicalStrengthMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMecanicalStrengthMax(myMecanicalStrengthMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateMecanicalStrengthMax(final int myMecanicalStrengthMax) {
		updateMecanicalStrengthMax(myMecanicalStrengthMax, null);
	}

	public IntegerProperty mecanicalStrengthMinProperty(){
		if (this.mecanicalStrengthMinProperty == null) {
			this.mecanicalStrengthMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getMecanicalStrengthMin());
			this.mecanicalStrengthMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMecanicalStrengthMin((Integer) arg2);
				}
			});
			//Start of user code mecanicalStrengthMinproperty method
			//End of user code
		}
		return this.mecanicalStrengthMinProperty;
	}
	
	public int getMecanicalStrengthMin(){
		return mecanicalStrengthMinProperty().get();
	} 
	
	public void setMecanicalStrengthMin(int myMecanicalStrengthMin){
		this.mecanicalStrengthMinProperty().set(myMecanicalStrengthMin);
	}
	
	public void updateMecanicalStrengthMin(final int myMecanicalStrengthMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMecanicalStrengthMin(myMecanicalStrengthMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMecanicalStrengthMin(myMecanicalStrengthMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateMecanicalStrengthMin(final int myMecanicalStrengthMin) {
		updateMecanicalStrengthMin(myMecanicalStrengthMin, null);
	}

	public IntegerProperty minimalProtectedHeightMaxProperty(){
		if (this.minimalProtectedHeightMaxProperty == null) {
			this.minimalProtectedHeightMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getMinimalProtectedHeightMax());
			this.minimalProtectedHeightMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMinimalProtectedHeightMax((Integer) arg2);
				}
			});
			//Start of user code minimalProtectedHeightMaxproperty method
			//End of user code
		}
		return this.minimalProtectedHeightMaxProperty;
	}
	
	public int getMinimalProtectedHeightMax(){
		return minimalProtectedHeightMaxProperty().get();
	} 
	
	public void setMinimalProtectedHeightMax(int myMinimalProtectedHeightMax){
		this.minimalProtectedHeightMaxProperty().set(myMinimalProtectedHeightMax);
	}
	
	public void updateMinimalProtectedHeightMax(final int myMinimalProtectedHeightMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMinimalProtectedHeightMax(myMinimalProtectedHeightMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMinimalProtectedHeightMax(myMinimalProtectedHeightMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateMinimalProtectedHeightMax(final int myMinimalProtectedHeightMax) {
		updateMinimalProtectedHeightMax(myMinimalProtectedHeightMax, null);
	}

	public IntegerProperty minimalProtectedHeightMinProperty(){
		if (this.minimalProtectedHeightMinProperty == null) {
			this.minimalProtectedHeightMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getMinimalProtectedHeightMin());
			this.minimalProtectedHeightMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMinimalProtectedHeightMin((Integer) arg2);
				}
			});
			//Start of user code minimalProtectedHeightMinproperty method
			//End of user code
		}
		return this.minimalProtectedHeightMinProperty;
	}
	
	public int getMinimalProtectedHeightMin(){
		return minimalProtectedHeightMinProperty().get();
	} 
	
	public void setMinimalProtectedHeightMin(int myMinimalProtectedHeightMin){
		this.minimalProtectedHeightMinProperty().set(myMinimalProtectedHeightMin);
	}
	
	public void updateMinimalProtectedHeightMin(final int myMinimalProtectedHeightMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMinimalProtectedHeightMin(myMinimalProtectedHeightMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMinimalProtectedHeightMin(myMinimalProtectedHeightMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateMinimalProtectedHeightMin(final int myMinimalProtectedHeightMin) {
		updateMinimalProtectedHeightMin(myMinimalProtectedHeightMin, null);
	}

	public StringProperty nameProperty(){
		if (this.nameProperty == null) {
			this.nameProperty = new SimpleStringProperty(testedRoomCriteria.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					testedRoomCriteria.setName((String) arg2);
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

	public IntegerProperty netVolumeMaxProperty(){
		if (this.netVolumeMaxProperty == null) {
			this.netVolumeMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getNetVolumeMax());
			this.netVolumeMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setNetVolumeMax((Integer) arg2);
				}
			});
			//Start of user code netVolumeMaxproperty method
			//End of user code
		}
		return this.netVolumeMaxProperty;
	}
	
	public int getNetVolumeMax(){
		return netVolumeMaxProperty().get();
	} 
	
	public void setNetVolumeMax(int myNetVolumeMax){
		this.netVolumeMaxProperty().set(myNetVolumeMax);
	}
	
	public void updateNetVolumeMax(final int myNetVolumeMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNetVolumeMax(myNetVolumeMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNetVolumeMax(myNetVolumeMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateNetVolumeMax(final int myNetVolumeMax) {
		updateNetVolumeMax(myNetVolumeMax, null);
	}

	public IntegerProperty netVolumeMinProperty(){
		if (this.netVolumeMinProperty == null) {
			this.netVolumeMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getNetVolumeMin());
			this.netVolumeMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setNetVolumeMin((Integer) arg2);
				}
			});
			//Start of user code netVolumeMinproperty method
			//End of user code
		}
		return this.netVolumeMinProperty;
	}
	
	public int getNetVolumeMin(){
		return netVolumeMinProperty().get();
	} 
	
	public void setNetVolumeMin(int myNetVolumeMin){
		this.netVolumeMinProperty().set(myNetVolumeMin);
	}
	
	public void updateNetVolumeMin(final int myNetVolumeMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNetVolumeMin(myNetVolumeMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNetVolumeMin(myNetVolumeMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateNetVolumeMin(final int myNetVolumeMin) {
		updateNetVolumeMin(myNetVolumeMin, null);
	}

	public IntegerProperty risqueHeightMaxProperty(){
		if (this.risqueHeightMaxProperty == null) {
			this.risqueHeightMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getRisqueHeightMax());
			this.risqueHeightMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setRisqueHeightMax((Integer) arg2);
				}
			});
			//Start of user code risqueHeightMaxproperty method
			//End of user code
		}
		return this.risqueHeightMaxProperty;
	}
	
	public int getRisqueHeightMax(){
		return risqueHeightMaxProperty().get();
	} 
	
	public void setRisqueHeightMax(int myRisqueHeightMax){
		this.risqueHeightMaxProperty().set(myRisqueHeightMax);
	}
	
	public void updateRisqueHeightMax(final int myRisqueHeightMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeightMax(myRisqueHeightMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeightMax(myRisqueHeightMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRisqueHeightMax(final int myRisqueHeightMax) {
		updateRisqueHeightMax(myRisqueHeightMax, null);
	}

	public IntegerProperty risqueHeightMinProperty(){
		if (this.risqueHeightMinProperty == null) {
			this.risqueHeightMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getRisqueHeightMin());
			this.risqueHeightMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setRisqueHeightMin((Integer) arg2);
				}
			});
			//Start of user code risqueHeightMinproperty method
			//End of user code
		}
		return this.risqueHeightMinProperty;
	}
	
	public int getRisqueHeightMin(){
		return risqueHeightMinProperty().get();
	} 
	
	public void setRisqueHeightMin(int myRisqueHeightMin){
		this.risqueHeightMinProperty().set(myRisqueHeightMin);
	}
	
	public void updateRisqueHeightMin(final int myRisqueHeightMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeightMin(myRisqueHeightMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeightMin(myRisqueHeightMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRisqueHeightMin(final int myRisqueHeightMin) {
		updateRisqueHeightMin(myRisqueHeightMin, null);
	}

	public DoubleProperty risqueHeightPercentMaxProperty(){
		if (this.risqueHeightPercentMaxProperty == null) {
			this.risqueHeightPercentMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getRisqueHeightPercentMax());
			this.risqueHeightPercentMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setRisqueHeightPercentMax((Double) arg2);
				}
			});
			//Start of user code risqueHeightPercentMaxproperty method
			//End of user code
		}
		return this.risqueHeightPercentMaxProperty;
	}
	
	public double getRisqueHeightPercentMax(){
		return risqueHeightPercentMaxProperty().get();
	} 
	
	public void setRisqueHeightPercentMax(double myRisqueHeightPercentMax){
		this.risqueHeightPercentMaxProperty().set(myRisqueHeightPercentMax);
	}
	
	public void updateRisqueHeightPercentMax(final double myRisqueHeightPercentMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeightPercentMax(myRisqueHeightPercentMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeightPercentMax(myRisqueHeightPercentMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRisqueHeightPercentMax(final double myRisqueHeightPercentMax) {
		updateRisqueHeightPercentMax(myRisqueHeightPercentMax, null);
	}

	public DoubleProperty risqueHeightPercentMinProperty(){
		if (this.risqueHeightPercentMinProperty == null) {
			this.risqueHeightPercentMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getRisqueHeightPercentMin());
			this.risqueHeightPercentMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setRisqueHeightPercentMin((Double) arg2);
				}
			});
			//Start of user code risqueHeightPercentMinproperty method
			//End of user code
		}
		return this.risqueHeightPercentMinProperty;
	}
	
	public double getRisqueHeightPercentMin(){
		return risqueHeightPercentMinProperty().get();
	} 
	
	public void setRisqueHeightPercentMin(double myRisqueHeightPercentMin){
		this.risqueHeightPercentMinProperty().set(myRisqueHeightPercentMin);
	}
	
	public void updateRisqueHeightPercentMin(final double myRisqueHeightPercentMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeightPercentMin(myRisqueHeightPercentMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeightPercentMin(myRisqueHeightPercentMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRisqueHeightPercentMin(final double myRisqueHeightPercentMin) {
		updateRisqueHeightPercentMin(myRisqueHeightPercentMin, null);
	}

	public IntegerProperty totalHeightMaxProperty(){
		if (this.totalHeightMaxProperty == null) {
			this.totalHeightMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getTotalHeightMax());
			this.totalHeightMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setTotalHeightMax((Integer) arg2);
				}
			});
			//Start of user code totalHeightMaxproperty method
			//End of user code
		}
		return this.totalHeightMaxProperty;
	}
	
	public int getTotalHeightMax(){
		return totalHeightMaxProperty().get();
	} 
	
	public void setTotalHeightMax(int myTotalHeightMax){
		this.totalHeightMaxProperty().set(myTotalHeightMax);
	}
	
	public void updateTotalHeightMax(final int myTotalHeightMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTotalHeightMax(myTotalHeightMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTotalHeightMax(myTotalHeightMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTotalHeightMax(final int myTotalHeightMax) {
		updateTotalHeightMax(myTotalHeightMax, null);
	}

	public IntegerProperty totalHeightMinProperty(){
		if (this.totalHeightMinProperty == null) {
			this.totalHeightMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getTotalHeightMin());
			this.totalHeightMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setTotalHeightMin((Integer) arg2);
				}
			});
			//Start of user code totalHeightMinproperty method
			//End of user code
		}
		return this.totalHeightMinProperty;
	}
	
	public int getTotalHeightMin(){
		return totalHeightMinProperty().get();
	} 
	
	public void setTotalHeightMin(int myTotalHeightMin){
		this.totalHeightMinProperty().set(myTotalHeightMin);
	}
	
	public void updateTotalHeightMin(final int myTotalHeightMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTotalHeightMin(myTotalHeightMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTotalHeightMin(myTotalHeightMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTotalHeightMin(final int myTotalHeightMin) {
		updateTotalHeightMin(myTotalHeightMin, null);
	}

	public BooleanProperty uniformHorizontalityProperty(){
		if (this.uniformHorizontalityProperty == null) {
			this.uniformHorizontalityProperty = new SimpleBooleanProperty(testedRoomCriteria.isUniformHorizontality());
			this.uniformHorizontalityProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setUniformHorizontality((Boolean) arg2);
				}
			});
			//Start of user code uniformHorizontalityproperty method
			//End of user code
		}
		return this.uniformHorizontalityProperty;
	}
	
	public boolean isUniformHorizontality(){
		return uniformHorizontalityProperty().get();
	} 
	
	public void setUniformHorizontality(boolean myUniformHorizontality){
		this.uniformHorizontalityProperty().set(myUniformHorizontality);
	}
	
	public void updateUniformHorizontality(final boolean myUniformHorizontality, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUniformHorizontality(myUniformHorizontality);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUniformHorizontality(myUniformHorizontality);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateUniformHorizontality(final boolean myUniformHorizontality) {
		updateUniformHorizontality(myUniformHorizontality, null);
	}

	public IntegerProperty unloadTimeMaxProperty(){
		if (this.unloadTimeMaxProperty == null) {
			this.unloadTimeMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getUnloadTimeMax());
			this.unloadTimeMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setUnloadTimeMax((Integer) arg2);
				}
			});
			//Start of user code unloadTimeMaxproperty method
			//End of user code
		}
		return this.unloadTimeMaxProperty;
	}
	
	public int getUnloadTimeMax(){
		return unloadTimeMaxProperty().get();
	} 
	
	public void setUnloadTimeMax(int myUnloadTimeMax){
		this.unloadTimeMaxProperty().set(myUnloadTimeMax);
	}
	
	public void updateUnloadTimeMax(final int myUnloadTimeMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUnloadTimeMax(myUnloadTimeMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUnloadTimeMax(myUnloadTimeMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateUnloadTimeMax(final int myUnloadTimeMax) {
		updateUnloadTimeMax(myUnloadTimeMax, null);
	}

	public IntegerProperty unloadTimeMinProperty(){
		if (this.unloadTimeMinProperty == null) {
			this.unloadTimeMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getUnloadTimeMin());
			this.unloadTimeMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setUnloadTimeMin((Integer) arg2);
				}
			});
			//Start of user code unloadTimeMinproperty method
			//End of user code
		}
		return this.unloadTimeMinProperty;
	}
	
	public int getUnloadTimeMin(){
		return unloadTimeMinProperty().get();
	} 
	
	public void setUnloadTimeMin(int myUnloadTimeMin){
		this.unloadTimeMinProperty().set(myUnloadTimeMin);
	}
	
	public void updateUnloadTimeMin(final int myUnloadTimeMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUnloadTimeMin(myUnloadTimeMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUnloadTimeMin(myUnloadTimeMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateUnloadTimeMin(final int myUnloadTimeMin) {
		updateUnloadTimeMin(myUnloadTimeMin, null);
	}

	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = new SimpleObjectProperty<java.util.Date>(testedRoomCriteria.getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoomCriteria.setUpdateDateMax(arg2);
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
				testedRoomCriteria.setUpdateDateMax(myUpdateDateMax);
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
			updateDateMinProperty = new SimpleObjectProperty<java.util.Date>(testedRoomCriteria.getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoomCriteria.setUpdateDateMin(arg2);
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
				testedRoomCriteria.setUpdateDateMin(myUpdateDateMin);
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
			this.versionProperty = new SimpleIntegerProperty(testedRoomCriteria.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setVersion((Integer) arg2);
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

	public IntegerProperty volumeCorrectionMaxProperty(){
		if (this.volumeCorrectionMaxProperty == null) {
			this.volumeCorrectionMaxProperty = new SimpleIntegerProperty(testedRoomCriteria.getVolumeCorrectionMax());
			this.volumeCorrectionMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setVolumeCorrectionMax((Integer) arg2);
				}
			});
			//Start of user code volumeCorrectionMaxproperty method
			//End of user code
		}
		return this.volumeCorrectionMaxProperty;
	}
	
	public int getVolumeCorrectionMax(){
		return volumeCorrectionMaxProperty().get();
	} 
	
	public void setVolumeCorrectionMax(int myVolumeCorrectionMax){
		this.volumeCorrectionMaxProperty().set(myVolumeCorrectionMax);
	}
	
	public void updateVolumeCorrectionMax(final int myVolumeCorrectionMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVolumeCorrectionMax(myVolumeCorrectionMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVolumeCorrectionMax(myVolumeCorrectionMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateVolumeCorrectionMax(final int myVolumeCorrectionMax) {
		updateVolumeCorrectionMax(myVolumeCorrectionMax, null);
	}

	public IntegerProperty volumeCorrectionMinProperty(){
		if (this.volumeCorrectionMinProperty == null) {
			this.volumeCorrectionMinProperty = new SimpleIntegerProperty(testedRoomCriteria.getVolumeCorrectionMin());
			this.volumeCorrectionMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setVolumeCorrectionMin((Integer) arg2);
				}
			});
			//Start of user code volumeCorrectionMinproperty method
			//End of user code
		}
		return this.volumeCorrectionMinProperty;
	}
	
	public int getVolumeCorrectionMin(){
		return volumeCorrectionMinProperty().get();
	} 
	
	public void setVolumeCorrectionMin(int myVolumeCorrectionMin){
		this.volumeCorrectionMinProperty().set(myVolumeCorrectionMin);
	}
	
	public void updateVolumeCorrectionMin(final int myVolumeCorrectionMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVolumeCorrectionMin(myVolumeCorrectionMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVolumeCorrectionMin(myVolumeCorrectionMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateVolumeCorrectionMin(final int myVolumeCorrectionMin) {
		updateVolumeCorrectionMin(myVolumeCorrectionMin, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
