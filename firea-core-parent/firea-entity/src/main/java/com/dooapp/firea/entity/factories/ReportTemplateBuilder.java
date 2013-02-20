package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.ReportTemplate;
import com.dooapp.firea.wrapper.PersistentImage;


import com.dooapp.firea.entity.ProjectKind;



/**
 *  
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ReportTemplateBuilder<BUILDER extends ReportTemplateBuilder<?>>
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
	
	private String description;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String file;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Long id;
	/**
	 *  
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private PersistentImage image;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ProjectKind kind;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String name;
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
	PersistentImageBuilder<?> persistentImageBuilder;
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
	protected ReportTemplateBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ReportTemplate createValue() {
		return new ReportTemplate();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ReportTemplate build() throws NullPointerException {
		ReportTemplate result =  this.createValue() ;
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else { 
			result.setCreationDate(creationDate);
		}
		if (description == null) {
			handleDefaultDescription(result);
		} else { 
			result.setDescription(description);
		}
		if (file == null) {
			handleDefaultFile(result);
		} else { 
			result.setFile(file);
		}
		if (id == null) {
			handleDefaultId(result);
		} else { 
			result.setId(id);
		}
		if (image == null) {
			handleDefaultImage(result);
		} else { 
			result.setImage(image);
		}
		if (kind == null) {
			handleDefaultKind(result);
		} else { 
			result.setKind(kind);
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
	private void handleDefaultCreationDate(ReportTemplate result) {
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.ReportTemplate.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.ReportTemplate.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultDescription(ReportTemplate result) {
		result.setDescription(cfg.getProperty("defaultValue.ReportTemplate.description"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultFile(ReportTemplate result) {
		result.setFile(cfg.getProperty("defaultValue.ReportTemplate.file"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultId(ReportTemplate result) {
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.ReportTemplate.id", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultImage(ReportTemplate result) {
		result.setImage(persistentImageBuilder.build());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultKind(ReportTemplate result) {
		result.setKind(ProjectKind.valueOf(cfg.getProperty("defaultValue.ReportTemplate.kind", "R13_APSAD")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultName(ReportTemplate result) {
		result.setName(cfg.getProperty("defaultValue.ReportTemplate.name"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultUpdateDate(ReportTemplate result) {
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.ReportTemplate.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.ReportTemplate.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultVersion(ReportTemplate result) {
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.ReportTemplate.version", "0")));
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
	public BUILDER description(String myDescription) {
		this.description = myDescription;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER file(String myFile) {
		this.file = myFile;
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
	public BUILDER image(PersistentImage myImage) {
		this.image = myImage;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER kind(ProjectKind myKind) {
		this.kind = myKind;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER name(String myName) {
		this.name = myName;
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
