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
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.BooleanProperty;
import com.dooapp.firea.entity.BottleConfigurationBean;




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
@BeanClass(GazConfigurationBean.class)
public class GazConfiguration
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
	private ObjectProperty<ObservableList<BottleConfiguration>> bottleconfigurationsProperty;
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
	private LongProperty idProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty leekRepartitionPercentProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ObjectProperty<Project> projectProperty;
	/**
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
	public ReadOnlyObjectProperty<ObservableList<BottleConfiguration>> bottleconfigurationsProperty() {
		if (bottleconfigurationsProperty == null) {
			bottleconfigurationsProperty = createBottleconfigurations();
			bottleconfigurationsProperty.get().addListener(new javafx.collections.ListChangeListener<BottleConfiguration>() {
				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends BottleConfiguration> change) {
					while (change.next()) {
						if (change.getAddedSize() > 0) {
							for (BottleConfiguration tmp : change.getAddedSubList()) {
								getBean().addBottleconfigurations(tmp == null ? null : tmp.getBean());
							}
						}
						if (change.getRemovedSize() > 0) {
							for (BottleConfiguration tmp : change.getRemoved()) {
								getBean().getBottleconfigurations().remove(tmp == null ? null : tmp.getBean());
							}
						}
					}
				}
			});
		}
		return bottleconfigurationsProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<ObservableList<BottleConfiguration>> createBottleconfigurations()
	{ 
		ObjectProperty<ObservableList<BottleConfiguration>> list = new SimpleObjectProperty<ObservableList<BottleConfiguration>>(
					FXCollections.<BottleConfiguration> observableArrayList());
		for (BottleConfigurationBean tmp : getBean().getBottleconfigurations()) {
			list.get().add(tmp.getWrapper());
		}
		return list; 
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObservableList<BottleConfiguration> getBottleconfigurations()
	{ 
		return bottleconfigurationsProperty().get(); 
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
	public BooleanProperty droppedCeilFullProperty(){
		if (this.droppedCeilFullProperty == null) {
			this.droppedCeilFullProperty = createDroppedCeilFullProperty();
			getBean().setDroppedCeilFull(getBean().isDroppedCeilFull());
			this.droppedCeilFullProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setDroppedCeilFull((Boolean) arg2);
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
	protected BooleanProperty createDroppedCeilFullProperty(){
		return new SimpleBooleanProperty(getBean().isDroppedCeilFull());
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
	public void updateDroppedCeilFull(final Boolean myDroppedCeilFull) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedCeilFull(myDroppedCeilFull);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedCeilFull(myDroppedCeilFull);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedCeilFullAndWait(final Boolean myDroppedCeilFull) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedCeilFull(myDroppedCeilFull);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedCeilFull(myDroppedCeilFull);
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
	public BooleanProperty droppedFloorFullProperty(){
		if (this.droppedFloorFullProperty == null) {
			this.droppedFloorFullProperty = createDroppedFloorFullProperty();
			getBean().setDroppedFloorFull(getBean().isDroppedFloorFull());
			this.droppedFloorFullProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setDroppedFloorFull((Boolean) arg2);
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
	protected BooleanProperty createDroppedFloorFullProperty(){
		return new SimpleBooleanProperty(getBean().isDroppedFloorFull());
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
	public void updateDroppedFloorFull(final Boolean myDroppedFloorFull) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedFloorFull(myDroppedFloorFull);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedFloorFull(myDroppedFloorFull);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDroppedFloorFullAndWait(final Boolean myDroppedFloorFull) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDroppedFloorFull(myDroppedFloorFull);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDroppedFloorFull(myDroppedFloorFull);
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
	public DoubleProperty leekRepartitionPercentProperty(){
		if (this.leekRepartitionPercentProperty == null) {
			this.leekRepartitionPercentProperty = createLeekRepartitionPercentProperty();
			getBean().setLeekRepartitionPercent(getBean().getLeekRepartitionPercent());
			this.leekRepartitionPercentProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setLeekRepartitionPercent((Double) arg2);
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
	protected DoubleProperty createLeekRepartitionPercentProperty(){
		return new SimpleDoubleProperty(getBean().getLeekRepartitionPercent());
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
	public void updateLeekRepartitionPercent(final Double myLeekRepartitionPercent) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLeekRepartitionPercent(myLeekRepartitionPercent);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLeekRepartitionPercent(myLeekRepartitionPercent);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateLeekRepartitionPercentAndWait(final Double myLeekRepartitionPercent) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setLeekRepartitionPercent(myLeekRepartitionPercent);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setLeekRepartitionPercent(myLeekRepartitionPercent);
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
	public ObjectProperty<Project> projectProperty() {
		if (projectProperty == null) {
			projectProperty = createProjectProperty();
			getBean().setProject(getBean().getProject() == null ? null : getBean()
							.getProject());
			projectProperty.addListener(new ChangeListener<Project>() {
				@Override
				public void changed(ObservableValue<? extends Project> obj, Project oldValue, Project newValue) {
					getBean().setProject(newValue == null ? null : newValue.getBean());
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
	protected ObjectProperty<Project> createProjectProperty(){
		return new SimpleObjectProperty<Project>(getBean().getProject() == null ? null : getBean()
							.getProject().getWrapper());
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
				getBean().setProject(myProject == null ? null : myProject.getBean());
			} else {
				this.projectProperty().set(myProject);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateProject(final Project myProject) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setProject(myProject);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setProject(myProject);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateProjectAndWait(final Project myProject) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setProject(myProject);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setProject(myProject);
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
	public DoubleProperty retentionGoalProperty(){
		if (this.retentionGoalProperty == null) {
			this.retentionGoalProperty = createRetentionGoalProperty();
			getBean().setRetentionGoal(getBean().getRetentionGoal());
			this.retentionGoalProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setRetentionGoal((Double) arg2);
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
	protected DoubleProperty createRetentionGoalProperty(){
		return new SimpleDoubleProperty(getBean().getRetentionGoal());
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
	public void updateRetentionGoal(final Double myRetentionGoal) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionGoal(myRetentionGoal);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionGoal(myRetentionGoal);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRetentionGoalAndWait(final Double myRetentionGoal) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionGoal(myRetentionGoal);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionGoal(myRetentionGoal);
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
	public BooleanProperty retentionInterfaceProperty(){
		if (this.retentionInterfaceProperty == null) {
			this.retentionInterfaceProperty = createRetentionInterfaceProperty();
			getBean().setRetentionInterface(getBean().isRetentionInterface());
			this.retentionInterfaceProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setRetentionInterface((Boolean) arg2);
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
	protected BooleanProperty createRetentionInterfaceProperty(){
		return new SimpleBooleanProperty(getBean().isRetentionInterface());
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
	public void updateRetentionInterface(final Boolean myRetentionInterface) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionInterface(myRetentionInterface);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionInterface(myRetentionInterface);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateRetentionInterfaceAndWait(final Boolean myRetentionInterface) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setRetentionInterface(myRetentionInterface);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setRetentionInterface(myRetentionInterface);
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
	public BooleanProperty slowUnloadingProperty(){
		if (this.slowUnloadingProperty == null) {
			this.slowUnloadingProperty = createSlowUnloadingProperty();
			getBean().setSlowUnloading(getBean().isSlowUnloading());
			this.slowUnloadingProperty.addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					getBean().setSlowUnloading((Boolean) arg2);
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
	protected BooleanProperty createSlowUnloadingProperty(){
		return new SimpleBooleanProperty(getBean().isSlowUnloading());
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
	public void updateSlowUnloading(final Boolean mySlowUnloading) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloading(mySlowUnloading);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloading(mySlowUnloading);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSlowUnloadingAndWait(final Boolean mySlowUnloading) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloading(mySlowUnloading);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloading(mySlowUnloading);
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
	public DoubleProperty slowUnloadingValueProperty(){
		if (this.slowUnloadingValueProperty == null) {
			this.slowUnloadingValueProperty = createSlowUnloadingValueProperty();
			getBean().setSlowUnloadingValue(getBean().getSlowUnloadingValue());
			this.slowUnloadingValueProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setSlowUnloadingValue((Double) arg2);
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
	protected DoubleProperty createSlowUnloadingValueProperty(){
		return new SimpleDoubleProperty(getBean().getSlowUnloadingValue());
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
	public void updateSlowUnloadingValue(final Double mySlowUnloadingValue) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloadingValue(mySlowUnloadingValue);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloadingValue(mySlowUnloadingValue);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateSlowUnloadingValueAndWait(final Double mySlowUnloadingValue) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setSlowUnloadingValue(mySlowUnloadingValue);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setSlowUnloadingValue(mySlowUnloadingValue);
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
		Element xmlElement = new Element("GazConfiguration");
		if (this.getBean().getUUID() != null)
			xmlElement.setAttribute(new Attribute("uuid", this.getBean().getUUID()));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		xmlElement.setAttribute(new Attribute("droppedCeilFull", String.valueOf(isDroppedCeilFull())));
		xmlElement.setAttribute(new Attribute("droppedFloorFull", String.valueOf(isDroppedFloorFull())));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		xmlElement.setAttribute(new Attribute("leekRepartitionPercent", String.valueOf(getLeekRepartitionPercent())));
		xmlElement.setAttribute(new Attribute("retentionGoal", String.valueOf(getRetentionGoal())));
		xmlElement.setAttribute(new Attribute("retentionInterface", String.valueOf(isRetentionInterface())));
		xmlElement.setAttribute(new Attribute("slowUnloading", String.valueOf(isSlowUnloading())));
		xmlElement.setAttribute(new Attribute("slowUnloadingValue", String.valueOf(getSlowUnloadingValue())));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		
		if (!getBottleconfigurations().isEmpty()) {
			Element bottleconfigurations = new Element("bottleconfigurations");
			for (BottleConfiguration tmp : getBottleconfigurations())
				bottleconfigurations.addContent(new Element("BottleConfiguration", String.valueOf(tmp.getId())));
			xmlElement.addContent(bottleconfigurations);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public void accept(FireaVisitor visitor) {
		visitor.visitBeforeGazConfiguration(this);
		
		this.visitInternal(visitor);
		
		visitor.visitAfterGazConfiguration(this);
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
