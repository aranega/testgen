package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.GazConfigurationCriteria;


import com.dooapp.firea.entity.GazWeight;

import com.dooapp.lib.common.entity.Bean;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class GazConfigurationCriteriaInstance
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements Bean
// End of user code
{
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double chosenFinalConcentrationMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double chosenFinalConcentrationMin;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double chosenInitialConcentrationMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double chosenInitialConcentrationMin;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private java.util.Date creationDateMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private java.util.Date creationDateMin;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Boolean droppedCeilFull;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Boolean droppedFloorFull;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private GazWeight forcedGazWeight;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Long idMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Long idMin;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double installedInitialConcentrationMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double installedInitialConcentrationMin;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double leekRepartitionPercentMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double leekRepartitionPercentMin;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double prescribedFinalConcentrationMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double prescribedFinalConcentrationMin;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double prescribedInitialConcentrationMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double prescribedInitialConcentrationMin;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double prescribedRetentionMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double prescribedRetentionMin;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double retentionGoalMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double retentionGoalMin;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Boolean retentionInterface;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Boolean slowUnloading;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double slowUnloadingValueMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double slowUnloadingValueMin;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double totalLoadToInstallMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Double totalLoadToInstallMin;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private java.util.Date updateDateMax;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private java.util.Date updateDateMin;
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
	private GazConfigurationCriteria wrapper;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazConfigurationCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new GazConfigurationCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setWrapper(GazConfigurationCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getChosenFinalConcentrationMax(){
		return this.chosenFinalConcentrationMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChosenFinalConcentrationMax(Double arg0){
		this.chosenFinalConcentrationMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getChosenFinalConcentrationMin(){
		return this.chosenFinalConcentrationMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChosenFinalConcentrationMin(Double arg0){
		this.chosenFinalConcentrationMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getChosenInitialConcentrationMax(){
		return this.chosenInitialConcentrationMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChosenInitialConcentrationMax(Double arg0){
		this.chosenInitialConcentrationMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getChosenInitialConcentrationMin(){
		return this.chosenInitialConcentrationMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChosenInitialConcentrationMin(Double arg0){
		this.chosenInitialConcentrationMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCreationDateMax(){
		return this.creationDateMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCreationDateMax(java.util.Date arg0){
		this.creationDateMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCreationDateMin(){
		return this.creationDateMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCreationDateMin(java.util.Date arg0){
		this.creationDateMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Boolean isDroppedCeilFull(){
		return this.droppedCeilFull;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedCeilFull(Boolean arg0){
		this.droppedCeilFull = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Boolean isDroppedFloorFull(){
		return this.droppedFloorFull;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedFloorFull(Boolean arg0){
		this.droppedFloorFull = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GazWeight getForcedGazWeight(){
		return this.forcedGazWeight;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setForcedGazWeight(GazWeight arg0){
		this.forcedGazWeight = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Long getIdMax(){
		return this.idMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setIdMax(Long arg0){
		this.idMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Long getIdMin(){
		return this.idMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setIdMin(Long arg0){
		this.idMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getInstalledInitialConcentrationMax(){
		return this.installedInitialConcentrationMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setInstalledInitialConcentrationMax(Double arg0){
		this.installedInitialConcentrationMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getInstalledInitialConcentrationMin(){
		return this.installedInitialConcentrationMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setInstalledInitialConcentrationMin(Double arg0){
		this.installedInitialConcentrationMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getLeekRepartitionPercentMax(){
		return this.leekRepartitionPercentMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLeekRepartitionPercentMax(Double arg0){
		this.leekRepartitionPercentMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getLeekRepartitionPercentMin(){
		return this.leekRepartitionPercentMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLeekRepartitionPercentMin(Double arg0){
		this.leekRepartitionPercentMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getPrescribedFinalConcentrationMax(){
		return this.prescribedFinalConcentrationMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedFinalConcentrationMax(Double arg0){
		this.prescribedFinalConcentrationMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getPrescribedFinalConcentrationMin(){
		return this.prescribedFinalConcentrationMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedFinalConcentrationMin(Double arg0){
		this.prescribedFinalConcentrationMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getPrescribedInitialConcentrationMax(){
		return this.prescribedInitialConcentrationMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedInitialConcentrationMax(Double arg0){
		this.prescribedInitialConcentrationMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getPrescribedInitialConcentrationMin(){
		return this.prescribedInitialConcentrationMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedInitialConcentrationMin(Double arg0){
		this.prescribedInitialConcentrationMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getPrescribedRetentionMax(){
		return this.prescribedRetentionMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedRetentionMax(Double arg0){
		this.prescribedRetentionMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getPrescribedRetentionMin(){
		return this.prescribedRetentionMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedRetentionMin(Double arg0){
		this.prescribedRetentionMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getRetentionGoalMax(){
		return this.retentionGoalMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRetentionGoalMax(Double arg0){
		this.retentionGoalMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getRetentionGoalMin(){
		return this.retentionGoalMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRetentionGoalMin(Double arg0){
		this.retentionGoalMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Boolean isRetentionInterface(){
		return this.retentionInterface;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRetentionInterface(Boolean arg0){
		this.retentionInterface = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Boolean isSlowUnloading(){
		return this.slowUnloading;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSlowUnloading(Boolean arg0){
		this.slowUnloading = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getSlowUnloadingValueMax(){
		return this.slowUnloadingValueMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSlowUnloadingValueMax(Double arg0){
		this.slowUnloadingValueMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getSlowUnloadingValueMin(){
		return this.slowUnloadingValueMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSlowUnloadingValueMin(Double arg0){
		this.slowUnloadingValueMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getTotalLoadToInstallMax(){
		return this.totalLoadToInstallMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTotalLoadToInstallMax(Double arg0){
		this.totalLoadToInstallMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Double getTotalLoadToInstallMin(){
		return this.totalLoadToInstallMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTotalLoadToInstallMin(Double arg0){
		this.totalLoadToInstallMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getUpdateDateMax(){
		return this.updateDateMax;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUpdateDateMax(java.util.Date arg0){
		this.updateDateMax = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getUpdateDateMin(){
		return this.updateDateMin;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUpdateDateMin(java.util.Date arg0){
		this.updateDateMin = arg0;
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Integer getVersion(){
		return this.version;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setVersion(Integer arg0){
		this.version = arg0;
	} 


}
