package com.genmymodel.petshop.wrapper;

import com.genmymodel.petshop.entity.ItemBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;
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




// Start of user code comment for Item Class

// End of user code
/**
 *  
 */
public class Item
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private LongProperty idProperty;
	/**
	 *  
	 */
	private StringProperty myAttributeIsBioutifoulProperty;
	/**
	 *  
	 */
	private DoubleProperty priceProperty;
	
	private ObjectProperty<Product> productProperty;
	/**
	 *  
	 */
	private StringProperty quantityProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final ItemBean item;

	/*
	 * Constructors
	 * <!-- Start of user code comment for Item constructor
	 * End of user code -->
	 */
	public Item(){
		this(new ItemBean());	
	}
	
	
	public Item(ItemBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.item = entity;
	}
	
	public ItemBean getItemBean(){
		return this.item;
	}
	
	public ItemBean getBean() {
		return  this.item;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for creationDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(item.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					item.setCreationDate(arg2);
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
				item.setCreationDate(myCreationDate);
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
			this.idProperty = new SimpleLongProperty(item.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					item.setId((Long) arg2);
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
	 * <!-- Start of user code comment for myAttributeIsBioutifoul property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty myAttributeIsBioutifoulProperty(){
		if (this.myAttributeIsBioutifoulProperty == null) {
			this.myAttributeIsBioutifoulProperty = new SimpleStringProperty(item.getMyAttributeIsBioutifoul());
			this.myAttributeIsBioutifoulProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					item.setMyAttributeIsBioutifoul((String) arg2);
				}
			});
			//Start of user code myAttributeIsBioutifoulproperty method
			//End of user code
		}
		return this.myAttributeIsBioutifoulProperty;
	}
	
	/*
	 * <!-- Start of user code comment for myAttributeIsBioutifoul getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getMyAttributeIsBioutifoul(){
		return myAttributeIsBioutifoulProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for myAttributeIsBioutifoul setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setMyAttributeIsBioutifoul(String myMyAttributeIsBioutifoul){
		this.myAttributeIsBioutifoulProperty().set(myMyAttributeIsBioutifoul);
	}
	
	public void updateMyAttributeIsBioutifoul(final String myMyAttributeIsBioutifoul, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMyAttributeIsBioutifoul(myMyAttributeIsBioutifoul);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMyAttributeIsBioutifoul(myMyAttributeIsBioutifoul);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateMyAttributeIsBioutifoul(final String myMyAttributeIsBioutifoul) {
		updateMyAttributeIsBioutifoul(myMyAttributeIsBioutifoul, null);
	}

	/*
	 * <!-- Start of user code comment for price property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty priceProperty(){
		if (this.priceProperty == null) {
			this.priceProperty = new SimpleDoubleProperty(item.getPrice());
			this.priceProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					item.setPrice((Double) arg2);
				}
			});
			//Start of user code priceproperty method
			//End of user code
		}
		return this.priceProperty;
	}
	
	/*
	 * <!-- Start of user code comment for price getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getPrice(){
		return priceProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for price setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setPrice(double myPrice){
		this.priceProperty().set(myPrice);
	}
	
	public void updatePrice(final double myPrice, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrice(myPrice);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrice(myPrice);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updatePrice(final double myPrice) {
		updatePrice(myPrice, null);
	}

	/*
	 * <!-- Start of user code comment for product property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Product> productProperty() {
		if (productProperty == null) {
			productProperty = new SimpleObjectProperty<Product>(item.getProduct() == null ? null : item
					.getProduct().getWrapper());
			productProperty.addListener(new ChangeListener<Product>() {
				@Override
				public void changed(ObservableValue<? extends Product> obj, Product oldValue, Product newValue) {
					item.setProduct(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code productproperty method
			//End of user code
		}
		return productProperty;
	}
	
	/*
	 * <!-- Start of user code comment for product getter 
		-->
	 * <!-- End of user code -->
	 */
	public Product getProduct(){
		return productProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for product setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setProduct(Product myProduct){
		if (productProperty == null) {
				item.setProduct(myProduct == null ? null : myProduct.getBean());
			} else {
				this.productProperty().set(myProduct);
			}
	}
	
	public void updateProduct(final Product myProduct, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setProduct(myProduct);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setProduct(myProduct);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateProduct(final Product myProduct) {
		updateProduct(myProduct, null);
	}

	/*
	 * <!-- Start of user code comment for quantity property method 
		-->
	 * <!-- End of user code -->
	 */
	public StringProperty quantityProperty(){
		if (this.quantityProperty == null) {
			this.quantityProperty = new SimpleStringProperty(item.getQuantity());
			this.quantityProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					item.setQuantity((String) arg2);
				}
			});
			//Start of user code quantityproperty method
			//End of user code
		}
		return this.quantityProperty;
	}
	
	/*
	 * <!-- Start of user code comment for quantity getter 
		-->
	 * <!-- End of user code -->
	 */
	public String getQuantity(){
		return quantityProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for quantity setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setQuantity(String myQuantity){
		this.quantityProperty().set(myQuantity);
	}
	
	public void updateQuantity(final String myQuantity, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setQuantity(myQuantity);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setQuantity(myQuantity);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateQuantity(final String myQuantity) {
		updateQuantity(myQuantity, null);
	}

	/*
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(item.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					item.setUpdateDate(arg2);
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
				item.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(item.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					item.setVersion((Integer) arg2);
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
		return getItemBean() != null ? serializer.outputString(getItemBean().toXML()) : "";
		
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
