package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.GazConfigurationCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


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

	public GazConfigurationCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new GazConfigurationCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(GazConfigurationCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
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
	public Boolean isDroppedCeilFull(){
		return this.droppedCeilFull;
	}
	
	public void setDroppedCeilFull(Boolean arg0){
		this.droppedCeilFull = arg0;
	} 
	public Boolean isDroppedFloorFull(){
		return this.droppedFloorFull;
	}
	
	public void setDroppedFloorFull(Boolean arg0){
		this.droppedFloorFull = arg0;
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
	public Double getLeekRepartitionPercentMax(){
		return this.leekRepartitionPercentMax;
	}
	
	public void setLeekRepartitionPercentMax(Double arg0){
		this.leekRepartitionPercentMax = arg0;
	} 
	public Double getLeekRepartitionPercentMin(){
		return this.leekRepartitionPercentMin;
	}
	
	public void setLeekRepartitionPercentMin(Double arg0){
		this.leekRepartitionPercentMin = arg0;
	} 
	public Double getRetentionGoalMax(){
		return this.retentionGoalMax;
	}
	
	public void setRetentionGoalMax(Double arg0){
		this.retentionGoalMax = arg0;
	} 
	public Double getRetentionGoalMin(){
		return this.retentionGoalMin;
	}
	
	public void setRetentionGoalMin(Double arg0){
		this.retentionGoalMin = arg0;
	} 
	public Boolean isRetentionInterface(){
		return this.retentionInterface;
	}
	
	public void setRetentionInterface(Boolean arg0){
		this.retentionInterface = arg0;
	} 
	public Boolean isSlowUnloading(){
		return this.slowUnloading;
	}
	
	public void setSlowUnloading(Boolean arg0){
		this.slowUnloading = arg0;
	} 
	public Double getSlowUnloadingValueMax(){
		return this.slowUnloadingValueMax;
	}
	
	public void setSlowUnloadingValueMax(Double arg0){
		this.slowUnloadingValueMax = arg0;
	} 
	public Double getSlowUnloadingValueMin(){
		return this.slowUnloadingValueMin;
	}
	
	public void setSlowUnloadingValueMin(Double arg0){
		this.slowUnloadingValueMin = arg0;
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
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
