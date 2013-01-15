package com.dooapp.firea.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.Contact;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for Contact Class
 * End of user code -->
 */
//Start of user code for queries
//End of user code

@javax.persistence.Entity
public class ContactBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ContactBean.class);

	
	private String address2;
	
	private String adress1;
	
	private String city;
	@javax.persistence.Column(name = "CREATION_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	
	private String email;
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 10)
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "seq")
	@javax.persistence.Column(name = "ID")
	private long id;
	
	@javax.persistence.OneToOne(optional = false, cascade = javax.persistence.CascadeType.ALL, mappedBy = "contact")
	private PersistentImageBean image;
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private com.dooapp.firea.entity.ContactKind kind;
	
	@javax.persistence.Column(name = "NAMECOLUMN")
	private String name;
	
	private String person;
	
	private String phone;
	
	private String siret;
	@javax.persistence.Column(name = "UPDATE_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date updateDate;
	@javax.persistence.Version
	@javax.persistence.Column(name = "VERSIONCOLUMN")
	private int version;
	
	private String zipCode;

	@javax.persistence.Transient
	private Contact wrapper;
    	
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
	private String uuid;
	/*
	 * <!-- Start of user code comment for Contact wrapper getter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	@Override
	public Contact getWrapper() {
		if (wrapper == null) {
			wrapper = new Contact(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for Contact wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(Contact wrapper) {
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
	 * <!-- Start of user code comment for image getter
	 * End of user code -->
	 */
	public PersistentImageBean getImage(){
		return this.image;
	}
	
	/*
	 * <!-- Start of user code comment for image setter
	 * End of user code -->
	 */
	public void setImage(PersistentImageBean arg0){
		this.image = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for image unsetter
	 * End of user code -->
	 */
	public void unsetImage(){
			if (this.image == null) {
				return;
			}
			PersistentImageBean oldimage = this.image;
			this.image = null;
			oldimage.unsetContact();
	} 
	/*
	 * <!-- Start of user code comment for kind getter
	 * End of user code -->
	 */
	public com.dooapp.firea.entity.ContactKind getKind(){
		return this.kind;
	}
	
	/*
	 * <!-- Start of user code comment for kind setter
	 * End of user code -->
	 */
	public void setKind(com.dooapp.firea.entity.ContactKind arg0){
		this.kind = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for kind unsetter
	 * End of user code -->
	 */
	public void unsetKind(com.dooapp.firea.entity.ContactKind arg0){
		this.kind = null;
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
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
