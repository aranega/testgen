package com.dooapp.fireaOLD.wrapper;

import com.dooapp.fireaOLD.entity.TestedRoomBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.beans.property.ReadOnlyObjectProperty;
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
import com.dooapp.fireaOLD.entity.BlowHoleBean;
//Start of user code for imports
// TODO: import me!
//End of user code


//Start of user code comment for TestedRoom Class

//End of user code

public class TestedRoom implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<java.util.Date> commissioningDateProperty;
	
	private IntegerProperty altitudeProperty;
	
	private ObjectProperty<ObservableList<BlowHole>> blowholesProperty;
	
	private IntegerProperty choosenProtectedHeightProperty;
	
	private BooleanProperty clapetsCFProperty;
	
	private BooleanProperty climDuctProperty;
	
	private BooleanProperty climReclycleProperty;
	
	private BooleanProperty climReclycleAutoProperty;
	
	private BooleanProperty climVMCProperty;
	
	private StringProperty climVMCAutoProperty;
	
	private BooleanProperty climWithNewAirProperty;
	
	private BooleanProperty climWithNewAirAutoProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private IntegerProperty droppedCeilingProperty;
	
	private IntegerProperty droppedFloorProperty;
	
	private LongProperty idProperty;
	
	private IntegerProperty indicatedVolumeProperty;
	
	private IntegerProperty mainHeightProperty;
	
	private IntegerProperty measuredVolumeProperty;
	
	private IntegerProperty mecanicalStrengthProperty;
	
	private IntegerProperty minimalProtectedHeightProperty;
	
	private StringProperty nameProperty;
	
	private IntegerProperty netVolumeProperty;
	
	private IntegerProperty risqueHeightProperty;
	
	private DoubleProperty risqueHeightPercentProperty;
	
	private IntegerProperty totalHeightProperty;
	
	private BooleanProperty uniformHorizontalityProperty;
	
	private IntegerProperty unloadTimeProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;
	
	private IntegerProperty volumeCorrectionProperty;

	/**
	 * Handled Entity
	 */
	private final TestedRoomBean testedRoom;

	/*
	 * Constructors
	 * <!-- Start of user code comment for TestedRoom constructor
	 * End of user code -->
	 */
	public TestedRoom(){
		this(new TestedRoomBean());	
	}
	
	
	public TestedRoom(TestedRoomBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.testedRoom = entity;
	}
	
	public TestedRoomBean getTestedRoomBean(){
		return this.testedRoom;
	}
	
	public TestedRoomBean getBean() {
		return  this.testedRoom;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for CommissioningDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> commissioningDateProperty() {
		if (commissioningDateProperty == null) {
			commissioningDateProperty = new SimpleObjectProperty<java.util.Date>(testedRoom.getCommissioningDate());
			commissioningDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoom.setCommissioningDate(arg2);
				}
			});
			//Start of user code CommissioningDateproperty method
			//End of user code
		}
		return commissioningDateProperty;
	}
	
	/*
	 * <!-- Start of user code comment for CommissioningDate getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getCommissioningDate(){
		return commissioningDateProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for CommissioningDate setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCommissioningDate(java.util.Date myCommissioningDate){
		if (commissioningDateProperty == null) {
				testedRoom.setCommissioningDate(myCommissioningDate);
			} else {
				this.commissioningDateProperty().set(myCommissioningDate);
			}
	}
	
	public void updateCommissioningDate(final java.util.Date myCommissioningDate, final Object mutex) {
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
	
	public void updateCommissioningDate(final java.util.Date myCommissioningDate) {
		updateCommissioningDate(myCommissioningDate, null);
	}

	/*
	 * <!-- Start of user code comment for altitude property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty altitudeProperty(){
		if (this.altitudeProperty == null) {
			this.altitudeProperty = new SimpleIntegerProperty(testedRoom.getAltitude());
			this.altitudeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setAltitude((Integer) arg2);
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
	 * <!-- Start of user code comment for blowholes property method 
		-->
	 * <!-- End of user code -->
	 */
	public ReadOnlyObjectProperty<ObservableList<BlowHole>> blowholesProperty() {
		if (blowholesProperty == null) {
			blowholesProperty = new SimpleObjectProperty<ObservableList<BlowHole>>(
					FXCollections.<BlowHole> observableArrayList());
			for (BlowHoleBean b : testedRoom.getBlowholes()) {
				blowholesProperty.get().add(b.getWrapper());
			}
			blowholesProperty.get().addListener(new javafx.collections.ListChangeListener<BlowHole>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends BlowHole> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (BlowHole tmp : change.getAddedSubList()) {
								testedRoom.addBlowholes(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (BlowHole tmp : change.getRemoved()) {
								testedRoom.getBlowholes().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
			//Start of user code blowholesproperty method
			//End of user code
		}
		return blowholesProperty;
	}
	
	/*
	 * <!-- Start of user code comment for blowholes getter 
		-->
	 * <!-- End of user code -->
	 */
	public ObservableList<BlowHole> getBlowholes()
	{ 
		return blowholesProperty().get(); 
	}

	/*
	 * <!-- Start of user code comment for choosenProtectedHeight property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty choosenProtectedHeightProperty(){
		if (this.choosenProtectedHeightProperty == null) {
			this.choosenProtectedHeightProperty = new SimpleIntegerProperty(testedRoom.getChoosenProtectedHeight());
			this.choosenProtectedHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setChoosenProtectedHeight((Integer) arg2);
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
			this.clapetsCFProperty = new SimpleBooleanProperty(testedRoom.isClapetsCF());
			this.clapetsCFProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClapetsCF((Boolean) arg2);
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
			this.climDuctProperty = new SimpleBooleanProperty(testedRoom.isClimDuct());
			this.climDuctProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimDuct((Boolean) arg2);
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
			this.climReclycleProperty = new SimpleBooleanProperty(testedRoom.isClimReclycle());
			this.climReclycleProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimReclycle((Boolean) arg2);
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
			this.climReclycleAutoProperty = new SimpleBooleanProperty(testedRoom.isClimReclycleAuto());
			this.climReclycleAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimReclycleAuto((Boolean) arg2);
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
			this.climVMCProperty = new SimpleBooleanProperty(testedRoom.isClimVMC());
			this.climVMCProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimVMC((Boolean) arg2);
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
	public StringProperty climVMCAutoProperty(){
		if (this.climVMCAutoProperty == null) {
			this.climVMCAutoProperty = new SimpleStringProperty(testedRoom.getClimVMCAuto());
			this.climVMCAutoProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					testedRoom.setClimVMCAuto((String) arg2);
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
	public String getClimVMCAuto(){
		return climVMCAutoProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for climVMCAuto setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setClimVMCAuto(String myClimVMCAuto){
		this.climVMCAutoProperty().set(myClimVMCAuto);
	}
	
	public void updateClimVMCAuto(final String myClimVMCAuto, final Object mutex) {
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
	
	public void updateClimVMCAuto(final String myClimVMCAuto) {
		updateClimVMCAuto(myClimVMCAuto, null);
	}

	/*
	 * <!-- Start of user code comment for climWithNewAir property method 
		-->
	 * <!-- End of user code -->
	 */
	public BooleanProperty climWithNewAirProperty(){
		if (this.climWithNewAirProperty == null) {
			this.climWithNewAirProperty = new SimpleBooleanProperty(testedRoom.isClimWithNewAir());
			this.climWithNewAirProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimWithNewAir((Boolean) arg2);
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
			this.climWithNewAirAutoProperty = new SimpleBooleanProperty(testedRoom.isClimWithNewAirAuto());
			this.climWithNewAirAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimWithNewAirAuto((Boolean) arg2);
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
	 * <!-- Start of user code comment for creationDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(testedRoom.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoom.setCreationDate(arg2);
				}
			});
			//Start of user code creationDateproperty method
			//End of user code
		}
		return creationDateProperty;
	}
	
	/*
	 * <!-- Start of user code comment for creationDate getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getCreationDate(){
		return creationDateProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for creationDate setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCreationDate(java.util.Date myCreationDate){
		if (creationDateProperty == null) {
				testedRoom.setCreationDate(myCreationDate);
			} else {
				this.creationDateProperty().set(myCreationDate);
			}
	}
	
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
	
	public void updateCreationDate(final java.util.Date myCreationDate) {
		updateCreationDate(myCreationDate, null);
	}

	/*
	 * <!-- Start of user code comment for droppedCeiling property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty droppedCeilingProperty(){
		if (this.droppedCeilingProperty == null) {
			this.droppedCeilingProperty = new SimpleIntegerProperty(testedRoom.getDroppedCeiling());
			this.droppedCeilingProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setDroppedCeiling((Integer) arg2);
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
			this.droppedFloorProperty = new SimpleIntegerProperty(testedRoom.getDroppedFloor());
			this.droppedFloorProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setDroppedFloor((Integer) arg2);
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
	 * <!-- Start of user code comment for id property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(testedRoom.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setId((Long) arg2);
				}
			});
			//Start of user code idproperty method
			//End of user code
		}
		return this.idProperty;
	}
	
	/*
	 * <!-- Start of user code comment for id getter 
		-->
	 * <!-- End of user code -->
	 */
	public long getId(){
		return idProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for id setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setId(long myId){
		this.idProperty().set(myId);
	}
	
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
	
	public void updateId(final long myId) {
		updateId(myId, null);
	}

	/*
	 * <!-- Start of user code comment for indicatedVolume property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty indicatedVolumeProperty(){
		if (this.indicatedVolumeProperty == null) {
			this.indicatedVolumeProperty = new SimpleIntegerProperty(testedRoom.getIndicatedVolume());
			this.indicatedVolumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setIndicatedVolume((Integer) arg2);
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
			this.mainHeightProperty = new SimpleIntegerProperty(testedRoom.getMainHeight());
			this.mainHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setMainHeight((Integer) arg2);
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
			this.measuredVolumeProperty = new SimpleIntegerProperty(testedRoom.getMeasuredVolume());
			this.measuredVolumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setMeasuredVolume((Integer) arg2);
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
			this.mecanicalStrengthProperty = new SimpleIntegerProperty(testedRoom.getMecanicalStrength());
			this.mecanicalStrengthProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setMecanicalStrength((Integer) arg2);
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
			this.minimalProtectedHeightProperty = new SimpleIntegerProperty(testedRoom.getMinimalProtectedHeight());
			this.minimalProtectedHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setMinimalProtectedHeight((Integer) arg2);
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
			this.nameProperty = new SimpleStringProperty(testedRoom.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					testedRoom.setName((String) arg2);
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
			this.netVolumeProperty = new SimpleIntegerProperty(testedRoom.getNetVolume());
			this.netVolumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setNetVolume((Integer) arg2);
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
			this.risqueHeightProperty = new SimpleIntegerProperty(testedRoom.getRisqueHeight());
			this.risqueHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setRisqueHeight((Integer) arg2);
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
	 * <!-- Start of user code comment for risqueHeightPercent property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty risqueHeightPercentProperty(){
		if (this.risqueHeightPercentProperty == null) {
			this.risqueHeightPercentProperty = new SimpleDoubleProperty(testedRoom.getRisqueHeightPercent());
			this.risqueHeightPercentProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setRisqueHeightPercent((Double) arg2);
				}
			});
			//Start of user code risqueHeightPercentproperty method
			//End of user code
		}
		return this.risqueHeightPercentProperty;
	}
	
	/*
	 * <!-- Start of user code comment for risqueHeightPercent getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getRisqueHeightPercent(){
		return risqueHeightPercentProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for risqueHeightPercent setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setRisqueHeightPercent(double myRisqueHeightPercent){
		this.risqueHeightPercentProperty().set(myRisqueHeightPercent);
	}
	
	public void updateRisqueHeightPercent(final double myRisqueHeightPercent, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeightPercent(myRisqueHeightPercent);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeightPercent(myRisqueHeightPercent);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRisqueHeightPercent(final double myRisqueHeightPercent) {
		updateRisqueHeightPercent(myRisqueHeightPercent, null);
	}

	/*
	 * <!-- Start of user code comment for totalHeight property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty totalHeightProperty(){
		if (this.totalHeightProperty == null) {
			this.totalHeightProperty = new SimpleIntegerProperty(testedRoom.getTotalHeight());
			this.totalHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setTotalHeight((Integer) arg2);
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
			this.uniformHorizontalityProperty = new SimpleBooleanProperty(testedRoom.isUniformHorizontality());
			this.uniformHorizontalityProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setUniformHorizontality((Boolean) arg2);
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
			this.unloadTimeProperty = new SimpleIntegerProperty(testedRoom.getUnloadTime());
			this.unloadTimeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setUnloadTime((Integer) arg2);
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
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(testedRoom.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoom.setUpdateDate(arg2);
				}
			});
			//Start of user code updateDateproperty method
			//End of user code
		}
		return updateDateProperty;
	}
	
	/*
	 * <!-- Start of user code comment for updateDate getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getUpdateDate(){
		return updateDateProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for updateDate setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setUpdateDate(java.util.Date myUpdateDate){
		if (updateDateProperty == null) {
				testedRoom.setUpdateDate(myUpdateDate);
			} else {
				this.updateDateProperty().set(myUpdateDate);
			}
	}
	
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
	
	public void updateUpdateDate(final java.util.Date myUpdateDate) {
		updateUpdateDate(myUpdateDate, null);
	}

	/*
	 * <!-- Start of user code comment for version property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty versionProperty(){
		if (this.versionProperty == null) {
			this.versionProperty = new SimpleIntegerProperty(testedRoom.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setVersion((Integer) arg2);
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
			this.volumeCorrectionProperty = new SimpleIntegerProperty(testedRoom.getVolumeCorrection());
			this.volumeCorrectionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setVolumeCorrection((Integer) arg2);
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
