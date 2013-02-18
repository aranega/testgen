package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.GazConfiguration;
import com.dooapp.firea.wrapper.BottleConfiguration;
import com.dooapp.firea.wrapper.Project;
import com.dooapp.firea.wrapper.Gaz;





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class GazConfigurationBuilder<BUILDER extends GazConfigurationBuilder<?>>
// Start of user code bloc for inerithance

// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private BottleConfiguration bottleconfigurations;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private java.util.Date creationDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean droppedCeilFull;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean droppedFloorFull;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Gaz gaz;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Long id;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Double leekRepartitionPercent;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Project project;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Double retentionGoal;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean retentionInterface;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean slowUnloading;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Double slowUnloadingValue;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private java.util.Date updateDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer version;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	GazBuilder<?> gazBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	ProjectBuilder<?> projectBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	BottleConfigurationBuilder<?> bottleConfigurationBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.inject.Inject
	java.util.Properties cfg;
	
	/**
	 * Just a helpful {@link DateFormat}
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.inject.Inject
	protected GazConfigurationBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected GazConfiguration createValue() {
		return new GazConfiguration();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazConfiguration build() throws NullPointerException {
		GazConfiguration result =  this.createValue() ;
		if (bottleconfigurations == null) {
			throw new NullPointerException("GazConfiguration must be linked to a BottleConfiguration which has not been set.");
		} else { 
			result.setBottleconfigurations(bottleconfigurations);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else { 
			result.setCreationDate(creationDate);
		}
		if (droppedCeilFull == null) {
			handleDefaultDroppedCeilFull(result);
		} else { 
			result.setDroppedCeilFull(droppedCeilFull);
		}
		if (droppedFloorFull == null) {
			handleDefaultDroppedFloorFull(result);
		} else { 
			result.setDroppedFloorFull(droppedFloorFull);
		}
		if (gaz == null) {
			throw new NullPointerException("GazConfiguration must be linked to a Gaz which has not been set.");
		} else { 
			result.setGaz(gaz);
		}
		if (id == null) {
			handleDefaultId(result);
		} else { 
			result.setId(id);
		}
		if (leekRepartitionPercent == null) {
			handleDefaultLeekRepartitionPercent(result);
		} else { 
			result.setLeekRepartitionPercent(leekRepartitionPercent);
		}
		if (project == null) {
			throw new NullPointerException("GazConfiguration must be linked to a Project which has not been set.");
		} else { 
			result.setProject(project);
		}
		if (retentionGoal == null) {
			handleDefaultRetentionGoal(result);
		} else { 
			result.setRetentionGoal(retentionGoal);
		}
		if (retentionInterface == null) {
			handleDefaultRetentionInterface(result);
		} else { 
			result.setRetentionInterface(retentionInterface);
		}
		if (slowUnloading == null) {
			handleDefaultSlowUnloading(result);
		} else { 
			result.setSlowUnloading(slowUnloading);
		}
		if (slowUnloadingValue == null) {
			handleDefaultSlowUnloadingValue(result);
		} else { 
			result.setSlowUnloadingValue(slowUnloadingValue);
		}
		if (updateDate == null) {
			handleDefaultUpdateDate(result);
		} else { 
			result.setUpdateDate(updateDate);
		}
		if (version == null) {
			handleDefaultVersion(result);
		} else { 
			result.setVersion(version);
		}
		return result;	
	}

	/*
	 * Generated getters and setters
	 */

	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultCreationDate(GazConfiguration result) {
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.GazConfiguration.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.GazConfiguration.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultDroppedCeilFull(GazConfiguration result) {
		result.setDroppedCeilFull(Boolean.valueOf(cfg.getProperty("defaultValue.GazConfiguration.droppedCeilFull", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultDroppedFloorFull(GazConfiguration result) {
		result.setDroppedFloorFull(Boolean.valueOf(cfg.getProperty("defaultValue.GazConfiguration.droppedFloorFull", "false")));
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultId(GazConfiguration result) {
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.GazConfiguration.id", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultLeekRepartitionPercent(GazConfiguration result) {
		result.setLeekRepartitionPercent(Double.valueOf(cfg.getProperty("defaultValue.GazConfiguration.leekRepartitionPercent", "0.0")));
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultRetentionGoal(GazConfiguration result) {
		result.setRetentionGoal(Double.valueOf(cfg.getProperty("defaultValue.GazConfiguration.retentionGoal", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultRetentionInterface(GazConfiguration result) {
		result.setRetentionInterface(Boolean.valueOf(cfg.getProperty("defaultValue.GazConfiguration.retentionInterface", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultSlowUnloading(GazConfiguration result) {
		result.setSlowUnloading(Boolean.valueOf(cfg.getProperty("defaultValue.GazConfiguration.slowUnloading", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultSlowUnloadingValue(GazConfiguration result) {
		result.setSlowUnloadingValue(Double.valueOf(cfg.getProperty("defaultValue.GazConfiguration.slowUnloadingValue", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultUpdateDate(GazConfiguration result) {
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.GazConfiguration.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.GazConfiguration.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultVersion(GazConfiguration result) {
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.GazConfiguration.version", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER bottleconfigurations(BottleConfiguration myBottleconfigurations) {
		this.bottleconfigurations = myBottleconfigurations;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER creationDate(java.util.Date myCreationDate) {
		this.creationDate = myCreationDate;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER droppedCeilFull(Boolean myDroppedCeilFull) {
		this.droppedCeilFull = myDroppedCeilFull;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER droppedFloorFull(Boolean myDroppedFloorFull) {
		this.droppedFloorFull = myDroppedFloorFull;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER gaz(Gaz myGaz) {
		this.gaz = myGaz;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER id(Long myId) {
		this.id = myId;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER leekRepartitionPercent(Double myLeekRepartitionPercent) {
		this.leekRepartitionPercent = myLeekRepartitionPercent;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER project(Project myProject) {
		this.project = myProject;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER retentionGoal(Double myRetentionGoal) {
		this.retentionGoal = myRetentionGoal;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER retentionInterface(Boolean myRetentionInterface) {
		this.retentionInterface = myRetentionInterface;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER slowUnloading(Boolean mySlowUnloading) {
		this.slowUnloading = mySlowUnloading;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER slowUnloadingValue(Double mySlowUnloadingValue) {
		this.slowUnloadingValue = mySlowUnloadingValue;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER updateDate(java.util.Date myUpdateDate) {
		this.updateDate = myUpdateDate;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER version(Integer myVersion) {
		this.version = myVersion;
		return (BUILDER) this;
	}

}
