package com.genmymodel.petshop.wrapper;

import com.genmymodel.petshop.entity.CustomerBean;

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
import com.genmymodel.petshop.entity.OrderBean;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

//Start of user code for imports
// TODO: import me!
//End of user code




// Start of user code comment for Customer Class

// End of user code
/**
 *  
 */
public class Customer
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private ObjectProperty<Address> addressProperty;
	
	private ObjectProperty<Cart> cartsProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	/**
	 *  
	 */
	private StringProperty firstNameProperty;
	
	private LongProperty idProperty;
	/**
	 *  
	 */
	private StringProperty lastNameProperty;
	
	private ObjectProperty<ObservableList<Order>> ordersProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final CustomerBean customer;

	/*
	 * Constructors
	 * <!-- Start of user code comment for Customer constructor
	 * End of user code -->
	 */
	public Customer(){
		this(new CustomerBean());	
	}
	
	
	public Customer(CustomerBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.customer = entity;
	}
	
	public CustomerBean getCustomerBean(){
		return this.customer;
	}
	
	public CustomerBean getBean() {
		return  this.customer;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for address property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Address> addressProperty() {
		if (addressProperty == null) {
			addressProperty = new SimpleObjectProperty<Address>(customer.getAddress() == null ? null : customer
					.getAddress().getWrapper());
			addressProperty.addListener(new ChangeListener<Address>() {
				@Override
				public void changed(ObservableValue<? extends Address> obj, Address oldValue, Address newValue) {
					customer.setAddress(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code addressproperty method
			//End of user code
		}
		return addressProperty;
	}
	
	/*
	 * <!-- Start of user code comment for address getter 
		-->
	 * <!-- End of user code -->
	 */
	public Address getAddress(){
		return addressProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for address setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setAddress(Address myAddress){
		if (addressProperty == null) {
				customer.setAddress(myAddress == null ? null : myAddress.getBean());
			} else {
				this.addressProperty().set(myAddress);
			}
	}
	
	public void updateAddress(final Address myAddress, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAddress(myAddress);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAddress(myAddress);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateAddress(final Address myAddress) {
		updateAddress(myAddress, null);
	}

	/*
	 * <!-- Start of user code comment for carts property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Cart> cartsProperty() {
		if (cartsProperty == null) {
			cartsProperty = new SimpleObjectProperty<Cart>(customer.getCarts() == null ? null : customer
					.getCarts().getWrapper());
			cartsProperty.addListener(new ChangeListener<Cart>() {
				@Override
				public void changed(ObservableValue<? extends Cart> obj, Cart oldValue, Cart newValue) {
					customer.setCarts(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code cartsproperty method
			//End of user code
		}
		return cartsProperty;
	}
	
	/*
	 * <!-- Start of user code comment for carts getter 
		-->
	 * <!-- End of user code -->
	 */
	public Cart getCarts(){
		return cartsProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for carts setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCarts(Cart myCarts){
		if (cartsProperty == null) {
				customer.setCarts(myCarts == null ? null : myCarts.getBean());
			} else {
				this.cartsProperty().set(myCarts);
			}
	}
	
	public void updateCarts(final Cart myCarts, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCarts(myCarts);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCarts(myCarts);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCarts(final Cart myCarts) {
		updateCarts(myCarts, null);
	}

	/*
	 * <!-- Start of user code comment for creationDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(customer.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					customer.setCreationDate(arg2);
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
				customer.setCreationDate(myCreationDate);
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
	 * <!-- Start of user code comment for firstName property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty firstNameProperty(){
		if (this.firstNameProperty == null) {
			this.firstNameProperty = new SimpleStringProperty(customer.getFirstName());
			this.firstNameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					customer.setFirstName((String) arg2);
				}
			});
			//Start of user code firstNameproperty method
			//End of user code
		}
		return this.firstNameProperty;
	}
	
	/*
	 * <!-- Start of user code comment for firstName getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getFirstName(){
		return firstNameProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for firstName setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setFirstName(String myFirstName){
		this.firstNameProperty().set(myFirstName);
	}
	
	public void updateFirstName(final String myFirstName, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFirstName(myFirstName);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFirstName(myFirstName);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateFirstName(final String myFirstName) {
		updateFirstName(myFirstName, null);
	}

	/*
	 * <!-- Start of user code comment for id property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(customer.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					customer.setId((Long) arg2);
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
	 * <!-- Start of user code comment for lastName property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty lastNameProperty(){
		if (this.lastNameProperty == null) {
			this.lastNameProperty = new SimpleStringProperty(customer.getLastName());
			this.lastNameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					customer.setLastName((String) arg2);
				}
			});
			//Start of user code lastNameproperty method
			//End of user code
		}
		return this.lastNameProperty;
	}
	
	/*
	 * <!-- Start of user code comment for lastName getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getLastName(){
		return lastNameProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for lastName setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setLastName(String myLastName){
		this.lastNameProperty().set(myLastName);
	}
	
	public void updateLastName(final String myLastName, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLastName(myLastName);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLastName(myLastName);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateLastName(final String myLastName) {
		updateLastName(myLastName, null);
	}

	/*
	 * <!-- Start of user code comment for orders property method 
		-->
	 * <!-- End of user code -->
	 */
	public ReadOnlyObjectProperty<ObservableList<Order>> ordersProperty() {
		if (ordersProperty == null) {
			ordersProperty = new SimpleObjectProperty<ObservableList<Order>>(
					FXCollections.<Order> observableArrayList());
			for (OrderBean tmp : this.customer.getOrders()) {
				ordersProperty.get().add(tmp.getWrapper());
			}
			ordersProperty.get().addListener(new javafx.collections.ListChangeListener<Order>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Order> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (Order tmp : change.getAddedSubList()) {
								customer.addOrders(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (Order tmp : change.getRemoved()) {
								customer.getOrders().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
			//Start of user code ordersproperty method
			//End of user code
		}
		return ordersProperty;
	}
	
	/*
	 * <!-- Start of user code comment for orders getter 
		-->
	 * <!-- End of user code -->
	 */
	public ObservableList<Order> getOrders()
	{ 
		return ordersProperty().get(); 
	}

	/*
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(customer.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					customer.setUpdateDate(arg2);
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
				customer.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(customer.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					customer.setVersion((Integer) arg2);
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
		return getCustomerBean() != null ? serializer.outputString(getCustomerBean().toXML()) : "";
		
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
