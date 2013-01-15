package com.dooapp.fireaOLD.entity.factories;


import com.dooapp.fireaOLD.wrapper.BottleType;
import com.dooapp.fireaOLD.wrapper.BottleConfiguration;
//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Class
 * <!-- Start of user code comment for BottleType Builder
 * End of user code -->
 */

public class BottleTypeBuilder<BUILDER extends BottleTypeBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private java.util.Set<BottleConfiguration> bottleconfiguration;
	
	private java.util.Date creationDate;
	
	private Long id;
	
	private String name;
	
	private java.util.Date updateDate;
	
	private Integer version;
	
	private Double volume;
	
	private Double weight;
	@javax.inject.Inject
	BottleConfigurationBuilder<?> bottleConfigurationBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for BottleType getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected BottleTypeBuilder() {
	}
	
	protected BottleType createValue() {
		return new BottleType();
	}
	
	/*
	 * <!-- Start of user code comment for BottleType build method
	 * End of user code -->
	 */
	public BottleType build() throws NullPointerException {
		BottleType result =  this.createValue() ;
		if (bottleconfiguration == null) {
			handleDefaultBottleconfiguration(result);
		} else {
			result.bottleconfigurationProperty().get().addAll(bottleconfiguration);
		}
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
		if (name == null) {
			handleDefaultName(result);
		} else {
			result.setName(name);
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
		if (volume == null) {
			handleDefaultVolume(result);
		} else {
			result.setVolume(volume);
		}
		if (weight == null) {
			handleDefaultWeight(result);
		} else {
			result.setWeight(weight);
		}
		return result;	
	}

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for bottleconfiguration default method
	 * End of user code -->
	 */
	private void handleDefaultBottleconfiguration(BottleType result) {
		//Start of user code default feature for handleDefaultBottleconfiguration
		//do nothing
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
	private void handleDefaultCreationDate(BottleType result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.BottleType.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.BottleType.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(BottleType result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.BottleType.id", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for name default method
	 * End of user code -->
	 */
	private void handleDefaultName(BottleType result) {
		//Start of user code default feature for handleDefaultName
		result.setName(cfg.getProperty("defaultValue.BottleType.name"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(BottleType result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.BottleType.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.BottleType.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(BottleType result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.BottleType.version", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for volume default method
	 * End of user code -->
	 */
	private void handleDefaultVolume(BottleType result) {
		//Start of user code default feature for handleDefaultVolume
		result.setVolume(Double.valueOf(cfg.getProperty("defaultValue.BottleType.volume", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for weight default method
	 * End of user code -->
	 */
	private void handleDefaultWeight(BottleType result) {
		//Start of user code default feature for handleDefaultWeight
		result.setWeight(Double.valueOf(cfg.getProperty("defaultValue.BottleType.weight", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for bottleconfiguration
	 * End of user code -->
	 */
	public BUILDER bottleconfiguration(BottleConfiguration... myBottleconfiguration) {
			this.bottleconfiguration = new java.util.HashSet<BottleConfiguration>(java.util.Arrays.asList(myBottleconfiguration));
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
	 * <!-- Start of user code comment for volume
	 * End of user code -->
	 */
	public BUILDER volume(Double myVolume) {
			this.volume = myVolume;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for weight
	 * End of user code -->
	 */
	public BUILDER weight(Double myWeight) {
			this.weight = myWeight;
			return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
