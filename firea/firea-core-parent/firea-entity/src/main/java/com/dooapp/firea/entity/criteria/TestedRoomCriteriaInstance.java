package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.TestedRoomCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


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

	public TestedRoomCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new TestedRoomCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(TestedRoomCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	public java.util.Date getCommissioningDateMax(){
		return this.CommissioningDateMax;
	}
	
	public void setCommissioningDateMax(java.util.Date arg0){
		this.CommissioningDateMax = arg0;
	} 
	public java.util.Date getCommissioningDateMin(){
		return this.CommissioningDateMin;
	}
	
	public void setCommissioningDateMin(java.util.Date arg0){
		this.CommissioningDateMin = arg0;
	} 
	public Integer getAltitudeMax(){
		return this.altitudeMax;
	}
	
	public void setAltitudeMax(Integer arg0){
		this.altitudeMax = arg0;
	} 
	public Integer getAltitudeMin(){
		return this.altitudeMin;
	}
	
	public void setAltitudeMin(Integer arg0){
		this.altitudeMin = arg0;
	} 
	public Integer getChoosenProtectedHeightMax(){
		return this.choosenProtectedHeightMax;
	}
	
	public void setChoosenProtectedHeightMax(Integer arg0){
		this.choosenProtectedHeightMax = arg0;
	} 
	public Integer getChoosenProtectedHeightMin(){
		return this.choosenProtectedHeightMin;
	}
	
	public void setChoosenProtectedHeightMin(Integer arg0){
		this.choosenProtectedHeightMin = arg0;
	} 
	public Boolean isClapetsCF(){
		return this.clapetsCF;
	}
	
	public void setClapetsCF(Boolean arg0){
		this.clapetsCF = arg0;
	} 
	public Boolean isClimDuct(){
		return this.climDuct;
	}
	
	public void setClimDuct(Boolean arg0){
		this.climDuct = arg0;
	} 
	public Boolean isClimReclycle(){
		return this.climReclycle;
	}
	
	public void setClimReclycle(Boolean arg0){
		this.climReclycle = arg0;
	} 
	public Boolean isClimReclycleAuto(){
		return this.climReclycleAuto;
	}
	
	public void setClimReclycleAuto(Boolean arg0){
		this.climReclycleAuto = arg0;
	} 
	public Boolean isClimVMC(){
		return this.climVMC;
	}
	
	public void setClimVMC(Boolean arg0){
		this.climVMC = arg0;
	} 
	public String getClimVMCAuto(){
		return this.climVMCAuto;
	}
	
	public void setClimVMCAuto(String arg0){
		this.climVMCAuto = arg0;
	} 
	public Boolean isClimWithNewAir(){
		return this.climWithNewAir;
	}
	
	public void setClimWithNewAir(Boolean arg0){
		this.climWithNewAir = arg0;
	} 
	public Boolean isClimWithNewAirAuto(){
		return this.climWithNewAirAuto;
	}
	
	public void setClimWithNewAirAuto(Boolean arg0){
		this.climWithNewAirAuto = arg0;
	} 
	public java.util.Date getCreationDateMax(){
		return this.creationDateMax;
	}
	
	public void setCreationDateMax(java.util.Date arg0){
		this.creationDateMax = arg0;
	} 
	public java.util.Date getCreationDateMin(){
		return this.creationDateMin;
	}
	
	public void setCreationDateMin(java.util.Date arg0){
		this.creationDateMin = arg0;
	} 
	public Integer getDroppedCeilingMax(){
		return this.droppedCeilingMax;
	}
	
	public void setDroppedCeilingMax(Integer arg0){
		this.droppedCeilingMax = arg0;
	} 
	public Integer getDroppedCeilingMin(){
		return this.droppedCeilingMin;
	}
	
	public void setDroppedCeilingMin(Integer arg0){
		this.droppedCeilingMin = arg0;
	} 
	public Integer getDroppedFloorMax(){
		return this.droppedFloorMax;
	}
	
	public void setDroppedFloorMax(Integer arg0){
		this.droppedFloorMax = arg0;
	} 
	public Integer getDroppedFloorMin(){
		return this.droppedFloorMin;
	}
	
	public void setDroppedFloorMin(Integer arg0){
		this.droppedFloorMin = arg0;
	} 
	public Long getIdMax(){
		return this.idMax;
	}
	
	public void setIdMax(Long arg0){
		this.idMax = arg0;
	} 
	public Long getIdMin(){
		return this.idMin;
	}
	
	public void setIdMin(Long arg0){
		this.idMin = arg0;
	} 
	public Integer getIndicatedVolumeMax(){
		return this.indicatedVolumeMax;
	}
	
	public void setIndicatedVolumeMax(Integer arg0){
		this.indicatedVolumeMax = arg0;
	} 
	public Integer getIndicatedVolumeMin(){
		return this.indicatedVolumeMin;
	}
	
	public void setIndicatedVolumeMin(Integer arg0){
		this.indicatedVolumeMin = arg0;
	} 
	public Integer getMainHeightMax(){
		return this.mainHeightMax;
	}
	
	public void setMainHeightMax(Integer arg0){
		this.mainHeightMax = arg0;
	} 
	public Integer getMainHeightMin(){
		return this.mainHeightMin;
	}
	
	public void setMainHeightMin(Integer arg0){
		this.mainHeightMin = arg0;
	} 
	public Integer getMeasuredVolumeMax(){
		return this.measuredVolumeMax;
	}
	
	public void setMeasuredVolumeMax(Integer arg0){
		this.measuredVolumeMax = arg0;
	} 
	public Integer getMeasuredVolumeMin(){
		return this.measuredVolumeMin;
	}
	
	public void setMeasuredVolumeMin(Integer arg0){
		this.measuredVolumeMin = arg0;
	} 
	public Integer getMecanicalStrengthMax(){
		return this.mecanicalStrengthMax;
	}
	
	public void setMecanicalStrengthMax(Integer arg0){
		this.mecanicalStrengthMax = arg0;
	} 
	public Integer getMecanicalStrengthMin(){
		return this.mecanicalStrengthMin;
	}
	
	public void setMecanicalStrengthMin(Integer arg0){
		this.mecanicalStrengthMin = arg0;
	} 
	public Integer getMinimalProtectedHeightMax(){
		return this.minimalProtectedHeightMax;
	}
	
	public void setMinimalProtectedHeightMax(Integer arg0){
		this.minimalProtectedHeightMax = arg0;
	} 
	public Integer getMinimalProtectedHeightMin(){
		return this.minimalProtectedHeightMin;
	}
	
	public void setMinimalProtectedHeightMin(Integer arg0){
		this.minimalProtectedHeightMin = arg0;
	} 
	public String getName(){
		return this.name;
	}
	
	public void setName(String arg0){
		this.name = arg0;
	} 
	public Integer getNetVolumeMax(){
		return this.netVolumeMax;
	}
	
	public void setNetVolumeMax(Integer arg0){
		this.netVolumeMax = arg0;
	} 
	public Integer getNetVolumeMin(){
		return this.netVolumeMin;
	}
	
	public void setNetVolumeMin(Integer arg0){
		this.netVolumeMin = arg0;
	} 
	public Integer getRisqueHeightMax(){
		return this.risqueHeightMax;
	}
	
	public void setRisqueHeightMax(Integer arg0){
		this.risqueHeightMax = arg0;
	} 
	public Integer getRisqueHeightMin(){
		return this.risqueHeightMin;
	}
	
	public void setRisqueHeightMin(Integer arg0){
		this.risqueHeightMin = arg0;
	} 
	public Double getRisqueHeightPercentMax(){
		return this.risqueHeightPercentMax;
	}
	
	public void setRisqueHeightPercentMax(Double arg0){
		this.risqueHeightPercentMax = arg0;
	} 
	public Double getRisqueHeightPercentMin(){
		return this.risqueHeightPercentMin;
	}
	
	public void setRisqueHeightPercentMin(Double arg0){
		this.risqueHeightPercentMin = arg0;
	} 
	public Integer getTotalHeightMax(){
		return this.totalHeightMax;
	}
	
	public void setTotalHeightMax(Integer arg0){
		this.totalHeightMax = arg0;
	} 
	public Integer getTotalHeightMin(){
		return this.totalHeightMin;
	}
	
	public void setTotalHeightMin(Integer arg0){
		this.totalHeightMin = arg0;
	} 
	public Boolean isUniformHorizontality(){
		return this.uniformHorizontality;
	}
	
	public void setUniformHorizontality(Boolean arg0){
		this.uniformHorizontality = arg0;
	} 
	public Integer getUnloadTimeMax(){
		return this.unloadTimeMax;
	}
	
	public void setUnloadTimeMax(Integer arg0){
		this.unloadTimeMax = arg0;
	} 
	public Integer getUnloadTimeMin(){
		return this.unloadTimeMin;
	}
	
	public void setUnloadTimeMin(Integer arg0){
		this.unloadTimeMin = arg0;
	} 
	public java.util.Date getUpdateDateMax(){
		return this.updateDateMax;
	}
	
	public void setUpdateDateMax(java.util.Date arg0){
		this.updateDateMax = arg0;
	} 
	public java.util.Date getUpdateDateMin(){
		return this.updateDateMin;
	}
	
	public void setUpdateDateMin(java.util.Date arg0){
		this.updateDateMin = arg0;
	} 
	public Integer getVersion(){
		return this.version;
	}
	
	public void setVersion(Integer arg0){
		this.version = arg0;
	} 
	public Integer getVolumeCorrectionMax(){
		return this.volumeCorrectionMax;
	}
	
	public void setVolumeCorrectionMax(Integer arg0){
		this.volumeCorrectionMax = arg0;
	} 
	public Integer getVolumeCorrectionMin(){
		return this.volumeCorrectionMin;
	}
	
	public void setVolumeCorrectionMin(Integer arg0){
		this.volumeCorrectionMin = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
