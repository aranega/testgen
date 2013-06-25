package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.GazConfigurationCriteriaInstance;

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
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.BooleanProperty;





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
//@BeanClass(GazConfigurationCriteriaBean.class)
public class GazConfigurationCriteria 
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
	private BooleanProperty droppedCeilFullProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty droppedFloorFullProperty;
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
	private DoubleProperty leekRepartitionPercentMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty leekRepartitionPercentMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty retentionGoalMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty retentionGoalMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty retentionInterfaceProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty slowUnloadingProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty slowUnloadingValueMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty slowUnloadingValueMinProperty;
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
	private GazConfigurationCriteriaInstance gazConfigurationCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazConfigurationCriteria(GazConfigurationCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.gazConfigurationCriteria = entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazConfigurationCriteriaInstance getBean() {
		return  this.gazConfigurationCriteria;
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
	public BooleanProperty droppedCeilFullProperty(){
		if (this.droppedCeilFullProperty == null) {
			this.droppedCeilFullProperty = createDroppedCeilFullProperty();
			getBean().setDroppedCeilFull(getBean().isDroppedCeilFull());
			this.droppedCeilFullProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setDroppedCeilFull((Boolean) arg2);
				}
			});
		}
		return this.droppedCeilFullProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createDroppedCeilFullProperty(){
		return new SimpleBooleanProperty(getBean().isDroppedCeilFull());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isDroppedCeilFull(){
		return droppedCeilFullProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedCeilFull(boolean myDroppedCeilFull){
		this.droppedCeilFullProperty().set(myDroppedCeilFull);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedCeilFull(final Boolean myDroppedCeilFull) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedCeilFull(myDroppedCeilFull);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedCeilFull(myDroppedCeilFull);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedCeilFullAndWait(final Boolean myDroppedCeilFull) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedCeilFull(myDroppedCeilFull);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedCeilFull(myDroppedCeilFull);
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
	public BooleanProperty droppedFloorFullProperty(){
		if (this.droppedFloorFullProperty == null) {
			this.droppedFloorFullProperty = createDroppedFloorFullProperty();
			getBean().setDroppedFloorFull(getBean().isDroppedFloorFull());
			this.droppedFloorFullProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setDroppedFloorFull((Boolean) arg2);
				}
			});
		}
		return this.droppedFloorFullProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createDroppedFloorFullProperty(){
		return new SimpleBooleanProperty(getBean().isDroppedFloorFull());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isDroppedFloorFull(){
		return droppedFloorFullProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedFloorFull(boolean myDroppedFloorFull){
		this.droppedFloorFullProperty().set(myDroppedFloorFull);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedFloorFull(final Boolean myDroppedFloorFull) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedFloorFull(myDroppedFloorFull);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedFloorFull(myDroppedFloorFull);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedFloorFullAndWait(final Boolean myDroppedFloorFull) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedFloorFull(myDroppedFloorFull);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedFloorFull(myDroppedFloorFull);
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
	public DoubleProperty leekRepartitionPercentMaxProperty(){
		if (this.leekRepartitionPercentMaxProperty == null) {
			this.leekRepartitionPercentMaxProperty = createLeekRepartitionPercentMaxProperty();
			getBean().setLeekRepartitionPercentMax(getBean().getLeekRepartitionPercentMax());
			this.leekRepartitionPercentMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setLeekRepartitionPercentMax((Double) arg2);
				}
			});
		}
		return this.leekRepartitionPercentMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createLeekRepartitionPercentMaxProperty(){
		return new SimpleDoubleProperty(getBean().getLeekRepartitionPercentMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getLeekRepartitionPercentMax(){
		return leekRepartitionPercentMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLeekRepartitionPercentMax(double myLeekRepartitionPercentMax){
		this.leekRepartitionPercentMaxProperty().set(myLeekRepartitionPercentMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLeekRepartitionPercentMax(final Double myLeekRepartitionPercentMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLeekRepartitionPercentMax(myLeekRepartitionPercentMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLeekRepartitionPercentMax(myLeekRepartitionPercentMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLeekRepartitionPercentMaxAndWait(final Double myLeekRepartitionPercentMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLeekRepartitionPercentMax(myLeekRepartitionPercentMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLeekRepartitionPercentMax(myLeekRepartitionPercentMax);
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
	public DoubleProperty leekRepartitionPercentMinProperty(){
		if (this.leekRepartitionPercentMinProperty == null) {
			this.leekRepartitionPercentMinProperty = createLeekRepartitionPercentMinProperty();
			getBean().setLeekRepartitionPercentMin(getBean().getLeekRepartitionPercentMin());
			this.leekRepartitionPercentMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setLeekRepartitionPercentMin((Double) arg2);
				}
			});
		}
		return this.leekRepartitionPercentMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createLeekRepartitionPercentMinProperty(){
		return new SimpleDoubleProperty(getBean().getLeekRepartitionPercentMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getLeekRepartitionPercentMin(){
		return leekRepartitionPercentMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLeekRepartitionPercentMin(double myLeekRepartitionPercentMin){
		this.leekRepartitionPercentMinProperty().set(myLeekRepartitionPercentMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLeekRepartitionPercentMin(final Double myLeekRepartitionPercentMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLeekRepartitionPercentMin(myLeekRepartitionPercentMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLeekRepartitionPercentMin(myLeekRepartitionPercentMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLeekRepartitionPercentMinAndWait(final Double myLeekRepartitionPercentMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLeekRepartitionPercentMin(myLeekRepartitionPercentMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLeekRepartitionPercentMin(myLeekRepartitionPercentMin);
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
	public DoubleProperty retentionGoalMaxProperty(){
		if (this.retentionGoalMaxProperty == null) {
			this.retentionGoalMaxProperty = createRetentionGoalMaxProperty();
			getBean().setRetentionGoalMax(getBean().getRetentionGoalMax());
			this.retentionGoalMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setRetentionGoalMax((Double) arg2);
				}
			});
		}
		return this.retentionGoalMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createRetentionGoalMaxProperty(){
		return new SimpleDoubleProperty(getBean().getRetentionGoalMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRetentionGoalMax(){
		return retentionGoalMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRetentionGoalMax(double myRetentionGoalMax){
		this.retentionGoalMaxProperty().set(myRetentionGoalMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRetentionGoalMax(final Double myRetentionGoalMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionGoalMax(myRetentionGoalMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionGoalMax(myRetentionGoalMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRetentionGoalMaxAndWait(final Double myRetentionGoalMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionGoalMax(myRetentionGoalMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionGoalMax(myRetentionGoalMax);
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
	public DoubleProperty retentionGoalMinProperty(){
		if (this.retentionGoalMinProperty == null) {
			this.retentionGoalMinProperty = createRetentionGoalMinProperty();
			getBean().setRetentionGoalMin(getBean().getRetentionGoalMin());
			this.retentionGoalMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setRetentionGoalMin((Double) arg2);
				}
			});
		}
		return this.retentionGoalMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createRetentionGoalMinProperty(){
		return new SimpleDoubleProperty(getBean().getRetentionGoalMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRetentionGoalMin(){
		return retentionGoalMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRetentionGoalMin(double myRetentionGoalMin){
		this.retentionGoalMinProperty().set(myRetentionGoalMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRetentionGoalMin(final Double myRetentionGoalMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionGoalMin(myRetentionGoalMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionGoalMin(myRetentionGoalMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRetentionGoalMinAndWait(final Double myRetentionGoalMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionGoalMin(myRetentionGoalMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionGoalMin(myRetentionGoalMin);
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
	public BooleanProperty retentionInterfaceProperty(){
		if (this.retentionInterfaceProperty == null) {
			this.retentionInterfaceProperty = createRetentionInterfaceProperty();
			getBean().setRetentionInterface(getBean().isRetentionInterface());
			this.retentionInterfaceProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setRetentionInterface((Boolean) arg2);
				}
			});
		}
		return this.retentionInterfaceProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createRetentionInterfaceProperty(){
		return new SimpleBooleanProperty(getBean().isRetentionInterface());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isRetentionInterface(){
		return retentionInterfaceProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRetentionInterface(boolean myRetentionInterface){
		this.retentionInterfaceProperty().set(myRetentionInterface);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRetentionInterface(final Boolean myRetentionInterface) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionInterface(myRetentionInterface);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionInterface(myRetentionInterface);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRetentionInterfaceAndWait(final Boolean myRetentionInterface) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionInterface(myRetentionInterface);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionInterface(myRetentionInterface);
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
	public BooleanProperty slowUnloadingProperty(){
		if (this.slowUnloadingProperty == null) {
			this.slowUnloadingProperty = createSlowUnloadingProperty();
			getBean().setSlowUnloading(getBean().isSlowUnloading());
			this.slowUnloadingProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setSlowUnloading((Boolean) arg2);
				}
			});
		}
		return this.slowUnloadingProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createSlowUnloadingProperty(){
		return new SimpleBooleanProperty(getBean().isSlowUnloading());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isSlowUnloading(){
		return slowUnloadingProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSlowUnloading(boolean mySlowUnloading){
		this.slowUnloadingProperty().set(mySlowUnloading);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSlowUnloading(final Boolean mySlowUnloading) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloading(mySlowUnloading);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloading(mySlowUnloading);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSlowUnloadingAndWait(final Boolean mySlowUnloading) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloading(mySlowUnloading);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloading(mySlowUnloading);
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
	public DoubleProperty slowUnloadingValueMaxProperty(){
		if (this.slowUnloadingValueMaxProperty == null) {
			this.slowUnloadingValueMaxProperty = createSlowUnloadingValueMaxProperty();
			getBean().setSlowUnloadingValueMax(getBean().getSlowUnloadingValueMax());
			this.slowUnloadingValueMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setSlowUnloadingValueMax((Double) arg2);
				}
			});
		}
		return this.slowUnloadingValueMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createSlowUnloadingValueMaxProperty(){
		return new SimpleDoubleProperty(getBean().getSlowUnloadingValueMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getSlowUnloadingValueMax(){
		return slowUnloadingValueMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSlowUnloadingValueMax(double mySlowUnloadingValueMax){
		this.slowUnloadingValueMaxProperty().set(mySlowUnloadingValueMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSlowUnloadingValueMax(final Double mySlowUnloadingValueMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloadingValueMax(mySlowUnloadingValueMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloadingValueMax(mySlowUnloadingValueMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSlowUnloadingValueMaxAndWait(final Double mySlowUnloadingValueMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloadingValueMax(mySlowUnloadingValueMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloadingValueMax(mySlowUnloadingValueMax);
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
	public DoubleProperty slowUnloadingValueMinProperty(){
		if (this.slowUnloadingValueMinProperty == null) {
			this.slowUnloadingValueMinProperty = createSlowUnloadingValueMinProperty();
			getBean().setSlowUnloadingValueMin(getBean().getSlowUnloadingValueMin());
			this.slowUnloadingValueMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setSlowUnloadingValueMin((Double) arg2);
				}
			});
		}
		return this.slowUnloadingValueMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createSlowUnloadingValueMinProperty(){
		return new SimpleDoubleProperty(getBean().getSlowUnloadingValueMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getSlowUnloadingValueMin(){
		return slowUnloadingValueMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSlowUnloadingValueMin(double mySlowUnloadingValueMin){
		this.slowUnloadingValueMinProperty().set(mySlowUnloadingValueMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSlowUnloadingValueMin(final Double mySlowUnloadingValueMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloadingValueMin(mySlowUnloadingValueMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloadingValueMin(mySlowUnloadingValueMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSlowUnloadingValueMinAndWait(final Double mySlowUnloadingValueMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloadingValueMin(mySlowUnloadingValueMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloadingValueMin(mySlowUnloadingValueMin);
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
