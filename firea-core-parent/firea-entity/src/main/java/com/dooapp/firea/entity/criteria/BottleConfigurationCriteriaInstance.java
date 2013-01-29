package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.BottleConfigurationCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code


import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for BottleConfigurationCriteria Class
 * End of user code -->
 */

public class BottleConfigurationCriteriaInstance
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements Bean
// End of user code
{
	
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Long idMax;
	
	private Long idMin;
	
	private Double loadMax;
	
	private Double loadMin;
	
	private Integer quantity;
	
	private String unit;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	// Start of user code for attributes
	// Other attributes
	// End of user code

	private BottleConfigurationCriteria wrapper;

	/*
	 * <!-- Start of user code comment for BottleConfigurationCriteria wrapper getter
	 * End of user code -->
	 */
	public BottleConfigurationCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new BottleConfigurationCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for BottleConfigurationCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(BottleConfigurationCriteria wrapper) {
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
	 * <!-- Start of user code comment for loadMax getter
	 * End of user code -->
	 */
	public Double getLoadMax(){
		return this.loadMax;
	}
	
	/*
	 * <!-- Start of user code comment for loadMax setter
	 * End of user code -->
	 */
	public void setLoadMax(Double arg0){
		this.loadMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for loadMin getter
	 * End of user code -->
	 */
	public Double getLoadMin(){
		return this.loadMin;
	}
	
	/*
	 * <!-- Start of user code comment for loadMin setter
	 * End of user code -->
	 */
	public void setLoadMin(Double arg0){
		this.loadMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for quantity getter
	 * End of user code -->
	 */
	public Integer getQuantity(){
		return this.quantity;
	}
	
	/*
	 * <!-- Start of user code comment for quantity setter
	 * End of user code -->
	 */
	public void setQuantity(Integer arg0){
		this.quantity = arg0;
	} 
	/*
	 * <!-- Start of user code comment for unit getter
	 * End of user code -->
	 */
	public String getUnit(){
		return this.unit;
	}
	
	/*
	 * <!-- Start of user code comment for unit setter
	 * End of user code -->
	 */
	public void setUnit(String arg0){
		this.unit = arg0;
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
