package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.ReadingCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


public class ReadingCriteriaInstance implements Bean
{
	
	
	private Double buildingPressureMax;
	
	private Double buildingPressureMin;
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Double fanPressureMax;
	
	private Double fanPressureMin;
	
	private Long idMax;
	
	private Long idMin;
	
	private Boolean lowFlow;
	
	private Integer timeAverageMax;
	
	private Integer timeAverageMin;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private ReadingCriteria wrapper;

	public ReadingCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new ReadingCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(ReadingCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	public Double getBuildingPressureMax(){
		return this.buildingPressureMax;
	}
	
	public void setBuildingPressureMax(Double arg0){
		this.buildingPressureMax = arg0;
	} 
	public Double getBuildingPressureMin(){
		return this.buildingPressureMin;
	}
	
	public void setBuildingPressureMin(Double arg0){
		this.buildingPressureMin = arg0;
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
	public Double getFanPressureMax(){
		return this.fanPressureMax;
	}
	
	public void setFanPressureMax(Double arg0){
		this.fanPressureMax = arg0;
	} 
	public Double getFanPressureMin(){
		return this.fanPressureMin;
	}
	
	public void setFanPressureMin(Double arg0){
		this.fanPressureMin = arg0;
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
	public Boolean isLowFlow(){
		return this.lowFlow;
	}
	
	public void setLowFlow(Boolean arg0){
		this.lowFlow = arg0;
	} 
	public Integer getTimeAverageMax(){
		return this.timeAverageMax;
	}
	
	public void setTimeAverageMax(Integer arg0){
		this.timeAverageMax = arg0;
	} 
	public Integer getTimeAverageMin(){
		return this.timeAverageMin;
	}
	
	public void setTimeAverageMin(Integer arg0){
		this.timeAverageMin = arg0;
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
