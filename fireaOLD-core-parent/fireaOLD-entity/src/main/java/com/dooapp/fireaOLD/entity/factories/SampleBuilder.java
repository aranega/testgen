package com.dooapp.fireaOLD.entity.factories;


import com.dooapp.fireaOLD.wrapper.Sample;
import com.dooapp.fireaOLD.wrapper.Step;
import com.dooapp.fireaOLD.wrapper.Project;
import com.dooapp.fireaOLD.entity.AirPressureCalculationMethod;
import com.dooapp.fireaOLD.entity.SampleStatus;
import com.dooapp.fireaOLD.entity.BeaufortScale;
//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Class
 * <!-- Start of user code comment for Sample Builder
 * End of user code -->
 */

public class SampleBuilder<BUILDER extends SampleBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private Integer airPressure;
	
	private com.dooapp.fireaOLD.entity.AirPressureCalculationMethod airPressureCalculationMethod;
	
	private com.dooapp.fireaOLD.entity.BeaufortScale beaufortScale;
	
	private java.util.Date creationDate;
	
	private java.util.Date date;
	
	private Long id;
	
	private String name;
	
	private Double phiEPercent;
	
	private Double phiIPercent;
	
	private Project project;
	
	private Double roE;
	
	private Double roI;
	
	private com.dooapp.fireaOLD.entity.SampleStatus status;
	
	private java.util.Set<Step> step;
	
	private Double tetaE;
	
	private Double tetaI;
	
	private java.util.Date updateDate;
	
	private Integer version;
	
	private Double windMeasure;
	@javax.inject.Inject
	StepBuilder<?> stepBuilder;
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
	 * <!-- Start of user code comment for Sample getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected SampleBuilder() {
	}
	
	protected Sample createValue() {
		return new Sample();
	}
	
	/*
	 * <!-- Start of user code comment for Sample build method
	 * End of user code -->
	 */
	public Sample build() throws NullPointerException {
		Sample result =  this.createValue() ;
		if (airPressure == null) {
			handleDefaultAirPressure(result);
		} else {
			result.setAirPressure(airPressure);
		}
		if (airPressureCalculationMethod == null) {
			handleDefaultAirPressureCalculationMethod(result);
		} else {
			result.setAirPressureCalculationMethod(airPressureCalculationMethod);
		}
		if (beaufortScale == null) {
			handleDefaultBeaufortScale(result);
		} else {
			result.setBeaufortScale(beaufortScale);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else {
			result.setCreationDate(creationDate);
		}
		if (date == null) {
			handleDefaultDate(result);
		} else {
			result.setDate(date);
		}
		if (id == null) {
			handleDefaultId(result);
		} else {
			result.setId(id);
		}
		if (name == null) {
			handleDefaultName(result);
		} else {
			result.setName(name);
		}
		if (phiEPercent == null) {
			handleDefaultPhiEPercent(result);
		} else {
			result.setPhiEPercent(phiEPercent);
		}
		if (phiIPercent == null) {
			handleDefaultPhiIPercent(result);
		} else {
			result.setPhiIPercent(phiIPercent);
		}
		if (project == null) {
			handleDefaultProject(result);
		} else {
			result.setProject(project);
		}
		if (roE == null) {
			handleDefaultRoE(result);
		} else {
			result.setRoE(roE);
		}
		if (roI == null) {
			handleDefaultRoI(result);
		} else {
			result.setRoI(roI);
		}
		if (status == null) {
			handleDefaultStatus(result);
		} else {
			result.setStatus(status);
		}
		if (step == null) {
			handleDefaultStep(result);
		} else {
			result.stepProperty().get().addAll(step);
		}
		if (tetaE == null) {
			handleDefaultTetaE(result);
		} else {
			result.setTetaE(tetaE);
		}
		if (tetaI == null) {
			handleDefaultTetaI(result);
		} else {
			result.setTetaI(tetaI);
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
		if (windMeasure == null) {
			handleDefaultWindMeasure(result);
		} else {
			result.setWindMeasure(windMeasure);
		}
		return result;	
	}

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for airPressure default method
	 * End of user code -->
	 */
	private void handleDefaultAirPressure(Sample result) {
		//Start of user code default feature for handleDefaultAirPressure
		result.setAirPressure(Integer.valueOf(cfg.getProperty("defaultValue.Sample.airPressure", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for airPressureCalculationMethod default method
	 * End of user code -->
	 */
	private void handleDefaultAirPressureCalculationMethod(Sample result) {
		//Start of user code default feature for handleDefaultAirPressureCalculationMethod
		result.setAirPressureCalculationMethod(AirPressureCalculationMethod.valueOf(cfg.getProperty("defaultValue.Sample.airPressureCalculationMethod", "MEASUREs")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for beaufortScale default method
	 * End of user code -->
	 */
	private void handleDefaultBeaufortScale(Sample result) {
		//Start of user code default feature for handleDefaultBeaufortScale
		result.setBeaufortScale(BeaufortScale.valueOf(cfg.getProperty("defaultValue.Sample.beaufortScale", "FORCE0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
	private void handleDefaultCreationDate(Sample result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Sample.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Sample.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for date default method
	 * End of user code -->
	 */
	private void handleDefaultDate(Sample result) {
		//Start of user code default feature for handleDefaultDate
		try {
				result.setDate(cfg.getProperty("defaultValue.Sample.date") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Sample.date")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(Sample result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Sample.id", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for name default method
	 * End of user code -->
	 */
	private void handleDefaultName(Sample result) {
		//Start of user code default feature for handleDefaultName
		result.setName(cfg.getProperty("defaultValue.Sample.name"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for phiEPercent default method
	 * End of user code -->
	 */
	private void handleDefaultPhiEPercent(Sample result) {
		//Start of user code default feature for handleDefaultPhiEPercent
		result.setPhiEPercent(Double.valueOf(cfg.getProperty("defaultValue.Sample.phiEPercent", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for phiIPercent default method
	 * End of user code -->
	 */
	private void handleDefaultPhiIPercent(Sample result) {
		//Start of user code default feature for handleDefaultPhiIPercent
		result.setPhiIPercent(Double.valueOf(cfg.getProperty("defaultValue.Sample.phiIPercent", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for project default method
	 * End of user code -->
	 */
	private void handleDefaultProject(Sample result) {
		//Start of user code default feature for handleDefaultProject
		result.setProject(projectBuilder.build());
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for roE default method
	 * End of user code -->
	 */
	private void handleDefaultRoE(Sample result) {
		//Start of user code default feature for handleDefaultRoE
		result.setRoE(Double.valueOf(cfg.getProperty("defaultValue.Sample.roE", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for roI default method
	 * End of user code -->
	 */
	private void handleDefaultRoI(Sample result) {
		//Start of user code default feature for handleDefaultRoI
		result.setRoI(Double.valueOf(cfg.getProperty("defaultValue.Sample.roI", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for status default method
	 * End of user code -->
	 */
	private void handleDefaultStatus(Sample result) {
		//Start of user code default feature for handleDefaultStatus
		result.setStatus(SampleStatus.valueOf(cfg.getProperty("defaultValue.Sample.status", "NO_STARTED")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for step default method
	 * End of user code -->
	 */
	private void handleDefaultStep(Sample result) {
		//Start of user code default feature for handleDefaultStep
		//do nothing
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for tetaE default method
	 * End of user code -->
	 */
	private void handleDefaultTetaE(Sample result) {
		//Start of user code default feature for handleDefaultTetaE
		result.setTetaE(Double.valueOf(cfg.getProperty("defaultValue.Sample.tetaE", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for tetaI default method
	 * End of user code -->
	 */
	private void handleDefaultTetaI(Sample result) {
		//Start of user code default feature for handleDefaultTetaI
		result.setTetaI(Double.valueOf(cfg.getProperty("defaultValue.Sample.tetaI", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(Sample result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Sample.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Sample.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(Sample result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Sample.version", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for windMeasure default method
	 * End of user code -->
	 */
	private void handleDefaultWindMeasure(Sample result) {
		//Start of user code default feature for handleDefaultWindMeasure
		result.setWindMeasure(Double.valueOf(cfg.getProperty("defaultValue.Sample.windMeasure", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for airPressure
	 * End of user code -->
	 */
	public BUILDER airPressure(Integer myAirPressure) {
			this.airPressure = myAirPressure;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for airPressureCalculationMethod
	 * End of user code -->
	 */
	public BUILDER airPressureCalculationMethod(com.dooapp.fireaOLD.entity.AirPressureCalculationMethod myAirPressureCalculationMethod) {
			this.airPressureCalculationMethod = myAirPressureCalculationMethod;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for beaufortScale
	 * End of user code -->
	 */
	public BUILDER beaufortScale(com.dooapp.fireaOLD.entity.BeaufortScale myBeaufortScale) {
			this.beaufortScale = myBeaufortScale;
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
	 * <!-- Start of user code comment for date
	 * End of user code -->
	 */
	public BUILDER date(java.util.Date myDate) {
			this.date = myDate;
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
	 * <!-- Start of user code comment for name
	 * End of user code -->
	 */
	public BUILDER name(String myName) {
			this.name = myName;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for phiEPercent
	 * End of user code -->
	 */
	public BUILDER phiEPercent(Double myPhiEPercent) {
			this.phiEPercent = myPhiEPercent;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for phiIPercent
	 * End of user code -->
	 */
	public BUILDER phiIPercent(Double myPhiIPercent) {
			this.phiIPercent = myPhiIPercent;
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
	 * <!-- Start of user code comment for roE
	 * End of user code -->
	 */
	public BUILDER roE(Double myRoE) {
			this.roE = myRoE;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for roI
	 * End of user code -->
	 */
	public BUILDER roI(Double myRoI) {
			this.roI = myRoI;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for status
	 * End of user code -->
	 */
	public BUILDER status(com.dooapp.fireaOLD.entity.SampleStatus myStatus) {
			this.status = myStatus;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for step
	 * End of user code -->
	 */
	public BUILDER step(Step... myStep) {
			this.step = new java.util.HashSet<Step>(java.util.Arrays.asList(myStep));
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for tetaE
	 * End of user code -->
	 */
	public BUILDER tetaE(Double myTetaE) {
			this.tetaE = myTetaE;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for tetaI
	 * End of user code -->
	 */
	public BUILDER tetaI(Double myTetaI) {
			this.tetaI = myTetaI;
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
	 * <!-- Start of user code comment for windMeasure
	 * End of user code -->
	 */
	public BUILDER windMeasure(Double myWindMeasure) {
			this.windMeasure = myWindMeasure;
			return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
