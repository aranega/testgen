package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.ReadingBean;

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
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.BooleanProperty;
import com.dooapp.firea.entity.DeviceBean;




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
@BeanClass(ReadingBean.class)
public class Reading
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
	private DoubleProperty buildingPressureProperty;
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
	private ObjectProperty<ObservableList<Device>> deviceProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty fanPressureProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<GaugeMode> gaugemodeProperty;
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
	private BooleanProperty lowFlowProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Point> pointProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private IntegerProperty timeAverageProperty;
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
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private final ReadingBean reading;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Reading(ReadingBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.reading = entity;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ReadingBean getBean() {
		return  this.reading;
	}

	/*
	 * Generated getters and setters
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty buildingPressureProperty(){
		if (this.buildingPressureProperty == null) {
			this.buildingPressureProperty = createBuildingPressureProperty();
			getBean().setBuildingPressure(getBean().getBuildingPressure());
			this.buildingPressureProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setBuildingPressure((Double) arg2);
				}
			});
		}
		return this.buildingPressureProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createBuildingPressureProperty(){
		return new SimpleDoubleProperty(getBean().getBuildingPressure());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getBuildingPressure(){
		return buildingPressureProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setBuildingPressure(double myBuildingPressure){
		this.buildingPressureProperty().set(myBuildingPressure);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateBuildingPressure(final Double myBuildingPressure) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBuildingPressure(myBuildingPressure);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBuildingPressure(myBuildingPressure);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateBuildingPressureAndWait(final Double myBuildingPressure) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBuildingPressure(myBuildingPressure);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBuildingPressure(myBuildingPressure);
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
	public ReadOnlyObjectProperty<ObservableList<Device>> deviceProperty() {
		if (deviceProperty == null) {
			deviceProperty = createDevice();
			deviceProperty.get().addListener(new javafx.collections.ListChangeListener<Device>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Device> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (Device tmp : change.getAddedSubList()) {
								getBean().addDevice(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (Device tmp : change.getRemoved()) {
								getBean().getDevice().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
		}
		return deviceProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<ObservableList<Device>> createDevice()
	{ 
		ObjectProperty<ObservableList<Device>> list = new SimpleObjectProperty<ObservableList<Device>>(
					FXCollections.<Device> observableArrayList());
		for (DeviceBean tmp : getBean().getDevice()) {
			list.get().add(tmp.getWrapper());
		}
		return list; 
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObservableList<Device> getDevice()
	{ 
		return deviceProperty().get(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty fanPressureProperty(){
		if (this.fanPressureProperty == null) {
			this.fanPressureProperty = createFanPressureProperty();
			getBean().setFanPressure(getBean().getFanPressure());
			this.fanPressureProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setFanPressure((Double) arg2);
				}
			});
		}
		return this.fanPressureProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createFanPressureProperty(){
		return new SimpleDoubleProperty(getBean().getFanPressure());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getFanPressure(){
		return fanPressureProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setFanPressure(double myFanPressure){
		this.fanPressureProperty().set(myFanPressure);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFanPressure(final Double myFanPressure) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFanPressure(myFanPressure);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFanPressure(myFanPressure);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateFanPressureAndWait(final Double myFanPressure) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFanPressure(myFanPressure);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFanPressure(myFanPressure);
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
	public ObjectProperty<GaugeMode> gaugemodeProperty() {
		if (gaugemodeProperty == null) {
			gaugemodeProperty = createGaugemodeProperty();
			getBean().setGaugemode(getBean().getGaugemode() == null ? null : getBean()
							.getGaugemode());
			gaugemodeProperty.addListener(new ChangeListener<GaugeMode>() {
				@Override
				public void changed(ObservableValue<? extends GaugeMode> obj, GaugeMode oldValue, GaugeMode newValue) {
					getBean().setGaugemode(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return gaugemodeProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<GaugeMode> createGaugemodeProperty(){
		return new SimpleObjectProperty<GaugeMode>(getBean().getGaugemode() == null ? null : getBean()
							.getGaugemode().getWrapper());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GaugeMode getGaugemode(){
		return gaugemodeProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setGaugemode(GaugeMode myGaugemode){
		if (gaugemodeProperty == null) {
				getBean().setGaugemode(myGaugemode == null ? null : myGaugemode.getBean());
			} else {
				this.gaugemodeProperty().set(myGaugemode);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateGaugemode(final GaugeMode myGaugemode) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setGaugemode(myGaugemode);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setGaugemode(myGaugemode);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateGaugemodeAndWait(final GaugeMode myGaugemode) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setGaugemode(myGaugemode);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setGaugemode(myGaugemode);
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
	public BooleanProperty lowFlowProperty(){
		if (this.lowFlowProperty == null) {
			this.lowFlowProperty = createLowFlowProperty();
			getBean().setLowFlow(getBean().isLowFlow());
			this.lowFlowProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setLowFlow((Boolean) arg2);
				}
			});
		}
		return this.lowFlowProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BooleanProperty createLowFlowProperty(){
		return new SimpleBooleanProperty(getBean().isLowFlow());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isLowFlow(){
		return lowFlowProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLowFlow(boolean myLowFlow){
		this.lowFlowProperty().set(myLowFlow);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLowFlow(final Boolean myLowFlow) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLowFlow(myLowFlow);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLowFlow(myLowFlow);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLowFlowAndWait(final Boolean myLowFlow) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLowFlow(myLowFlow);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLowFlow(myLowFlow);
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
	public ObjectProperty<Point> pointProperty() {
		if (pointProperty == null) {
			pointProperty = createPointProperty();
			getBean().setPoint(getBean().getPoint() == null ? null : getBean()
							.getPoint());
			pointProperty.addListener(new ChangeListener<Point>() {
				@Override
				public void changed(ObservableValue<? extends Point> obj, Point oldValue, Point newValue) {
					getBean().setPoint(newValue == null ? null : newValue.getBean());
				}
			});
		}
		return pointProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<Point> createPointProperty(){
		return new SimpleObjectProperty<Point>(getBean().getPoint() == null ? null : getBean()
							.getPoint().getWrapper());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Point getPoint(){
		return pointProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPoint(Point myPoint){
		if (pointProperty == null) {
				getBean().setPoint(myPoint == null ? null : myPoint.getBean());
			} else {
				this.pointProperty().set(myPoint);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePoint(final Point myPoint) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPoint(myPoint);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPoint(myPoint);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePointAndWait(final Point myPoint) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPoint(myPoint);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPoint(myPoint);
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
	public IntegerProperty timeAverageProperty(){
		if (this.timeAverageProperty == null) {
			this.timeAverageProperty = createTimeAverageProperty();
			getBean().setTimeAverage(getBean().getTimeAverage());
			this.timeAverageProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setTimeAverage((Integer) arg2);
				}
			});
		}
		return this.timeAverageProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected IntegerProperty createTimeAverageProperty(){
		return new SimpleIntegerProperty(getBean().getTimeAverage());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getTimeAverage(){
		return timeAverageProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTimeAverage(int myTimeAverage){
		this.timeAverageProperty().set(myTimeAverage);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTimeAverage(final Integer myTimeAverage) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTimeAverage(myTimeAverage);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTimeAverage(myTimeAverage);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTimeAverageAndWait(final Integer myTimeAverage) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTimeAverage(myTimeAverage);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTimeAverage(myTimeAverage);
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
		Element xmlElement = new Element("Reading");
		if (this.getBean().getUUID() != null)
			xmlElement.setAttribute(new Attribute("uuid", this.getBean().getUUID()));
		xmlElement.setAttribute(new Attribute("buildingPressure", String.valueOf(getBuildingPressure())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		xmlElement.setAttribute(new Attribute("fanPressure", String.valueOf(getFanPressure())));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		xmlElement.setAttribute(new Attribute("lowFlow", String.valueOf(isLowFlow())));
		xmlElement.setAttribute(new Attribute("timeAverage", String.valueOf(getTimeAverage())));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		
		if (!getDevice().isEmpty()) {
			Element device = new Element("device");
			for (Device tmp : getDevice())
				device.addContent(new Element("Device", String.valueOf(tmp.getId())));
			xmlElement.addContent(device);
		}
		if (getGaugemode() != null)
			xmlElement.setAttribute("gaugemode", String.valueOf(getGaugemode().getId()));
		if (getPoint() != null)
			xmlElement.setAttribute("point", String.valueOf(getPoint().getId()));
		
		
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
		visitor.visitBeforeReading(this);
		
		this.visitInternal(visitor);
		
		visitor.visitAfterReading(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	protected void visitInternal(FireaVisitor visitor)
	{
		
		
	}

}
