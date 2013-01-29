package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.BottleConfiguration;
import com.dooapp.firea.wrapper.BottleType;
import com.dooapp.firea.wrapper.GazConfiguration;

//Start of user code for imports
// TODO: import me!
//End of user code




/*
 * Class
 * <!-- Start of user code comment for BottleConfiguration Builder
 * End of user code -->
 */

public class BottleConfigurationBuilder<BUILDER extends BottleConfigurationBuilder<?>>
// Start of user code bloc for inerithance

// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private BottleType bottletype;
	
	private java.util.Date creationDate;
	
	private GazConfiguration gazconfiguration;
	
	private Long id;
	
	private Double load;
	
	private Integer quantity;
	
	private String unit;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	GazConfigurationBuilder<?> gazConfigurationBuilder;
	@javax.inject.Inject
	BottleTypeBuilder<?> bottleTypeBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for BottleConfiguration getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected BottleConfigurationBuilder() {
	}
	
	protected BottleConfiguration createValue() {
		return new BottleConfiguration();
	}
	
	/*
	 * <!-- Start of user code comment for BottleConfiguration build method
	 * End of user code -->
	 */
	public BottleConfiguration build() throws NullPointerException {
		BottleConfiguration result =  this.createValue() ;
		if (bottletype == null) {
			handleDefaultBottletype(result);
		} else { 
				bottletype.getBottleconfiguration().add(result); 
			result.setBottletype(bottletype);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else { 
			result.setCreationDate(creationDate);
		}
		if (gazconfiguration == null) {
			handleDefaultGazconfiguration(result);
		} else { 
				gazconfiguration.getBottleconfigurations().add(result); 
			result.setGazconfiguration(gazconfiguration);
		}
		if (id == null) {
			handleDefaultId(result);
		} else { 
			result.setId(id);
		}
		if (load == null) {
			handleDefaultLoad(result);
		} else { 
			result.setLoad(load);
		}
		if (quantity == null) {
			handleDefaultQuantity(result);
		} else { 
			result.setQuantity(quantity);
		}
		if (unit == null) {
			handleDefaultUnit(result);
		} else { 
			result.setUnit(unit);
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
	 * <!-- Start of user code comment for bottletype default method
	 * End of user code -->
	 */
	private void handleDefaultBottletype(BottleConfiguration result) {
		// Start of user code default feature for handleDefaultBottletype
		// result.setBottletype(null);
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
	private void handleDefaultCreationDate(BottleConfiguration result) {
		// Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.BottleConfiguration.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.BottleConfiguration.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for gazconfiguration default method
	 * End of user code -->
	 */
	private void handleDefaultGazconfiguration(BottleConfiguration result) {
		// Start of user code default feature for handleDefaultGazconfiguration
		result.setGazconfiguration(gazConfigurationBuilder.build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(BottleConfiguration result) {
		// Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.BottleConfiguration.id", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for load default method
	 * End of user code -->
	 */
	private void handleDefaultLoad(BottleConfiguration result) {
		// Start of user code default feature for handleDefaultLoad
		result.setLoad(Double.valueOf(cfg.getProperty("defaultValue.BottleConfiguration.load", "0.0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for quantity default method
	 * End of user code -->
	 */
	private void handleDefaultQuantity(BottleConfiguration result) {
		// Start of user code default feature for handleDefaultQuantity
		result.setQuantity(Integer.valueOf(cfg.getProperty("defaultValue.BottleConfiguration.quantity", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for unit default method
	 * End of user code -->
	 */
	private void handleDefaultUnit(BottleConfiguration result) {
		// Start of user code default feature for handleDefaultUnit
		result.setUnit(cfg.getProperty("defaultValue.BottleConfiguration.unit"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(BottleConfiguration result) {
		// Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.BottleConfiguration.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.BottleConfiguration.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(BottleConfiguration result) {
		// Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.BottleConfiguration.version", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for bottletype
	 * End of user code -->
	 */
	public BUILDER bottletype(BottleType myBottletype) {
		this.bottletype = myBottletype;
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
	 * <!-- Start of user code comment for gazconfiguration
	 * End of user code -->
	 */
	public BUILDER gazconfiguration(GazConfiguration myGazconfiguration) {
		this.gazconfiguration = myGazconfiguration;
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
	 * <!-- Start of user code comment for load
	 * End of user code -->
	 */
	public BUILDER load(Double myLoad) {
		this.load = myLoad;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for quantity
	 * End of user code -->
	 */
	public BUILDER quantity(Integer myQuantity) {
		this.quantity = myQuantity;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for unit
	 * End of user code -->
	 */
	public BUILDER unit(String myUnit) {
		this.unit = myUnit;
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
