package com.dooapp.firea.entity;



import com.dooapp.firea.entity.PressureType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.BlowHoleConfiguration;
import com.dooapp.lib.common.entity.Bean;


/**
 * 
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
public class BlowHoleConfigurationBean
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
	private static final Logger logger = LoggerFactory.getLogger(BlowHoleConfigurationBean.class);

	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double blowHoleSafetyFactor;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER, mappedBy = "blowholeconfiguration", cascade = javax.persistence.CascadeType.ALL)
	private java.util.Set<BlowHoleBean> blowhole;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Column(name = "CREATION_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean elaIncluded;
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
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double referencePressure;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String referencePressureJustification;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private PressureType referencePressureType;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.OneToOne(optional = true, cascade = javax.persistence.CascadeType.ALL, mappedBy = "blowholeconfiguration")
	private TestedRoomBean testedroom;
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
	private BlowHoleConfiguration wrapper;
    	
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
	public BlowHoleConfiguration getWrapper() {
		if (wrapper == null) {
			wrapper = new BlowHoleConfiguration(this);
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
	public void setWrapper(BlowHoleConfiguration wrapper) {
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
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getBlowHoleSafetyFactor(){
		return this.blowHoleSafetyFactor;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setBlowHoleSafetyFactor(double arg0){
		this.blowHoleSafetyFactor = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.List<BlowHoleBean> getBlowhole(){
			if(this.blowhole==null) {
				this.blowhole= new java.util.HashSet<BlowHoleBean>();
			}
			return new java.util.ArrayList<BlowHoleBean>(this.blowhole);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void addBlowhole(BlowHoleBean newBlowhole){
		if(this.blowhole==null) {
				this.blowhole= new java.util.HashSet<BlowHoleBean>();
			}
				
			this.blowhole.add (newBlowhole);
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
	public boolean isElaIncluded(){
		return this.elaIncluded;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setElaIncluded(boolean arg0){
		this.elaIncluded = arg0;
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
	public double getReferencePressure(){
		return this.referencePressure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setReferencePressure(double arg0){
		this.referencePressure = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getReferencePressureJustification(){
		return this.referencePressureJustification;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setReferencePressureJustification(String arg0){
		this.referencePressureJustification = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public PressureType getReferencePressureType(){
		return this.referencePressureType;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setReferencePressureType(PressureType arg0){
		this.referencePressureType = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetReferencePressureType(PressureType arg0){
		this.referencePressureType = null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TestedRoomBean getTestedroom(){
		return this.testedroom;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTestedroom(TestedRoomBean arg0){
		this.testedroom = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetTestedroom(){
			if (this.testedroom == null) {
				return;
			}
			TestedRoomBean oldtestedroom = this.testedroom;
			this.testedroom = null;
			oldtestedroom.unsetBlowholeconfiguration();
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
