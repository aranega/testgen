package com.dooapp.fireaOLD.wrapper.criteria;

import com.dooapp.fireaOLD.entity.criteria.GazCriteriaInstance;

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


//Start of user code comment for GazCriteria Class

//End of user code

public class GazCriteria implements com.dooapp.lib.common.entity.Wrapper 
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<java.util.Date> creationDateMaxProperty;
	
	private ObjectProperty<java.util.Date> creationDateMinProperty;
	
	private DoubleProperty densityMaxProperty;
	
	private DoubleProperty densityMinProperty;
	
	private LongProperty idMaxProperty;
	
	private LongProperty idMinProperty;
	
	private StringProperty nameProperty;
	
	private StringProperty typeProperty;
	
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	
	private ObjectProperty<java.util.Date> updateDateMinProperty;
	
	private IntegerProperty versionProperty;
	
	private ObjectProperty<com.dooapp.fireaOLD.entity.GazWeight> weightProperty;

	/**
	 * Handled Criteria
	 */
	private GazCriteriaInstance gazCriteria;

	/*
	 * Constructors
	 * <!-- Start of user code comment for GazCriteria constructor
	 * End of user code -->
	 */
	public GazCriteria(){
		this(new GazCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for GazCriteria constructor with parameters
	 * End of user code -->
	 */
	public GazCriteria(GazCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.gazCriteria = entity;
		//Start of user code constructor with parameters
		//End of user code
	}
	
	public GazCriteriaInstance getGazCriteriaInstance(){
		return this.gazCriteria;
	}
	
	
	public GazCriteriaInstance getBean() {
		return  this.gazCriteria;
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
			creationDateMaxProperty = new SimpleObjectProperty<java.util.Date>(gazCriteria.getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					gazCriteria.setCreationDateMax(arg2);
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
				gazCriteria.setCreationDateMax(myCreationDateMax);
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
			creationDateMinProperty = new SimpleObjectProperty<java.util.Date>(gazCriteria.getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					gazCriteria.setCreationDateMin(arg2);
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
				gazCriteria.setCreationDateMin(myCreationDateMin);
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
	 * <!-- Start of user code comment for densityMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty densityMaxProperty(){
		if (this.densityMaxProperty == null) {
			this.densityMaxProperty = new SimpleDoubleProperty(gazCriteria.getDensityMax());
			this.densityMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazCriteria.setDensityMax((Double) arg2);
				}
			});
			//Start of user code densityMaxproperty method
			//End of user code
		}
		return this.densityMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for densityMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getDensityMax(){
		return densityMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for densityMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDensityMax(double myDensityMax){
		this.densityMaxProperty().set(myDensityMax);
	}
	
	public void updateDensityMax(final double myDensityMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDensityMax(myDensityMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDensityMax(myDensityMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDensityMax(final double myDensityMax) {
		updateDensityMax(myDensityMax, null);
	}

	/*
	 * <!-- Start of user code comment for densityMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty densityMinProperty(){
		if (this.densityMinProperty == null) {
			this.densityMinProperty = new SimpleDoubleProperty(gazCriteria.getDensityMin());
			this.densityMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazCriteria.setDensityMin((Double) arg2);
				}
			});
			//Start of user code densityMinproperty method
			//End of user code
		}
		return this.densityMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for densityMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getDensityMin(){
		return densityMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for densityMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDensityMin(double myDensityMin){
		this.densityMinProperty().set(myDensityMin);
	}
	
	public void updateDensityMin(final double myDensityMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDensityMin(myDensityMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDensityMin(myDensityMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDensityMin(final double myDensityMin) {
		updateDensityMin(myDensityMin, null);
	}

	/*
	 * <!-- Start of user code comment for idMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idMaxProperty(){
		if (this.idMaxProperty == null) {
			this.idMaxProperty = new SimpleLongProperty(gazCriteria.getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazCriteria.setIdMax((Long) arg2);
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
			this.idMinProperty = new SimpleLongProperty(gazCriteria.getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazCriteria.setIdMin((Long) arg2);
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
			this.nameProperty = new SimpleStringProperty(gazCriteria.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					gazCriteria.setName((String) arg2);
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
	 * <!-- Start of user code comment for type property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty typeProperty(){
		if (this.typeProperty == null) {
			this.typeProperty = new SimpleStringProperty(gazCriteria.getType());
			this.typeProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					gazCriteria.setType((String) arg2);
				}
			});
			//Start of user code typeproperty method
			//End of user code
		}
		return this.typeProperty;
	}
	
	/*
	 * <!-- Start of user code comment for type getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getType(){
		return typeProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for type setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setType(String myType){
		this.typeProperty().set(myType);
	}
	
	public void updateType(final String myType, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setType(myType);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setType(myType);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateType(final String myType) {
		updateType(myType, null);
	}

	/*
	 * <!-- Start of user code comment for updateDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = new SimpleObjectProperty<java.util.Date>(gazCriteria.getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					gazCriteria.setUpdateDateMax(arg2);
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
				gazCriteria.setUpdateDateMax(myUpdateDateMax);
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
			updateDateMinProperty = new SimpleObjectProperty<java.util.Date>(gazCriteria.getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					gazCriteria.setUpdateDateMin(arg2);
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
				gazCriteria.setUpdateDateMin(myUpdateDateMin);
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
			this.versionProperty = new SimpleIntegerProperty(gazCriteria.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazCriteria.setVersion((Integer) arg2);
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
	 * <!-- Start of user code comment for weight property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<com.dooapp.fireaOLD.entity.GazWeight> weightProperty() {
		if (weightProperty == null) {
			weightProperty = new SimpleObjectProperty<com.dooapp.fireaOLD.entity.GazWeight>(gazCriteria.getWeight());
			weightProperty.addListener(new ChangeListener<com.dooapp.fireaOLD.entity.GazWeight>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.fireaOLD.entity.GazWeight> arg0, com.dooapp.fireaOLD.entity.GazWeight arg1, com.dooapp.fireaOLD.entity.GazWeight arg2) {
					gazCriteria.setWeight(arg2);
				}
			});
			//Start of user code weightproperty method
			//End of user code
		}
		return weightProperty;
	}
	
	/*
	 * <!-- Start of user code comment for weight getter 
		-->
	 * <!-- End of user code -->
	 */
	public com.dooapp.fireaOLD.entity.GazWeight getWeight(){
		return weightProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for weight setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setWeight(com.dooapp.fireaOLD.entity.GazWeight myWeight){
		if (weightProperty == null) {
				gazCriteria.setWeight(myWeight);
			} else {
				this.weightProperty().set(myWeight);
			}
	}
	
	public void updateWeight(final com.dooapp.fireaOLD.entity.GazWeight myWeight, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setWeight(myWeight);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setWeight(myWeight);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateWeight(final com.dooapp.fireaOLD.entity.GazWeight myWeight) {
		updateWeight(myWeight, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
