package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.SampleBean;

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
import com.dooapp.firea.entity.StepBean;
//Start of user code for imports
// TODO: import me!
//End of user code




public class Sample implements com.dooapp.lib.common.entity.Wrapper
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private IntegerProperty airPressureProperty;
	
	private ObjectProperty<com.dooapp.firea.entity.AirPressureCalculationMethod> airPressureCalculationMethodProperty;
	
	private ObjectProperty<com.dooapp.firea.entity.BeaufortScale> beaufortScaleProperty;
	
	private ObjectProperty<java.util.Date> creationDateProperty;
	
	private ObjectProperty<java.util.Date> dateProperty;
	
	private IntegerProperty highUpProperty;
	
	private LongProperty idProperty;
	
	private StringProperty nameProperty;
	
	private DoubleProperty phiEPercentProperty;
	
	private DoubleProperty phiIPercentProperty;
	
	private ObjectProperty<Project> projectProperty;
	
	private DoubleProperty roEProperty;
	
	private DoubleProperty roIProperty;
	
	private ObjectProperty<com.dooapp.firea.entity.SampleStatus> statusProperty;
	
	private ObjectProperty<ObservableList<Step>> stepProperty;
	
	private DoubleProperty tetaEProperty;
	
	private DoubleProperty tetaIProperty;
	
	private ObjectProperty<java.util.Date> updateDateProperty;
	
	private IntegerProperty versionProperty;
	
	private DoubleProperty windMeasureProperty;

	/**
	 * Handled Entity
	 */
	private final SampleBean sample;

	/*
	 * Constructors 
	 */
	public Sample(){
		this(new SampleBean());	
	}
	
	
	public Sample(SampleBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.sample = entity;
	}
	
	public SampleBean getSampleBean(){
		return this.sample;
	}
	
	public SampleBean getBean() {
		return  this.sample;
	}
	

	/*
	 * Generated getters and setters
	 */
	public IntegerProperty airPressureProperty(){
		if (this.airPressureProperty == null) {
			this.airPressureProperty = new SimpleIntegerProperty(sample.getAirPressure());
			this.airPressureProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setAirPressure((Integer) arg2);
				}
			});
			//Start of user code airPressureproperty method
			//End of user code
		}
		return this.airPressureProperty;
	}
	
	public int getAirPressure(){
		return airPressureProperty().get();
	} 
	
	public void setAirPressure(int myAirPressure){
		this.airPressureProperty().set(myAirPressure);
	}
	
	public void updateAirPressure(final int myAirPressure, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAirPressure(myAirPressure);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAirPressure(myAirPressure);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateAirPressure(final int myAirPressure) {
		updateAirPressure(myAirPressure, null);
	}

	public ObjectProperty<com.dooapp.firea.entity.AirPressureCalculationMethod> airPressureCalculationMethodProperty() {
		if (airPressureCalculationMethodProperty == null) {
			airPressureCalculationMethodProperty = new SimpleObjectProperty<com.dooapp.firea.entity.AirPressureCalculationMethod>(sample.getAirPressureCalculationMethod());
			airPressureCalculationMethodProperty.addListener(new ChangeListener<com.dooapp.firea.entity.AirPressureCalculationMethod>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.AirPressureCalculationMethod> arg0, com.dooapp.firea.entity.AirPressureCalculationMethod arg1, com.dooapp.firea.entity.AirPressureCalculationMethod arg2) {
					sample.setAirPressureCalculationMethod(arg2);
				}
			});
			//Start of user code airPressureCalculationMethodproperty method
			//End of user code
		}
		return airPressureCalculationMethodProperty;
	}
	
	public com.dooapp.firea.entity.AirPressureCalculationMethod getAirPressureCalculationMethod(){
		return airPressureCalculationMethodProperty().get();
	} 
	
	public void setAirPressureCalculationMethod(com.dooapp.firea.entity.AirPressureCalculationMethod myAirPressureCalculationMethod){
		if (airPressureCalculationMethodProperty == null) {
				sample.setAirPressureCalculationMethod(myAirPressureCalculationMethod);
			} else {
				this.airPressureCalculationMethodProperty().set(myAirPressureCalculationMethod);
			}
	}
	
	public void updateAirPressureCalculationMethod(final com.dooapp.firea.entity.AirPressureCalculationMethod myAirPressureCalculationMethod, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAirPressureCalculationMethod(myAirPressureCalculationMethod);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAirPressureCalculationMethod(myAirPressureCalculationMethod);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateAirPressureCalculationMethod(final com.dooapp.firea.entity.AirPressureCalculationMethod myAirPressureCalculationMethod) {
		updateAirPressureCalculationMethod(myAirPressureCalculationMethod, null);
	}

	public ObjectProperty<com.dooapp.firea.entity.BeaufortScale> beaufortScaleProperty() {
		if (beaufortScaleProperty == null) {
			beaufortScaleProperty = new SimpleObjectProperty<com.dooapp.firea.entity.BeaufortScale>(sample.getBeaufortScale());
			beaufortScaleProperty.addListener(new ChangeListener<com.dooapp.firea.entity.BeaufortScale>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.BeaufortScale> arg0, com.dooapp.firea.entity.BeaufortScale arg1, com.dooapp.firea.entity.BeaufortScale arg2) {
					sample.setBeaufortScale(arg2);
				}
			});
			//Start of user code beaufortScaleproperty method
			//End of user code
		}
		return beaufortScaleProperty;
	}
	
	public com.dooapp.firea.entity.BeaufortScale getBeaufortScale(){
		return beaufortScaleProperty().get();
	} 
	
	public void setBeaufortScale(com.dooapp.firea.entity.BeaufortScale myBeaufortScale){
		if (beaufortScaleProperty == null) {
				sample.setBeaufortScale(myBeaufortScale);
			} else {
				this.beaufortScaleProperty().set(myBeaufortScale);
			}
	}
	
	public void updateBeaufortScale(final com.dooapp.firea.entity.BeaufortScale myBeaufortScale, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBeaufortScale(myBeaufortScale);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBeaufortScale(myBeaufortScale);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateBeaufortScale(final com.dooapp.firea.entity.BeaufortScale myBeaufortScale) {
		updateBeaufortScale(myBeaufortScale, null);
	}

	public ObjectProperty<java.util.Date> creationDateProperty() {
		if (creationDateProperty == null) {
			creationDateProperty = new SimpleObjectProperty<java.util.Date>(sample.getCreationDate());
			creationDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					sample.setCreationDate(arg2);
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
				sample.setCreationDate(myCreationDate);
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

	public ObjectProperty<java.util.Date> dateProperty() {
		if (dateProperty == null) {
			dateProperty = new SimpleObjectProperty<java.util.Date>(sample.getDate());
			dateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					sample.setDate(arg2);
				}
			});
			//Start of user code dateproperty method
			//End of user code
		}
		return dateProperty;
	}
	
	public java.util.Date getDate(){
		return dateProperty().get();
	} 
	
	public void setDate(java.util.Date myDate){
		if (dateProperty == null) {
				sample.setDate(myDate);
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

	public IntegerProperty highUpProperty(){
		if (this.highUpProperty == null) {
			this.highUpProperty = new SimpleIntegerProperty(sample.getHighUp());
			this.highUpProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setHighUp((Integer) arg2);
				}
			});
			//Start of user code highUpproperty method
			//End of user code
		}
		return this.highUpProperty;
	}
	
	public int getHighUp(){
		return highUpProperty().get();
	} 
	
	public void setHighUp(int myHighUp){
		this.highUpProperty().set(myHighUp);
	}
	
	public void updateHighUp(final int myHighUp, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setHighUp(myHighUp);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setHighUp(myHighUp);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateHighUp(final int myHighUp) {
		updateHighUp(myHighUp, null);
	}

	public LongProperty idProperty(){
		if (this.idProperty == null) {
			this.idProperty = new SimpleLongProperty(sample.getId());
			this.idProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setId((Long) arg2);
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

	public StringProperty nameProperty(){
		if (this.nameProperty == null) {
			this.nameProperty = new SimpleStringProperty(sample.getName());
			this.nameProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					sample.setName((String) arg2);
				}
			});
			//Start of user code nameproperty method
			//End of user code
		}
		return this.nameProperty;
	}
	
	public String getName(){
		return nameProperty().get();
	} 
	
	public void setName(String myName){
		this.nameProperty().set(myName);
	}
	
	public void updateName(final String myName, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setName(myName);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setName(myName);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateName(final String myName) {
		updateName(myName, null);
	}

	public DoubleProperty phiEPercentProperty(){
		if (this.phiEPercentProperty == null) {
			this.phiEPercentProperty = new SimpleDoubleProperty(sample.getPhiEPercent());
			this.phiEPercentProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setPhiEPercent((Double) arg2);
				}
			});
			//Start of user code phiEPercentproperty method
			//End of user code
		}
		return this.phiEPercentProperty;
	}
	
	public double getPhiEPercent(){
		return phiEPercentProperty().get();
	} 
	
	public void setPhiEPercent(double myPhiEPercent){
		this.phiEPercentProperty().set(myPhiEPercent);
	}
	
	public void updatePhiEPercent(final double myPhiEPercent, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPhiEPercent(myPhiEPercent);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPhiEPercent(myPhiEPercent);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updatePhiEPercent(final double myPhiEPercent) {
		updatePhiEPercent(myPhiEPercent, null);
	}

	public DoubleProperty phiIPercentProperty(){
		if (this.phiIPercentProperty == null) {
			this.phiIPercentProperty = new SimpleDoubleProperty(sample.getPhiIPercent());
			this.phiIPercentProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setPhiIPercent((Double) arg2);
				}
			});
			//Start of user code phiIPercentproperty method
			//End of user code
		}
		return this.phiIPercentProperty;
	}
	
	public double getPhiIPercent(){
		return phiIPercentProperty().get();
	} 
	
	public void setPhiIPercent(double myPhiIPercent){
		this.phiIPercentProperty().set(myPhiIPercent);
	}
	
	public void updatePhiIPercent(final double myPhiIPercent, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPhiIPercent(myPhiIPercent);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPhiIPercent(myPhiIPercent);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updatePhiIPercent(final double myPhiIPercent) {
		updatePhiIPercent(myPhiIPercent, null);
	}

	public ObjectProperty<Project> projectProperty() {
		if (projectProperty == null) {
			projectProperty = new SimpleObjectProperty<Project>(sample.getProject() == null ? null : sample
					.getProject().getWrapper());
			projectProperty.addListener(new ChangeListener<Project>() {
				@Override
				public void changed(ObservableValue<? extends Project> obj, Project oldValue, Project newValue) {
					sample.setProject(newValue == null ? null : newValue.getBean());
				}
			});
			//Start of user code projectproperty method
			//End of user code
		}
		return projectProperty;
	}
	
	public Project getProject(){
		return projectProperty().get();
	} 
	
	public void setProject(Project myProject){
		if (projectProperty == null) {
				sample.setProject(myProject == null ? null : myProject.getBean());
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

	public DoubleProperty roEProperty(){
		if (this.roEProperty == null) {
			this.roEProperty = new SimpleDoubleProperty(sample.getRoE());
			this.roEProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setRoE((Double) arg2);
				}
			});
			//Start of user code roEproperty method
			//End of user code
		}
		return this.roEProperty;
	}
	
	public double getRoE(){
		return roEProperty().get();
	} 
	
	public void setRoE(double myRoE){
		this.roEProperty().set(myRoE);
	}
	
	public void updateRoE(final double myRoE, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRoE(myRoE);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRoE(myRoE);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRoE(final double myRoE) {
		updateRoE(myRoE, null);
	}

	public DoubleProperty roIProperty(){
		if (this.roIProperty == null) {
			this.roIProperty = new SimpleDoubleProperty(sample.getRoI());
			this.roIProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setRoI((Double) arg2);
				}
			});
			//Start of user code roIproperty method
			//End of user code
		}
		return this.roIProperty;
	}
	
	public double getRoI(){
		return roIProperty().get();
	} 
	
	public void setRoI(double myRoI){
		this.roIProperty().set(myRoI);
	}
	
	public void updateRoI(final double myRoI, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRoI(myRoI);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRoI(myRoI);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateRoI(final double myRoI) {
		updateRoI(myRoI, null);
	}

	public ObjectProperty<com.dooapp.firea.entity.SampleStatus> statusProperty() {
		if (statusProperty == null) {
			statusProperty = new SimpleObjectProperty<com.dooapp.firea.entity.SampleStatus>(sample.getStatus());
			statusProperty.addListener(new ChangeListener<com.dooapp.firea.entity.SampleStatus>() {
				@Override
				public void changed(ObservableValue<? extends com.dooapp.firea.entity.SampleStatus> arg0, com.dooapp.firea.entity.SampleStatus arg1, com.dooapp.firea.entity.SampleStatus arg2) {
					sample.setStatus(arg2);
				}
			});
			//Start of user code statusproperty method
			//End of user code
		}
		return statusProperty;
	}
	
	public com.dooapp.firea.entity.SampleStatus getStatus(){
		return statusProperty().get();
	} 
	
	public void setStatus(com.dooapp.firea.entity.SampleStatus myStatus){
		if (statusProperty == null) {
				sample.setStatus(myStatus);
			} else {
				this.statusProperty().set(myStatus);
			}
	}
	
	public void updateStatus(final com.dooapp.firea.entity.SampleStatus myStatus, final Object mutex) {
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
	
	public void updateStatus(final com.dooapp.firea.entity.SampleStatus myStatus) {
		updateStatus(myStatus, null);
	}

	public ReadOnlyObjectProperty<ObservableList<Step>> stepProperty() {
		if (stepProperty == null) {
			stepProperty = new SimpleObjectProperty<ObservableList<Step>>(
					FXCollections.<Step> observableArrayList());
			for (StepBean b : sample.getStep()) {
				stepProperty.get().add(b.getWrapper());
			}
			stepProperty.get().addListener(new javafx.collections.ListChangeListener<Step>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Step> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (Step tmp : change.getAddedSubList()) {
								sample.addStep(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (Step tmp : change.getRemoved()) {
								sample.getStep().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
			//Start of user code stepproperty method
			//End of user code
		}
		return stepProperty;
	}
	
	public ObservableList<Step> getStep()
	{ 
		return stepProperty().get(); 
	}

	public DoubleProperty tetaEProperty(){
		if (this.tetaEProperty == null) {
			this.tetaEProperty = new SimpleDoubleProperty(sample.getTetaE());
			this.tetaEProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setTetaE((Double) arg2);
				}
			});
			//Start of user code tetaEproperty method
			//End of user code
		}
		return this.tetaEProperty;
	}
	
	public double getTetaE(){
		return tetaEProperty().get();
	} 
	
	public void setTetaE(double myTetaE){
		this.tetaEProperty().set(myTetaE);
	}
	
	public void updateTetaE(final double myTetaE, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTetaE(myTetaE);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTetaE(myTetaE);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTetaE(final double myTetaE) {
		updateTetaE(myTetaE, null);
	}

	public DoubleProperty tetaIProperty(){
		if (this.tetaIProperty == null) {
			this.tetaIProperty = new SimpleDoubleProperty(sample.getTetaI());
			this.tetaIProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setTetaI((Double) arg2);
				}
			});
			//Start of user code tetaIproperty method
			//End of user code
		}
		return this.tetaIProperty;
	}
	
	public double getTetaI(){
		return tetaIProperty().get();
	} 
	
	public void setTetaI(double myTetaI){
		this.tetaIProperty().set(myTetaI);
	}
	
	public void updateTetaI(final double myTetaI, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTetaI(myTetaI);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTetaI(myTetaI);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateTetaI(final double myTetaI) {
		updateTetaI(myTetaI, null);
	}

	public ObjectProperty<java.util.Date> updateDateProperty() {
		if (updateDateProperty == null) {
			updateDateProperty = new SimpleObjectProperty<java.util.Date>(sample.getUpdateDate());
			updateDateProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					sample.setUpdateDate(arg2);
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
				sample.setUpdateDate(myUpdateDate);
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
			this.versionProperty = new SimpleIntegerProperty(sample.getVersion());
			this.versionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setVersion((Integer) arg2);
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

	public DoubleProperty windMeasureProperty(){
		if (this.windMeasureProperty == null) {
			this.windMeasureProperty = new SimpleDoubleProperty(sample.getWindMeasure());
			this.windMeasureProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					sample.setWindMeasure((Double) arg2);
				}
			});
			//Start of user code windMeasureproperty method
			//End of user code
		}
		return this.windMeasureProperty;
	}
	
	public double getWindMeasure(){
		return windMeasureProperty().get();
	} 
	
	public void setWindMeasure(double myWindMeasure){
		this.windMeasureProperty().set(myWindMeasure);
	}
	
	public void updateWindMeasure(final double myWindMeasure, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setWindMeasure(myWindMeasure);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setWindMeasure(myWindMeasure);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	public void updateWindMeasure(final double myWindMeasure) {
		updateWindMeasure(myWindMeasure, null);
	}


	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
