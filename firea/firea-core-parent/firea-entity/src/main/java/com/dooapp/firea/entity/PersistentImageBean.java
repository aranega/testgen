package com.dooapp.firea.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.PersistentImage;
import com.dooapp.lib.common.entity.Bean;

//Start of user code for queries
//End of user code
@javax.persistence.Entity
public class PersistentImageBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(PersistentImageBean.class);

	@javax.persistence.OneToOne(optional = false, cascade = javax.persistence.CascadeType.ALL)
	private ContactBean contact;
	@javax.persistence.Column(name = "CREATION_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	
	private String dataId;
	
	private boolean error;
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 10)
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "seq")
	@javax.persistence.Column(name = "ID")
	private long id;
	
	private String preview;
	
	private String sourceFile;
	
	private String title;
	@javax.persistence.Column(name = "UPDATE_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date updateDate;
	@javax.persistence.Version
	@javax.persistence.Column(name = "VERSIONCOLUMN")
	private int version;

	@javax.persistence.Transient
	private PersistentImage wrapper;
    	
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
	public PersistentImage getWrapper() {
		if (wrapper == null) {
			wrapper = new PersistentImage(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	@javax.persistence.Transient
	public void setWrapper(PersistentImage wrapper) {
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
	

	public ContactBean getContact(){
		return this.contact;
	}
	
	public void setContact(ContactBean arg0){
		this.contact = arg0;
	}
	
	public void unsetContact(){
			if (this.contact == null) {
				return;
			}
			ContactBean oldcontact = this.contact;
			this.contact = null;
			oldcontact.unsetImage();
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
	public String getDataId(){
		return this.dataId;
	}
	
	public void setDataId(String arg0){
		this.dataId = arg0;
	}
	public boolean isError(){
		return this.error;
	}
	
	public void setError(boolean arg0){
		this.error = arg0;
	}
	public long getId(){
		return this.id;
	}
	
	public void setId(long arg0){
		this.id = arg0;
	}
	public String getPreview(){
		return this.preview;
	}
	
	public void setPreview(String arg0){
		this.preview = arg0;
	}
	public String getSourceFile(){
		return this.sourceFile;
	}
	
	public void setSourceFile(String arg0){
		this.sourceFile = arg0;
	}
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String arg0){
		this.title = arg0;
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
    


	//Start of user code for methods
	// Other methods
	//End of user code

}