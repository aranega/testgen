package com.dooapp.fireaOLD.wrapper.criteria;

import com.dooapp.fireaOLD.entity.criteria.ReadingCriteriaInstance;

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
//Start of user code for imports
// TODO: import me!
//End of user code


//Start of user code comment for ReadingCriteria Class

//End of user code

public class ReadingCriteria implements com.dooapp.lib.common.entity.Wrapper 
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private DoubleProperty buildingPressureMaxProperty;
	
	private DoubleProperty buildingPressureMinProperty;
	
	private ObjectProperty<java.util.Date> creationDateMaxProperty;
	
	private ObjectProperty<java.util.Date> creationDateMinProperty;
	
	private DoubleProperty fanPressureMaxProperty;
	
	private DoubleProperty fanPressureMinProperty;
	
	private LongProperty idMaxProperty;
	
	private LongProperty idMinProperty;
	
	private BooleanProperty lowFlowProperty;
	
	private IntegerProperty timeAverageMaxProperty;
	
	private IntegerProperty timeAverageMinProperty;
	
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	
	private ObjectProperty<java.util.Date> updateDateMinProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Criteria
	 */
	private ReadingCriteriaInstance readingCriteria;

	/*
	 * Constructors
	 * <!-- Start of user code comment for ReadingCriteria constructor
	 * End of user code -->
	 */
	public ReadingCriteria(){
		this(new ReadingCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for ReadingCriteria constructor with parameters
	 * End of user code -->
	 */
	public ReadingCriteria(ReadingCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.readingCriteria = entity;
		//Start of user code constructor with parameters
		//End of user code
	}
	
	public ReadingCriteriaInstance getReadingCriteriaInstance(){
		return this.readingCriteria;
	}
	
	
	public ReadingCriteriaInstance getBean() {
		return  this.readingCriteria;
	}
	

	/*
	 * Generated getters and setters
	 */
	/**
	 * For compliance purpose only always return 0!
     */
	public long getId(){
		return 0;
	}	

	/*
	 * <!-- Start of user code comment for buildingPressureMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty buildingPressureMaxProperty(){
		if (this.buildingPressureMaxProperty == null) {
			this.buildingPressureMaxProperty = new SimpleDoubleProperty(readingCriteria.getBuildingPressureMax());
			this.buildingPressureMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					readingCriteria.setBuildingPressureMax((Double) arg2);
				}
			});
			//Start of user code buildingPressureMaxproperty method
			//End of user code
		}
		return this.buildingPressureMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for buildingPressureMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getBuildingPressureMax(){
		return buildingPressureMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for buildingPressureMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setBuildingPressureMax(double myBuildingPressureMax){
		this.buildingPressureMaxProperty().set(myBuildingPressureMax);
	}
	
	public void updateBuildingPressureMax(final double myBuildingPressureMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBuildingPressureMax(myBuildingPressureMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBuildingPressureMax(myBuildingPressureMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateBuildingPressureMax(final double myBuildingPressureMax) {
		updateBuildingPressureMax(myBuildingPressureMax, null);
	}

	/*
	 * <!-- Start of user code comment for buildingPressureMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty buildingPressureMinProperty(){
		if (this.buildingPressureMinProperty == null) {
			this.buildingPressureMinProperty = new SimpleDoubleProperty(readingCriteria.getBuildingPressureMin());
			this.buildingPressureMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					readingCriteria.setBuildingPressureMin((Double) arg2);
				}
			});
			//Start of user code buildingPressureMinproperty method
			//End of user code
		}
		return this.buildingPressureMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for buildingPressureMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getBuildingPressureMin(){
		return buildingPressureMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for buildingPressureMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setBuildingPressureMin(double myBuildingPressureMin){
		this.buildingPressureMinProperty().set(myBuildingPressureMin);
	}
	
	public void updateBuildingPressureMin(final double myBuildingPressureMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBuildingPressureMin(myBuildingPressureMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBuildingPressureMin(myBuildingPressureMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateBuildingPressureMin(final double myBuildingPressureMin) {
		updateBuildingPressureMin(myBuildingPressureMin, null);
	}

	/*
	 * <!-- Start of user code comment for creationDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateMaxProperty() {
		if (creationDateMaxProperty == null) {
			creationDateMaxProperty = new SimpleObjectProperty<java.util.Date>(readingCriteria.getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					readingCriteria.setCreationDateMax(arg2);
				}
			});
			//Start of user code creationDateMaxproperty method
			//End of user code
		}
		return creationDateMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for creationDateMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getCreationDateMax(){
		return creationDateMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for creationDateMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCreationDateMax(java.util.Date myCreationDateMax){
		if (creationDateMaxProperty == null) {
				readingCriteria.setCreationDateMax(myCreationDateMax);
			} else {
				this.creationDateMaxProperty().set(myCreationDateMax);
			}
	}
	
	public void updateCreationDateMax(final java.util.Date myCreationDateMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDateMax(myCreationDateMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDateMax(myCreationDateMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCreationDateMax(final java.util.Date myCreationDateMax) {
		updateCreationDateMax(myCreationDateMax, null);
	}

	/*
	 * <!-- Start of user code comment for creationDateMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateMinProperty() {
		if (creationDateMinProperty == null) {
			creationDateMinProperty = new SimpleObjectProperty<java.util.Date>(readingCriteria.getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					readingCriteria.setCreationDateMin(arg2);
				}
			});
			//Start of user code creationDateMinproperty method
			//End of user code
		}
		return creationDateMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for creationDateMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getCreationDateMin(){
		return creationDateMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for creationDateMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setCreationDateMin(java.util.Date myCreationDateMin){
		if (creationDateMinProperty == null) {
				readingCriteria.setCreationDateMin(myCreationDateMin);
			} else {
				this.creationDateMinProperty().set(myCreationDateMin);
			}
	}
	
	public void updateCreationDateMin(final java.util.Date myCreationDateMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDateMin(myCreationDateMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDateMin(myCreationDateMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateCreationDateMin(final java.util.Date myCreationDateMin) {
		updateCreationDateMin(myCreationDateMin, null);
	}

	/*
	 * <!-- Start of user code comment for fanPressureMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty fanPressureMaxProperty(){
		if (this.fanPressureMaxProperty == null) {
			this.fanPressureMaxProperty = new SimpleDoubleProperty(readingCriteria.getFanPressureMax());
			this.fanPressureMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					readingCriteria.setFanPressureMax((Double) arg2);
				}
			});
			//Start of user code fanPressureMaxproperty method
			//End of user code
		}
		return this.fanPressureMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for fanPressureMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getFanPressureMax(){
		return fanPressureMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for fanPressureMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setFanPressureMax(double myFanPressureMax){
		this.fanPressureMaxProperty().set(myFanPressureMax);
	}
	
	public void updateFanPressureMax(final double myFanPressureMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFanPressureMax(myFanPressureMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFanPressureMax(myFanPressureMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateFanPressureMax(final double myFanPressureMax) {
		updateFanPressureMax(myFanPressureMax, null);
	}

	/*
	 * <!-- Start of user code comment for fanPressureMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty fanPressureMinProperty(){
		if (this.fanPressureMinProperty == null) {
			this.fanPressureMinProperty = new SimpleDoubleProperty(readingCriteria.getFanPressureMin());
			this.fanPressureMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					readingCriteria.setFanPressureMin((Double) arg2);
				}
			});
			//Start of user code fanPressureMinproperty method
			//End of user code
		}
		return this.fanPressureMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for fanPressureMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getFanPressureMin(){
		return fanPressureMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for fanPressureMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setFanPressureMin(double myFanPressureMin){
		this.fanPressureMinProperty().set(myFanPressureMin);
	}
	
	public void updateFanPressureMin(final double myFanPressureMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setFanPressureMin(myFanPressureMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setFanPressureMin(myFanPressureMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateFanPressureMin(final double myFanPressureMin) {
		updateFanPressureMin(myFanPressureMin, null);
	}

	/*
	 * <!-- Start of user code comment for idMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idMaxProperty(){
		if (this.idMaxProperty == null) {
			this.idMaxProperty = new SimpleLongProperty(readingCriteria.getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					readingCriteria.setIdMax((Long) arg2);
				}
			});
			//Start of user code idMaxproperty method
			//End of user code
		}
		return this.idMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for idMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public long getIdMax(){
		return idMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for idMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setIdMax(long myIdMax){
		this.idMaxProperty().set(myIdMax);
	}
	
	public void updateIdMax(final long myIdMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIdMax(myIdMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIdMax(myIdMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateIdMax(final long myIdMax) {
		updateIdMax(myIdMax, null);
	}

	/*
	 * <!-- Start of user code comment for idMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idMinProperty(){
		if (this.idMinProperty == null) {
			this.idMinProperty = new SimpleLongProperty(readingCriteria.getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					readingCriteria.setIdMin((Long) arg2);
				}
			});
			//Start of user code idMinproperty method
			//End of user code
		}
		return this.idMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for idMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public long getIdMin(){
		return idMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for idMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setIdMin(long myIdMin){
		this.idMinProperty().set(myIdMin);
	}
	
	public void updateIdMin(final long myIdMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIdMin(myIdMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIdMin(myIdMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateIdMin(final long myIdMin) {
		updateIdMin(myIdMin, null);
	}

	/*
	 * <!-- Start of user code comment for lowFlow property method 
		-->
	 * <!-- End of user code -->
	 */
	public BooleanProperty lowFlowProperty(){
		if (this.lowFlowProperty == null) {
			this.lowFlowProperty = new SimpleBooleanProperty(readingCriteria.isLowFlow());
			this.lowFlowProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					readingCriteria.setLowFlow((Boolean) arg2);
				}
			});
			//Start of user code lowFlowproperty method
			//End of user code
		}
		return this.lowFlowProperty;
	}
	
	/*
	 * <!-- Start of user code comment for lowFlow getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isLowFlow(){
		return lowFlowProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for lowFlow setter 
		-->
	 * <!-- End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for timeAverageMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty timeAverageMaxProperty(){
		if (this.timeAverageMaxProperty == null) {
			this.timeAverageMaxProperty = new SimpleIntegerProperty(readingCriteria.getTimeAverageMax());
			this.timeAverageMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					readingCriteria.setTimeAverageMax((Integer) arg2);
				}
			});
			//Start of user code timeAverageMaxproperty method
			//End of user code
		}
		return this.timeAverageMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for timeAverageMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getTimeAverageMax(){
		return timeAverageMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for timeAverageMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setTimeAverageMax(int myTimeAverageMax){
		this.timeAverageMaxProperty().set(myTimeAverageMax);
	}
	
	public void updateTimeAverageMax(final int myTimeAverageMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTimeAverageMax(myTimeAverageMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTimeAverageMax(myTimeAverageMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTimeAverageMax(final int myTimeAverageMax) {
		updateTimeAverageMax(myTimeAverageMax, null);
	}

	/*
	 * <!-- Start of user code comment for timeAverageMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty timeAverageMinProperty(){
		if (this.timeAverageMinProperty == null) {
			this.timeAverageMinProperty = new SimpleIntegerProperty(readingCriteria.getTimeAverageMin());
			this.timeAverageMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					readingCriteria.setTimeAverageMin((Integer) arg2);
				}
			});
			//Start of user code timeAverageMinproperty method
			//End of user code
		}
		return this.timeAverageMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for timeAverageMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public int getTimeAverageMin(){
		return timeAverageMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for timeAverageMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setTimeAverageMin(int myTimeAverageMin){
		this.timeAverageMinProperty().set(myTimeAverageMin);
	}
	
	public void updateTimeAverageMin(final int myTimeAverageMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTimeAverageMin(myTimeAverageMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTimeAverageMin(myTimeAverageMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTimeAverageMin(final int myTimeAverageMin) {
		updateTimeAverageMin(myTimeAverageMin, null);
	}

	/*
	 * <!-- Start of user code comment for updateDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = new SimpleObjectProperty<java.util.Date>(readingCriteria.getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					readingCriteria.setUpdateDateMax(arg2);
				}
			});
			//Start of user code updateDateMaxproperty method
			//End of user code
		}
		return updateDateMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for updateDateMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getUpdateDateMax(){
		return updateDateMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for updateDateMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setUpdateDateMax(java.util.Date myUpdateDateMax){
		if (updateDateMaxProperty == null) {
				readingCriteria.setUpdateDateMax(myUpdateDateMax);
			} else {
				this.updateDateMaxProperty().set(myUpdateDateMax);
			}
	}
	
	public void updateUpdateDateMax(final java.util.Date myUpdateDateMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDateMax(myUpdateDateMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDateMax(myUpdateDateMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateUpdateDateMax(final java.util.Date myUpdateDateMax) {
		updateUpdateDateMax(myUpdateDateMax, null);
	}

	/*
	 * <!-- Start of user code comment for updateDateMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateMinProperty() {
		if (updateDateMinProperty == null) {
			updateDateMinProperty = new SimpleObjectProperty<java.util.Date>(readingCriteria.getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					readingCriteria.setUpdateDateMin(arg2);
				}
			});
			//Start of user code updateDateMinproperty method
			//End of user code
		}
		return updateDateMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for updateDateMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getUpdateDateMin(){
		return updateDateMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for updateDateMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setUpdateDateMin(java.util.Date myUpdateDateMin){
		if (updateDateMinProperty == null) {
				readingCriteria.setUpdateDateMin(myUpdateDateMin);
			} else {
				this.updateDateMinProperty().set(myUpdateDateMin);
			}
	}
	
	public void updateUpdateDateMin(final java.util.Date myUpdateDateMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDateMin(myUpdateDateMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDateMin(myUpdateDateMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateUpdateDateMin(final java.util.Date myUpdateDateMin) {
		updateUpdateDateMin(myUpdateDateMin, null);
	}

	/*
	 * <!-- Start of user code comment for version property method 
		-->
	 * <!-- End of user code -->
	 */
	public IntegerProperty versionProperty(){
		if (this.versionProperty == null) {
			this.versionProperty = new SimpleIntegerProperty(readingCriteria.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					readingCriteria.setVersion((Integer) arg2);
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


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
