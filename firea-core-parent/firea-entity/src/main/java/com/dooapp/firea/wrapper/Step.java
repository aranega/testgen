package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.StepBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import com.dooapp.firea.entity.PointBean;
//Start of user code for imports
// TODO: import me!
//End of user code


//Start of user code comment for Step Class

//End of user code

public class Step implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private ObjectProperty<java.util.Date> dateProperty;
	
	private LongProperty idProperty;
	
	private ObjectProperty<ObservableList<Point>> pointsProperty;
	
	private ObjectProperty<Sample> sampleProperty;
	
	private ObjectProperty<com.dooapp.firea.entity.StepStatus> statusProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final StepBean step;

	/*
	 * Constructors
	 * <!-- Start of user code comment for Step constructor
	 * End of user code -->
	 */
	public Step(){
		this(new StepBean());	
	}
	
	
	public Step(StepBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.step = entity;
	}
	
	public StepBean getStepBean(){
		return this.step;
	}
	
	public StepBean getBean() {
		return  this.step;
	}
	

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for creationDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(step.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					step.setCreationDate(arg2);
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
				step.setCreationDate(myCreationDate);
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
	 * <!-- Start of user code comment for date property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> dateProperty() {
		if (dateProperty == null) {
			dateProperty = new SimpleObjectProperty<java.util.Date>(step.getDate());
			dateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					step.setDate(arg2);
				}
			});
			//Start of user code dateproperty method
			//End of user code
		}
		return dateProperty;
	}
	
	/*
	 * <!-- Start of user code comment for date getter 
		-->
	 * <!-- End of user code -->
	 */
	public java.util.Date getDate(){
		return dateProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for date setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setDate(java.util.Date myDate){
		if (dateProperty == null) {
				step.setDate(myDate);
			} else {
				this.dateProperty().set(myDate);
			}
	}
	
	public void updateDate(final java.util.Date myDate, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDate(myDate);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDate(myDate);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateDate(final java.util.Date myDate) {
		updateDate(myDate, null);
	}

	/*
	 * <!-- Start of user code comment for id property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(step.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					step.setId((Long) arg2);
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
	 * <!-- Start of user code comment for points property method 
		-->
	 * <!-- End of user code -->
	 */
	public ReadOnlyObjectProperty<ObservableList<Point>> pointsProperty() {
		if (pointsProperty == null) {
			pointsProperty = new SimpleObjectProperty<ObservableList<Point>>(
					FXCollections.<Point> observableArrayList());
			for (PointBean b : step.getPoints()) {
				pointsProperty.get().add(b.getWrapper());
			}
			pointsProperty.get().addListener(new javafx.collections.ListChangeListener<Point>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Point> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (Point tmp : change.getAddedSubList()) {
								step.addPoints(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (Point tmp : change.getRemoved()) {
								step.getPoints().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
			//Start of user code pointsproperty method
			//End of user code
		}
		return pointsProperty;
	}
	
	/*
	 * <!-- Start of user code comment for points getter 
		-->
	 * <!-- End of user code -->
	 */
	public ObservableList<Point> getPoints()
	{ 
		return pointsProperty().get(); 
	}

	/*
	 * <!-- Start of user code comment for sample property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Sample> sampleProperty() {
		if (sampleProperty == null) {
			sampleProperty = new SimpleObjectProperty<Sample>(step.getSample() == null ? null : step
					.getSample().getWrapper());
			sampleProperty.addListener(new ChangeListener<Sample>() {
				@Override
				public void changed(ObservableValue<? extends Sample> obj, Sample oldValue, Sample newValue) {
					step.setSample(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code sampleproperty method
			//End of user code
		}
		return sampleProperty;
	}
	
	/*
	 * <!-- Start of user code comment for sample getter 
		-->
	 * <!-- End of user code -->
	 */
	public Sample getSample(){
		return sampleProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for sample setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setSample(Sample mySample){
		if (sampleProperty == null) {
				step.setSample(mySample == null ? null : mySample.getBean());
			} else {
				this.sampleProperty().set(mySample);
			}
	}
	
	public void updateSample(final Sample mySample, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSample(mySample);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSample(mySample);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateSample(final Sample mySample) {
		updateSample(mySample, null);
	}

	/*
	 * <!-- Start of user code comment for status property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<com.dooapp.firea.entity.StepStatus> statusProperty() {
		if (statusProperty == null) {
			statusProperty = new SimpleObjectProperty<com.dooapp.firea.entity.StepStatus>(step.getStatus());
			statusProperty.addListener(new ChangeListener<com.dooapp.firea.entity.StepStatus>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.StepStatus> arg0, com.dooapp.firea.entity.StepStatus arg1, com.dooapp.firea.entity.StepStatus arg2) {
					step.setStatus(arg2);
				}
			});
			//Start of user code statusproperty method
			//End of user code
		}
		return statusProperty;
	}
	
	/*
	 * <!-- Start of user code comment for status getter 
		-->
	 * <!-- End of user code -->
	 */
	public com.dooapp.firea.entity.StepStatus getStatus(){
		return statusProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for status setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setStatus(com.dooapp.firea.entity.StepStatus myStatus){
		if (statusProperty == null) {
				step.setStatus(myStatus);
			} else {
				this.statusProperty().set(myStatus);
			}
	}
	
	public void updateStatus(final com.dooapp.firea.entity.StepStatus myStatus, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setStatus(myStatus);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setStatus(myStatus);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateStatus(final com.dooapp.firea.entity.StepStatus myStatus) {
		updateStatus(myStatus, null);
	}

	/*
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(step.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					step.setUpdateDate(arg2);
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
				step.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(step.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					step.setVersion((Integer) arg2);
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
