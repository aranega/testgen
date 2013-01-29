package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Point;
import com.dooapp.firea.wrapper.Reading;
import com.dooapp.firea.wrapper.Step;

//Start of user code for imports
// TODO: import me!
//End of user code




/*
 * Class
 * <!-- Start of user code comment for Point Builder
 * End of user code -->
 */

public class PointBuilder<BUILDER extends PointBuilder<?>>
// Start of user code bloc for inerithance

// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private java.util.Date creationDate;
	
	private Long id;
	
	private Double pressureGoal;
	
	private java.util.Set<Reading> readings;
	
	private Step step;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	ReadingBuilder<?> readingBuilder;
	@javax.inject.Inject
	StepBuilder<?> stepBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for Point getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected PointBuilder() {
	}
	
	protected Point createValue() {
		return new Point();
	}
	
	/*
	 * <!-- Start of user code comment for Point build method
	 * End of user code -->
	 */
	public Point build() throws NullPointerException {
		Point result =  this.createValue() ;
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else { 
			result.setCreationDate(creationDate);
		}
		if (id == null) {
			handleDefaultId(result);
		} else { 
			result.setId(id);
		}
		if (pressureGoal == null) {
			handleDefaultPressureGoal(result);
		} else { 
			result.setPressureGoal(pressureGoal);
		}
		if (readings == null) {
			handleDefaultReadings(result);
		} else { 
			for (Reading tmp : readings)
				tmp.setPoint(result);
			result.readingsProperty().get().addAll(readings);
		}
		if (step == null) {
			handleDefaultStep(result);
		} else { 
				step.getPoints().add(result); 
			result.setStep(step);
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
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
	private void handleDefaultCreationDate(Point result) {
		// Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Point.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Point.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(Point result) {
		// Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Point.id", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for pressureGoal default method
	 * End of user code -->
	 */
	private void handleDefaultPressureGoal(Point result) {
		// Start of user code default feature for handleDefaultPressureGoal
		result.setPressureGoal(Double.valueOf(cfg.getProperty("defaultValue.Point.pressureGoal", "0.0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for readings default method
	 * End of user code -->
	 */
	private void handleDefaultReadings(Point result) {
		// Start of user code default feature for handleDefaultReadings
		// result.setReadings(null);
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for step default method
	 * End of user code -->
	 */
	private void handleDefaultStep(Point result) {
		// Start of user code default feature for handleDefaultStep
		result.setStep(stepBuilder.build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(Point result) {
		// Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Point.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Point.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(Point result) {
		// Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Point.version", "0")));
		// End of user code
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
	 * <!-- Start of user code comment for id
	 * End of user code -->
	 */
	public BUILDER id(Long myId) {
		this.id = myId;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for pressureGoal
	 * End of user code -->
	 */
	public BUILDER pressureGoal(Double myPressureGoal) {
		this.pressureGoal = myPressureGoal;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for readings
	 * End of user code -->
	 */
	public BUILDER readings(Reading... myReadings) {
		this.readings = new java.util.HashSet<Reading>(java.util.Arrays.asList(myReadings));
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for step
	 * End of user code -->
	 */
	public BUILDER step(Step myStep) {
		this.step = myStep;
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
	// Start of user code for methods
	// Other methods
	// End of user code

}
