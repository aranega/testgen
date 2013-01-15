package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Gaz;
import com.dooapp.firea.wrapper.BottleType;
import com.dooapp.firea.wrapper.GazConfiguration;
import com.dooapp.firea.entity.GazWeight;
//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Class
 * <!-- Start of user code comment for Gaz Builder
 * End of user code -->
 */

public class GazBuilder<BUILDER extends GazBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private java.util.Set<BottleType> bottletypes;
	
	private java.util.Date creationDate;
	
	private Double density;
	
	private java.util.Set<GazConfiguration> gazconfiguration;
	
	private Long id;
	
	private String name;
	
	private String type;
	
	private java.util.Date updateDate;
	
	private Integer version;
	
	private com.dooapp.firea.entity.GazWeight weight;
	@javax.inject.Inject
	BottleTypeBuilder<?> bottleTypeBuilder;
	@javax.inject.Inject
	GazConfigurationBuilder<?> gazConfigurationBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for Gaz getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected GazBuilder() {
	}
	
	protected Gaz createValue() {
		return new Gaz();
	}
	
	/*
	 * <!-- Start of user code comment for Gaz build method
	 * End of user code -->
	 */
	public Gaz build() throws NullPointerException {
		Gaz result =  this.createValue() ;
		if (bottletypes == null) {
			handleDefaultBottletypes(result);
		} else {
			result.bottletypesProperty().get().addAll(bottletypes);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else {
			result.setCreationDate(creationDate);
		}
		if (density == null) {
			handleDefaultDensity(result);
		} else {
			result.setDensity(density);
		}
		if (gazconfiguration == null) {
			handleDefaultGazconfiguration(result);
		} else {
			result.gazconfigurationProperty().get().addAll(gazconfiguration);
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
		if (type == null) {
			handleDefaultType(result);
		} else {
			result.setType(type);
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
	 * <!-- Start of user code comment for bottletypes default method
	 * End of user code -->
	 */
	private void handleDefaultBottletypes(Gaz result) {
		//Start of user code default feature for handleDefaultBottletypes
		//do nothing
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
	private void handleDefaultCreationDate(Gaz result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Gaz.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Gaz.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for density default method
	 * End of user code -->
	 */
	private void handleDefaultDensity(Gaz result) {
		//Start of user code default feature for handleDefaultDensity
		result.setDensity(Double.valueOf(cfg.getProperty("defaultValue.Gaz.density", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for gazconfiguration default method
	 * End of user code -->
	 */
	private void handleDefaultGazconfiguration(Gaz result) {
		//Start of user code default feature for handleDefaultGazconfiguration
		//do nothing
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(Gaz result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Gaz.id", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for name default method
	 * End of user code -->
	 */
	private void handleDefaultName(Gaz result) {
		//Start of user code default feature for handleDefaultName
		result.setName(cfg.getProperty("defaultValue.Gaz.name"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for type default method
	 * End of user code -->
	 */
	private void handleDefaultType(Gaz result) {
		//Start of user code default feature for handleDefaultType
		result.setType(cfg.getProperty("defaultValue.Gaz.type"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(Gaz result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Gaz.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Gaz.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(Gaz result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Gaz.version", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for weight default method
	 * End of user code -->
	 */
	private void handleDefaultWeight(Gaz result) {
		//Start of user code default feature for handleDefaultWeight
		result.setWeight(GazWeight.valueOf(cfg.getProperty("defaultValue.Gaz.weight", "HEAVY")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for bottletypes
	 * End of user code -->
	 */
	public BUILDER bottletypes(BottleType... myBottletypes) {
			this.bottletypes = new java.util.HashSet<BottleType>(java.util.Arrays.asList(myBottletypes));
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
	 * <!-- Start of user code comment for density
	 * End of user code -->
	 */
	public BUILDER density(Double myDensity) {
			this.density = myDensity;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for gazconfiguration
	 * End of user code -->
	 */
	public BUILDER gazconfiguration(GazConfiguration... myGazconfiguration) {
			this.gazconfiguration = new java.util.HashSet<GazConfiguration>(java.util.Arrays.asList(myGazconfiguration));
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
	 * <!-- Start of user code comment for type
	 * End of user code -->
	 */
	public BUILDER type(String myType) {
			this.type = myType;
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
	 * <!-- Start of user code comment for weight
	 * End of user code -->
	 */
	public BUILDER weight(com.dooapp.firea.entity.GazWeight myWeight) {
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
