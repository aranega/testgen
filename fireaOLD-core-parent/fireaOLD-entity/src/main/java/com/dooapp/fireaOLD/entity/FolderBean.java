package com.dooapp.fireaOLD.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.fireaOLD.wrapper.Folder;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for Folder Class
 * End of user code -->
 */
//Start of user code for queries
//End of user code
@javax.persistence.Entity
public class FolderBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(FolderBean.class);

	@javax.persistence.Column(name = "CREATION_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	
	private int displayOrder;
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 10)
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "seq")
	@javax.persistence.Column(name = "ID")
	private long id;
	@javax.persistence.Column(name = "NAMECOLUMN")
	private String name;
	@javax.persistence.Column(name = "UPDATE_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date updateDate;
	@javax.persistence.Version
	@javax.persistence.Column(name = "VERSIONCOLUMN")
	private int version;

	@javax.persistence.Transient
	private Folder wrapper;
    	
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
	 * <!-- Start of user code comment for Folder wrapper getter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	@Override
	public Folder getWrapper() {
		if (wrapper == null) {
			wrapper = new Folder(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for Folder wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(Folder wrapper) {
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
	 * <!-- Start of user code comment for displayOrder getter
	 * End of user code -->
	 */
	public int getDisplayOrder(){
		return this.displayOrder;
	}
	
	/*
	 * <!-- Start of user code comment for displayOrder setter
	 * End of user code -->
	 */
	public void setDisplayOrder(int arg0){
		this.displayOrder = arg0;
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
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
