package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Gaz;


import com.dooapp.firea.entity.GazWeight;



/**
 *  
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class GazBuilder<BUILDER extends GazBuilder<?>>
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
	
	private Long id;
	/**
	 *  
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Double loaelConcentration;
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
	
	private String type;
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
	 *  
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private GazWeight weight;
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
	protected GazBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected Gaz createValue() {
		return new Gaz();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Gaz build() throws NullPointerException {
		Gaz result =  this.createValue() ;
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
		if (loaelConcentration == null) {
			handleDefaultLoaelConcentration(result);
		} else { 
			result.setLoaelConcentration(loaelConcentration);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultCreationDate(Gaz result) {
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Gaz.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Gaz.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultId(Gaz result) {
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Gaz.id", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultLoaelConcentration(Gaz result) {
		result.setLoaelConcentration(Double.valueOf(cfg.getProperty("defaultValue.Gaz.loaelConcentration", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultName(Gaz result) {
		result.setName(cfg.getProperty("defaultValue.Gaz.name"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultType(Gaz result) {
		result.setType(cfg.getProperty("defaultValue.Gaz.type"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultUpdateDate(Gaz result) {
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Gaz.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Gaz.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultVersion(Gaz result) {
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Gaz.version", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultWeight(Gaz result) {
		result.setWeight(GazWeight.valueOf(cfg.getProperty("defaultValue.Gaz.weight", "HEAVY")));
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
	public BUILDER loaelConcentration(Double myLoaelConcentration) {
		this.loaelConcentration = myLoaelConcentration;
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
	public BUILDER type(String myType) {
		this.type = myType;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER weight(GazWeight myWeight) {
		this.weight = myWeight;
		return (BUILDER) this;
	}

}
