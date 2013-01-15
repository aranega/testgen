package com.dooapp.fireaOLD.wrapper.criteria;

import com.dooapp.fireaOLD.entity.criteria.BlowHoleCriteriaInstance;

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


//Start of user code comment for BlowHoleCriteria Class

//End of user code

public class BlowHoleCriteria implements com.dooapp.lib.common.entity.Wrapper 
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<com.dooapp.fireaOLD.entity.Discharge> dischargeProperty;
	
	private ObjectProperty<java.util.Date> creationDateMaxProperty;
	
	private ObjectProperty<java.util.Date> creationDateMinProperty;
	
	private LongProperty idMaxProperty;
	
	private LongProperty idMinProperty;
	
	private IntegerProperty quantityMaxProperty;
	
	private IntegerProperty quantityMinProperty;
	
	private DoubleProperty surfaceMaxProperty;
	
	private DoubleProperty surfaceMinProperty;
	
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	
	private ObjectProperty<java.util.Date> updateDateMinProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Criteria
	 */
	private BlowHoleCriteriaInstance blowHoleCriteria;

	/*
	 * Constructors
	 * <!-- Start of user code comment for BlowHoleCriteria constructor
	 * End of user code -->
	 */
	public BlowHoleCriteria(){
		this(new BlowHoleCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for BlowHoleCriteria constructor with parameters
	 * End of user code -->
	 */
	public BlowHoleCriteria(BlowHoleCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.blowHoleCriteria = entity;
		//Start of user code constructor with parameters
		//End of user code
	}
	
	public BlowHoleCriteriaInstance getBlowHoleCriteriaInstance(){
		return this.blowHoleCriteria;
	}
	
	
	public BlowHoleCriteriaInstance getBean() {
		return  this.blowHoleCriteria;
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
	 * <!-- Start of user code comment for Discharge property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<com.dooapp.fireaOLD.entity.Discharge> dischargeProperty() {
		if (dischargeProperty == null) {
			dischargeProperty = new SimpleObjectProperty<com.dooapp.fireaOLD.entity.Discharge>(blowHoleCriteria.getDischarge());
			dischargeProperty.addListener(new ChangeListener<com.dooapp.fireaOLD.entity.Discharge>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.fireaOLD.entity.Discharge> arg0, com.dooapp.fireaOLD.entity.Discharge arg1, com.dooapp.fireaOLD.entity.Discharge arg2) {
					blowHoleCriteria.setDischarge(arg2);
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
				blowHoleCriteria.setDischarge(myDischarge);
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
	 * <!-- Start of user code comment for creationDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateMaxProperty() {
		if (creationDateMaxProperty == null) {
			creationDateMaxProperty = new SimpleObjectProperty<java.util.Date>(blowHoleCriteria.getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					blowHoleCriteria.setCreationDateMax(arg2);
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
				blowHoleCriteria.setCreationDateMax(myCreationDateMax);
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
			creationDateMinProperty = new SimpleObjectProperty<java.util.Date>(blowHoleCriteria.getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					blowHoleCriteria.setCreationDateMin(arg2);
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
				blowHoleCriteria.setCreationDateMin(myCreationDateMin);
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
	 * <!-- Start of user code comment for idMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idMaxProperty(){
		if (this.idMaxProperty == null) {
			this.idMaxProperty = new SimpleLongProperty(blowHoleCriteria.getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHoleCriteria.setIdMax((Long) arg2);
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
			this.idMinProperty = new SimpleLongProperty(blowHoleCriteria.getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHoleCriteria.setIdMin((Long) arg2);
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
	 * <!-- Start of user code comment for quantityMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty quantityMaxProperty(){
		if (this.quantityMaxProperty == null) {
			this.quantityMaxProperty = new SimpleIntegerProperty(blowHoleCriteria.getQuantityMax());
			this.quantityMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHoleCriteria.setQuantityMax((Integer) arg2);
				}
			});
			//Start of user code quantityMaxproperty method
			//End of user code
		}
		return this.quantityMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for quantityMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getQuantityMax(){
		return quantityMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for quantityMax setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for quantityMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty quantityMinProperty(){
		if (this.quantityMinProperty == null) {
			this.quantityMinProperty = new SimpleIntegerProperty(blowHoleCriteria.getQuantityMin());
			this.quantityMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHoleCriteria.setQuantityMin((Integer) arg2);
				}
			});
			//Start of user code quantityMinproperty method
			//End of user code
		}
		return this.quantityMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for quantityMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getQuantityMin(){
		return quantityMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for quantityMin setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for surfaceMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty surfaceMaxProperty(){
		if (this.surfaceMaxProperty == null) {
			this.surfaceMaxProperty = new SimpleDoubleProperty(blowHoleCriteria.getSurfaceMax());
			this.surfaceMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHoleCriteria.setSurfaceMax((Double) arg2);
				}
			});
			//Start of user code surfaceMaxproperty method
			//End of user code
		}
		return this.surfaceMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for surfaceMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getSurfaceMax(){
		return surfaceMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for surfaceMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setSurfaceMax(double mySurfaceMax){
		this.surfaceMaxProperty().set(mySurfaceMax);
	}
	
	public void updateSurfaceMax(final double mySurfaceMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSurfaceMax(mySurfaceMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSurfaceMax(mySurfaceMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateSurfaceMax(final double mySurfaceMax) {
		updateSurfaceMax(mySurfaceMax, null);
	}

	/*
	 * <!-- Start of user code comment for surfaceMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty surfaceMinProperty(){
		if (this.surfaceMinProperty == null) {
			this.surfaceMinProperty = new SimpleDoubleProperty(blowHoleCriteria.getSurfaceMin());
			this.surfaceMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHoleCriteria.setSurfaceMin((Double) arg2);
				}
			});
			//Start of user code surfaceMinproperty method
			//End of user code
		}
		return this.surfaceMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for surfaceMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getSurfaceMin(){
		return surfaceMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for surfaceMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setSurfaceMin(double mySurfaceMin){
		this.surfaceMinProperty().set(mySurfaceMin);
	}
	
	public void updateSurfaceMin(final double mySurfaceMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSurfaceMin(mySurfaceMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSurfaceMin(mySurfaceMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateSurfaceMin(final double mySurfaceMin) {
		updateSurfaceMin(mySurfaceMin, null);
	}

	/*
	 * <!-- Start of user code comment for updateDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = new SimpleObjectProperty<java.util.Date>(blowHoleCriteria.getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					blowHoleCriteria.setUpdateDateMax(arg2);
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
				blowHoleCriteria.setUpdateDateMax(myUpdateDateMax);
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
			updateDateMinProperty = new SimpleObjectProperty<java.util.Date>(blowHoleCriteria.getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					blowHoleCriteria.setUpdateDateMin(arg2);
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
				blowHoleCriteria.setUpdateDateMin(myUpdateDateMin);
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
			this.versionProperty = new SimpleIntegerProperty(blowHoleCriteria.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					blowHoleCriteria.setVersion((Integer) arg2);
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
