package com.dooapp.fireaOLD.entity.factories;


import com.dooapp.fireaOLD.wrapper.Step;
import com.dooapp.fireaOLD.wrapper.Sample;
import com.dooapp.fireaOLD.wrapper.Point;
import com.dooapp.fireaOLD.entity.StepStatus;
//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Class
 * <!-- Start of user code comment for Step Builder
 * End of user code -->
 */

public class StepBuilder<BUILDER extends StepBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private String UnunsefuleAtt;
	
	private java.util.Date creationDate;
	
	private java.util.Date date;
	
	private Long id;
	
	private java.util.Set<Point> points;
	
	private Sample sample;
	
	private com.dooapp.fireaOLD.entity.StepStatus status;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	SampleBuilder<?> sampleBuilder;
	@javax.inject.Inject
	PointBuilder<?> pointBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for Step getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected StepBuilder() {
	}
	
	protected Step createValue() {
		return new Step();
	}
	
	/*
	 * <!-- Start of user code comment for Step build method
	 * End of user code -->
	 */
	public Step build() throws NullPointerException {
		Step result =  this.createValue() ;
		if (UnunsefuleAtt == null) {
			handleDefaultUnunsefuleAtt(result);
		} else {
			result.setUnunsefuleAtt(UnunsefuleAtt);
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
	/*
	 * <!-- Start of user code comment for UnunsefuleAtt default method
	 * End of user code -->
	 */
	private void handleDefaultUnunsefuleAtt(Step result) {
		//Start of user code default feature for handleDefaultUnunsefuleAtt
		result.setUnunsefuleAtt(cfg.getProperty("defaultValue.Step.ununsefuleAtt"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
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

	/*
	 * <!-- Start of user code comment for date default method
	 * End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(Step result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Step.id", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for points default method
	 * End of user code -->
	 */
	private void handleDefaultPoints(Step result) {
		//Start of user code default feature for handleDefaultPoints
		//do nothing
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for sample default method
	 * End of user code -->
	 */
	private void handleDefaultSample(Step result) {
		//Start of user code default feature for handleDefaultSample
		result.setSample(sampleBuilder.build());
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for status default method
	 * End of user code -->
	 */
	private void handleDefaultStatus(Step result) {
		//Start of user code default feature for handleDefaultStatus
		result.setStatus(StepStatus.valueOf(cfg.getProperty("defaultValue.Step.status", "NO_STARTED")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(Step result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Step.version", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for UnunsefuleAtt
	 * End of user code -->
	 */
	public BUILDER UnunsefuleAtt(String myUnunsefuleAtt) {
			this.UnunsefuleAtt = myUnunsefuleAtt;
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
	 * <!-- Start of user code comment for points
	 * End of user code -->
	 */
	public BUILDER points(Point... myPoints) {
			this.points = new java.util.HashSet<Point>(java.util.Arrays.asList(myPoints));
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for sample
	 * End of user code -->
	 */
	public BUILDER sample(Sample mySample) {
			this.sample = mySample;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for status
	 * End of user code -->
	 */
	public BUILDER status(com.dooapp.fireaOLD.entity.StepStatus myStatus) {
			this.status = myStatus;
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
