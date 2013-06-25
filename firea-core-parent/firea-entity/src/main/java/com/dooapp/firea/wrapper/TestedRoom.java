package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.TestedRoomBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.beans.property.ReadOnlyObjectProperty;
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
import com.dooapp.firea.entity.BlowHoleBean;




import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Attribute;
import org.jdom2.Element;

import com.dooapp.lib.common.entity.BeanClass;

import com.dooapp.firea.visitor.FireaVisitor;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@BeanClass(TestedRoomBean.class)
public class TestedRoom
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
	private ObjectProperty<java.util.Date> commissioningDateProperty;
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
	private ObjectProperty<ObservableList<BlowHole>> blowholesProperty;
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
	private ObjectProperty<java.util.Date> creationDateProperty;
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
	private LongProperty idProperty;
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
	private ObjectProperty<Project> projectProperty;
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
	private DoubleProperty risqueHeightPercentProperty;
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
	private ObjectProperty<java.util.Date> updateDateProperty;
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
	private final TestedRoomBean testedRoom;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoom(TestedRoomBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.testedRoom = entity;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoomBean getBean() {
		return  this.testedRoom;
	}

	/*
	 * Generated getters and setters
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<java.util.Date> commissioningDateProperty() {
		if (commissioningDateProperty == null) {
			commissioningDateProperty = createCommissioningDateProperty();
			getBean().setCommissioningDate(getBean().getCommissioningDate());
			commissioningDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setCommissioningDate(arg2);
				}
			});
		}
		return commissioningDateProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<java.util.Date> createCommissioningDateProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getCommissioningDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCommissioningDate(){
		return commissioningDateProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCommissioningDate(java.util.Date myCommissioningDate){
		if (commissioningDateProperty == null) {
				getBean().setCommissioningDate(myCommissioningDate);
			} else {
				this.commissioningDateProperty().set(myCommissioningDate);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCommissioningDate(final java.util.Date myCommissioningDate) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCommissioningDate(myCommissioningDate);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCommissioningDate(myCommissioningDate);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCommissioningDateAndWait(final java.util.Date myCommissioningDate) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCommissioningDate(myCommissioningDate);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCommissioningDate(myCommissioningDate);
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
	public ReadOnlyObjectProperty<ObservableList<BlowHole>> blowholesProperty() {
		if (blowholesProperty == null) {
			blowholesProperty = createBlowholes();
			blowholesProperty.get().addListener(new javafx.collections.ListChangeListener<BlowHole>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends BlowHole> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (BlowHole tmp : change.getAddedSubList()) {
								getBean().addBlowholes(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (BlowHole tmp : change.getRemoved()) {
								getBean().getBlowholes().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
		}
		return blowholesProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<ObservableList<BlowHole>> createBlowholes()
	{ 
		ObjectProperty<ObservableList<BlowHole>> list = new SimpleObjectProperty<ObservableList<BlowHole>>(
					FXCollections.<BlowHole> observableArrayList());
		for (BlowHoleBean tmp : getBean().getBlowholes()) {
			list.get().add(tmp.getWrapper());
		}
		return list; 
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObservableList<BlowHole> getBlowholes()
	{ 
		return blowholesProperty().get(); 
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
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = createCreationDateProperty();
			getBean().setCreationDate(getBean().getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setCreationDate(arg2);
				}
			});
		}
		return creationDateProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<java.util.Date> createCreationDateProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getCreationDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCreationDate(){
		return creationDateProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCreationDate(java.util.Date myCreationDate){
		if (creationDateProperty == null) {
				getBean().setCreationDate(myCreationDate);
			} else {
				this.creationDateProperty().set(myCreationDate);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDate(final java.util.Date myCreationDate) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDate(myCreationDate);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDate(myCreationDate);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateAndWait(final java.util.Date myCreationDate) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDate(myCreationDate);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDate(myCreationDate);
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
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = createIdProperty();
			getBean().setId(getBean().getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setId((Long) arg2);
				}
			});
		}
		return this.idProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected LongProperty createIdProperty(){
		return new SimpleLongProperty(getBean().getId());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public long getId(){
		return idProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setId(long myId){
		this.idProperty().set(myId);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateId(final Long myId) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setId(myId);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setId(myId);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIdAndWait(final Long myId) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setId(myId);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setId(myId);
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
	public ObjectProperty<Project> projectProperty() {
		if (projectProperty == null) {
			projectProperty = createProjectProperty();
			getBean().setProject(getBean().getProject() == null ? null : getBean()
							.getProject());
			projectProperty.addListener(new ChangeListener<Project>() {
				@Override
				public void changed(ObservableValue<? extends Project> obj, Project oldValue, Project newValue) {
					getBean().setProject(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return projectProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<Project> createProjectProperty(){
		return new SimpleObjectProperty<Project>(getBean().getProject() == null ? null : getBean()
							.getProject().getWrapper());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Project getProject(){
		return projectProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setProject(Project myProject){
		if (projectProperty == null) {
				getBean().setProject(myProject == null ? null : myProject.getBean());
			} else {
				this.projectProperty().set(myProject);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateProject(final Project myProject) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setProject(myProject);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setProject(myProject);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateProjectAndWait(final Project myProject) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setProject(myProject);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setProject(myProject);
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
	public DoubleProperty risqueHeightPercentProperty(){
		if (this.risqueHeightPercentProperty == null) {
			this.risqueHeightPercentProperty = createRisqueHeightPercentProperty();
			getBean().setRisqueHeightPercent(getBean().getRisqueHeightPercent());
			this.risqueHeightPercentProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setRisqueHeightPercent((Double) arg2);
				}
			});
		}
		return this.risqueHeightPercentProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createRisqueHeightPercentProperty(){
		return new SimpleDoubleProperty(getBean().getRisqueHeightPercent());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRisqueHeightPercent(){
		return risqueHeightPercentProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisqueHeightPercent(double myRisqueHeightPercent){
		this.risqueHeightPercentProperty().set(myRisqueHeightPercent);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightPercent(final Double myRisqueHeightPercent) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeightPercent(myRisqueHeightPercent);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeightPercent(myRisqueHeightPercent);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRisqueHeightPercentAndWait(final Double myRisqueHeightPercent) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRisqueHeightPercent(myRisqueHeightPercent);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRisqueHeightPercent(myRisqueHeightPercent);
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
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = createUpdateDateProperty();
			getBean().setUpdateDate(getBean().getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setUpdateDate(arg2);
				}
			});
		}
		return updateDateProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<java.util.Date> createUpdateDateProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getUpdateDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getUpdateDate(){
		return updateDateProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUpdateDate(java.util.Date myUpdateDate){
		if (updateDateProperty == null) {
				getBean().setUpdateDate(myUpdateDate);
			} else {
				this.updateDateProperty().set(myUpdateDate);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDate(final java.util.Date myUpdateDate) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDate(myUpdateDate);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDate(myUpdateDate);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateAndWait(final java.util.Date myUpdateDate) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDate(myUpdateDate);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDate(myUpdateDate);
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


	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getBean() != null ? serializer.outputString(this.toDomXML()) : "";
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Element toDomXML(){
		Element xmlElement = new Element("TestedRoom");
		if (this.getBean().getUUID() != null)
			xmlElement.setAttribute(new Attribute("uuid", this.getBean().getUUID()));
		if (getCommissioningDate() != null)
			xmlElement.setAttribute(new Attribute("CommissioningDate", getCommissioningDate().toString()));
		xmlElement.setAttribute(new Attribute("altitude", String.valueOf(getAltitude())));
		xmlElement.setAttribute(new Attribute("choosenProtectedHeight", String.valueOf(getChoosenProtectedHeight())));
		xmlElement.setAttribute(new Attribute("clapetsCF", String.valueOf(isClapetsCF())));
		xmlElement.setAttribute(new Attribute("climDuct", String.valueOf(isClimDuct())));
		xmlElement.setAttribute(new Attribute("climReclycle", String.valueOf(isClimReclycle())));
		xmlElement.setAttribute(new Attribute("climReclycleAuto", String.valueOf(isClimReclycleAuto())));
		xmlElement.setAttribute(new Attribute("climVMC", String.valueOf(isClimVMC())));
		xmlElement.setAttribute(new Attribute("climVMCAuto", String.valueOf(isClimVMCAuto())));
		xmlElement.setAttribute(new Attribute("climWithNewAir", String.valueOf(isClimWithNewAir())));
		xmlElement.setAttribute(new Attribute("climWithNewAirAuto", String.valueOf(isClimWithNewAirAuto())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		xmlElement.setAttribute(new Attribute("droppedCeiling", String.valueOf(getDroppedCeiling())));
		xmlElement.setAttribute(new Attribute("droppedFloor", String.valueOf(getDroppedFloor())));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		xmlElement.setAttribute(new Attribute("indicatedVolume", String.valueOf(getIndicatedVolume())));
		xmlElement.setAttribute(new Attribute("mainHeight", String.valueOf(getMainHeight())));
		xmlElement.setAttribute(new Attribute("measuredVolume", String.valueOf(getMeasuredVolume())));
		xmlElement.setAttribute(new Attribute("mecanicalStrength", String.valueOf(getMecanicalStrength())));
		xmlElement.setAttribute(new Attribute("minimalProtectedHeight", String.valueOf(getMinimalProtectedHeight())));
		if (getName() != null)
			xmlElement.setAttribute(new Attribute("name", getName()));
		xmlElement.setAttribute(new Attribute("netVolume", String.valueOf(getNetVolume())));
		xmlElement.setAttribute(new Attribute("risqueHeight", String.valueOf(getRisqueHeight())));
		xmlElement.setAttribute(new Attribute("risqueHeightPercent", String.valueOf(getRisqueHeightPercent())));
		xmlElement.setAttribute(new Attribute("totalHeight", String.valueOf(getTotalHeight())));
		xmlElement.setAttribute(new Attribute("uniformHorizontality", String.valueOf(isUniformHorizontality())));
		xmlElement.setAttribute(new Attribute("unloadTime", String.valueOf(getUnloadTime())));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		xmlElement.setAttribute(new Attribute("volumeCorrection", String.valueOf(getVolumeCorrection())));
		
		if (!getBlowholes().isEmpty()) {
			Element blowholes = new Element("blowholes");
			for (BlowHole tmp : getBlowholes())
				blowholes.addContent(tmp.toDomXML());
			xmlElement.addContent(blowholes);
		}
		if (getProject() != null)
			xmlElement.setAttribute("project", String.valueOf(getProject().getId()));
		
		
		// For custom purposes
		xmlElement = this.customDomXML(xmlElement);
		
		return xmlElement;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Element customDomXML(Element e) {
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public void accept(FireaVisitor visitor) {
		visitor.visitBeforeTestedRoom(this);
		
		this.visitInternal(visitor);
		
		visitor.visitAfterTestedRoom(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	protected void visitInternal(FireaVisitor visitor)
	{
		
		for (BlowHole tmp : this.getBlowholes())
			tmp.accept(visitor);
		
	}

}
