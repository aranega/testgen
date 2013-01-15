package com.dooapp.fireaOLD.entity.factories;


import com.dooapp.fireaOLD.wrapper.Risque;
//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Class
 * <!-- Start of user code comment for Risque Builder
 * End of user code -->
 */

public class RisqueBuilder<BUILDER extends RisqueBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private java.util.Date creationDate;
	
	private Long id;
	
	private String key;
	
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
	 * <!-- Start of user code comment for Risque getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected RisqueBuilder() {
	}
	
	protected Risque createValue() {
		return new Risque();
	}
	
	/*
	 * <!-- Start of user code comment for Risque build method
	 * End of user code -->
	 */
	public Risque build() throws NullPointerException {
		Risque result =  this.createValue() ;
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
		if (key == null) {
			handleDefaultKey(result);
		} else {
			result.setKey(key);
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
	private void handleDefaultCreationDate(Risque result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Risque.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Risque.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(Risque result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Risque.id", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for key default method
	 * End of user code -->
	 */
	private void handleDefaultKey(Risque result) {
		//Start of user code default feature for handleDefaultKey
		result.setKey(cfg.getProperty("defaultValue.Risque.key"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(Risque result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Risque.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Risque.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(Risque result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Risque.version", "0")));
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
	 * <!-- Start of user code comment for key
	 * End of user code -->
	 */
	public BUILDER key(String myKey) {
			this.key = myKey;
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
