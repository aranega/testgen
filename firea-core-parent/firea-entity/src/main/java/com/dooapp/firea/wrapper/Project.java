package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.ProjectBean;

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




// Start of user code comment for Project Class

// End of user code

public class Project
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private StringProperty statusProperty;
	
	private ObjectProperty<Contact> contactsProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private StringProperty descriptionProperty;
	
	private ObjectProperty<GazConfiguration> gazconfigurationProperty;
	
	private LongProperty idProperty;
	
	private ObjectProperty<PersistentImage> imageProperty;
	
	private StringProperty kindProperty;
	
	private StringProperty nameProperty;
	
	private ObjectProperty<Risque> risqueProperty;
	
	private ObjectProperty<Sample> sampleProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final ProjectBean project;

	/*
	 * Constructors
	 * <!-- Start of user code comment for Project constructor
	 * End of user code -->
	 */
	public Project(){
		this(new ProjectBean());	
	}
	
	
	public Project(ProjectBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.project = entity;
	}
	
	public ProjectBean getProjectBean(){
		return this.project;
	}
	
	public ProjectBean getBean() {
		return  this.project;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for Status property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty statusProperty(){
		if (this.statusProperty == null) {
			this.statusProperty = new SimpleStringProperty(project.getStatus());
			this.statusProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					project.setStatus((String) arg2);
				}
			});
			//Start of user code Statusproperty method
			//End of user code
		}
		return this.statusProperty;
	}
	
	/*
	 * <!-- Start of user code comment for Status getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getStatus(){
		return statusProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for Status setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setStatus(String myStatus){
		this.statusProperty().set(myStatus);
	}
	
	public void updateStatus(final String myStatus, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setStatus(myStatus);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setStatus(myStatus);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateStatus(final String myStatus) {
		updateStatus(myStatus, null);
	}

	/*
	 * <!-- Start of user code comment for contacts property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Contact> contactsProperty() {
		if (contactsProperty == null) {
			contactsProperty = new SimpleObjectProperty<Contact>(project.getContacts() == null ? null : project
					.getContacts().getWrapper());
			contactsProperty.addListener(new ChangeListener<Contact>() {
				@Override
				public void changed(ObservableValue<? extends Contact> obj, Contact oldValue, Contact newValue) {
					project.setContacts(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code contactsproperty method
			//End of user code
		}
		return contactsProperty;
	}
	
	/*
	 * <!-- Start of user code comment for contacts getter 
		-->
	 * <!-- End of user code -->
	 */
	public Contact getContacts(){
		return contactsProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for contacts setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setContacts(Contact myContacts){
		if (contactsProperty == null) {
				project.setContacts(myContacts == null ? null : myContacts.getBean());
			} else {
				this.contactsProperty().set(myContacts);
			}
	}
	
	public void updateContacts(final Contact myContacts, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setContacts(myContacts);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setContacts(myContacts);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateContacts(final Contact myContacts) {
		updateContacts(myContacts, null);
	}

	/*
	 * <!-- Start of user code comment for creationDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(project.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					project.setCreationDate(arg2);
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
				project.setCreationDate(myCreationDate);
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
	 * <!-- Start of user code comment for description property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty descriptionProperty(){
		if (this.descriptionProperty == null) {
			this.descriptionProperty = new SimpleStringProperty(project.getDescription());
			this.descriptionProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					project.setDescription((String) arg2);
				}
			});
			//Start of user code descriptionproperty method
			//End of user code
		}
		return this.descriptionProperty;
	}
	
	/*
	 * <!-- Start of user code comment for description getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getDescription(){
		return descriptionProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for description setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDescription(String myDescription){
		this.descriptionProperty().set(myDescription);
	}
	
	public void updateDescription(final String myDescription, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDescription(myDescription);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDescription(myDescription);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDescription(final String myDescription) {
		updateDescription(myDescription, null);
	}

	/*
	 * <!-- Start of user code comment for gazconfiguration property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<GazConfiguration> gazconfigurationProperty() {
		if (gazconfigurationProperty == null) {
			gazconfigurationProperty = new SimpleObjectProperty<GazConfiguration>(project.getGazconfiguration() == null ? null : project
					.getGazconfiguration().getWrapper());
			gazconfigurationProperty.addListener(new ChangeListener<GazConfiguration>() {
				@Override
				public void changed(ObservableValue<? extends GazConfiguration> obj, GazConfiguration oldValue, GazConfiguration newValue) {
					project.setGazconfiguration(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code gazconfigurationproperty method
			//End of user code
		}
		return gazconfigurationProperty;
	}
	
	/*
	 * <!-- Start of user code comment for gazconfiguration getter 
		-->
	 * <!-- End of user code -->
	 */
	public GazConfiguration getGazconfiguration(){
		return gazconfigurationProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for gazconfiguration setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setGazconfiguration(GazConfiguration myGazconfiguration){
		if (gazconfigurationProperty == null) {
				project.setGazconfiguration(myGazconfiguration == null ? null : myGazconfiguration.getBean());
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

	/*
	 * <!-- Start of user code comment for id property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(project.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					project.setId((Long) arg2);
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
	 * <!-- Start of user code comment for image property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<PersistentImage> imageProperty() {
		if (imageProperty == null) {
			imageProperty = new SimpleObjectProperty<PersistentImage>(project.getImage() == null ? null : project
					.getImage().getWrapper());
			imageProperty.addListener(new ChangeListener<PersistentImage>() {
				@Override
				public void changed(ObservableValue<? extends PersistentImage> obj, PersistentImage oldValue, PersistentImage newValue) {
					project.setImage(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code imageproperty method
			//End of user code
		}
		return imageProperty;
	}
	
	/*
	 * <!-- Start of user code comment for image getter 
		-->
	 * <!-- End of user code -->
	 */
	public PersistentImage getImage(){
		return imageProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for image setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setImage(PersistentImage myImage){
		if (imageProperty == null) {
				project.setImage(myImage == null ? null : myImage.getBean());
			} else {
				this.imageProperty().set(myImage);
			}
	}
	
	public void updateImage(final PersistentImage myImage, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setImage(myImage);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setImage(myImage);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateImage(final PersistentImage myImage) {
		updateImage(myImage, null);
	}

	/*
	 * <!-- Start of user code comment for kind property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty kindProperty(){
		if (this.kindProperty == null) {
			this.kindProperty = new SimpleStringProperty(project.getKind());
			this.kindProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					project.setKind((String) arg2);
				}
			});
			//Start of user code kindproperty method
			//End of user code
		}
		return this.kindProperty;
	}
	
	/*
	 * <!-- Start of user code comment for kind getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getKind(){
		return kindProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for kind setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setKind(String myKind){
		this.kindProperty().set(myKind);
	}
	
	public void updateKind(final String myKind, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setKind(myKind);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setKind(myKind);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateKind(final String myKind) {
		updateKind(myKind, null);
	}

	/*
	 * <!-- Start of user code comment for name property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty nameProperty(){
		if (this.nameProperty == null) {
			this.nameProperty = new SimpleStringProperty(project.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					project.setName((String) arg2);
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
	 * <!-- Start of user code comment for risque property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Risque> risqueProperty() {
		if (risqueProperty == null) {
			risqueProperty = new SimpleObjectProperty<Risque>(project.getRisque() == null ? null : project
					.getRisque().getWrapper());
			risqueProperty.addListener(new ChangeListener<Risque>() {
				@Override
				public void changed(ObservableValue<? extends Risque> obj, Risque oldValue, Risque newValue) {
					project.setRisque(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code risqueproperty method
			//End of user code
		}
		return risqueProperty;
	}
	
	/*
	 * <!-- Start of user code comment for risque getter 
		-->
	 * <!-- End of user code -->
	 */
	public Risque getRisque(){
		return risqueProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for risque setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setRisque(Risque myRisque){
		if (risqueProperty == null) {
				project.setRisque(myRisque == null ? null : myRisque.getBean());
			} else {
				this.risqueProperty().set(myRisque);
			}
	}
	
	public void updateRisque(final Risque myRisque, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisque(myRisque);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisque(myRisque);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRisque(final Risque myRisque) {
		updateRisque(myRisque, null);
	}

	/*
	 * <!-- Start of user code comment for sample property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Sample> sampleProperty() {
		if (sampleProperty == null) {
			sampleProperty = new SimpleObjectProperty<Sample>(project.getSample() == null ? null : project
					.getSample().getWrapper());
			sampleProperty.addListener(new ChangeListener<Sample>() {
				@Override
				public void changed(ObservableValue<? extends Sample> obj, Sample oldValue, Sample newValue) {
					project.setSample(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code sampleproperty method
			//End of user code
		}
		return sampleProperty;
	}
	
	/*
	 * <!-- Start of user code comment for sample getter 
		-->
	 * <!-- End of user code -->
	 */
	public Sample getSample(){
		return sampleProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for sample setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setSample(Sample mySample){
		if (sampleProperty == null) {
				project.setSample(mySample == null ? null : mySample.getBean());
			} else {
				this.sampleProperty().set(mySample);
			}
	}
	
	public void updateSample(final Sample mySample, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSample(mySample);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSample(mySample);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateSample(final Sample mySample) {
		updateSample(mySample, null);
	}

	/*
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(project.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					project.setUpdateDate(arg2);
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
				project.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(project.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					project.setVersion((Integer) arg2);
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
		return getProjectBean() != null ? serializer.outputString(getProjectBean().toXML()) : "";
		
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
