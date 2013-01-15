package com.genmymodel.petshop.wrapper;

import com.genmymodel.petshop.entity.CartBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import com.genmymodel.petshop.entity.ItemBean;
//Start of user code for imports
// TODO: import me!
//End of user code




public class Cart implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private ObjectProperty<Customer> customerProperty;
	
	private LongProperty idProperty;
	
	private ObjectProperty<ObservableList<Item>> itemsProperty;
	
	private ObjectProperty<Order> orderProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final CartBean cart;

	/*
	 * Constructors 
	 */
	public Cart(){
		this(new CartBean());	
	}
	
	
	public Cart(CartBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.cart = entity;
	}
	
	public CartBean getCartBean(){
		return this.cart;
	}
	
	public CartBean getBean() {
		return  this.cart;
	}
	

	/*
	 * Generated getters and setters
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(cart.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					cart.setCreationDate(arg2);
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
				cart.setCreationDate(myCreationDate);
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

	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(cart.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					cart.setCreationDate(arg2);
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
				cart.setCreationDate(myCreationDate);
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

	public ObjectProperty<Customer> customerProperty() {
		if (customerProperty == null) {
			customerProperty = new SimpleObjectProperty<Customer>(cart.getCustomer() == null ? null : cart
					.getCustomer().getWrapper());
			customerProperty.addListener(new ChangeListener<Customer>() {
				@Override
				public void changed(ObservableValue<? extends Customer> obj, Customer oldValue, Customer newValue) {
					cart.setCustomer(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code customerproperty method
			//End of user code
		}
		return customerProperty;
	}
	
	public Customer getCustomer(){
		return customerProperty().get();
	} 
	
	public void setCustomer(Customer myCustomer){
		if (customerProperty == null) {
				cart.setCustomer(myCustomer == null ? null : myCustomer.getBean());
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

	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(cart.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					cart.setId((Long) arg2);
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

	public ReadOnlyObjectProperty<ObservableList<Item>> itemsProperty() {
		if (itemsProperty == null) {
			itemsProperty = new SimpleObjectProperty<ObservableList<Item>>(
					FXCollections.<Item> observableArrayList());
			for (ItemBean b : cart.getItems()) {
				itemsProperty.get().add(b.getWrapper());
			}
			itemsProperty.get().addListener(new javafx.collections.ListChangeListener<Item>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Item> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (Item tmp : change.getAddedSubList()) {
								cart.addItems(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (Item tmp : change.getRemoved()) {
								cart.getItems().remove(tmp == null ? null : tmp.getBean());
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
	
	public ObservableList<Item> getItems()
	{ 
		return itemsProperty().get(); 
	}

	public ObjectProperty<Order> orderProperty() {
		if (orderProperty == null) {
			orderProperty = new SimpleObjectProperty<Order>(cart.getOrder() == null ? null : cart
					.getOrder().getWrapper());
			orderProperty.addListener(new ChangeListener<Order>() {
				@Override
				public void changed(ObservableValue<? extends Order> obj, Order oldValue, Order newValue) {
					cart.setOrder(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code orderproperty method
			//End of user code
		}
		return orderProperty;
	}
	
	public Order getOrder(){
		return orderProperty().get();
	} 
	
	public void setOrder(Order myOrder){
		if (orderProperty == null) {
				cart.setOrder(myOrder == null ? null : myOrder.getBean());
			} else {
				this.orderProperty().set(myOrder);
			}
	}
	
	public void updateOrder(final Order myOrder, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setOrder(myOrder);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setOrder(myOrder);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateOrder(final Order myOrder) {
		updateOrder(myOrder, null);
	}

	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(cart.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					cart.setUpdateDate(arg2);
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
				cart.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(cart.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					cart.setVersion((Integer) arg2);
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
