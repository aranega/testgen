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
//Start of user code for imports
// TODO: import me!
//End of user code




public class Reading implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private DoubleProperty buildingPressureProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private ObjectProperty<ObservableList<Device>> deviceProperty;
	
	private DoubleProperty fanPressureProperty;
	
	private ObjectProperty<GaugeMode> gaugemodeProperty;
	
	private LongProperty idProperty;
	
	private BooleanProperty lowFlowProperty;
	
	private ObjectProperty<Point> pointProperty;
	
	private IntegerProperty timeAverageProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final ReadingBean reading;

	/*
	 * Constructors 
	 */
	public Reading(){
		this(new ReadingBean());	
	}
	
	
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
	
	public ReadingBean getReadingBean(){
		return this.reading;
	}
	
	public ReadingBean getBean() {
		return  this.reading;
	}
	

	/*
	 * Generated getters and setters
	 */
	public DoubleProperty buildingPressureProperty(){
		if (this.buildingPressureProperty == null) {
			this.buildingPressureProperty = new SimpleDoubleProperty(reading.getBuildingPressure());
			this.buildingPressureProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					reading.setBuildingPressure((Double) arg2);
				}
			});
			//Start of user code buildingPressureproperty method
			//End of user code
		}
		return this.buildingPressureProperty;
	}
	
	public double getBuildingPressure(){
		return buildingPressureProperty().get();
	} 
	
	public void setBuildingPressure(double myBuildingPressure){
		this.buildingPressureProperty().set(myBuildingPressure);
	}
	
	public void updateBuildingPressure(final double myBuildingPressure, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBuildingPressure(myBuildingPressure);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBuildingPressure(myBuildingPressure);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateBuildingPressure(final double myBuildingPressure) {
		updateBuildingPressure(myBuildingPressure, null);
	}

	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(reading.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					reading.setCreationDate(arg2);
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
				reading.setCreationDate(myCreationDate);
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

	public ReadOnlyObjectProperty<ObservableList<Device>> deviceProperty() {
		if (deviceProperty == null) {
			deviceProperty = new SimpleObjectProperty<ObservableList<Device>>(
					FXCollections.<Device> observableArrayList());
			for (DeviceBean b : reading.getDevice()) {
				deviceProperty.get().add(b.getWrapper());
			}
			deviceProperty.get().addListener(new javafx.collections.ListChangeListener<Device>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Device> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (Device tmp : change.getAddedSubList()) {
								reading.addDevice(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (Device tmp : change.getRemoved()) {
								reading.getDevice().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
			//Start of user code deviceproperty method
			//End of user code
		}
		return deviceProperty;
	}
	
	public ObservableList<Device> getDevice()
	{ 
		return deviceProperty().get(); 
	}

	public DoubleProperty fanPressureProperty(){
		if (this.fanPressureProperty == null) {
			this.fanPressureProperty = new SimpleDoubleProperty(reading.getFanPressure());
			this.fanPressureProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					reading.setFanPressure((Double) arg2);
				}
			});
			//Start of user code fanPressureproperty method
			//End of user code
		}
		return this.fanPressureProperty;
	}
	
	public double getFanPressure(){
		return fanPressureProperty().get();
	} 
	
	public void setFanPressure(double myFanPressure){
		this.fanPressureProperty().set(myFanPressure);
	}
	
	public void updateFanPressure(final double myFanPressure, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFanPressure(myFanPressure);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFanPressure(myFanPressure);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateFanPressure(final double myFanPressure) {
		updateFanPressure(myFanPressure, null);
	}

	public ObjectProperty<GaugeMode> gaugemodeProperty() {
		if (gaugemodeProperty == null) {
			gaugemodeProperty = new SimpleObjectProperty<GaugeMode>(reading.getGaugemode() == null ? null : reading
					.getGaugemode().getWrapper());
			gaugemodeProperty.addListener(new ChangeListener<GaugeMode>() {
				@Override
				public void changed(ObservableValue<? extends GaugeMode> obj, GaugeMode oldValue, GaugeMode newValue) {
					reading.setGaugemode(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code gaugemodeproperty method
			//End of user code
		}
		return gaugemodeProperty;
	}
	
	public GaugeMode getGaugemode(){
		return gaugemodeProperty().get();
	} 
	
	public void setGaugemode(GaugeMode myGaugemode){
		if (gaugemodeProperty == null) {
				reading.setGaugemode(myGaugemode == null ? null : myGaugemode.getBean());
			} else {
				this.gaugemodeProperty().set(myGaugemode);
			}
	}
	
	public void updateGaugemode(final GaugeMode myGaugemode, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setGaugemode(myGaugemode);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setGaugemode(myGaugemode);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateGaugemode(final GaugeMode myGaugemode) {
		updateGaugemode(myGaugemode, null);
	}

	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(reading.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					reading.setId((Long) arg2);
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

	public BooleanProperty lowFlowProperty(){
		if (this.lowFlowProperty == null) {
			this.lowFlowProperty = new SimpleBooleanProperty(reading.isLowFlow());
			this.lowFlowProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					reading.setLowFlow((Boolean) arg2);
				}
			});
			//Start of user code lowFlowproperty method
			//End of user code
		}
		return this.lowFlowProperty;
	}
	
	public boolean isLowFlow(){
		return lowFlowProperty().get();
	} 
	
	public void setLowFlow(boolean myLowFlow){
		this.lowFlowProperty().set(myLowFlow);
	}
	
	public void updateLowFlow(final boolean myLowFlow, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLowFlow(myLowFlow);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLowFlow(myLowFlow);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateLowFlow(final boolean myLowFlow) {
		updateLowFlow(myLowFlow, null);
	}

	public ObjectProperty<Point> pointProperty() {
		if (pointProperty == null) {
			pointProperty = new SimpleObjectProperty<Point>(reading.getPoint() == null ? null : reading
					.getPoint().getWrapper());
			pointProperty.addListener(new ChangeListener<Point>() {
				@Override
				public void changed(ObservableValue<? extends Point> obj, Point oldValue, Point newValue) {
					reading.setPoint(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code pointproperty method
			//End of user code
		}
		return pointProperty;
	}
	
	public Point getPoint(){
		return pointProperty().get();
	} 
	
	public void setPoint(Point myPoint){
		if (pointProperty == null) {
				reading.setPoint(myPoint == null ? null : myPoint.getBean());
			} else {
				this.pointProperty().set(myPoint);
			}
	}
	
	public void updatePoint(final Point myPoint, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPoint(myPoint);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPoint(myPoint);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updatePoint(final Point myPoint) {
		updatePoint(myPoint, null);
	}

	public IntegerProperty timeAverageProperty(){
		if (this.timeAverageProperty == null) {
			this.timeAverageProperty = new SimpleIntegerProperty(reading.getTimeAverage());
			this.timeAverageProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					reading.setTimeAverage((Integer) arg2);
				}
			});
			//Start of user code timeAverageproperty method
			//End of user code
		}
		return this.timeAverageProperty;
	}
	
	public int getTimeAverage(){
		return timeAverageProperty().get();
	} 
	
	public void setTimeAverage(int myTimeAverage){
		this.timeAverageProperty().set(myTimeAverage);
	}
	
	public void updateTimeAverage(final int myTimeAverage, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTimeAverage(myTimeAverage);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTimeAverage(myTimeAverage);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTimeAverage(final int myTimeAverage) {
		updateTimeAverage(myTimeAverage, null);
	}

	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(reading.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					reading.setUpdateDate(arg2);
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
				reading.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(reading.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					reading.setVersion((Integer) arg2);
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
