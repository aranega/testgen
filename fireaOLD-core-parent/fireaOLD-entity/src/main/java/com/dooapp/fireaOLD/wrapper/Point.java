package com.dooapp.fireaOLD.wrapper;

import com.dooapp.fireaOLD.entity.PointBean;

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
import com.dooapp.fireaOLD.entity.ReadingBean;
//Start of user code for imports
// TODO: import me!
//End of user code


//Start of user code comment for Point Class

//End of user code

public class Point implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private LongProperty idProperty;
	
	private DoubleProperty pressureGoalProperty;
	
	private ObjectProperty<ObservableList<Reading>> readingsProperty;
	
	private ObjectProperty<Step> stepProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;

	/**
	 * Handled Entity
	 */
	private final PointBean point;

	/*
	 * Constructors
	 * <!-- Start of user code comment for Point constructor
	 * End of user code -->
	 */
	public Point(){
		this(new PointBean());	
	}
	
	
	public Point(PointBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.point = entity;
	}
	
	public PointBean getPointBean(){
		return this.point;
	}
	
	public PointBean getBean() {
		return  this.point;
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
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(point.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					point.setCreationDate(arg2);
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
				point.setCreationDate(myCreationDate);
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
	 * <!-- Start of user code comment for id property method 
		-->
	 * <!-- End of user code -->
	 */
	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(point.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					point.setId((Long) arg2);
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
	 * <!-- Start of user code comment for pressureGoal property method 
		-->
	 * <!-- End of user code -->
	 */
	public DoubleProperty pressureGoalProperty(){
		if (this.pressureGoalProperty == null) {
			this.pressureGoalProperty = new SimpleDoubleProperty(point.getPressureGoal());
			this.pressureGoalProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					point.setPressureGoal((Double) arg2);
				}
			});
			//Start of user code pressureGoalproperty method
			//End of user code
		}
		return this.pressureGoalProperty;
	}
	
	/*
	 * <!-- Start of user code comment for pressureGoal getter 
		-->
	 * <!-- End of user code -->
	 */
	public double getPressureGoal(){
		return pressureGoalProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for pressureGoal setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setPressureGoal(double myPressureGoal){
		this.pressureGoalProperty().set(myPressureGoal);
	}
	
	public void updatePressureGoal(final double myPressureGoal, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPressureGoal(myPressureGoal);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPressureGoal(myPressureGoal);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updatePressureGoal(final double myPressureGoal) {
		updatePressureGoal(myPressureGoal, null);
	}

	/*
	 * <!-- Start of user code comment for readings property method 
		-->
	 * <!-- End of user code -->
	 */
	public ReadOnlyObjectProperty<ObservableList<Reading>> readingsProperty() {
		if (readingsProperty == null) {
			readingsProperty = new SimpleObjectProperty<ObservableList<Reading>>(
					FXCollections.<Reading> observableArrayList());
			for (ReadingBean b : point.getReadings()) {
				readingsProperty.get().add(b.getWrapper());
			}
			readingsProperty.get().addListener(new javafx.collections.ListChangeListener<Reading>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Reading> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (Reading tmp : change.getAddedSubList()) {
								point.addReadings(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (Reading tmp : change.getRemoved()) {
								point.getReadings().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
			//Start of user code readingsproperty method
			//End of user code
		}
		return readingsProperty;
	}
	
	/*
	 * <!-- Start of user code comment for readings getter 
		-->
	 * <!-- End of user code -->
	 */
	public ObservableList<Reading> getReadings()
	{ 
		return readingsProperty().get(); 
	}

	/*
	 * <!-- Start of user code comment for step property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<Step> stepProperty() {
		if (stepProperty == null) {
			stepProperty = new SimpleObjectProperty<Step>(point.getStep() == null ? null : point
					.getStep().getWrapper());
			stepProperty.addListener(new ChangeListener<Step>() {
				@Override
				public void changed(ObservableValue<? extends Step> obj, Step oldValue, Step newValue) {
					point.setStep(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code stepproperty method
			//End of user code
		}
		return stepProperty;
	}
	
	/*
	 * <!-- Start of user code comment for step getter 
		-->
	 * <!-- End of user code -->
	 */
	public Step getStep(){
		return stepProperty().get();
	} 
	
	/*
	 * <!-- Start of user code comment for step setter 
		-->
	 * <!-- End of user code -->
	 */
	public void setStep(Step myStep){
		if (stepProperty == null) {
				point.setStep(myStep == null ? null : myStep.getBean());
			} else {
				this.stepProperty().set(myStep);
			}
	}
	
	public void updateStep(final Step myStep, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setStep(myStep);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setStep(myStep);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateStep(final Step myStep) {
		updateStep(myStep, null);
	}

	/*
	 * <!-- Start of user code comment for updateDate property method 
		-->
	 * <!-- End of user code -->
	 */
	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(point.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					point.setUpdateDate(arg2);
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
				point.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(point.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					point.setVersion((Integer) arg2);
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
