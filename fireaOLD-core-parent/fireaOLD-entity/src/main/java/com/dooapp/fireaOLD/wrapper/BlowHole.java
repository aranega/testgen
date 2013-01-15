package com.dooapp.fireaOLD.wrapper;

import com.dooapp.fireaOLD.entity.BlowHoleBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
//Start of user code for imports
// TODO: import me!
//End of user code


//Start of user code comment for BlowHole Class

//End of user code

public class BlowHole implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<com.dooapp.fireaOLD.entity.Discharge> dischargeProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private LongProperty idProperty;
	
	private IntegerProperty quantityProperty;
	
	private DoubleProperty surfaceProperty;
	
	private ObjectProperty<TestedRoom> testedroomProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final BlowHoleBean blowHole;

	/*
	 * Constructors
	 * <!-- Start of user code comment for BlowHole constructor
	 * End of user code -->
	 */
	public BlowHole(){
		this(new BlowHoleBean());	
	}
	
	
	public BlowHole(BlowHoleBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.blowHole = entity;
	}
	
	public BlowHoleBean getBlowHoleBean(){
		return this.blowHole;
	}
	
	public BlowHoleBean getBean() {
		return  this.blowHole;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for Discharge property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<com.dooapp.fireaOLD.entity.Discharge> dischargeProperty() {
		if (dischargeProperty == null) {
			dischargeProperty = new SimpleObjectProperty<com.dooapp.fireaOLD.entity.Discharge>(blowHole.getDischarge());
			dischargeProperty.addListener(new ChangeListener<com.dooapp.fireaOLD.entity.Discharge>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.fireaOLD.entity.Discharge> arg0, com.dooapp.fireaOLD.entity.Discharge arg1, com.dooapp.fireaOLD.entity.Discharge arg2) {
					blowHole.setDischarge(arg2);
				}
			});
			//Start of user code Dischargeproperty method
			//End of user code
		}
		return dischargeProperty;
	}
	
	/*
	 * <!-- Start of user code comment for Discharge getter 
		-->
	 * <!-- End of user code -->
	 */
	public com.dooapp.fireaOLD.entity.Discharge getDischarge(){
		return dischargeProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for Discharge setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDischarge(com.dooapp.fireaOLD.entity.Discharge myDischarge){
		if (dischargeProperty == null) {
				blowHole.setDischarge(myDischarge);
			} else {
				this.dischargeProperty().set(myDischarge);
			}
	}
	
	public void updateDischarge(final com.dooapp.fireaOLD.entity.Discharge myDischarge, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDischarge(myDischarge);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDischarge(myDischarge);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDischarge(final com.dooapp.fireaOLD.entity.Discharge myDischarge) {
		updateDischarge(myDischarge, null);
	}

	/*
	 * <!-- Start of user code comment for creationDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(blowHole.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					blowHole.setCreationDate(arg2);
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
				blowHole.setCreationDate(myCreationDate);
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
	 * <!-- Start of user code comment for id property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(blowHole.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHole.setId((Long) arg2);
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
	 * <!-- Start of user code comment for quantity property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty quantityProperty(){
		if (this.quantityProperty == null) {
			this.quantityProperty = new SimpleIntegerProperty(blowHole.getQuantity());
			this.quantityProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHole.setQuantity((Integer) arg2);
				}
			});
			//Start of user code quantityproperty method
			//End of user code
		}
		return this.quantityProperty;
	}
	
	/*
	 * <!-- Start of user code comment for quantity getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getQuantity(){
		return quantityProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for quantity setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setQuantity(int myQuantity){
		this.quantityProperty().set(myQuantity);
	}
	
	public void updateQuantity(final int myQuantity, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setQuantity(myQuantity);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setQuantity(myQuantity);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateQuantity(final int myQuantity) {
		updateQuantity(myQuantity, null);
	}

	/*
	 * <!-- Start of user code comment for surface property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty surfaceProperty(){
		if (this.surfaceProperty == null) {
			this.surfaceProperty = new SimpleDoubleProperty(blowHole.getSurface());
			this.surfaceProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHole.setSurface((Double) arg2);
				}
			});
			//Start of user code surfaceproperty method
			//End of user code
		}
		return this.surfaceProperty;
	}
	
	/*
	 * <!-- Start of user code comment for surface getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getSurface(){
		return surfaceProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for surface setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setSurface(double mySurface){
		this.surfaceProperty().set(mySurface);
	}
	
	public void updateSurface(final double mySurface, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSurface(mySurface);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSurface(mySurface);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateSurface(final double mySurface) {
		updateSurface(mySurface, null);
	}

	/*
	 * <!-- Start of user code comment for testedroom property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<TestedRoom> testedroomProperty() {
		if (testedroomProperty == null) {
			testedroomProperty = new SimpleObjectProperty<TestedRoom>(blowHole.getTestedroom() == null ? null : blowHole
					.getTestedroom().getWrapper());
			testedroomProperty.addListener(new ChangeListener<TestedRoom>() {
				@Override
				public void changed(ObservableValue<? extends TestedRoom> obj, TestedRoom oldValue, TestedRoom newValue) {
					blowHole.setTestedroom(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code testedroomproperty method
			//End of user code
		}
		return testedroomProperty;
	}
	
	/*
	 * <!-- Start of user code comment for testedroom getter 
		-->
	 * <!-- End of user code -->
	 */
	public TestedRoom getTestedroom(){
		return testedroomProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for testedroom setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setTestedroom(TestedRoom myTestedroom){
		if (testedroomProperty == null) {
				blowHole.setTestedroom(myTestedroom == null ? null : myTestedroom.getBean());
			} else {
				this.testedroomProperty().set(myTestedroom);
			}
	}
	
	public void updateTestedroom(final TestedRoom myTestedroom, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTestedroom(myTestedroom);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTestedroom(myTestedroom);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTestedroom(final TestedRoom myTestedroom) {
		updateTestedroom(myTestedroom, null);
	}

	/*
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(blowHole.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					blowHole.setUpdateDate(arg2);
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
				blowHole.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(blowHole.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHole.setVersion((Integer) arg2);
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
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
