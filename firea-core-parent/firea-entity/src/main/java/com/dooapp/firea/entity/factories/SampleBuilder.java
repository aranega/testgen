package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Sample;
import com.dooapp.firea.entity.SampleBean;
import com.dooapp.firea.wrapper.Project;
import com.dooapp.firea.wrapper.Step;


import com.dooapp.firea.enumeration.AirPressureCalculationMethod;
import com.dooapp.firea.enumeration.BeaufortScale;
import com.dooapp.firea.enumeration.SampleStatus;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class SampleBuilder<BUILDER extends SampleBuilder<?>>
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
	private Integer airPressure;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private AirPressureCalculationMethod airPressureCalculationMethod;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BeaufortScale beaufortScale;
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
	private java.util.Date date;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Integer highUp;
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
	private String name;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double phiEPercent;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double phiIPercent;
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
	private Double roE;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double roI;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private SampleStatus status;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private java.util.Set<Step> step;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double tetaE;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double tetaI;
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
	private Double windMeasure;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	private StepBuilder<?> stepBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	private ProjectBuilder<?> projectBuilder;
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
	protected SampleBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected Sample createValue() {
		return new Sample(new SampleBean());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		if (highUp == null) {
			handleDefaultHighUp(result);
		} else {
			result.setHighUp(highUp);
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
				project.getSample().add(result); 
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
			result.getStep().addAll(step);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultAirPressure(Sample result) {
		result.setAirPressure(Integer.valueOf(cfg.getProperty("defaultValue.Sample.airPressure", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultAirPressureCalculationMethod(Sample result) {
		result.setAirPressureCalculationMethod(AirPressureCalculationMethod.valueOf(cfg.getProperty("defaultValue.Sample.airPressureCalculationMethod", "MEASURE")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultBeaufortScale(Sample result) {
		result.setBeaufortScale(BeaufortScale.valueOf(cfg.getProperty("defaultValue.Sample.beaufortScale", "FORCE0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultCreationDate(Sample result) {
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Sample.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Sample.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultDate(Sample result) {
		try {
				result.setDate(cfg.getProperty("defaultValue.Sample.date") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Sample.date")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultHighUp(Sample result) {
		result.setHighUp(Integer.valueOf(cfg.getProperty("defaultValue.Sample.highUp", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultId(Sample result) {
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Sample.id", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultName(Sample result) {
		result.setName(cfg.getProperty("defaultValue.Sample.name"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultPhiEPercent(Sample result) {
		result.setPhiEPercent(Double.valueOf(cfg.getProperty("defaultValue.Sample.phiEPercent", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultPhiIPercent(Sample result) {
		result.setPhiIPercent(Double.valueOf(cfg.getProperty("defaultValue.Sample.phiIPercent", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultProject(Sample result) throws NullPointerException {
		throw new NullPointerException("Sample must be linked to a Project via project which has not been set.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultRoE(Sample result) {
		result.setRoE(Double.valueOf(cfg.getProperty("defaultValue.Sample.roE", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultRoI(Sample result) {
		result.setRoI(Double.valueOf(cfg.getProperty("defaultValue.Sample.roI", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultStatus(Sample result) {
		result.setStatus(SampleStatus.valueOf(cfg.getProperty("defaultValue.Sample.status", "NO_STARTED")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultStep(Sample result) throws NullPointerException {
		// do nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultTetaE(Sample result) {
		result.setTetaE(Double.valueOf(cfg.getProperty("defaultValue.Sample.tetaE", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultTetaI(Sample result) {
		result.setTetaI(Double.valueOf(cfg.getProperty("defaultValue.Sample.tetaI", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultUpdateDate(Sample result) {
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Sample.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Sample.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultVersion(Sample result) {
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Sample.version", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultWindMeasure(Sample result) {
		result.setWindMeasure(Double.valueOf(cfg.getProperty("defaultValue.Sample.windMeasure", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER airPressure(Integer myAirPressure) {
		this.airPressure = myAirPressure;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER airPressureCalculationMethod(AirPressureCalculationMethod myAirPressureCalculationMethod) {
		this.airPressureCalculationMethod = myAirPressureCalculationMethod;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER beaufortScale(BeaufortScale myBeaufortScale) {
		this.beaufortScale = myBeaufortScale;
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
	public BUILDER date(java.util.Date myDate) {
		this.date = myDate;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER highUp(Integer myHighUp) {
		this.highUp = myHighUp;
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
	public BUILDER name(String myName) {
		this.name = myName;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER phiEPercent(Double myPhiEPercent) {
		this.phiEPercent = myPhiEPercent;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER phiIPercent(Double myPhiIPercent) {
		this.phiIPercent = myPhiIPercent;
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
	public BUILDER roE(Double myRoE) {
		this.roE = myRoE;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER roI(Double myRoI) {
		this.roI = myRoI;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER status(SampleStatus myStatus) {
		this.status = myStatus;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER step(Step... myStep) {
		this.step = new java.util.HashSet<Step>(java.util.Arrays.asList(myStep));
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER tetaE(Double myTetaE) {
		this.tetaE = myTetaE;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER tetaI(Double myTetaI) {
		this.tetaI = myTetaI;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER windMeasure(Double myWindMeasure) {
		this.windMeasure = myWindMeasure;
		return (BUILDER) this;
	}

}
