package com.genmymodel.petshop.wrapper;

import com.genmymodel.petshop.entity.OrderBean;

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
import com.genmymodel.petshop.entity.ItemBean;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

//Start of user code for imports
// TODO: import me!
//End of user code




// Start of user code comment for Order Class

// End of user code

public class Order
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private ObjectProperty<Cart> cartProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private ObjectProperty<Customer> customerProperty;
	
	private StringProperty dateProperty;
	
	private ObjectProperty<Address> deliveryAddressProperty;
	
	private LongProperty idProperty;
	
	private ObjectProperty<ObservableList<Item>> itemsProperty;
	
	private ObjectProperty<Address> paymentAddressProperty;
	
	private StringProperty referenceProperty;
	
	private StringProperty statusProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final OrderBean order;

	/*
	 * Constructors
	 * <!-- Start of user code comment for Order constructor
	 * End of user code -->
	 */
	public Order(){
		this(new OrderBean());	
	}
	
	
	public Order(OrderBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.order = entity;
	}
	
	public OrderBean getOrderBean(){
		return this.order;
	}
	
	public OrderBean getBean() {
		return  this.order;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for cart property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Cart> cartProperty() {
		if (cartProperty == null) {
			cartProperty = new SimpleObjectProperty<Cart>(order.getCart() == null ? null : order
					.getCart().getWrapper());
			cartProperty.addListener(new ChangeListener<Cart>() {
				@Override
				public void changed(ObservableValue<? extends Cart> obj, Cart oldValue, Cart newValue) {
					order.setCart(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code cartproperty method
			//End of user code
		}
		return cartProperty;
	}
	
	/*
	 * <!-- Start of user code comment for cart getter 
		-->
	 * <!-- End of user code -->
	 */
	public Cart getCart(){
		return cartProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for cart setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCart(Cart myCart){
		if (cartProperty == null) {
				order.setCart(myCart == null ? null : myCart.getBean());
			} else {
				this.cartProperty().set(myCart);
			}
	}
	
	public void updateCart(final Cart myCart, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCart(myCart);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCart(myCart);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCart(final Cart myCart) {
		updateCart(myCart, null);
	}

	/*
	 * <!-- Start of user code comment for creationDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(order.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					order.setCreationDate(arg2);
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
				order.setCreationDate(myCreationDate);
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
	 * <!-- Start of user code comment for customer property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Customer> customerProperty() {
		if (customerProperty == null) {
			customerProperty = new SimpleObjectProperty<Customer>(order.getCustomer() == null ? null : order
					.getCustomer().getWrapper());
			customerProperty.addListener(new ChangeListener<Customer>() {
				@Override
				public void changed(ObservableValue<? extends Customer> obj, Customer oldValue, Customer newValue) {
					order.setCustomer(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code customerproperty method
			//End of user code
		}
		return customerProperty;
	}
	
	/*
	 * <!-- Start of user code comment for customer getter 
		-->
	 * <!-- End of user code -->
	 */
	public Customer getCustomer(){
		return customerProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for customer setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCustomer(Customer myCustomer){
		if (customerProperty == null) {
				order.setCustomer(myCustomer == null ? null : myCustomer.getBean());
			} else {
				this.customerProperty().set(myCustomer);
			}
	}
	
	public void updateCustomer(final Customer myCustomer, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCustomer(myCustomer);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCustomer(myCustomer);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCustomer(final Customer myCustomer) {
		updateCustomer(myCustomer, null);
	}

	/*
	 * <!-- Start of user code comment for date property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty dateProperty(){
		if (this.dateProperty == null) {
			this.dateProperty = new SimpleStringProperty(order.getDate());
			this.dateProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					order.setDate((String) arg2);
				}
			});
			//Start of user code dateproperty method
			//End of user code
		}
		return this.dateProperty;
	}
	
	/*
	 * <!-- Start of user code comment for date getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getDate(){
		return dateProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for date setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDate(String myDate){
		this.dateProperty().set(myDate);
	}
	
	public void updateDate(final String myDate, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDate(myDate);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDate(myDate);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDate(final String myDate) {
		updateDate(myDate, null);
	}

	/*
	 * <!-- Start of user code comment for deliveryAddress property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Address> deliveryAddressProperty() {
		if (deliveryAddressProperty == null) {
			deliveryAddressProperty = new SimpleObjectProperty<Address>(order.getDeliveryAddress() == null ? null : order
					.getDeliveryAddress().getWrapper());
			deliveryAddressProperty.addListener(new ChangeListener<Address>() {
				@Override
				public void changed(ObservableValue<? extends Address> obj, Address oldValue, Address newValue) {
					order.setDeliveryAddress(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code deliveryAddressproperty method
			//End of user code
		}
		return deliveryAddressProperty;
	}
	
	/*
	 * <!-- Start of user code comment for deliveryAddress getter 
		-->
	 * <!-- End of user code -->
	 */
	public Address getDeliveryAddress(){
		return deliveryAddressProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for deliveryAddress setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDeliveryAddress(Address myDeliveryAddress){
		if (deliveryAddressProperty == null) {
				order.setDeliveryAddress(myDeliveryAddress == null ? null : myDeliveryAddress.getBean());
			} else {
				this.deliveryAddressProperty().set(myDeliveryAddress);
			}
	}
	
	public void updateDeliveryAddress(final Address myDeliveryAddress, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDeliveryAddress(myDeliveryAddress);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDeliveryAddress(myDeliveryAddress);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDeliveryAddress(final Address myDeliveryAddress) {
		updateDeliveryAddress(myDeliveryAddress, null);
	}

	/*
	 * <!-- Start of user code comment for id property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(order.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					order.setId((Long) arg2);
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
	 * <!-- Start of user code comment for items property method 
		-->
	 * <!-- End of user code -->
	 */
	public ReadOnlyObjectProperty<ObservableList<Item>> itemsProperty() {
		if (itemsProperty == null) {
			itemsProperty = new SimpleObjectProperty<ObservableList<Item>>(
					FXCollections.<Item> observableArrayList());
			for (ItemBean tmp : this.order.getItems()) {
				itemsProperty.get().add(tmp.getWrapper());
			}
			itemsProperty.get().addListener(new javafx.collections.ListChangeListener<Item>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Item> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (Item tmp : change.getAddedSubList()) {
								order.addItems(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (Item tmp : change.getRemoved()) {
								order.getItems().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
			//Start of user code itemsproperty method
			//End of user code
		}
		return itemsProperty;
	}
	
	/*
	 * <!-- Start of user code comment for items getter 
		-->
	 * <!-- End of user code -->
	 */
	public ObservableList<Item> getItems()
	{ 
		return itemsProperty().get(); 
	}

	/*
	 * <!-- Start of user code comment for paymentAddress property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Address> paymentAddressProperty() {
		if (paymentAddressProperty == null) {
			paymentAddressProperty = new SimpleObjectProperty<Address>(order.getPaymentAddress() == null ? null : order
					.getPaymentAddress().getWrapper());
			paymentAddressProperty.addListener(new ChangeListener<Address>() {
				@Override
				public void changed(ObservableValue<? extends Address> obj, Address oldValue, Address newValue) {
					order.setPaymentAddress(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code paymentAddressproperty method
			//End of user code
		}
		return paymentAddressProperty;
	}
	
	/*
	 * <!-- Start of user code comment for paymentAddress getter 
		-->
	 * <!-- End of user code -->
	 */
	public Address getPaymentAddress(){
		return paymentAddressProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for paymentAddress setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setPaymentAddress(Address myPaymentAddress){
		if (paymentAddressProperty == null) {
				order.setPaymentAddress(myPaymentAddress == null ? null : myPaymentAddress.getBean());
			} else {
				this.paymentAddressProperty().set(myPaymentAddress);
			}
	}
	
	public void updatePaymentAddress(final Address myPaymentAddress, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPaymentAddress(myPaymentAddress);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPaymentAddress(myPaymentAddress);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updatePaymentAddress(final Address myPaymentAddress) {
		updatePaymentAddress(myPaymentAddress, null);
	}

	/*
	 * <!-- Start of user code comment for reference property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty referenceProperty(){
		if (this.referenceProperty == null) {
			this.referenceProperty = new SimpleStringProperty(order.getReference());
			this.referenceProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					order.setReference((String) arg2);
				}
			});
			//Start of user code referenceproperty method
			//End of user code
		}
		return this.referenceProperty;
	}
	
	/*
	 * <!-- Start of user code comment for reference getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getReference(){
		return referenceProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for reference setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setReference(String myReference){
		this.referenceProperty().set(myReference);
	}
	
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
	
	public void updateReference(final String myReference) {
		updateReference(myReference, null);
	}

	/*
	 * <!-- Start of user code comment for status property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty statusProperty(){
		if (this.statusProperty == null) {
			this.statusProperty = new SimpleStringProperty(order.getStatus());
			this.statusProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					order.setStatus((String) arg2);
				}
			});
			//Start of user code statusproperty method
			//End of user code
		}
		return this.statusProperty;
	}
	
	/*
	 * <!-- Start of user code comment for status getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getStatus(){
		return statusProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for status setter 
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
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(order.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					order.setUpdateDate(arg2);
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
				order.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(order.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					order.setVersion((Integer) arg2);
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
		return getOrderBean() != null ? serializer.outputString(getOrderBean().toXML()) : "";
		
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
