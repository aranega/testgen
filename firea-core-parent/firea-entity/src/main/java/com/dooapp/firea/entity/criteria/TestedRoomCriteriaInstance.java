package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.TestedRoomCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code


import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for TestedRoomCriteria Class
 * End of user code -->
 */

public class TestedRoomCriteriaInstance
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements Bean
// End of user code
{
	
	
	private java.util.Date CommissioningDateMax;
	
	private java.util.Date CommissioningDateMin;
	
	private Integer altitude;
	
	private Integer choosenProtectedHeight;
	
	private Boolean clapetsCF;
	
	private Boolean climDuct;
	
	private Boolean climReclycle;
	
	private Boolean climReclycleAuto;
	
	private Boolean climVMC;
	
	private Boolean climVMCAuto;
	
	private Boolean climWithNewAir;
	
	private Boolean climWithNewAirAuto;
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Integer droppedCeiling;
	
	private Integer droppedFloor;
	
	private Long idMax;
	
	private Long idMin;
	
	private Integer indicatedVolume;
	
	private Integer mainHeight;
	
	private Integer measuredVolume;
	
	private Integer mecanicalStrength;
	
	private Integer minimalProtectedHeight;
	
	private String name;
	
	private Integer netVolume;
	
	private Integer risqueHeight;
	
	private Double risqueHeightPercentMax;
	
	private Double risqueHeightPercentMin;
	
	private Integer totalHeight;
	
	private Boolean uniformHorizontality;
	
	private Integer unloadTime;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	
	private Integer volumeCorrection;
	// Start of user code for attributes
	// Other attributes
	// End of user code

	private TestedRoomCriteria wrapper;

	/*
	 * <!-- Start of user code comment for TestedRoomCriteria wrapper getter
	 * End of user code -->
	 */
	public TestedRoomCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new TestedRoomCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for TestedRoomCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(TestedRoomCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/*
	 * <!-- Start of user code comment for CommissioningDateMax getter
	 * End of user code -->
	 */
	public java.util.Date getCommissioningDateMax(){
		return this.CommissioningDateMax;
	}
	
	/*
	 * <!-- Start of user code comment for CommissioningDateMax setter
	 * End of user code -->
	 */
	public void setCommissioningDateMax(java.util.Date arg0){
		this.CommissioningDateMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for CommissioningDateMin getter
	 * End of user code -->
	 */
	public java.util.Date getCommissioningDateMin(){
		return this.CommissioningDateMin;
	}
	
	/*
	 * <!-- Start of user code comment for CommissioningDateMin setter
	 * End of user code -->
	 */
	public void setCommissioningDateMin(java.util.Date arg0){
		this.CommissioningDateMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for altitude getter
	 * End of user code -->
	 */
	public Integer getAltitude(){
		return this.altitude;
	}
	
	/*
	 * <!-- Start of user code comment for altitude setter
	 * End of user code -->
	 */
	public void setAltitude(Integer arg0){
		this.altitude = arg0;
	} 
	/*
	 * <!-- Start of user code comment for choosenProtectedHeight getter
	 * End of user code -->
	 */
	public Integer getChoosenProtectedHeight(){
		return this.choosenProtectedHeight;
	}
	
	/*
	 * <!-- Start of user code comment for choosenProtectedHeight setter
	 * End of user code -->
	 */
	public void setChoosenProtectedHeight(Integer arg0){
		this.choosenProtectedHeight = arg0;
	} 
	/*
	 * <!-- Start of user code comment for clapetsCF getter
	 * End of user code -->
	 */
	public Boolean isClapetsCF(){
		return this.clapetsCF;
	}
	
	/*
	 * <!-- Start of user code comment for clapetsCF setter
	 * End of user code -->
	 */
	public void setClapetsCF(Boolean arg0){
		this.clapetsCF = arg0;
	} 
	/*
	 * <!-- Start of user code comment for climDuct getter
	 * End of user code -->
	 */
	public Boolean isClimDuct(){
		return this.climDuct;
	}
	
	/*
	 * <!-- Start of user code comment for climDuct setter
	 * End of user code -->
	 */
	public void setClimDuct(Boolean arg0){
		this.climDuct = arg0;
	} 
	/*
	 * <!-- Start of user code comment for climReclycle getter
	 * End of user code -->
	 */
	public Boolean isClimReclycle(){
		return this.climReclycle;
	}
	
	/*
	 * <!-- Start of user code comment for climReclycle setter
	 * End of user code -->
	 */
	public void setClimReclycle(Boolean arg0){
		this.climReclycle = arg0;
	} 
	/*
	 * <!-- Start of user code comment for climReclycleAuto getter
	 * End of user code -->
	 */
	public Boolean isClimReclycleAuto(){
		return this.climReclycleAuto;
	}
	
	/*
	 * <!-- Start of user code comment for climReclycleAuto setter
	 * End of user code -->
	 */
	public void setClimReclycleAuto(Boolean arg0){
		this.climReclycleAuto = arg0;
	} 
	/*
	 * <!-- Start of user code comment for climVMC getter
	 * End of user code -->
	 */
	public Boolean isClimVMC(){
		return this.climVMC;
	}
	
	/*
	 * <!-- Start of user code comment for climVMC setter
	 * End of user code -->
	 */
	public void setClimVMC(Boolean arg0){
		this.climVMC = arg0;
	} 
	/*
	 * <!-- Start of user code comment for climVMCAuto getter
	 * End of user code -->
	 */
	public Boolean isClimVMCAuto(){
		return this.climVMCAuto;
	}
	
	/*
	 * <!-- Start of user code comment for climVMCAuto setter
	 * End of user code -->
	 */
	public void setClimVMCAuto(Boolean arg0){
		this.climVMCAuto = arg0;
	} 
	/*
	 * <!-- Start of user code comment for climWithNewAir getter
	 * End of user code -->
	 */
	public Boolean isClimWithNewAir(){
		return this.climWithNewAir;
	}
	
	/*
	 * <!-- Start of user code comment for climWithNewAir setter
	 * End of user code -->
	 */
	public void setClimWithNewAir(Boolean arg0){
		this.climWithNewAir = arg0;
	} 
	/*
	 * <!-- Start of user code comment for climWithNewAirAuto getter
	 * End of user code -->
	 */
	public Boolean isClimWithNewAirAuto(){
		return this.climWithNewAirAuto;
	}
	
	/*
	 * <!-- Start of user code comment for climWithNewAirAuto setter
	 * End of user code -->
	 */
	public void setClimWithNewAirAuto(Boolean arg0){
		this.climWithNewAirAuto = arg0;
	} 
	/*
	 * <!-- Start of user code comment for creationDateMax getter
	 * End of user code -->
	 */
	public java.util.Date getCreationDateMax(){
		return this.creationDateMax;
	}
	
	/*
	 * <!-- Start of user code comment for creationDateMax setter
	 * End of user code -->
	 */
	public void setCreationDateMax(java.util.Date arg0){
		this.creationDateMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for creationDateMin getter
	 * End of user code -->
	 */
	public java.util.Date getCreationDateMin(){
		return this.creationDateMin;
	}
	
	/*
	 * <!-- Start of user code comment for creationDateMin setter
	 * End of user code -->
	 */
	public void setCreationDateMin(java.util.Date arg0){
		this.creationDateMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for droppedCeiling getter
	 * End of user code -->
	 */
	public Integer getDroppedCeiling(){
		return this.droppedCeiling;
	}
	
	/*
	 * <!-- Start of user code comment for droppedCeiling setter
	 * End of user code -->
	 */
	public void setDroppedCeiling(Integer arg0){
		this.droppedCeiling = arg0;
	} 
	/*
	 * <!-- Start of user code comment for droppedFloor getter
	 * End of user code -->
	 */
	public Integer getDroppedFloor(){
		return this.droppedFloor;
	}
	
	/*
	 * <!-- Start of user code comment for droppedFloor setter
	 * End of user code -->
	 */
	public void setDroppedFloor(Integer arg0){
		this.droppedFloor = arg0;
	} 
	/*
	 * <!-- Start of user code comment for idMax getter
	 * End of user code -->
	 */
	public Long getIdMax(){
		return this.idMax;
	}
	
	/*
	 * <!-- Start of user code comment for idMax setter
	 * End of user code -->
	 */
	public void setIdMax(Long arg0){
		this.idMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for idMin getter
	 * End of user code -->
	 */
	public Long getIdMin(){
		return this.idMin;
	}
	
	/*
	 * <!-- Start of user code comment for idMin setter
	 * End of user code -->
	 */
	public void setIdMin(Long arg0){
		this.idMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for indicatedVolume getter
	 * End of user code -->
	 */
	public Integer getIndicatedVolume(){
		return this.indicatedVolume;
	}
	
	/*
	 * <!-- Start of user code comment for indicatedVolume setter
	 * End of user code -->
	 */
	public void setIndicatedVolume(Integer arg0){
		this.indicatedVolume = arg0;
	} 
	/*
	 * <!-- Start of user code comment for mainHeight getter
	 * End of user code -->
	 */
	public Integer getMainHeight(){
		return this.mainHeight;
	}
	
	/*
	 * <!-- Start of user code comment for mainHeight setter
	 * End of user code -->
	 */
	public void setMainHeight(Integer arg0){
		this.mainHeight = arg0;
	} 
	/*
	 * <!-- Start of user code comment for measuredVolume getter
	 * End of user code -->
	 */
	public Integer getMeasuredVolume(){
		return this.measuredVolume;
	}
	
	/*
	 * <!-- Start of user code comment for measuredVolume setter
	 * End of user code -->
	 */
	public void setMeasuredVolume(Integer arg0){
		this.measuredVolume = arg0;
	} 
	/*
	 * <!-- Start of user code comment for mecanicalStrength getter
	 * End of user code -->
	 */
	public Integer getMecanicalStrength(){
		return this.mecanicalStrength;
	}
	
	/*
	 * <!-- Start of user code comment for mecanicalStrength setter
	 * End of user code -->
	 */
	public void setMecanicalStrength(Integer arg0){
		this.mecanicalStrength = arg0;
	} 
	/*
	 * <!-- Start of user code comment for minimalProtectedHeight getter
	 * End of user code -->
	 */
	public Integer getMinimalProtectedHeight(){
		return this.minimalProtectedHeight;
	}
	
	/*
	 * <!-- Start of user code comment for minimalProtectedHeight setter
	 * End of user code -->
	 */
	public void setMinimalProtectedHeight(Integer arg0){
		this.minimalProtectedHeight = arg0;
	} 
	/*
	 * <!-- Start of user code comment for name getter
	 * End of user code -->
	 */
	public String getName(){
		return this.name;
	}
	
	/*
	 * <!-- Start of user code comment for name setter
	 * End of user code -->
	 */
	public void setName(String arg0){
		this.name = arg0;
	} 
	/*
	 * <!-- Start of user code comment for netVolume getter
	 * End of user code -->
	 */
	public Integer getNetVolume(){
		return this.netVolume;
	}
	
	/*
	 * <!-- Start of user code comment for netVolume setter
	 * End of user code -->
	 */
	public void setNetVolume(Integer arg0){
		this.netVolume = arg0;
	} 
	/*
	 * <!-- Start of user code comment for risqueHeight getter
	 * End of user code -->
	 */
	public Integer getRisqueHeight(){
		return this.risqueHeight;
	}
	
	/*
	 * <!-- Start of user code comment for risqueHeight setter
	 * End of user code -->
	 */
	public void setRisqueHeight(Integer arg0){
		this.risqueHeight = arg0;
	} 
	/*
	 * <!-- Start of user code comment for risqueHeightPercentMax getter
	 * End of user code -->
	 */
	public Double getRisqueHeightPercentMax(){
		return this.risqueHeightPercentMax;
	}
	
	/*
	 * <!-- Start of user code comment for risqueHeightPercentMax setter
	 * End of user code -->
	 */
	public void setRisqueHeightPercentMax(Double arg0){
		this.risqueHeightPercentMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for risqueHeightPercentMin getter
	 * End of user code -->
	 */
	public Double getRisqueHeightPercentMin(){
		return this.risqueHeightPercentMin;
	}
	
	/*
	 * <!-- Start of user code comment for risqueHeightPercentMin setter
	 * End of user code -->
	 */
	public void setRisqueHeightPercentMin(Double arg0){
		this.risqueHeightPercentMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for totalHeight getter
	 * End of user code -->
	 */
	public Integer getTotalHeight(){
		return this.totalHeight;
	}
	
	/*
	 * <!-- Start of user code comment for totalHeight setter
	 * End of user code -->
	 */
	public void setTotalHeight(Integer arg0){
		this.totalHeight = arg0;
	} 
	/*
	 * <!-- Start of user code comment for uniformHorizontality getter
	 * End of user code -->
	 */
	public Boolean isUniformHorizontality(){
		return this.uniformHorizontality;
	}
	
	/*
	 * <!-- Start of user code comment for uniformHorizontality setter
	 * End of user code -->
	 */
	public void setUniformHorizontality(Boolean arg0){
		this.uniformHorizontality = arg0;
	} 
	/*
	 * <!-- Start of user code comment for unloadTime getter
	 * End of user code -->
	 */
	public Integer getUnloadTime(){
		return this.unloadTime;
	}
	
	/*
	 * <!-- Start of user code comment for unloadTime setter
	 * End of user code -->
	 */
	public void setUnloadTime(Integer arg0){
		this.unloadTime = arg0;
	} 
	/*
	 * <!-- Start of user code comment for updateDateMax getter
	 * End of user code -->
	 */
	public java.util.Date getUpdateDateMax(){
		return this.updateDateMax;
	}
	
	/*
	 * <!-- Start of user code comment for updateDateMax setter
	 * End of user code -->
	 */
	public void setUpdateDateMax(java.util.Date arg0){
		this.updateDateMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for updateDateMin getter
	 * End of user code -->
	 */
	public java.util.Date getUpdateDateMin(){
		return this.updateDateMin;
	}
	
	/*
	 * <!-- Start of user code comment for updateDateMin setter
	 * End of user code -->
	 */
	public void setUpdateDateMin(java.util.Date arg0){
		this.updateDateMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for version getter
	 * End of user code -->
	 */
	public Integer getVersion(){
		return this.version;
	}
	
	/*
	 * <!-- Start of user code comment for version setter
	 * End of user code -->
	 */
	public void setVersion(Integer arg0){
		this.version = arg0;
	} 
	/*
	 * <!-- Start of user code comment for volumeCorrection getter
	 * End of user code -->
	 */
	public Integer getVolumeCorrection(){
		return this.volumeCorrection;
	}
	
	/*
	 * <!-- Start of user code comment for volumeCorrection setter
	 * End of user code -->
	 */
	public void setVolumeCorrection(Integer arg0){
		this.volumeCorrection = arg0;
	} 


	// Start of user code for methods
	// Other methods
	// End of user code

}
