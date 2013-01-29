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
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.BooleanProperty;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

//Start of user code for imports
// TODO: import me!
//End of user code




// Start of user code comment for TestedRoomCriteria Class

// End of user code

public class TestedRoomCriteria 
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private ObjectProperty<java.util.Date> commissioningDateMaxProperty;
	
	private ObjectProperty<java.util.Date> commissioningDateMinProperty;
	
	private IntegerProperty altitudeProperty;
	
	private IntegerProperty choosenProtectedHeightProperty;
	
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
	
	private IntegerProperty droppedCeilingProperty;
	
	private IntegerProperty droppedFloorProperty;
	
	private LongProperty idMaxProperty;
	
	private LongProperty idMinProperty;
	
	private IntegerProperty indicatedVolumeProperty;
	
	private IntegerProperty mainHeightProperty;
	
	private IntegerProperty measuredVolumeProperty;
	
	private IntegerProperty mecanicalStrengthProperty;
	
	private IntegerProperty minimalProtectedHeightProperty;
	
	private StringProperty nameProperty;
	
	private IntegerProperty netVolumeProperty;
	
	private IntegerProperty risqueHeightProperty;
	
	private DoubleProperty risqueHeightPercentMaxProperty;
	
	private DoubleProperty risqueHeightPercentMinProperty;
	
	private IntegerProperty totalHeightProperty;
	
	private BooleanProperty uniformHorizontalityProperty;
	
	private IntegerProperty unloadTimeProperty;
	
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	
	private ObjectProperty<java.util.Date> updateDateMinProperty;
	
	private IntegerProperty versionProperty;
	
	private IntegerProperty volumeCorrectionProperty;

	/**
	 * Handled Criteria
	 */
	private TestedRoomCriteriaInstance testedRoomCriteria;

	/*
	 * Constructors
	 * <!-- Start of user code comment for TestedRoomCriteria constructor
	 * End of user code -->
	 */
	public TestedRoomCriteria(){
		this(new TestedRoomCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for TestedRoomCriteria constructor with parameters
	 * End of user code -->
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
		// Start of user code constructor with parameters
		// End of user code
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

	/*
	 * <!-- Start of user code comment for CommissioningDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
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
	
	/*
	 * <!-- Start of user code comment for CommissioningDateMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getCommissioningDateMax(){
		return commissioningDateMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for CommissioningDateMax setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for CommissioningDateMin property method 
		-->
	 * <!-- End of user code -->
	 */
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
	
	/*
	 * <!-- Start of user code comment for CommissioningDateMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getCommissioningDateMin(){
		return commissioningDateMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for CommissioningDateMin setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for altitude property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code altitudeproperty method
			//End of user code
		}
		return this.altitudeProperty;
	}
	
	/*
	 * <!-- Start of user code comment for altitude getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getAltitude(){
		return altitudeProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for altitude setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setAltitude(int myAltitude){
		this.altitudeProperty().set(myAltitude);
	}
	
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
	
	public void updateAltitude(final int myAltitude) {
		updateAltitude(myAltitude, null);
	}

	/*
	 * <!-- Start of user code comment for choosenProtectedHeight property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty choosenProtectedHeightProperty(){
		if (this.choosenProtectedHeightProperty == null) {
			this.choosenProtectedHeightProperty = new SimpleIntegerProperty(testedRoomCriteria.getChoosenProtectedHeight());
			this.choosenProtectedHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setChoosenProtectedHeight((Integer) arg2);
				}
			});
			//Start of user code choosenProtectedHeightproperty method
			//End of user code
		}
		return this.choosenProtectedHeightProperty;
	}
	
	/*
	 * <!-- Start of user code comment for choosenProtectedHeight getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getChoosenProtectedHeight(){
		return choosenProtectedHeightProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for choosenProtectedHeight setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setChoosenProtectedHeight(int myChoosenProtectedHeight){
		this.choosenProtectedHeightProperty().set(myChoosenProtectedHeight);
	}
	
	public void updateChoosenProtectedHeight(final int myChoosenProtectedHeight, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setChoosenProtectedHeight(myChoosenProtectedHeight);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setChoosenProtectedHeight(myChoosenProtectedHeight);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateChoosenProtectedHeight(final int myChoosenProtectedHeight) {
		updateChoosenProtectedHeight(myChoosenProtectedHeight, null);
	}

	/*
	 * <!-- Start of user code comment for clapetsCF property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code clapetsCFproperty method
			//End of user code
		}
		return this.clapetsCFProperty;
	}
	
	/*
	 * <!-- Start of user code comment for clapetsCF getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isClapetsCF(){
		return clapetsCFProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for clapetsCF setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for climDuct property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code climDuctproperty method
			//End of user code
		}
		return this.climDuctProperty;
	}
	
	/*
	 * <!-- Start of user code comment for climDuct getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isClimDuct(){
		return climDuctProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for climDuct setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for climReclycle property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code climReclycleproperty method
			//End of user code
		}
		return this.climReclycleProperty;
	}
	
	/*
	 * <!-- Start of user code comment for climReclycle getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isClimReclycle(){
		return climReclycleProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for climReclycle setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for climReclycleAuto property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code climReclycleAutoproperty method
			//End of user code
		}
		return this.climReclycleAutoProperty;
	}
	
	/*
	 * <!-- Start of user code comment for climReclycleAuto getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isClimReclycleAuto(){
		return climReclycleAutoProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for climReclycleAuto setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for climVMC property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code climVMCproperty method
			//End of user code
		}
		return this.climVMCProperty;
	}
	
	/*
	 * <!-- Start of user code comment for climVMC getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isClimVMC(){
		return climVMCProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for climVMC setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for climVMCAuto property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code climVMCAutoproperty method
			//End of user code
		}
		return this.climVMCAutoProperty;
	}
	
	/*
	 * <!-- Start of user code comment for climVMCAuto getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isClimVMCAuto(){
		return climVMCAutoProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for climVMCAuto setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for climWithNewAir property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code climWithNewAirproperty method
			//End of user code
		}
		return this.climWithNewAirProperty;
	}
	
	/*
	 * <!-- Start of user code comment for climWithNewAir getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isClimWithNewAir(){
		return climWithNewAirProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for climWithNewAir setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for climWithNewAirAuto property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code climWithNewAirAutoproperty method
			//End of user code
		}
		return this.climWithNewAirAutoProperty;
	}
	
	/*
	 * <!-- Start of user code comment for climWithNewAirAuto getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isClimWithNewAirAuto(){
		return climWithNewAirAutoProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for climWithNewAirAuto setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for creationDateMax property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code creationDateMaxproperty method
			//End of user code
		}
		return creationDateMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for creationDateMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getCreationDateMax(){
		return creationDateMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for creationDateMax setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for creationDateMin property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code creationDateMinproperty method
			//End of user code
		}
		return creationDateMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for creationDateMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getCreationDateMin(){
		return creationDateMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for creationDateMin setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for droppedCeiling property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty droppedCeilingProperty(){
		if (this.droppedCeilingProperty == null) {
			this.droppedCeilingProperty = new SimpleIntegerProperty(testedRoomCriteria.getDroppedCeiling());
			this.droppedCeilingProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setDroppedCeiling((Integer) arg2);
				}
			});
			//Start of user code droppedCeilingproperty method
			//End of user code
		}
		return this.droppedCeilingProperty;
	}
	
	/*
	 * <!-- Start of user code comment for droppedCeiling getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getDroppedCeiling(){
		return droppedCeilingProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for droppedCeiling setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDroppedCeiling(int myDroppedCeiling){
		this.droppedCeilingProperty().set(myDroppedCeiling);
	}
	
	public void updateDroppedCeiling(final int myDroppedCeiling, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedCeiling(myDroppedCeiling);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedCeiling(myDroppedCeiling);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDroppedCeiling(final int myDroppedCeiling) {
		updateDroppedCeiling(myDroppedCeiling, null);
	}

	/*
	 * <!-- Start of user code comment for droppedFloor property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty droppedFloorProperty(){
		if (this.droppedFloorProperty == null) {
			this.droppedFloorProperty = new SimpleIntegerProperty(testedRoomCriteria.getDroppedFloor());
			this.droppedFloorProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setDroppedFloor((Integer) arg2);
				}
			});
			//Start of user code droppedFloorproperty method
			//End of user code
		}
		return this.droppedFloorProperty;
	}
	
	/*
	 * <!-- Start of user code comment for droppedFloor getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getDroppedFloor(){
		return droppedFloorProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for droppedFloor setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDroppedFloor(int myDroppedFloor){
		this.droppedFloorProperty().set(myDroppedFloor);
	}
	
	public void updateDroppedFloor(final int myDroppedFloor, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedFloor(myDroppedFloor);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedFloor(myDroppedFloor);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDroppedFloor(final int myDroppedFloor) {
		updateDroppedFloor(myDroppedFloor, null);
	}

	/*
	 * <!-- Start of user code comment for idMax property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code idMaxproperty method
			//End of user code
		}
		return this.idMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for idMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public long getIdMax(){
		return idMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for idMax setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for idMin property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code idMinproperty method
			//End of user code
		}
		return this.idMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for idMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public long getIdMin(){
		return idMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for idMin setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for indicatedVolume property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty indicatedVolumeProperty(){
		if (this.indicatedVolumeProperty == null) {
			this.indicatedVolumeProperty = new SimpleIntegerProperty(testedRoomCriteria.getIndicatedVolume());
			this.indicatedVolumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setIndicatedVolume((Integer) arg2);
				}
			});
			//Start of user code indicatedVolumeproperty method
			//End of user code
		}
		return this.indicatedVolumeProperty;
	}
	
	/*
	 * <!-- Start of user code comment for indicatedVolume getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getIndicatedVolume(){
		return indicatedVolumeProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for indicatedVolume setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setIndicatedVolume(int myIndicatedVolume){
		this.indicatedVolumeProperty().set(myIndicatedVolume);
	}
	
	public void updateIndicatedVolume(final int myIndicatedVolume, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIndicatedVolume(myIndicatedVolume);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIndicatedVolume(myIndicatedVolume);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateIndicatedVolume(final int myIndicatedVolume) {
		updateIndicatedVolume(myIndicatedVolume, null);
	}

	/*
	 * <!-- Start of user code comment for mainHeight property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty mainHeightProperty(){
		if (this.mainHeightProperty == null) {
			this.mainHeightProperty = new SimpleIntegerProperty(testedRoomCriteria.getMainHeight());
			this.mainHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMainHeight((Integer) arg2);
				}
			});
			//Start of user code mainHeightproperty method
			//End of user code
		}
		return this.mainHeightProperty;
	}
	
	/*
	 * <!-- Start of user code comment for mainHeight getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getMainHeight(){
		return mainHeightProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for mainHeight setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setMainHeight(int myMainHeight){
		this.mainHeightProperty().set(myMainHeight);
	}
	
	public void updateMainHeight(final int myMainHeight, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMainHeight(myMainHeight);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMainHeight(myMainHeight);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateMainHeight(final int myMainHeight) {
		updateMainHeight(myMainHeight, null);
	}

	/*
	 * <!-- Start of user code comment for measuredVolume property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty measuredVolumeProperty(){
		if (this.measuredVolumeProperty == null) {
			this.measuredVolumeProperty = new SimpleIntegerProperty(testedRoomCriteria.getMeasuredVolume());
			this.measuredVolumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMeasuredVolume((Integer) arg2);
				}
			});
			//Start of user code measuredVolumeproperty method
			//End of user code
		}
		return this.measuredVolumeProperty;
	}
	
	/*
	 * <!-- Start of user code comment for measuredVolume getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getMeasuredVolume(){
		return measuredVolumeProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for measuredVolume setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setMeasuredVolume(int myMeasuredVolume){
		this.measuredVolumeProperty().set(myMeasuredVolume);
	}
	
	public void updateMeasuredVolume(final int myMeasuredVolume, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMeasuredVolume(myMeasuredVolume);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMeasuredVolume(myMeasuredVolume);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateMeasuredVolume(final int myMeasuredVolume) {
		updateMeasuredVolume(myMeasuredVolume, null);
	}

	/*
	 * <!-- Start of user code comment for mecanicalStrength property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code mecanicalStrengthproperty method
			//End of user code
		}
		return this.mecanicalStrengthProperty;
	}
	
	/*
	 * <!-- Start of user code comment for mecanicalStrength getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getMecanicalStrength(){
		return mecanicalStrengthProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for mecanicalStrength setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setMecanicalStrength(int myMecanicalStrength){
		this.mecanicalStrengthProperty().set(myMecanicalStrength);
	}
	
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
	
	public void updateMecanicalStrength(final int myMecanicalStrength) {
		updateMecanicalStrength(myMecanicalStrength, null);
	}

	/*
	 * <!-- Start of user code comment for minimalProtectedHeight property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty minimalProtectedHeightProperty(){
		if (this.minimalProtectedHeightProperty == null) {
			this.minimalProtectedHeightProperty = new SimpleIntegerProperty(testedRoomCriteria.getMinimalProtectedHeight());
			this.minimalProtectedHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setMinimalProtectedHeight((Integer) arg2);
				}
			});
			//Start of user code minimalProtectedHeightproperty method
			//End of user code
		}
		return this.minimalProtectedHeightProperty;
	}
	
	/*
	 * <!-- Start of user code comment for minimalProtectedHeight getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getMinimalProtectedHeight(){
		return minimalProtectedHeightProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for minimalProtectedHeight setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setMinimalProtectedHeight(int myMinimalProtectedHeight){
		this.minimalProtectedHeightProperty().set(myMinimalProtectedHeight);
	}
	
	public void updateMinimalProtectedHeight(final int myMinimalProtectedHeight, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMinimalProtectedHeight(myMinimalProtectedHeight);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMinimalProtectedHeight(myMinimalProtectedHeight);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateMinimalProtectedHeight(final int myMinimalProtectedHeight) {
		updateMinimalProtectedHeight(myMinimalProtectedHeight, null);
	}

	/*
	 * <!-- Start of user code comment for name property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code nameproperty method
			//End of user code
		}
		return this.nameProperty;
	}
	
	/*
	 * <!-- Start of user code comment for name getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getName(){
		return nameProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for name setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for netVolume property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty netVolumeProperty(){
		if (this.netVolumeProperty == null) {
			this.netVolumeProperty = new SimpleIntegerProperty(testedRoomCriteria.getNetVolume());
			this.netVolumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setNetVolume((Integer) arg2);
				}
			});
			//Start of user code netVolumeproperty method
			//End of user code
		}
		return this.netVolumeProperty;
	}
	
	/*
	 * <!-- Start of user code comment for netVolume getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getNetVolume(){
		return netVolumeProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for netVolume setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setNetVolume(int myNetVolume){
		this.netVolumeProperty().set(myNetVolume);
	}
	
	public void updateNetVolume(final int myNetVolume, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNetVolume(myNetVolume);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNetVolume(myNetVolume);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateNetVolume(final int myNetVolume) {
		updateNetVolume(myNetVolume, null);
	}

	/*
	 * <!-- Start of user code comment for risqueHeight property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty risqueHeightProperty(){
		if (this.risqueHeightProperty == null) {
			this.risqueHeightProperty = new SimpleIntegerProperty(testedRoomCriteria.getRisqueHeight());
			this.risqueHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setRisqueHeight((Integer) arg2);
				}
			});
			//Start of user code risqueHeightproperty method
			//End of user code
		}
		return this.risqueHeightProperty;
	}
	
	/*
	 * <!-- Start of user code comment for risqueHeight getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getRisqueHeight(){
		return risqueHeightProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for risqueHeight setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setRisqueHeight(int myRisqueHeight){
		this.risqueHeightProperty().set(myRisqueHeight);
	}
	
	public void updateRisqueHeight(final int myRisqueHeight, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeight(myRisqueHeight);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeight(myRisqueHeight);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRisqueHeight(final int myRisqueHeight) {
		updateRisqueHeight(myRisqueHeight, null);
	}

	/*
	 * <!-- Start of user code comment for risqueHeightPercentMax property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code risqueHeightPercentMaxproperty method
			//End of user code
		}
		return this.risqueHeightPercentMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for risqueHeightPercentMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getRisqueHeightPercentMax(){
		return risqueHeightPercentMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for risqueHeightPercentMax setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for risqueHeightPercentMin property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code risqueHeightPercentMinproperty method
			//End of user code
		}
		return this.risqueHeightPercentMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for risqueHeightPercentMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getRisqueHeightPercentMin(){
		return risqueHeightPercentMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for risqueHeightPercentMin setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for totalHeight property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty totalHeightProperty(){
		if (this.totalHeightProperty == null) {
			this.totalHeightProperty = new SimpleIntegerProperty(testedRoomCriteria.getTotalHeight());
			this.totalHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setTotalHeight((Integer) arg2);
				}
			});
			//Start of user code totalHeightproperty method
			//End of user code
		}
		return this.totalHeightProperty;
	}
	
	/*
	 * <!-- Start of user code comment for totalHeight getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getTotalHeight(){
		return totalHeightProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for totalHeight setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setTotalHeight(int myTotalHeight){
		this.totalHeightProperty().set(myTotalHeight);
	}
	
	public void updateTotalHeight(final int myTotalHeight, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTotalHeight(myTotalHeight);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTotalHeight(myTotalHeight);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTotalHeight(final int myTotalHeight) {
		updateTotalHeight(myTotalHeight, null);
	}

	/*
	 * <!-- Start of user code comment for uniformHorizontality property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code uniformHorizontalityproperty method
			//End of user code
		}
		return this.uniformHorizontalityProperty;
	}
	
	/*
	 * <!-- Start of user code comment for uniformHorizontality getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isUniformHorizontality(){
		return uniformHorizontalityProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for uniformHorizontality setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for unloadTime property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty unloadTimeProperty(){
		if (this.unloadTimeProperty == null) {
			this.unloadTimeProperty = new SimpleIntegerProperty(testedRoomCriteria.getUnloadTime());
			this.unloadTimeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setUnloadTime((Integer) arg2);
				}
			});
			//Start of user code unloadTimeproperty method
			//End of user code
		}
		return this.unloadTimeProperty;
	}
	
	/*
	 * <!-- Start of user code comment for unloadTime getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getUnloadTime(){
		return unloadTimeProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for unloadTime setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setUnloadTime(int myUnloadTime){
		this.unloadTimeProperty().set(myUnloadTime);
	}
	
	public void updateUnloadTime(final int myUnloadTime, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUnloadTime(myUnloadTime);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUnloadTime(myUnloadTime);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateUnloadTime(final int myUnloadTime) {
		updateUnloadTime(myUnloadTime, null);
	}

	/*
	 * <!-- Start of user code comment for updateDateMax property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code updateDateMaxproperty method
			//End of user code
		}
		return updateDateMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for updateDateMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getUpdateDateMax(){
		return updateDateMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for updateDateMax setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for updateDateMin property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code updateDateMinproperty method
			//End of user code
		}
		return updateDateMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for updateDateMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getUpdateDateMin(){
		return updateDateMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for updateDateMin setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for version property method 
		-->
	 * <!-- End of user code -->
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
			//Start of user code versionproperty method
			//End of user code
		}
		return this.versionProperty;
	}
	
	/*
	 * <!-- Start of user code comment for version getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getVersion(){
		return versionProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for version setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for volumeCorrection property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty volumeCorrectionProperty(){
		if (this.volumeCorrectionProperty == null) {
			this.volumeCorrectionProperty = new SimpleIntegerProperty(testedRoomCriteria.getVolumeCorrection());
			this.volumeCorrectionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoomCriteria.setVolumeCorrection((Integer) arg2);
				}
			});
			//Start of user code volumeCorrectionproperty method
			//End of user code
		}
		return this.volumeCorrectionProperty;
	}
	
	/*
	 * <!-- Start of user code comment for volumeCorrection getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getVolumeCorrection(){
		return volumeCorrectionProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for volumeCorrection setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setVolumeCorrection(int myVolumeCorrection){
		this.volumeCorrectionProperty().set(myVolumeCorrection);
	}
	
	public void updateVolumeCorrection(final int myVolumeCorrection, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVolumeCorrection(myVolumeCorrection);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVolumeCorrection(myVolumeCorrection);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateVolumeCorrection(final int myVolumeCorrection) {
		updateVolumeCorrection(myVolumeCorrection, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
