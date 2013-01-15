package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.GazConfiguration;
import com.dooapp.firea.wrapper.Project;
import com.dooapp.firea.wrapper.BottleConfiguration;
import com.dooapp.firea.wrapper.Gaz;
//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Class
 * <!-- Start of user code comment for GazConfiguration Builder
 * End of user code -->
 */

public class GazConfigurationBuilder<BUILDER extends GazConfigurationBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private java.util.Set<BottleConfiguration> bottleconfigurations;
	
	private java.util.Date creationDate;
	
	private Boolean droppedCeilFull;
	
	private Boolean droppedFloorFull;
	
	private Gaz gaz;
	
	private Long id;
	
	private Double leekRepartitionPercent;
	
	private Project project;
	
	private Double retentionGoal;
	
	private Boolean retentionInterface;
	
	private Boolean slowUnloading;
	
	private Double slowUnloadingValue;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	GazBuilder<?> gazBuilder;
	@javax.inject.Inject
	BottleConfigurationBuilder<?> bottleConfigurationBuilder;
	@javax.inject.Inject
	ProjectBuilder<?> projectBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for GazConfiguration getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected GazConfigurationBuilder() {
	}
	
	protected GazConfiguration createValue() {
		return new GazConfiguration();
	}
	
	/*
	 * <!-- Start of user code comment for GazConfiguration build method
	 * End of user code -->
	 */
	public GazConfiguration build() throws NullPointerException {
		GazConfiguration result =  this.createValue() ;
		if (bottleconfigurations == null) {
			handleDefaultBottleconfigurations(result);
		} else {
			result.bottleconfigurationsProperty().get().addAll(bottleconfigurations);
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
			handleDefaultGaz(result);
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
			handleDefaultProject(result);
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
	/*
	 * <!-- Start of user code comment for bottleconfigurations default method
	 * End of user code -->
	 */
	private void handleDefaultBottleconfigurations(GazConfiguration result) {
		//Start of user code default feature for handleDefaultBottleconfigurations
		//do nothing
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
	private void handleDefaultCreationDate(GazConfiguration result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.GazConfiguration.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.GazConfiguration.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for droppedCeilFull default method
	 * End of user code -->
	 */
	private void handleDefaultDroppedCeilFull(GazConfiguration result) {
		//Start of user code default feature for handleDefaultDroppedCeilFull
		result.setDroppedCeilFull(Boolean.valueOf(cfg.getProperty("defaultValue.GazConfiguration.droppedCeilFull", "false")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for droppedFloorFull default method
	 * End of user code -->
	 */
	private void handleDefaultDroppedFloorFull(GazConfiguration result) {
		//Start of user code default feature for handleDefaultDroppedFloorFull
		result.setDroppedFloorFull(Boolean.valueOf(cfg.getProperty("defaultValue.GazConfiguration.droppedFloorFull", "false")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for gaz default method
	 * End of user code -->
	 */
	private void handleDefaultGaz(GazConfiguration result) {
		//Start of user code default feature for handleDefaultGaz
		//result.setGaz(null);
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(GazConfiguration result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.GazConfiguration.id", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for leekRepartitionPercent default method
	 * End of user code -->
	 */
	private void handleDefaultLeekRepartitionPercent(GazConfiguration result) {
		//Start of user code default feature for handleDefaultLeekRepartitionPercent
		result.setLeekRepartitionPercent(Double.valueOf(cfg.getProperty("defaultValue.GazConfiguration.leekRepartitionPercent", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for project default method
	 * End of user code -->
	 */
	private void handleDefaultProject(GazConfiguration result) {
		//Start of user code default feature for handleDefaultProject
		result.setProject(projectBuilder.gazconfiguration(result).build());
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for retentionGoal default method
	 * End of user code -->
	 */
	private void handleDefaultRetentionGoal(GazConfiguration result) {
		//Start of user code default feature for handleDefaultRetentionGoal
		result.setRetentionGoal(Double.valueOf(cfg.getProperty("defaultValue.GazConfiguration.retentionGoal", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for retentionInterface default method
	 * End of user code -->
	 */
	private void handleDefaultRetentionInterface(GazConfiguration result) {
		//Start of user code default feature for handleDefaultRetentionInterface
		result.setRetentionInterface(Boolean.valueOf(cfg.getProperty("defaultValue.GazConfiguration.retentionInterface", "false")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for slowUnloading default method
	 * End of user code -->
	 */
	private void handleDefaultSlowUnloading(GazConfiguration result) {
		//Start of user code default feature for handleDefaultSlowUnloading
		result.setSlowUnloading(Boolean.valueOf(cfg.getProperty("defaultValue.GazConfiguration.slowUnloading", "false")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for slowUnloadingValue default method
	 * End of user code -->
	 */
	private void handleDefaultSlowUnloadingValue(GazConfiguration result) {
		//Start of user code default feature for handleDefaultSlowUnloadingValue
		result.setSlowUnloadingValue(Double.valueOf(cfg.getProperty("defaultValue.GazConfiguration.slowUnloadingValue", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(GazConfiguration result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.GazConfiguration.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.GazConfiguration.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(GazConfiguration result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.GazConfiguration.version", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for bottleconfigurations
	 * End of user code -->
	 */
	public BUILDER bottleconfigurations(BottleConfiguration... myBottleconfigurations) {
			this.bottleconfigurations = new java.util.HashSet<BottleConfiguration>(java.util.Arrays.asList(myBottleconfigurations));
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for creationDate
	 * End of user code -->
	 */
	public BUILDER creationDate(java.util.Date myCreationDate) {
			this.creationDate = myCreationDate;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for droppedCeilFull
	 * End of user code -->
	 */
	public BUILDER droppedCeilFull(Boolean myDroppedCeilFull) {
			this.droppedCeilFull = myDroppedCeilFull;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for droppedFloorFull
	 * End of user code -->
	 */
	public BUILDER droppedFloorFull(Boolean myDroppedFloorFull) {
			this.droppedFloorFull = myDroppedFloorFull;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for gaz
	 * End of user code -->
	 */
	public BUILDER gaz(Gaz myGaz) {
			this.gaz = myGaz;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for id
	 * End of user code -->
	 */
	public BUILDER id(Long myId) {
			this.id = myId;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for leekRepartitionPercent
	 * End of user code -->
	 */
	public BUILDER leekRepartitionPercent(Double myLeekRepartitionPercent) {
			this.leekRepartitionPercent = myLeekRepartitionPercent;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for project
	 * End of user code -->
	 */
	public BUILDER project(Project myProject) {
			this.project = myProject;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for retentionGoal
	 * End of user code -->
	 */
	public BUILDER retentionGoal(Double myRetentionGoal) {
			this.retentionGoal = myRetentionGoal;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for retentionInterface
	 * End of user code -->
	 */
	public BUILDER retentionInterface(Boolean myRetentionInterface) {
			this.retentionInterface = myRetentionInterface;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for slowUnloading
	 * End of user code -->
	 */
	public BUILDER slowUnloading(Boolean mySlowUnloading) {
			this.slowUnloading = mySlowUnloading;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for slowUnloadingValue
	 * End of user code -->
	 */
	public BUILDER slowUnloadingValue(Double mySlowUnloadingValue) {
			this.slowUnloadingValue = mySlowUnloadingValue;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for updateDate
	 * End of user code -->
	 */
	public BUILDER updateDate(java.util.Date myUpdateDate) {
			this.updateDate = myUpdateDate;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for version
	 * End of user code -->
	 */
	public BUILDER version(Integer myVersion) {
			this.version = myVersion;
			return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
