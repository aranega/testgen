package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Reading;
import com.dooapp.firea.wrapper.GaugeMode;
import com.dooapp.firea.wrapper.Point;
import com.dooapp.firea.wrapper.Device;
//Start of user code for imports
// TODO: import me!
//End of user code




public class ReadingBuilder<BUILDER extends ReadingBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private Double buildingPressure;
	
	private java.util.Date creationDate;
	
	private java.util.Set<Device> device;
	
	private Double fanPressure;
	
	private GaugeMode gaugemode;
	
	private Long id;
	
	private Boolean lowFlow;
	
	private Point point;
	
	private Integer timeAverage;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	GaugeModeBuilder<?> gaugeModeBuilder;
	@javax.inject.Inject
	DeviceBuilder<?> deviceBuilder;
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
	 */
	@javax.inject.Inject
	protected ReadingBuilder() {
	}
	
	protected Reading createValue() {
		return new Reading();
	}
	
	public Reading build() throws NullPointerException {
		Reading result =  this.createValue() ;
		if (buildingPressure == null) {
			handleDefaultBuildingPressure(result);
		} else {
			result.setBuildingPressure(buildingPressure);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else {
			result.setCreationDate(creationDate);
		}
		if (device == null) {
			handleDefaultDevice(result);
		} else {
			result.deviceProperty().get().addAll(device);
		}
		if (fanPressure == null) {
			handleDefaultFanPressure(result);
		} else {
			result.setFanPressure(fanPressure);
		}
		if (gaugemode == null) {
			handleDefaultGaugemode(result);
		} else {
			result.setGaugemode(gaugemode);
		}
		if (id == null) {
			handleDefaultId(result);
		} else {
			result.setId(id);
		}
		if (lowFlow == null) {
			handleDefaultLowFlow(result);
		} else {
			result.setLowFlow(lowFlow);
		}
		if (point == null) {
			handleDefaultPoint(result);
		} else {
			result.setPoint(point);
		}
		if (timeAverage == null) {
			handleDefaultTimeAverage(result);
		} else {
			result.setTimeAverage(timeAverage);
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
	private void handleDefaultBuildingPressure(Reading result) {
		//Start of user code default feature for handleDefaultBuildingPressure
		result.setBuildingPressure(Double.valueOf(cfg.getProperty("defaultValue.Reading.buildingPressure", "0")));
		//End of user code
	}

	private void handleDefaultCreationDate(Reading result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Reading.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Reading.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultDevice(Reading result) {
		//Start of user code default feature for handleDefaultDevice
		//do nothing
		//End of user code
	}

	private void handleDefaultFanPressure(Reading result) {
		//Start of user code default feature for handleDefaultFanPressure
		result.setFanPressure(Double.valueOf(cfg.getProperty("defaultValue.Reading.fanPressure", "0")));
		//End of user code
	}

	private void handleDefaultGaugemode(Reading result) {
		//Start of user code default feature for handleDefaultGaugemode
		//result.setGaugemode(null);
		//End of user code
	}

	private void handleDefaultId(Reading result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Reading.id", "0")));
		//End of user code
	}

	private void handleDefaultLowFlow(Reading result) {
		//Start of user code default feature for handleDefaultLowFlow
		result.setLowFlow(Boolean.valueOf(cfg.getProperty("defaultValue.Reading.lowFlow", "false")));
		//End of user code
	}

	private void handleDefaultPoint(Reading result) {
		//Start of user code default feature for handleDefaultPoint
		//result.setPoint(null);
		//End of user code
	}

	private void handleDefaultTimeAverage(Reading result) {
		//Start of user code default feature for handleDefaultTimeAverage
		result.setTimeAverage(Integer.valueOf(cfg.getProperty("defaultValue.Reading.timeAverage", "0")));
		//End of user code
	}

	private void handleDefaultUpdateDate(Reading result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Reading.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Reading.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultVersion(Reading result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Reading.version", "0")));
		//End of user code
	}

	public BUILDER buildingPressure(Double myBuildingPressure) {
			this.buildingPressure = myBuildingPressure;
			return (BUILDER) this;
	}

	public BUILDER creationDate(java.util.Date myCreationDate) {
			this.creationDate = myCreationDate;
			return (BUILDER) this;
	}

	public BUILDER device(Device... myDevice) {
			this.device = new java.util.HashSet<Device>(java.util.Arrays.asList(myDevice));
			return (BUILDER) this;
	}

	public BUILDER fanPressure(Double myFanPressure) {
			this.fanPressure = myFanPressure;
			return (BUILDER) this;
	}

	public BUILDER gaugemode(GaugeMode myGaugemode) {
			this.gaugemode = myGaugemode;
			return (BUILDER) this;
	}

	public BUILDER id(Long myId) {
			this.id = myId;
			return (BUILDER) this;
	}

	public BUILDER lowFlow(Boolean myLowFlow) {
			this.lowFlow = myLowFlow;
			return (BUILDER) this;
	}

	public BUILDER point(Point myPoint) {
			this.point = myPoint;
			return (BUILDER) this;
	}

	public BUILDER timeAverage(Integer myTimeAverage) {
			this.timeAverage = myTimeAverage;
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