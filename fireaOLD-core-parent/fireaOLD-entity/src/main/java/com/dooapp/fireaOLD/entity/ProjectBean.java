package com.dooapp.fireaOLD.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.fireaOLD.wrapper.Project;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for Project Class
 * End of user code -->
 */
//Start of user code for queries
//End of user code
@javax.persistence.Entity
public class ProjectBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ProjectBean.class);

	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private com.dooapp.fireaOLD.entity.ProjectKind Status;
	@javax.persistence.ManyToMany(cascade = javax.persistence.CascadeType.ALL, fetch = javax.persistence.FetchType.EAGER)
	@javax.persistence.JoinTable(name = "PROJECT_CONTACTS")
	private java.util.Set<ContactBean> contacts;
	@javax.persistence.Column(name = "CREATION_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	
	private String description;
	@javax.persistence.OneToOne(optional = false, cascade = javax.persistence.CascadeType.ALL)
	private GazConfigurationBean gazconfiguration;
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 10)
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "seq")
	@javax.persistence.Column(name = "ID")
	private long id;
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private PersistentImageBean image;
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private com.dooapp.fireaOLD.entity.ProjectKind kind;
	@javax.persistence.Column(name = "NAMECOLUMN")
	private String name;
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private RisqueBean risque;
	@javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER, mappedBy = "project", cascade = javax.persistence.CascadeType.ALL)
	private java.util.Set<SampleBean> sample;
	@javax.persistence.Column(name = "UPDATE_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date updateDate;
	@javax.persistence.Version
	@javax.persistence.Column(name = "VERSIONCOLUMN")
	private int version;

	@javax.persistence.Transient
	private Project wrapper;
    	
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
	 * <!-- Start of user code comment for Project wrapper getter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	@Override
	public Project getWrapper() {
		if (wrapper == null) {
			wrapper = new Project(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for Project wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(Project wrapper) {
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
	 * <!-- Start of user code comment for Status getter
	 * End of user code -->
	 */
	public com.dooapp.fireaOLD.entity.ProjectKind getStatus(){
		return this.Status;
	}
	
	/*
	 * <!-- Start of user code comment for Status setter
	 * End of user code -->
	 */
	public void setStatus(com.dooapp.fireaOLD.entity.ProjectKind arg0){
		this.Status = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for Status unsetter
	 * End of user code -->
	 */
	public void unsetStatus(com.dooapp.fireaOLD.entity.ProjectKind arg0){
		this.Status = null;
	}
	/*
	 * <!-- Start of user code comment for contacts getter
	 * End of user code -->
	 */
	public java.util.List<ContactBean> getContacts(){
			if(this.contacts==null) {
				this.contacts= new java.util.HashSet<ContactBean>();
			}
			return new java.util.ArrayList<ContactBean>(this.contacts);
	}
	
	/*
	 * <!-- Start of user code comment for contacts adder
	 * End of user code -->
	 */
	public void addContacts(ContactBean newContacts){
		if(this.contacts==null) {
				this.contacts= new java.util.HashSet<ContactBean>();
			}
				
			this.contacts.add (newContacts);
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
	 * <!-- Start of user code comment for description getter
	 * End of user code -->
	 */
	public String getDescription(){
		return this.description;
	}
	
	/*
	 * <!-- Start of user code comment for description setter
	 * End of user code -->
	 */
	public void setDescription(String arg0){
		this.description = arg0;
	}
	/*
	 * <!-- Start of user code comment for gazconfiguration getter
	 * End of user code -->
	 */
	public GazConfigurationBean getGazconfiguration(){
		return this.gazconfiguration;
	}
	
	/*
	 * <!-- Start of user code comment for gazconfiguration setter
	 * End of user code -->
	 */
	public void setGazconfiguration(GazConfigurationBean arg0){
		this.gazconfiguration = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for gazconfiguration unsetter
	 * End of user code -->
	 */
	public void unsetGazconfiguration(){
			if (this.gazconfiguration == null) {
				return;
			}
			GazConfigurationBean oldgazconfiguration = this.gazconfiguration;
			this.gazconfiguration = null;
			oldgazconfiguration.unsetProject();
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
			this.image = null;
			
	} 
	/*
	 * <!-- Start of user code comment for kind getter
	 * End of user code -->
	 */
	public com.dooapp.fireaOLD.entity.ProjectKind getKind(){
		return this.kind;
	}
	
	/*
	 * <!-- Start of user code comment for kind setter
	 * End of user code -->
	 */
	public void setKind(com.dooapp.fireaOLD.entity.ProjectKind arg0){
		this.kind = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for kind unsetter
	 * End of user code -->
	 */
	public void unsetKind(com.dooapp.fireaOLD.entity.ProjectKind arg0){
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
	 * <!-- Start of user code comment for risque getter
	 * End of user code -->
	 */
	public RisqueBean getRisque(){
		return this.risque;
	}
	
	/*
	 * <!-- Start of user code comment for risque setter
	 * End of user code -->
	 */
	public void setRisque(RisqueBean arg0){
		this.risque = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for risque unsetter
	 * End of user code -->
	 */
	public void unsetRisque(){
			this.risque = null;
			
	} 
	/*
	 * <!-- Start of user code comment for sample getter
	 * End of user code -->
	 */
	public java.util.List<SampleBean> getSample(){
			if(this.sample==null) {
				this.sample= new java.util.HashSet<SampleBean>();
			}
			return new java.util.ArrayList<SampleBean>(this.sample);
	}
	
	/*
	 * <!-- Start of user code comment for sample adder
	 * End of user code -->
	 */
	public void addSample(SampleBean newSample){
		if(this.sample==null) {
				this.sample= new java.util.HashSet<SampleBean>();
			}
				
			this.sample.add (newSample);
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