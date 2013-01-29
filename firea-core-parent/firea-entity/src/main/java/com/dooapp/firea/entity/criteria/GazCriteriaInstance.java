package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.GazCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code


import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for GazCriteria Class
 * End of user code -->
 */

public class GazCriteriaInstance
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements Bean
// End of user code
{
	
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Double densityMax;
	
	private Double densityMin;
	
	private Long idMax;
	
	private Long idMin;
	
	private String name;
	
	private Integer type;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	
	private String weight;
	// Start of user code for attributes
	// Other attributes
	// End of user code

	private GazCriteria wrapper;

	/*
	 * <!-- Start of user code comment for GazCriteria wrapper getter
	 * End of user code -->
	 */
	public GazCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new GazCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for GazCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(GazCriteria wrapper) {
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
	 * <!-- Start of user code comment for densityMax getter
	 * End of user code -->
	 */
	public Double getDensityMax(){
		return this.densityMax;
	}
	
	/*
	 * <!-- Start of user code comment for densityMax setter
	 * End of user code -->
	 */
	public void setDensityMax(Double arg0){
		this.densityMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for densityMin getter
	 * End of user code -->
	 */
	public Double getDensityMin(){
		return this.densityMin;
	}
	
	/*
	 * <!-- Start of user code comment for densityMin setter
	 * End of user code -->
	 */
	public void setDensityMin(Double arg0){
		this.densityMin = arg0;
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
	 * <!-- Start of user code comment for type getter
	 * End of user code -->
	 */
	public Integer getType(){
		return this.type;
	}
	
	/*
	 * <!-- Start of user code comment for type setter
	 * End of user code -->
	 */
	public void setType(Integer arg0){
		this.type = arg0;
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
	 * <!-- Start of user code comment for weight getter
	 * End of user code -->
	 */
	public String getWeight(){
		return this.weight;
	}
	
	/*
	 * <!-- Start of user code comment for weight setter
	 * End of user code -->
	 */
	public void setWeight(String arg0){
		this.weight = arg0;
	} 


	// Start of user code for methods
	// Other methods
	// End of user code

}
