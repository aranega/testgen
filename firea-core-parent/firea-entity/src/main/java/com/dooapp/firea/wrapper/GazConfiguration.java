package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.GazConfigurationBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

//Start of user code for imports
// TODO: import me!
//End of user code




// Start of user code comment for GazConfiguration Class

// End of user code

public class GazConfiguration
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private ObjectProperty<BottleConfiguration> bottleconfigurationsProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private BooleanProperty droppedCeilFullProperty;
	
	private BooleanProperty droppedFloorFullProperty;
	
	private ObjectProperty<Gaz> gazProperty;
	
	private LongProperty idProperty;
	
	private DoubleProperty leekRepartitionPercentProperty;
	
	private ObjectProperty<Project> projectProperty;
	
	private DoubleProperty retentionGoalProperty;
	
	private BooleanProperty retentionInterfaceProperty;
	
	private BooleanProperty slowUnloadingProperty;
	
	private DoubleProperty slowUnloadingValueProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final GazConfigurationBean gazConfiguration;

	/*
	 * Constructors
	 * <!-- Start of user code comment for GazConfiguration constructor
	 * End of user code -->
	 */
	public GazConfiguration(){
		this(new GazConfigurationBean());	
	}
	
	
	public GazConfiguration(GazConfigurationBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.gazConfiguration = entity;
	}
	
	public GazConfigurationBean getGazConfigurationBean(){
		return this.gazConfiguration;
	}
	
	public GazConfigurationBean getBean() {
		return  this.gazConfiguration;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for bottleconfigurations property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<BottleConfiguration> bottleconfigurationsProperty() {
		if (bottleconfigurationsProperty == null) {
			bottleconfigurationsProperty = new SimpleObjectProperty<BottleConfiguration>(gazConfiguration.getBottleconfigurations() == null ? null : gazConfiguration
					.getBottleconfigurations().getWrapper());
			bottleconfigurationsProperty.addListener(new ChangeListener<BottleConfiguration>() {
				@Override
				public void changed(ObservableValue<? extends BottleConfiguration> obj, BottleConfiguration oldValue, BottleConfiguration newValue) {
					gazConfiguration.setBottleconfigurations(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code bottleconfigurationsproperty method
			//End of user code
		}
		return bottleconfigurationsProperty;
	}
	
	/*
	 * <!-- Start of user code comment for bottleconfigurations getter 
		-->
	 * <!-- End of user code -->
	 */
	public BottleConfiguration getBottleconfigurations(){
		return bottleconfigurationsProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for bottleconfigurations setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setBottleconfigurations(BottleConfiguration myBottleconfigurations){
		if (bottleconfigurationsProperty == null) {
				gazConfiguration.setBottleconfigurations(myBottleconfigurations == null ? null : myBottleconfigurations.getBean());
			} else {
				this.bottleconfigurationsProperty().set(myBottleconfigurations);
			}
	}
	
	public void updateBottleconfigurations(final BottleConfiguration myBottleconfigurations, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBottleconfigurations(myBottleconfigurations);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBottleconfigurations(myBottleconfigurations);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateBottleconfigurations(final BottleConfiguration myBottleconfigurations) {
		updateBottleconfigurations(myBottleconfigurations, null);
	}

	/*
	 * <!-- Start of user code comment for creationDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(gazConfiguration.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					gazConfiguration.setCreationDate(arg2);
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
				gazConfiguration.setCreationDate(myCreationDate);
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
	 * <!-- Start of user code comment for droppedCeilFull property method 
		-->
	 * <!-- End of user code -->
	 */
	public BooleanProperty droppedCeilFullProperty(){
		if (this.droppedCeilFullProperty == null) {
			this.droppedCeilFullProperty = new SimpleBooleanProperty(gazConfiguration.isDroppedCeilFull());
			this.droppedCeilFullProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					gazConfiguration.setDroppedCeilFull((Boolean) arg2);
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
			this.droppedFloorFullProperty = new SimpleBooleanProperty(gazConfiguration.isDroppedFloorFull());
			this.droppedFloorFullProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					gazConfiguration.setDroppedFloorFull((Boolean) arg2);
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
	 * <!-- Start of user code comment for gaz property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Gaz> gazProperty() {
		if (gazProperty == null) {
			gazProperty = new SimpleObjectProperty<Gaz>(gazConfiguration.getGaz() == null ? null : gazConfiguration
					.getGaz().getWrapper());
			gazProperty.addListener(new ChangeListener<Gaz>() {
				@Override
				public void changed(ObservableValue<? extends Gaz> obj, Gaz oldValue, Gaz newValue) {
					gazConfiguration.setGaz(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code gazproperty method
			//End of user code
		}
		return gazProperty;
	}
	
	/*
	 * <!-- Start of user code comment for gaz getter 
		-->
	 * <!-- End of user code -->
	 */
	public Gaz getGaz(){
		return gazProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for gaz setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setGaz(Gaz myGaz){
		if (gazProperty == null) {
				gazConfiguration.setGaz(myGaz == null ? null : myGaz.getBean());
			} else {
				this.gazProperty().set(myGaz);
			}
	}
	
	public void updateGaz(final Gaz myGaz, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setGaz(myGaz);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setGaz(myGaz);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateGaz(final Gaz myGaz) {
		updateGaz(myGaz, null);
	}

	/*
	 * <!-- Start of user code comment for id property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(gazConfiguration.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setId((Long) arg2);
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
	 * <!-- Start of user code comment for leekRepartitionPercent property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty leekRepartitionPercentProperty(){
		if (this.leekRepartitionPercentProperty == null) {
			this.leekRepartitionPercentProperty = new SimpleDoubleProperty(gazConfiguration.getLeekRepartitionPercent());
			this.leekRepartitionPercentProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setLeekRepartitionPercent((Double) arg2);
				}
			});
			//Start of user code leekRepartitionPercentproperty method
			//End of user code
		}
		return this.leekRepartitionPercentProperty;
	}
	
	/*
	 * <!-- Start of user code comment for leekRepartitionPercent getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getLeekRepartitionPercent(){
		return leekRepartitionPercentProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for leekRepartitionPercent setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setLeekRepartitionPercent(double myLeekRepartitionPercent){
		this.leekRepartitionPercentProperty().set(myLeekRepartitionPercent);
	}
	
	public void updateLeekRepartitionPercent(final double myLeekRepartitionPercent, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLeekRepartitionPercent(myLeekRepartitionPercent);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLeekRepartitionPercent(myLeekRepartitionPercent);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateLeekRepartitionPercent(final double myLeekRepartitionPercent) {
		updateLeekRepartitionPercent(myLeekRepartitionPercent, null);
	}

	/*
	 * <!-- Start of user code comment for project property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Project> projectProperty() {
		if (projectProperty == null) {
			projectProperty = new SimpleObjectProperty<Project>(gazConfiguration.getProject() == null ? null : gazConfiguration
					.getProject().getWrapper());
			projectProperty.addListener(new ChangeListener<Project>() {
				@Override
				public void changed(ObservableValue<? extends Project> obj, Project oldValue, Project newValue) {
					gazConfiguration.setProject(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code projectproperty method
			//End of user code
		}
		return projectProperty;
	}
	
	/*
	 * <!-- Start of user code comment for project getter 
		-->
	 * <!-- End of user code -->
	 */
	public Project getProject(){
		return projectProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for project setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setProject(Project myProject){
		if (projectProperty == null) {
				gazConfiguration.setProject(myProject == null ? null : myProject.getBean());
			} else {
				this.projectProperty().set(myProject);
			}
	}
	
	public void updateProject(final Project myProject, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setProject(myProject);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setProject(myProject);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateProject(final Project myProject) {
		updateProject(myProject, null);
	}

	/*
	 * <!-- Start of user code comment for retentionGoal property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty retentionGoalProperty(){
		if (this.retentionGoalProperty == null) {
			this.retentionGoalProperty = new SimpleDoubleProperty(gazConfiguration.getRetentionGoal());
			this.retentionGoalProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setRetentionGoal((Double) arg2);
				}
			});
			//Start of user code retentionGoalproperty method
			//End of user code
		}
		return this.retentionGoalProperty;
	}
	
	/*
	 * <!-- Start of user code comment for retentionGoal getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getRetentionGoal(){
		return retentionGoalProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for retentionGoal setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setRetentionGoal(double myRetentionGoal){
		this.retentionGoalProperty().set(myRetentionGoal);
	}
	
	public void updateRetentionGoal(final double myRetentionGoal, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionGoal(myRetentionGoal);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionGoal(myRetentionGoal);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRetentionGoal(final double myRetentionGoal) {
		updateRetentionGoal(myRetentionGoal, null);
	}

	/*
	 * <!-- Start of user code comment for retentionInterface property method 
		-->
	 * <!-- End of user code -->
	 */
	public BooleanProperty retentionInterfaceProperty(){
		if (this.retentionInterfaceProperty == null) {
			this.retentionInterfaceProperty = new SimpleBooleanProperty(gazConfiguration.isRetentionInterface());
			this.retentionInterfaceProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					gazConfiguration.setRetentionInterface((Boolean) arg2);
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
			this.slowUnloadingProperty = new SimpleBooleanProperty(gazConfiguration.isSlowUnloading());
			this.slowUnloadingProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					gazConfiguration.setSlowUnloading((Boolean) arg2);
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
	 * <!-- Start of user code comment for slowUnloadingValue property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty slowUnloadingValueProperty(){
		if (this.slowUnloadingValueProperty == null) {
			this.slowUnloadingValueProperty = new SimpleDoubleProperty(gazConfiguration.getSlowUnloadingValue());
			this.slowUnloadingValueProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setSlowUnloadingValue((Double) arg2);
				}
			});
			//Start of user code slowUnloadingValueproperty method
			//End of user code
		}
		return this.slowUnloadingValueProperty;
	}
	
	/*
	 * <!-- Start of user code comment for slowUnloadingValue getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getSlowUnloadingValue(){
		return slowUnloadingValueProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for slowUnloadingValue setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setSlowUnloadingValue(double mySlowUnloadingValue){
		this.slowUnloadingValueProperty().set(mySlowUnloadingValue);
	}
	
	public void updateSlowUnloadingValue(final double mySlowUnloadingValue, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloadingValue(mySlowUnloadingValue);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloadingValue(mySlowUnloadingValue);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateSlowUnloadingValue(final double mySlowUnloadingValue) {
		updateSlowUnloadingValue(mySlowUnloadingValue, null);
	}

	/*
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(gazConfiguration.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					gazConfiguration.setUpdateDate(arg2);
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
				gazConfiguration.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(gazConfiguration.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setVersion((Integer) arg2);
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
		return getGazConfigurationBean() != null ? serializer.outputString(getGazConfigurationBean().toXML()) : "";
		
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
