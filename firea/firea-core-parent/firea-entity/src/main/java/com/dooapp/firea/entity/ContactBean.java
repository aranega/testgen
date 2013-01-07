package com.dooapp.firea.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.Contact;
import com.dooapp.lib.common.entity.Bean;

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
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
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
	public java.util.Date getCreationDate(){
		return this.creationDate;
	}
	
	public void setCreationDate(java.util.Date arg0){
		this.creationDate = arg0;
	}
	
	public void unsetCreationDate(java.util.Date arg0){
		this.creationDate = null;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String arg0){
		this.email = arg0;
	}
	public long getId(){
		return this.id;
	}
	
	public void setId(long arg0){
		this.id = arg0;
	}
	public PersistentImageBean getImage(){
		return this.image;
	}
	
	public void setImage(PersistentImageBean arg0){
		this.image = arg0;
	}
	
	public void unsetImage(){
			this.image = null;
			
	} 
	public com.dooapp.firea.entity.ContactKind getKind(){
		return this.kind;
	}
	
	public void setKind(com.dooapp.firea.entity.ContactKind arg0){
		this.kind = arg0;
	}
	
	public void unsetKind(com.dooapp.firea.entity.ContactKind arg0){
		this.kind = null;
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
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}
	
	public void setUpdateDate(java.util.Date arg0){
		this.updateDate = arg0;
	}
	
	public void unsetUpdateDate(java.util.Date arg0){
		this.updateDate = null;
	}
	public int getVersion(){
		return this.version;
	}
	
	public void setVersion(int arg0){
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
