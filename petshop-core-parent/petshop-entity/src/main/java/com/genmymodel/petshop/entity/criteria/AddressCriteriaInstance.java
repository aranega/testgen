package com.genmymodel.petshop.entity.criteria;

import com.genmymodel.petshop.wrapper.criteria.AddressCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code


import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for AddressCriteria Class
 * End of user code -->
 */

public class AddressCriteriaInstance
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements Bean
// End of user code
{
	
	
	private String city;
	
	private String country;
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Long idMax;
	
	private Long idMin;
	
	private String line1;
	
	private String line2;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	// Start of user code for attributes
	// Other attributes
	// End of user code

	private AddressCriteria wrapper;

	/*
	 * <!-- Start of user code comment for AddressCriteria wrapper getter
	 * End of user code -->
	 */
	public AddressCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new AddressCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for AddressCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(AddressCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/*
	 * <!-- Start of user code comment for city getter
	 * End of user code -->
	 */
	public String getCity(){
		return this.city;
	}
	
	/*
	 * <!-- Start of user code comment for city setter
	 * End of user code -->
	 */
	public void setCity(String arg0){
		this.city = arg0;
	} 
	/*
	 * <!-- Start of user code comment for country getter
	 * End of user code -->
	 */
	public String getCountry(){
		return this.country;
	}
	
	/*
	 * <!-- Start of user code comment for country setter
	 * End of user code -->
	 */
	public void setCountry(String arg0){
		this.country = arg0;
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
	 * <!-- Start of user code comment for line1 getter
	 * End of user code -->
	 */
	public String getLine1(){
		return this.line1;
	}
	
	/*
	 * <!-- Start of user code comment for line1 setter
	 * End of user code -->
	 */
	public void setLine1(String arg0){
		this.line1 = arg0;
	} 
	/*
	 * <!-- Start of user code comment for line2 getter
	 * End of user code -->
	 */
	public String getLine2(){
		return this.line2;
	}
	
	/*
	 * <!-- Start of user code comment for line2 setter
	 * End of user code -->
	 */
	public void setLine2(String arg0){
		this.line2 = arg0;
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
