package com.genmymodel.petshop.entity.factories;


import com.genmymodel.petshop.wrapper.Address;
//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Class
 * <!-- Start of user code comment for Address Builder
 * End of user code -->
 */

public class AddressBuilder<BUILDER extends AddressBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private String city;
	
	private String country;
	
	private java.util.Date creationDate;
	
	private Long id;
	
	private String line1;
	
	private String line2;
	
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
	 * <!-- Start of user code comment for Address getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected AddressBuilder() {
	}
	
	protected Address createValue() {
		return new Address();
	}
	
	/*
	 * <!-- Start of user code comment for Address build method
	 * End of user code -->
	 */
	public Address build() throws NullPointerException {
		Address result =  this.createValue() ;
		if (city == null) {
			handleDefaultCity(result);
		} else {
			result.setCity(city);
		}
		if (country == null) {
			handleDefaultCountry(result);
		} else {
			result.setCountry(country);
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
		if (line1 == null) {
			handleDefaultLine1(result);
		} else {
			result.setLine1(line1);
		}
		if (line2 == null) {
			handleDefaultLine2(result);
		} else {
			result.setLine2(line2);
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
	 * <!-- Start of user code comment for city default method
	 * End of user code -->
	 */
	private void handleDefaultCity(Address result) {
		//Start of user code default feature for handleDefaultCity
		result.setCity(cfg.getProperty("defaultValue.Address.city"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for country default method
	 * End of user code -->
	 */
	private void handleDefaultCountry(Address result) {
		//Start of user code default feature for handleDefaultCountry
		result.setCountry(cfg.getProperty("defaultValue.Address.country"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
	private void handleDefaultCreationDate(Address result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Address.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Address.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(Address result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Address.id", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for line1 default method
	 * End of user code -->
	 */
	private void handleDefaultLine1(Address result) {
		//Start of user code default feature for handleDefaultLine1
		result.setLine1(cfg.getProperty("defaultValue.Address.line1"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for line2 default method
	 * End of user code -->
	 */
	private void handleDefaultLine2(Address result) {
		//Start of user code default feature for handleDefaultLine2
		result.setLine2(cfg.getProperty("defaultValue.Address.line2"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(Address result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Address.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Address.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(Address result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Address.version", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for city
	 * End of user code -->
	 */
	public BUILDER city(String myCity) {
			this.city = myCity;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for country
	 * End of user code -->
	 */
	public BUILDER country(String myCountry) {
			this.country = myCountry;
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
	 * <!-- Start of user code comment for line1
	 * End of user code -->
	 */
	public BUILDER line1(String myLine1) {
			this.line1 = myLine1;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for line2
	 * End of user code -->
	 */
	public BUILDER line2(String myLine2) {
			this.line2 = myLine2;
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
