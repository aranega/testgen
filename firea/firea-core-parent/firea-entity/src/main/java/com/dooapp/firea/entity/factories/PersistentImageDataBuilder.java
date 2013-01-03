package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.PersistentImageData;
//Start of user code for imports
// TODO: import me!
//End of user code




public class PersistentImageDataBuilder<BUILDER extends PersistentImageDataBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private java.util.Date creationDate;
	
	private String data;
	
	private Long id;
	
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
	 */
	@javax.inject.Inject
	protected PersistentImageDataBuilder() {
	}
	
	protected PersistentImageData createValue() {
		return new PersistentImageData();
	}
	
	public PersistentImageData build() throws NullPointerException {
		PersistentImageData result =  this.createValue() ;
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else {
			result.setCreationDate(creationDate);
		}
		if (data == null) {
			handleDefaultData(result);
		} else {
			result.setData(data);
		}
		if (id == null) {
			handleDefaultId(result);
		} else {
			result.setId(id);
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
	private void handleDefaultCreationDate(PersistentImageData result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.PersistentImageData.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.PersistentImageData.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultData(PersistentImageData result) {
		//Start of user code default feature for handleDefaultData
		result.setData(cfg.getProperty("defaultValue.PersistentImageData.data"));
		//End of user code
	}

	private void handleDefaultId(PersistentImageData result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.PersistentImageData.id", "0")));
		//End of user code
	}

	private void handleDefaultUpdateDate(PersistentImageData result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.PersistentImageData.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.PersistentImageData.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultVersion(PersistentImageData result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.PersistentImageData.version", "0")));
		//End of user code
	}

	public BUILDER creationDate(java.util.Date myCreationDate) {
			this.creationDate = myCreationDate;
			return (BUILDER) this;
	}

	public BUILDER data(String myData) {
			this.data = myData;
			return (BUILDER) this;
	}

	public BUILDER id(Long myId) {
			this.id = myId;
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
