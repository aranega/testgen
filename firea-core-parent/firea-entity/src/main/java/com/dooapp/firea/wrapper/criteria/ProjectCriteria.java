package com.dooapp.firea.wrapper.criteria;

import com.dooapp.firea.entity.criteria.ProjectCriteriaInstance;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;


import com.dooapp.firea.enumeration.ProjectKind;
import com.dooapp.firea.enumeration.ProjectStatus;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
//@BeanClass(ProjectCriteriaBean.class)
public class ProjectCriteria 
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
	private ObjectProperty<ProjectStatus> statusProperty;
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
	private StringProperty descriptionProperty;
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
	private ObjectProperty<ProjectKind> kindProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty nameDoProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StringProperty referenceProperty;
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
	private ProjectCriteriaInstance projectCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ProjectCriteria(ProjectCriteriaInstance entity) {
		
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.projectCriteria = entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ProjectCriteriaInstance getBean() {
		return  this.projectCriteria;
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
	public ObjectProperty<ProjectStatus> statusProperty() {
		if (statusProperty == null) {
			statusProperty = createStatusProperty();
			getBean().setStatus(getBean().getStatus());
			statusProperty.addListener(new ChangeListener<ProjectStatus>() {
				@Override
				public void changed(ObservableValue<? extends ProjectStatus> arg0, ProjectStatus arg1, ProjectStatus arg2) {
					getBean().setStatus(arg2);
				}
			});
		}
		return statusProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<ProjectStatus> createStatusProperty(){
		return  new SimpleObjectProperty<ProjectStatus>(getBean().getStatus());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ProjectStatus getStatus(){
		return statusProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setStatus(ProjectStatus myStatus){
		if (statusProperty == null) {
				getBean().setStatus(myStatus);
			} else {
				this.statusProperty().set(myStatus);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateStatus(final ProjectStatus myStatus) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setStatus(myStatus);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setStatus(myStatus);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateStatusAndWait(final ProjectStatus myStatus) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setStatus(myStatus);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setStatus(myStatus);
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
	public ObjectProperty<java.util.Date> creationDateMaxProperty() {
		if (creationDateMaxProperty == null) {
			creationDateMaxProperty = createCreationDateMaxProperty();
			getBean().setCreationDateMax(getBean().getCreationDateMax());
			creationDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setCreationDateMax(arg2);
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
	protected ObjectProperty<java.util.Date> createCreationDateMaxProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getCreationDateMax());
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
				getBean().setCreationDateMax(myCreationDateMax);
			} else {
				this.creationDateMaxProperty().set(myCreationDateMax);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateMax(final java.util.Date myCreationDateMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDateMax(myCreationDateMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDateMax(myCreationDateMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateMaxAndWait(final java.util.Date myCreationDateMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDateMax(myCreationDateMax);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDateMax(myCreationDateMax);
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
	public ObjectProperty<java.util.Date> creationDateMinProperty() {
		if (creationDateMinProperty == null) {
			creationDateMinProperty = createCreationDateMinProperty();
			getBean().setCreationDateMin(getBean().getCreationDateMin());
			creationDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setCreationDateMin(arg2);
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
	protected ObjectProperty<java.util.Date> createCreationDateMinProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getCreationDateMin());
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
				getBean().setCreationDateMin(myCreationDateMin);
			} else {
				this.creationDateMinProperty().set(myCreationDateMin);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateMin(final java.util.Date myCreationDateMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDateMin(myCreationDateMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDateMin(myCreationDateMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCreationDateMinAndWait(final java.util.Date myCreationDateMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCreationDateMin(myCreationDateMin);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCreationDateMin(myCreationDateMin);
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
	public StringProperty descriptionProperty(){
		if (this.descriptionProperty == null) {
			this.descriptionProperty = createDescriptionProperty();
			getBean().setDescription(getBean().getDescription());
			this.descriptionProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setDescription((String) arg2);
				}
			});
		}
		return this.descriptionProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createDescriptionProperty(){
		return new SimpleStringProperty(getBean().getDescription());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getDescription(){
		return descriptionProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDescription(String myDescription){
		this.descriptionProperty().set(myDescription);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDescription(final String myDescription) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDescription(myDescription);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDescription(myDescription);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDescriptionAndWait(final String myDescription) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDescription(myDescription);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDescription(myDescription);
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
	public LongProperty idMaxProperty(){
		if (this.idMaxProperty == null) {
			this.idMaxProperty = createIdMaxProperty();
			getBean().setIdMax(getBean().getIdMax());
			this.idMaxProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setIdMax((Long) arg2);
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
	protected LongProperty createIdMaxProperty(){
		return new SimpleLongProperty(getBean().getIdMax());
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
	public void updateIdMax(final Long myIdMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIdMax(myIdMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIdMax(myIdMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIdMaxAndWait(final Long myIdMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIdMax(myIdMax);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIdMax(myIdMax);
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
	public LongProperty idMinProperty(){
		if (this.idMinProperty == null) {
			this.idMinProperty = createIdMinProperty();
			getBean().setIdMin(getBean().getIdMin());
			this.idMinProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setIdMin((Long) arg2);
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
	protected LongProperty createIdMinProperty(){
		return new SimpleLongProperty(getBean().getIdMin());
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
	public void updateIdMin(final Long myIdMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIdMin(myIdMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIdMin(myIdMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateIdMinAndWait(final Long myIdMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setIdMin(myIdMin);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setIdMin(myIdMin);
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
	public ObjectProperty<ProjectKind> kindProperty() {
		if (kindProperty == null) {
			kindProperty = createKindProperty();
			getBean().setKind(getBean().getKind());
			kindProperty.addListener(new ChangeListener<ProjectKind>() {
				@Override
				public void changed(ObservableValue<? extends ProjectKind> arg0, ProjectKind arg1, ProjectKind arg2) {
					getBean().setKind(arg2);
				}
			});
		}
		return kindProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<ProjectKind> createKindProperty(){
		return  new SimpleObjectProperty<ProjectKind>(getBean().getKind());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ProjectKind getKind(){
		return kindProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setKind(ProjectKind myKind){
		if (kindProperty == null) {
				getBean().setKind(myKind);
			} else {
				this.kindProperty().set(myKind);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateKind(final ProjectKind myKind) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setKind(myKind);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setKind(myKind);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateKindAndWait(final ProjectKind myKind) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setKind(myKind);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setKind(myKind);
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
	public StringProperty nameDoProperty(){
		if (this.nameDoProperty == null) {
			this.nameDoProperty = createNameDoProperty();
			getBean().setNameDo(getBean().getNameDo());
			this.nameDoProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setNameDo((String) arg2);
				}
			});
		}
		return this.nameDoProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createNameDoProperty(){
		return new SimpleStringProperty(getBean().getNameDo());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getNameDo(){
		return nameDoProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setNameDo(String myNameDo){
		this.nameDoProperty().set(myNameDo);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNameDo(final String myNameDo) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNameDo(myNameDo);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNameDo(myNameDo);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateNameDoAndWait(final String myNameDo) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setNameDo(myNameDo);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setNameDo(myNameDo);
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
	public StringProperty referenceProperty(){
		if (this.referenceProperty == null) {
			this.referenceProperty = createReferenceProperty();
			getBean().setReference(getBean().getReference());
			this.referenceProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					getBean().setReference((String) arg2);
				}
			});
		}
		return this.referenceProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected StringProperty createReferenceProperty(){
		return new SimpleStringProperty(getBean().getReference());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getReference(){
		return referenceProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setReference(String myReference){
		this.referenceProperty().set(myReference);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateReference(final String myReference) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setReference(myReference);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setReference(myReference);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateReferenceAndWait(final String myReference) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setReference(myReference);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setReference(myReference);
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
	public ObjectProperty<java.util.Date> updateDateMaxProperty() {
		if (updateDateMaxProperty == null) {
			updateDateMaxProperty = createUpdateDateMaxProperty();
			getBean().setUpdateDateMax(getBean().getUpdateDateMax());
			updateDateMaxProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setUpdateDateMax(arg2);
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
	protected ObjectProperty<java.util.Date> createUpdateDateMaxProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getUpdateDateMax());
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
				getBean().setUpdateDateMax(myUpdateDateMax);
			} else {
				this.updateDateMaxProperty().set(myUpdateDateMax);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateMax(final java.util.Date myUpdateDateMax) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDateMax(myUpdateDateMax);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDateMax(myUpdateDateMax);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateMaxAndWait(final java.util.Date myUpdateDateMax) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDateMax(myUpdateDateMax);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDateMax(myUpdateDateMax);
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
	public ObjectProperty<java.util.Date> updateDateMinProperty() {
		if (updateDateMinProperty == null) {
			updateDateMinProperty = createUpdateDateMinProperty();
			getBean().setUpdateDateMin(getBean().getUpdateDateMin());
			updateDateMinProperty.addListener(new ChangeListener<java.util.Date>() {
				@Override
				public void changed(ObservableValue<? extends java.util.Date> arg0, java.util.Date arg1, java.util.Date arg2) {
					getBean().setUpdateDateMin(arg2);
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
	protected ObjectProperty<java.util.Date> createUpdateDateMinProperty(){
		return  new SimpleObjectProperty<java.util.Date>(getBean().getUpdateDateMin());
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
				getBean().setUpdateDateMin(myUpdateDateMin);
			} else {
				this.updateDateMinProperty().set(myUpdateDateMin);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateMin(final java.util.Date myUpdateDateMin) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDateMin(myUpdateDateMin);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDateMin(myUpdateDateMin);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUpdateDateMinAndWait(final java.util.Date myUpdateDateMin) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setUpdateDateMin(myUpdateDateMin);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setUpdateDateMin(myUpdateDateMin);
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

}
