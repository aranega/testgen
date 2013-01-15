package com.dooapp.fireaOLD.entity.factories;


import com.dooapp.fireaOLD.wrapper.Device;
//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Class
 * <!-- Start of user code comment for Device Builder
 * End of user code -->
 */

public class DeviceBuilder<BUILDER extends DeviceBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private java.util.Date creationDate;
	
	private Long id;
	
	private java.util.Date lastCalibrationDate;
	
	private String serialNumber;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for Device getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected DeviceBuilder() {
	}
	
	protected Device createValue() {
		return new Device();
	}
	
	/*
	 * <!-- Start of user code comment for Device build method
	 * End of user code -->
	 */
	public Device build() throws NullPointerException {
		Device result =  this.createValue() ;
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
		if (lastCalibrationDate == null) {
			handleDefaultLastCalibrationDate(result);
		} else {
			result.setLastCalibrationDate(lastCalibrationDate);
		}
		if (serialNumber == null) {
			handleDefaultSerialNumber(result);
		} else {
			result.setSerialNumber(serialNumber);
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
	private void handleDefaultCreationDate(Device result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Device.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Device.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(Device result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Device.id", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for lastCalibrationDate default method
	 * End of user code -->
	 */
	private void handleDefaultLastCalibrationDate(Device result) {
		//Start of user code default feature for handleDefaultLastCalibrationDate
		try {
				result.setLastCalibrationDate(cfg.getProperty("defaultValue.Device.lastCalibrationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Device.lastCalibrationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for serialNumber default method
	 * End of user code -->
	 */
	private void handleDefaultSerialNumber(Device result) {
		//Start of user code default feature for handleDefaultSerialNumber
		result.setSerialNumber(cfg.getProperty("defaultValue.Device.serialNumber"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(Device result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Device.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Device.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(Device result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Device.version", "0")));
		//End of user code
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
	 * <!-- Start of user code comment for lastCalibrationDate
	 * End of user code -->
	 */
	public BUILDER lastCalibrationDate(java.util.Date myLastCalibrationDate) {
			this.lastCalibrationDate = myLastCalibrationDate;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for serialNumber
	 * End of user code -->
	 */
	public BUILDER serialNumber(String mySerialNumber) {
			this.serialNumber = mySerialNumber;
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
