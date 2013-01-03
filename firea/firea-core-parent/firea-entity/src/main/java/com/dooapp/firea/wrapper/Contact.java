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
//Start of user code for imports
// TODO: import me!
//End of user code




public class Contact implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private StringProperty address2Property;
	
	private StringProperty adress1Property;
	
	private StringProperty cityProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private StringProperty emailProperty;
	
	private LongProperty idProperty;
	
	private ObjectProperty<PersistentImage> imageProperty;
	
	private ObjectProperty<com.dooapp.firea.entity.ContactKind> kindProperty;
	
	private StringProperty nameProperty;
	
	private StringProperty personProperty;
	
	private StringProperty phoneProperty;
	
	private StringProperty siretProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;
	
	private StringProperty zipCodeProperty;

	/**
	 * Handled Entity
	 */
	private final ContactBean contact;

	/*
	 * Constructors 
	 */
	public Contact(){
		this(new ContactBean());	
	}
	
	
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
	
	public ContactBean getContactBean(){
		return this.contact;
	}
	
	public ContactBean getBean() {
		return  this.contact;
	}
	

	/*
	 * Generated getters and setters
	 */
	public StringProperty address2Property(){
		if (this.address2Property == null) {
			this.address2Property = new SimpleStringProperty(contact.getAddress2());
			this.address2Property.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contact.setAddress2((String) arg2);
				}
			});
			//Start of user code address2property method
			//End of user code
		}
		return this.address2Property;
	}
	
	public String getAddress2(){
		return address2Property().get();
	} 
	
	public void setAddress2(String myAddress2){
		this.address2Property().set(myAddress2);
	}
	
	public void updateAddress2(final String myAddress2, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAddress2(myAddress2);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAddress2(myAddress2);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateAddress2(final String myAddress2) {
		updateAddress2(myAddress2, null);
	}

	public StringProperty adress1Property(){
		if (this.adress1Property == null) {
			this.adress1Property = new SimpleStringProperty(contact.getAdress1());
			this.adress1Property.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contact.setAdress1((String) arg2);
				}
			});
			//Start of user code adress1property method
			//End of user code
		}
		return this.adress1Property;
	}
	
	public String getAdress1(){
		return adress1Property().get();
	} 
	
	public void setAdress1(String myAdress1){
		this.adress1Property().set(myAdress1);
	}
	
	public void updateAdress1(final String myAdress1, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAdress1(myAdress1);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAdress1(myAdress1);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateAdress1(final String myAdress1) {
		updateAdress1(myAdress1, null);
	}

	public StringProperty cityProperty(){
		if (this.cityProperty == null) {
			this.cityProperty = new SimpleStringProperty(contact.getCity());
			this.cityProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contact.setCity((String) arg2);
				}
			});
			//Start of user code cityproperty method
			//End of user code
		}
		return this.cityProperty;
	}
	
	public String getCity(){
		return cityProperty().get();
	} 
	
	public void setCity(String myCity){
		this.cityProperty().set(myCity);
	}
	
	public void updateCity(final String myCity, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCity(myCity);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCity(myCity);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCity(final String myCity) {
		updateCity(myCity, null);
	}

	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(contact.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					contact.setCreationDate(arg2);
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
				contact.setCreationDate(myCreationDate);
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

	public StringProperty emailProperty(){
		if (this.emailProperty == null) {
			this.emailProperty = new SimpleStringProperty(contact.getEmail());
			this.emailProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contact.setEmail((String) arg2);
				}
			});
			//Start of user code emailproperty method
			//End of user code
		}
		return this.emailProperty;
	}
	
	public String getEmail(){
		return emailProperty().get();
	} 
	
	public void setEmail(String myEmail){
		this.emailProperty().set(myEmail);
	}
	
	public void updateEmail(final String myEmail, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setEmail(myEmail);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setEmail(myEmail);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateEmail(final String myEmail) {
		updateEmail(myEmail, null);
	}

	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(contact.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					contact.setId((Long) arg2);
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
			imageProperty = new SimpleObjectProperty<PersistentImage>(contact.getImage() == null ? null : contact
					.getImage().getWrapper());
			imageProperty.addListener(new ChangeListener<PersistentImage>() {
				@Override
				public void changed(ObservableValue<? extends PersistentImage> obj, PersistentImage oldValue, PersistentImage newValue) {
					contact.setImage(newValue == null ? null : newValue.getBean());
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
				contact.setImage(myImage == null ? null : myImage.getBean());
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

	public ObjectProperty<com.dooapp.firea.entity.ContactKind> kindProperty() {
		if (kindProperty == null) {
			kindProperty = new SimpleObjectProperty<com.dooapp.firea.entity.ContactKind>(contact.getKind());
			kindProperty.addListener(new ChangeListener<com.dooapp.firea.entity.ContactKind>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.ContactKind> arg0, com.dooapp.firea.entity.ContactKind arg1, com.dooapp.firea.entity.ContactKind arg2) {
					contact.setKind(arg2);
				}
			});
			//Start of user code kindproperty method
			//End of user code
		}
		return kindProperty;
	}
	
	public com.dooapp.firea.entity.ContactKind getKind(){
		return kindProperty().get();
	} 
	
	public void setKind(com.dooapp.firea.entity.ContactKind myKind){
		if (kindProperty == null) {
				contact.setKind(myKind);
			} else {
				this.kindProperty().set(myKind);
			}
	}
	
	public void updateKind(final com.dooapp.firea.entity.ContactKind myKind, final Object mutex) {
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
	
	public void updateKind(final com.dooapp.firea.entity.ContactKind myKind) {
		updateKind(myKind, null);
	}

	public StringProperty nameProperty(){
		if (this.nameProperty == null) {
			this.nameProperty = new SimpleStringProperty(contact.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contact.setName((String) arg2);
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

	public StringProperty personProperty(){
		if (this.personProperty == null) {
			this.personProperty = new SimpleStringProperty(contact.getPerson());
			this.personProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contact.setPerson((String) arg2);
				}
			});
			//Start of user code personproperty method
			//End of user code
		}
		return this.personProperty;
	}
	
	public String getPerson(){
		return personProperty().get();
	} 
	
	public void setPerson(String myPerson){
		this.personProperty().set(myPerson);
	}
	
	public void updatePerson(final String myPerson, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPerson(myPerson);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPerson(myPerson);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updatePerson(final String myPerson) {
		updatePerson(myPerson, null);
	}

	public StringProperty phoneProperty(){
		if (this.phoneProperty == null) {
			this.phoneProperty = new SimpleStringProperty(contact.getPhone());
			this.phoneProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contact.setPhone((String) arg2);
				}
			});
			//Start of user code phoneproperty method
			//End of user code
		}
		return this.phoneProperty;
	}
	
	public String getPhone(){
		return phoneProperty().get();
	} 
	
	public void setPhone(String myPhone){
		this.phoneProperty().set(myPhone);
	}
	
	public void updatePhone(final String myPhone, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPhone(myPhone);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPhone(myPhone);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updatePhone(final String myPhone) {
		updatePhone(myPhone, null);
	}

	public StringProperty siretProperty(){
		if (this.siretProperty == null) {
			this.siretProperty = new SimpleStringProperty(contact.getSiret());
			this.siretProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contact.setSiret((String) arg2);
				}
			});
			//Start of user code siretproperty method
			//End of user code
		}
		return this.siretProperty;
	}
	
	public String getSiret(){
		return siretProperty().get();
	} 
	
	public void setSiret(String mySiret){
		this.siretProperty().set(mySiret);
	}
	
	public void updateSiret(final String mySiret, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSiret(mySiret);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSiret(mySiret);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateSiret(final String mySiret) {
		updateSiret(mySiret, null);
	}

	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(contact.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					contact.setUpdateDate(arg2);
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
				contact.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(contact.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					contact.setVersion((Integer) arg2);
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

	public StringProperty zipCodeProperty(){
		if (this.zipCodeProperty == null) {
			this.zipCodeProperty = new SimpleStringProperty(contact.getZipCode());
			this.zipCodeProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contact.setZipCode((String) arg2);
				}
			});
			//Start of user code zipCodeproperty method
			//End of user code
		}
		return this.zipCodeProperty;
	}
	
	public String getZipCode(){
		return zipCodeProperty().get();
	} 
	
	public void setZipCode(String myZipCode){
		this.zipCodeProperty().set(myZipCode);
	}
	
	public void updateZipCode(final String myZipCode, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setZipCode(myZipCode);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setZipCode(myZipCode);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateZipCode(final String myZipCode) {
		updateZipCode(myZipCode, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
