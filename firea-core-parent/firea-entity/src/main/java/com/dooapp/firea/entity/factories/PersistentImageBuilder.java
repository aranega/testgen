package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.PersistentImage;

//Start of user code for imports
// TODO: import me!
//End of user code




/*
 * Class
 * <!-- Start of user code comment for PersistentImage Builder
 * End of user code -->
 */

public class PersistentImageBuilder<BUILDER extends PersistentImageBuilder<?>>
// Start of user code bloc for inerithance

// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private java.util.Date creationDate;
	
	private String dataId;
	
	private Boolean error;
	
	private Long id;
	
	private String sourceFile;
	
	private String title;
	
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
	 * <!-- Start of user code comment for PersistentImage getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected PersistentImageBuilder() {
	}
	
	protected PersistentImage createValue() {
		return new PersistentImage();
	}
	
	/*
	 * <!-- Start of user code comment for PersistentImage build method
	 * End of user code -->
	 */
	public PersistentImage build() throws NullPointerException {
		PersistentImage result =  this.createValue() ;
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else { 
			result.setCreationDate(creationDate);
		}
		if (dataId == null) {
			handleDefaultDataId(result);
		} else { 
			result.setDataId(dataId);
		}
		if (error == null) {
			handleDefaultError(result);
		} else { 
			result.setError(error);
		}
		if (id == null) {
			handleDefaultId(result);
		} else { 
			result.setId(id);
		}
		if (sourceFile == null) {
			handleDefaultSourceFile(result);
		} else { 
			result.setSourceFile(sourceFile);
		}
		if (title == null) {
			handleDefaultTitle(result);
		} else { 
			result.setTitle(title);
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
	private void handleDefaultCreationDate(PersistentImage result) {
		// Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.PersistentImage.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.PersistentImage.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for dataId default method
	 * End of user code -->
	 */
	private void handleDefaultDataId(PersistentImage result) {
		// Start of user code default feature for handleDefaultDataId
		result.setDataId(cfg.getProperty("defaultValue.PersistentImage.dataId"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for error default method
	 * End of user code -->
	 */
	private void handleDefaultError(PersistentImage result) {
		// Start of user code default feature for handleDefaultError
		result.setError(Boolean.valueOf(cfg.getProperty("defaultValue.PersistentImage.error", "false")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(PersistentImage result) {
		// Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.PersistentImage.id", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for sourceFile default method
	 * End of user code -->
	 */
	private void handleDefaultSourceFile(PersistentImage result) {
		// Start of user code default feature for handleDefaultSourceFile
		result.setSourceFile(cfg.getProperty("defaultValue.PersistentImage.sourceFile"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for title default method
	 * End of user code -->
	 */
	private void handleDefaultTitle(PersistentImage result) {
		// Start of user code default feature for handleDefaultTitle
		result.setTitle(cfg.getProperty("defaultValue.PersistentImage.title"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(PersistentImage result) {
		// Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.PersistentImage.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.PersistentImage.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(PersistentImage result) {
		// Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.PersistentImage.version", "0")));
		// End of user code
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
	 * <!-- Start of user code comment for dataId
	 * End of user code -->
	 */
	public BUILDER dataId(String myDataId) {
		this.dataId = myDataId;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for error
	 * End of user code -->
	 */
	public BUILDER error(Boolean myError) {
		this.error = myError;
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
	 * <!-- Start of user code comment for sourceFile
	 * End of user code -->
	 */
	public BUILDER sourceFile(String mySourceFile) {
		this.sourceFile = mySourceFile;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for title
	 * End of user code -->
	 */
	public BUILDER title(String myTitle) {
		this.title = myTitle;
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
