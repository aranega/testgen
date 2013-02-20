package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Reading;
import com.dooapp.firea.wrapper.GaugeMode;
import com.dooapp.firea.wrapper.Point;
import com.dooapp.firea.wrapper.Device;





/**
 *  
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ReadingBuilder<BUILDER extends ReadingBuilder<?>>
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
	
	private Double buildingPressure;
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
	
	private java.util.Set<Device> device;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Double fanFlow;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Double fanPressure;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private GaugeMode gaugemode;
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
	
	private Boolean lowFlow;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Point point;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer timeAverage;
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
	DeviceBuilder<?> deviceBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	PointBuilder<?> pointBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	GaugeModeBuilder<?> gaugeModeBuilder;
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
	protected ReadingBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected Reading createValue() {
		return new Reading();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
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
		if (fanFlow == null) {
			handleDefaultFanFlow(result);
		} else { 
			result.setFanFlow(fanFlow);
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
				point.getReadings().add(result); 
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

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultBuildingPressure(Reading result) {
		result.setBuildingPressure(Double.valueOf(cfg.getProperty("defaultValue.Reading.buildingPressure", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultCreationDate(Reading result) {
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Reading.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Reading.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultDevice(Reading result) {
		// do nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultFanFlow(Reading result) {
		result.setFanFlow(Double.valueOf(cfg.getProperty("defaultValue.Reading.fanFlow", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultFanPressure(Reading result) {
		result.setFanPressure(Double.valueOf(cfg.getProperty("defaultValue.Reading.fanPressure", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultGaugemode(Reading result) {
		// result.setGaugemode(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultId(Reading result) {
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Reading.id", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultLowFlow(Reading result) {
		result.setLowFlow(Boolean.valueOf(cfg.getProperty("defaultValue.Reading.lowFlow", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultPoint(Reading result) {
		// result.setPoint(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultTimeAverage(Reading result) {
		result.setTimeAverage(Integer.valueOf(cfg.getProperty("defaultValue.Reading.timeAverage", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultUpdateDate(Reading result) {
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Reading.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Reading.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultVersion(Reading result) {
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Reading.version", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER buildingPressure(Double myBuildingPressure) {
		this.buildingPressure = myBuildingPressure;
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
	public BUILDER device(Device... myDevice) {
		this.device = new java.util.HashSet<Device>(java.util.Arrays.asList(myDevice));
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER fanFlow(Double myFanFlow) {
		this.fanFlow = myFanFlow;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER fanPressure(Double myFanPressure) {
		this.fanPressure = myFanPressure;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER gaugemode(GaugeMode myGaugemode) {
		this.gaugemode = myGaugemode;
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
	public BUILDER lowFlow(Boolean myLowFlow) {
		this.lowFlow = myLowFlow;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER point(Point myPoint) {
		this.point = myPoint;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER timeAverage(Integer myTimeAverage) {
		this.timeAverage = myTimeAverage;
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
