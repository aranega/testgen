package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.BlowHoleConfiguration;
import com.dooapp.firea.wrapper.BlowHole;
import com.dooapp.firea.wrapper.TestedRoom;


import com.dooapp.firea.entity.PressureType;



/**
 *  
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class BlowHoleConfigurationBuilder<BUILDER extends BlowHoleConfigurationBuilder<?>>
// Start of user code bloc for inerithance

// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	/**
	 *  
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Double blowHoleSafetyFactor;
	/**
	 *  
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private java.util.Set<BlowHole> blowhole;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private java.util.Date creationDate;
	/**
	 *  
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean elaIncluded;
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
	
	private Double referencePressure;
	/**
	 *  
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String referencePressureJustification;
	/**
	 *  
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private PressureType referencePressureType;
	/**
	 *  
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private TestedRoom testedroom;
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
	TestedRoomBuilder<?> testedRoomBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	BlowHoleBuilder<?> blowHoleBuilder;
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
	protected BlowHoleConfigurationBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected BlowHoleConfiguration createValue() {
		return new BlowHoleConfiguration();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BlowHoleConfiguration build() throws NullPointerException {
		BlowHoleConfiguration result =  this.createValue() ;
		if (blowHoleSafetyFactor == null) {
			handleDefaultBlowHoleSafetyFactor(result);
		} else { 
			result.setBlowHoleSafetyFactor(blowHoleSafetyFactor);
		}
		if (blowhole == null) {
			throw new NullPointerException("BlowHoleConfiguration must be linked to a BlowHole which has not been set.");
		} else { 
			result.blowholeProperty().get().addAll(blowhole);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else { 
			result.setCreationDate(creationDate);
		}
		if (elaIncluded == null) {
			handleDefaultElaIncluded(result);
		} else { 
			result.setElaIncluded(elaIncluded);
		}
		if (id == null) {
			handleDefaultId(result);
		} else { 
			result.setId(id);
		}
		if (referencePressure == null) {
			handleDefaultReferencePressure(result);
		} else { 
			result.setReferencePressure(referencePressure);
		}
		if (referencePressureJustification == null) {
			handleDefaultReferencePressureJustification(result);
		} else { 
			result.setReferencePressureJustification(referencePressureJustification);
		}
		if (referencePressureType == null) {
			handleDefaultReferencePressureType(result);
		} else { 
			result.setReferencePressureType(referencePressureType);
		}
		if (testedroom == null) {
			throw new NullPointerException("BlowHoleConfiguration must be contained by a TestedRoom which has not been set.");
		} else { 
			result.setTestedroom(testedroom);
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
	private void handleDefaultBlowHoleSafetyFactor(BlowHoleConfiguration result) {
		result.setBlowHoleSafetyFactor(Double.valueOf(cfg.getProperty("defaultValue.BlowHoleConfiguration.blowHoleSafetyFactor", "0.0")));
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultCreationDate(BlowHoleConfiguration result) {
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.BlowHoleConfiguration.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.BlowHoleConfiguration.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultElaIncluded(BlowHoleConfiguration result) {
		result.setElaIncluded(Boolean.valueOf(cfg.getProperty("defaultValue.BlowHoleConfiguration.elaIncluded", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultId(BlowHoleConfiguration result) {
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.BlowHoleConfiguration.id", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultReferencePressure(BlowHoleConfiguration result) {
		result.setReferencePressure(Double.valueOf(cfg.getProperty("defaultValue.BlowHoleConfiguration.referencePressure", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultReferencePressureJustification(BlowHoleConfiguration result) {
		result.setReferencePressureJustification(cfg.getProperty("defaultValue.BlowHoleConfiguration.referencePressureJustification"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultReferencePressureType(BlowHoleConfiguration result) {
		result.setReferencePressureType(PressureType.valueOf(cfg.getProperty("defaultValue.BlowHoleConfiguration.referencePressureType", "STANDARD")));
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultUpdateDate(BlowHoleConfiguration result) {
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.BlowHoleConfiguration.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.BlowHoleConfiguration.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultVersion(BlowHoleConfiguration result) {
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.BlowHoleConfiguration.version", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER blowHoleSafetyFactor(Double myBlowHoleSafetyFactor) {
		this.blowHoleSafetyFactor = myBlowHoleSafetyFactor;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER blowhole(BlowHole... myBlowhole) {
		this.blowhole = new java.util.HashSet<BlowHole>(java.util.Arrays.asList(myBlowhole));
		return (BUILDER) this;
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
	public BUILDER elaIncluded(Boolean myElaIncluded) {
		this.elaIncluded = myElaIncluded;
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
	public BUILDER referencePressure(Double myReferencePressure) {
		this.referencePressure = myReferencePressure;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER referencePressureJustification(String myReferencePressureJustification) {
		this.referencePressureJustification = myReferencePressureJustification;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER referencePressureType(PressureType myReferencePressureType) {
		this.referencePressureType = myReferencePressureType;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER testedroom(TestedRoom myTestedroom) {
		this.testedroom = myTestedroom;
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
