package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.BottleConfigurationCriteriaInstance;

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




public class BottleConfigurationCriteria implements com.dooapp.lib.common.entity.Wrapper 
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<java.util.Date> creationDateMaxProperty;
	
	private ObjectProperty<java.util.Date> creationDateMinProperty;
	
	private LongProperty idMaxProperty;
	
	private LongProperty idMinProperty;
	
	private DoubleProperty loadMaxProperty;
	
	private DoubleProperty loadMinProperty;
	
	private IntegerProperty quantityMaxProperty;
	
	private IntegerProperty quantityMinProperty;
	
	private ObjectProperty<com.dooapp.firea.entity.BottleUnit> unitProperty;
	
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	
	private ObjectProperty<java.util.Date> updateDateMinProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Criteria
	 */
	private BottleConfigurationCriteriaInstance bottleConfigurationCriteria;

	/*
	 * Constructors 
	 */
	public BottleConfigurationCriteria(){
		this(new BottleConfigurationCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	public BottleConfigurationCriteria(BottleConfigurationCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.bottleConfigurationCriteria = entity;
		//Start of user code constructor with parameters
		//End of user code
	}
	
	public BottleConfigurationCriteriaInstance getBottleConfigurationCriteriaInstance(){
		return this.bottleConfigurationCriteria;
	}
	
	
	public BottleConfigurationCriteriaInstance getBean() {
		return  this.bottleConfigurationCriteria;
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

	public ObjectProperty<java.util.Date> creationDateMaxProperty() {
		if (creationDateMaxProperty == null) {
			creationDateMaxProperty = new SimpleObjectProperty<java.util.Date>(bottleConfigurationCriteria.getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					bottleConfigurationCriteria.setCreationDateMax(arg2);
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
				bottleConfigurationCriteria.setCreationDateMax(myCreationDateMax);
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
			creationDateMinProperty = new SimpleObjectProperty<java.util.Date>(bottleConfigurationCriteria.getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					bottleConfigurationCriteria.setCreationDateMin(arg2);
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
				bottleConfigurationCriteria.setCreationDateMin(myCreationDateMin);
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

	public LongProperty idMaxProperty(){
		if (this.idMaxProperty == null) {
			this.idMaxProperty = new SimpleLongProperty(bottleConfigurationCriteria.getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleConfigurationCriteria.setIdMax((Long) arg2);
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
			this.idMinProperty = new SimpleLongProperty(bottleConfigurationCriteria.getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleConfigurationCriteria.setIdMin((Long) arg2);
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

	public DoubleProperty loadMaxProperty(){
		if (this.loadMaxProperty == null) {
			this.loadMaxProperty = new SimpleDoubleProperty(bottleConfigurationCriteria.getLoadMax());
			this.loadMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleConfigurationCriteria.setLoadMax((Double) arg2);
				}
			});
			//Start of user code loadMaxproperty method
			//End of user code
		}
		return this.loadMaxProperty;
	}
	
	public double getLoadMax(){
		return loadMaxProperty().get();
	} 
	
	public void setLoadMax(double myLoadMax){
		this.loadMaxProperty().set(myLoadMax);
	}
	
	public void updateLoadMax(final double myLoadMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLoadMax(myLoadMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLoadMax(myLoadMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateLoadMax(final double myLoadMax) {
		updateLoadMax(myLoadMax, null);
	}

	public DoubleProperty loadMinProperty(){
		if (this.loadMinProperty == null) {
			this.loadMinProperty = new SimpleDoubleProperty(bottleConfigurationCriteria.getLoadMin());
			this.loadMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleConfigurationCriteria.setLoadMin((Double) arg2);
				}
			});
			//Start of user code loadMinproperty method
			//End of user code
		}
		return this.loadMinProperty;
	}
	
	public double getLoadMin(){
		return loadMinProperty().get();
	} 
	
	public void setLoadMin(double myLoadMin){
		this.loadMinProperty().set(myLoadMin);
	}
	
	public void updateLoadMin(final double myLoadMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLoadMin(myLoadMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLoadMin(myLoadMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateLoadMin(final double myLoadMin) {
		updateLoadMin(myLoadMin, null);
	}

	public IntegerProperty quantityMaxProperty(){
		if (this.quantityMaxProperty == null) {
			this.quantityMaxProperty = new SimpleIntegerProperty(bottleConfigurationCriteria.getQuantityMax());
			this.quantityMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleConfigurationCriteria.setQuantityMax((Integer) arg2);
				}
			});
			//Start of user code quantityMaxproperty method
			//End of user code
		}
		return this.quantityMaxProperty;
	}
	
	public int getQuantityMax(){
		return quantityMaxProperty().get();
	} 
	
	public void setQuantityMax(int myQuantityMax){
		this.quantityMaxProperty().set(myQuantityMax);
	}
	
	public void updateQuantityMax(final int myQuantityMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setQuantityMax(myQuantityMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setQuantityMax(myQuantityMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateQuantityMax(final int myQuantityMax) {
		updateQuantityMax(myQuantityMax, null);
	}

	public IntegerProperty quantityMinProperty(){
		if (this.quantityMinProperty == null) {
			this.quantityMinProperty = new SimpleIntegerProperty(bottleConfigurationCriteria.getQuantityMin());
			this.quantityMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleConfigurationCriteria.setQuantityMin((Integer) arg2);
				}
			});
			//Start of user code quantityMinproperty method
			//End of user code
		}
		return this.quantityMinProperty;
	}
	
	public int getQuantityMin(){
		return quantityMinProperty().get();
	} 
	
	public void setQuantityMin(int myQuantityMin){
		this.quantityMinProperty().set(myQuantityMin);
	}
	
	public void updateQuantityMin(final int myQuantityMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setQuantityMin(myQuantityMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setQuantityMin(myQuantityMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateQuantityMin(final int myQuantityMin) {
		updateQuantityMin(myQuantityMin, null);
	}

	public ObjectProperty<com.dooapp.firea.entity.BottleUnit> unitProperty() {
		if (unitProperty == null) {
			unitProperty = new SimpleObjectProperty<com.dooapp.firea.entity.BottleUnit>(bottleConfigurationCriteria.getUnit());
			unitProperty.addListener(new ChangeListener<com.dooapp.firea.entity.BottleUnit>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.BottleUnit> arg0, com.dooapp.firea.entity.BottleUnit arg1, com.dooapp.firea.entity.BottleUnit arg2) {
					bottleConfigurationCriteria.setUnit(arg2);
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
				bottleConfigurationCriteria.setUnit(myUnit);
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

	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = new SimpleObjectProperty<java.util.Date>(bottleConfigurationCriteria.getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					bottleConfigurationCriteria.setUpdateDateMax(arg2);
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
				bottleConfigurationCriteria.setUpdateDateMax(myUpdateDateMax);
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
			updateDateMinProperty = new SimpleObjectProperty<java.util.Date>(bottleConfigurationCriteria.getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					bottleConfigurationCriteria.setUpdateDateMin(arg2);
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
				bottleConfigurationCriteria.setUpdateDateMin(myUpdateDateMin);
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
			this.versionProperty = new SimpleIntegerProperty(bottleConfigurationCriteria.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleConfigurationCriteria.setVersion((Integer) arg2);
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
