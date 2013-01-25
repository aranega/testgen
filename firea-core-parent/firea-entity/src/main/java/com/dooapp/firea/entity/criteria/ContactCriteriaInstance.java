package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.ContactCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code


import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for ContactCriteria Class
 * End of user code -->
 */

public class ContactCriteriaInstance
// Start of user code bloc for inheritance

// End of user code
// Start of user code bloc for interface
 implements Bean
// End of user code
{
	
	
	private String address2;
	
	private String adress1;
	
	private String city;
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private String email;
	
	private Long idMax;
	
	private Long idMin;
	
	private String kind;
	
	private String name;
	
	private String person;
	
	private String phone;
	
	private String siret;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	
	private String zipCode;
	// Start of user code for attributes
	// Other attributes
	// End of user code

	private ContactCriteria wrapper;

	/*
	 * <!-- Start of user code comment for ContactCriteria wrapper getter
	 * End of user code -->
	 */
	public ContactCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new ContactCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for ContactCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(ContactCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/*
	 * <!-- Start of user code comment for address2 getter
	 * End of user code -->
	 */
	public String getAddress2(){
		return this.address2;
	}
	
	/*
	 * <!-- Start of user code comment for address2 setter
	 * End of user code -->
	 */
	public void setAddress2(String arg0){
		this.address2 = arg0;
	} 
	/*
	 * <!-- Start of user code comment for adress1 getter
	 * End of user code -->
	 */
	public String getAdress1(){
		return this.adress1;
	}
	
	/*
	 * <!-- Start of user code comment for adress1 setter
	 * End of user code -->
	 */
	public void setAdress1(String arg0){
		this.adress1 = arg0;
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
	 * <!-- Start of user code comment for email getter
	 * End of user code -->
	 */
	public String getEmail(){
		return this.email;
	}
	
	/*
	 * <!-- Start of user code comment for email setter
	 * End of user code -->
	 */
	public void setEmail(String arg0){
		this.email = arg0;
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
	 * <!-- Start of user code comment for kind getter
	 * End of user code -->
	 */
	public String getKind(){
		return this.kind;
	}
	
	/*
	 * <!-- Start of user code comment for kind setter
	 * End of user code -->
	 */
	public void setKind(String arg0){
		this.kind = arg0;
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
	 * <!-- Start of user code comment for person getter
	 * End of user code -->
	 */
	public String getPerson(){
		return this.person;
	}
	
	/*
	 * <!-- Start of user code comment for person setter
	 * End of user code -->
	 */
	public void setPerson(String arg0){
		this.person = arg0;
	} 
	/*
	 * <!-- Start of user code comment for phone getter
	 * End of user code -->
	 */
	public String getPhone(){
		return this.phone;
	}
	
	/*
	 * <!-- Start of user code comment for phone setter
	 * End of user code -->
	 */
	public void setPhone(String arg0){
		this.phone = arg0;
	} 
	/*
	 * <!-- Start of user code comment for siret getter
	 * End of user code -->
	 */
	public String getSiret(){
		return this.siret;
	}
	
	/*
	 * <!-- Start of user code comment for siret setter
	 * End of user code -->
	 */
	public void setSiret(String arg0){
		this.siret = arg0;
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
	 * <!-- Start of user code comment for zipCode getter
	 * End of user code -->
	 */
	public String getZipCode(){
		return this.zipCode;
	}
	
	/*
	 * <!-- Start of user code comment for zipCode setter
	 * End of user code -->
	 */
	public void setZipCode(String arg0){
		this.zipCode = arg0;
	} 


	// Start of user code for methods
	// Other methods
	// End of user code

}
