package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.ContactCriteriaInstance;

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




// Start of user code comment for ContactCriteria Class

// End of user code

public class ContactCriteria 
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private StringProperty address2Property;
	
	private StringProperty adress1Property;
	
	private StringProperty cityProperty;
	
	private ObjectProperty<java.util.Date> creationDateMaxProperty;
	
	private ObjectProperty<java.util.Date> creationDateMinProperty;
	
	private StringProperty emailProperty;
	
	private LongProperty idMaxProperty;
	
	private LongProperty idMinProperty;
	
	private StringProperty kindProperty;
	
	private StringProperty nameProperty;
	
	private StringProperty personProperty;
	
	private StringProperty phoneProperty;
	
	private StringProperty siretProperty;
	
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	
	private ObjectProperty<java.util.Date> updateDateMinProperty;
	
	private IntegerProperty versionProperty;
	
	private StringProperty zipCodeProperty;

	/**
	 * Handled Criteria
	 */
	private ContactCriteriaInstance contactCriteria;

	/*
	 * Constructors
	 * <!-- Start of user code comment for ContactCriteria constructor
	 * End of user code -->
	 */
	public ContactCriteria(){
		this(new ContactCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for ContactCriteria constructor with parameters
	 * End of user code -->
	 */
	public ContactCriteria(ContactCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.contactCriteria = entity;
		// Start of user code constructor with parameters
		// End of user code
	}
	
	public ContactCriteriaInstance getContactCriteriaInstance(){
		return this.contactCriteria;
	}
	
	
	public ContactCriteriaInstance getBean() {
		return  this.contactCriteria;
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
	 * <!-- Start of user code comment for address2 property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty address2Property(){
		if (this.address2Property == null) {
			this.address2Property = new SimpleStringProperty(contactCriteria.getAddress2());
			this.address2Property.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contactCriteria.setAddress2((String) arg2);
				}
			});
			//Start of user code address2property method
			//End of user code
		}
		return this.address2Property;
	}
	
	/*
	 * <!-- Start of user code comment for address2 getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getAddress2(){
		return address2Property().get();
	} 
	
	/*
	 * <!-- Start of user code comment for address2 setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for adress1 property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty adress1Property(){
		if (this.adress1Property == null) {
			this.adress1Property = new SimpleStringProperty(contactCriteria.getAdress1());
			this.adress1Property.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contactCriteria.setAdress1((String) arg2);
				}
			});
			//Start of user code adress1property method
			//End of user code
		}
		return this.adress1Property;
	}
	
	/*
	 * <!-- Start of user code comment for adress1 getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getAdress1(){
		return adress1Property().get();
	} 
	
	/*
	 * <!-- Start of user code comment for adress1 setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for city property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty cityProperty(){
		if (this.cityProperty == null) {
			this.cityProperty = new SimpleStringProperty(contactCriteria.getCity());
			this.cityProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contactCriteria.setCity((String) arg2);
				}
			});
			//Start of user code cityproperty method
			//End of user code
		}
		return this.cityProperty;
	}
	
	/*
	 * <!-- Start of user code comment for city getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getCity(){
		return cityProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for city setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for creationDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateMaxProperty() {
		if (creationDateMaxProperty == null) {
			creationDateMaxProperty = new SimpleObjectProperty<java.util.Date>(contactCriteria.getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					contactCriteria.setCreationDateMax(arg2);
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
				contactCriteria.setCreationDateMax(myCreationDateMax);
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
			creationDateMinProperty = new SimpleObjectProperty<java.util.Date>(contactCriteria.getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					contactCriteria.setCreationDateMin(arg2);
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
				contactCriteria.setCreationDateMin(myCreationDateMin);
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
	 * <!-- Start of user code comment for email property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty emailProperty(){
		if (this.emailProperty == null) {
			this.emailProperty = new SimpleStringProperty(contactCriteria.getEmail());
			this.emailProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contactCriteria.setEmail((String) arg2);
				}
			});
			//Start of user code emailproperty method
			//End of user code
		}
		return this.emailProperty;
	}
	
	/*
	 * <!-- Start of user code comment for email getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getEmail(){
		return emailProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for email setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for idMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idMaxProperty(){
		if (this.idMaxProperty == null) {
			this.idMaxProperty = new SimpleLongProperty(contactCriteria.getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					contactCriteria.setIdMax((Long) arg2);
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
			this.idMinProperty = new SimpleLongProperty(contactCriteria.getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					contactCriteria.setIdMin((Long) arg2);
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
	 * <!-- Start of user code comment for kind property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty kindProperty(){
		if (this.kindProperty == null) {
			this.kindProperty = new SimpleStringProperty(contactCriteria.getKind());
			this.kindProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contactCriteria.setKind((String) arg2);
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
			this.nameProperty = new SimpleStringProperty(contactCriteria.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contactCriteria.setName((String) arg2);
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
	 * <!-- Start of user code comment for person property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty personProperty(){
		if (this.personProperty == null) {
			this.personProperty = new SimpleStringProperty(contactCriteria.getPerson());
			this.personProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contactCriteria.setPerson((String) arg2);
				}
			});
			//Start of user code personproperty method
			//End of user code
		}
		return this.personProperty;
	}
	
	/*
	 * <!-- Start of user code comment for person getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getPerson(){
		return personProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for person setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for phone property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty phoneProperty(){
		if (this.phoneProperty == null) {
			this.phoneProperty = new SimpleStringProperty(contactCriteria.getPhone());
			this.phoneProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contactCriteria.setPhone((String) arg2);
				}
			});
			//Start of user code phoneproperty method
			//End of user code
		}
		return this.phoneProperty;
	}
	
	/*
	 * <!-- Start of user code comment for phone getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getPhone(){
		return phoneProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for phone setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for siret property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty siretProperty(){
		if (this.siretProperty == null) {
			this.siretProperty = new SimpleStringProperty(contactCriteria.getSiret());
			this.siretProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contactCriteria.setSiret((String) arg2);
				}
			});
			//Start of user code siretproperty method
			//End of user code
		}
		return this.siretProperty;
	}
	
	/*
	 * <!-- Start of user code comment for siret getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getSiret(){
		return siretProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for siret setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for updateDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = new SimpleObjectProperty<java.util.Date>(contactCriteria.getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					contactCriteria.setUpdateDateMax(arg2);
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
				contactCriteria.setUpdateDateMax(myUpdateDateMax);
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
			updateDateMinProperty = new SimpleObjectProperty<java.util.Date>(contactCriteria.getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					contactCriteria.setUpdateDateMin(arg2);
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
				contactCriteria.setUpdateDateMin(myUpdateDateMin);
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
			this.versionProperty = new SimpleIntegerProperty(contactCriteria.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					contactCriteria.setVersion((Integer) arg2);
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
	 * <!-- Start of user code comment for zipCode property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty zipCodeProperty(){
		if (this.zipCodeProperty == null) {
			this.zipCodeProperty = new SimpleStringProperty(contactCriteria.getZipCode());
			this.zipCodeProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					contactCriteria.setZipCode((String) arg2);
				}
			});
			//Start of user code zipCodeproperty method
			//End of user code
		}
		return this.zipCodeProperty;
	}
	
	/*
	 * <!-- Start of user code comment for zipCode getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getZipCode(){
		return zipCodeProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for zipCode setter 
		-->
	 * <!-- End of user code -->
	 */
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
