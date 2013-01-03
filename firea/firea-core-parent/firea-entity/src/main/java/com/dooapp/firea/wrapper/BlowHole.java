package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.BlowHoleBean;

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




public class BlowHole implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<com.dooapp.firea.entity.Discharge> dischargeProperty;
	
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
	public ObjectProperty<com.dooapp.firea.entity.Discharge> dischargeProperty() {
		if (dischargeProperty == null) {
			dischargeProperty = new SimpleObjectProperty<com.dooapp.firea.entity.Discharge>(blowHole.getDischarge());
			dischargeProperty.addListener(new ChangeListener<com.dooapp.firea.entity.Discharge>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.Discharge> arg0, com.dooapp.firea.entity.Discharge arg1, com.dooapp.firea.entity.Discharge arg2) {
					blowHole.setDischarge(arg2);
				}
			});
			//Start of user code Dischargeproperty method
			//End of user code
		}
		return dischargeProperty;
	}
	
	public com.dooapp.firea.entity.Discharge getDischarge(){
		return dischargeProperty().get();
	} 
	
	public void setDischarge(com.dooapp.firea.entity.Discharge myDischarge){
		if (dischargeProperty == null) {
				blowHole.setDischarge(myDischarge);
			} else {
				this.dischargeProperty().set(myDischarge);
			}
	}
	
	public void updateDischarge(final com.dooapp.firea.entity.Discharge myDischarge, final Object mutex) {
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
	
	public void updateDischarge(final com.dooapp.firea.entity.Discharge myDischarge) {
		updateDischarge(myDischarge, null);
	}

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
	
	public java.util.Date getCreationDate(){
		return creationDateProperty().get();
	} 
	
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
	
	public long getId(){
		return idProperty().get();
	} 
	
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
	
	public int getQuantity(){
		return quantityProperty().get();
	} 
	
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
	
	public double getSurface(){
		return surfaceProperty().get();
	} 
	
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
	
	public TestedRoom getTestedroom(){
		return testedroomProperty().get();
	} 
	
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
	
	public java.util.Date getUpdateDate(){
		return updateDateProperty().get();
	} 
	
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


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
