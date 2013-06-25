package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.TestedRoomCriteriaInstance;

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
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.BooleanProperty;





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
//@BeanClass(TestedRoomCriteriaBean.class)
public class TestedRoomCriteria 
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
	private ObjectProperty<java.util.Date> commissioningDateMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<java.util.Date> commissioningDateMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty altitudeProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty choosenProtectedHeightProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty clapetsCFProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climDuctProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climReclycleProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climReclycleAutoProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climVMCProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climVMCAutoProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climWithNewAirProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty climWithNewAirAutoProperty;
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
	private IntegerProperty droppedCeilingProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty droppedFloorProperty;
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
	private IntegerProperty indicatedVolumeProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty mainHeightProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty measuredVolumeProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty mecanicalStrengthProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty minimalProtectedHeightProperty;
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
	private IntegerProperty netVolumeProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty risqueHeightProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty risqueHeightPercentMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty risqueHeightPercentMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty totalHeightProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty uniformHorizontalityProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty unloadTimeProperty;
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
	private IntegerProperty volumeCorrectionProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private TestedRoomCriteriaInstance testedRoomCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoomCriteria(TestedRoomCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.testedRoomCriteria = entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoomCriteriaInstance getBean() {
		return  this.testedRoomCriteria;
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
	public ObjectProperty<java.util.Date> commissioningDateMaxProperty() {
		if (commissioningDateMaxProperty == null) {
			commissioningDateMaxProperty = createCommissioningDateMaxProperty();
			getBean().setCommissioningDateMax(getBean().getCommissioningDateMax());
			commissioningDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setCommissioningDateMax(arg2);
				}
			});
		}
		return commissioningDateMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<java.util.Date> createCommissioningDateMaxProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getCommissioningDateMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCommissioningDateMax(){
		return commissioningDateMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCommissioningDateMax(java.util.Date myCommissioningDateMax){
		if (commissioningDateMaxProperty == null) {
				getBean().setCommissioningDateMax(myCommissioningDateMax);
			} else {
				this.commissioningDateMaxProperty().set(myCommissioningDateMax);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCommissioningDateMax(final java.util.Date myCommissioningDateMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCommissioningDateMax(myCommissioningDateMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCommissioningDateMax(myCommissioningDateMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCommissioningDateMaxAndWait(final java.util.Date myCommissioningDateMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCommissioningDateMax(myCommissioningDateMax);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCommissioningDateMax(myCommissioningDateMax);
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
	public ObjectProperty<java.util.Date> commissioningDateMinProperty() {
		if (commissioningDateMinProperty == null) {
			commissioningDateMinProperty = createCommissioningDateMinProperty();
			getBean().setCommissioningDateMin(getBean().getCommissioningDateMin());
			commissioningDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setCommissioningDateMin(arg2);
				}
			});
		}
		return commissioningDateMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<java.util.Date> createCommissioningDateMinProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getCommissioningDateMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCommissioningDateMin(){
		return commissioningDateMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCommissioningDateMin(java.util.Date myCommissioningDateMin){
		if (commissioningDateMinProperty == null) {
				getBean().setCommissioningDateMin(myCommissioningDateMin);
			} else {
				this.commissioningDateMinProperty().set(myCommissioningDateMin);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCommissioningDateMin(final java.util.Date myCommissioningDateMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCommissioningDateMin(myCommissioningDateMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCommissioningDateMin(myCommissioningDateMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCommissioningDateMinAndWait(final java.util.Date myCommissioningDateMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCommissioningDateMin(myCommissioningDateMin);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCommissioningDateMin(myCommissioningDateMin);
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
	public IntegerProperty altitudeProperty(){
		if (this.altitudeProperty == null) {
			this.altitudeProperty = createAltitudeProperty();
			getBean().setAltitude(getBean().getAltitude());
			this.altitudeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setAltitude((Integer) arg2);
				}
			});
		}
		return this.altitudeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createAltitudeProperty(){
		return new SimpleIntegerProperty(getBean().getAltitude());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getAltitude(){
		return altitudeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAltitude(int myAltitude){
		this.altitudeProperty().set(myAltitude);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAltitude(final Integer myAltitude) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAltitude(myAltitude);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAltitude(myAltitude);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAltitudeAndWait(final Integer myAltitude) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAltitude(myAltitude);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAltitude(myAltitude);
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
	public IntegerProperty choosenProtectedHeightProperty(){
		if (this.choosenProtectedHeightProperty == null) {
			this.choosenProtectedHeightProperty = createChoosenProtectedHeightProperty();
			getBean().setChoosenProtectedHeight(getBean().getChoosenProtectedHeight());
			this.choosenProtectedHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setChoosenProtectedHeight((Integer) arg2);
				}
			});
		}
		return this.choosenProtectedHeightProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createChoosenProtectedHeightProperty(){
		return new SimpleIntegerProperty(getBean().getChoosenProtectedHeight());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getChoosenProtectedHeight(){
		return choosenProtectedHeightProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChoosenProtectedHeight(int myChoosenProtectedHeight){
		this.choosenProtectedHeightProperty().set(myChoosenProtectedHeight);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChoosenProtectedHeight(final Integer myChoosenProtectedHeight) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setChoosenProtectedHeight(myChoosenProtectedHeight);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setChoosenProtectedHeight(myChoosenProtectedHeight);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChoosenProtectedHeightAndWait(final Integer myChoosenProtectedHeight) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setChoosenProtectedHeight(myChoosenProtectedHeight);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setChoosenProtectedHeight(myChoosenProtectedHeight);
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
	public BooleanProperty clapetsCFProperty(){
		if (this.clapetsCFProperty == null) {
			this.clapetsCFProperty = createClapetsCFProperty();
			getBean().setClapetsCF(getBean().isClapetsCF());
			this.clapetsCFProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setClapetsCF((Boolean) arg2);
				}
			});
		}
		return this.clapetsCFProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createClapetsCFProperty(){
		return new SimpleBooleanProperty(getBean().isClapetsCF());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClapetsCF(){
		return clapetsCFProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClapetsCF(boolean myClapetsCF){
		this.clapetsCFProperty().set(myClapetsCF);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClapetsCF(final Boolean myClapetsCF) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClapetsCF(myClapetsCF);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClapetsCF(myClapetsCF);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClapetsCFAndWait(final Boolean myClapetsCF) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClapetsCF(myClapetsCF);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClapetsCF(myClapetsCF);
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
	public BooleanProperty climDuctProperty(){
		if (this.climDuctProperty == null) {
			this.climDuctProperty = createClimDuctProperty();
			getBean().setClimDuct(getBean().isClimDuct());
			this.climDuctProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setClimDuct((Boolean) arg2);
				}
			});
		}
		return this.climDuctProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createClimDuctProperty(){
		return new SimpleBooleanProperty(getBean().isClimDuct());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimDuct(){
		return climDuctProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimDuct(boolean myClimDuct){
		this.climDuctProperty().set(myClimDuct);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimDuct(final Boolean myClimDuct) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimDuct(myClimDuct);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimDuct(myClimDuct);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimDuctAndWait(final Boolean myClimDuct) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimDuct(myClimDuct);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimDuct(myClimDuct);
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
	public BooleanProperty climReclycleProperty(){
		if (this.climReclycleProperty == null) {
			this.climReclycleProperty = createClimReclycleProperty();
			getBean().setClimReclycle(getBean().isClimReclycle());
			this.climReclycleProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setClimReclycle((Boolean) arg2);
				}
			});
		}
		return this.climReclycleProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createClimReclycleProperty(){
		return new SimpleBooleanProperty(getBean().isClimReclycle());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimReclycle(){
		return climReclycleProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimReclycle(boolean myClimReclycle){
		this.climReclycleProperty().set(myClimReclycle);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimReclycle(final Boolean myClimReclycle) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimReclycle(myClimReclycle);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimReclycle(myClimReclycle);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimReclycleAndWait(final Boolean myClimReclycle) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimReclycle(myClimReclycle);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimReclycle(myClimReclycle);
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
	public BooleanProperty climReclycleAutoProperty(){
		if (this.climReclycleAutoProperty == null) {
			this.climReclycleAutoProperty = createClimReclycleAutoProperty();
			getBean().setClimReclycleAuto(getBean().isClimReclycleAuto());
			this.climReclycleAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setClimReclycleAuto((Boolean) arg2);
				}
			});
		}
		return this.climReclycleAutoProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createClimReclycleAutoProperty(){
		return new SimpleBooleanProperty(getBean().isClimReclycleAuto());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimReclycleAuto(){
		return climReclycleAutoProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimReclycleAuto(boolean myClimReclycleAuto){
		this.climReclycleAutoProperty().set(myClimReclycleAuto);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimReclycleAuto(final Boolean myClimReclycleAuto) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimReclycleAuto(myClimReclycleAuto);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimReclycleAuto(myClimReclycleAuto);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimReclycleAutoAndWait(final Boolean myClimReclycleAuto) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimReclycleAuto(myClimReclycleAuto);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimReclycleAuto(myClimReclycleAuto);
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
	public BooleanProperty climVMCProperty(){
		if (this.climVMCProperty == null) {
			this.climVMCProperty = createClimVMCProperty();
			getBean().setClimVMC(getBean().isClimVMC());
			this.climVMCProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setClimVMC((Boolean) arg2);
				}
			});
		}
		return this.climVMCProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createClimVMCProperty(){
		return new SimpleBooleanProperty(getBean().isClimVMC());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimVMC(){
		return climVMCProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimVMC(boolean myClimVMC){
		this.climVMCProperty().set(myClimVMC);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimVMC(final Boolean myClimVMC) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimVMC(myClimVMC);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimVMC(myClimVMC);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimVMCAndWait(final Boolean myClimVMC) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimVMC(myClimVMC);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimVMC(myClimVMC);
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
	public BooleanProperty climVMCAutoProperty(){
		if (this.climVMCAutoProperty == null) {
			this.climVMCAutoProperty = createClimVMCAutoProperty();
			getBean().setClimVMCAuto(getBean().isClimVMCAuto());
			this.climVMCAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setClimVMCAuto((Boolean) arg2);
				}
			});
		}
		return this.climVMCAutoProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createClimVMCAutoProperty(){
		return new SimpleBooleanProperty(getBean().isClimVMCAuto());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimVMCAuto(){
		return climVMCAutoProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimVMCAuto(boolean myClimVMCAuto){
		this.climVMCAutoProperty().set(myClimVMCAuto);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimVMCAuto(final Boolean myClimVMCAuto) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimVMCAuto(myClimVMCAuto);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimVMCAuto(myClimVMCAuto);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimVMCAutoAndWait(final Boolean myClimVMCAuto) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimVMCAuto(myClimVMCAuto);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimVMCAuto(myClimVMCAuto);
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
	public BooleanProperty climWithNewAirProperty(){
		if (this.climWithNewAirProperty == null) {
			this.climWithNewAirProperty = createClimWithNewAirProperty();
			getBean().setClimWithNewAir(getBean().isClimWithNewAir());
			this.climWithNewAirProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setClimWithNewAir((Boolean) arg2);
				}
			});
		}
		return this.climWithNewAirProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createClimWithNewAirProperty(){
		return new SimpleBooleanProperty(getBean().isClimWithNewAir());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimWithNewAir(){
		return climWithNewAirProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimWithNewAir(boolean myClimWithNewAir){
		this.climWithNewAirProperty().set(myClimWithNewAir);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimWithNewAir(final Boolean myClimWithNewAir) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimWithNewAir(myClimWithNewAir);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimWithNewAir(myClimWithNewAir);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimWithNewAirAndWait(final Boolean myClimWithNewAir) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimWithNewAir(myClimWithNewAir);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimWithNewAir(myClimWithNewAir);
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
	public BooleanProperty climWithNewAirAutoProperty(){
		if (this.climWithNewAirAutoProperty == null) {
			this.climWithNewAirAutoProperty = createClimWithNewAirAutoProperty();
			getBean().setClimWithNewAirAuto(getBean().isClimWithNewAirAuto());
			this.climWithNewAirAutoProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setClimWithNewAirAuto((Boolean) arg2);
				}
			});
		}
		return this.climWithNewAirAutoProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createClimWithNewAirAutoProperty(){
		return new SimpleBooleanProperty(getBean().isClimWithNewAirAuto());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimWithNewAirAuto(){
		return climWithNewAirAutoProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimWithNewAirAuto(boolean myClimWithNewAirAuto){
		this.climWithNewAirAutoProperty().set(myClimWithNewAirAuto);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimWithNewAirAuto(final Boolean myClimWithNewAirAuto) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimWithNewAirAuto(myClimWithNewAirAuto);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimWithNewAirAuto(myClimWithNewAirAuto);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateClimWithNewAirAutoAndWait(final Boolean myClimWithNewAirAuto) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setClimWithNewAirAuto(myClimWithNewAirAuto);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setClimWithNewAirAuto(myClimWithNewAirAuto);
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
	public IntegerProperty droppedCeilingProperty(){
		if (this.droppedCeilingProperty == null) {
			this.droppedCeilingProperty = createDroppedCeilingProperty();
			getBean().setDroppedCeiling(getBean().getDroppedCeiling());
			this.droppedCeilingProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setDroppedCeiling((Integer) arg2);
				}
			});
		}
		return this.droppedCeilingProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createDroppedCeilingProperty(){
		return new SimpleIntegerProperty(getBean().getDroppedCeiling());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getDroppedCeiling(){
		return droppedCeilingProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedCeiling(int myDroppedCeiling){
		this.droppedCeilingProperty().set(myDroppedCeiling);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedCeiling(final Integer myDroppedCeiling) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedCeiling(myDroppedCeiling);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedCeiling(myDroppedCeiling);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedCeilingAndWait(final Integer myDroppedCeiling) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedCeiling(myDroppedCeiling);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedCeiling(myDroppedCeiling);
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
	public IntegerProperty droppedFloorProperty(){
		if (this.droppedFloorProperty == null) {
			this.droppedFloorProperty = createDroppedFloorProperty();
			getBean().setDroppedFloor(getBean().getDroppedFloor());
			this.droppedFloorProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setDroppedFloor((Integer) arg2);
				}
			});
		}
		return this.droppedFloorProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createDroppedFloorProperty(){
		return new SimpleIntegerProperty(getBean().getDroppedFloor());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getDroppedFloor(){
		return droppedFloorProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedFloor(int myDroppedFloor){
		this.droppedFloorProperty().set(myDroppedFloor);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedFloor(final Integer myDroppedFloor) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedFloor(myDroppedFloor);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedFloor(myDroppedFloor);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedFloorAndWait(final Integer myDroppedFloor) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedFloor(myDroppedFloor);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedFloor(myDroppedFloor);
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
	public IntegerProperty indicatedVolumeProperty(){
		if (this.indicatedVolumeProperty == null) {
			this.indicatedVolumeProperty = createIndicatedVolumeProperty();
			getBean().setIndicatedVolume(getBean().getIndicatedVolume());
			this.indicatedVolumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setIndicatedVolume((Integer) arg2);
				}
			});
		}
		return this.indicatedVolumeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createIndicatedVolumeProperty(){
		return new SimpleIntegerProperty(getBean().getIndicatedVolume());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getIndicatedVolume(){
		return indicatedVolumeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setIndicatedVolume(int myIndicatedVolume){
		this.indicatedVolumeProperty().set(myIndicatedVolume);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIndicatedVolume(final Integer myIndicatedVolume) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIndicatedVolume(myIndicatedVolume);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIndicatedVolume(myIndicatedVolume);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIndicatedVolumeAndWait(final Integer myIndicatedVolume) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIndicatedVolume(myIndicatedVolume);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIndicatedVolume(myIndicatedVolume);
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
	public IntegerProperty mainHeightProperty(){
		if (this.mainHeightProperty == null) {
			this.mainHeightProperty = createMainHeightProperty();
			getBean().setMainHeight(getBean().getMainHeight());
			this.mainHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setMainHeight((Integer) arg2);
				}
			});
		}
		return this.mainHeightProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createMainHeightProperty(){
		return new SimpleIntegerProperty(getBean().getMainHeight());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getMainHeight(){
		return mainHeightProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMainHeight(int myMainHeight){
		this.mainHeightProperty().set(myMainHeight);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMainHeight(final Integer myMainHeight) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMainHeight(myMainHeight);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMainHeight(myMainHeight);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMainHeightAndWait(final Integer myMainHeight) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMainHeight(myMainHeight);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMainHeight(myMainHeight);
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
	public IntegerProperty measuredVolumeProperty(){
		if (this.measuredVolumeProperty == null) {
			this.measuredVolumeProperty = createMeasuredVolumeProperty();
			getBean().setMeasuredVolume(getBean().getMeasuredVolume());
			this.measuredVolumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setMeasuredVolume((Integer) arg2);
				}
			});
		}
		return this.measuredVolumeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createMeasuredVolumeProperty(){
		return new SimpleIntegerProperty(getBean().getMeasuredVolume());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getMeasuredVolume(){
		return measuredVolumeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredVolume(int myMeasuredVolume){
		this.measuredVolumeProperty().set(myMeasuredVolume);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredVolume(final Integer myMeasuredVolume) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMeasuredVolume(myMeasuredVolume);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMeasuredVolume(myMeasuredVolume);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMeasuredVolumeAndWait(final Integer myMeasuredVolume) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMeasuredVolume(myMeasuredVolume);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMeasuredVolume(myMeasuredVolume);
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
	public IntegerProperty mecanicalStrengthProperty(){
		if (this.mecanicalStrengthProperty == null) {
			this.mecanicalStrengthProperty = createMecanicalStrengthProperty();
			getBean().setMecanicalStrength(getBean().getMecanicalStrength());
			this.mecanicalStrengthProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setMecanicalStrength((Integer) arg2);
				}
			});
		}
		return this.mecanicalStrengthProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createMecanicalStrengthProperty(){
		return new SimpleIntegerProperty(getBean().getMecanicalStrength());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getMecanicalStrength(){
		return mecanicalStrengthProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMecanicalStrength(int myMecanicalStrength){
		this.mecanicalStrengthProperty().set(myMecanicalStrength);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMecanicalStrength(final Integer myMecanicalStrength) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMecanicalStrength(myMecanicalStrength);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMecanicalStrength(myMecanicalStrength);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMecanicalStrengthAndWait(final Integer myMecanicalStrength) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMecanicalStrength(myMecanicalStrength);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMecanicalStrength(myMecanicalStrength);
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
	public IntegerProperty minimalProtectedHeightProperty(){
		if (this.minimalProtectedHeightProperty == null) {
			this.minimalProtectedHeightProperty = createMinimalProtectedHeightProperty();
			getBean().setMinimalProtectedHeight(getBean().getMinimalProtectedHeight());
			this.minimalProtectedHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setMinimalProtectedHeight((Integer) arg2);
				}
			});
		}
		return this.minimalProtectedHeightProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createMinimalProtectedHeightProperty(){
		return new SimpleIntegerProperty(getBean().getMinimalProtectedHeight());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getMinimalProtectedHeight(){
		return minimalProtectedHeightProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMinimalProtectedHeight(int myMinimalProtectedHeight){
		this.minimalProtectedHeightProperty().set(myMinimalProtectedHeight);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMinimalProtectedHeight(final Integer myMinimalProtectedHeight) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMinimalProtectedHeight(myMinimalProtectedHeight);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMinimalProtectedHeight(myMinimalProtectedHeight);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateMinimalProtectedHeightAndWait(final Integer myMinimalProtectedHeight) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setMinimalProtectedHeight(myMinimalProtectedHeight);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setMinimalProtectedHeight(myMinimalProtectedHeight);
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
	public IntegerProperty netVolumeProperty(){
		if (this.netVolumeProperty == null) {
			this.netVolumeProperty = createNetVolumeProperty();
			getBean().setNetVolume(getBean().getNetVolume());
			this.netVolumeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setNetVolume((Integer) arg2);
				}
			});
		}
		return this.netVolumeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createNetVolumeProperty(){
		return new SimpleIntegerProperty(getBean().getNetVolume());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getNetVolume(){
		return netVolumeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setNetVolume(int myNetVolume){
		this.netVolumeProperty().set(myNetVolume);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNetVolume(final Integer myNetVolume) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNetVolume(myNetVolume);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNetVolume(myNetVolume);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNetVolumeAndWait(final Integer myNetVolume) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNetVolume(myNetVolume);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNetVolume(myNetVolume);
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
	public IntegerProperty risqueHeightProperty(){
		if (this.risqueHeightProperty == null) {
			this.risqueHeightProperty = createRisqueHeightProperty();
			getBean().setRisqueHeight(getBean().getRisqueHeight());
			this.risqueHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setRisqueHeight((Integer) arg2);
				}
			});
		}
		return this.risqueHeightProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createRisqueHeightProperty(){
		return new SimpleIntegerProperty(getBean().getRisqueHeight());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getRisqueHeight(){
		return risqueHeightProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisqueHeight(int myRisqueHeight){
		this.risqueHeightProperty().set(myRisqueHeight);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeight(final Integer myRisqueHeight) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeight(myRisqueHeight);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeight(myRisqueHeight);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightAndWait(final Integer myRisqueHeight) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeight(myRisqueHeight);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeight(myRisqueHeight);
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
	public DoubleProperty risqueHeightPercentMaxProperty(){
		if (this.risqueHeightPercentMaxProperty == null) {
			this.risqueHeightPercentMaxProperty = createRisqueHeightPercentMaxProperty();
			getBean().setRisqueHeightPercentMax(getBean().getRisqueHeightPercentMax());
			this.risqueHeightPercentMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setRisqueHeightPercentMax((Double) arg2);
				}
			});
		}
		return this.risqueHeightPercentMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createRisqueHeightPercentMaxProperty(){
		return new SimpleDoubleProperty(getBean().getRisqueHeightPercentMax());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRisqueHeightPercentMax(){
		return risqueHeightPercentMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisqueHeightPercentMax(double myRisqueHeightPercentMax){
		this.risqueHeightPercentMaxProperty().set(myRisqueHeightPercentMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightPercentMax(final Double myRisqueHeightPercentMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeightPercentMax(myRisqueHeightPercentMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeightPercentMax(myRisqueHeightPercentMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightPercentMaxAndWait(final Double myRisqueHeightPercentMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeightPercentMax(myRisqueHeightPercentMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeightPercentMax(myRisqueHeightPercentMax);
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
	public DoubleProperty risqueHeightPercentMinProperty(){
		if (this.risqueHeightPercentMinProperty == null) {
			this.risqueHeightPercentMinProperty = createRisqueHeightPercentMinProperty();
			getBean().setRisqueHeightPercentMin(getBean().getRisqueHeightPercentMin());
			this.risqueHeightPercentMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setRisqueHeightPercentMin((Double) arg2);
				}
			});
		}
		return this.risqueHeightPercentMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createRisqueHeightPercentMinProperty(){
		return new SimpleDoubleProperty(getBean().getRisqueHeightPercentMin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRisqueHeightPercentMin(){
		return risqueHeightPercentMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisqueHeightPercentMin(double myRisqueHeightPercentMin){
		this.risqueHeightPercentMinProperty().set(myRisqueHeightPercentMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightPercentMin(final Double myRisqueHeightPercentMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeightPercentMin(myRisqueHeightPercentMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeightPercentMin(myRisqueHeightPercentMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightPercentMinAndWait(final Double myRisqueHeightPercentMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeightPercentMin(myRisqueHeightPercentMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeightPercentMin(myRisqueHeightPercentMin);
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
	public IntegerProperty totalHeightProperty(){
		if (this.totalHeightProperty == null) {
			this.totalHeightProperty = createTotalHeightProperty();
			getBean().setTotalHeight(getBean().getTotalHeight());
			this.totalHeightProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setTotalHeight((Integer) arg2);
				}
			});
		}
		return this.totalHeightProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createTotalHeightProperty(){
		return new SimpleIntegerProperty(getBean().getTotalHeight());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getTotalHeight(){
		return totalHeightProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTotalHeight(int myTotalHeight){
		this.totalHeightProperty().set(myTotalHeight);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTotalHeight(final Integer myTotalHeight) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTotalHeight(myTotalHeight);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTotalHeight(myTotalHeight);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTotalHeightAndWait(final Integer myTotalHeight) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTotalHeight(myTotalHeight);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTotalHeight(myTotalHeight);
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
	public BooleanProperty uniformHorizontalityProperty(){
		if (this.uniformHorizontalityProperty == null) {
			this.uniformHorizontalityProperty = createUniformHorizontalityProperty();
			getBean().setUniformHorizontality(getBean().isUniformHorizontality());
			this.uniformHorizontalityProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setUniformHorizontality((Boolean) arg2);
				}
			});
		}
		return this.uniformHorizontalityProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createUniformHorizontalityProperty(){
		return new SimpleBooleanProperty(getBean().isUniformHorizontality());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isUniformHorizontality(){
		return uniformHorizontalityProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUniformHorizontality(boolean myUniformHorizontality){
		this.uniformHorizontalityProperty().set(myUniformHorizontality);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUniformHorizontality(final Boolean myUniformHorizontality) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUniformHorizontality(myUniformHorizontality);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUniformHorizontality(myUniformHorizontality);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUniformHorizontalityAndWait(final Boolean myUniformHorizontality) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUniformHorizontality(myUniformHorizontality);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUniformHorizontality(myUniformHorizontality);
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
	public IntegerProperty unloadTimeProperty(){
		if (this.unloadTimeProperty == null) {
			this.unloadTimeProperty = createUnloadTimeProperty();
			getBean().setUnloadTime(getBean().getUnloadTime());
			this.unloadTimeProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setUnloadTime((Integer) arg2);
				}
			});
		}
		return this.unloadTimeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createUnloadTimeProperty(){
		return new SimpleIntegerProperty(getBean().getUnloadTime());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getUnloadTime(){
		return unloadTimeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUnloadTime(int myUnloadTime){
		this.unloadTimeProperty().set(myUnloadTime);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUnloadTime(final Integer myUnloadTime) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUnloadTime(myUnloadTime);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUnloadTime(myUnloadTime);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUnloadTimeAndWait(final Integer myUnloadTime) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUnloadTime(myUnloadTime);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUnloadTime(myUnloadTime);
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
	public IntegerProperty volumeCorrectionProperty(){
		if (this.volumeCorrectionProperty == null) {
			this.volumeCorrectionProperty = createVolumeCorrectionProperty();
			getBean().setVolumeCorrection(getBean().getVolumeCorrection());
			this.volumeCorrectionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setVolumeCorrection((Integer) arg2);
				}
			});
		}
		return this.volumeCorrectionProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createVolumeCorrectionProperty(){
		return new SimpleIntegerProperty(getBean().getVolumeCorrection());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getVolumeCorrection(){
		return volumeCorrectionProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setVolumeCorrection(int myVolumeCorrection){
		this.volumeCorrectionProperty().set(myVolumeCorrection);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVolumeCorrection(final Integer myVolumeCorrection) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVolumeCorrection(myVolumeCorrection);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVolumeCorrection(myVolumeCorrection);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVolumeCorrectionAndWait(final Integer myVolumeCorrection) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setVolumeCorrection(myVolumeCorrection);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setVolumeCorrection(myVolumeCorrection);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

}
