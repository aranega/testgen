package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.GazConfigurationBean;

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
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import com.dooapp.firea.entity.BottleConfigurationBean;


import com.dooapp.firea.entity.GazWeight;


import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Attribute;
import org.jdom2.Element;

/**
 * 
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class GazConfiguration
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<ObservableList<BottleConfiguration>> bottleConfigurationsProperty;
	/**
	 * Boolean to bind choosenInitialConcentration with prescribedInitialConcentration
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty boundInitialConcentrationProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty chosenFinalConcentrationProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty chosenInitialConcentrationProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<java.util.Date> creationDateProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty droppedCeilFullProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty droppedFloorFullProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<GazWeight> forcedGazWeightProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Gaz> gazProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private LongProperty idProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty installedInitialConcentrationProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty leekRepartitionPercentProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedFinalConcentrationProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedInitialConcentrationProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty prescribedRetentionProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Project> projectProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty retentionGoalProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BooleanProperty retentionInterfaceProperty;
	/**
	 * 
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
	private DoubleProperty slowUnloadingValueProperty;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty totalLoadToInstallProperty;
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
	private final GazConfigurationBean gazConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazConfiguration(){
		this(new GazConfigurationBean());	
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazConfigurationBean getGazConfigurationBean(){
		return this.gazConfiguration;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazConfigurationBean getBean() {
		return  this.gazConfiguration;
	}
	

	/*
	 * Generated getters and setters
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ReadOnlyObjectProperty<ObservableList<BottleConfiguration>> bottleConfigurationsProperty() {
		if (bottleConfigurationsProperty == null) {
			bottleConfigurationsProperty = new SimpleObjectProperty<ObservableList<BottleConfiguration>>(
					FXCollections.<BottleConfiguration> observableArrayList());
			for (BottleConfigurationBean tmp : this.gazConfiguration.getBottleConfigurations()) {
				bottleConfigurationsProperty.get().add(tmp.getWrapper());
			}
			bottleConfigurationsProperty.get().addListener(new javafx.collections.ListChangeListener<BottleConfiguration>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends BottleConfiguration> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (BottleConfiguration tmp : change.getAddedSubList()) {
								gazConfiguration.addBottleConfigurations(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (BottleConfiguration tmp : change.getRemoved()) {
								gazConfiguration.getBottleConfigurations().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
		}
		return bottleConfigurationsProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObservableList<BottleConfiguration> getBottleConfigurations()
	{ 
		return bottleConfigurationsProperty().get(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BooleanProperty boundInitialConcentrationProperty(){
		if (this.boundInitialConcentrationProperty == null) {
			this.boundInitialConcentrationProperty = new SimpleBooleanProperty(gazConfiguration.isBoundInitialConcentration());
			this.boundInitialConcentrationProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					gazConfiguration.setBoundInitialConcentration((Boolean) arg2);
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
	public DoubleProperty chosenFinalConcentrationProperty(){
		if (this.chosenFinalConcentrationProperty == null) {
			this.chosenFinalConcentrationProperty = new SimpleDoubleProperty(gazConfiguration.getChosenFinalConcentration());
			this.chosenFinalConcentrationProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setChosenFinalConcentration((Double) arg2);
				}
			});
		}
		return this.chosenFinalConcentrationProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getChosenFinalConcentration(){
		return chosenFinalConcentrationProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChosenFinalConcentration(double myChosenFinalConcentration){
		this.chosenFinalConcentrationProperty().set(myChosenFinalConcentration);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChosenFinalConcentration(final double myChosenFinalConcentration, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setChosenFinalConcentration(myChosenFinalConcentration);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setChosenFinalConcentration(myChosenFinalConcentration);
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
	public void updateChosenFinalConcentration(final double myChosenFinalConcentration) {
		updateChosenFinalConcentration(myChosenFinalConcentration, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty chosenInitialConcentrationProperty(){
		if (this.chosenInitialConcentrationProperty == null) {
			this.chosenInitialConcentrationProperty = new SimpleDoubleProperty(gazConfiguration.getChosenInitialConcentration());
			this.chosenInitialConcentrationProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setChosenInitialConcentration((Double) arg2);
				}
			});
		}
		return this.chosenInitialConcentrationProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getChosenInitialConcentration(){
		return chosenInitialConcentrationProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChosenInitialConcentration(double myChosenInitialConcentration){
		this.chosenInitialConcentrationProperty().set(myChosenInitialConcentration);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateChosenInitialConcentration(final double myChosenInitialConcentration, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setChosenInitialConcentration(myChosenInitialConcentration);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setChosenInitialConcentration(myChosenInitialConcentration);
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
	public void updateChosenInitialConcentration(final double myChosenInitialConcentration) {
		updateChosenInitialConcentration(myChosenInitialConcentration, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return creationDateProperty;
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
				gazConfiguration.setCreationDate(myCreationDate);
			} else {
				this.creationDateProperty().set(myCreationDate);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDate(final java.util.Date myCreationDate) {
		updateCreationDate(myCreationDate, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
			this.droppedFloorFullProperty = new SimpleBooleanProperty(gazConfiguration.isDroppedFloorFull());
			this.droppedFloorFullProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					gazConfiguration.setDroppedFloorFull((Boolean) arg2);
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
			forcedGazWeightProperty = new SimpleObjectProperty<GazWeight>(gazConfiguration.getForcedGazWeight());
			forcedGazWeightProperty.addListener(new ChangeListener<GazWeight>() {
				@Override
				public void changed(ObservableValue<? extends GazWeight> arg0, GazWeight arg1, GazWeight arg2) {
					gazConfiguration.setForcedGazWeight(arg2);
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
				gazConfiguration.setForcedGazWeight(myForcedGazWeight);
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
		}
		return gazProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Gaz getGaz(){
		return gazProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setGaz(Gaz myGaz){
		if (gazProperty == null) {
				gazConfiguration.setGaz(myGaz == null ? null : myGaz.getBean());
			} else {
				this.gazProperty().set(myGaz);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateGaz(final Gaz myGaz) {
		updateGaz(myGaz, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.idProperty;
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateId(final long myId) {
		updateId(myId, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty installedInitialConcentrationProperty(){
		if (this.installedInitialConcentrationProperty == null) {
			this.installedInitialConcentrationProperty = new SimpleDoubleProperty(gazConfiguration.getInstalledInitialConcentration());
			this.installedInitialConcentrationProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setInstalledInitialConcentration((Double) arg2);
				}
			});
		}
		return this.installedInitialConcentrationProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getInstalledInitialConcentration(){
		return installedInitialConcentrationProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setInstalledInitialConcentration(double myInstalledInitialConcentration){
		this.installedInitialConcentrationProperty().set(myInstalledInitialConcentration);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateInstalledInitialConcentration(final double myInstalledInitialConcentration, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setInstalledInitialConcentration(myInstalledInitialConcentration);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setInstalledInitialConcentration(myInstalledInitialConcentration);
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
	public void updateInstalledInitialConcentration(final double myInstalledInitialConcentration) {
		updateInstalledInitialConcentration(myInstalledInitialConcentration, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.leekRepartitionPercentProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getLeekRepartitionPercent(){
		return leekRepartitionPercentProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLeekRepartitionPercent(double myLeekRepartitionPercent){
		this.leekRepartitionPercentProperty().set(myLeekRepartitionPercent);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLeekRepartitionPercent(final double myLeekRepartitionPercent) {
		updateLeekRepartitionPercent(myLeekRepartitionPercent, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedFinalConcentrationProperty(){
		if (this.prescribedFinalConcentrationProperty == null) {
			this.prescribedFinalConcentrationProperty = new SimpleDoubleProperty(gazConfiguration.getPrescribedFinalConcentration());
			this.prescribedFinalConcentrationProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setPrescribedFinalConcentration((Double) arg2);
				}
			});
		}
		return this.prescribedFinalConcentrationProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedFinalConcentration(){
		return prescribedFinalConcentrationProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedFinalConcentration(double myPrescribedFinalConcentration){
		this.prescribedFinalConcentrationProperty().set(myPrescribedFinalConcentration);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedFinalConcentration(final double myPrescribedFinalConcentration, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedFinalConcentration(myPrescribedFinalConcentration);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedFinalConcentration(myPrescribedFinalConcentration);
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
	public void updatePrescribedFinalConcentration(final double myPrescribedFinalConcentration) {
		updatePrescribedFinalConcentration(myPrescribedFinalConcentration, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedInitialConcentrationProperty(){
		if (this.prescribedInitialConcentrationProperty == null) {
			this.prescribedInitialConcentrationProperty = new SimpleDoubleProperty(gazConfiguration.getPrescribedInitialConcentration());
			this.prescribedInitialConcentrationProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setPrescribedInitialConcentration((Double) arg2);
				}
			});
		}
		return this.prescribedInitialConcentrationProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedInitialConcentration(){
		return prescribedInitialConcentrationProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedInitialConcentration(double myPrescribedInitialConcentration){
		this.prescribedInitialConcentrationProperty().set(myPrescribedInitialConcentration);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedInitialConcentration(final double myPrescribedInitialConcentration, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedInitialConcentration(myPrescribedInitialConcentration);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedInitialConcentration(myPrescribedInitialConcentration);
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
	public void updatePrescribedInitialConcentration(final double myPrescribedInitialConcentration) {
		updatePrescribedInitialConcentration(myPrescribedInitialConcentration, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty prescribedRetentionProperty(){
		if (this.prescribedRetentionProperty == null) {
			this.prescribedRetentionProperty = new SimpleDoubleProperty(gazConfiguration.getPrescribedRetention());
			this.prescribedRetentionProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setPrescribedRetention((Double) arg2);
				}
			});
		}
		return this.prescribedRetentionProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedRetention(){
		return prescribedRetentionProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedRetention(double myPrescribedRetention){
		this.prescribedRetentionProperty().set(myPrescribedRetention);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updatePrescribedRetention(final double myPrescribedRetention, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setPrescribedRetention(myPrescribedRetention);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setPrescribedRetention(myPrescribedRetention);
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
	public void updatePrescribedRetention(final double myPrescribedRetention) {
		updatePrescribedRetention(myPrescribedRetention, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return projectProperty;
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
				gazConfiguration.setProject(myProject == null ? null : myProject.getBean());
			} else {
				this.projectProperty().set(myProject);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateProject(final Project myProject) {
		updateProject(myProject, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return this.retentionGoalProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRetentionGoal(){
		return retentionGoalProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRetentionGoal(double myRetentionGoal){
		this.retentionGoalProperty().set(myRetentionGoal);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRetentionGoal(final double myRetentionGoal) {
		updateRetentionGoal(myRetentionGoal, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
			this.slowUnloadingProperty = new SimpleBooleanProperty(gazConfiguration.isSlowUnloading());
			this.slowUnloadingProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					gazConfiguration.setSlowUnloading((Boolean) arg2);
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
	public DoubleProperty slowUnloadingValueProperty(){
		if (this.slowUnloadingValueProperty == null) {
			this.slowUnloadingValueProperty = new SimpleDoubleProperty(gazConfiguration.getSlowUnloadingValue());
			this.slowUnloadingValueProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setSlowUnloadingValue((Double) arg2);
				}
			});
		}
		return this.slowUnloadingValueProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getSlowUnloadingValue(){
		return slowUnloadingValueProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSlowUnloadingValue(double mySlowUnloadingValue){
		this.slowUnloadingValueProperty().set(mySlowUnloadingValue);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSlowUnloadingValue(final double mySlowUnloadingValue) {
		updateSlowUnloadingValue(mySlowUnloadingValue, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty totalLoadToInstallProperty(){
		if (this.totalLoadToInstallProperty == null) {
			this.totalLoadToInstallProperty = new SimpleDoubleProperty(gazConfiguration.getTotalLoadToInstall());
			this.totalLoadToInstallProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					gazConfiguration.setTotalLoadToInstall((Double) arg2);
				}
			});
		}
		return this.totalLoadToInstallProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getTotalLoadToInstall(){
		return totalLoadToInstallProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTotalLoadToInstall(double myTotalLoadToInstall){
		this.totalLoadToInstallProperty().set(myTotalLoadToInstall);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateTotalLoadToInstall(final double myTotalLoadToInstall, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setTotalLoadToInstall(myTotalLoadToInstall);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setTotalLoadToInstall(myTotalLoadToInstall);
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
	public void updateTotalLoadToInstall(final double myTotalLoadToInstall) {
		updateTotalLoadToInstall(myTotalLoadToInstall, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		}
		return updateDateProperty;
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
				gazConfiguration.setUpdateDate(myUpdateDate);
			} else {
				this.updateDateProperty().set(myUpdateDate);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDate(final java.util.Date myUpdateDate) {
		updateUpdateDate(myUpdateDate, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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

	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getGazConfigurationBean() != null ? serializer.outputString(this.toDomXML()) : "";
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Element toDomXML(){
		Element xmlElement = new Element("GazConfiguration");
		xmlElement.setAttribute(new Attribute("forcedGazWeight", String.valueOf(getForcedGazWeight())));
		xmlElement.setAttribute(new Attribute("totalLoadToInstall", String.valueOf(getTotalLoadToInstall())));
		xmlElement.setAttribute(new Attribute("slowUnloadingValue", String.valueOf(getSlowUnloadingValue())));
		xmlElement.setAttribute(new Attribute("leekRepartitionPercent", String.valueOf(getLeekRepartitionPercent())));
		xmlElement.setAttribute(new Attribute("prescribedRetention", String.valueOf(getPrescribedRetention())));
		xmlElement.setAttribute(new Attribute("droppedFloorFull", String.valueOf(isDroppedFloorFull())));
		xmlElement.setAttribute(new Attribute("slowUnloading", String.valueOf(isSlowUnloading())));
		xmlElement.setAttribute(new Attribute("installedInitialConcentration", String.valueOf(getInstalledInitialConcentration())));
		xmlElement.setAttribute(new Attribute("chosenInitialConcentration", String.valueOf(getChosenInitialConcentration())));
		xmlElement.setAttribute(new Attribute("boundInitialConcentration", String.valueOf(isBoundInitialConcentration())));
		xmlElement.setAttribute(new Attribute("prescribedFinalConcentration", String.valueOf(getPrescribedFinalConcentration())));
		xmlElement.setAttribute(new Attribute("chosenFinalConcentration", String.valueOf(getChosenFinalConcentration())));
		xmlElement.setAttribute(new Attribute("droppedCeilFull", String.valueOf(isDroppedCeilFull())));
		xmlElement.setAttribute(new Attribute("retentionGoal", String.valueOf(getRetentionGoal())));
		xmlElement.setAttribute(new Attribute("prescribedInitialConcentration", String.valueOf(getPrescribedInitialConcentration())));
		xmlElement.setAttribute(new Attribute("retentionInterface", String.valueOf(isRetentionInterface())));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		
		if (getGaz() != null)
			xmlElement.setAttribute("gaz", String.valueOf(getGaz().getId()));
		if (!getBottleConfigurations().isEmpty()) {
			Element bottleConfigurations = new Element("bottleConfigurations");
			for (BottleConfiguration tmp : getBottleConfigurations())
				bottleConfigurations.addContent(tmp.toXML());
			xmlElement.addContent(bottleConfigurations);
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

}
