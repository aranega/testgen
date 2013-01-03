package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.ProjectBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import com.dooapp.firea.entity.ContactBean;
import com.dooapp.firea.entity.SampleBean;
//Start of user code for imports
// TODO: import me!
//End of user code




public class Project implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<com.dooapp.firea.entity.ProjectKind> statusProperty;
	
	private ObjectProperty<ObservableList<Contact>> contactsProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private StringProperty descriptionProperty;
	
	private ObjectProperty<GazConfiguration> gazconfigurationProperty;
	
	private LongProperty idProperty;
	
	private ObjectProperty<PersistentImage> imageProperty;
	
	private ObjectProperty<com.dooapp.firea.entity.ProjectKind> kindProperty;
	
	private StringProperty nameProperty;
	
	private ObjectProperty<Risque> risqueProperty;
	
	private ObjectProperty<ObservableList<Sample>> sampleProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final ProjectBean project;

	/*
	 * Constructors 
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
	public ObjectProperty<com.dooapp.firea.entity.ProjectKind> statusProperty() {
		if (statusProperty == null) {
			statusProperty = new SimpleObjectProperty<com.dooapp.firea.entity.ProjectKind>(project.getStatus());
			statusProperty.addListener(new ChangeListener<com.dooapp.firea.entity.ProjectKind>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.ProjectKind> arg0, com.dooapp.firea.entity.ProjectKind arg1, com.dooapp.firea.entity.ProjectKind arg2) {
					project.setStatus(arg2);
				}
			});
			//Start of user code Statusproperty method
			//End of user code
		}
		return statusProperty;
	}
	
	public com.dooapp.firea.entity.ProjectKind getStatus(){
		return statusProperty().get();
	} 
	
	public void setStatus(com.dooapp.firea.entity.ProjectKind myStatus){
		if (statusProperty == null) {
				project.setStatus(myStatus);
			} else {
				this.statusProperty().set(myStatus);
			}
	}
	
	public void updateStatus(final com.dooapp.firea.entity.ProjectKind myStatus, final Object mutex) {
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
	
	public void updateStatus(final com.dooapp.firea.entity.ProjectKind myStatus) {
		updateStatus(myStatus, null);
	}

	public ReadOnlyObjectProperty<ObservableList<Contact>> contactsProperty() {
		if (contactsProperty == null) {
			contactsProperty = new SimpleObjectProperty<ObservableList<Contact>>(
					FXCollections.<Contact> observableArrayList());
			for (ContactBean b : project.getContacts()) {
				contactsProperty.get().add(b.getWrapper());
			}
			contactsProperty.get().addListener(new javafx.collections.ListChangeListener<Contact>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Contact> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (Contact tmp : change.getAddedSubList()) {
								project.addContacts(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (Contact tmp : change.getRemoved()) {
								project.getContacts().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
			//Start of user code contactsproperty method
			//End of user code
		}
		return contactsProperty;
	}
	
	public ObservableList<Contact> getContacts()
	{ 
		return contactsProperty().get(); 
	}

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
	
	public java.util.Date getCreationDate(){
		return creationDateProperty().get();
	} 
	
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
	
	public String getDescription(){
		return descriptionProperty().get();
	} 
	
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
	
	public GazConfiguration getGazconfiguration(){
		return gazconfigurationProperty().get();
	} 
	
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
	
	public PersistentImage getImage(){
		return imageProperty().get();
	} 
	
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

	public ObjectProperty<com.dooapp.firea.entity.ProjectKind> kindProperty() {
		if (kindProperty == null) {
			kindProperty = new SimpleObjectProperty<com.dooapp.firea.entity.ProjectKind>(project.getKind());
			kindProperty.addListener(new ChangeListener<com.dooapp.firea.entity.ProjectKind>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.ProjectKind> arg0, com.dooapp.firea.entity.ProjectKind arg1, com.dooapp.firea.entity.ProjectKind arg2) {
					project.setKind(arg2);
				}
			});
			//Start of user code kindproperty method
			//End of user code
		}
		return kindProperty;
	}
	
	public com.dooapp.firea.entity.ProjectKind getKind(){
		return kindProperty().get();
	} 
	
	public void setKind(com.dooapp.firea.entity.ProjectKind myKind){
		if (kindProperty == null) {
				project.setKind(myKind);
			} else {
				this.kindProperty().set(myKind);
			}
	}
	
	public void updateKind(final com.dooapp.firea.entity.ProjectKind myKind, final Object mutex) {
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
	
	public void updateKind(final com.dooapp.firea.entity.ProjectKind myKind) {
		updateKind(myKind, null);
	}

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
	
	public Risque getRisque(){
		return risqueProperty().get();
	} 
	
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

	public ReadOnlyObjectProperty<ObservableList<Sample>> sampleProperty() {
		if (sampleProperty == null) {
			sampleProperty = new SimpleObjectProperty<ObservableList<Sample>>(
					FXCollections.<Sample> observableArrayList());
			for (SampleBean b : project.getSample()) {
				sampleProperty.get().add(b.getWrapper());
			}
			sampleProperty.get().addListener(new javafx.collections.ListChangeListener<Sample>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Sample> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (Sample tmp : change.getAddedSubList()) {
								project.addSample(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (Sample tmp : change.getRemoved()) {
								project.getSample().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
			//Start of user code sampleproperty method
			//End of user code
		}
		return sampleProperty;
	}
	
	public ObservableList<Sample> getSample()
	{ 
		return sampleProperty().get(); 
	}

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
	
	public java.util.Date getUpdateDate(){
		return updateDateProperty().get();
	} 
	
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