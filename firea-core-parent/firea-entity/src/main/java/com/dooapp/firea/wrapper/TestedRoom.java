package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.TestedRoomBean;

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
import javafx.beans.property.ReadOnlyDoubleProperty;




import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Attribute;
import org.jdom2.Element;

/**
 * 
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class TestedRoom
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	/**
	 * Altitude de la pièce
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty altitudeProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<BlowHoleConfiguration> blowholeconfigurationProperty;
	/**
	 * H.P. Retenue (en m)
	Hauteur protégée retenue = max(minimalProtectedHeight,risqueHeight)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty choosenProtectedHeightProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty clapetsCFProperty;
	/**
	 * 
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
	 * Date de mise en service de la pièce
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
	private ObjectProperty<java.util.Date> creationDateProperty;
	/**
	 * Hauteur de faux plafond (en m)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty droppedCeilingProperty;
	/**
	 * Hauteur de faux plancher (en m)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty droppedFloorProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private LongProperty idProperty;
	/**
	 * Volume indiqué (en m3)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty indicatedVolumeProperty;
	/**
	 * Hauteur d'ambiance (en m)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty mainHeightProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty measuredPressureProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty measuredTemperatureProperty;
	/**
	 * Volume mesurée (en m3)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty measuredVolumeProperty;
	/**
	 * Résistance mécanique (en Pa)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty mecanicalStrengthProperty;
	/**
	 * H.P. min (en m)
	
	H.P. min = risqueHeightPercent * totalHeight
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty minimalProtectedHeightProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty nameProperty;
	/**
	 * Volume net (en m3)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty netVolumeProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedPressureProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedTemperatureProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Project> projectProperty;
	/**
	 * Hauteur du risque (en m)
	
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty risqueHeightProperty;
	/**
	 * Pourcentage de hauteur du risque (en %)
	(en 0 et 100)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty risqueHeightPercentProperty;
	/**
	 * Hauteur totale (en m)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty totalHeightProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty uniformHorizontalityProperty;
	/**
	 * Temps de décharge (en sec)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty unloadTimeProperty;
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
	 * Correction apporté au volume (en m3)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty volumeCorrectionProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private final TestedRoomBean testedRoom;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoom(){
		this(new TestedRoomBean());	
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoomBean getTestedRoomBean(){
		return this.testedRoom;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoomBean getBean() {
		return  this.testedRoom;
	}
	

	/*
	 * Generated getters and setters
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
	public ObjectProperty<BlowHoleConfiguration> blowholeconfigurationProperty() {
		if (blowholeconfigurationProperty == null) {
			blowholeconfigurationProperty = new SimpleObjectProperty<BlowHoleConfiguration>(testedRoom.getBlowholeconfiguration() == null ? null : testedRoom
					.getBlowholeconfiguration().getWrapper());
			blowholeconfigurationProperty.addListener(new ChangeListener<BlowHoleConfiguration>() {
				@Override
				public void changed(ObservableValue<? extends BlowHoleConfiguration> obj, BlowHoleConfiguration oldValue, BlowHoleConfiguration newValue) {
					testedRoom.setBlowholeconfiguration(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return blowholeconfigurationProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BlowHoleConfiguration getBlowholeconfiguration(){
		return blowholeconfigurationProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setBlowholeconfiguration(BlowHoleConfiguration myBlowholeconfiguration){
		if (blowholeconfigurationProperty == null) {
				testedRoom.setBlowholeconfiguration(myBlowholeconfiguration == null ? null : myBlowholeconfiguration.getBean());
			} else {
				this.blowholeconfigurationProperty().set(myBlowholeconfiguration);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateBlowholeconfiguration(final BlowHoleConfiguration myBlowholeconfiguration, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBlowholeconfiguration(myBlowholeconfiguration);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBlowholeconfiguration(myBlowholeconfiguration);
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
	public void updateBlowholeconfiguration(final BlowHoleConfiguration myBlowholeconfiguration) {
		updateBlowholeconfiguration(myBlowholeconfiguration, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ReadOnlyDoubleProperty choosenProtectedHeightProperty(){
		if (this.choosenProtectedHeightProperty == null) {
			this.choosenProtectedHeightProperty = new SimpleDoubleProperty(testedRoom.getChoosenProtectedHeight());
		}
		return this.choosenProtectedHeightProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getChoosenProtectedHeight(){
		return choosenProtectedHeightProperty().get();
	} 
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
			this.climDuctProperty = new SimpleBooleanProperty(testedRoom.isClimDuct());
			this.climDuctProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimDuct((Boolean) arg2);
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
			this.climReclycleProperty = new SimpleBooleanProperty(testedRoom.isClimReclycle());
			this.climReclycleProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimReclycle((Boolean) arg2);
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
			this.climReclycleAutoProperty = new SimpleBooleanProperty(testedRoom.isClimReclycleAuto());
			this.climReclycleAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimReclycleAuto((Boolean) arg2);
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
			this.climVMCProperty = new SimpleBooleanProperty(testedRoom.isClimVMC());
			this.climVMCProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimVMC((Boolean) arg2);
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
			this.climVMCAutoProperty = new SimpleBooleanProperty(testedRoom.isClimVMCAuto());
			this.climVMCAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimVMCAuto((Boolean) arg2);
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
			this.climWithNewAirProperty = new SimpleBooleanProperty(testedRoom.isClimWithNewAir());
			this.climWithNewAirProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimWithNewAir((Boolean) arg2);
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
			this.climWithNewAirAutoProperty = new SimpleBooleanProperty(testedRoom.isClimWithNewAirAuto());
			this.climWithNewAirAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					testedRoom.setClimWithNewAirAuto((Boolean) arg2);
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
			this.commissioningDateProperty = new SimpleIntegerProperty(testedRoom.getCommissioningDate());
			this.commissioningDateProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setCommissioningDate((Integer) arg2);
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
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(testedRoom.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					testedRoom.setCreationDate(arg2);
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
				testedRoom.setCreationDate(myCreationDate);
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
	public DoubleProperty droppedCeilingProperty(){
		if (this.droppedCeilingProperty == null) {
			this.droppedCeilingProperty = new SimpleDoubleProperty(testedRoom.getDroppedCeiling());
			this.droppedCeilingProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setDroppedCeiling((Double) arg2);
				}
			});
		}
		return this.droppedCeilingProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getDroppedCeiling(){
		return droppedCeilingProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedCeiling(double myDroppedCeiling){
		this.droppedCeilingProperty().set(myDroppedCeiling);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedCeiling(final double myDroppedCeiling, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedCeiling(final double myDroppedCeiling) {
		updateDroppedCeiling(myDroppedCeiling, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty droppedFloorProperty(){
		if (this.droppedFloorProperty == null) {
			this.droppedFloorProperty = new SimpleDoubleProperty(testedRoom.getDroppedFloor());
			this.droppedFloorProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setDroppedFloor((Double) arg2);
				}
			});
		}
		return this.droppedFloorProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getDroppedFloor(){
		return droppedFloorProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedFloor(double myDroppedFloor){
		this.droppedFloorProperty().set(myDroppedFloor);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedFloor(final double myDroppedFloor, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedFloor(final double myDroppedFloor) {
		updateDroppedFloor(myDroppedFloor, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
	public DoubleProperty indicatedVolumeProperty(){
		if (this.indicatedVolumeProperty == null) {
			this.indicatedVolumeProperty = new SimpleDoubleProperty(testedRoom.getIndicatedVolume());
			this.indicatedVolumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setIndicatedVolume((Double) arg2);
				}
			});
		}
		return this.indicatedVolumeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getIndicatedVolume(){
		return indicatedVolumeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setIndicatedVolume(double myIndicatedVolume){
		this.indicatedVolumeProperty().set(myIndicatedVolume);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIndicatedVolume(final double myIndicatedVolume, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIndicatedVolume(final double myIndicatedVolume) {
		updateIndicatedVolume(myIndicatedVolume, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty mainHeightProperty(){
		if (this.mainHeightProperty == null) {
			this.mainHeightProperty = new SimpleDoubleProperty(testedRoom.getMainHeight());
			this.mainHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setMainHeight((Double) arg2);
				}
			});
		}
		return this.mainHeightProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMainHeight(){
		return mainHeightProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMainHeight(double myMainHeight){
		this.mainHeightProperty().set(myMainHeight);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMainHeight(final double myMainHeight, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMainHeight(final double myMainHeight) {
		updateMainHeight(myMainHeight, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty measuredPressureProperty(){
		if (this.measuredPressureProperty == null) {
			this.measuredPressureProperty = new SimpleDoubleProperty(testedRoom.getMeasuredPressure());
			this.measuredPressureProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setMeasuredPressure((Double) arg2);
				}
			});
		}
		return this.measuredPressureProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMeasuredPressure(){
		return measuredPressureProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredPressure(double myMeasuredPressure){
		this.measuredPressureProperty().set(myMeasuredPressure);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredPressure(final double myMeasuredPressure, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMeasuredPressure(myMeasuredPressure);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMeasuredPressure(myMeasuredPressure);
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
	public void updateMeasuredPressure(final double myMeasuredPressure) {
		updateMeasuredPressure(myMeasuredPressure, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty measuredTemperatureProperty(){
		if (this.measuredTemperatureProperty == null) {
			this.measuredTemperatureProperty = new SimpleDoubleProperty(testedRoom.getMeasuredTemperature());
			this.measuredTemperatureProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setMeasuredTemperature((Double) arg2);
				}
			});
		}
		return this.measuredTemperatureProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMeasuredTemperature(){
		return measuredTemperatureProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredTemperature(double myMeasuredTemperature){
		this.measuredTemperatureProperty().set(myMeasuredTemperature);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredTemperature(final double myMeasuredTemperature, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMeasuredTemperature(myMeasuredTemperature);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMeasuredTemperature(myMeasuredTemperature);
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
	public void updateMeasuredTemperature(final double myMeasuredTemperature) {
		updateMeasuredTemperature(myMeasuredTemperature, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty measuredVolumeProperty(){
		if (this.measuredVolumeProperty == null) {
			this.measuredVolumeProperty = new SimpleDoubleProperty(testedRoom.getMeasuredVolume());
			this.measuredVolumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setMeasuredVolume((Double) arg2);
				}
			});
		}
		return this.measuredVolumeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMeasuredVolume(){
		return measuredVolumeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredVolume(double myMeasuredVolume){
		this.measuredVolumeProperty().set(myMeasuredVolume);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredVolume(final double myMeasuredVolume, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredVolume(final double myMeasuredVolume) {
		updateMeasuredVolume(myMeasuredVolume, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
	public DoubleProperty minimalProtectedHeightProperty(){
		if (this.minimalProtectedHeightProperty == null) {
			this.minimalProtectedHeightProperty = new SimpleDoubleProperty(testedRoom.getMinimalProtectedHeight());
			this.minimalProtectedHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setMinimalProtectedHeight((Double) arg2);
				}
			});
		}
		return this.minimalProtectedHeightProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMinimalProtectedHeight(){
		return minimalProtectedHeightProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMinimalProtectedHeight(double myMinimalProtectedHeight){
		this.minimalProtectedHeightProperty().set(myMinimalProtectedHeight);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMinimalProtectedHeight(final double myMinimalProtectedHeight, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMinimalProtectedHeight(final double myMinimalProtectedHeight) {
		updateMinimalProtectedHeight(myMinimalProtectedHeight, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
	public DoubleProperty netVolumeProperty(){
		if (this.netVolumeProperty == null) {
			this.netVolumeProperty = new SimpleDoubleProperty(testedRoom.getNetVolume());
			this.netVolumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setNetVolume((Double) arg2);
				}
			});
		}
		return this.netVolumeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getNetVolume(){
		return netVolumeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setNetVolume(double myNetVolume){
		this.netVolumeProperty().set(myNetVolume);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNetVolume(final double myNetVolume, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNetVolume(final double myNetVolume) {
		updateNetVolume(myNetVolume, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedPressureProperty(){
		if (this.prescribedPressureProperty == null) {
			this.prescribedPressureProperty = new SimpleDoubleProperty(testedRoom.getPrescribedPressure());
			this.prescribedPressureProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setPrescribedPressure((Double) arg2);
				}
			});
		}
		return this.prescribedPressureProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedPressure(){
		return prescribedPressureProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedPressure(double myPrescribedPressure){
		this.prescribedPressureProperty().set(myPrescribedPressure);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedPressure(final double myPrescribedPressure, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedPressure(myPrescribedPressure);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedPressure(myPrescribedPressure);
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
	public void updatePrescribedPressure(final double myPrescribedPressure) {
		updatePrescribedPressure(myPrescribedPressure, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedTemperatureProperty(){
		if (this.prescribedTemperatureProperty == null) {
			this.prescribedTemperatureProperty = new SimpleDoubleProperty(testedRoom.getPrescribedTemperature());
			this.prescribedTemperatureProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setPrescribedTemperature((Double) arg2);
				}
			});
		}
		return this.prescribedTemperatureProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedTemperature(){
		return prescribedTemperatureProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedTemperature(double myPrescribedTemperature){
		this.prescribedTemperatureProperty().set(myPrescribedTemperature);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedTemperature(final double myPrescribedTemperature, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedTemperature(myPrescribedTemperature);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedTemperature(myPrescribedTemperature);
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
	public void updatePrescribedTemperature(final double myPrescribedTemperature) {
		updatePrescribedTemperature(myPrescribedTemperature, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Project> projectProperty() {
		if (projectProperty == null) {
			projectProperty = new SimpleObjectProperty<Project>(testedRoom.getProject() == null ? null : testedRoom
					.getProject().getWrapper());
			projectProperty.addListener(new ChangeListener<Project>() {
				@Override
				public void changed(ObservableValue<? extends Project> obj, Project oldValue, Project newValue) {
					testedRoom.setProject(newValue == null ? null : newValue.getBean());
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
				testedRoom.setProject(myProject == null ? null : myProject.getBean());
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
	public ReadOnlyDoubleProperty risqueHeightProperty(){
		if (this.risqueHeightProperty == null) {
			this.risqueHeightProperty = new SimpleDoubleProperty(testedRoom.getRisqueHeight());
		}
		return this.risqueHeightProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRisqueHeight(){
		return risqueHeightProperty().get();
	} 
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.risqueHeightPercentProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRisqueHeightPercent(){
		return risqueHeightPercentProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisqueHeightPercent(double myRisqueHeightPercent){
		this.risqueHeightPercentProperty().set(myRisqueHeightPercent);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightPercent(final double myRisqueHeightPercent) {
		updateRisqueHeightPercent(myRisqueHeightPercent, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ReadOnlyDoubleProperty totalHeightProperty(){
		if (this.totalHeightProperty == null) {
			this.totalHeightProperty = new SimpleDoubleProperty(testedRoom.getTotalHeight());
		}
		return this.totalHeightProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getTotalHeight(){
		return totalHeightProperty().get();
	} 
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
	public DoubleProperty unloadTimeProperty(){
		if (this.unloadTimeProperty == null) {
			this.unloadTimeProperty = new SimpleDoubleProperty(testedRoom.getUnloadTime());
			this.unloadTimeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setUnloadTime((Double) arg2);
				}
			});
		}
		return this.unloadTimeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getUnloadTime(){
		return unloadTimeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUnloadTime(double myUnloadTime){
		this.unloadTimeProperty().set(myUnloadTime);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUnloadTime(final double myUnloadTime, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUnloadTime(final double myUnloadTime) {
		updateUnloadTime(myUnloadTime, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
				testedRoom.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(testedRoom.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setVersion((Integer) arg2);
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
	public DoubleProperty volumeCorrectionProperty(){
		if (this.volumeCorrectionProperty == null) {
			this.volumeCorrectionProperty = new SimpleDoubleProperty(testedRoom.getVolumeCorrection());
			this.volumeCorrectionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					testedRoom.setVolumeCorrection((Double) arg2);
				}
			});
		}
		return this.volumeCorrectionProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getVolumeCorrection(){
		return volumeCorrectionProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setVolumeCorrection(double myVolumeCorrection){
		this.volumeCorrectionProperty().set(myVolumeCorrection);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVolumeCorrection(final double myVolumeCorrection, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVolumeCorrection(final double myVolumeCorrection) {
		updateVolumeCorrection(myVolumeCorrection, null);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getTestedRoomBean() != null ? serializer.outputString(this.toDomXML()) : "";
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Element toDomXML(){
		Element xmlElement = new Element("TestedRoom");
		xmlElement.setAttribute(new Attribute("climReclycleAuto", String.valueOf(isClimReclycleAuto())));
		xmlElement.setAttribute(new Attribute("measuredTemperature", String.valueOf(getMeasuredTemperature())));
		xmlElement.setAttribute(new Attribute("climWithNewAirAuto", String.valueOf(isClimWithNewAirAuto())));
		xmlElement.setAttribute(new Attribute("measuredVolume", String.valueOf(getMeasuredVolume())));
		xmlElement.setAttribute(new Attribute("unloadTime", String.valueOf(getUnloadTime())));
		xmlElement.setAttribute(new Attribute("volumeCorrection", String.valueOf(getVolumeCorrection())));
		if (getName() != null)
			xmlElement.setAttribute(new Attribute("name", getName()));
		xmlElement.setAttribute(new Attribute("indicatedVolume", String.valueOf(getIndicatedVolume())));
		xmlElement.setAttribute(new Attribute("climVMC", String.valueOf(isClimVMC())));
		xmlElement.setAttribute(new Attribute("choosenProtectedHeight", String.valueOf(getChoosenProtectedHeight())));
		xmlElement.setAttribute(new Attribute("mecanicalStrength", String.valueOf(getMecanicalStrength())));
		xmlElement.setAttribute(new Attribute("mainHeight", String.valueOf(getMainHeight())));
		xmlElement.setAttribute(new Attribute("droppedCeiling", String.valueOf(getDroppedCeiling())));
		xmlElement.setAttribute(new Attribute("droppedFloor", String.valueOf(getDroppedFloor())));
		xmlElement.setAttribute(new Attribute("climVMCAuto", String.valueOf(isClimVMCAuto())));
		xmlElement.setAttribute(new Attribute("measuredPressure", String.valueOf(getMeasuredPressure())));
		xmlElement.setAttribute(new Attribute("uniformHorizontality", String.valueOf(isUniformHorizontality())));
		xmlElement.setAttribute(new Attribute("minimalProtectedHeight", String.valueOf(getMinimalProtectedHeight())));
		xmlElement.setAttribute(new Attribute("totalHeight", String.valueOf(getTotalHeight())));
		xmlElement.setAttribute(new Attribute("prescribedTemperature", String.valueOf(getPrescribedTemperature())));
		xmlElement.setAttribute(new Attribute("altitude", String.valueOf(getAltitude())));
		xmlElement.setAttribute(new Attribute("climReclycle", String.valueOf(isClimReclycle())));
		xmlElement.setAttribute(new Attribute("prescribedPressure", String.valueOf(getPrescribedPressure())));
		xmlElement.setAttribute(new Attribute("clapetsCF", String.valueOf(isClapetsCF())));
		xmlElement.setAttribute(new Attribute("netVolume", String.valueOf(getNetVolume())));
		xmlElement.setAttribute(new Attribute("commissioningDate", String.valueOf(getCommissioningDate())));
		xmlElement.setAttribute(new Attribute("risqueHeightPercent", String.valueOf(getRisqueHeightPercent())));
		xmlElement.setAttribute(new Attribute("climWithNewAir", String.valueOf(isClimWithNewAir())));
		xmlElement.setAttribute(new Attribute("risqueHeight", String.valueOf(getRisqueHeight())));
		xmlElement.setAttribute(new Attribute("climDuct", String.valueOf(isClimDuct())));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		
		if (getBlowholeconfiguration() != null) {
			Element blowholeconfiguration = new Element("blowholeconfiguration");
			blowholeconfiguration.addContent(getBlowholeconfiguration().toXML());
			xmlElement.addContent(blowholeconfiguration);
		}if (getProject() != null)
			xmlElement.setAttribute("project", String.valueOf(getProject().getId()));
		
		
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
