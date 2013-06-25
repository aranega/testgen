package com.dooapp.firea.entity;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.GazConfiguration;

import com.dooapp.lib.common.entity.Bean;
import com.dooapp.lib.common.entity.WrapperClass;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
@WrapperClass(GazConfiguration.class)
public class GazConfigurationBean
//Start of user code bloc for inheritance

//End of user code
//Start of user code bloc for interfaces
 implements Bean
//End of user code
{
	/**
	 * The logger
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	private static final Logger logger = LoggerFactory.getLogger(GazConfigurationBean.class);

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER, mappedBy = "gazconfiguration", cascade = javax.persistence.CascadeType.ALL)
	private java.util.Set<BottleConfigurationBean> bottleconfigurations;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Column(name = "CREATION_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean droppedCeilFull;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean droppedFloorFull;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 10)
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "seq")
	@javax.persistence.Column(name = "ID")
	private long id;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double leekRepartitionPercent;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.OneToOne(optional = true, cascade = javax.persistence.CascadeType.ALL, mappedBy = "gazconfiguration")
	private ProjectBean project;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double retentionGoal;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean retentionInterface;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean slowUnloading;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double slowUnloadingValue;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Column(name = "UPDATE_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date updateDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Version
	@javax.persistence.Column(name = "VERSIONCOLUMN")
	private int version;
	
	/**
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	@javax.persistence.Transient
	private GazConfiguration wrapper;

	public GazConfigurationBean() {
		if (uuid == null)
			uuid = java.util.UUID.randomUUID().toString();
	}
	
	/**
	 * The current UUID of this object.<br>
	 * It's generated by the JPA provider, so you do not have to do it yourself.<br>
	 * <br>
	 * 
	 * @see <a
	 *      href="http://openjpa.apache.org/builds/2.1.1/apache-openjpa-2.1.1/docs/jpa_overview_meta_field.html#jpa_overview_meta_gen">jpa
	 *      documentation</a>
	 * @see <a href="http://fr.wikipedia.org/wiki/UUID">wikipedia</a>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Column(name = "UUID", columnDefinition = "CHAR(36)")
	protected String uuid;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Transient
	@Override
	public GazConfiguration getWrapper() {
		if (!isWrapped()) {
			wrapper = new GazConfiguration(this);
		}
		return wrapper;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Transient
	public void setWrapper(GazConfiguration wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/**
	 * Configure date and uuid when persisting the object the first time
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.PreUpdate
	void initUpdateDate() {
		updateDate = new java.util.Date();
	}
	
	public String getUUID() {
		return this.uuid;
	}
	
	/**
	 * Provide a new UUID
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateUUID() {
		uuid = java.util.UUID.randomUUID().toString();
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.List<BottleConfigurationBean> getBottleconfigurations(){
			if(this.bottleconfigurations==null) {
				this.bottleconfigurations= new java.util.HashSet<BottleConfigurationBean>();
			}
			return new java.util.ArrayList<BottleConfigurationBean>(this.bottleconfigurations);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void addBottleconfigurations(BottleConfigurationBean newBottleconfigurations){
		if(this.bottleconfigurations==null) {
				this.bottleconfigurations= new java.util.HashSet<BottleConfigurationBean>();
			}
				
			this.bottleconfigurations.add (newBottleconfigurations);
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getCreationDate(){
		return this.creationDate;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCreationDate(java.util.Date arg0){
		this.creationDate = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isDroppedCeilFull(){
		return this.droppedCeilFull;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedCeilFull(boolean arg0){
		this.droppedCeilFull = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isDroppedFloorFull(){
		return this.droppedFloorFull;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedFloorFull(boolean arg0){
		this.droppedFloorFull = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public long getId(){
		return this.id;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setId(long arg0){
		this.id = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getLeekRepartitionPercent(){
		return this.leekRepartitionPercent;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLeekRepartitionPercent(double arg0){
		this.leekRepartitionPercent = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ProjectBean getProject(){
		return this.project;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setProject(ProjectBean arg0){
		this.project = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetProject(){
			if (this.project == null) {
				return;
			}
			ProjectBean oldproject = this.project;
			this.project = null;
			oldproject.unsetGazconfiguration();
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRetentionGoal(){
		return this.retentionGoal;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRetentionGoal(double arg0){
		this.retentionGoal = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isRetentionInterface(){
		return this.retentionInterface;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRetentionInterface(boolean arg0){
		this.retentionInterface = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isSlowUnloading(){
		return this.slowUnloading;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSlowUnloading(boolean arg0){
		this.slowUnloading = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getSlowUnloadingValue(){
		return this.slowUnloadingValue;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setSlowUnloadingValue(double arg0){
		this.slowUnloadingValue = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUpdateDate(java.util.Date arg0){
		this.updateDate = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getVersion(){
		return this.version;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setVersion(int arg0){
		this.version = arg0;
	}
}
