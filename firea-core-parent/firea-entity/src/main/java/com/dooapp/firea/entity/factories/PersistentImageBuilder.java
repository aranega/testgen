package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.PersistentImage;





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class PersistentImageBuilder<BUILDER extends PersistentImageBuilder<?>>
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
	
	private java.util.Date creationDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String dataId;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean error;
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
	
	private String preview;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String sourceFile;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String title;
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
	protected PersistentImageBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected PersistentImage createValue() {
		return new PersistentImage();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
		if (preview == null) {
			handleDefaultPreview(result);
		} else { 
			result.setPreview(preview);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultCreationDate(PersistentImage result) {
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.PersistentImage.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.PersistentImage.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultDataId(PersistentImage result) {
		result.setDataId(cfg.getProperty("defaultValue.PersistentImage.dataId"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultError(PersistentImage result) {
		result.setError(Boolean.valueOf(cfg.getProperty("defaultValue.PersistentImage.error", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultId(PersistentImage result) {
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.PersistentImage.id", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultPreview(PersistentImage result) {
		result.setPreview(cfg.getProperty("defaultValue.PersistentImage.preview"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultSourceFile(PersistentImage result) {
		result.setSourceFile(cfg.getProperty("defaultValue.PersistentImage.sourceFile"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultTitle(PersistentImage result) {
		result.setTitle(cfg.getProperty("defaultValue.PersistentImage.title"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultUpdateDate(PersistentImage result) {
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.PersistentImage.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.PersistentImage.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultVersion(PersistentImage result) {
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.PersistentImage.version", "0")));
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
	public BUILDER dataId(String myDataId) {
		this.dataId = myDataId;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER error(Boolean myError) {
		this.error = myError;
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
	public BUILDER preview(String myPreview) {
		this.preview = myPreview;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER sourceFile(String mySourceFile) {
		this.sourceFile = mySourceFile;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER title(String myTitle) {
		this.title = myTitle;
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
