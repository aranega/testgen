package com.genmymodel.petshop.entity;

import org.jdom2.Attribute;
import org.jdom2.Element;

//Start of user code for imports
// TODO: import me!
//End of user code


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genmymodel.petshop.wrapper.Address;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for Address Class
 * End of user code -->
 */
//Start of user code for queries
//End of user code

/**
 *  
 */
@javax.persistence.Entity
public class AddressBean
//Start of user code bloc for inheritance

//End of user code
//Start of user code bloc for interfaces
 implements Bean
//End of user code
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(AddressBean.class);

	
	/**
	 *  
	 */
	private String city;
	
	/**
	 *  
	 */
	private String country;
	@javax.persistence.Column(name = "CREATION_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 10)
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "seq")
	@javax.persistence.Column(name = "ID")
	private long id;
	
	/**
	 *  
	 */
	private String line1;
	
	/**
	 *  
	 */
	private String line2;
	@javax.persistence.Column(name = "UPDATE_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date updateDate;
	@javax.persistence.Version
	@javax.persistence.Column(name = "VERSIONCOLUMN")
	private int version;

	@javax.persistence.Transient
	private Address wrapper;
    	
	/**
	 * The current UUID of this object.<br>
	 * It's generated by the JPA provider, so you do not have to do it yourself.<br>
	 * <br>
	 * 
	 * @see <a
	 *      href="http://openjpa.apache.org/builds/2.1.1/apache-openjpa-2.1.1/docs/jpa_overview_meta_field.html#jpa_overview_meta_gen">jpa
	 *      documentation</a>
	 * @see <a href="http://fr.wikipedia.org/wiki/UUID">wikipedia</a>
	 */
	@javax.persistence.Column(name = "UUID", columnDefinition = "CHAR(36)")
	protected String uuid;
	/*
	 * <!-- Start of user code comment for Address wrapper getter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	@Override
	public Address getWrapper() {
		if (wrapper == null) {
			wrapper = new Address(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for Address wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(Address wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/**
	 * Configure date and identifiant when persisting the object the first time
	 */
	@javax.persistence.PrePersist
	void initDates() {
		updateDate = new java.util.Date();
		creationDate = new java.util.Date();
		if (uuid == null) {
			uuid = java.util.UUID.randomUUID().toString();
		}
	}
	
	/**
	 * Configure the update date when updating the object
	 */
	@javax.persistence.PreUpdate
	void initUpdateDate() {
		updateDate = new java.util.Date();
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
	 * <!-- Start of user code comment for creationDate getter
	 * End of user code -->
	 */
	public java.util.Date getCreationDate(){
		return this.creationDate;
	}
	
	/*
	 * <!-- Start of user code comment for creationDate setter
	 * End of user code -->
	 */
	public void setCreationDate(java.util.Date arg0){
		this.creationDate = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for creationDate unsetter
	 * End of user code -->
	 */
	public void unsetCreationDate(java.util.Date arg0){
		this.creationDate = null;
	}
	/*
	 * <!-- Start of user code comment for id getter
	 * End of user code -->
	 */
	public long getId(){
		return this.id;
	}
	
	/*
	 * <!-- Start of user code comment for id setter
	 * End of user code -->
	 */
	public void setId(long arg0){
		this.id = arg0;
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
	 * <!-- Start of user code comment for updateDate getter
	 * End of user code -->
	 */
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}
	
	/*
	 * <!-- Start of user code comment for updateDate setter
	 * End of user code -->
	 */
	public void setUpdateDate(java.util.Date arg0){
		this.updateDate = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for updateDate unsetter
	 * End of user code -->
	 */
	public void unsetUpdateDate(java.util.Date arg0){
		this.updateDate = null;
	}
	/*
	 * <!-- Start of user code comment for version getter
	 * End of user code -->
	 */
	public int getVersion(){
		return this.version;
	}
	
	/*
	 * <!-- Start of user code comment for version setter
	 * End of user code -->
	 */
	public void setVersion(int arg0){
		this.version = arg0;
	}
    

	public Element toXML(){
		Element xmlElement = new Element("Address");
		if (uuid != null)
			xmlElement.setAttribute(new Attribute("uuid", uuid));
		if (getLine2() != null)
			xmlElement.setAttribute(new Attribute("line2", getLine2()));
		if (getLine1() != null)
			xmlElement.setAttribute(new Attribute("line1", getLine1()));
		if (getCountry() != null)
			xmlElement.setAttribute(new Attribute("country", getCountry()));
		if (getCity() != null)
			xmlElement.setAttribute(new Attribute("city", getCity()));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		
		
		return xmlElement;
	}

	//Start of user code for methods
	// Other methods
	//End of user code

}