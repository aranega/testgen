package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.BottleConfigurationCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;


import com.dooapp.firea.enumeration.BottleUnit;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
//@BeanClass(BottleConfigurationCriteriaBean.class)
public class BottleConfigurationCriteria 
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
	private ObjectProperty<java.util.Date> creationDateMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<java.util.Date> creationDateMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private LongProperty idMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private LongProperty idMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty loadMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty loadMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty quantityProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<BottleUnit> unitProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<java.util.Date> updateDateMinProperty;
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
	private BottleConfigurationCriteriaInstance bottleConfigurationCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BottleConfigurationCriteria(BottleConfigurationCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.bottleConfigurationCriteria = entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BottleConfigurationCriteriaInstance getBean() {
		return  this.bottleConfigurationCriteria;
	}

	/*
	 * Generated getters and setters
	 */

	/**
	 * For compliance purpose only always return 0!
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public long getId(){
		return 0;
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<java.util.Date> creationDateMaxProperty() {
		if (creationDateMaxProperty == null) {
			creationDateMaxProperty = createCreationDateMaxProperty();
			getBean().setCreationDateMax(getBean().getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setCreationDateMax(arg2);
				}
			});
		}
		return creationDateMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<java.util.Date> createCreationDateMaxProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getCreationDateMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCreationDateMax(){
		return creationDateMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCreationDateMax(java.util.Date myCreationDateMax){
		if (creationDateMaxProperty == null) {
				getBean().setCreationDateMax(myCreationDateMax);
			} else {
				this.creationDateMaxProperty().set(myCreationDateMax);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateMax(final java.util.Date myCreationDateMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDateMax(myCreationDateMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDateMax(myCreationDateMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateMaxAndWait(final java.util.Date myCreationDateMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDateMax(myCreationDateMax);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDateMax(myCreationDateMax);
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
	public ObjectProperty<java.util.Date> creationDateMinProperty() {
		if (creationDateMinProperty == null) {
			creationDateMinProperty = createCreationDateMinProperty();
			getBean().setCreationDateMin(getBean().getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setCreationDateMin(arg2);
				}
			});
		}
		return creationDateMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<java.util.Date> createCreationDateMinProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getCreationDateMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCreationDateMin(){
		return creationDateMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCreationDateMin(java.util.Date myCreationDateMin){
		if (creationDateMinProperty == null) {
				getBean().setCreationDateMin(myCreationDateMin);
			} else {
				this.creationDateMinProperty().set(myCreationDateMin);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateMin(final java.util.Date myCreationDateMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDateMin(myCreationDateMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDateMin(myCreationDateMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateMinAndWait(final java.util.Date myCreationDateMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDateMin(myCreationDateMin);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDateMin(myCreationDateMin);
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
	public LongProperty idMaxProperty(){
		if (this.idMaxProperty == null) {
			this.idMaxProperty = createIdMaxProperty();
			getBean().setIdMax(getBean().getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setIdMax((Long) arg2);
				}
			});
		}
		return this.idMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected LongProperty createIdMaxProperty(){
		return new SimpleLongProperty(getBean().getIdMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public long getIdMax(){
		return idMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setIdMax(long myIdMax){
		this.idMaxProperty().set(myIdMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIdMax(final Long myIdMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIdMax(myIdMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIdMax(myIdMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIdMaxAndWait(final Long myIdMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIdMax(myIdMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIdMax(myIdMax);
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
	public LongProperty idMinProperty(){
		if (this.idMinProperty == null) {
			this.idMinProperty = createIdMinProperty();
			getBean().setIdMin(getBean().getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setIdMin((Long) arg2);
				}
			});
		}
		return this.idMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected LongProperty createIdMinProperty(){
		return new SimpleLongProperty(getBean().getIdMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public long getIdMin(){
		return idMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setIdMin(long myIdMin){
		this.idMinProperty().set(myIdMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIdMin(final Long myIdMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIdMin(myIdMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIdMin(myIdMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIdMinAndWait(final Long myIdMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIdMin(myIdMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIdMin(myIdMin);
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
	public DoubleProperty loadMaxProperty(){
		if (this.loadMaxProperty == null) {
			this.loadMaxProperty = createLoadMaxProperty();
			getBean().setLoadMax(getBean().getLoadMax());
			this.loadMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setLoadMax((Double) arg2);
				}
			});
		}
		return this.loadMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createLoadMaxProperty(){
		return new SimpleDoubleProperty(getBean().getLoadMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getLoadMax(){
		return loadMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLoadMax(double myLoadMax){
		this.loadMaxProperty().set(myLoadMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLoadMax(final Double myLoadMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLoadMax(myLoadMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLoadMax(myLoadMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLoadMaxAndWait(final Double myLoadMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLoadMax(myLoadMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLoadMax(myLoadMax);
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
	public DoubleProperty loadMinProperty(){
		if (this.loadMinProperty == null) {
			this.loadMinProperty = createLoadMinProperty();
			getBean().setLoadMin(getBean().getLoadMin());
			this.loadMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setLoadMin((Double) arg2);
				}
			});
		}
		return this.loadMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createLoadMinProperty(){
		return new SimpleDoubleProperty(getBean().getLoadMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getLoadMin(){
		return loadMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLoadMin(double myLoadMin){
		this.loadMinProperty().set(myLoadMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLoadMin(final Double myLoadMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLoadMin(myLoadMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLoadMin(myLoadMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLoadMinAndWait(final Double myLoadMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLoadMin(myLoadMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLoadMin(myLoadMin);
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
	public IntegerProperty quantityProperty(){
		if (this.quantityProperty == null) {
			this.quantityProperty = createQuantityProperty();
			getBean().setQuantity(getBean().getQuantity());
			this.quantityProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setQuantity((Integer) arg2);
				}
			});
		}
		return this.quantityProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createQuantityProperty(){
		return new SimpleIntegerProperty(getBean().getQuantity());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getQuantity(){
		return quantityProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setQuantity(int myQuantity){
		this.quantityProperty().set(myQuantity);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateQuantity(final Integer myQuantity) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setQuantity(myQuantity);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setQuantity(myQuantity);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateQuantityAndWait(final Integer myQuantity) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setQuantity(myQuantity);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setQuantity(myQuantity);
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
	public ObjectProperty<BottleUnit> unitProperty() {
		if (unitProperty == null) {
			unitProperty = createUnitProperty();
			getBean().setUnit(getBean().getUnit());
			unitProperty.addListener(new ChangeListener<BottleUnit>() {
				@Override
				public void changed(ObservableValue<? extends BottleUnit> arg0, BottleUnit arg1, BottleUnit arg2) {
					getBean().setUnit(arg2);
				}
			});
		}
		return unitProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<BottleUnit> createUnitProperty(){
		return  new SimpleObjectProperty<BottleUnit>(getBean().getUnit());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BottleUnit getUnit(){
		return unitProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUnit(BottleUnit myUnit){
		if (unitProperty == null) {
				getBean().setUnit(myUnit);
			} else {
				this.unitProperty().set(myUnit);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUnit(final BottleUnit myUnit) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUnit(myUnit);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUnit(myUnit);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUnitAndWait(final BottleUnit myUnit) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUnit(myUnit);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUnit(myUnit);
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
	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = createUpdateDateMaxProperty();
			getBean().setUpdateDateMax(getBean().getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setUpdateDateMax(arg2);
				}
			});
		}
		return updateDateMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<java.util.Date> createUpdateDateMaxProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getUpdateDateMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getUpdateDateMax(){
		return updateDateMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUpdateDateMax(java.util.Date myUpdateDateMax){
		if (updateDateMaxProperty == null) {
				getBean().setUpdateDateMax(myUpdateDateMax);
			} else {
				this.updateDateMaxProperty().set(myUpdateDateMax);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateMax(final java.util.Date myUpdateDateMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDateMax(myUpdateDateMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDateMax(myUpdateDateMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateMaxAndWait(final java.util.Date myUpdateDateMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDateMax(myUpdateDateMax);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDateMax(myUpdateDateMax);
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
	public ObjectProperty<java.util.Date> updateDateMinProperty() {
		if (updateDateMinProperty == null) {
			updateDateMinProperty = createUpdateDateMinProperty();
			getBean().setUpdateDateMin(getBean().getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setUpdateDateMin(arg2);
				}
			});
		}
		return updateDateMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<java.util.Date> createUpdateDateMinProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getUpdateDateMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getUpdateDateMin(){
		return updateDateMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUpdateDateMin(java.util.Date myUpdateDateMin){
		if (updateDateMinProperty == null) {
				getBean().setUpdateDateMin(myUpdateDateMin);
			} else {
				this.updateDateMinProperty().set(myUpdateDateMin);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateMin(final java.util.Date myUpdateDateMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDateMin(myUpdateDateMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDateMin(myUpdateDateMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateMinAndWait(final java.util.Date myUpdateDateMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDateMin(myUpdateDateMin);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDateMin(myUpdateDateMin);
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

}
