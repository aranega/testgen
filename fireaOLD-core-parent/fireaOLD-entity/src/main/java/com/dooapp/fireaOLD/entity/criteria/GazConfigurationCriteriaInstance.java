package com.dooapp.fireaOLD.entity.criteria;

import com.dooapp.fireaOLD.wrapper.criteria.GazConfigurationCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for GazConfigurationCriteria Class
 * End of user code -->
 */

public class GazConfigurationCriteriaInstance implements Bean
{
	
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Boolean droppedCeilFull;
	
	private Boolean droppedFloorFull;
	
	private Long idMax;
	
	private Long idMin;
	
	private Double leekRepartitionPercentMax;
	
	private Double leekRepartitionPercentMin;
	
	private Double retentionGoalMax;
	
	private Double retentionGoalMin;
	
	private Boolean retentionInterface;
	
	private Boolean slowUnloading;
	
	private Double slowUnloadingValueMax;
	
	private Double slowUnloadingValueMin;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private GazConfigurationCriteria wrapper;

	/*
	 * <!-- Start of user code comment for GazConfigurationCriteria wrapper getter
	 * End of user code -->
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
	
	/*
	 * <!-- Start of user code comment for GazConfigurationCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(GazConfigurationCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
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
	 * <!-- Start of user code comment for droppedCeilFull getter
	 * End of user code -->
	 */
	public Boolean isDroppedCeilFull(){
		return this.droppedCeilFull;
	}
	
	/*
	 * <!-- Start of user code comment for droppedCeilFull setter
	 * End of user code -->
	 */
	public void setDroppedCeilFull(Boolean arg0){
		this.droppedCeilFull = arg0;
	} 
	/*
	 * <!-- Start of user code comment for droppedFloorFull getter
	 * End of user code -->
	 */
	public Boolean isDroppedFloorFull(){
		return this.droppedFloorFull;
	}
	
	/*
	 * <!-- Start of user code comment for droppedFloorFull setter
	 * End of user code -->
	 */
	public void setDroppedFloorFull(Boolean arg0){
		this.droppedFloorFull = arg0;
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
	 * <!-- Start of user code comment for leekRepartitionPercentMax getter
	 * End of user code -->
	 */
	public Double getLeekRepartitionPercentMax(){
		return this.leekRepartitionPercentMax;
	}
	
	/*
	 * <!-- Start of user code comment for leekRepartitionPercentMax setter
	 * End of user code -->
	 */
	public void setLeekRepartitionPercentMax(Double arg0){
		this.leekRepartitionPercentMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for leekRepartitionPercentMin getter
	 * End of user code -->
	 */
	public Double getLeekRepartitionPercentMin(){
		return this.leekRepartitionPercentMin;
	}
	
	/*
	 * <!-- Start of user code comment for leekRepartitionPercentMin setter
	 * End of user code -->
	 */
	public void setLeekRepartitionPercentMin(Double arg0){
		this.leekRepartitionPercentMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for retentionGoalMax getter
	 * End of user code -->
	 */
	public Double getRetentionGoalMax(){
		return this.retentionGoalMax;
	}
	
	/*
	 * <!-- Start of user code comment for retentionGoalMax setter
	 * End of user code -->
	 */
	public void setRetentionGoalMax(Double arg0){
		this.retentionGoalMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for retentionGoalMin getter
	 * End of user code -->
	 */
	public Double getRetentionGoalMin(){
		return this.retentionGoalMin;
	}
	
	/*
	 * <!-- Start of user code comment for retentionGoalMin setter
	 * End of user code -->
	 */
	public void setRetentionGoalMin(Double arg0){
		this.retentionGoalMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for retentionInterface getter
	 * End of user code -->
	 */
	public Boolean isRetentionInterface(){
		return this.retentionInterface;
	}
	
	/*
	 * <!-- Start of user code comment for retentionInterface setter
	 * End of user code -->
	 */
	public void setRetentionInterface(Boolean arg0){
		this.retentionInterface = arg0;
	} 
	/*
	 * <!-- Start of user code comment for slowUnloading getter
	 * End of user code -->
	 */
	public Boolean isSlowUnloading(){
		return this.slowUnloading;
	}
	
	/*
	 * <!-- Start of user code comment for slowUnloading setter
	 * End of user code -->
	 */
	public void setSlowUnloading(Boolean arg0){
		this.slowUnloading = arg0;
	} 
	/*
	 * <!-- Start of user code comment for slowUnloadingValueMax getter
	 * End of user code -->
	 */
	public Double getSlowUnloadingValueMax(){
		return this.slowUnloadingValueMax;
	}
	
	/*
	 * <!-- Start of user code comment for slowUnloadingValueMax setter
	 * End of user code -->
	 */
	public void setSlowUnloadingValueMax(Double arg0){
		this.slowUnloadingValueMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for slowUnloadingValueMin getter
	 * End of user code -->
	 */
	public Double getSlowUnloadingValueMin(){
		return this.slowUnloadingValueMin;
	}
	
	/*
	 * <!-- Start of user code comment for slowUnloadingValueMin setter
	 * End of user code -->
	 */
	public void setSlowUnloadingValueMin(Double arg0){
		this.slowUnloadingValueMin = arg0;
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
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
