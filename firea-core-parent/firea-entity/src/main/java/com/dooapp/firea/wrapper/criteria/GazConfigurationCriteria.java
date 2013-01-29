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
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

//Start of user code for imports
// TODO: import me!
//End of user code




// Start of user code comment for GazConfigurationCriteria Class

// End of user code

public class GazConfigurationCriteria 
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private ObjectProperty<java.util.Date> creationDateMaxProperty;
	
	private ObjectProperty<java.util.Date> creationDateMinProperty;
	
	private BooleanProperty droppedCeilFullProperty;
	
	private BooleanProperty droppedFloorFullProperty;
	
	private LongProperty idMaxProperty;
	
	private LongProperty idMinProperty;
	
	private DoubleProperty leekRepartitionPercentMaxProperty;
	
	private DoubleProperty leekRepartitionPercentMinProperty;
	
	private DoubleProperty retentionGoalMaxProperty;
	
	private DoubleProperty retentionGoalMinProperty;
	
	private BooleanProperty retentionInterfaceProperty;
	
	private BooleanProperty slowUnloadingProperty;
	
	private DoubleProperty slowUnloadingValueMaxProperty;
	
	private DoubleProperty slowUnloadingValueMinProperty;
	
	private ObjectProperty<java.util.Date> updateDateMaxProperty;
	
	private ObjectProperty<java.util.Date> updateDateMinProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Criteria
	 */
	private GazConfigurationCriteriaInstance gazConfigurationCriteria;

	/*
	 * Constructors
	 * <!-- Start of user code comment for GazConfigurationCriteria constructor
	 * End of user code -->
	 */
	public GazConfigurationCriteria(){
		this(new GazConfigurationCriteriaInstance());
		//Start of user code simple constructor
		//End of user code
	}
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for GazConfigurationCriteria constructor with parameters
	 * End of user code -->
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
		// Start of user code constructor with parameters
		// End of user code
	}
	
	public GazConfigurationCriteriaInstance getGazConfigurationCriteriaInstance(){
		return this.gazConfigurationCriteria;
	}
	
	
	public GazConfigurationCriteriaInstance getBean() {
		return  this.gazConfigurationCriteria;
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
	 * <!-- Start of user code comment for creationDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateMaxProperty() {
		if (creationDateMaxProperty == null) {
			creationDateMaxProperty = new SimpleObjectProperty<java.util.Date>(gazConfigurationCriteria.getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					gazConfigurationCriteria.setCreationDateMax(arg2);
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
				gazConfigurationCriteria.setCreationDateMax(myCreationDateMax);
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
			creationDateMinProperty = new SimpleObjectProperty<java.util.Date>(gazConfigurationCriteria.getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					gazConfigurationCriteria.setCreationDateMin(arg2);
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
				gazConfigurationCriteria.setCreationDateMin(myCreationDateMin);
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
	 * <!-- Start of user code comment for droppedCeilFull property method 
		-->
	 * <!-- End of user code -->
	 */
	public BooleanProperty droppedCeilFullProperty(){
		if (this.droppedCeilFullProperty == null) {
			this.droppedCeilFullProperty = new SimpleBooleanProperty(gazConfigurationCriteria.isDroppedCeilFull());
			this.droppedCeilFullProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					gazConfigurationCriteria.setDroppedCeilFull((Boolean) arg2);
				}
			});
			//Start of user code droppedCeilFullproperty method
			//End of user code
		}
		return this.droppedCeilFullProperty;
	}
	
	/*
	 * <!-- Start of user code comment for droppedCeilFull getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isDroppedCeilFull(){
		return droppedCeilFullProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for droppedCeilFull setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDroppedCeilFull(boolean myDroppedCeilFull){
		this.droppedCeilFullProperty().set(myDroppedCeilFull);
	}
	
	public void updateDroppedCeilFull(final boolean myDroppedCeilFull, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedCeilFull(myDroppedCeilFull);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedCeilFull(myDroppedCeilFull);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDroppedCeilFull(final boolean myDroppedCeilFull) {
		updateDroppedCeilFull(myDroppedCeilFull, null);
	}

	/*
	 * <!-- Start of user code comment for droppedFloorFull property method 
		-->
	 * <!-- End of user code -->
	 */
	public BooleanProperty droppedFloorFullProperty(){
		if (this.droppedFloorFullProperty == null) {
			this.droppedFloorFullProperty = new SimpleBooleanProperty(gazConfigurationCriteria.isDroppedFloorFull());
			this.droppedFloorFullProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					gazConfigurationCriteria.setDroppedFloorFull((Boolean) arg2);
				}
			});
			//Start of user code droppedFloorFullproperty method
			//End of user code
		}
		return this.droppedFloorFullProperty;
	}
	
	/*
	 * <!-- Start of user code comment for droppedFloorFull getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isDroppedFloorFull(){
		return droppedFloorFullProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for droppedFloorFull setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDroppedFloorFull(boolean myDroppedFloorFull){
		this.droppedFloorFullProperty().set(myDroppedFloorFull);
	}
	
	public void updateDroppedFloorFull(final boolean myDroppedFloorFull, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedFloorFull(myDroppedFloorFull);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedFloorFull(myDroppedFloorFull);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDroppedFloorFull(final boolean myDroppedFloorFull) {
		updateDroppedFloorFull(myDroppedFloorFull, null);
	}

	/*
	 * <!-- Start of user code comment for idMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idMaxProperty(){
		if (this.idMaxProperty == null) {
			this.idMaxProperty = new SimpleLongProperty(gazConfigurationCriteria.getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setIdMax((Long) arg2);
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
			this.idMinProperty = new SimpleLongProperty(gazConfigurationCriteria.getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setIdMin((Long) arg2);
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
	 * <!-- Start of user code comment for leekRepartitionPercentMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty leekRepartitionPercentMaxProperty(){
		if (this.leekRepartitionPercentMaxProperty == null) {
			this.leekRepartitionPercentMaxProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getLeekRepartitionPercentMax());
			this.leekRepartitionPercentMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setLeekRepartitionPercentMax((Double) arg2);
				}
			});
			//Start of user code leekRepartitionPercentMaxproperty method
			//End of user code
		}
		return this.leekRepartitionPercentMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for leekRepartitionPercentMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getLeekRepartitionPercentMax(){
		return leekRepartitionPercentMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for leekRepartitionPercentMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setLeekRepartitionPercentMax(double myLeekRepartitionPercentMax){
		this.leekRepartitionPercentMaxProperty().set(myLeekRepartitionPercentMax);
	}
	
	public void updateLeekRepartitionPercentMax(final double myLeekRepartitionPercentMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLeekRepartitionPercentMax(myLeekRepartitionPercentMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLeekRepartitionPercentMax(myLeekRepartitionPercentMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateLeekRepartitionPercentMax(final double myLeekRepartitionPercentMax) {
		updateLeekRepartitionPercentMax(myLeekRepartitionPercentMax, null);
	}

	/*
	 * <!-- Start of user code comment for leekRepartitionPercentMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty leekRepartitionPercentMinProperty(){
		if (this.leekRepartitionPercentMinProperty == null) {
			this.leekRepartitionPercentMinProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getLeekRepartitionPercentMin());
			this.leekRepartitionPercentMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setLeekRepartitionPercentMin((Double) arg2);
				}
			});
			//Start of user code leekRepartitionPercentMinproperty method
			//End of user code
		}
		return this.leekRepartitionPercentMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for leekRepartitionPercentMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getLeekRepartitionPercentMin(){
		return leekRepartitionPercentMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for leekRepartitionPercentMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setLeekRepartitionPercentMin(double myLeekRepartitionPercentMin){
		this.leekRepartitionPercentMinProperty().set(myLeekRepartitionPercentMin);
	}
	
	public void updateLeekRepartitionPercentMin(final double myLeekRepartitionPercentMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLeekRepartitionPercentMin(myLeekRepartitionPercentMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLeekRepartitionPercentMin(myLeekRepartitionPercentMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateLeekRepartitionPercentMin(final double myLeekRepartitionPercentMin) {
		updateLeekRepartitionPercentMin(myLeekRepartitionPercentMin, null);
	}

	/*
	 * <!-- Start of user code comment for retentionGoalMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty retentionGoalMaxProperty(){
		if (this.retentionGoalMaxProperty == null) {
			this.retentionGoalMaxProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getRetentionGoalMax());
			this.retentionGoalMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setRetentionGoalMax((Double) arg2);
				}
			});
			//Start of user code retentionGoalMaxproperty method
			//End of user code
		}
		return this.retentionGoalMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for retentionGoalMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getRetentionGoalMax(){
		return retentionGoalMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for retentionGoalMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setRetentionGoalMax(double myRetentionGoalMax){
		this.retentionGoalMaxProperty().set(myRetentionGoalMax);
	}
	
	public void updateRetentionGoalMax(final double myRetentionGoalMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionGoalMax(myRetentionGoalMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionGoalMax(myRetentionGoalMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRetentionGoalMax(final double myRetentionGoalMax) {
		updateRetentionGoalMax(myRetentionGoalMax, null);
	}

	/*
	 * <!-- Start of user code comment for retentionGoalMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty retentionGoalMinProperty(){
		if (this.retentionGoalMinProperty == null) {
			this.retentionGoalMinProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getRetentionGoalMin());
			this.retentionGoalMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setRetentionGoalMin((Double) arg2);
				}
			});
			//Start of user code retentionGoalMinproperty method
			//End of user code
		}
		return this.retentionGoalMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for retentionGoalMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getRetentionGoalMin(){
		return retentionGoalMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for retentionGoalMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setRetentionGoalMin(double myRetentionGoalMin){
		this.retentionGoalMinProperty().set(myRetentionGoalMin);
	}
	
	public void updateRetentionGoalMin(final double myRetentionGoalMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionGoalMin(myRetentionGoalMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionGoalMin(myRetentionGoalMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRetentionGoalMin(final double myRetentionGoalMin) {
		updateRetentionGoalMin(myRetentionGoalMin, null);
	}

	/*
	 * <!-- Start of user code comment for retentionInterface property method 
		-->
	 * <!-- End of user code -->
	 */
	public BooleanProperty retentionInterfaceProperty(){
		if (this.retentionInterfaceProperty == null) {
			this.retentionInterfaceProperty = new SimpleBooleanProperty(gazConfigurationCriteria.isRetentionInterface());
			this.retentionInterfaceProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					gazConfigurationCriteria.setRetentionInterface((Boolean) arg2);
				}
			});
			//Start of user code retentionInterfaceproperty method
			//End of user code
		}
		return this.retentionInterfaceProperty;
	}
	
	/*
	 * <!-- Start of user code comment for retentionInterface getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isRetentionInterface(){
		return retentionInterfaceProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for retentionInterface setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setRetentionInterface(boolean myRetentionInterface){
		this.retentionInterfaceProperty().set(myRetentionInterface);
	}
	
	public void updateRetentionInterface(final boolean myRetentionInterface, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionInterface(myRetentionInterface);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionInterface(myRetentionInterface);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRetentionInterface(final boolean myRetentionInterface) {
		updateRetentionInterface(myRetentionInterface, null);
	}

	/*
	 * <!-- Start of user code comment for slowUnloading property method 
		-->
	 * <!-- End of user code -->
	 */
	public BooleanProperty slowUnloadingProperty(){
		if (this.slowUnloadingProperty == null) {
			this.slowUnloadingProperty = new SimpleBooleanProperty(gazConfigurationCriteria.isSlowUnloading());
			this.slowUnloadingProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					gazConfigurationCriteria.setSlowUnloading((Boolean) arg2);
				}
			});
			//Start of user code slowUnloadingproperty method
			//End of user code
		}
		return this.slowUnloadingProperty;
	}
	
	/*
	 * <!-- Start of user code comment for slowUnloading getter 
		-->
	 * <!-- End of user code -->
	 */
	public boolean isSlowUnloading(){
		return slowUnloadingProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for slowUnloading setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setSlowUnloading(boolean mySlowUnloading){
		this.slowUnloadingProperty().set(mySlowUnloading);
	}
	
	public void updateSlowUnloading(final boolean mySlowUnloading, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloading(mySlowUnloading);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloading(mySlowUnloading);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateSlowUnloading(final boolean mySlowUnloading) {
		updateSlowUnloading(mySlowUnloading, null);
	}

	/*
	 * <!-- Start of user code comment for slowUnloadingValueMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty slowUnloadingValueMaxProperty(){
		if (this.slowUnloadingValueMaxProperty == null) {
			this.slowUnloadingValueMaxProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getSlowUnloadingValueMax());
			this.slowUnloadingValueMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setSlowUnloadingValueMax((Double) arg2);
				}
			});
			//Start of user code slowUnloadingValueMaxproperty method
			//End of user code
		}
		return this.slowUnloadingValueMaxProperty;
	}
	
	/*
	 * <!-- Start of user code comment for slowUnloadingValueMax getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getSlowUnloadingValueMax(){
		return slowUnloadingValueMaxProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for slowUnloadingValueMax setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setSlowUnloadingValueMax(double mySlowUnloadingValueMax){
		this.slowUnloadingValueMaxProperty().set(mySlowUnloadingValueMax);
	}
	
	public void updateSlowUnloadingValueMax(final double mySlowUnloadingValueMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloadingValueMax(mySlowUnloadingValueMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloadingValueMax(mySlowUnloadingValueMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateSlowUnloadingValueMax(final double mySlowUnloadingValueMax) {
		updateSlowUnloadingValueMax(mySlowUnloadingValueMax, null);
	}

	/*
	 * <!-- Start of user code comment for slowUnloadingValueMin property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty slowUnloadingValueMinProperty(){
		if (this.slowUnloadingValueMinProperty == null) {
			this.slowUnloadingValueMinProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getSlowUnloadingValueMin());
			this.slowUnloadingValueMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setSlowUnloadingValueMin((Double) arg2);
				}
			});
			//Start of user code slowUnloadingValueMinproperty method
			//End of user code
		}
		return this.slowUnloadingValueMinProperty;
	}
	
	/*
	 * <!-- Start of user code comment for slowUnloadingValueMin getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getSlowUnloadingValueMin(){
		return slowUnloadingValueMinProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for slowUnloadingValueMin setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setSlowUnloadingValueMin(double mySlowUnloadingValueMin){
		this.slowUnloadingValueMinProperty().set(mySlowUnloadingValueMin);
	}
	
	public void updateSlowUnloadingValueMin(final double mySlowUnloadingValueMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloadingValueMin(mySlowUnloadingValueMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloadingValueMin(mySlowUnloadingValueMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateSlowUnloadingValueMin(final double mySlowUnloadingValueMin) {
		updateSlowUnloadingValueMin(mySlowUnloadingValueMin, null);
	}

	/*
	 * <!-- Start of user code comment for updateDateMax property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = new SimpleObjectProperty<java.util.Date>(gazConfigurationCriteria.getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					gazConfigurationCriteria.setUpdateDateMax(arg2);
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
				gazConfigurationCriteria.setUpdateDateMax(myUpdateDateMax);
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
			updateDateMinProperty = new SimpleObjectProperty<java.util.Date>(gazConfigurationCriteria.getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					gazConfigurationCriteria.setUpdateDateMin(arg2);
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
				gazConfigurationCriteria.setUpdateDateMin(myUpdateDateMin);
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
			this.versionProperty = new SimpleIntegerProperty(gazConfigurationCriteria.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setVersion((Integer) arg2);
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
