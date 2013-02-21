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
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;


import com.dooapp.firea.entity.GazWeight;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class GazConfigurationCriteria 
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
	private BooleanProperty boundInitialConcentrationProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty chosenFinalConcentrationMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty chosenFinalConcentrationMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty chosenInitialConcentrationMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty chosenInitialConcentrationMinProperty;
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
	private BooleanProperty droppedCeilFullProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty droppedFloorFullProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<GazWeight> forcedGazWeightProperty;
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
	private DoubleProperty installedInitialConcentrationMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty installedInitialConcentrationMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty leekRepartitionPercentMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty leekRepartitionPercentMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedFinalConcentrationMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedFinalConcentrationMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedInitialConcentrationMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedInitialConcentrationMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedRetentionMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedRetentionMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty retentionGoalMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty retentionGoalMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty retentionInterfaceProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty slowUnloadingProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty slowUnloadingValueMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty slowUnloadingValueMinProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty totalLoadToInstallMaxProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty totalLoadToInstallMinProperty;
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
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private GazConfigurationCriteriaInstance gazConfigurationCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazConfigurationCriteria(){
		this(new GazConfigurationCriteriaInstance());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazConfigurationCriteriaInstance getGazConfigurationCriteriaInstance(){
		return this.gazConfigurationCriteria;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazConfigurationCriteriaInstance getBean() {
		return  this.gazConfigurationCriteria;
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
	public BooleanProperty boundInitialConcentrationProperty(){
		if (this.boundInitialConcentrationProperty == null) {
			this.boundInitialConcentrationProperty = new SimpleBooleanProperty(gazConfigurationCriteria.isBoundInitialConcentration());
			this.boundInitialConcentrationProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					gazConfigurationCriteria.setBoundInitialConcentration((Boolean) arg2);
				}
			});
		}
		return this.boundInitialConcentrationProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isBoundInitialConcentration(){
		return boundInitialConcentrationProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setBoundInitialConcentration(boolean myBoundInitialConcentration){
		this.boundInitialConcentrationProperty().set(myBoundInitialConcentration);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateBoundInitialConcentration(final boolean myBoundInitialConcentration, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBoundInitialConcentration(myBoundInitialConcentration);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBoundInitialConcentration(myBoundInitialConcentration);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateBoundInitialConcentration(final boolean myBoundInitialConcentration) {
		updateBoundInitialConcentration(myBoundInitialConcentration, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty chosenFinalConcentrationMaxProperty(){
		if (this.chosenFinalConcentrationMaxProperty == null) {
			this.chosenFinalConcentrationMaxProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getChosenFinalConcentrationMax());
			this.chosenFinalConcentrationMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setChosenFinalConcentrationMax((Double) arg2);
				}
			});
		}
		return this.chosenFinalConcentrationMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getChosenFinalConcentrationMax(){
		return chosenFinalConcentrationMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChosenFinalConcentrationMax(double myChosenFinalConcentrationMax){
		this.chosenFinalConcentrationMaxProperty().set(myChosenFinalConcentrationMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChosenFinalConcentrationMax(final double myChosenFinalConcentrationMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setChosenFinalConcentrationMax(myChosenFinalConcentrationMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setChosenFinalConcentrationMax(myChosenFinalConcentrationMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChosenFinalConcentrationMax(final double myChosenFinalConcentrationMax) {
		updateChosenFinalConcentrationMax(myChosenFinalConcentrationMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty chosenFinalConcentrationMinProperty(){
		if (this.chosenFinalConcentrationMinProperty == null) {
			this.chosenFinalConcentrationMinProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getChosenFinalConcentrationMin());
			this.chosenFinalConcentrationMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setChosenFinalConcentrationMin((Double) arg2);
				}
			});
		}
		return this.chosenFinalConcentrationMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getChosenFinalConcentrationMin(){
		return chosenFinalConcentrationMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChosenFinalConcentrationMin(double myChosenFinalConcentrationMin){
		this.chosenFinalConcentrationMinProperty().set(myChosenFinalConcentrationMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChosenFinalConcentrationMin(final double myChosenFinalConcentrationMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setChosenFinalConcentrationMin(myChosenFinalConcentrationMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setChosenFinalConcentrationMin(myChosenFinalConcentrationMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChosenFinalConcentrationMin(final double myChosenFinalConcentrationMin) {
		updateChosenFinalConcentrationMin(myChosenFinalConcentrationMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty chosenInitialConcentrationMaxProperty(){
		if (this.chosenInitialConcentrationMaxProperty == null) {
			this.chosenInitialConcentrationMaxProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getChosenInitialConcentrationMax());
			this.chosenInitialConcentrationMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setChosenInitialConcentrationMax((Double) arg2);
				}
			});
		}
		return this.chosenInitialConcentrationMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getChosenInitialConcentrationMax(){
		return chosenInitialConcentrationMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChosenInitialConcentrationMax(double myChosenInitialConcentrationMax){
		this.chosenInitialConcentrationMaxProperty().set(myChosenInitialConcentrationMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChosenInitialConcentrationMax(final double myChosenInitialConcentrationMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setChosenInitialConcentrationMax(myChosenInitialConcentrationMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setChosenInitialConcentrationMax(myChosenInitialConcentrationMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChosenInitialConcentrationMax(final double myChosenInitialConcentrationMax) {
		updateChosenInitialConcentrationMax(myChosenInitialConcentrationMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty chosenInitialConcentrationMinProperty(){
		if (this.chosenInitialConcentrationMinProperty == null) {
			this.chosenInitialConcentrationMinProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getChosenInitialConcentrationMin());
			this.chosenInitialConcentrationMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setChosenInitialConcentrationMin((Double) arg2);
				}
			});
		}
		return this.chosenInitialConcentrationMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getChosenInitialConcentrationMin(){
		return chosenInitialConcentrationMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChosenInitialConcentrationMin(double myChosenInitialConcentrationMin){
		this.chosenInitialConcentrationMinProperty().set(myChosenInitialConcentrationMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChosenInitialConcentrationMin(final double myChosenInitialConcentrationMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setChosenInitialConcentrationMin(myChosenInitialConcentrationMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setChosenInitialConcentrationMin(myChosenInitialConcentrationMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChosenInitialConcentrationMin(final double myChosenInitialConcentrationMin) {
		updateChosenInitialConcentrationMin(myChosenInitialConcentrationMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return creationDateMaxProperty;
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
				gazConfigurationCriteria.setCreationDateMax(myCreationDateMax);
			} else {
				this.creationDateMaxProperty().set(myCreationDateMax);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateMax(final java.util.Date myCreationDateMax) {
		updateCreationDateMax(myCreationDateMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return creationDateMinProperty;
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
				gazConfigurationCriteria.setCreationDateMin(myCreationDateMin);
			} else {
				this.creationDateMinProperty().set(myCreationDateMin);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateMin(final java.util.Date myCreationDateMin) {
		updateCreationDateMin(myCreationDateMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.droppedCeilFullProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isDroppedCeilFull(){
		return droppedCeilFullProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedCeilFull(boolean myDroppedCeilFull){
		this.droppedCeilFullProperty().set(myDroppedCeilFull);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedCeilFull(final boolean myDroppedCeilFull) {
		updateDroppedCeilFull(myDroppedCeilFull, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.droppedFloorFullProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isDroppedFloorFull(){
		return droppedFloorFullProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedFloorFull(boolean myDroppedFloorFull){
		this.droppedFloorFullProperty().set(myDroppedFloorFull);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedFloorFull(final boolean myDroppedFloorFull) {
		updateDroppedFloorFull(myDroppedFloorFull, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<GazWeight> forcedGazWeightProperty() {
		if (forcedGazWeightProperty == null) {
			forcedGazWeightProperty = new SimpleObjectProperty<GazWeight>(gazConfigurationCriteria.getForcedGazWeight());
			forcedGazWeightProperty.addListener(new ChangeListener<GazWeight>() {
				@Override
				public void changed(ObservableValue<? extends GazWeight> arg0, GazWeight arg1, GazWeight arg2) {
					gazConfigurationCriteria.setForcedGazWeight(arg2);
				}
			});
		}
		return forcedGazWeightProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazWeight getForcedGazWeight(){
		return forcedGazWeightProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setForcedGazWeight(GazWeight myForcedGazWeight){
		if (forcedGazWeightProperty == null) {
				gazConfigurationCriteria.setForcedGazWeight(myForcedGazWeight);
			} else {
				this.forcedGazWeightProperty().set(myForcedGazWeight);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateForcedGazWeight(final GazWeight myForcedGazWeight, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setForcedGazWeight(myForcedGazWeight);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setForcedGazWeight(myForcedGazWeight);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateForcedGazWeight(final GazWeight myForcedGazWeight) {
		updateForcedGazWeight(myForcedGazWeight, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.idMaxProperty;
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIdMax(final long myIdMax) {
		updateIdMax(myIdMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.idMinProperty;
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIdMin(final long myIdMin) {
		updateIdMin(myIdMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty installedInitialConcentrationMaxProperty(){
		if (this.installedInitialConcentrationMaxProperty == null) {
			this.installedInitialConcentrationMaxProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getInstalledInitialConcentrationMax());
			this.installedInitialConcentrationMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setInstalledInitialConcentrationMax((Double) arg2);
				}
			});
		}
		return this.installedInitialConcentrationMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getInstalledInitialConcentrationMax(){
		return installedInitialConcentrationMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setInstalledInitialConcentrationMax(double myInstalledInitialConcentrationMax){
		this.installedInitialConcentrationMaxProperty().set(myInstalledInitialConcentrationMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateInstalledInitialConcentrationMax(final double myInstalledInitialConcentrationMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setInstalledInitialConcentrationMax(myInstalledInitialConcentrationMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setInstalledInitialConcentrationMax(myInstalledInitialConcentrationMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateInstalledInitialConcentrationMax(final double myInstalledInitialConcentrationMax) {
		updateInstalledInitialConcentrationMax(myInstalledInitialConcentrationMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty installedInitialConcentrationMinProperty(){
		if (this.installedInitialConcentrationMinProperty == null) {
			this.installedInitialConcentrationMinProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getInstalledInitialConcentrationMin());
			this.installedInitialConcentrationMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setInstalledInitialConcentrationMin((Double) arg2);
				}
			});
		}
		return this.installedInitialConcentrationMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getInstalledInitialConcentrationMin(){
		return installedInitialConcentrationMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setInstalledInitialConcentrationMin(double myInstalledInitialConcentrationMin){
		this.installedInitialConcentrationMinProperty().set(myInstalledInitialConcentrationMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateInstalledInitialConcentrationMin(final double myInstalledInitialConcentrationMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setInstalledInitialConcentrationMin(myInstalledInitialConcentrationMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setInstalledInitialConcentrationMin(myInstalledInitialConcentrationMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateInstalledInitialConcentrationMin(final double myInstalledInitialConcentrationMin) {
		updateInstalledInitialConcentrationMin(myInstalledInitialConcentrationMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.leekRepartitionPercentMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getLeekRepartitionPercentMax(){
		return leekRepartitionPercentMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLeekRepartitionPercentMax(double myLeekRepartitionPercentMax){
		this.leekRepartitionPercentMaxProperty().set(myLeekRepartitionPercentMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLeekRepartitionPercentMax(final double myLeekRepartitionPercentMax) {
		updateLeekRepartitionPercentMax(myLeekRepartitionPercentMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.leekRepartitionPercentMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getLeekRepartitionPercentMin(){
		return leekRepartitionPercentMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLeekRepartitionPercentMin(double myLeekRepartitionPercentMin){
		this.leekRepartitionPercentMinProperty().set(myLeekRepartitionPercentMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLeekRepartitionPercentMin(final double myLeekRepartitionPercentMin) {
		updateLeekRepartitionPercentMin(myLeekRepartitionPercentMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedFinalConcentrationMaxProperty(){
		if (this.prescribedFinalConcentrationMaxProperty == null) {
			this.prescribedFinalConcentrationMaxProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getPrescribedFinalConcentrationMax());
			this.prescribedFinalConcentrationMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setPrescribedFinalConcentrationMax((Double) arg2);
				}
			});
		}
		return this.prescribedFinalConcentrationMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedFinalConcentrationMax(){
		return prescribedFinalConcentrationMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedFinalConcentrationMax(double myPrescribedFinalConcentrationMax){
		this.prescribedFinalConcentrationMaxProperty().set(myPrescribedFinalConcentrationMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedFinalConcentrationMax(final double myPrescribedFinalConcentrationMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedFinalConcentrationMax(myPrescribedFinalConcentrationMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedFinalConcentrationMax(myPrescribedFinalConcentrationMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedFinalConcentrationMax(final double myPrescribedFinalConcentrationMax) {
		updatePrescribedFinalConcentrationMax(myPrescribedFinalConcentrationMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedFinalConcentrationMinProperty(){
		if (this.prescribedFinalConcentrationMinProperty == null) {
			this.prescribedFinalConcentrationMinProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getPrescribedFinalConcentrationMin());
			this.prescribedFinalConcentrationMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setPrescribedFinalConcentrationMin((Double) arg2);
				}
			});
		}
		return this.prescribedFinalConcentrationMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedFinalConcentrationMin(){
		return prescribedFinalConcentrationMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedFinalConcentrationMin(double myPrescribedFinalConcentrationMin){
		this.prescribedFinalConcentrationMinProperty().set(myPrescribedFinalConcentrationMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedFinalConcentrationMin(final double myPrescribedFinalConcentrationMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedFinalConcentrationMin(myPrescribedFinalConcentrationMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedFinalConcentrationMin(myPrescribedFinalConcentrationMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedFinalConcentrationMin(final double myPrescribedFinalConcentrationMin) {
		updatePrescribedFinalConcentrationMin(myPrescribedFinalConcentrationMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedInitialConcentrationMaxProperty(){
		if (this.prescribedInitialConcentrationMaxProperty == null) {
			this.prescribedInitialConcentrationMaxProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getPrescribedInitialConcentrationMax());
			this.prescribedInitialConcentrationMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setPrescribedInitialConcentrationMax((Double) arg2);
				}
			});
		}
		return this.prescribedInitialConcentrationMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedInitialConcentrationMax(){
		return prescribedInitialConcentrationMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedInitialConcentrationMax(double myPrescribedInitialConcentrationMax){
		this.prescribedInitialConcentrationMaxProperty().set(myPrescribedInitialConcentrationMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedInitialConcentrationMax(final double myPrescribedInitialConcentrationMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedInitialConcentrationMax(myPrescribedInitialConcentrationMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedInitialConcentrationMax(myPrescribedInitialConcentrationMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedInitialConcentrationMax(final double myPrescribedInitialConcentrationMax) {
		updatePrescribedInitialConcentrationMax(myPrescribedInitialConcentrationMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedInitialConcentrationMinProperty(){
		if (this.prescribedInitialConcentrationMinProperty == null) {
			this.prescribedInitialConcentrationMinProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getPrescribedInitialConcentrationMin());
			this.prescribedInitialConcentrationMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setPrescribedInitialConcentrationMin((Double) arg2);
				}
			});
		}
		return this.prescribedInitialConcentrationMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedInitialConcentrationMin(){
		return prescribedInitialConcentrationMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedInitialConcentrationMin(double myPrescribedInitialConcentrationMin){
		this.prescribedInitialConcentrationMinProperty().set(myPrescribedInitialConcentrationMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedInitialConcentrationMin(final double myPrescribedInitialConcentrationMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedInitialConcentrationMin(myPrescribedInitialConcentrationMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedInitialConcentrationMin(myPrescribedInitialConcentrationMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedInitialConcentrationMin(final double myPrescribedInitialConcentrationMin) {
		updatePrescribedInitialConcentrationMin(myPrescribedInitialConcentrationMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedRetentionMaxProperty(){
		if (this.prescribedRetentionMaxProperty == null) {
			this.prescribedRetentionMaxProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getPrescribedRetentionMax());
			this.prescribedRetentionMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setPrescribedRetentionMax((Double) arg2);
				}
			});
		}
		return this.prescribedRetentionMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedRetentionMax(){
		return prescribedRetentionMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedRetentionMax(double myPrescribedRetentionMax){
		this.prescribedRetentionMaxProperty().set(myPrescribedRetentionMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedRetentionMax(final double myPrescribedRetentionMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedRetentionMax(myPrescribedRetentionMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedRetentionMax(myPrescribedRetentionMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedRetentionMax(final double myPrescribedRetentionMax) {
		updatePrescribedRetentionMax(myPrescribedRetentionMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedRetentionMinProperty(){
		if (this.prescribedRetentionMinProperty == null) {
			this.prescribedRetentionMinProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getPrescribedRetentionMin());
			this.prescribedRetentionMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setPrescribedRetentionMin((Double) arg2);
				}
			});
		}
		return this.prescribedRetentionMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedRetentionMin(){
		return prescribedRetentionMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedRetentionMin(double myPrescribedRetentionMin){
		this.prescribedRetentionMinProperty().set(myPrescribedRetentionMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedRetentionMin(final double myPrescribedRetentionMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedRetentionMin(myPrescribedRetentionMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedRetentionMin(myPrescribedRetentionMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedRetentionMin(final double myPrescribedRetentionMin) {
		updatePrescribedRetentionMin(myPrescribedRetentionMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.retentionGoalMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRetentionGoalMax(){
		return retentionGoalMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRetentionGoalMax(double myRetentionGoalMax){
		this.retentionGoalMaxProperty().set(myRetentionGoalMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRetentionGoalMax(final double myRetentionGoalMax) {
		updateRetentionGoalMax(myRetentionGoalMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.retentionGoalMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRetentionGoalMin(){
		return retentionGoalMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRetentionGoalMin(double myRetentionGoalMin){
		this.retentionGoalMinProperty().set(myRetentionGoalMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRetentionGoalMin(final double myRetentionGoalMin) {
		updateRetentionGoalMin(myRetentionGoalMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.retentionInterfaceProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isRetentionInterface(){
		return retentionInterfaceProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRetentionInterface(boolean myRetentionInterface){
		this.retentionInterfaceProperty().set(myRetentionInterface);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRetentionInterface(final boolean myRetentionInterface) {
		updateRetentionInterface(myRetentionInterface, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.slowUnloadingProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isSlowUnloading(){
		return slowUnloadingProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSlowUnloading(boolean mySlowUnloading){
		this.slowUnloadingProperty().set(mySlowUnloading);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSlowUnloading(final boolean mySlowUnloading) {
		updateSlowUnloading(mySlowUnloading, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.slowUnloadingValueMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getSlowUnloadingValueMax(){
		return slowUnloadingValueMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSlowUnloadingValueMax(double mySlowUnloadingValueMax){
		this.slowUnloadingValueMaxProperty().set(mySlowUnloadingValueMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSlowUnloadingValueMax(final double mySlowUnloadingValueMax) {
		updateSlowUnloadingValueMax(mySlowUnloadingValueMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.slowUnloadingValueMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getSlowUnloadingValueMin(){
		return slowUnloadingValueMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSlowUnloadingValueMin(double mySlowUnloadingValueMin){
		this.slowUnloadingValueMinProperty().set(mySlowUnloadingValueMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSlowUnloadingValueMin(final double mySlowUnloadingValueMin) {
		updateSlowUnloadingValueMin(mySlowUnloadingValueMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty totalLoadToInstallMaxProperty(){
		if (this.totalLoadToInstallMaxProperty == null) {
			this.totalLoadToInstallMaxProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getTotalLoadToInstallMax());
			this.totalLoadToInstallMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setTotalLoadToInstallMax((Double) arg2);
				}
			});
		}
		return this.totalLoadToInstallMaxProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getTotalLoadToInstallMax(){
		return totalLoadToInstallMaxProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTotalLoadToInstallMax(double myTotalLoadToInstallMax){
		this.totalLoadToInstallMaxProperty().set(myTotalLoadToInstallMax);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTotalLoadToInstallMax(final double myTotalLoadToInstallMax, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTotalLoadToInstallMax(myTotalLoadToInstallMax);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTotalLoadToInstallMax(myTotalLoadToInstallMax);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTotalLoadToInstallMax(final double myTotalLoadToInstallMax) {
		updateTotalLoadToInstallMax(myTotalLoadToInstallMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty totalLoadToInstallMinProperty(){
		if (this.totalLoadToInstallMinProperty == null) {
			this.totalLoadToInstallMinProperty = new SimpleDoubleProperty(gazConfigurationCriteria.getTotalLoadToInstallMin());
			this.totalLoadToInstallMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfigurationCriteria.setTotalLoadToInstallMin((Double) arg2);
				}
			});
		}
		return this.totalLoadToInstallMinProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getTotalLoadToInstallMin(){
		return totalLoadToInstallMinProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTotalLoadToInstallMin(double myTotalLoadToInstallMin){
		this.totalLoadToInstallMinProperty().set(myTotalLoadToInstallMin);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTotalLoadToInstallMin(final double myTotalLoadToInstallMin, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTotalLoadToInstallMin(myTotalLoadToInstallMin);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTotalLoadToInstallMin(myTotalLoadToInstallMin);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTotalLoadToInstallMin(final double myTotalLoadToInstallMin) {
		updateTotalLoadToInstallMin(myTotalLoadToInstallMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return updateDateMaxProperty;
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
				gazConfigurationCriteria.setUpdateDateMax(myUpdateDateMax);
			} else {
				this.updateDateMaxProperty().set(myUpdateDateMax);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateMax(final java.util.Date myUpdateDateMax) {
		updateUpdateDateMax(myUpdateDateMax, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return updateDateMinProperty;
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
				gazConfigurationCriteria.setUpdateDateMin(myUpdateDateMin);
			} else {
				this.updateDateMinProperty().set(myUpdateDateMin);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateMin(final java.util.Date myUpdateDateMin) {
		updateUpdateDateMin(myUpdateDateMin, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.versionProperty;
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateVersion(final int myVersion) {
		updateVersion(myVersion, null);
	}

}
