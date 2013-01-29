package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.StepCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code


import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for StepCriteria Class
 * End of user code -->
 */

public class StepCriteriaInstance
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements Bean
// End of user code
{
	
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private java.util.Date dateMax;
	
	private java.util.Date dateMin;
	
	private Long idMax;
	
	private Long idMin;
	
	private String status;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	// Start of user code for attributes
	// Other attributes
	// End of user code

	private StepCriteria wrapper;

	/*
	 * <!-- Start of user code comment for StepCriteria wrapper getter
	 * End of user code -->
	 */
	public StepCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new StepCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for StepCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(StepCriteria wrapper) {
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
	 * <!-- Start of user code comment for dateMax getter
	 * End of user code -->
	 */
	public java.util.Date getDateMax(){
		return this.dateMax;
	}
	
	/*
	 * <!-- Start of user code comment for dateMax setter
	 * End of user code -->
	 */
	public void setDateMax(java.util.Date arg0){
		this.dateMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for dateMin getter
	 * End of user code -->
	 */
	public java.util.Date getDateMin(){
		return this.dateMin;
	}
	
	/*
	 * <!-- Start of user code comment for dateMin setter
	 * End of user code -->
	 */
	public void setDateMin(java.util.Date arg0){
		this.dateMin = arg0;
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
	 * <!-- Start of user code comment for status getter
	 * End of user code -->
	 */
	public String getStatus(){
		return this.status;
	}
	
	/*
	 * <!-- Start of user code comment for status setter
	 * End of user code -->
	 */
	public void setStatus(String arg0){
		this.status = arg0;
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


	// Start of user code for methods
	// Other methods
	// End of user code

}
