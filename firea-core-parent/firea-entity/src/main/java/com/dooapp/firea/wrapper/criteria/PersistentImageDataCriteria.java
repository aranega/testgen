package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.PersistentImageDataCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

//Start of user code for imports
// TODO: import me!
//End of user code




// Start of user code comment for PersistentImageDataCriteria Class

// End of user code

public class PersistentImageDataCriteria 
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private ObjectProperty<java.util.Date> creationDateMaxProperty;
	
	private ObjectProperty<java.util.Date> creationDateMinProperty;
	
	private StringProperty dataProperty;
	
	private LongProperty idMaxProperty;
	
	private LongProperty idMinProperty;
	
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	
	private ObjectProperty<java.util.Date> updateDateMinProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Criteria
	 */
	private PersistentImageDataCriteriaInstance persistentImageDataCriteria;

	/*
	 * Constructors
	 * <!-- Start of user code comment for PersistentImageDataCriteria constructor
	 * End of user code -->
	 */
	public PersistentImageDataCriteria(){
		this(new PersistentImageDataCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for PersistentImageDataCriteria constructor with parameters
	 * End of user code -->
	 */
	public PersistentImageDataCriteria(PersistentImageDataCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.persistentImageDataCriteria = entity;
		// Start of user code constructor with parameters
		// End of user code
	}
	
	public PersistentImageDataCriteriaInstance getPersistentImageDataCriteriaInstance(){
		return this.persistentImageDataCriteria;
	}
	
	
	public PersistentImageDataCriteriaInstance getBean() {
		return  this.persistentImageDataCriteria;
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
			creationDateMaxProperty = new SimpleObjectProperty<java.util.Date>(persistentImageDataCriteria.getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					persistentImageDataCriteria.setCreationDateMax(arg2);
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
				persistentImageDataCriteria.setCreationDateMax(myCreationDateMax);
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
			creationDateMinProperty = new SimpleObjectProperty<java.util.Date>(persistentImageDataCriteria.getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					persistentImageDataCriteria.setCreationDateMin(arg2);
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
				persistentImageDataCriteria.setCreationDateMin(myCreationDateMin);
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
	 * <!-- Start of user code comment for data property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty dataProperty(){
		if (this.dataProperty == null) {
			this.dataProperty = new SimpleStringProperty(persistentImageDataCriteria.getData());
			this.dataProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					persistentImageDataCriteria.setData((String) arg2);
				}
			});
			//Start of user code dataproperty method
			//End of user code
		}
		return this.dataProperty;
	}
	
	/*
	 * <!-- Start of user code comment for data getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getData(){
		return dataProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for data setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setData(String myData){
		this.dataProperty().set(myData);
	}
	
	public void updateData(final String myData, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setData(myData);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setData(myData);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateData(final String myData) {
		updateData(myData, null);
	}

	/*
	 * <!-- Start of user code comment for idMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idMaxProperty(){
		if (this.idMaxProperty == null) {
			this.idMaxProperty = new SimpleLongProperty(persistentImageDataCriteria.getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					persistentImageDataCriteria.setIdMax((Long) arg2);
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
			this.idMinProperty = new SimpleLongProperty(persistentImageDataCriteria.getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					persistentImageDataCriteria.setIdMin((Long) arg2);
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
	 * <!-- Start of user code comment for updateDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = new SimpleObjectProperty<java.util.Date>(persistentImageDataCriteria.getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					persistentImageDataCriteria.setUpdateDateMax(arg2);
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
				persistentImageDataCriteria.setUpdateDateMax(myUpdateDateMax);
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
			updateDateMinProperty = new SimpleObjectProperty<java.util.Date>(persistentImageDataCriteria.getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					persistentImageDataCriteria.setUpdateDateMin(arg2);
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
				persistentImageDataCriteria.setUpdateDateMin(myUpdateDateMin);
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
			this.versionProperty = new SimpleIntegerProperty(persistentImageDataCriteria.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					persistentImageDataCriteria.setVersion((Integer) arg2);
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
