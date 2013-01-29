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
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

//Start of user code for imports
// TODO: import me!
//End of user code




// Start of user code comment for Gaz Class

// End of user code

public class Gaz
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private ObjectProperty<ObservableList<BottleType>> bottletypesProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private DoubleProperty densityProperty;
	
	private LongProperty idProperty;
	
	private StringProperty nameProperty;
	
	private IntegerProperty typeProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;
	
	private StringProperty weightProperty;

	/**
	 * Handled Entity
	 */
	private final GazBean gaz;

	/*
	 * Constructors
	 * <!-- Start of user code comment for Gaz constructor
	 * End of user code -->
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
	/*
	 * <!-- Start of user code comment for bottletypes property method 
		-->
	 * <!-- End of user code -->
	 */
	public ReadOnlyObjectProperty<ObservableList<BottleType>> bottletypesProperty() {
		if (bottletypesProperty == null) {
			bottletypesProperty = new SimpleObjectProperty<ObservableList<BottleType>>(
					FXCollections.<BottleType> observableArrayList());
			for (BottleTypeBean tmp : this.gaz.getBottletypes()) {
				bottletypesProperty.get().add(tmp.getWrapper());
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
	
	/*
	 * <!-- Start of user code comment for bottletypes getter 
		-->
	 * <!-- End of user code -->
	 */
	public ObservableList<BottleType> getBottletypes()
	{ 
		return bottletypesProperty().get(); 
	}

	/*
	 * <!-- Start of user code comment for creationDate property method 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for density property method 
		-->
	 * <!-- End of user code -->
	 */
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
	
	/*
	 * <!-- Start of user code comment for density getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getDensity(){
		return densityProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for density setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for id property method 
		-->
	 * <!-- End of user code -->
	 */
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
	public IntegerProperty typeProperty(){
		if (this.typeProperty == null) {
			this.typeProperty = new SimpleIntegerProperty(gaz.getType());
			this.typeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gaz.setType((Integer) arg2);
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
	public int getType(){
		return typeProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for type setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setType(int myType){
		this.typeProperty().set(myType);
	}
	
	public void updateType(final int myType, final Object mutex) {
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
	
	public void updateType(final int myType) {
		updateType(myType, null);
	}

	/*
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for version property method 
		-->
	 * <!-- End of user code -->
	 */
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
	public StringProperty weightProperty(){
		if (this.weightProperty == null) {
			this.weightProperty = new SimpleStringProperty(gaz.getWeight());
			this.weightProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					gaz.setWeight((String) arg2);
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
	public String getWeight(){
		return weightProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for weight setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setWeight(String myWeight){
		this.weightProperty().set(myWeight);
	}
	
	public void updateWeight(final String myWeight, final Object mutex) {
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
	
	public void updateWeight(final String myWeight) {
		updateWeight(myWeight, null);
	}


	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getGazBean() != null ? serializer.outputString(getGazBean().toXML()) : "";
		
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
