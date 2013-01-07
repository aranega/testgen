package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Step;
import com.dooapp.firea.wrapper.Point;
import com.dooapp.firea.wrapper.Sample;
import com.dooapp.firea.entity.StepStatus;
//Start of user code for imports
// TODO: import me!
//End of user code




public class StepBuilder<BUILDER extends StepBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private java.util.Date creationDate;
	
	private java.util.Date date;
	
	private Long id;
	
	private java.util.Set<Point> points;
	
	private Sample sample;
	
	private com.dooapp.firea.entity.StepStatus status;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	PointBuilder<?> pointBuilder;
	@javax.inject.Inject
	SampleBuilder<?> sampleBuilder;
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
	protected StepBuilder() {
	}
	
	protected Step createValue() {
		return new Step();
	}
	
	public Step build() throws NullPointerException {
		Step result =  this.createValue() ;
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
		if (points == null) {
			handleDefaultPoints(result);
		} else {
			result.pointsProperty().get().addAll(points);
		}
		if (sample == null) {
			handleDefaultSample(result);
		} else {
			result.setSample(sample);
		}
		if (status == null) {
			handleDefaultStatus(result);
		} else {
			result.setStatus(status);
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
	private void handleDefaultCreationDate(Step result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Step.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Step.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultDate(Step result) {
		//Start of user code default feature for handleDefaultDate
		try {
				result.setDate(cfg.getProperty("defaultValue.Step.date") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Step.date")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultId(Step result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Step.id", "0")));
		//End of user code
	}

	private void handleDefaultPoints(Step result) {
		//Start of user code default feature for handleDefaultPoints
		//do nothing
		//End of user code
	}

	private void handleDefaultSample(Step result) {
		//Start of user code default feature for handleDefaultSample
		result.setSample(sampleBuilder.build());
		//End of user code
	}

	private void handleDefaultStatus(Step result) {
		//Start of user code default feature for handleDefaultStatus
		result.setStatus(StepStatus.valueOf(cfg.getProperty("defaultValue.Step.status", "NO_STARTED")));
		//End of user code
	}

	private void handleDefaultUpdateDate(Step result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Step.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Step.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultVersion(Step result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Step.version", "0")));
		//End of user code
	}

	public BUILDER creationDate(java.util.Date myCreationDate) {
			this.creationDate = myCreationDate;
			return (BUILDER) this;
	}

	public BUILDER date(java.util.Date myDate) {
			this.date = myDate;
			return (BUILDER) this;
	}

	public BUILDER id(Long myId) {
			this.id = myId;
			return (BUILDER) this;
	}

	public BUILDER points(Point... myPoints) {
			this.points = new java.util.HashSet<Point>(java.util.Arrays.asList(myPoints));
			return (BUILDER) this;
	}

	public BUILDER sample(Sample mySample) {
			this.sample = mySample;
			return (BUILDER) this;
	}

	public BUILDER status(com.dooapp.firea.entity.StepStatus myStatus) {
			this.status = myStatus;
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
