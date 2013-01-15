package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.ReadingCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for ReadingCriteria Class
 * End of user code -->
 */

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

	/*
	 * <!-- Start of user code comment for ReadingCriteria wrapper getter
	 * End of user code -->
	 */
	public ReadingCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new ReadingCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for ReadingCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(ReadingCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/*
	 * <!-- Start of user code comment for buildingPressureMax getter
	 * End of user code -->
	 */
	public Double getBuildingPressureMax(){
		return this.buildingPressureMax;
	}
	
	/*
	 * <!-- Start of user code comment for buildingPressureMax setter
	 * End of user code -->
	 */
	public void setBuildingPressureMax(Double arg0){
		this.buildingPressureMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for buildingPressureMin getter
	 * End of user code -->
	 */
	public Double getBuildingPressureMin(){
		return this.buildingPressureMin;
	}
	
	/*
	 * <!-- Start of user code comment for buildingPressureMin setter
	 * End of user code -->
	 */
	public void setBuildingPressureMin(Double arg0){
		this.buildingPressureMin = arg0;
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
	 * <!-- Start of user code comment for fanPressureMax getter
	 * End of user code -->
	 */
	public Double getFanPressureMax(){
		return this.fanPressureMax;
	}
	
	/*
	 * <!-- Start of user code comment for fanPressureMax setter
	 * End of user code -->
	 */
	public void setFanPressureMax(Double arg0){
		this.fanPressureMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for fanPressureMin getter
	 * End of user code -->
	 */
	public Double getFanPressureMin(){
		return this.fanPressureMin;
	}
	
	/*
	 * <!-- Start of user code comment for fanPressureMin setter
	 * End of user code -->
	 */
	public void setFanPressureMin(Double arg0){
		this.fanPressureMin = arg0;
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
	 * <!-- Start of user code comment for lowFlow getter
	 * End of user code -->
	 */
	public Boolean isLowFlow(){
		return this.lowFlow;
	}
	
	/*
	 * <!-- Start of user code comment for lowFlow setter
	 * End of user code -->
	 */
	public void setLowFlow(Boolean arg0){
		this.lowFlow = arg0;
	} 
	/*
	 * <!-- Start of user code comment for timeAverageMax getter
	 * End of user code -->
	 */
	public Integer getTimeAverageMax(){
		return this.timeAverageMax;
	}
	
	/*
	 * <!-- Start of user code comment for timeAverageMax setter
	 * End of user code -->
	 */
	public void setTimeAverageMax(Integer arg0){
		this.timeAverageMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for timeAverageMin getter
	 * End of user code -->
	 */
	public Integer getTimeAverageMin(){
		return this.timeAverageMin;
	}
	
	/*
	 * <!-- Start of user code comment for timeAverageMin setter
	 * End of user code -->
	 */
	public void setTimeAverageMin(Integer arg0){
		this.timeAverageMin = arg0;
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
