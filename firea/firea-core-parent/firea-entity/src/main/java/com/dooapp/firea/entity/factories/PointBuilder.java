package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Point;
import com.dooapp.firea.wrapper.Reading;
import com.dooapp.firea.wrapper.Step;
//Start of user code for imports
// TODO: import me!
//End of user code




public class PointBuilder<BUILDER extends PointBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private java.util.Date creationDate;
	
	private Long id;
	
	private Double pressureGoal;
	
	private java.util.Set<Reading> readings;
	
	private Step step;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	StepBuilder<?> stepBuilder;
	@javax.inject.Inject
	ReadingBuilder<?> readingBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	/*
	 * Constructors 
	 */
	@javax.inject.Inject
	protected PointBuilder() {
	}
	
	protected Point createValue() {
		return new Point();
	}
	
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
			result.readingsProperty().get().addAll(readings);
		}
		if (step == null) {
			handleDefaultStep(result);
		} else {
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
	private void handleDefaultCreationDate(Point result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Point.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Point.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultId(Point result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Point.id", "0")));
		//End of user code
	}

	private void handleDefaultPressureGoal(Point result) {
		//Start of user code default feature for handleDefaultPressureGoal
		result.setPressureGoal(Double.valueOf(cfg.getProperty("defaultValue.Point.pressureGoal", "0")));
		//End of user code
	}

	private void handleDefaultReadings(Point result) {
		//Start of user code default feature for handleDefaultReadings
		//do nothing
		//End of user code
	}

	private void handleDefaultStep(Point result) {
		//Start of user code default feature for handleDefaultStep
		result.setStep(stepBuilder.build());
		//End of user code
	}

	private void handleDefaultUpdateDate(Point result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Point.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Point.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultVersion(Point result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Point.version", "0")));
		//End of user code
	}

	public BUILDER creationDate(java.util.Date myCreationDate) {
			this.creationDate = myCreationDate;
			return (BUILDER) this;
	}

	public BUILDER id(Long myId) {
			this.id = myId;
			return (BUILDER) this;
	}

	public BUILDER pressureGoal(Double myPressureGoal) {
			this.pressureGoal = myPressureGoal;
			return (BUILDER) this;
	}

	public BUILDER readings(Reading... myReadings) {
			this.readings = new java.util.HashSet<Reading>(java.util.Arrays.asList(myReadings));
			return (BUILDER) this;
	}

	public BUILDER step(Step myStep) {
			this.step = myStep;
			return (BUILDER) this;
	}

	public BUILDER updateDate(java.util.Date myUpdateDate) {
			this.updateDate = myUpdateDate;
			return (BUILDER) this;
	}

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
