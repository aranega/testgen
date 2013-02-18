package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.TestedRoom;
import com.dooapp.firea.wrapper.BlowHole;





/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class TestedRoomBuilder<BUILDER extends TestedRoomBuilder<?>>
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
	
	private java.util.Date CommissioningDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer altitude;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private BlowHole blowholes;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer choosenProtectedHeight;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean clapetsCF;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean climDuct;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean climReclycle;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean climReclycleAuto;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean climVMC;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String climVMCAuto;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean climWithNewAir;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean climWithNewAirAuto;
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
	
	private Integer droppedCeiling;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer droppedFloor;
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
	
	private Integer indicatedVolume;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer mainHeight;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer measuredVolume;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer mecanicalStrength;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer minimalProtectedHeight;
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
	
	private Integer netVolume;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer risqueHeight;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Double risqueHeightPercent;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer totalHeight;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Boolean uniformHorizontality;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer unloadTime;
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
	
	private Integer volumeCorrection;
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
	protected TestedRoomBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected TestedRoom createValue() {
		return new TestedRoom();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoom build() throws NullPointerException {
		TestedRoom result =  this.createValue() ;
		if (CommissioningDate == null) {
			handleDefaultCommissioningDate(result);
		} else { 
			result.setCommissioningDate(CommissioningDate);
		}
		if (altitude == null) {
			handleDefaultAltitude(result);
		} else { 
			result.setAltitude(altitude);
		}
		if (blowholes == null) {
			throw new NullPointerException("TestedRoom must be linked to a BlowHole which has not been set.");
		} else { 
			result.setBlowholes(blowholes);
		}
		if (choosenProtectedHeight == null) {
			handleDefaultChoosenProtectedHeight(result);
		} else { 
			result.setChoosenProtectedHeight(choosenProtectedHeight);
		}
		if (clapetsCF == null) {
			handleDefaultClapetsCF(result);
		} else { 
			result.setClapetsCF(clapetsCF);
		}
		if (climDuct == null) {
			handleDefaultClimDuct(result);
		} else { 
			result.setClimDuct(climDuct);
		}
		if (climReclycle == null) {
			handleDefaultClimReclycle(result);
		} else { 
			result.setClimReclycle(climReclycle);
		}
		if (climReclycleAuto == null) {
			handleDefaultClimReclycleAuto(result);
		} else { 
			result.setClimReclycleAuto(climReclycleAuto);
		}
		if (climVMC == null) {
			handleDefaultClimVMC(result);
		} else { 
			result.setClimVMC(climVMC);
		}
		if (climVMCAuto == null) {
			handleDefaultClimVMCAuto(result);
		} else { 
			result.setClimVMCAuto(climVMCAuto);
		}
		if (climWithNewAir == null) {
			handleDefaultClimWithNewAir(result);
		} else { 
			result.setClimWithNewAir(climWithNewAir);
		}
		if (climWithNewAirAuto == null) {
			handleDefaultClimWithNewAirAuto(result);
		} else { 
			result.setClimWithNewAirAuto(climWithNewAirAuto);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else { 
			result.setCreationDate(creationDate);
		}
		if (droppedCeiling == null) {
			handleDefaultDroppedCeiling(result);
		} else { 
			result.setDroppedCeiling(droppedCeiling);
		}
		if (droppedFloor == null) {
			handleDefaultDroppedFloor(result);
		} else { 
			result.setDroppedFloor(droppedFloor);
		}
		if (id == null) {
			handleDefaultId(result);
		} else { 
			result.setId(id);
		}
		if (indicatedVolume == null) {
			handleDefaultIndicatedVolume(result);
		} else { 
			result.setIndicatedVolume(indicatedVolume);
		}
		if (mainHeight == null) {
			handleDefaultMainHeight(result);
		} else { 
			result.setMainHeight(mainHeight);
		}
		if (measuredVolume == null) {
			handleDefaultMeasuredVolume(result);
		} else { 
			result.setMeasuredVolume(measuredVolume);
		}
		if (mecanicalStrength == null) {
			handleDefaultMecanicalStrength(result);
		} else { 
			result.setMecanicalStrength(mecanicalStrength);
		}
		if (minimalProtectedHeight == null) {
			handleDefaultMinimalProtectedHeight(result);
		} else { 
			result.setMinimalProtectedHeight(minimalProtectedHeight);
		}
		if (name == null) {
			handleDefaultName(result);
		} else { 
			result.setName(name);
		}
		if (netVolume == null) {
			handleDefaultNetVolume(result);
		} else { 
			result.setNetVolume(netVolume);
		}
		if (risqueHeight == null) {
			handleDefaultRisqueHeight(result);
		} else { 
			result.setRisqueHeight(risqueHeight);
		}
		if (risqueHeightPercent == null) {
			handleDefaultRisqueHeightPercent(result);
		} else { 
			result.setRisqueHeightPercent(risqueHeightPercent);
		}
		if (totalHeight == null) {
			handleDefaultTotalHeight(result);
		} else { 
			result.setTotalHeight(totalHeight);
		}
		if (uniformHorizontality == null) {
			handleDefaultUniformHorizontality(result);
		} else { 
			result.setUniformHorizontality(uniformHorizontality);
		}
		if (unloadTime == null) {
			handleDefaultUnloadTime(result);
		} else { 
			result.setUnloadTime(unloadTime);
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
		if (volumeCorrection == null) {
			handleDefaultVolumeCorrection(result);
		} else { 
			result.setVolumeCorrection(volumeCorrection);
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
	private void handleDefaultCommissioningDate(TestedRoom result) {
		try {
				result.setCommissioningDate(cfg.getProperty("defaultValue.TestedRoom.CommissioningDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.TestedRoom.CommissioningDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultAltitude(TestedRoom result) {
		result.setAltitude(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.altitude", "0")));
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultChoosenProtectedHeight(TestedRoom result) {
		result.setChoosenProtectedHeight(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.choosenProtectedHeight", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultClapetsCF(TestedRoom result) {
		result.setClapetsCF(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.clapetsCF", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultClimDuct(TestedRoom result) {
		result.setClimDuct(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.climDuct", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultClimReclycle(TestedRoom result) {
		result.setClimReclycle(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.climReclycle", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultClimReclycleAuto(TestedRoom result) {
		result.setClimReclycleAuto(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.climReclycleAuto", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultClimVMC(TestedRoom result) {
		result.setClimVMC(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.climVMC", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultClimVMCAuto(TestedRoom result) {
		result.setClimVMCAuto(cfg.getProperty("defaultValue.TestedRoom.climVMCAuto"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultClimWithNewAir(TestedRoom result) {
		result.setClimWithNewAir(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.climWithNewAir", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultClimWithNewAirAuto(TestedRoom result) {
		result.setClimWithNewAirAuto(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.climWithNewAirAuto", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultCreationDate(TestedRoom result) {
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.TestedRoom.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.TestedRoom.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultDroppedCeiling(TestedRoom result) {
		result.setDroppedCeiling(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.droppedCeiling", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultDroppedFloor(TestedRoom result) {
		result.setDroppedFloor(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.droppedFloor", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultId(TestedRoom result) {
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.TestedRoom.id", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultIndicatedVolume(TestedRoom result) {
		result.setIndicatedVolume(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.indicatedVolume", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultMainHeight(TestedRoom result) {
		result.setMainHeight(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.mainHeight", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultMeasuredVolume(TestedRoom result) {
		result.setMeasuredVolume(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.measuredVolume", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultMecanicalStrength(TestedRoom result) {
		result.setMecanicalStrength(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.mecanicalStrength", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultMinimalProtectedHeight(TestedRoom result) {
		result.setMinimalProtectedHeight(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.minimalProtectedHeight", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultName(TestedRoom result) {
		result.setName(cfg.getProperty("defaultValue.TestedRoom.name"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultNetVolume(TestedRoom result) {
		result.setNetVolume(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.netVolume", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultRisqueHeight(TestedRoom result) {
		result.setRisqueHeight(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.risqueHeight", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultRisqueHeightPercent(TestedRoom result) {
		result.setRisqueHeightPercent(Double.valueOf(cfg.getProperty("defaultValue.TestedRoom.risqueHeightPercent", "0.0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultTotalHeight(TestedRoom result) {
		result.setTotalHeight(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.totalHeight", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultUniformHorizontality(TestedRoom result) {
		result.setUniformHorizontality(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.uniformHorizontality", "false")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultUnloadTime(TestedRoom result) {
		result.setUnloadTime(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.unloadTime", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultUpdateDate(TestedRoom result) {
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.TestedRoom.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.TestedRoom.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultVersion(TestedRoom result) {
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.version", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultVolumeCorrection(TestedRoom result) {
		result.setVolumeCorrection(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.volumeCorrection", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER CommissioningDate(java.util.Date myCommissioningDate) {
		this.CommissioningDate = myCommissioningDate;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER altitude(Integer myAltitude) {
		this.altitude = myAltitude;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER blowholes(BlowHole myBlowholes) {
		this.blowholes = myBlowholes;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER choosenProtectedHeight(Integer myChoosenProtectedHeight) {
		this.choosenProtectedHeight = myChoosenProtectedHeight;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER clapetsCF(Boolean myClapetsCF) {
		this.clapetsCF = myClapetsCF;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER climDuct(Boolean myClimDuct) {
		this.climDuct = myClimDuct;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER climReclycle(Boolean myClimReclycle) {
		this.climReclycle = myClimReclycle;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER climReclycleAuto(Boolean myClimReclycleAuto) {
		this.climReclycleAuto = myClimReclycleAuto;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER climVMC(Boolean myClimVMC) {
		this.climVMC = myClimVMC;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER climVMCAuto(String myClimVMCAuto) {
		this.climVMCAuto = myClimVMCAuto;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER climWithNewAir(Boolean myClimWithNewAir) {
		this.climWithNewAir = myClimWithNewAir;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER climWithNewAirAuto(Boolean myClimWithNewAirAuto) {
		this.climWithNewAirAuto = myClimWithNewAirAuto;
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
	public BUILDER droppedCeiling(Integer myDroppedCeiling) {
		this.droppedCeiling = myDroppedCeiling;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER droppedFloor(Integer myDroppedFloor) {
		this.droppedFloor = myDroppedFloor;
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
	public BUILDER indicatedVolume(Integer myIndicatedVolume) {
		this.indicatedVolume = myIndicatedVolume;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER mainHeight(Integer myMainHeight) {
		this.mainHeight = myMainHeight;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER measuredVolume(Integer myMeasuredVolume) {
		this.measuredVolume = myMeasuredVolume;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER mecanicalStrength(Integer myMecanicalStrength) {
		this.mecanicalStrength = myMecanicalStrength;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER minimalProtectedHeight(Integer myMinimalProtectedHeight) {
		this.minimalProtectedHeight = myMinimalProtectedHeight;
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
	public BUILDER netVolume(Integer myNetVolume) {
		this.netVolume = myNetVolume;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER risqueHeight(Integer myRisqueHeight) {
		this.risqueHeight = myRisqueHeight;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER risqueHeightPercent(Double myRisqueHeightPercent) {
		this.risqueHeightPercent = myRisqueHeightPercent;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER totalHeight(Integer myTotalHeight) {
		this.totalHeight = myTotalHeight;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER uniformHorizontality(Boolean myUniformHorizontality) {
		this.uniformHorizontality = myUniformHorizontality;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER unloadTime(Integer myUnloadTime) {
		this.unloadTime = myUnloadTime;
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
	public BUILDER volumeCorrection(Integer myVolumeCorrection) {
		this.volumeCorrection = myVolumeCorrection;
		return (BUILDER) this;
	}

}
