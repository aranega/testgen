package com.dooapp.firea.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.GazConfiguration;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for GazConfiguration Class
 * End of user code -->
 */
//Start of user code for queries
//End of user code
@javax.persistence.Entity
public class GazConfigurationBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(GazConfigurationBean.class);

	@javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER, mappedBy = "gazconfiguration", cascade = javax.persistence.CascadeType.ALL)
	private java.util.Set<BottleConfigurationBean> bottleconfigurations;
	@javax.persistence.Column(name = "CREATION_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	
	private boolean droppedCeilFull;
	
	private boolean droppedFloorFull;
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private GazBean gaz;
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 10)
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "seq")
	@javax.persistence.Column(name = "ID")
	private long id;
	
	private double leekRepartitionPercent;
	@javax.persistence.OneToOne(optional = false, cascade = javax.persistence.CascadeType.ALL, mappedBy = "gazconfiguration")
	private ProjectBean project;
	
	private double retentionGoal;
	
	private boolean retentionInterface;
	
	private boolean slowUnloading;
	
	private double slowUnloadingValue;
	@javax.persistence.Column(name = "UPDATE_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date updateDate;
	@javax.persistence.Version
	@javax.persistence.Column(name = "VERSIONCOLUMN")
	private int version;

	@javax.persistence.Transient
	private GazConfiguration wrapper;
    	
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
	 * <!-- Start of user code comment for GazConfiguration wrapper getter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	@Override
	public GazConfiguration getWrapper() {
		if (wrapper == null) {
			wrapper = new GazConfiguration(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for GazConfiguration wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(GazConfiguration wrapper) {
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
	 * <!-- Start of user code comment for bottleconfigurations getter
	 * End of user code -->
	 */
	public java.util.List<BottleConfigurationBean> getBottleconfigurations(){
			if(this.bottleconfigurations==null) {
				this.bottleconfigurations= new java.util.HashSet<BottleConfigurationBean>();
			}
			return new java.util.ArrayList<BottleConfigurationBean>(this.bottleconfigurations);
	}
	
	/*
	 * <!-- Start of user code comment for bottleconfigurations adder
	 * End of user code -->
	 */
	public void addBottleconfigurations(BottleConfigurationBean newBottleconfigurations){
		if(this.bottleconfigurations==null) {
				this.bottleconfigurations= new java.util.HashSet<BottleConfigurationBean>();
			}
				
			this.bottleconfigurations.add (newBottleconfigurations);
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
	 * <!-- Start of user code comment for droppedCeilFull getter
	 * End of user code -->
	 */
	public boolean isDroppedCeilFull(){
		return this.droppedCeilFull;
	}
	
	/*
	 * <!-- Start of user code comment for droppedCeilFull setter
	 * End of user code -->
	 */
	public void setDroppedCeilFull(boolean arg0){
		this.droppedCeilFull = arg0;
	}
	/*
	 * <!-- Start of user code comment for droppedFloorFull getter
	 * End of user code -->
	 */
	public boolean isDroppedFloorFull(){
		return this.droppedFloorFull;
	}
	
	/*
	 * <!-- Start of user code comment for droppedFloorFull setter
	 * End of user code -->
	 */
	public void setDroppedFloorFull(boolean arg0){
		this.droppedFloorFull = arg0;
	}
	/*
	 * <!-- Start of user code comment for gaz getter
	 * End of user code -->
	 */
	public GazBean getGaz(){
		return this.gaz;
	}
	
	/*
	 * <!-- Start of user code comment for gaz setter
	 * End of user code -->
	 */
	public void setGaz(GazBean arg0){
		this.gaz = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for gaz unsetter
	 * End of user code -->
	 */
	public void unsetGaz(){
			this.gaz = null;
			
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
	 * <!-- Start of user code comment for leekRepartitionPercent getter
	 * End of user code -->
	 */
	public double getLeekRepartitionPercent(){
		return this.leekRepartitionPercent;
	}
	
	/*
	 * <!-- Start of user code comment for leekRepartitionPercent setter
	 * End of user code -->
	 */
	public void setLeekRepartitionPercent(double arg0){
		this.leekRepartitionPercent = arg0;
	}
	/*
	 * <!-- Start of user code comment for project getter
	 * End of user code -->
	 */
	public ProjectBean getProject(){
		return this.project;
	}
	
	/*
	 * <!-- Start of user code comment for project setter
	 * End of user code -->
	 */
	public void setProject(ProjectBean arg0){
		this.project = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for project unsetter
	 * End of user code -->
	 */
	public void unsetProject(){
			if (this.project == null) {
				return;
			}
			ProjectBean oldproject = this.project;
			this.project = null;
			oldproject.unsetGazconfiguration();
	} 
	/*
	 * <!-- Start of user code comment for retentionGoal getter
	 * End of user code -->
	 */
	public double getRetentionGoal(){
		return this.retentionGoal;
	}
	
	/*
	 * <!-- Start of user code comment for retentionGoal setter
	 * End of user code -->
	 */
	public void setRetentionGoal(double arg0){
		this.retentionGoal = arg0;
	}
	/*
	 * <!-- Start of user code comment for retentionInterface getter
	 * End of user code -->
	 */
	public boolean isRetentionInterface(){
		return this.retentionInterface;
	}
	
	/*
	 * <!-- Start of user code comment for retentionInterface setter
	 * End of user code -->
	 */
	public void setRetentionInterface(boolean arg0){
		this.retentionInterface = arg0;
	}
	/*
	 * <!-- Start of user code comment for slowUnloading getter
	 * End of user code -->
	 */
	public boolean isSlowUnloading(){
		return this.slowUnloading;
	}
	
	/*
	 * <!-- Start of user code comment for slowUnloading setter
	 * End of user code -->
	 */
	public void setSlowUnloading(boolean arg0){
		this.slowUnloading = arg0;
	}
	/*
	 * <!-- Start of user code comment for slowUnloadingValue getter
	 * End of user code -->
	 */
	public double getSlowUnloadingValue(){
		return this.slowUnloadingValue;
	}
	
	/*
	 * <!-- Start of user code comment for slowUnloadingValue setter
	 * End of user code -->
	 */
	public void setSlowUnloadingValue(double arg0){
		this.slowUnloadingValue = arg0;
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
