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
import com.dooapp.firea.entity.SampleBean;


import com.dooapp.firea.entity.ProjectKind;
import com.dooapp.firea.entity.ProjectStatus;


import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Attribute;
import org.jdom2.Element;

/**
 * 
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class Project
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<java.util.Date> creationDateProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty descriptionProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Contact> firmCustomerProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Contact> firmMaintenanceProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Contact> firmMoeProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<GazConfiguration> gazconfigurationProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private LongProperty idProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<PersistentImage> imageProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<ProjectKind> kindProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty nameProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty referenceProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Risque> risqueProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<ObservableList<Sample>> samplesProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<ProjectStatus> statusProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Contact> technicianProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<TestedRoom> testedroomProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<java.util.Date> updateDateProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private final ProjectBean project;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Project(){
		this(new ProjectBean());	
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ProjectBean getProjectBean(){
		return this.project;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ProjectBean getBean() {
		return  this.project;
	}
	

	/*
	 * Generated getters and setters
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return creationDateProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCreationDate(){
		return creationDateProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCreationDate(java.util.Date myCreationDate){
		if (creationDateProperty == null) {
				project.setCreationDate(myCreationDate);
			} else {
				this.creationDateProperty().set(myCreationDate);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDate(final java.util.Date myCreationDate) {
		updateCreationDate(myCreationDate, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.descriptionProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getDescription(){
		return descriptionProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDescription(String myDescription){
		this.descriptionProperty().set(myDescription);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDescription(final String myDescription) {
		updateDescription(myDescription, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Contact> firmCustomerProperty() {
		if (firmCustomerProperty == null) {
			firmCustomerProperty = new SimpleObjectProperty<Contact>(project.getFirmCustomer() == null ? null : project
					.getFirmCustomer().getWrapper());
			firmCustomerProperty.addListener(new ChangeListener<Contact>() {
				@Override
				public void changed(ObservableValue<? extends Contact> obj, Contact oldValue, Contact newValue) {
					project.setFirmCustomer(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return firmCustomerProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Contact getFirmCustomer(){
		return firmCustomerProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setFirmCustomer(Contact myFirmCustomer){
		if (firmCustomerProperty == null) {
				project.setFirmCustomer(myFirmCustomer == null ? null : myFirmCustomer.getBean());
			} else {
				this.firmCustomerProperty().set(myFirmCustomer);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFirmCustomer(final Contact myFirmCustomer, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFirmCustomer(myFirmCustomer);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFirmCustomer(myFirmCustomer);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFirmCustomer(final Contact myFirmCustomer) {
		updateFirmCustomer(myFirmCustomer, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Contact> firmMaintenanceProperty() {
		if (firmMaintenanceProperty == null) {
			firmMaintenanceProperty = new SimpleObjectProperty<Contact>(project.getFirmMaintenance() == null ? null : project
					.getFirmMaintenance().getWrapper());
			firmMaintenanceProperty.addListener(new ChangeListener<Contact>() {
				@Override
				public void changed(ObservableValue<? extends Contact> obj, Contact oldValue, Contact newValue) {
					project.setFirmMaintenance(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return firmMaintenanceProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Contact getFirmMaintenance(){
		return firmMaintenanceProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setFirmMaintenance(Contact myFirmMaintenance){
		if (firmMaintenanceProperty == null) {
				project.setFirmMaintenance(myFirmMaintenance == null ? null : myFirmMaintenance.getBean());
			} else {
				this.firmMaintenanceProperty().set(myFirmMaintenance);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFirmMaintenance(final Contact myFirmMaintenance, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFirmMaintenance(myFirmMaintenance);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFirmMaintenance(myFirmMaintenance);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFirmMaintenance(final Contact myFirmMaintenance) {
		updateFirmMaintenance(myFirmMaintenance, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Contact> firmMoeProperty() {
		if (firmMoeProperty == null) {
			firmMoeProperty = new SimpleObjectProperty<Contact>(project.getFirmMoe() == null ? null : project
					.getFirmMoe().getWrapper());
			firmMoeProperty.addListener(new ChangeListener<Contact>() {
				@Override
				public void changed(ObservableValue<? extends Contact> obj, Contact oldValue, Contact newValue) {
					project.setFirmMoe(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return firmMoeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Contact getFirmMoe(){
		return firmMoeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setFirmMoe(Contact myFirmMoe){
		if (firmMoeProperty == null) {
				project.setFirmMoe(myFirmMoe == null ? null : myFirmMoe.getBean());
			} else {
				this.firmMoeProperty().set(myFirmMoe);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFirmMoe(final Contact myFirmMoe, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFirmMoe(myFirmMoe);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFirmMoe(myFirmMoe);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFirmMoe(final Contact myFirmMoe) {
		updateFirmMoe(myFirmMoe, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return gazconfigurationProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazConfiguration getGazconfiguration(){
		return gazconfigurationProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setGazconfiguration(GazConfiguration myGazconfiguration){
		if (gazconfigurationProperty == null) {
				project.setGazconfiguration(myGazconfiguration == null ? null : myGazconfiguration.getBean());
			} else {
				this.gazconfigurationProperty().set(myGazconfiguration);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateGazconfiguration(final GazConfiguration myGazconfiguration) {
		updateGazconfiguration(myGazconfiguration, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.idProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public long getId(){
		return idProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setId(long myId){
		this.idProperty().set(myId);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateId(final long myId) {
		updateId(myId, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return imageProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public PersistentImage getImage(){
		return imageProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setImage(PersistentImage myImage){
		if (imageProperty == null) {
				project.setImage(myImage == null ? null : myImage.getBean());
			} else {
				this.imageProperty().set(myImage);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateImage(final PersistentImage myImage) {
		updateImage(myImage, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<ProjectKind> kindProperty() {
		if (kindProperty == null) {
			kindProperty = new SimpleObjectProperty<ProjectKind>(project.getKind());
			kindProperty.addListener(new ChangeListener<ProjectKind>() {
				@Override
				public void changed(ObservableValue<? extends ProjectKind> arg0, ProjectKind arg1, ProjectKind arg2) {
					project.setKind(arg2);
				}
			});
		}
		return kindProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ProjectKind getKind(){
		return kindProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setKind(ProjectKind myKind){
		if (kindProperty == null) {
				project.setKind(myKind);
			} else {
				this.kindProperty().set(myKind);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateKind(final ProjectKind myKind, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateKind(final ProjectKind myKind) {
		updateKind(myKind, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.nameProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getName(){
		return nameProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setName(String myName){
		this.nameProperty().set(myName);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateName(final String myName) {
		updateName(myName, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StringProperty referenceProperty(){
		if (this.referenceProperty == null) {
			this.referenceProperty = new SimpleStringProperty(project.getReference());
			this.referenceProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					project.setReference((String) arg2);
				}
			});
		}
		return this.referenceProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getReference(){
		return referenceProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setReference(String myReference){
		this.referenceProperty().set(myReference);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateReference(final String myReference, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setReference(myReference);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setReference(myReference);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateReference(final String myReference) {
		updateReference(myReference, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return risqueProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Risque getRisque(){
		return risqueProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisque(Risque myRisque){
		if (risqueProperty == null) {
				project.setRisque(myRisque == null ? null : myRisque.getBean());
			} else {
				this.risqueProperty().set(myRisque);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisque(final Risque myRisque) {
		updateRisque(myRisque, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ReadOnlyObjectProperty<ObservableList<Sample>> samplesProperty() {
		if (samplesProperty == null) {
			samplesProperty = new SimpleObjectProperty<ObservableList<Sample>>(
					FXCollections.<Sample> observableArrayList());
			for (SampleBean tmp : this.project.getSamples()) {
				samplesProperty.get().add(tmp.getWrapper());
			}
			samplesProperty.get().addListener(new javafx.collections.ListChangeListener<Sample>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Sample> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (Sample tmp : change.getAddedSubList()) {
								project.addSamples(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (Sample tmp : change.getRemoved()) {
								project.getSamples().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
		}
		return samplesProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObservableList<Sample> getSamples()
	{ 
		return samplesProperty().get(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<ProjectStatus> statusProperty() {
		if (statusProperty == null) {
			statusProperty = new SimpleObjectProperty<ProjectStatus>(project.getStatus());
			statusProperty.addListener(new ChangeListener<ProjectStatus>() {
				@Override
				public void changed(ObservableValue<? extends ProjectStatus> arg0, ProjectStatus arg1, ProjectStatus arg2) {
					project.setStatus(arg2);
				}
			});
		}
		return statusProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ProjectStatus getStatus(){
		return statusProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setStatus(ProjectStatus myStatus){
		if (statusProperty == null) {
				project.setStatus(myStatus);
			} else {
				this.statusProperty().set(myStatus);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateStatus(final ProjectStatus myStatus, final Object mutex) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateStatus(final ProjectStatus myStatus) {
		updateStatus(myStatus, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Contact> technicianProperty() {
		if (technicianProperty == null) {
			technicianProperty = new SimpleObjectProperty<Contact>(project.getTechnician() == null ? null : project
					.getTechnician().getWrapper());
			technicianProperty.addListener(new ChangeListener<Contact>() {
				@Override
				public void changed(ObservableValue<? extends Contact> obj, Contact oldValue, Contact newValue) {
					project.setTechnician(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return technicianProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Contact getTechnician(){
		return technicianProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTechnician(Contact myTechnician){
		if (technicianProperty == null) {
				project.setTechnician(myTechnician == null ? null : myTechnician.getBean());
			} else {
				this.technicianProperty().set(myTechnician);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTechnician(final Contact myTechnician, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTechnician(myTechnician);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTechnician(myTechnician);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTechnician(final Contact myTechnician) {
		updateTechnician(myTechnician, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<TestedRoom> testedroomProperty() {
		if (testedroomProperty == null) {
			testedroomProperty = new SimpleObjectProperty<TestedRoom>(project.getTestedroom() == null ? null : project
					.getTestedroom().getWrapper());
			testedroomProperty.addListener(new ChangeListener<TestedRoom>() {
				@Override
				public void changed(ObservableValue<? extends TestedRoom> obj, TestedRoom oldValue, TestedRoom newValue) {
					project.setTestedroom(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return testedroomProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoom getTestedroom(){
		return testedroomProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTestedroom(TestedRoom myTestedroom){
		if (testedroomProperty == null) {
				project.setTestedroom(myTestedroom == null ? null : myTestedroom.getBean());
			} else {
				this.testedroomProperty().set(myTestedroom);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTestedroom(final TestedRoom myTestedroom, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTestedroom(myTestedroom);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTestedroom(myTestedroom);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTestedroom(final TestedRoom myTestedroom) {
		updateTestedroom(myTestedroom, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return updateDateProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getUpdateDate(){
		return updateDateProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUpdateDate(java.util.Date myUpdateDate){
		if (updateDateProperty == null) {
				project.setUpdateDate(myUpdateDate);
			} else {
				this.updateDateProperty().set(myUpdateDate);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDate(final java.util.Date myUpdateDate) {
		updateUpdateDate(myUpdateDate, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.versionProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getVersion(){
		return versionProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setVersion(int myVersion){
		this.versionProperty().set(myVersion);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVersion(final int myVersion) {
		updateVersion(myVersion, null);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getProjectBean() != null ? serializer.outputString(this.toDomXML()) : "";
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Element toDomXML(){
		Element xmlElement = new Element("Project");
		if (getName() != null)
			xmlElement.setAttribute(new Attribute("name", getName()));
		if (getReference() != null)
			xmlElement.setAttribute(new Attribute("reference", getReference()));
		xmlElement.setAttribute(new Attribute("kind", String.valueOf(getKind())));
		xmlElement.setAttribute(new Attribute("status", String.valueOf(getStatus())));
		if (getDescription() != null)
			xmlElement.setAttribute(new Attribute("description", getDescription()));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		
		if (getImage() != null) {
			Element image = new Element("image");
			image.addContent(getImage().toXML());
			xmlElement.addContent(image);
		}if (getRisque() != null)
			xmlElement.setAttribute("risque", String.valueOf(getRisque().getId()));
		if (getFirmCustomer() != null)
			xmlElement.setAttribute("firmCustomer", String.valueOf(getFirmCustomer().getId()));
		if (getTechnician() != null)
			xmlElement.setAttribute("technician", String.valueOf(getTechnician().getId()));
		if (getFirmMaintenance() != null)
			xmlElement.setAttribute("firmMaintenance", String.valueOf(getFirmMaintenance().getId()));
		if (getTestedroom() != null) {
			Element testedroom = new Element("testedroom");
			testedroom.addContent(getTestedroom().toXML());
			xmlElement.addContent(testedroom);
		}if (!getSamples().isEmpty()) {
			Element samples = new Element("samples");
			for (Sample tmp : getSamples())
				samples.addContent(tmp.toXML());
			xmlElement.addContent(samples);
		}
		if (getGazconfiguration() != null) {
			Element gazconfiguration = new Element("gazconfiguration");
			gazconfiguration.addContent(getGazconfiguration().toXML());
			xmlElement.addContent(gazconfiguration);
		}if (getFirmMoe() != null)
			xmlElement.setAttribute("firmMoe", String.valueOf(getFirmMoe().getId()));
		
		
		// For custom purposes
		xmlElement = this.customDomXML(xmlElement);
		
		return xmlElement;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Element customDomXML(Element e) {
		return e;
	}

}
