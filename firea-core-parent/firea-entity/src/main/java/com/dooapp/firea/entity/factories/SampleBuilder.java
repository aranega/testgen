package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Sample;
import com.dooapp.firea.wrapper.Project;
import com.dooapp.firea.wrapper.StaticStep;
import com.dooapp.firea.wrapper.MainStep;
import com.dooapp.firea.wrapper.BlowHoleStep;
import com.dooapp.firea.wrapper.CalibrationStep;


import com.dooapp.firea.entity.BeaufortScale;
import com.dooapp.firea.entity.AirPressureCalculationMethod;
import com.dooapp.firea.entity.SampleStatus;
import com.dooapp.firea.entity.PointDirection;



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
	private CalibrationStep calibrationStep;
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
	private BlowHoleStep depressureEventStep;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private MainStep depressureMainStep;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Integer elevation;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double highTarget;
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
	private Double lowTarget;
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
	private Integer numberOfPoint;
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
	private PointDirection pointDirection;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StaticStep postStaticStep;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private StaticStep preStaticStep;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private BlowHoleStep pressureEventStep;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private MainStep pressureMainStep;
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
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private SampleStatus status;
	/**
	 * 
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
	StaticStepBuilder<?> staticStepBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	CalibrationStepBuilder<?> calibrationStepBuilder;
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
	BlowHoleStepBuilder<?> blowHoleStepBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	MainStepBuilder<?> mainStepBuilder;
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
		return new Sample();
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
		if (calibrationStep == null) {
			handleDefaultCalibrationStep(result);
		} else { 
			result.setCalibrationStep(calibrationStep);
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
		if (depressureEventStep == null) {
			handleDefaultDepressureEventStep(result);
		} else { 
			result.setDepressureEventStep(depressureEventStep);
		}
		if (depressureMainStep == null) {
			handleDefaultDepressureMainStep(result);
		} else { 
			result.setDepressureMainStep(depressureMainStep);
		}
		if (elevation == null) {
			handleDefaultElevation(result);
		} else { 
			result.setElevation(elevation);
		}
		if (highTarget == null) {
			handleDefaultHighTarget(result);
		} else { 
			result.setHighTarget(highTarget);
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
		if (lowTarget == null) {
			handleDefaultLowTarget(result);
		} else { 
			result.setLowTarget(lowTarget);
		}
		if (name == null) {
			handleDefaultName(result);
		} else { 
			result.setName(name);
		}
		if (numberOfPoint == null) {
			handleDefaultNumberOfPoint(result);
		} else { 
			result.setNumberOfPoint(numberOfPoint);
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
		if (pointDirection == null) {
			handleDefaultPointDirection(result);
		} else { 
			result.setPointDirection(pointDirection);
		}
		if (postStaticStep == null) {
			handleDefaultPostStaticStep(result);
		} else { 
			result.setPostStaticStep(postStaticStep);
		}
		if (preStaticStep == null) {
			handleDefaultPreStaticStep(result);
		} else { 
			result.setPreStaticStep(preStaticStep);
		}
		if (pressureEventStep == null) {
			handleDefaultPressureEventStep(result);
		} else { 
			result.setPressureEventStep(pressureEventStep);
		}
		if (pressureMainStep == null) {
			handleDefaultPressureMainStep(result);
		} else { 
			result.setPressureMainStep(pressureMainStep);
		}
		if (project == null) {
			handleDefaultProject(result);
		} else { 
				project.getSamples().add(result); 
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
	private void handleDefaultAirPressure(Sample result) {
		result.setAirPressure(Integer.valueOf(cfg.getProperty("defaultValue.Sample.airPressure", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultAirPressureCalculationMethod(Sample result) {
		result.setAirPressureCalculationMethod(AirPressureCalculationMethod.valueOf(cfg.getProperty("defaultValue.Sample.airPressureCalculationMethod", "MEASURE")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultBeaufortScale(Sample result) {
		result.setBeaufortScale(BeaufortScale.valueOf(cfg.getProperty("defaultValue.Sample.beaufortScale", "FORCE0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultCalibrationStep(Sample result) {
		result.setCalibrationStep(calibrationStepBuilder.build());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultCreationDate(Sample result) {
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
	private void handleDefaultDate(Sample result) {
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
	private void handleDefaultDepressureEventStep(Sample result) {
		result.setDepressureEventStep(blowHoleStepBuilder.build());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultDepressureMainStep(Sample result) {
		result.setDepressureMainStep(mainStepBuilder.build());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultElevation(Sample result) {
		result.setElevation(Integer.valueOf(cfg.getProperty("defaultValue.Sample.elevation", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultHighTarget(Sample result) {
		result.setHighTarget(Double.valueOf(cfg.getProperty("defaultValue.Sample.highTarget", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultHighUp(Sample result) {
		result.setHighUp(Integer.valueOf(cfg.getProperty("defaultValue.Sample.highUp", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultId(Sample result) {
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Sample.id", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultLowTarget(Sample result) {
		result.setLowTarget(Double.valueOf(cfg.getProperty("defaultValue.Sample.lowTarget", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultName(Sample result) {
		result.setName(cfg.getProperty("defaultValue.Sample.name"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultNumberOfPoint(Sample result) {
		result.setNumberOfPoint(Integer.valueOf(cfg.getProperty("defaultValue.Sample.numberOfPoint", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultPhiEPercent(Sample result) {
		result.setPhiEPercent(Double.valueOf(cfg.getProperty("defaultValue.Sample.phiEPercent", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultPhiIPercent(Sample result) {
		result.setPhiIPercent(Double.valueOf(cfg.getProperty("defaultValue.Sample.phiIPercent", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultPointDirection(Sample result) {
		result.setPointDirection(PointDirection.valueOf(cfg.getProperty("defaultValue.Sample.pointDirection", "ASC")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultPostStaticStep(Sample result) {
		result.setPostStaticStep(staticStepBuilder.build());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultPreStaticStep(Sample result) {
		result.setPreStaticStep(staticStepBuilder.build());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultPressureEventStep(Sample result) {
		result.setPressureEventStep(blowHoleStepBuilder.build());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultPressureMainStep(Sample result) {
		result.setPressureMainStep(mainStepBuilder.build());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultProject(Sample result) {
		throw new NullPointerException("Sample must be contained by a Project which has not been set.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultRoE(Sample result) {
		result.setRoE(Double.valueOf(cfg.getProperty("defaultValue.Sample.roE", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultRoI(Sample result) {
		result.setRoI(Double.valueOf(cfg.getProperty("defaultValue.Sample.roI", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultStatus(Sample result) {
		result.setStatus(SampleStatus.valueOf(cfg.getProperty("defaultValue.Sample.status", "NO_STARTED")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultTetaE(Sample result) {
		result.setTetaE(Double.valueOf(cfg.getProperty("defaultValue.Sample.tetaE", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultTetaI(Sample result) {
		result.setTetaI(Double.valueOf(cfg.getProperty("defaultValue.Sample.tetaI", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultUpdateDate(Sample result) {
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
	private void handleDefaultVersion(Sample result) {
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Sample.version", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultWindMeasure(Sample result) {
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
	public BUILDER calibrationStep(CalibrationStep myCalibrationStep) {
		this.calibrationStep = myCalibrationStep;
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
	public BUILDER depressureEventStep(BlowHoleStep myDepressureEventStep) {
		this.depressureEventStep = myDepressureEventStep;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER depressureMainStep(MainStep myDepressureMainStep) {
		this.depressureMainStep = myDepressureMainStep;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER elevation(Integer myElevation) {
		this.elevation = myElevation;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER highTarget(Double myHighTarget) {
		this.highTarget = myHighTarget;
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
	public BUILDER lowTarget(Double myLowTarget) {
		this.lowTarget = myLowTarget;
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
	public BUILDER numberOfPoint(Integer myNumberOfPoint) {
		this.numberOfPoint = myNumberOfPoint;
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
	public BUILDER pointDirection(PointDirection myPointDirection) {
		this.pointDirection = myPointDirection;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER postStaticStep(StaticStep myPostStaticStep) {
		this.postStaticStep = myPostStaticStep;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER preStaticStep(StaticStep myPreStaticStep) {
		this.preStaticStep = myPreStaticStep;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER pressureEventStep(BlowHoleStep myPressureEventStep) {
		this.pressureEventStep = myPressureEventStep;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER pressureMainStep(MainStep myPressureMainStep) {
		this.pressureMainStep = myPressureMainStep;
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
