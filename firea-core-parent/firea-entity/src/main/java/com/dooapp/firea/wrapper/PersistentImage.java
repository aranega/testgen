package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.PersistentImageBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

//Start of user code for imports
// TODO: import me!
//End of user code




// Start of user code comment for PersistentImage Class

// End of user code

public class PersistentImage
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private StringProperty dataIdProperty;
	
	private BooleanProperty errorProperty;
	
	private LongProperty idProperty;
	
	private StringProperty sourceFileProperty;
	
	private StringProperty titleProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final PersistentImageBean persistentImage;

	/*
	 * Constructors
	 * <!-- Start of user code comment for PersistentImage constructor
	 * End of user code -->
	 */
	public PersistentImage(){
		this(new PersistentImageBean());	
	}
	
	
	public PersistentImage(PersistentImageBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.persistentImage = entity;
	}
	
	public PersistentImageBean getPersistentImageBean(){
		return this.persistentImage;
	}
	
	public PersistentImageBean getBean() {
		return  this.persistentImage;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for creationDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(persistentImage.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					persistentImage.setCreationDate(arg2);
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
				persistentImage.setCreationDate(myCreationDate);
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
	 * <!-- Start of user code comment for dataId property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty dataIdProperty(){
		if (this.dataIdProperty == null) {
			this.dataIdProperty = new SimpleStringProperty(persistentImage.getDataId());
			this.dataIdProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					persistentImage.setDataId((String) arg2);
				}
			});
			//Start of user code dataIdproperty method
			//End of user code
		}
		return this.dataIdProperty;
	}
	
	/*
	 * <!-- Start of user code comment for dataId getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getDataId(){
		return dataIdProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for dataId setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDataId(String myDataId){
		this.dataIdProperty().set(myDataId);
	}
	
	public void updateDataId(final String myDataId, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDataId(myDataId);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDataId(myDataId);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDataId(final String myDataId) {
		updateDataId(myDataId, null);
	}

	/*
	 * <!-- Start of user code comment for error property method 
		-->
	 * <!-- End of user code -->
	 */
	public BooleanProperty errorProperty(){
		if (this.errorProperty == null) {
			this.errorProperty = new SimpleBooleanProperty(persistentImage.isError());
			this.errorProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					persistentImage.setError((Boolean) arg2);
				}
			});
			//Start of user code errorproperty method
			//End of user code
		}
		return this.errorProperty;
	}
	
	/*
	 * <!-- Start of user code comment for error getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isError(){
		return errorProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for error setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setError(boolean myError){
		this.errorProperty().set(myError);
	}
	
	public void updateError(final boolean myError, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setError(myError);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setError(myError);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateError(final boolean myError) {
		updateError(myError, null);
	}

	/*
	 * <!-- Start of user code comment for id property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(persistentImage.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					persistentImage.setId((Long) arg2);
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
	 * <!-- Start of user code comment for sourceFile property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty sourceFileProperty(){
		if (this.sourceFileProperty == null) {
			this.sourceFileProperty = new SimpleStringProperty(persistentImage.getSourceFile());
			this.sourceFileProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					persistentImage.setSourceFile((String) arg2);
				}
			});
			//Start of user code sourceFileproperty method
			//End of user code
		}
		return this.sourceFileProperty;
	}
	
	/*
	 * <!-- Start of user code comment for sourceFile getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getSourceFile(){
		return sourceFileProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for sourceFile setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setSourceFile(String mySourceFile){
		this.sourceFileProperty().set(mySourceFile);
	}
	
	public void updateSourceFile(final String mySourceFile, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSourceFile(mySourceFile);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSourceFile(mySourceFile);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateSourceFile(final String mySourceFile) {
		updateSourceFile(mySourceFile, null);
	}

	/*
	 * <!-- Start of user code comment for title property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty titleProperty(){
		if (this.titleProperty == null) {
			this.titleProperty = new SimpleStringProperty(persistentImage.getTitle());
			this.titleProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					persistentImage.setTitle((String) arg2);
				}
			});
			//Start of user code titleproperty method
			//End of user code
		}
		return this.titleProperty;
	}
	
	/*
	 * <!-- Start of user code comment for title getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getTitle(){
		return titleProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for title setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setTitle(String myTitle){
		this.titleProperty().set(myTitle);
	}
	
	public void updateTitle(final String myTitle, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTitle(myTitle);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTitle(myTitle);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTitle(final String myTitle) {
		updateTitle(myTitle, null);
	}

	/*
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(persistentImage.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					persistentImage.setUpdateDate(arg2);
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
				persistentImage.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(persistentImage.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					persistentImage.setVersion((Integer) arg2);
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


	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getPersistentImageBean() != null ? serializer.outputString(getPersistentImageBean().toXML()) : "";
		
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
