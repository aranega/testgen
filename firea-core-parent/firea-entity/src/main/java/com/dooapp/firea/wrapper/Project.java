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


import com.dooapp.firea.enumeration.ProjectKind;
import com.dooapp.firea.enumeration.ProjectStatus;


import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Attribute;
import org.jdom2.Element;

import com.dooapp.lib.common.entity.BeanClass;

import com.dooapp.firea.visitor.FireaVisitor;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@BeanClass(ProjectBean.class)
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
	private ObjectProperty<ProjectStatus> statusProperty;
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
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Contact> firmCustomerProperty;
	/**
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
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<PersistentImage> imageProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<ProjectKind> kindProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty nameDoProperty;
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
	private ObjectProperty<ObservableList<Sample>> sampleProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Contact> technicianProperty;
	/**
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
	public ObjectProperty<ProjectStatus> statusProperty() {
		if (statusProperty == null) {
			statusProperty = createStatusProperty();
			getBean().setStatus(getBean().getStatus());
			statusProperty.addListener(new ChangeListener<ProjectStatus>() {
				@Override
				public void changed(ObservableValue<? extends ProjectStatus> arg0, ProjectStatus arg1, ProjectStatus arg2) {
					getBean().setStatus(arg2);
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
	protected ObjectProperty<ProjectStatus> createStatusProperty(){
		return  new SimpleObjectProperty<ProjectStatus>(getBean().getStatus());
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
				getBean().setStatus(myStatus);
			} else {
				this.statusProperty().set(myStatus);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateStatus(final ProjectStatus myStatus) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setStatus(myStatus);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setStatus(myStatus);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateStatusAndWait(final ProjectStatus myStatus) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setStatus(myStatus);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setStatus(myStatus);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = createCreationDateProperty();
			getBean().setCreationDate(getBean().getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setCreationDate(arg2);
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
	protected ObjectProperty<java.util.Date> createCreationDateProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getCreationDate());
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
				getBean().setCreationDate(myCreationDate);
			} else {
				this.creationDateProperty().set(myCreationDate);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDate(final java.util.Date myCreationDate) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDate(myCreationDate);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDate(myCreationDate);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateAndWait(final java.util.Date myCreationDate) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDate(myCreationDate);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDate(myCreationDate);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StringProperty descriptionProperty(){
		if (this.descriptionProperty == null) {
			this.descriptionProperty = createDescriptionProperty();
			getBean().setDescription(getBean().getDescription());
			this.descriptionProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setDescription((String) arg2);
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
	protected StringProperty createDescriptionProperty(){
		return new SimpleStringProperty(getBean().getDescription());
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
	public void updateDescription(final String myDescription) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDescription(myDescription);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDescription(myDescription);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDescriptionAndWait(final String myDescription) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDescription(myDescription);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDescription(myDescription);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Contact> firmCustomerProperty() {
		if (firmCustomerProperty == null) {
			firmCustomerProperty = createFirmCustomerProperty();
			getBean().setFirmCustomer(getBean().getFirmCustomer() == null ? null : getBean()
							.getFirmCustomer());
			firmCustomerProperty.addListener(new ChangeListener<Contact>() {
				@Override
				public void changed(ObservableValue<? extends Contact> obj, Contact oldValue, Contact newValue) {
					getBean().setFirmCustomer(newValue == null ? null : newValue.getBean());
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
	protected ObjectProperty<Contact> createFirmCustomerProperty(){
		return new SimpleObjectProperty<Contact>(getBean().getFirmCustomer() == null ? null : getBean()
							.getFirmCustomer().getWrapper());
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
				getBean().setFirmCustomer(myFirmCustomer == null ? null : myFirmCustomer.getBean());
			} else {
				this.firmCustomerProperty().set(myFirmCustomer);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFirmCustomer(final Contact myFirmCustomer) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFirmCustomer(myFirmCustomer);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFirmCustomer(myFirmCustomer);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFirmCustomerAndWait(final Contact myFirmCustomer) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFirmCustomer(myFirmCustomer);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFirmCustomer(myFirmCustomer);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Contact> firmMaintenanceProperty() {
		if (firmMaintenanceProperty == null) {
			firmMaintenanceProperty = createFirmMaintenanceProperty();
			getBean().setFirmMaintenance(getBean().getFirmMaintenance() == null ? null : getBean()
							.getFirmMaintenance());
			firmMaintenanceProperty.addListener(new ChangeListener<Contact>() {
				@Override
				public void changed(ObservableValue<? extends Contact> obj, Contact oldValue, Contact newValue) {
					getBean().setFirmMaintenance(newValue == null ? null : newValue.getBean());
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
	protected ObjectProperty<Contact> createFirmMaintenanceProperty(){
		return new SimpleObjectProperty<Contact>(getBean().getFirmMaintenance() == null ? null : getBean()
							.getFirmMaintenance().getWrapper());
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
				getBean().setFirmMaintenance(myFirmMaintenance == null ? null : myFirmMaintenance.getBean());
			} else {
				this.firmMaintenanceProperty().set(myFirmMaintenance);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFirmMaintenance(final Contact myFirmMaintenance) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFirmMaintenance(myFirmMaintenance);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFirmMaintenance(myFirmMaintenance);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFirmMaintenanceAndWait(final Contact myFirmMaintenance) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFirmMaintenance(myFirmMaintenance);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFirmMaintenance(myFirmMaintenance);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Contact> firmMoeProperty() {
		if (firmMoeProperty == null) {
			firmMoeProperty = createFirmMoeProperty();
			getBean().setFirmMoe(getBean().getFirmMoe() == null ? null : getBean()
							.getFirmMoe());
			firmMoeProperty.addListener(new ChangeListener<Contact>() {
				@Override
				public void changed(ObservableValue<? extends Contact> obj, Contact oldValue, Contact newValue) {
					getBean().setFirmMoe(newValue == null ? null : newValue.getBean());
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
	protected ObjectProperty<Contact> createFirmMoeProperty(){
		return new SimpleObjectProperty<Contact>(getBean().getFirmMoe() == null ? null : getBean()
							.getFirmMoe().getWrapper());
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
				getBean().setFirmMoe(myFirmMoe == null ? null : myFirmMoe.getBean());
			} else {
				this.firmMoeProperty().set(myFirmMoe);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFirmMoe(final Contact myFirmMoe) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFirmMoe(myFirmMoe);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFirmMoe(myFirmMoe);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFirmMoeAndWait(final Contact myFirmMoe) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFirmMoe(myFirmMoe);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFirmMoe(myFirmMoe);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<GazConfiguration> gazconfigurationProperty() {
		if (gazconfigurationProperty == null) {
			gazconfigurationProperty = createGazconfigurationProperty();
			getBean().setGazconfiguration(getBean().getGazconfiguration() == null ? null : getBean()
							.getGazconfiguration());
			gazconfigurationProperty.addListener(new ChangeListener<GazConfiguration>() {
				@Override
				public void changed(ObservableValue<? extends GazConfiguration> obj, GazConfiguration oldValue, GazConfiguration newValue) {
					getBean().setGazconfiguration(newValue == null ? null : newValue.getBean());
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
	protected ObjectProperty<GazConfiguration> createGazconfigurationProperty(){
		return new SimpleObjectProperty<GazConfiguration>(getBean().getGazconfiguration() == null ? null : getBean()
							.getGazconfiguration().getWrapper());
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
				getBean().setGazconfiguration(myGazconfiguration == null ? null : myGazconfiguration.getBean());
			} else {
				this.gazconfigurationProperty().set(myGazconfiguration);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateGazconfiguration(final GazConfiguration myGazconfiguration) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setGazconfiguration(myGazconfiguration);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setGazconfiguration(myGazconfiguration);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateGazconfigurationAndWait(final GazConfiguration myGazconfiguration) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setGazconfiguration(myGazconfiguration);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setGazconfiguration(myGazconfiguration);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = createIdProperty();
			getBean().setId(getBean().getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setId((Long) arg2);
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
	protected LongProperty createIdProperty(){
		return new SimpleLongProperty(getBean().getId());
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
	public void updateId(final Long myId) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setId(myId);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setId(myId);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIdAndWait(final Long myId) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setId(myId);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setId(myId);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<PersistentImage> imageProperty() {
		if (imageProperty == null) {
			imageProperty = createImageProperty();
			getBean().setImage(getBean().getImage() == null ? null : getBean()
							.getImage());
			imageProperty.addListener(new ChangeListener<PersistentImage>() {
				@Override
				public void changed(ObservableValue<? extends PersistentImage> obj, PersistentImage oldValue, PersistentImage newValue) {
					getBean().setImage(newValue == null ? null : newValue.getBean());
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
	protected ObjectProperty<PersistentImage> createImageProperty(){
		return new SimpleObjectProperty<PersistentImage>(getBean().getImage() == null ? null : getBean()
							.getImage().getWrapper());
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
				getBean().setImage(myImage == null ? null : myImage.getBean());
			} else {
				this.imageProperty().set(myImage);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateImage(final PersistentImage myImage) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setImage(myImage);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setImage(myImage);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateImageAndWait(final PersistentImage myImage) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setImage(myImage);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setImage(myImage);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<ProjectKind> kindProperty() {
		if (kindProperty == null) {
			kindProperty = createKindProperty();
			getBean().setKind(getBean().getKind());
			kindProperty.addListener(new ChangeListener<ProjectKind>() {
				@Override
				public void changed(ObservableValue<? extends ProjectKind> arg0, ProjectKind arg1, ProjectKind arg2) {
					getBean().setKind(arg2);
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
	protected ObjectProperty<ProjectKind> createKindProperty(){
		return  new SimpleObjectProperty<ProjectKind>(getBean().getKind());
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
				getBean().setKind(myKind);
			} else {
				this.kindProperty().set(myKind);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateKind(final ProjectKind myKind) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setKind(myKind);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setKind(myKind);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateKindAndWait(final ProjectKind myKind) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setKind(myKind);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setKind(myKind);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StringProperty nameDoProperty(){
		if (this.nameDoProperty == null) {
			this.nameDoProperty = createNameDoProperty();
			getBean().setNameDo(getBean().getNameDo());
			this.nameDoProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setNameDo((String) arg2);
				}
			});
		}
		return this.nameDoProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createNameDoProperty(){
		return new SimpleStringProperty(getBean().getNameDo());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getNameDo(){
		return nameDoProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setNameDo(String myNameDo){
		this.nameDoProperty().set(myNameDo);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNameDo(final String myNameDo) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNameDo(myNameDo);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNameDo(myNameDo);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNameDoAndWait(final String myNameDo) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNameDo(myNameDo);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNameDo(myNameDo);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StringProperty referenceProperty(){
		if (this.referenceProperty == null) {
			this.referenceProperty = createReferenceProperty();
			getBean().setReference(getBean().getReference());
			this.referenceProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setReference((String) arg2);
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
	protected StringProperty createReferenceProperty(){
		return new SimpleStringProperty(getBean().getReference());
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
	public void updateReference(final String myReference) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setReference(myReference);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setReference(myReference);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateReferenceAndWait(final String myReference) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setReference(myReference);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setReference(myReference);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Risque> risqueProperty() {
		if (risqueProperty == null) {
			risqueProperty = createRisqueProperty();
			getBean().setRisque(getBean().getRisque() == null ? null : getBean()
							.getRisque());
			risqueProperty.addListener(new ChangeListener<Risque>() {
				@Override
				public void changed(ObservableValue<? extends Risque> obj, Risque oldValue, Risque newValue) {
					getBean().setRisque(newValue == null ? null : newValue.getBean());
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
	protected ObjectProperty<Risque> createRisqueProperty(){
		return new SimpleObjectProperty<Risque>(getBean().getRisque() == null ? null : getBean()
							.getRisque().getWrapper());
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
				getBean().setRisque(myRisque == null ? null : myRisque.getBean());
			} else {
				this.risqueProperty().set(myRisque);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisque(final Risque myRisque) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisque(myRisque);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisque(myRisque);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueAndWait(final Risque myRisque) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisque(myRisque);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisque(myRisque);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ReadOnlyObjectProperty<ObservableList<Sample>> sampleProperty() {
		if (sampleProperty == null) {
			sampleProperty = createSample();
			sampleProperty.get().addListener(new javafx.collections.ListChangeListener<Sample>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Sample> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (Sample tmp : change.getAddedSubList()) {
								getBean().addSample(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (Sample tmp : change.getRemoved()) {
								getBean().getSample().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
		}
		return sampleProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<ObservableList<Sample>> createSample()
	{ 
		ObjectProperty<ObservableList<Sample>> list = new SimpleObjectProperty<ObservableList<Sample>>(
					FXCollections.<Sample> observableArrayList());
		for (SampleBean tmp : getBean().getSample()) {
			list.get().add(tmp.getWrapper());
		}
		return list; 
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObservableList<Sample> getSample()
	{ 
		return sampleProperty().get(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Contact> technicianProperty() {
		if (technicianProperty == null) {
			technicianProperty = createTechnicianProperty();
			getBean().setTechnician(getBean().getTechnician() == null ? null : getBean()
							.getTechnician());
			technicianProperty.addListener(new ChangeListener<Contact>() {
				@Override
				public void changed(ObservableValue<? extends Contact> obj, Contact oldValue, Contact newValue) {
					getBean().setTechnician(newValue == null ? null : newValue.getBean());
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
	protected ObjectProperty<Contact> createTechnicianProperty(){
		return new SimpleObjectProperty<Contact>(getBean().getTechnician() == null ? null : getBean()
							.getTechnician().getWrapper());
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
				getBean().setTechnician(myTechnician == null ? null : myTechnician.getBean());
			} else {
				this.technicianProperty().set(myTechnician);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTechnician(final Contact myTechnician) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTechnician(myTechnician);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTechnician(myTechnician);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTechnicianAndWait(final Contact myTechnician) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTechnician(myTechnician);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTechnician(myTechnician);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<TestedRoom> testedroomProperty() {
		if (testedroomProperty == null) {
			testedroomProperty = createTestedroomProperty();
			getBean().setTestedroom(getBean().getTestedroom() == null ? null : getBean()
							.getTestedroom());
			testedroomProperty.addListener(new ChangeListener<TestedRoom>() {
				@Override
				public void changed(ObservableValue<? extends TestedRoom> obj, TestedRoom oldValue, TestedRoom newValue) {
					getBean().setTestedroom(newValue == null ? null : newValue.getBean());
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
	protected ObjectProperty<TestedRoom> createTestedroomProperty(){
		return new SimpleObjectProperty<TestedRoom>(getBean().getTestedroom() == null ? null : getBean()
							.getTestedroom().getWrapper());
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
				getBean().setTestedroom(myTestedroom == null ? null : myTestedroom.getBean());
			} else {
				this.testedroomProperty().set(myTestedroom);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTestedroom(final TestedRoom myTestedroom) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTestedroom(myTestedroom);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTestedroom(myTestedroom);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTestedroomAndWait(final TestedRoom myTestedroom) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTestedroom(myTestedroom);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTestedroom(myTestedroom);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = createUpdateDateProperty();
			getBean().setUpdateDate(getBean().getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setUpdateDate(arg2);
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
	protected ObjectProperty<java.util.Date> createUpdateDateProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getUpdateDate());
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
				getBean().setUpdateDate(myUpdateDate);
			} else {
				this.updateDateProperty().set(myUpdateDate);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDate(final java.util.Date myUpdateDate) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDate(myUpdateDate);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDate(myUpdateDate);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateAndWait(final java.util.Date myUpdateDate) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDate(myUpdateDate);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDate(myUpdateDate);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public IntegerProperty versionProperty(){
		if (this.versionProperty == null) {
			this.versionProperty = createVersionProperty();
			getBean().setVersion(getBean().getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setVersion((Integer) arg2);
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
	protected IntegerProperty createVersionProperty(){
		return new SimpleIntegerProperty(getBean().getVersion());
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
	public void updateVersion(final Integer myVersion) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVersion(myVersion);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVersion(myVersion);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVersionAndWait(final Integer myVersion) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVersion(myVersion);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVersion(myVersion);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}


	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getBean() != null ? serializer.outputString(this.toDomXML()) : "";
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Element toDomXML(){
		Element xmlElement = new Element("Project");
		if (this.getBean().getUUID() != null)
			xmlElement.setAttribute(new Attribute("uuid", this.getBean().getUUID()));
		xmlElement.setAttribute(new Attribute("Status", String.valueOf(getStatus())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getDescription() != null)
			xmlElement.setAttribute(new Attribute("description", getDescription()));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		xmlElement.setAttribute(new Attribute("kind", String.valueOf(getKind())));
		if (getNameDo() != null)
			xmlElement.setAttribute(new Attribute("nameDo", getNameDo()));
		if (getReference() != null)
			xmlElement.setAttribute(new Attribute("reference", getReference()));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		
		if (getFirmCustomer() != null)
			xmlElement.setAttribute("firmCustomer", String.valueOf(getFirmCustomer().getId()));
		if (getFirmMaintenance() != null)
			xmlElement.setAttribute("firmMaintenance", String.valueOf(getFirmMaintenance().getId()));
		if (getFirmMoe() != null)
			xmlElement.setAttribute("firmMoe", String.valueOf(getFirmMoe().getId()));
		if (getGazconfiguration() != null) {
			Element gazconfiguration = new Element("gazconfiguration");
			gazconfiguration.addContent(getGazconfiguration().toDomXML());
			xmlElement.addContent(gazconfiguration);
		}if (getImage() != null) {
			Element image = new Element("image");
			image.addContent(getImage().toDomXML());
			xmlElement.addContent(image);
		}if (getRisque() != null)
			xmlElement.setAttribute("risque", String.valueOf(getRisque().getId()));
		if (!getSample().isEmpty()) {
			Element sample = new Element("sample");
			for (Sample tmp : getSample())
				sample.addContent(new Element("Sample", String.valueOf(tmp.getId())));
			xmlElement.addContent(sample);
		}
		if (getTechnician() != null)
			xmlElement.setAttribute("technician", String.valueOf(getTechnician().getId()));
		if (getTestedroom() != null) {
			Element testedroom = new Element("testedroom");
			testedroom.addContent(getTestedroom().toDomXML());
			xmlElement.addContent(testedroom);
		}
		
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

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public void accept(FireaVisitor visitor) {
		visitor.visitBeforeProject(this);
		
		this.visitInternal(visitor);
		
		visitor.visitAfterProject(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	protected void visitInternal(FireaVisitor visitor)
	{
		
		if (this.getImage() != null)
			this.getImage().accept(visitor);
		if (this.getTestedroom() != null)
			this.getTestedroom().accept(visitor);
		if (this.getGazconfiguration() != null)
			this.getGazconfiguration().accept(visitor);
		
	}

}
