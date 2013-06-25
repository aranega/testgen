package com.dooapp.firea.entity;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.TestedRoom;

import com.dooapp.lib.common.entity.Bean;
import com.dooapp.lib.common.entity.WrapperClass;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
@WrapperClass(TestedRoom.class)
public class TestedRoomBean
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
	private static final Logger logger = LoggerFactory.getLogger(TestedRoomBean.class);

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private java.util.Date CommissioningDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int altitude;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER, mappedBy = "testedroom", cascade = javax.persistence.CascadeType.ALL)
	private java.util.Set<BlowHoleBean> blowholes;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int choosenProtectedHeight;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean clapetsCF;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean climDuct;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean climReclycle;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean climReclycleAuto;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean climVMC;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean climVMCAuto;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean climWithNewAir;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean climWithNewAirAuto;
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
	
	private int droppedCeiling;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int droppedFloor;
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
	
	private int indicatedVolume;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int mainHeight;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int measuredVolume;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int mecanicalStrength;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int minimalProtectedHeight;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Column(name = "NAMECOLUMN")
	private String name;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int netVolume;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.OneToOne(optional = false, cascade = javax.persistence.CascadeType.ALL)
	private ProjectBean project;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int risqueHeight;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double risqueHeightPercent;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int totalHeight;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean uniformHorizontality;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int unloadTime;
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
	
	private int volumeCorrection;
	
	/**
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	@javax.persistence.Transient
	private TestedRoom wrapper;

	public TestedRoomBean() {
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
	public TestedRoom getWrapper() {
		if (!isWrapped()) {
			wrapper = new TestedRoom(this);
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
	public void setWrapper(TestedRoom wrapper) {
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
	public java.util.Date getCommissioningDate(){
		return this.CommissioningDate;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCommissioningDate(java.util.Date arg0){
		this.CommissioningDate = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getAltitude(){
		return this.altitude;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAltitude(int arg0){
		this.altitude = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public java.util.List<BlowHoleBean> getBlowholes(){
			if(this.blowholes==null) {
				this.blowholes= new java.util.HashSet<BlowHoleBean>();
			}
			return new java.util.ArrayList<BlowHoleBean>(this.blowholes);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void addBlowholes(BlowHoleBean newBlowholes){
		if(this.blowholes==null) {
				this.blowholes= new java.util.HashSet<BlowHoleBean>();
			}
				
			this.blowholes.add (newBlowholes);
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getChoosenProtectedHeight(){
		return this.choosenProtectedHeight;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChoosenProtectedHeight(int arg0){
		this.choosenProtectedHeight = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClapetsCF(){
		return this.clapetsCF;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClapetsCF(boolean arg0){
		this.clapetsCF = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimDuct(){
		return this.climDuct;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimDuct(boolean arg0){
		this.climDuct = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimReclycle(){
		return this.climReclycle;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimReclycle(boolean arg0){
		this.climReclycle = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimReclycleAuto(){
		return this.climReclycleAuto;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimReclycleAuto(boolean arg0){
		this.climReclycleAuto = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimVMC(){
		return this.climVMC;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimVMC(boolean arg0){
		this.climVMC = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimVMCAuto(){
		return this.climVMCAuto;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimVMCAuto(boolean arg0){
		this.climVMCAuto = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimWithNewAir(){
		return this.climWithNewAir;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimWithNewAir(boolean arg0){
		this.climWithNewAir = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isClimWithNewAirAuto(){
		return this.climWithNewAirAuto;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setClimWithNewAirAuto(boolean arg0){
		this.climWithNewAirAuto = arg0;
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
	public int getDroppedCeiling(){
		return this.droppedCeiling;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedCeiling(int arg0){
		this.droppedCeiling = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getDroppedFloor(){
		return this.droppedFloor;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedFloor(int arg0){
		this.droppedFloor = arg0;
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
	public int getIndicatedVolume(){
		return this.indicatedVolume;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setIndicatedVolume(int arg0){
		this.indicatedVolume = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getMainHeight(){
		return this.mainHeight;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMainHeight(int arg0){
		this.mainHeight = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getMeasuredVolume(){
		return this.measuredVolume;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredVolume(int arg0){
		this.measuredVolume = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getMecanicalStrength(){
		return this.mecanicalStrength;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMecanicalStrength(int arg0){
		this.mecanicalStrength = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getMinimalProtectedHeight(){
		return this.minimalProtectedHeight;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMinimalProtectedHeight(int arg0){
		this.minimalProtectedHeight = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setName(String arg0){
		this.name = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getNetVolume(){
		return this.netVolume;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setNetVolume(int arg0){
		this.netVolume = arg0;
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
			oldproject.unsetTestedroom();
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getRisqueHeight(){
		return this.risqueHeight;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisqueHeight(int arg0){
		this.risqueHeight = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRisqueHeightPercent(){
		return this.risqueHeightPercent;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisqueHeightPercent(double arg0){
		this.risqueHeightPercent = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getTotalHeight(){
		return this.totalHeight;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTotalHeight(int arg0){
		this.totalHeight = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean isUniformHorizontality(){
		return this.uniformHorizontality;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUniformHorizontality(boolean arg0){
		this.uniformHorizontality = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getUnloadTime(){
		return this.unloadTime;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUnloadTime(int arg0){
		this.unloadTime = arg0;
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
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getVolumeCorrection(){
		return this.volumeCorrection;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setVolumeCorrection(int arg0){
		this.volumeCorrection = arg0;
	}
}
