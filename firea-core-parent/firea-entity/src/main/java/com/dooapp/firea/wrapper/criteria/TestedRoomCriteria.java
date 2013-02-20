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





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class TestedRoomCriteria 
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
	private IntegerProperty altitudeProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty choosenProtectedHeightMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty choosenProtectedHeightMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty clapetsCFProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climDuctProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climReclycleProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climReclycleAutoProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climVMCProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climVMCAutoProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climWithNewAirProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climWithNewAirAutoProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty commissioningDateProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<java.util.Date> creationDateMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<java.util.Date> creationDateMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty droppedCeilingMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty droppedCeilingMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty droppedFloorMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty droppedFloorMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private LongProperty idMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private LongProperty idMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty indicatedVolumeMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty indicatedVolumeMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty mainHeightMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty mainHeightMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty measuredPressureMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty measuredPressureMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty measuredTemperatureMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty measuredTemperatureMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty measuredVolumeMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty measuredVolumeMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty mecanicalStrengthProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty minimalProtectedHeightMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty minimalProtectedHeightMinProperty;
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
	private DoubleProperty netVolumeMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty netVolumeMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedPressureMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedPressureMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedTemperatureMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedTemperatureMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty risqueHeightMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty risqueHeightMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty risqueHeightPercentMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty risqueHeightPercentMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty totalHeightMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty totalHeightMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty uniformHorizontalityProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty unloadTimeMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty unloadTimeMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<java.util.Date> updateDateMinProperty;
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
	private DoubleProperty volumeCorrectionMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty volumeCorrectionMinProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private TestedRoomCriteriaInstance testedRoomCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoomCriteria(){
		this(new TestedRoomCriteriaInstance());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoomCriteriaInstance getTestedRoomCriteriaInstance(){
		return this.testedRoomCriteria;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoomCriteriaInstance getBean() {
		return  this.testedRoomCriteria;
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
	public IntegerProperty altitudeProperty(){
		if (this.altitudeProperty == null) {
			this.altitudeProperty = new SimpleIntegerProperty(testedRoomCriteria.getAltitude());
			this.altitudeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setAltitude((Integer) arg2);
				}
			});
		}
		return this.altitudeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getAltitude(){
		return altitudeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAltitude(int myAltitude){
		this.altitudeProperty().set(myAltitude);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAltitude(final int myAltitude, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAltitude(myAltitude);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAltitude(myAltitude);
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
	public void updateAltitude(final int myAltitude) {
		updateAltitude(myAltitude, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty choosenProtectedHeightMaxProperty(){
		if (this.choosenProtectedHeightMaxProperty == null) {
			this.choosenProtectedHeightMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getChoosenProtectedHeightMax());
			this.choosenProtectedHeightMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setChoosenProtectedHeightMax((Double) arg2);
				}
			});
		}
		return this.choosenProtectedHeightMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getChoosenProtectedHeightMax(){
		return choosenProtectedHeightMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChoosenProtectedHeightMax(double myChoosenProtectedHeightMax){
		this.choosenProtectedHeightMaxProperty().set(myChoosenProtectedHeightMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChoosenProtectedHeightMax(final double myChoosenProtectedHeightMax, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChoosenProtectedHeightMax(final double myChoosenProtectedHeightMax) {
		updateChoosenProtectedHeightMax(myChoosenProtectedHeightMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty choosenProtectedHeightMinProperty(){
		if (this.choosenProtectedHeightMinProperty == null) {
			this.choosenProtectedHeightMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getChoosenProtectedHeightMin());
			this.choosenProtectedHeightMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setChoosenProtectedHeightMin((Double) arg2);
				}
			});
		}
		return this.choosenProtectedHeightMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getChoosenProtectedHeightMin(){
		return choosenProtectedHeightMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChoosenProtectedHeightMin(double myChoosenProtectedHeightMin){
		this.choosenProtectedHeightMinProperty().set(myChoosenProtectedHeightMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChoosenProtectedHeightMin(final double myChoosenProtectedHeightMin, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChoosenProtectedHeightMin(final double myChoosenProtectedHeightMin) {
		updateChoosenProtectedHeightMin(myChoosenProtectedHeightMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BooleanProperty clapetsCFProperty(){
		if (this.clapetsCFProperty == null) {
			this.clapetsCFProperty = new SimpleBooleanProperty(testedRoomCriteria.isClapetsCF());
			this.clapetsCFProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClapetsCF((Boolean) arg2);
				}
			});
		}
		return this.clapetsCFProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClapetsCF(){
		return clapetsCFProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClapetsCF(boolean myClapetsCF){
		this.clapetsCFProperty().set(myClapetsCF);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClapetsCF(final boolean myClapetsCF) {
		updateClapetsCF(myClapetsCF, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BooleanProperty climDuctProperty(){
		if (this.climDuctProperty == null) {
			this.climDuctProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimDuct());
			this.climDuctProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimDuct((Boolean) arg2);
				}
			});
		}
		return this.climDuctProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimDuct(){
		return climDuctProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimDuct(boolean myClimDuct){
		this.climDuctProperty().set(myClimDuct);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimDuct(final boolean myClimDuct) {
		updateClimDuct(myClimDuct, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BooleanProperty climReclycleProperty(){
		if (this.climReclycleProperty == null) {
			this.climReclycleProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimReclycle());
			this.climReclycleProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimReclycle((Boolean) arg2);
				}
			});
		}
		return this.climReclycleProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimReclycle(){
		return climReclycleProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimReclycle(boolean myClimReclycle){
		this.climReclycleProperty().set(myClimReclycle);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimReclycle(final boolean myClimReclycle) {
		updateClimReclycle(myClimReclycle, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BooleanProperty climReclycleAutoProperty(){
		if (this.climReclycleAutoProperty == null) {
			this.climReclycleAutoProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimReclycleAuto());
			this.climReclycleAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimReclycleAuto((Boolean) arg2);
				}
			});
		}
		return this.climReclycleAutoProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimReclycleAuto(){
		return climReclycleAutoProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimReclycleAuto(boolean myClimReclycleAuto){
		this.climReclycleAutoProperty().set(myClimReclycleAuto);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimReclycleAuto(final boolean myClimReclycleAuto) {
		updateClimReclycleAuto(myClimReclycleAuto, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BooleanProperty climVMCProperty(){
		if (this.climVMCProperty == null) {
			this.climVMCProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimVMC());
			this.climVMCProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimVMC((Boolean) arg2);
				}
			});
		}
		return this.climVMCProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimVMC(){
		return climVMCProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimVMC(boolean myClimVMC){
		this.climVMCProperty().set(myClimVMC);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimVMC(final boolean myClimVMC) {
		updateClimVMC(myClimVMC, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BooleanProperty climVMCAutoProperty(){
		if (this.climVMCAutoProperty == null) {
			this.climVMCAutoProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimVMCAuto());
			this.climVMCAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimVMCAuto((Boolean) arg2);
				}
			});
		}
		return this.climVMCAutoProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimVMCAuto(){
		return climVMCAutoProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimVMCAuto(boolean myClimVMCAuto){
		this.climVMCAutoProperty().set(myClimVMCAuto);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimVMCAuto(final boolean myClimVMCAuto) {
		updateClimVMCAuto(myClimVMCAuto, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BooleanProperty climWithNewAirProperty(){
		if (this.climWithNewAirProperty == null) {
			this.climWithNewAirProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimWithNewAir());
			this.climWithNewAirProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimWithNewAir((Boolean) arg2);
				}
			});
		}
		return this.climWithNewAirProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimWithNewAir(){
		return climWithNewAirProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimWithNewAir(boolean myClimWithNewAir){
		this.climWithNewAirProperty().set(myClimWithNewAir);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimWithNewAir(final boolean myClimWithNewAir) {
		updateClimWithNewAir(myClimWithNewAir, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BooleanProperty climWithNewAirAutoProperty(){
		if (this.climWithNewAirAutoProperty == null) {
			this.climWithNewAirAutoProperty = new SimpleBooleanProperty(testedRoomCriteria.isClimWithNewAirAuto());
			this.climWithNewAirAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setClimWithNewAirAuto((Boolean) arg2);
				}
			});
		}
		return this.climWithNewAirAutoProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimWithNewAirAuto(){
		return climWithNewAirAutoProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimWithNewAirAuto(boolean myClimWithNewAirAuto){
		this.climWithNewAirAutoProperty().set(myClimWithNewAirAuto);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimWithNewAirAuto(final boolean myClimWithNewAirAuto) {
		updateClimWithNewAirAuto(myClimWithNewAirAuto, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public IntegerProperty commissioningDateProperty(){
		if (this.commissioningDateProperty == null) {
			this.commissioningDateProperty = new SimpleIntegerProperty(testedRoomCriteria.getCommissioningDate());
			this.commissioningDateProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setCommissioningDate((Integer) arg2);
				}
			});
		}
		return this.commissioningDateProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getCommissioningDate(){
		return commissioningDateProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCommissioningDate(int myCommissioningDate){
		this.commissioningDateProperty().set(myCommissioningDate);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCommissioningDate(final int myCommissioningDate, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCommissioningDate(myCommissioningDate);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCommissioningDate(myCommissioningDate);
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
	public void updateCommissioningDate(final int myCommissioningDate) {
		updateCommissioningDate(myCommissioningDate, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<java.util.Date> creationDateMaxProperty() {
		if (creationDateMaxProperty == null) {
			creationDateMaxProperty = new SimpleObjectProperty<java.util.Date>(testedRoomCriteria.getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoomCriteria.setCreationDateMax(arg2);
				}
			});
		}
		return creationDateMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCreationDateMax(){
		return creationDateMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCreationDateMax(java.util.Date myCreationDateMax){
		if (creationDateMaxProperty == null) {
				testedRoomCriteria.setCreationDateMax(myCreationDateMax);
			} else {
				this.creationDateMaxProperty().set(myCreationDateMax);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateMax(final java.util.Date myCreationDateMax) {
		updateCreationDateMax(myCreationDateMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<java.util.Date> creationDateMinProperty() {
		if (creationDateMinProperty == null) {
			creationDateMinProperty = new SimpleObjectProperty<java.util.Date>(testedRoomCriteria.getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoomCriteria.setCreationDateMin(arg2);
				}
			});
		}
		return creationDateMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCreationDateMin(){
		return creationDateMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCreationDateMin(java.util.Date myCreationDateMin){
		if (creationDateMinProperty == null) {
				testedRoomCriteria.setCreationDateMin(myCreationDateMin);
			} else {
				this.creationDateMinProperty().set(myCreationDateMin);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateMin(final java.util.Date myCreationDateMin) {
		updateCreationDateMin(myCreationDateMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty droppedCeilingMaxProperty(){
		if (this.droppedCeilingMaxProperty == null) {
			this.droppedCeilingMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getDroppedCeilingMax());
			this.droppedCeilingMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setDroppedCeilingMax((Double) arg2);
				}
			});
		}
		return this.droppedCeilingMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getDroppedCeilingMax(){
		return droppedCeilingMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedCeilingMax(double myDroppedCeilingMax){
		this.droppedCeilingMaxProperty().set(myDroppedCeilingMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedCeilingMax(final double myDroppedCeilingMax, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedCeilingMax(final double myDroppedCeilingMax) {
		updateDroppedCeilingMax(myDroppedCeilingMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty droppedCeilingMinProperty(){
		if (this.droppedCeilingMinProperty == null) {
			this.droppedCeilingMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getDroppedCeilingMin());
			this.droppedCeilingMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setDroppedCeilingMin((Double) arg2);
				}
			});
		}
		return this.droppedCeilingMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getDroppedCeilingMin(){
		return droppedCeilingMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedCeilingMin(double myDroppedCeilingMin){
		this.droppedCeilingMinProperty().set(myDroppedCeilingMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedCeilingMin(final double myDroppedCeilingMin, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedCeilingMin(final double myDroppedCeilingMin) {
		updateDroppedCeilingMin(myDroppedCeilingMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty droppedFloorMaxProperty(){
		if (this.droppedFloorMaxProperty == null) {
			this.droppedFloorMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getDroppedFloorMax());
			this.droppedFloorMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setDroppedFloorMax((Double) arg2);
				}
			});
		}
		return this.droppedFloorMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getDroppedFloorMax(){
		return droppedFloorMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedFloorMax(double myDroppedFloorMax){
		this.droppedFloorMaxProperty().set(myDroppedFloorMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedFloorMax(final double myDroppedFloorMax, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedFloorMax(final double myDroppedFloorMax) {
		updateDroppedFloorMax(myDroppedFloorMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty droppedFloorMinProperty(){
		if (this.droppedFloorMinProperty == null) {
			this.droppedFloorMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getDroppedFloorMin());
			this.droppedFloorMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setDroppedFloorMin((Double) arg2);
				}
			});
		}
		return this.droppedFloorMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getDroppedFloorMin(){
		return droppedFloorMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedFloorMin(double myDroppedFloorMin){
		this.droppedFloorMinProperty().set(myDroppedFloorMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedFloorMin(final double myDroppedFloorMin, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedFloorMin(final double myDroppedFloorMin) {
		updateDroppedFloorMin(myDroppedFloorMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public LongProperty idMaxProperty(){
		if (this.idMaxProperty == null) {
			this.idMaxProperty = new SimpleLongProperty(testedRoomCriteria.getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setIdMax((Long) arg2);
				}
			});
		}
		return this.idMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public long getIdMax(){
		return idMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setIdMax(long myIdMax){
		this.idMaxProperty().set(myIdMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIdMax(final long myIdMax) {
		updateIdMax(myIdMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public LongProperty idMinProperty(){
		if (this.idMinProperty == null) {
			this.idMinProperty = new SimpleLongProperty(testedRoomCriteria.getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setIdMin((Long) arg2);
				}
			});
		}
		return this.idMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public long getIdMin(){
		return idMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setIdMin(long myIdMin){
		this.idMinProperty().set(myIdMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIdMin(final long myIdMin) {
		updateIdMin(myIdMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty indicatedVolumeMaxProperty(){
		if (this.indicatedVolumeMaxProperty == null) {
			this.indicatedVolumeMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getIndicatedVolumeMax());
			this.indicatedVolumeMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setIndicatedVolumeMax((Double) arg2);
				}
			});
		}
		return this.indicatedVolumeMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getIndicatedVolumeMax(){
		return indicatedVolumeMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setIndicatedVolumeMax(double myIndicatedVolumeMax){
		this.indicatedVolumeMaxProperty().set(myIndicatedVolumeMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIndicatedVolumeMax(final double myIndicatedVolumeMax, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIndicatedVolumeMax(final double myIndicatedVolumeMax) {
		updateIndicatedVolumeMax(myIndicatedVolumeMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty indicatedVolumeMinProperty(){
		if (this.indicatedVolumeMinProperty == null) {
			this.indicatedVolumeMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getIndicatedVolumeMin());
			this.indicatedVolumeMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setIndicatedVolumeMin((Double) arg2);
				}
			});
		}
		return this.indicatedVolumeMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getIndicatedVolumeMin(){
		return indicatedVolumeMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setIndicatedVolumeMin(double myIndicatedVolumeMin){
		this.indicatedVolumeMinProperty().set(myIndicatedVolumeMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIndicatedVolumeMin(final double myIndicatedVolumeMin, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIndicatedVolumeMin(final double myIndicatedVolumeMin) {
		updateIndicatedVolumeMin(myIndicatedVolumeMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty mainHeightMaxProperty(){
		if (this.mainHeightMaxProperty == null) {
			this.mainHeightMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getMainHeightMax());
			this.mainHeightMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMainHeightMax((Double) arg2);
				}
			});
		}
		return this.mainHeightMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMainHeightMax(){
		return mainHeightMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMainHeightMax(double myMainHeightMax){
		this.mainHeightMaxProperty().set(myMainHeightMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMainHeightMax(final double myMainHeightMax, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMainHeightMax(final double myMainHeightMax) {
		updateMainHeightMax(myMainHeightMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty mainHeightMinProperty(){
		if (this.mainHeightMinProperty == null) {
			this.mainHeightMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getMainHeightMin());
			this.mainHeightMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMainHeightMin((Double) arg2);
				}
			});
		}
		return this.mainHeightMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMainHeightMin(){
		return mainHeightMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMainHeightMin(double myMainHeightMin){
		this.mainHeightMinProperty().set(myMainHeightMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMainHeightMin(final double myMainHeightMin, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMainHeightMin(final double myMainHeightMin) {
		updateMainHeightMin(myMainHeightMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty measuredPressureMaxProperty(){
		if (this.measuredPressureMaxProperty == null) {
			this.measuredPressureMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getMeasuredPressureMax());
			this.measuredPressureMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMeasuredPressureMax((Double) arg2);
				}
			});
		}
		return this.measuredPressureMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMeasuredPressureMax(){
		return measuredPressureMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredPressureMax(double myMeasuredPressureMax){
		this.measuredPressureMaxProperty().set(myMeasuredPressureMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredPressureMax(final double myMeasuredPressureMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMeasuredPressureMax(myMeasuredPressureMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMeasuredPressureMax(myMeasuredPressureMax);
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
	public void updateMeasuredPressureMax(final double myMeasuredPressureMax) {
		updateMeasuredPressureMax(myMeasuredPressureMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty measuredPressureMinProperty(){
		if (this.measuredPressureMinProperty == null) {
			this.measuredPressureMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getMeasuredPressureMin());
			this.measuredPressureMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMeasuredPressureMin((Double) arg2);
				}
			});
		}
		return this.measuredPressureMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMeasuredPressureMin(){
		return measuredPressureMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredPressureMin(double myMeasuredPressureMin){
		this.measuredPressureMinProperty().set(myMeasuredPressureMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredPressureMin(final double myMeasuredPressureMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMeasuredPressureMin(myMeasuredPressureMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMeasuredPressureMin(myMeasuredPressureMin);
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
	public void updateMeasuredPressureMin(final double myMeasuredPressureMin) {
		updateMeasuredPressureMin(myMeasuredPressureMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty measuredTemperatureMaxProperty(){
		if (this.measuredTemperatureMaxProperty == null) {
			this.measuredTemperatureMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getMeasuredTemperatureMax());
			this.measuredTemperatureMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMeasuredTemperatureMax((Double) arg2);
				}
			});
		}
		return this.measuredTemperatureMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMeasuredTemperatureMax(){
		return measuredTemperatureMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredTemperatureMax(double myMeasuredTemperatureMax){
		this.measuredTemperatureMaxProperty().set(myMeasuredTemperatureMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredTemperatureMax(final double myMeasuredTemperatureMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMeasuredTemperatureMax(myMeasuredTemperatureMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMeasuredTemperatureMax(myMeasuredTemperatureMax);
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
	public void updateMeasuredTemperatureMax(final double myMeasuredTemperatureMax) {
		updateMeasuredTemperatureMax(myMeasuredTemperatureMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty measuredTemperatureMinProperty(){
		if (this.measuredTemperatureMinProperty == null) {
			this.measuredTemperatureMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getMeasuredTemperatureMin());
			this.measuredTemperatureMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMeasuredTemperatureMin((Double) arg2);
				}
			});
		}
		return this.measuredTemperatureMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMeasuredTemperatureMin(){
		return measuredTemperatureMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredTemperatureMin(double myMeasuredTemperatureMin){
		this.measuredTemperatureMinProperty().set(myMeasuredTemperatureMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredTemperatureMin(final double myMeasuredTemperatureMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMeasuredTemperatureMin(myMeasuredTemperatureMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMeasuredTemperatureMin(myMeasuredTemperatureMin);
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
	public void updateMeasuredTemperatureMin(final double myMeasuredTemperatureMin) {
		updateMeasuredTemperatureMin(myMeasuredTemperatureMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty measuredVolumeMaxProperty(){
		if (this.measuredVolumeMaxProperty == null) {
			this.measuredVolumeMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getMeasuredVolumeMax());
			this.measuredVolumeMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMeasuredVolumeMax((Double) arg2);
				}
			});
		}
		return this.measuredVolumeMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMeasuredVolumeMax(){
		return measuredVolumeMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredVolumeMax(double myMeasuredVolumeMax){
		this.measuredVolumeMaxProperty().set(myMeasuredVolumeMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredVolumeMax(final double myMeasuredVolumeMax, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredVolumeMax(final double myMeasuredVolumeMax) {
		updateMeasuredVolumeMax(myMeasuredVolumeMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty measuredVolumeMinProperty(){
		if (this.measuredVolumeMinProperty == null) {
			this.measuredVolumeMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getMeasuredVolumeMin());
			this.measuredVolumeMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMeasuredVolumeMin((Double) arg2);
				}
			});
		}
		return this.measuredVolumeMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMeasuredVolumeMin(){
		return measuredVolumeMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredVolumeMin(double myMeasuredVolumeMin){
		this.measuredVolumeMinProperty().set(myMeasuredVolumeMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredVolumeMin(final double myMeasuredVolumeMin, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredVolumeMin(final double myMeasuredVolumeMin) {
		updateMeasuredVolumeMin(myMeasuredVolumeMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public IntegerProperty mecanicalStrengthProperty(){
		if (this.mecanicalStrengthProperty == null) {
			this.mecanicalStrengthProperty = new SimpleIntegerProperty(testedRoomCriteria.getMecanicalStrength());
			this.mecanicalStrengthProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMecanicalStrength((Integer) arg2);
				}
			});
		}
		return this.mecanicalStrengthProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getMecanicalStrength(){
		return mecanicalStrengthProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMecanicalStrength(int myMecanicalStrength){
		this.mecanicalStrengthProperty().set(myMecanicalStrength);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMecanicalStrength(final int myMecanicalStrength, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMecanicalStrength(myMecanicalStrength);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMecanicalStrength(myMecanicalStrength);
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
	public void updateMecanicalStrength(final int myMecanicalStrength) {
		updateMecanicalStrength(myMecanicalStrength, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty minimalProtectedHeightMaxProperty(){
		if (this.minimalProtectedHeightMaxProperty == null) {
			this.minimalProtectedHeightMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getMinimalProtectedHeightMax());
			this.minimalProtectedHeightMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMinimalProtectedHeightMax((Double) arg2);
				}
			});
		}
		return this.minimalProtectedHeightMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMinimalProtectedHeightMax(){
		return minimalProtectedHeightMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMinimalProtectedHeightMax(double myMinimalProtectedHeightMax){
		this.minimalProtectedHeightMaxProperty().set(myMinimalProtectedHeightMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMinimalProtectedHeightMax(final double myMinimalProtectedHeightMax, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMinimalProtectedHeightMax(final double myMinimalProtectedHeightMax) {
		updateMinimalProtectedHeightMax(myMinimalProtectedHeightMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty minimalProtectedHeightMinProperty(){
		if (this.minimalProtectedHeightMinProperty == null) {
			this.minimalProtectedHeightMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getMinimalProtectedHeightMin());
			this.minimalProtectedHeightMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMinimalProtectedHeightMin((Double) arg2);
				}
			});
		}
		return this.minimalProtectedHeightMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMinimalProtectedHeightMin(){
		return minimalProtectedHeightMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMinimalProtectedHeightMin(double myMinimalProtectedHeightMin){
		this.minimalProtectedHeightMinProperty().set(myMinimalProtectedHeightMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMinimalProtectedHeightMin(final double myMinimalProtectedHeightMin, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMinimalProtectedHeightMin(final double myMinimalProtectedHeightMin) {
		updateMinimalProtectedHeightMin(myMinimalProtectedHeightMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StringProperty nameProperty(){
		if (this.nameProperty == null) {
			this.nameProperty = new SimpleStringProperty(testedRoomCriteria.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					testedRoomCriteria.setName((String) arg2);
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
	public DoubleProperty netVolumeMaxProperty(){
		if (this.netVolumeMaxProperty == null) {
			this.netVolumeMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getNetVolumeMax());
			this.netVolumeMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setNetVolumeMax((Double) arg2);
				}
			});
		}
		return this.netVolumeMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getNetVolumeMax(){
		return netVolumeMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setNetVolumeMax(double myNetVolumeMax){
		this.netVolumeMaxProperty().set(myNetVolumeMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNetVolumeMax(final double myNetVolumeMax, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNetVolumeMax(final double myNetVolumeMax) {
		updateNetVolumeMax(myNetVolumeMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty netVolumeMinProperty(){
		if (this.netVolumeMinProperty == null) {
			this.netVolumeMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getNetVolumeMin());
			this.netVolumeMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setNetVolumeMin((Double) arg2);
				}
			});
		}
		return this.netVolumeMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getNetVolumeMin(){
		return netVolumeMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setNetVolumeMin(double myNetVolumeMin){
		this.netVolumeMinProperty().set(myNetVolumeMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNetVolumeMin(final double myNetVolumeMin, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNetVolumeMin(final double myNetVolumeMin) {
		updateNetVolumeMin(myNetVolumeMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedPressureMaxProperty(){
		if (this.prescribedPressureMaxProperty == null) {
			this.prescribedPressureMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getPrescribedPressureMax());
			this.prescribedPressureMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setPrescribedPressureMax((Double) arg2);
				}
			});
		}
		return this.prescribedPressureMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedPressureMax(){
		return prescribedPressureMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedPressureMax(double myPrescribedPressureMax){
		this.prescribedPressureMaxProperty().set(myPrescribedPressureMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedPressureMax(final double myPrescribedPressureMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedPressureMax(myPrescribedPressureMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedPressureMax(myPrescribedPressureMax);
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
	public void updatePrescribedPressureMax(final double myPrescribedPressureMax) {
		updatePrescribedPressureMax(myPrescribedPressureMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedPressureMinProperty(){
		if (this.prescribedPressureMinProperty == null) {
			this.prescribedPressureMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getPrescribedPressureMin());
			this.prescribedPressureMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setPrescribedPressureMin((Double) arg2);
				}
			});
		}
		return this.prescribedPressureMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedPressureMin(){
		return prescribedPressureMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedPressureMin(double myPrescribedPressureMin){
		this.prescribedPressureMinProperty().set(myPrescribedPressureMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedPressureMin(final double myPrescribedPressureMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedPressureMin(myPrescribedPressureMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedPressureMin(myPrescribedPressureMin);
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
	public void updatePrescribedPressureMin(final double myPrescribedPressureMin) {
		updatePrescribedPressureMin(myPrescribedPressureMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedTemperatureMaxProperty(){
		if (this.prescribedTemperatureMaxProperty == null) {
			this.prescribedTemperatureMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getPrescribedTemperatureMax());
			this.prescribedTemperatureMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setPrescribedTemperatureMax((Double) arg2);
				}
			});
		}
		return this.prescribedTemperatureMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedTemperatureMax(){
		return prescribedTemperatureMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedTemperatureMax(double myPrescribedTemperatureMax){
		this.prescribedTemperatureMaxProperty().set(myPrescribedTemperatureMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedTemperatureMax(final double myPrescribedTemperatureMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedTemperatureMax(myPrescribedTemperatureMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedTemperatureMax(myPrescribedTemperatureMax);
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
	public void updatePrescribedTemperatureMax(final double myPrescribedTemperatureMax) {
		updatePrescribedTemperatureMax(myPrescribedTemperatureMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedTemperatureMinProperty(){
		if (this.prescribedTemperatureMinProperty == null) {
			this.prescribedTemperatureMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getPrescribedTemperatureMin());
			this.prescribedTemperatureMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setPrescribedTemperatureMin((Double) arg2);
				}
			});
		}
		return this.prescribedTemperatureMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedTemperatureMin(){
		return prescribedTemperatureMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedTemperatureMin(double myPrescribedTemperatureMin){
		this.prescribedTemperatureMinProperty().set(myPrescribedTemperatureMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedTemperatureMin(final double myPrescribedTemperatureMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedTemperatureMin(myPrescribedTemperatureMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedTemperatureMin(myPrescribedTemperatureMin);
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
	public void updatePrescribedTemperatureMin(final double myPrescribedTemperatureMin) {
		updatePrescribedTemperatureMin(myPrescribedTemperatureMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty risqueHeightMaxProperty(){
		if (this.risqueHeightMaxProperty == null) {
			this.risqueHeightMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getRisqueHeightMax());
			this.risqueHeightMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setRisqueHeightMax((Double) arg2);
				}
			});
		}
		return this.risqueHeightMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRisqueHeightMax(){
		return risqueHeightMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisqueHeightMax(double myRisqueHeightMax){
		this.risqueHeightMaxProperty().set(myRisqueHeightMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightMax(final double myRisqueHeightMax, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightMax(final double myRisqueHeightMax) {
		updateRisqueHeightMax(myRisqueHeightMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty risqueHeightMinProperty(){
		if (this.risqueHeightMinProperty == null) {
			this.risqueHeightMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getRisqueHeightMin());
			this.risqueHeightMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setRisqueHeightMin((Double) arg2);
				}
			});
		}
		return this.risqueHeightMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRisqueHeightMin(){
		return risqueHeightMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisqueHeightMin(double myRisqueHeightMin){
		this.risqueHeightMinProperty().set(myRisqueHeightMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightMin(final double myRisqueHeightMin, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightMin(final double myRisqueHeightMin) {
		updateRisqueHeightMin(myRisqueHeightMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty risqueHeightPercentMaxProperty(){
		if (this.risqueHeightPercentMaxProperty == null) {
			this.risqueHeightPercentMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getRisqueHeightPercentMax());
			this.risqueHeightPercentMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setRisqueHeightPercentMax((Double) arg2);
				}
			});
		}
		return this.risqueHeightPercentMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRisqueHeightPercentMax(){
		return risqueHeightPercentMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisqueHeightPercentMax(double myRisqueHeightPercentMax){
		this.risqueHeightPercentMaxProperty().set(myRisqueHeightPercentMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightPercentMax(final double myRisqueHeightPercentMax) {
		updateRisqueHeightPercentMax(myRisqueHeightPercentMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty risqueHeightPercentMinProperty(){
		if (this.risqueHeightPercentMinProperty == null) {
			this.risqueHeightPercentMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getRisqueHeightPercentMin());
			this.risqueHeightPercentMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setRisqueHeightPercentMin((Double) arg2);
				}
			});
		}
		return this.risqueHeightPercentMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRisqueHeightPercentMin(){
		return risqueHeightPercentMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisqueHeightPercentMin(double myRisqueHeightPercentMin){
		this.risqueHeightPercentMinProperty().set(myRisqueHeightPercentMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightPercentMin(final double myRisqueHeightPercentMin) {
		updateRisqueHeightPercentMin(myRisqueHeightPercentMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty totalHeightMaxProperty(){
		if (this.totalHeightMaxProperty == null) {
			this.totalHeightMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getTotalHeightMax());
			this.totalHeightMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setTotalHeightMax((Double) arg2);
				}
			});
		}
		return this.totalHeightMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getTotalHeightMax(){
		return totalHeightMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTotalHeightMax(double myTotalHeightMax){
		this.totalHeightMaxProperty().set(myTotalHeightMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTotalHeightMax(final double myTotalHeightMax, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTotalHeightMax(final double myTotalHeightMax) {
		updateTotalHeightMax(myTotalHeightMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty totalHeightMinProperty(){
		if (this.totalHeightMinProperty == null) {
			this.totalHeightMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getTotalHeightMin());
			this.totalHeightMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setTotalHeightMin((Double) arg2);
				}
			});
		}
		return this.totalHeightMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getTotalHeightMin(){
		return totalHeightMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTotalHeightMin(double myTotalHeightMin){
		this.totalHeightMinProperty().set(myTotalHeightMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTotalHeightMin(final double myTotalHeightMin, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTotalHeightMin(final double myTotalHeightMin) {
		updateTotalHeightMin(myTotalHeightMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BooleanProperty uniformHorizontalityProperty(){
		if (this.uniformHorizontalityProperty == null) {
			this.uniformHorizontalityProperty = new SimpleBooleanProperty(testedRoomCriteria.isUniformHorizontality());
			this.uniformHorizontalityProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoomCriteria.setUniformHorizontality((Boolean) arg2);
				}
			});
		}
		return this.uniformHorizontalityProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isUniformHorizontality(){
		return uniformHorizontalityProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUniformHorizontality(boolean myUniformHorizontality){
		this.uniformHorizontalityProperty().set(myUniformHorizontality);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUniformHorizontality(final boolean myUniformHorizontality) {
		updateUniformHorizontality(myUniformHorizontality, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty unloadTimeMaxProperty(){
		if (this.unloadTimeMaxProperty == null) {
			this.unloadTimeMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getUnloadTimeMax());
			this.unloadTimeMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setUnloadTimeMax((Double) arg2);
				}
			});
		}
		return this.unloadTimeMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getUnloadTimeMax(){
		return unloadTimeMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUnloadTimeMax(double myUnloadTimeMax){
		this.unloadTimeMaxProperty().set(myUnloadTimeMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUnloadTimeMax(final double myUnloadTimeMax, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUnloadTimeMax(final double myUnloadTimeMax) {
		updateUnloadTimeMax(myUnloadTimeMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty unloadTimeMinProperty(){
		if (this.unloadTimeMinProperty == null) {
			this.unloadTimeMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getUnloadTimeMin());
			this.unloadTimeMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setUnloadTimeMin((Double) arg2);
				}
			});
		}
		return this.unloadTimeMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getUnloadTimeMin(){
		return unloadTimeMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUnloadTimeMin(double myUnloadTimeMin){
		this.unloadTimeMinProperty().set(myUnloadTimeMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUnloadTimeMin(final double myUnloadTimeMin, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUnloadTimeMin(final double myUnloadTimeMin) {
		updateUnloadTimeMin(myUnloadTimeMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = new SimpleObjectProperty<java.util.Date>(testedRoomCriteria.getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoomCriteria.setUpdateDateMax(arg2);
				}
			});
		}
		return updateDateMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getUpdateDateMax(){
		return updateDateMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUpdateDateMax(java.util.Date myUpdateDateMax){
		if (updateDateMaxProperty == null) {
				testedRoomCriteria.setUpdateDateMax(myUpdateDateMax);
			} else {
				this.updateDateMaxProperty().set(myUpdateDateMax);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateMax(final java.util.Date myUpdateDateMax) {
		updateUpdateDateMax(myUpdateDateMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<java.util.Date> updateDateMinProperty() {
		if (updateDateMinProperty == null) {
			updateDateMinProperty = new SimpleObjectProperty<java.util.Date>(testedRoomCriteria.getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoomCriteria.setUpdateDateMin(arg2);
				}
			});
		}
		return updateDateMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getUpdateDateMin(){
		return updateDateMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUpdateDateMin(java.util.Date myUpdateDateMin){
		if (updateDateMinProperty == null) {
				testedRoomCriteria.setUpdateDateMin(myUpdateDateMin);
			} else {
				this.updateDateMinProperty().set(myUpdateDateMin);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateMin(final java.util.Date myUpdateDateMin) {
		updateUpdateDateMin(myUpdateDateMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public IntegerProperty versionProperty(){
		if (this.versionProperty == null) {
			this.versionProperty = new SimpleIntegerProperty(testedRoomCriteria.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setVersion((Integer) arg2);
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
	public DoubleProperty volumeCorrectionMaxProperty(){
		if (this.volumeCorrectionMaxProperty == null) {
			this.volumeCorrectionMaxProperty = new SimpleDoubleProperty(testedRoomCriteria.getVolumeCorrectionMax());
			this.volumeCorrectionMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setVolumeCorrectionMax((Double) arg2);
				}
			});
		}
		return this.volumeCorrectionMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getVolumeCorrectionMax(){
		return volumeCorrectionMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setVolumeCorrectionMax(double myVolumeCorrectionMax){
		this.volumeCorrectionMaxProperty().set(myVolumeCorrectionMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVolumeCorrectionMax(final double myVolumeCorrectionMax, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVolumeCorrectionMax(final double myVolumeCorrectionMax) {
		updateVolumeCorrectionMax(myVolumeCorrectionMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty volumeCorrectionMinProperty(){
		if (this.volumeCorrectionMinProperty == null) {
			this.volumeCorrectionMinProperty = new SimpleDoubleProperty(testedRoomCriteria.getVolumeCorrectionMin());
			this.volumeCorrectionMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setVolumeCorrectionMin((Double) arg2);
				}
			});
		}
		return this.volumeCorrectionMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getVolumeCorrectionMin(){
		return volumeCorrectionMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setVolumeCorrectionMin(double myVolumeCorrectionMin){
		this.volumeCorrectionMinProperty().set(myVolumeCorrectionMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVolumeCorrectionMin(final double myVolumeCorrectionMin, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVolumeCorrectionMin(final double myVolumeCorrectionMin) {
		updateVolumeCorrectionMin(myVolumeCorrectionMin, null);
	}

}
