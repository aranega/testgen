package com.dooapp.fireaOLD.entity.criteria;

import com.dooapp.fireaOLD.wrapper.criteria.TestedRoomCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for TestedRoomCriteria Class
 * End of user code -->
 */

public class TestedRoomCriteriaInstance implements Bean
{
	
	
	private java.util.Date CommissioningDateMax;
	
	private java.util.Date CommissioningDateMin;
	
	private Integer altitudeMax;
	
	private Integer altitudeMin;
	
	private Integer choosenProtectedHeightMax;
	
	private Integer choosenProtectedHeightMin;
	
	private Boolean clapetsCF;
	
	private Boolean climDuct;
	
	private Boolean climReclycle;
	
	private Boolean climReclycleAuto;
	
	private Boolean climVMC;
	
	private String climVMCAuto;
	
	private Boolean climWithNewAir;
	
	private Boolean climWithNewAirAuto;
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Integer droppedCeilingMax;
	
	private Integer droppedCeilingMin;
	
	private Integer droppedFloorMax;
	
	private Integer droppedFloorMin;
	
	private Long idMax;
	
	private Long idMin;
	
	private Integer indicatedVolumeMax;
	
	private Integer indicatedVolumeMin;
	
	private Integer mainHeightMax;
	
	private Integer mainHeightMin;
	
	private Integer measuredVolumeMax;
	
	private Integer measuredVolumeMin;
	
	private Integer mecanicalStrengthMax;
	
	private Integer mecanicalStrengthMin;
	
	private Integer minimalProtectedHeightMax;
	
	private Integer minimalProtectedHeightMin;
	
	private String name;
	
	private Integer netVolumeMax;
	
	private Integer netVolumeMin;
	
	private Integer risqueHeightMax;
	
	private Integer risqueHeightMin;
	
	private Double risqueHeightPercentMax;
	
	private Double risqueHeightPercentMin;
	
	private Integer totalHeightMax;
	
	private Integer totalHeightMin;
	
	private Boolean uniformHorizontality;
	
	private Integer unloadTimeMax;
	
	private Integer unloadTimeMin;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	
	private Integer volumeCorrectionMax;
	
	private Integer volumeCorrectionMin;
	//Start of user code for attributes
	// Other attributes
	//End of user code

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
	 * <!-- Start of user code comment for altitudeMax getter
	 * End of user code -->
	 */
	public Integer getAltitudeMax(){
		return this.altitudeMax;
	}
	
	/*
	 * <!-- Start of user code comment for altitudeMax setter
	 * End of user code -->
	 */
	public void setAltitudeMax(Integer arg0){
		this.altitudeMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for altitudeMin getter
	 * End of user code -->
	 */
	public Integer getAltitudeMin(){
		return this.altitudeMin;
	}
	
	/*
	 * <!-- Start of user code comment for altitudeMin setter
	 * End of user code -->
	 */
	public void setAltitudeMin(Integer arg0){
		this.altitudeMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for choosenProtectedHeightMax getter
	 * End of user code -->
	 */
	public Integer getChoosenProtectedHeightMax(){
		return this.choosenProtectedHeightMax;
	}
	
	/*
	 * <!-- Start of user code comment for choosenProtectedHeightMax setter
	 * End of user code -->
	 */
	public void setChoosenProtectedHeightMax(Integer arg0){
		this.choosenProtectedHeightMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for choosenProtectedHeightMin getter
	 * End of user code -->
	 */
	public Integer getChoosenProtectedHeightMin(){
		return this.choosenProtectedHeightMin;
	}
	
	/*
	 * <!-- Start of user code comment for choosenProtectedHeightMin setter
	 * End of user code -->
	 */
	public void setChoosenProtectedHeightMin(Integer arg0){
		this.choosenProtectedHeightMin = arg0;
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
	public String getClimVMCAuto(){
		return this.climVMCAuto;
	}
	
	/*
	 * <!-- Start of user code comment for climVMCAuto setter
	 * End of user code -->
	 */
	public void setClimVMCAuto(String arg0){
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
	 * <!-- Start of user code comment for droppedCeilingMax getter
	 * End of user code -->
	 */
	public Integer getDroppedCeilingMax(){
		return this.droppedCeilingMax;
	}
	
	/*
	 * <!-- Start of user code comment for droppedCeilingMax setter
	 * End of user code -->
	 */
	public void setDroppedCeilingMax(Integer arg0){
		this.droppedCeilingMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for droppedCeilingMin getter
	 * End of user code -->
	 */
	public Integer getDroppedCeilingMin(){
		return this.droppedCeilingMin;
	}
	
	/*
	 * <!-- Start of user code comment for droppedCeilingMin setter
	 * End of user code -->
	 */
	public void setDroppedCeilingMin(Integer arg0){
		this.droppedCeilingMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for droppedFloorMax getter
	 * End of user code -->
	 */
	public Integer getDroppedFloorMax(){
		return this.droppedFloorMax;
	}
	
	/*
	 * <!-- Start of user code comment for droppedFloorMax setter
	 * End of user code -->
	 */
	public void setDroppedFloorMax(Integer arg0){
		this.droppedFloorMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for droppedFloorMin getter
	 * End of user code -->
	 */
	public Integer getDroppedFloorMin(){
		return this.droppedFloorMin;
	}
	
	/*
	 * <!-- Start of user code comment for droppedFloorMin setter
	 * End of user code -->
	 */
	public void setDroppedFloorMin(Integer arg0){
		this.droppedFloorMin = arg0;
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
	 * <!-- Start of user code comment for indicatedVolumeMax getter
	 * End of user code -->
	 */
	public Integer getIndicatedVolumeMax(){
		return this.indicatedVolumeMax;
	}
	
	/*
	 * <!-- Start of user code comment for indicatedVolumeMax setter
	 * End of user code -->
	 */
	public void setIndicatedVolumeMax(Integer arg0){
		this.indicatedVolumeMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for indicatedVolumeMin getter
	 * End of user code -->
	 */
	public Integer getIndicatedVolumeMin(){
		return this.indicatedVolumeMin;
	}
	
	/*
	 * <!-- Start of user code comment for indicatedVolumeMin setter
	 * End of user code -->
	 */
	public void setIndicatedVolumeMin(Integer arg0){
		this.indicatedVolumeMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for mainHeightMax getter
	 * End of user code -->
	 */
	public Integer getMainHeightMax(){
		return this.mainHeightMax;
	}
	
	/*
	 * <!-- Start of user code comment for mainHeightMax setter
	 * End of user code -->
	 */
	public void setMainHeightMax(Integer arg0){
		this.mainHeightMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for mainHeightMin getter
	 * End of user code -->
	 */
	public Integer getMainHeightMin(){
		return this.mainHeightMin;
	}
	
	/*
	 * <!-- Start of user code comment for mainHeightMin setter
	 * End of user code -->
	 */
	public void setMainHeightMin(Integer arg0){
		this.mainHeightMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for measuredVolumeMax getter
	 * End of user code -->
	 */
	public Integer getMeasuredVolumeMax(){
		return this.measuredVolumeMax;
	}
	
	/*
	 * <!-- Start of user code comment for measuredVolumeMax setter
	 * End of user code -->
	 */
	public void setMeasuredVolumeMax(Integer arg0){
		this.measuredVolumeMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for measuredVolumeMin getter
	 * End of user code -->
	 */
	public Integer getMeasuredVolumeMin(){
		return this.measuredVolumeMin;
	}
	
	/*
	 * <!-- Start of user code comment for measuredVolumeMin setter
	 * End of user code -->
	 */
	public void setMeasuredVolumeMin(Integer arg0){
		this.measuredVolumeMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for mecanicalStrengthMax getter
	 * End of user code -->
	 */
	public Integer getMecanicalStrengthMax(){
		return this.mecanicalStrengthMax;
	}
	
	/*
	 * <!-- Start of user code comment for mecanicalStrengthMax setter
	 * End of user code -->
	 */
	public void setMecanicalStrengthMax(Integer arg0){
		this.mecanicalStrengthMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for mecanicalStrengthMin getter
	 * End of user code -->
	 */
	public Integer getMecanicalStrengthMin(){
		return this.mecanicalStrengthMin;
	}
	
	/*
	 * <!-- Start of user code comment for mecanicalStrengthMin setter
	 * End of user code -->
	 */
	public void setMecanicalStrengthMin(Integer arg0){
		this.mecanicalStrengthMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for minimalProtectedHeightMax getter
	 * End of user code -->
	 */
	public Integer getMinimalProtectedHeightMax(){
		return this.minimalProtectedHeightMax;
	}
	
	/*
	 * <!-- Start of user code comment for minimalProtectedHeightMax setter
	 * End of user code -->
	 */
	public void setMinimalProtectedHeightMax(Integer arg0){
		this.minimalProtectedHeightMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for minimalProtectedHeightMin getter
	 * End of user code -->
	 */
	public Integer getMinimalProtectedHeightMin(){
		return this.minimalProtectedHeightMin;
	}
	
	/*
	 * <!-- Start of user code comment for minimalProtectedHeightMin setter
	 * End of user code -->
	 */
	public void setMinimalProtectedHeightMin(Integer arg0){
		this.minimalProtectedHeightMin = arg0;
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
	 * <!-- Start of user code comment for netVolumeMax getter
	 * End of user code -->
	 */
	public Integer getNetVolumeMax(){
		return this.netVolumeMax;
	}
	
	/*
	 * <!-- Start of user code comment for netVolumeMax setter
	 * End of user code -->
	 */
	public void setNetVolumeMax(Integer arg0){
		this.netVolumeMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for netVolumeMin getter
	 * End of user code -->
	 */
	public Integer getNetVolumeMin(){
		return this.netVolumeMin;
	}
	
	/*
	 * <!-- Start of user code comment for netVolumeMin setter
	 * End of user code -->
	 */
	public void setNetVolumeMin(Integer arg0){
		this.netVolumeMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for risqueHeightMax getter
	 * End of user code -->
	 */
	public Integer getRisqueHeightMax(){
		return this.risqueHeightMax;
	}
	
	/*
	 * <!-- Start of user code comment for risqueHeightMax setter
	 * End of user code -->
	 */
	public void setRisqueHeightMax(Integer arg0){
		this.risqueHeightMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for risqueHeightMin getter
	 * End of user code -->
	 */
	public Integer getRisqueHeightMin(){
		return this.risqueHeightMin;
	}
	
	/*
	 * <!-- Start of user code comment for risqueHeightMin setter
	 * End of user code -->
	 */
	public void setRisqueHeightMin(Integer arg0){
		this.risqueHeightMin = arg0;
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
	 * <!-- Start of user code comment for totalHeightMax getter
	 * End of user code -->
	 */
	public Integer getTotalHeightMax(){
		return this.totalHeightMax;
	}
	
	/*
	 * <!-- Start of user code comment for totalHeightMax setter
	 * End of user code -->
	 */
	public void setTotalHeightMax(Integer arg0){
		this.totalHeightMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for totalHeightMin getter
	 * End of user code -->
	 */
	public Integer getTotalHeightMin(){
		return this.totalHeightMin;
	}
	
	/*
	 * <!-- Start of user code comment for totalHeightMin setter
	 * End of user code -->
	 */
	public void setTotalHeightMin(Integer arg0){
		this.totalHeightMin = arg0;
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
	 * <!-- Start of user code comment for unloadTimeMax getter
	 * End of user code -->
	 */
	public Integer getUnloadTimeMax(){
		return this.unloadTimeMax;
	}
	
	/*
	 * <!-- Start of user code comment for unloadTimeMax setter
	 * End of user code -->
	 */
	public void setUnloadTimeMax(Integer arg0){
		this.unloadTimeMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for unloadTimeMin getter
	 * End of user code -->
	 */
	public Integer getUnloadTimeMin(){
		return this.unloadTimeMin;
	}
	
	/*
	 * <!-- Start of user code comment for unloadTimeMin setter
	 * End of user code -->
	 */
	public void setUnloadTimeMin(Integer arg0){
		this.unloadTimeMin = arg0;
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
	 * <!-- Start of user code comment for volumeCorrectionMax getter
	 * End of user code -->
	 */
	public Integer getVolumeCorrectionMax(){
		return this.volumeCorrectionMax;
	}
	
	/*
	 * <!-- Start of user code comment for volumeCorrectionMax setter
	 * End of user code -->
	 */
	public void setVolumeCorrectionMax(Integer arg0){
		this.volumeCorrectionMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for volumeCorrectionMin getter
	 * End of user code -->
	 */
	public Integer getVolumeCorrectionMin(){
		return this.volumeCorrectionMin;
	}
	
	/*
	 * <!-- Start of user code comment for volumeCorrectionMin setter
	 * End of user code -->
	 */
	public void setVolumeCorrectionMin(Integer arg0){
		this.volumeCorrectionMin = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
