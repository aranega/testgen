package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.TestedRoom;
import com.dooapp.firea.wrapper.BlowHole;
//Start of user code for imports
// TODO: import me!
//End of user code




public class TestedRoomBuilder<BUILDER extends TestedRoomBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private java.util.Date CommissioningDate;
	
	private Integer altitude;
	
	private java.util.Set<BlowHole> blowholes;
	
	private Integer choosenProtectedHeight;
	
	private Boolean clapetsCF;
	
	private Boolean climDuct;
	
	private Boolean climReclycle;
	
	private Boolean climReclycleAuto;
	
	private Boolean climVMC;
	
	private String climVMCAuto;
	
	private Boolean climWithNewAir;
	
	private Boolean climWithNewAirAuto;
	
	private java.util.Date creationDate;
	
	private Integer droppedCeiling;
	
	private Integer droppedFloor;
	
	private Long id;
	
	private Integer indicatedVolume;
	
	private Integer mainHeight;
	
	private Integer measuredVolume;
	
	private Integer mecanicalStrength;
	
	private Integer minimalProtectedHeight;
	
	private String name;
	
	private Integer netVolume;
	
	private Integer risqueHeight;
	
	private Double risqueHeightPercent;
	
	private Integer totalHeight;
	
	private Boolean uniformHorizontality;
	
	private Integer unloadTime;
	
	private java.util.Date updateDate;
	
	private Integer version;
	
	private Integer volumeCorrection;
	@javax.inject.Inject
	BlowHoleBuilder<?> blowHoleBuilder;
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
	protected TestedRoomBuilder() {
	}
	
	protected TestedRoom createValue() {
		return new TestedRoom();
	}
	
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
			handleDefaultBlowholes(result);
		} else {
			result.blowholesProperty().get().addAll(blowholes);
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
	private void handleDefaultCommissioningDate(TestedRoom result) {
		//Start of user code default feature for handleDefaultCommissioningDate
		try {
				result.setCommissioningDate(cfg.getProperty("defaultValue.TestedRoom.CommissioningDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.TestedRoom.CommissioningDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultAltitude(TestedRoom result) {
		//Start of user code default feature for handleDefaultAltitude
		result.setAltitude(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.altitude", "0")));
		//End of user code
	}

	private void handleDefaultBlowholes(TestedRoom result) {
		//Start of user code default feature for handleDefaultBlowholes
		//do nothing
		//End of user code
	}

	private void handleDefaultChoosenProtectedHeight(TestedRoom result) {
		//Start of user code default feature for handleDefaultChoosenProtectedHeight
		result.setChoosenProtectedHeight(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.choosenProtectedHeight", "0")));
		//End of user code
	}

	private void handleDefaultClapetsCF(TestedRoom result) {
		//Start of user code default feature for handleDefaultClapetsCF
		result.setClapetsCF(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.clapetsCF", "false")));
		//End of user code
	}

	private void handleDefaultClimDuct(TestedRoom result) {
		//Start of user code default feature for handleDefaultClimDuct
		result.setClimDuct(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.climDuct", "false")));
		//End of user code
	}

	private void handleDefaultClimReclycle(TestedRoom result) {
		//Start of user code default feature for handleDefaultClimReclycle
		result.setClimReclycle(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.climReclycle", "false")));
		//End of user code
	}

	private void handleDefaultClimReclycleAuto(TestedRoom result) {
		//Start of user code default feature for handleDefaultClimReclycleAuto
		result.setClimReclycleAuto(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.climReclycleAuto", "false")));
		//End of user code
	}

	private void handleDefaultClimVMC(TestedRoom result) {
		//Start of user code default feature for handleDefaultClimVMC
		result.setClimVMC(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.climVMC", "false")));
		//End of user code
	}

	private void handleDefaultClimVMCAuto(TestedRoom result) {
		//Start of user code default feature for handleDefaultClimVMCAuto
		result.setClimVMCAuto(cfg.getProperty("defaultValue.TestedRoom.climVMCAuto"));
		//End of user code
	}

	private void handleDefaultClimWithNewAir(TestedRoom result) {
		//Start of user code default feature for handleDefaultClimWithNewAir
		result.setClimWithNewAir(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.climWithNewAir", "false")));
		//End of user code
	}

	private void handleDefaultClimWithNewAirAuto(TestedRoom result) {
		//Start of user code default feature for handleDefaultClimWithNewAirAuto
		result.setClimWithNewAirAuto(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.climWithNewAirAuto", "false")));
		//End of user code
	}

	private void handleDefaultCreationDate(TestedRoom result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.TestedRoom.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.TestedRoom.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultDroppedCeiling(TestedRoom result) {
		//Start of user code default feature for handleDefaultDroppedCeiling
		result.setDroppedCeiling(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.droppedCeiling", "0")));
		//End of user code
	}

	private void handleDefaultDroppedFloor(TestedRoom result) {
		//Start of user code default feature for handleDefaultDroppedFloor
		result.setDroppedFloor(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.droppedFloor", "0")));
		//End of user code
	}

	private void handleDefaultId(TestedRoom result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.TestedRoom.id", "0")));
		//End of user code
	}

	private void handleDefaultIndicatedVolume(TestedRoom result) {
		//Start of user code default feature for handleDefaultIndicatedVolume
		result.setIndicatedVolume(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.indicatedVolume", "0")));
		//End of user code
	}

	private void handleDefaultMainHeight(TestedRoom result) {
		//Start of user code default feature for handleDefaultMainHeight
		result.setMainHeight(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.mainHeight", "0")));
		//End of user code
	}

	private void handleDefaultMeasuredVolume(TestedRoom result) {
		//Start of user code default feature for handleDefaultMeasuredVolume
		result.setMeasuredVolume(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.measuredVolume", "0")));
		//End of user code
	}

	private void handleDefaultMecanicalStrength(TestedRoom result) {
		//Start of user code default feature for handleDefaultMecanicalStrength
		result.setMecanicalStrength(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.mecanicalStrength", "0")));
		//End of user code
	}

	private void handleDefaultMinimalProtectedHeight(TestedRoom result) {
		//Start of user code default feature for handleDefaultMinimalProtectedHeight
		result.setMinimalProtectedHeight(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.minimalProtectedHeight", "0")));
		//End of user code
	}

	private void handleDefaultName(TestedRoom result) {
		//Start of user code default feature for handleDefaultName
		result.setName(cfg.getProperty("defaultValue.TestedRoom.name"));
		//End of user code
	}

	private void handleDefaultNetVolume(TestedRoom result) {
		//Start of user code default feature for handleDefaultNetVolume
		result.setNetVolume(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.netVolume", "0")));
		//End of user code
	}

	private void handleDefaultRisqueHeight(TestedRoom result) {
		//Start of user code default feature for handleDefaultRisqueHeight
		result.setRisqueHeight(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.risqueHeight", "0")));
		//End of user code
	}

	private void handleDefaultRisqueHeightPercent(TestedRoom result) {
		//Start of user code default feature for handleDefaultRisqueHeightPercent
		result.setRisqueHeightPercent(Double.valueOf(cfg.getProperty("defaultValue.TestedRoom.risqueHeightPercent", "0")));
		//End of user code
	}

	private void handleDefaultTotalHeight(TestedRoom result) {
		//Start of user code default feature for handleDefaultTotalHeight
		result.setTotalHeight(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.totalHeight", "0")));
		//End of user code
	}

	private void handleDefaultUniformHorizontality(TestedRoom result) {
		//Start of user code default feature for handleDefaultUniformHorizontality
		result.setUniformHorizontality(Boolean.valueOf(cfg.getProperty("defaultValue.TestedRoom.uniformHorizontality", "false")));
		//End of user code
	}

	private void handleDefaultUnloadTime(TestedRoom result) {
		//Start of user code default feature for handleDefaultUnloadTime
		result.setUnloadTime(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.unloadTime", "0")));
		//End of user code
	}

	private void handleDefaultUpdateDate(TestedRoom result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.TestedRoom.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.TestedRoom.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultVersion(TestedRoom result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.version", "0")));
		//End of user code
	}

	private void handleDefaultVolumeCorrection(TestedRoom result) {
		//Start of user code default feature for handleDefaultVolumeCorrection
		result.setVolumeCorrection(Integer.valueOf(cfg.getProperty("defaultValue.TestedRoom.volumeCorrection", "0")));
		//End of user code
	}

	public BUILDER CommissioningDate(java.util.Date myCommissioningDate) {
			this.CommissioningDate = myCommissioningDate;
			return (BUILDER) this;
	}

	public BUILDER altitude(Integer myAltitude) {
			this.altitude = myAltitude;
			return (BUILDER) this;
	}

	public BUILDER blowholes(BlowHole... myBlowholes) {
			this.blowholes = new java.util.HashSet<BlowHole>(java.util.Arrays.asList(myBlowholes));
			return (BUILDER) this;
	}

	public BUILDER choosenProtectedHeight(Integer myChoosenProtectedHeight) {
			this.choosenProtectedHeight = myChoosenProtectedHeight;
			return (BUILDER) this;
	}

	public BUILDER clapetsCF(Boolean myClapetsCF) {
			this.clapetsCF = myClapetsCF;
			return (BUILDER) this;
	}

	public BUILDER climDuct(Boolean myClimDuct) {
			this.climDuct = myClimDuct;
			return (BUILDER) this;
	}

	public BUILDER climReclycle(Boolean myClimReclycle) {
			this.climReclycle = myClimReclycle;
			return (BUILDER) this;
	}

	public BUILDER climReclycleAuto(Boolean myClimReclycleAuto) {
			this.climReclycleAuto = myClimReclycleAuto;
			return (BUILDER) this;
	}

	public BUILDER climVMC(Boolean myClimVMC) {
			this.climVMC = myClimVMC;
			return (BUILDER) this;
	}

	public BUILDER climVMCAuto(String myClimVMCAuto) {
			this.climVMCAuto = myClimVMCAuto;
			return (BUILDER) this;
	}

	public BUILDER climWithNewAir(Boolean myClimWithNewAir) {
			this.climWithNewAir = myClimWithNewAir;
			return (BUILDER) this;
	}

	public BUILDER climWithNewAirAuto(Boolean myClimWithNewAirAuto) {
			this.climWithNewAirAuto = myClimWithNewAirAuto;
			return (BUILDER) this;
	}

	public BUILDER creationDate(java.util.Date myCreationDate) {
			this.creationDate = myCreationDate;
			return (BUILDER) this;
	}

	public BUILDER droppedCeiling(Integer myDroppedCeiling) {
			this.droppedCeiling = myDroppedCeiling;
			return (BUILDER) this;
	}

	public BUILDER droppedFloor(Integer myDroppedFloor) {
			this.droppedFloor = myDroppedFloor;
			return (BUILDER) this;
	}

	public BUILDER id(Long myId) {
			this.id = myId;
			return (BUILDER) this;
	}

	public BUILDER indicatedVolume(Integer myIndicatedVolume) {
			this.indicatedVolume = myIndicatedVolume;
			return (BUILDER) this;
	}

	public BUILDER mainHeight(Integer myMainHeight) {
			this.mainHeight = myMainHeight;
			return (BUILDER) this;
	}

	public BUILDER measuredVolume(Integer myMeasuredVolume) {
			this.measuredVolume = myMeasuredVolume;
			return (BUILDER) this;
	}

	public BUILDER mecanicalStrength(Integer myMecanicalStrength) {
			this.mecanicalStrength = myMecanicalStrength;
			return (BUILDER) this;
	}

	public BUILDER minimalProtectedHeight(Integer myMinimalProtectedHeight) {
			this.minimalProtectedHeight = myMinimalProtectedHeight;
			return (BUILDER) this;
	}

	public BUILDER name(String myName) {
			this.name = myName;
			return (BUILDER) this;
	}

	public BUILDER netVolume(Integer myNetVolume) {
			this.netVolume = myNetVolume;
			return (BUILDER) this;
	}

	public BUILDER risqueHeight(Integer myRisqueHeight) {
			this.risqueHeight = myRisqueHeight;
			return (BUILDER) this;
	}

	public BUILDER risqueHeightPercent(Double myRisqueHeightPercent) {
			this.risqueHeightPercent = myRisqueHeightPercent;
			return (BUILDER) this;
	}

	public BUILDER totalHeight(Integer myTotalHeight) {
			this.totalHeight = myTotalHeight;
			return (BUILDER) this;
	}

	public BUILDER uniformHorizontality(Boolean myUniformHorizontality) {
			this.uniformHorizontality = myUniformHorizontality;
			return (BUILDER) this;
	}

	public BUILDER unloadTime(Integer myUnloadTime) {
			this.unloadTime = myUnloadTime;
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

	public BUILDER volumeCorrection(Integer myVolumeCorrection) {
			this.volumeCorrection = myVolumeCorrection;
			return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
