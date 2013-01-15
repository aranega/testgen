package com.dooapp.fireaOLD.wrapper.criteria;

import com.dooapp.fireaOLD.entity.criteria.BottleTypeCriteriaInstance;

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
//Start of user code for imports
// TODO: import me!
//End of user code


//Start of user code comment for BottleTypeCriteria Class

//End of user code

public class BottleTypeCriteria implements com.dooapp.lib.common.entity.Wrapper 
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<java.util.Date> creationDateMaxProperty;
	
	private ObjectProperty<java.util.Date> creationDateMinProperty;
	
	private LongProperty idMaxProperty;
	
	private LongProperty idMinProperty;
	
	private StringProperty nameProperty;
	
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	
	private ObjectProperty<java.util.Date> updateDateMinProperty;
	
	private IntegerProperty versionProperty;
	
	private DoubleProperty volumeMaxProperty;
	
	private DoubleProperty volumeMinProperty;
	
	private DoubleProperty weightMaxProperty;
	
	private DoubleProperty weightMinProperty;

	/**
	 * Handled Criteria
	 */
	private BottleTypeCriteriaInstance bottleTypeCriteria;

	/*
	 * Constructors
	 * <!-- Start of user code comment for BottleTypeCriteria constructor
	 * End of user code -->
	 */
	public BottleTypeCriteria(){
		this(new BottleTypeCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for BottleTypeCriteria constructor with parameters
	 * End of user code -->
	 */
	public BottleTypeCriteria(BottleTypeCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.bottleTypeCriteria = entity;
		//Start of user code constructor with parameters
		//End of user code
	}
	
	public BottleTypeCriteriaInstance getBottleTypeCriteriaInstance(){
		return this.bottleTypeCriteria;
	}
	
	
	public BottleTypeCriteriaInstance getBean() {
		return  this.bottleTypeCriteria;
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
	 * <!-- Start of user code comment for creationDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateMaxProperty() {
		if (creationDateMaxProperty == null) {
			creationDateMaxProperty = new SimpleObjectProperty<java.util.Date>(bottleTypeCriteria.getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					bottleTypeCriteria.setCreationDateMax(arg2);
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
				bottleTypeCriteria.setCreationDateMax(myCreationDateMax);
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
			creationDateMinProperty = new SimpleObjectProperty<java.util.Date>(bottleTypeCriteria.getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					bottleTypeCriteria.setCreationDateMin(arg2);
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
				bottleTypeCriteria.setCreationDateMin(myCreationDateMin);
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
			this.idMaxProperty = new SimpleLongProperty(bottleTypeCriteria.getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleTypeCriteria.setIdMax((Long) arg2);
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
			this.idMinProperty = new SimpleLongProperty(bottleTypeCriteria.getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleTypeCriteria.setIdMin((Long) arg2);
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
	 * <!-- Start of user code comment for name property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty nameProperty(){
		if (this.nameProperty == null) {
			this.nameProperty = new SimpleStringProperty(bottleTypeCriteria.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					bottleTypeCriteria.setName((String) arg2);
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
	 * <!-- Start of user code comment for updateDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = new SimpleObjectProperty<java.util.Date>(bottleTypeCriteria.getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					bottleTypeCriteria.setUpdateDateMax(arg2);
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
				bottleTypeCriteria.setUpdateDateMax(myUpdateDateMax);
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
			updateDateMinProperty = new SimpleObjectProperty<java.util.Date>(bottleTypeCriteria.getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					bottleTypeCriteria.setUpdateDateMin(arg2);
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
				bottleTypeCriteria.setUpdateDateMin(myUpdateDateMin);
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
			this.versionProperty = new SimpleIntegerProperty(bottleTypeCriteria.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleTypeCriteria.setVersion((Integer) arg2);
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
	 * <!-- Start of user code comment for volumeMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty volumeMaxProperty(){
		if (this.volumeMaxProperty == null) {
			this.volumeMaxProperty = new SimpleDoubleProperty(bottleTypeCriteria.getVolumeMax());
			this.volumeMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleTypeCriteria.setVolumeMax((Double) arg2);
				}
			});
			//Start of user code volumeMaxproperty method
			//End of user code
		}
		return this.volumeMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for volumeMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getVolumeMax(){
		return volumeMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for volumeMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setVolumeMax(double myVolumeMax){
		this.volumeMaxProperty().set(myVolumeMax);
	}
	
	public void updateVolumeMax(final double myVolumeMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVolumeMax(myVolumeMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVolumeMax(myVolumeMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateVolumeMax(final double myVolumeMax) {
		updateVolumeMax(myVolumeMax, null);
	}

	/*
	 * <!-- Start of user code comment for volumeMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty volumeMinProperty(){
		if (this.volumeMinProperty == null) {
			this.volumeMinProperty = new SimpleDoubleProperty(bottleTypeCriteria.getVolumeMin());
			this.volumeMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleTypeCriteria.setVolumeMin((Double) arg2);
				}
			});
			//Start of user code volumeMinproperty method
			//End of user code
		}
		return this.volumeMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for volumeMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getVolumeMin(){
		return volumeMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for volumeMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setVolumeMin(double myVolumeMin){
		this.volumeMinProperty().set(myVolumeMin);
	}
	
	public void updateVolumeMin(final double myVolumeMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVolumeMin(myVolumeMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVolumeMin(myVolumeMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateVolumeMin(final double myVolumeMin) {
		updateVolumeMin(myVolumeMin, null);
	}

	/*
	 * <!-- Start of user code comment for weightMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty weightMaxProperty(){
		if (this.weightMaxProperty == null) {
			this.weightMaxProperty = new SimpleDoubleProperty(bottleTypeCriteria.getWeightMax());
			this.weightMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleTypeCriteria.setWeightMax((Double) arg2);
				}
			});
			//Start of user code weightMaxproperty method
			//End of user code
		}
		return this.weightMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for weightMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getWeightMax(){
		return weightMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for weightMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setWeightMax(double myWeightMax){
		this.weightMaxProperty().set(myWeightMax);
	}
	
	public void updateWeightMax(final double myWeightMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setWeightMax(myWeightMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setWeightMax(myWeightMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateWeightMax(final double myWeightMax) {
		updateWeightMax(myWeightMax, null);
	}

	/*
	 * <!-- Start of user code comment for weightMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty weightMinProperty(){
		if (this.weightMinProperty == null) {
			this.weightMinProperty = new SimpleDoubleProperty(bottleTypeCriteria.getWeightMin());
			this.weightMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleTypeCriteria.setWeightMin((Double) arg2);
				}
			});
			//Start of user code weightMinproperty method
			//End of user code
		}
		return this.weightMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for weightMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getWeightMin(){
		return weightMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for weightMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setWeightMin(double myWeightMin){
		this.weightMinProperty().set(myWeightMin);
	}
	
	public void updateWeightMin(final double myWeightMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setWeightMin(myWeightMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setWeightMin(myWeightMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateWeightMin(final double myWeightMin) {
		updateWeightMin(myWeightMin, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
