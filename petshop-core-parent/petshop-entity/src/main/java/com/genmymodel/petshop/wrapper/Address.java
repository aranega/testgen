package com.genmymodel.petshop.wrapper;

import com.genmymodel.petshop.entity.AddressBean;

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


//Start of user code comment for Address Class

//End of user code

public class Address implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private StringProperty cityProperty;
	
	private StringProperty countryProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private LongProperty idProperty;
	
	private StringProperty line1Property;
	
	private StringProperty line2Property;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final AddressBean address;

	/*
	 * Constructors
	 * <!-- Start of user code comment for Address constructor
	 * End of user code -->
	 */
	public Address(){
		this(new AddressBean());	
	}
	
	
	public Address(AddressBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.address = entity;
	}
	
	public AddressBean getAddressBean(){
		return this.address;
	}
	
	public AddressBean getBean() {
		return  this.address;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for city property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty cityProperty(){
		if (this.cityProperty == null) {
			this.cityProperty = new SimpleStringProperty(address.getCity());
			this.cityProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					address.setCity((String) arg2);
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
	 * <!-- Start of user code comment for country property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty countryProperty(){
		if (this.countryProperty == null) {
			this.countryProperty = new SimpleStringProperty(address.getCountry());
			this.countryProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					address.setCountry((String) arg2);
				}
			});
			//Start of user code countryproperty method
			//End of user code
		}
		return this.countryProperty;
	}
	
	/*
	 * <!-- Start of user code comment for country getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getCountry(){
		return countryProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for country setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCountry(String myCountry){
		this.countryProperty().set(myCountry);
	}
	
	public void updateCountry(final String myCountry, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCountry(myCountry);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCountry(myCountry);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCountry(final String myCountry) {
		updateCountry(myCountry, null);
	}

	/*
	 * <!-- Start of user code comment for creationDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(address.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					address.setCreationDate(arg2);
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
				address.setCreationDate(myCreationDate);
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
	 * <!-- Start of user code comment for id property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(address.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					address.setId((Long) arg2);
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
	 * <!-- Start of user code comment for line1 property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty line1Property(){
		if (this.line1Property == null) {
			this.line1Property = new SimpleStringProperty(address.getLine1());
			this.line1Property.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					address.setLine1((String) arg2);
				}
			});
			//Start of user code line1property method
			//End of user code
		}
		return this.line1Property;
	}
	
	/*
	 * <!-- Start of user code comment for line1 getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getLine1(){
		return line1Property().get();
	} 
	
	/*
	 * <!-- Start of user code comment for line1 setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setLine1(String myLine1){
		this.line1Property().set(myLine1);
	}
	
	public void updateLine1(final String myLine1, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLine1(myLine1);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLine1(myLine1);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateLine1(final String myLine1) {
		updateLine1(myLine1, null);
	}

	/*
	 * <!-- Start of user code comment for line2 property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty line2Property(){
		if (this.line2Property == null) {
			this.line2Property = new SimpleStringProperty(address.getLine2());
			this.line2Property.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					address.setLine2((String) arg2);
				}
			});
			//Start of user code line2property method
			//End of user code
		}
		return this.line2Property;
	}
	
	/*
	 * <!-- Start of user code comment for line2 getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getLine2(){
		return line2Property().get();
	} 
	
	/*
	 * <!-- Start of user code comment for line2 setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setLine2(String myLine2){
		this.line2Property().set(myLine2);
	}
	
	public void updateLine2(final String myLine2, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLine2(myLine2);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLine2(myLine2);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateLine2(final String myLine2) {
		updateLine2(myLine2, null);
	}

	/*
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(address.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					address.setUpdateDate(arg2);
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
				address.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(address.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					address.setVersion((Integer) arg2);
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
