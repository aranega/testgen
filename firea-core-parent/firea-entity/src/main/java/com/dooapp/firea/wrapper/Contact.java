package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.ContactBean;

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


import com.dooapp.firea.enumeration.ContactKind;


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
@BeanClass(ContactBean.class)
public class Contact
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
	private StringProperty address2Property;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty adress1Property;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty cityProperty;
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
	private StringProperty emailProperty;
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
	private ObjectProperty<ContactKind> kindProperty;
	/**
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
	private StringProperty personProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty phoneProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty siretProperty;
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
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty zipCodeProperty;
	
	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private final ContactBean contact;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Contact(ContactBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.contact = entity;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ContactBean getBean() {
		return  this.contact;
	}

	/*
	 * Generated getters and setters
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StringProperty address2Property(){
		if (this.address2Property == null) {
			this.address2Property = createAddress2Property();
			getBean().setAddress2(getBean().getAddress2());
			this.address2Property.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setAddress2((String) arg2);
				}
			});
		}
		return this.address2Property;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createAddress2Property(){
		return new SimpleStringProperty(getBean().getAddress2());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getAddress2(){
		return address2Property().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAddress2(String myAddress2){
		this.address2Property().set(myAddress2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAddress2(final String myAddress2) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAddress2(myAddress2);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAddress2(myAddress2);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAddress2AndWait(final String myAddress2) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAddress2(myAddress2);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAddress2(myAddress2);
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
	public StringProperty adress1Property(){
		if (this.adress1Property == null) {
			this.adress1Property = createAdress1Property();
			getBean().setAdress1(getBean().getAdress1());
			this.adress1Property.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setAdress1((String) arg2);
				}
			});
		}
		return this.adress1Property;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createAdress1Property(){
		return new SimpleStringProperty(getBean().getAdress1());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getAdress1(){
		return adress1Property().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAdress1(String myAdress1){
		this.adress1Property().set(myAdress1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAdress1(final String myAdress1) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAdress1(myAdress1);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAdress1(myAdress1);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAdress1AndWait(final String myAdress1) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAdress1(myAdress1);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAdress1(myAdress1);
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
	public StringProperty cityProperty(){
		if (this.cityProperty == null) {
			this.cityProperty = createCityProperty();
			getBean().setCity(getBean().getCity());
			this.cityProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setCity((String) arg2);
				}
			});
		}
		return this.cityProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createCityProperty(){
		return new SimpleStringProperty(getBean().getCity());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getCity(){
		return cityProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCity(String myCity){
		this.cityProperty().set(myCity);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCity(final String myCity) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCity(myCity);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCity(myCity);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCityAndWait(final String myCity) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCity(myCity);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCity(myCity);
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
	public StringProperty emailProperty(){
		if (this.emailProperty == null) {
			this.emailProperty = createEmailProperty();
			getBean().setEmail(getBean().getEmail());
			this.emailProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setEmail((String) arg2);
				}
			});
		}
		return this.emailProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createEmailProperty(){
		return new SimpleStringProperty(getBean().getEmail());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getEmail(){
		return emailProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setEmail(String myEmail){
		this.emailProperty().set(myEmail);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateEmail(final String myEmail) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setEmail(myEmail);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setEmail(myEmail);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateEmailAndWait(final String myEmail) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setEmail(myEmail);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setEmail(myEmail);
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
	public ObjectProperty<ContactKind> kindProperty() {
		if (kindProperty == null) {
			kindProperty = createKindProperty();
			getBean().setKind(getBean().getKind());
			kindProperty.addListener(new ChangeListener<ContactKind>() {
				@Override
				public void changed(ObservableValue<? extends ContactKind> arg0, ContactKind arg1, ContactKind arg2) {
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
	protected ObjectProperty<ContactKind> createKindProperty(){
		return  new SimpleObjectProperty<ContactKind>(getBean().getKind());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ContactKind getKind(){
		return kindProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setKind(ContactKind myKind){
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
	public void updateKind(final ContactKind myKind) {
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
	public void updateKindAndWait(final ContactKind myKind) throws InterruptedException {
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
	public StringProperty nameProperty(){
		if (this.nameProperty == null) {
			this.nameProperty = createNameProperty();
			getBean().setName(getBean().getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setName((String) arg2);
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
	protected StringProperty createNameProperty(){
		return new SimpleStringProperty(getBean().getName());
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
	public void updateName(final String myName) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setName(myName);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setName(myName);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNameAndWait(final String myName) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setName(myName);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setName(myName);
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
	public StringProperty personProperty(){
		if (this.personProperty == null) {
			this.personProperty = createPersonProperty();
			getBean().setPerson(getBean().getPerson());
			this.personProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setPerson((String) arg2);
				}
			});
		}
		return this.personProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createPersonProperty(){
		return new SimpleStringProperty(getBean().getPerson());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getPerson(){
		return personProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPerson(String myPerson){
		this.personProperty().set(myPerson);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePerson(final String myPerson) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPerson(myPerson);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPerson(myPerson);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePersonAndWait(final String myPerson) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPerson(myPerson);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPerson(myPerson);
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
	public StringProperty phoneProperty(){
		if (this.phoneProperty == null) {
			this.phoneProperty = createPhoneProperty();
			getBean().setPhone(getBean().getPhone());
			this.phoneProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setPhone((String) arg2);
				}
			});
		}
		return this.phoneProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createPhoneProperty(){
		return new SimpleStringProperty(getBean().getPhone());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getPhone(){
		return phoneProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPhone(String myPhone){
		this.phoneProperty().set(myPhone);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePhone(final String myPhone) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPhone(myPhone);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPhone(myPhone);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePhoneAndWait(final String myPhone) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPhone(myPhone);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPhone(myPhone);
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
	public StringProperty siretProperty(){
		if (this.siretProperty == null) {
			this.siretProperty = createSiretProperty();
			getBean().setSiret(getBean().getSiret());
			this.siretProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setSiret((String) arg2);
				}
			});
		}
		return this.siretProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createSiretProperty(){
		return new SimpleStringProperty(getBean().getSiret());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getSiret(){
		return siretProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSiret(String mySiret){
		this.siretProperty().set(mySiret);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSiret(final String mySiret) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSiret(mySiret);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSiret(mySiret);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSiretAndWait(final String mySiret) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSiret(mySiret);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSiret(mySiret);
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
	public StringProperty zipCodeProperty(){
		if (this.zipCodeProperty == null) {
			this.zipCodeProperty = createZipCodeProperty();
			getBean().setZipCode(getBean().getZipCode());
			this.zipCodeProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setZipCode((String) arg2);
				}
			});
		}
		return this.zipCodeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createZipCodeProperty(){
		return new SimpleStringProperty(getBean().getZipCode());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getZipCode(){
		return zipCodeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setZipCode(String myZipCode){
		this.zipCodeProperty().set(myZipCode);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateZipCode(final String myZipCode) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setZipCode(myZipCode);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setZipCode(myZipCode);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateZipCodeAndWait(final String myZipCode) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setZipCode(myZipCode);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setZipCode(myZipCode);
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
		Element xmlElement = new Element("Contact");
		if (this.getBean().getUUID() != null)
			xmlElement.setAttribute(new Attribute("uuid", this.getBean().getUUID()));
		if (getAddress2() != null)
			xmlElement.setAttribute(new Attribute("address2", getAddress2()));
		if (getAdress1() != null)
			xmlElement.setAttribute(new Attribute("adress1", getAdress1()));
		if (getCity() != null)
			xmlElement.setAttribute(new Attribute("city", getCity()));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getEmail() != null)
			xmlElement.setAttribute(new Attribute("email", getEmail()));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		xmlElement.setAttribute(new Attribute("kind", String.valueOf(getKind())));
		if (getName() != null)
			xmlElement.setAttribute(new Attribute("name", getName()));
		if (getPerson() != null)
			xmlElement.setAttribute(new Attribute("person", getPerson()));
		if (getPhone() != null)
			xmlElement.setAttribute(new Attribute("phone", getPhone()));
		if (getSiret() != null)
			xmlElement.setAttribute(new Attribute("siret", getSiret()));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		if (getZipCode() != null)
			xmlElement.setAttribute(new Attribute("zipCode", getZipCode()));
		
		if (getImage() != null) {
			Element image = new Element("image");
			image.addContent(getImage().toDomXML());
			xmlElement.addContent(image);
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
		visitor.visitBeforeContact(this);
		
		this.visitInternal(visitor);
		
		visitor.visitAfterContact(this);
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
		
	}

}
