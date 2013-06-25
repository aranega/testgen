package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.BottleTypeCriteriaInstance;

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





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
//@BeanClass(BottleTypeCriteriaBean.class)
public class BottleTypeCriteria 
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
	private StringProperty nameProperty;
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
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty volumeMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty volumeMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty weightMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty weightMinProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private BottleTypeCriteriaInstance bottleTypeCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BottleTypeCriteria(BottleTypeCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.bottleTypeCriteria = entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BottleTypeCriteriaInstance getBean() {
		return  this.bottleTypeCriteria;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty volumeMaxProperty(){
		if (this.volumeMaxProperty == null) {
			this.volumeMaxProperty = createVolumeMaxProperty();
			getBean().setVolumeMax(getBean().getVolumeMax());
			this.volumeMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setVolumeMax((Double) arg2);
				}
			});
		}
		return this.volumeMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createVolumeMaxProperty(){
		return new SimpleDoubleProperty(getBean().getVolumeMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getVolumeMax(){
		return volumeMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setVolumeMax(double myVolumeMax){
		this.volumeMaxProperty().set(myVolumeMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVolumeMax(final Double myVolumeMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVolumeMax(myVolumeMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVolumeMax(myVolumeMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVolumeMaxAndWait(final Double myVolumeMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVolumeMax(myVolumeMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVolumeMax(myVolumeMax);
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
	public DoubleProperty volumeMinProperty(){
		if (this.volumeMinProperty == null) {
			this.volumeMinProperty = createVolumeMinProperty();
			getBean().setVolumeMin(getBean().getVolumeMin());
			this.volumeMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setVolumeMin((Double) arg2);
				}
			});
		}
		return this.volumeMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createVolumeMinProperty(){
		return new SimpleDoubleProperty(getBean().getVolumeMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getVolumeMin(){
		return volumeMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setVolumeMin(double myVolumeMin){
		this.volumeMinProperty().set(myVolumeMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVolumeMin(final Double myVolumeMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVolumeMin(myVolumeMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVolumeMin(myVolumeMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVolumeMinAndWait(final Double myVolumeMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVolumeMin(myVolumeMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVolumeMin(myVolumeMin);
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
	public DoubleProperty weightMaxProperty(){
		if (this.weightMaxProperty == null) {
			this.weightMaxProperty = createWeightMaxProperty();
			getBean().setWeightMax(getBean().getWeightMax());
			this.weightMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setWeightMax((Double) arg2);
				}
			});
		}
		return this.weightMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createWeightMaxProperty(){
		return new SimpleDoubleProperty(getBean().getWeightMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getWeightMax(){
		return weightMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setWeightMax(double myWeightMax){
		this.weightMaxProperty().set(myWeightMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateWeightMax(final Double myWeightMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setWeightMax(myWeightMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setWeightMax(myWeightMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateWeightMaxAndWait(final Double myWeightMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setWeightMax(myWeightMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setWeightMax(myWeightMax);
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
	public DoubleProperty weightMinProperty(){
		if (this.weightMinProperty == null) {
			this.weightMinProperty = createWeightMinProperty();
			getBean().setWeightMin(getBean().getWeightMin());
			this.weightMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setWeightMin((Double) arg2);
				}
			});
		}
		return this.weightMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createWeightMinProperty(){
		return new SimpleDoubleProperty(getBean().getWeightMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getWeightMin(){
		return weightMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setWeightMin(double myWeightMin){
		this.weightMinProperty().set(myWeightMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateWeightMin(final Double myWeightMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setWeightMin(myWeightMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setWeightMin(myWeightMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateWeightMinAndWait(final Double myWeightMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setWeightMin(myWeightMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setWeightMin(myWeightMin);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

}
