package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.BottleConfigurationBean;

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




public class BottleConfiguration implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<BottleType> bottletypeProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private ObjectProperty<GazConfiguration> gazconfigurationProperty;
	
	private LongProperty idProperty;
	
	private DoubleProperty loadProperty;
	
	private IntegerProperty quantityProperty;
	
	private ObjectProperty<com.dooapp.firea.entity.BottleUnit> unitProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final BottleConfigurationBean bottleConfiguration;

	/*
	 * Constructors 
	 */
	public BottleConfiguration(){
		this(new BottleConfigurationBean());	
	}
	
	
	public BottleConfiguration(BottleConfigurationBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.bottleConfiguration = entity;
	}
	
	public BottleConfigurationBean getBottleConfigurationBean(){
		return this.bottleConfiguration;
	}
	
	public BottleConfigurationBean getBean() {
		return  this.bottleConfiguration;
	}
	

	/*
	 * Generated getters and setters
	 */
	public ObjectProperty<BottleType> bottletypeProperty() {
		if (bottletypeProperty == null) {
			bottletypeProperty = new SimpleObjectProperty<BottleType>(bottleConfiguration.getBottletype() == null ? null : bottleConfiguration
					.getBottletype().getWrapper());
			bottletypeProperty.addListener(new ChangeListener<BottleType>() {
				@Override
				public void changed(ObservableValue<? extends BottleType> obj, BottleType oldValue, BottleType newValue) {
					bottleConfiguration.setBottletype(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code bottletypeproperty method
			//End of user code
		}
		return bottletypeProperty;
	}
	
	public BottleType getBottletype(){
		return bottletypeProperty().get();
	} 
	
	public void setBottletype(BottleType myBottletype){
		if (bottletypeProperty == null) {
				bottleConfiguration.setBottletype(myBottletype == null ? null : myBottletype.getBean());
			} else {
				this.bottletypeProperty().set(myBottletype);
			}
	}
	
	public void updateBottletype(final BottleType myBottletype, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBottletype(myBottletype);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBottletype(myBottletype);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateBottletype(final BottleType myBottletype) {
		updateBottletype(myBottletype, null);
	}

	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(bottleConfiguration.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					bottleConfiguration.setCreationDate(arg2);
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
				bottleConfiguration.setCreationDate(myCreationDate);
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

	public ObjectProperty<GazConfiguration> gazconfigurationProperty() {
		if (gazconfigurationProperty == null) {
			gazconfigurationProperty = new SimpleObjectProperty<GazConfiguration>(bottleConfiguration.getGazconfiguration() == null ? null : bottleConfiguration
					.getGazconfiguration().getWrapper());
			gazconfigurationProperty.addListener(new ChangeListener<GazConfiguration>() {
				@Override
				public void changed(ObservableValue<? extends GazConfiguration> obj, GazConfiguration oldValue, GazConfiguration newValue) {
					bottleConfiguration.setGazconfiguration(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code gazconfigurationproperty method
			//End of user code
		}
		return gazconfigurationProperty;
	}
	
	public GazConfiguration getGazconfiguration(){
		return gazconfigurationProperty().get();
	} 
	
	public void setGazconfiguration(GazConfiguration myGazconfiguration){
		if (gazconfigurationProperty == null) {
				bottleConfiguration.setGazconfiguration(myGazconfiguration == null ? null : myGazconfiguration.getBean());
			} else {
				this.gazconfigurationProperty().set(myGazconfiguration);
			}
	}
	
	public void updateGazconfiguration(final GazConfiguration myGazconfiguration, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setGazconfiguration(myGazconfiguration);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setGazconfiguration(myGazconfiguration);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateGazconfiguration(final GazConfiguration myGazconfiguration) {
		updateGazconfiguration(myGazconfiguration, null);
	}

	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(bottleConfiguration.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleConfiguration.setId((Long) arg2);
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

	public DoubleProperty loadProperty(){
		if (this.loadProperty == null) {
			this.loadProperty = new SimpleDoubleProperty(bottleConfiguration.getLoad());
			this.loadProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleConfiguration.setLoad((Double) arg2);
				}
			});
			//Start of user code loadproperty method
			//End of user code
		}
		return this.loadProperty;
	}
	
	public double getLoad(){
		return loadProperty().get();
	} 
	
	public void setLoad(double myLoad){
		this.loadProperty().set(myLoad);
	}
	
	public void updateLoad(final double myLoad, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLoad(myLoad);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLoad(myLoad);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateLoad(final double myLoad) {
		updateLoad(myLoad, null);
	}

	public IntegerProperty quantityProperty(){
		if (this.quantityProperty == null) {
			this.quantityProperty = new SimpleIntegerProperty(bottleConfiguration.getQuantity());
			this.quantityProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleConfiguration.setQuantity((Integer) arg2);
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

	public ObjectProperty<com.dooapp.firea.entity.BottleUnit> unitProperty() {
		if (unitProperty == null) {
			unitProperty = new SimpleObjectProperty<com.dooapp.firea.entity.BottleUnit>(bottleConfiguration.getUnit());
			unitProperty.addListener(new ChangeListener<com.dooapp.firea.entity.BottleUnit>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.BottleUnit> arg0, com.dooapp.firea.entity.BottleUnit arg1, com.dooapp.firea.entity.BottleUnit arg2) {
					bottleConfiguration.setUnit(arg2);
				}
			});
			//Start of user code unitproperty method
			//End of user code
		}
		return unitProperty;
	}
	
	public com.dooapp.firea.entity.BottleUnit getUnit(){
		return unitProperty().get();
	} 
	
	public void setUnit(com.dooapp.firea.entity.BottleUnit myUnit){
		if (unitProperty == null) {
				bottleConfiguration.setUnit(myUnit);
			} else {
				this.unitProperty().set(myUnit);
			}
	}
	
	public void updateUnit(final com.dooapp.firea.entity.BottleUnit myUnit, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUnit(myUnit);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUnit(myUnit);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateUnit(final com.dooapp.firea.entity.BottleUnit myUnit) {
		updateUnit(myUnit, null);
	}

	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(bottleConfiguration.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					bottleConfiguration.setUpdateDate(arg2);
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
				bottleConfiguration.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(bottleConfiguration.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleConfiguration.setVersion((Integer) arg2);
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
