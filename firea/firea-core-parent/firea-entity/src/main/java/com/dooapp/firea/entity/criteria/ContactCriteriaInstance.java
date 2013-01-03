package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.ContactCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


public class ContactCriteriaInstance implements Bean
{
	
	
	private String address2;
	
	private String adress1;
	
	private String city;
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private String email;
	
	private Long idMax;
	
	private Long idMin;
	
	private com.dooapp.firea.entity.ContactKind kind;
	
	private String name;
	
	private String person;
	
	private String phone;
	
	private String siret;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	
	private String zipCode;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private ContactCriteria wrapper;

	public ContactCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new ContactCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(ContactCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	public String getAddress2(){
		return this.address2;
	}
	
	public void setAddress2(String arg0){
		this.address2 = arg0;
	} 
	public String getAdress1(){
		return this.adress1;
	}
	
	public void setAdress1(String arg0){
		this.adress1 = arg0;
	} 
	public String getCity(){
		return this.city;
	}
	
	public void setCity(String arg0){
		this.city = arg0;
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
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String arg0){
		this.email = arg0;
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
	public com.dooapp.firea.entity.ContactKind getKind(){
		return this.kind;
	}
	
	public void setKind(com.dooapp.firea.entity.ContactKind arg0){
		this.kind = arg0;
	} 
	public String getName(){
		return this.name;
	}
	
	public void setName(String arg0){
		this.name = arg0;
	} 
	public String getPerson(){
		return this.person;
	}
	
	public void setPerson(String arg0){
		this.person = arg0;
	} 
	public String getPhone(){
		return this.phone;
	}
	
	public void setPhone(String arg0){
		this.phone = arg0;
	} 
	public String getSiret(){
		return this.siret;
	}
	
	public void setSiret(String arg0){
		this.siret = arg0;
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
	public String getZipCode(){
		return this.zipCode;
	}
	
	public void setZipCode(String arg0){
		this.zipCode = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
