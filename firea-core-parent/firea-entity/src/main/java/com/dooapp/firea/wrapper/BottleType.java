package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.BottleTypeBean;

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
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import com.dooapp.firea.entity.BottleConfigurationBean;
//Start of user code for imports
// TODO: import me!
//End of user code


//Start of user code comment for BottleType Class

//End of user code

public class BottleType implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<ObservableList<BottleConfiguration>> bottleconfigurationProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private LongProperty idProperty;
	
	private StringProperty nameProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;
	
	private DoubleProperty volumeProperty;
	
	private DoubleProperty weightProperty;

	/**
	 * Handled Entity
	 */
	private final BottleTypeBean bottleType;

	/*
	 * Constructors
	 * <!-- Start of user code comment for BottleType constructor
	 * End of user code -->
	 */
	public BottleType(){
		this(new BottleTypeBean());	
	}
	
	
	public BottleType(BottleTypeBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.bottleType = entity;
	}
	
	public BottleTypeBean getBottleTypeBean(){
		return this.bottleType;
	}
	
	public BottleTypeBean getBean() {
		return  this.bottleType;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for bottleconfiguration property method 
		-->
	 * <!-- End of user code -->
	 */
	public ReadOnlyObjectProperty<ObservableList<BottleConfiguration>> bottleconfigurationProperty() {
		if (bottleconfigurationProperty == null) {
			bottleconfigurationProperty = new SimpleObjectProperty<ObservableList<BottleConfiguration>>(
					FXCollections.<BottleConfiguration> observableArrayList());
			for (BottleConfigurationBean b : bottleType.getBottleconfiguration()) {
				bottleconfigurationProperty.get().add(b.getWrapper());
			}
			bottleconfigurationProperty.get().addListener(new javafx.collections.ListChangeListener<BottleConfiguration>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends BottleConfiguration> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (BottleConfiguration tmp : change.getAddedSubList()) {
								bottleType.addBottleconfiguration(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (BottleConfiguration tmp : change.getRemoved()) {
								bottleType.getBottleconfiguration().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
			//Start of user code bottleconfigurationproperty method
			//End of user code
		}
		return bottleconfigurationProperty;
	}
	
	/*
	 * <!-- Start of user code comment for bottleconfiguration getter 
		-->
	 * <!-- End of user code -->
	 */
	public ObservableList<BottleConfiguration> getBottleconfiguration()
	{ 
		return bottleconfigurationProperty().get(); 
	}

	/*
	 * <!-- Start of user code comment for creationDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(bottleType.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					bottleType.setCreationDate(arg2);
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
				bottleType.setCreationDate(myCreationDate);
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
			this.idProperty = new SimpleLongProperty(bottleType.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleType.setId((Long) arg2);
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
	 * <!-- Start of user code comment for name property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty nameProperty(){
		if (this.nameProperty == null) {
			this.nameProperty = new SimpleStringProperty(bottleType.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					bottleType.setName((String) arg2);
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
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(bottleType.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					bottleType.setUpdateDate(arg2);
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
				bottleType.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(bottleType.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleType.setVersion((Integer) arg2);
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
	 * <!-- Start of user code comment for volume property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty volumeProperty(){
		if (this.volumeProperty == null) {
			this.volumeProperty = new SimpleDoubleProperty(bottleType.getVolume());
			this.volumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleType.setVolume((Double) arg2);
				}
			});
			//Start of user code volumeproperty method
			//End of user code
		}
		return this.volumeProperty;
	}
	
	/*
	 * <!-- Start of user code comment for volume getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getVolume(){
		return volumeProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for volume setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setVolume(double myVolume){
		this.volumeProperty().set(myVolume);
	}
	
	public void updateVolume(final double myVolume, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVolume(myVolume);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVolume(myVolume);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateVolume(final double myVolume) {
		updateVolume(myVolume, null);
	}

	/*
	 * <!-- Start of user code comment for weight property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty weightProperty(){
		if (this.weightProperty == null) {
			this.weightProperty = new SimpleDoubleProperty(bottleType.getWeight());
			this.weightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					bottleType.setWeight((Double) arg2);
				}
			});
			//Start of user code weightproperty method
			//End of user code
		}
		return this.weightProperty;
	}
	
	/*
	 * <!-- Start of user code comment for weight getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getWeight(){
		return weightProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for weight setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setWeight(double myWeight){
		this.weightProperty().set(myWeight);
	}
	
	public void updateWeight(final double myWeight, final Object mutex) {
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
	
	public void updateWeight(final double myWeight) {
		updateWeight(myWeight, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
