package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.GazBean;

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
import com.dooapp.firea.entity.BottleTypeBean;
//Start of user code for imports
// TODO: import me!
//End of user code




public class Gaz implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<ObservableList<BottleType>> bottletypesProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private DoubleProperty densityProperty;
	
	private LongProperty idProperty;
	
	private StringProperty nameProperty;
	
	private LongProperty typeProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;
	
	private ObjectProperty<com.dooapp.firea.entity.GazWeight> weightProperty;

	/**
	 * Handled Entity
	 */
	private final GazBean gaz;

	/*
	 * Constructors 
	 */
	public Gaz(){
		this(new GazBean());	
	}
	
	
	public Gaz(GazBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.gaz = entity;
	}
	
	public GazBean getGazBean(){
		return this.gaz;
	}
	
	public GazBean getBean() {
		return  this.gaz;
	}
	

	/*
	 * Generated getters and setters
	 */
	public ReadOnlyObjectProperty<ObservableList<BottleType>> bottletypesProperty() {
		if (bottletypesProperty == null) {
			bottletypesProperty = new SimpleObjectProperty<ObservableList<BottleType>>(
					FXCollections.<BottleType> observableArrayList());
			for (BottleTypeBean b : gaz.getBottletypes()) {
				bottletypesProperty.get().add(b.getWrapper());
			}
			bottletypesProperty.get().addListener(new javafx.collections.ListChangeListener<BottleType>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends BottleType> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (BottleType tmp : change.getAddedSubList()) {
								gaz.addBottletypes(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (BottleType tmp : change.getRemoved()) {
								gaz.getBottletypes().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
			//Start of user code bottletypesproperty method
			//End of user code
		}
		return bottletypesProperty;
	}
	
	public ObservableList<BottleType> getBottletypes()
	{ 
		return bottletypesProperty().get(); 
	}

	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(gaz.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					gaz.setCreationDate(arg2);
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
				gaz.setCreationDate(myCreationDate);
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

	public DoubleProperty densityProperty(){
		if (this.densityProperty == null) {
			this.densityProperty = new SimpleDoubleProperty(gaz.getDensity());
			this.densityProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gaz.setDensity((Double) arg2);
				}
			});
			//Start of user code densityproperty method
			//End of user code
		}
		return this.densityProperty;
	}
	
	public double getDensity(){
		return densityProperty().get();
	} 
	
	public void setDensity(double myDensity){
		this.densityProperty().set(myDensity);
	}
	
	public void updateDensity(final double myDensity, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDensity(myDensity);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDensity(myDensity);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDensity(final double myDensity) {
		updateDensity(myDensity, null);
	}

	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(gaz.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gaz.setId((Long) arg2);
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

	public StringProperty nameProperty(){
		if (this.nameProperty == null) {
			this.nameProperty = new SimpleStringProperty(gaz.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					gaz.setName((String) arg2);
				}
			});
			//Start of user code nameproperty method
			//End of user code
		}
		return this.nameProperty;
	}
	
	public String getName(){
		return nameProperty().get();
	} 
	
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

	public LongProperty typeProperty(){
		if (this.typeProperty == null) {
			this.typeProperty = new SimpleLongProperty(gaz.getType());
			this.typeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gaz.setType((Long) arg2);
				}
			});
			//Start of user code typeproperty method
			//End of user code
		}
		return this.typeProperty;
	}
	
	public long getType(){
		return typeProperty().get();
	} 
	
	public void setType(long myType){
		this.typeProperty().set(myType);
	}
	
	public void updateType(final long myType, final Object mutex) {
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
	
	public void updateType(final long myType) {
		updateType(myType, null);
	}

	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(gaz.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					gaz.setUpdateDate(arg2);
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
				gaz.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(gaz.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gaz.setVersion((Integer) arg2);
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

	public ObjectProperty<com.dooapp.firea.entity.GazWeight> weightProperty() {
		if (weightProperty == null) {
			weightProperty = new SimpleObjectProperty<com.dooapp.firea.entity.GazWeight>(gaz.getWeight());
			weightProperty.addListener(new ChangeListener<com.dooapp.firea.entity.GazWeight>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.GazWeight> arg0, com.dooapp.firea.entity.GazWeight arg1, com.dooapp.firea.entity.GazWeight arg2) {
					gaz.setWeight(arg2);
				}
			});
			//Start of user code weightproperty method
			//End of user code
		}
		return weightProperty;
	}
	
	public com.dooapp.firea.entity.GazWeight getWeight(){
		return weightProperty().get();
	} 
	
	public void setWeight(com.dooapp.firea.entity.GazWeight myWeight){
		if (weightProperty == null) {
				gaz.setWeight(myWeight);
			} else {
				this.weightProperty().set(myWeight);
			}
	}
	
	public void updateWeight(final com.dooapp.firea.entity.GazWeight myWeight, final Object mutex) {
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
	
	public void updateWeight(final com.dooapp.firea.entity.GazWeight myWeight) {
		updateWeight(myWeight, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
