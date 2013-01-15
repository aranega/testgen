package com.dooapp.firea.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.TestedRoom;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for TestedRoom Class
 * End of user code -->
 */
//Start of user code for queries
//End of user code
@javax.persistence.Entity
public class TestedRoomBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(TestedRoomBean.class);

	
	private java.util.Date CommissioningDate;
	
	private int altitude;
	@javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER, mappedBy = "testedroom", cascade = javax.persistence.CascadeType.ALL)
	private java.util.Set<BlowHoleBean> blowholes;
	
	private int choosenProtectedHeight;
	
	private boolean clapetsCF;
	
	private boolean climDuct;
	
	private boolean climReclycle;
	
	private boolean climReclycleAuto;
	
	private boolean climVMC;
	
	private String climVMCAuto;
	
	private boolean climWithNewAir;
	
	private boolean climWithNewAirAuto;
	@javax.persistence.Column(name = "CREATION_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	
	private int droppedCeiling;
	
	private int droppedFloor;
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 10)
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "seq")
	@javax.persistence.Column(name = "ID")
	private long id;
	
	private int indicatedVolume;
	
	private int mainHeight;
	
	private int measuredVolume;
	
	private int mecanicalStrength;
	
	private int minimalProtectedHeight;
	@javax.persistence.Column(name = "NAMECOLUMN")
	private String name;
	
	private int netVolume;
	
	private int risqueHeight;
	
	private double risqueHeightPercent;
	
	private int totalHeight;
	
	private boolean uniformHorizontality;
	
	private int unloadTime;
	@javax.persistence.Column(name = "UPDATE_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date updateDate;
	@javax.persistence.Version
	@javax.persistence.Column(name = "VERSIONCOLUMN")
	private int version;
	
	private int volumeCorrection;

	@javax.persistence.Transient
	private TestedRoom wrapper;
    	
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
	 * <!-- Start of user code comment for TestedRoom wrapper getter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	@Override
	public TestedRoom getWrapper() {
		if (wrapper == null) {
			wrapper = new TestedRoom(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for TestedRoom wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(TestedRoom wrapper) {
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
	 * <!-- Start of user code comment for CommissioningDate getter
	 * End of user code -->
	 */
	public java.util.Date getCommissioningDate(){
		return this.CommissioningDate;
	}
	
	/*
	 * <!-- Start of user code comment for CommissioningDate setter
	 * End of user code -->
	 */
	public void setCommissioningDate(java.util.Date arg0){
		this.CommissioningDate = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for CommissioningDate unsetter
	 * End of user code -->
	 */
	public void unsetCommissioningDate(java.util.Date arg0){
		this.CommissioningDate = null;
	}
	/*
	 * <!-- Start of user code comment for altitude getter
	 * End of user code -->
	 */
	public int getAltitude(){
		return this.altitude;
	}
	
	/*
	 * <!-- Start of user code comment for altitude setter
	 * End of user code -->
	 */
	public void setAltitude(int arg0){
		this.altitude = arg0;
	}
	/*
	 * <!-- Start of user code comment for blowholes getter
	 * End of user code -->
	 */
	public java.util.List<BlowHoleBean> getBlowholes(){
			if(this.blowholes==null) {
				this.blowholes= new java.util.HashSet<BlowHoleBean>();
			}
			return new java.util.ArrayList<BlowHoleBean>(this.blowholes);
	}
	
	/*
	 * <!-- Start of user code comment for blowholes adder
	 * End of user code -->
	 */
	public void addBlowholes(BlowHoleBean newBlowholes){
		if(this.blowholes==null) {
				this.blowholes= new java.util.HashSet<BlowHoleBean>();
			}
				
			this.blowholes.add (newBlowholes);
	} 
	/*
	 * <!-- Start of user code comment for choosenProtectedHeight getter
	 * End of user code -->
	 */
	public int getChoosenProtectedHeight(){
		return this.choosenProtectedHeight;
	}
	
	/*
	 * <!-- Start of user code comment for choosenProtectedHeight setter
	 * End of user code -->
	 */
	public void setChoosenProtectedHeight(int arg0){
		this.choosenProtectedHeight = arg0;
	}
	/*
	 * <!-- Start of user code comment for clapetsCF getter
	 * End of user code -->
	 */
	public boolean isClapetsCF(){
		return this.clapetsCF;
	}
	
	/*
	 * <!-- Start of user code comment for clapetsCF setter
	 * End of user code -->
	 */
	public void setClapetsCF(boolean arg0){
		this.clapetsCF = arg0;
	}
	/*
	 * <!-- Start of user code comment for climDuct getter
	 * End of user code -->
	 */
	public boolean isClimDuct(){
		return this.climDuct;
	}
	
	/*
	 * <!-- Start of user code comment for climDuct setter
	 * End of user code -->
	 */
	public void setClimDuct(boolean arg0){
		this.climDuct = arg0;
	}
	/*
	 * <!-- Start of user code comment for climReclycle getter
	 * End of user code -->
	 */
	public boolean isClimReclycle(){
		return this.climReclycle;
	}
	
	/*
	 * <!-- Start of user code comment for climReclycle setter
	 * End of user code -->
	 */
	public void setClimReclycle(boolean arg0){
		this.climReclycle = arg0;
	}
	/*
	 * <!-- Start of user code comment for climReclycleAuto getter
	 * End of user code -->
	 */
	public boolean isClimReclycleAuto(){
		return this.climReclycleAuto;
	}
	
	/*
	 * <!-- Start of user code comment for climReclycleAuto setter
	 * End of user code -->
	 */
	public void setClimReclycleAuto(boolean arg0){
		this.climReclycleAuto = arg0;
	}
	/*
	 * <!-- Start of user code comment for climVMC getter
	 * End of user code -->
	 */
	public boolean isClimVMC(){
		return this.climVMC;
	}
	
	/*
	 * <!-- Start of user code comment for climVMC setter
	 * End of user code -->
	 */
	public void setClimVMC(boolean arg0){
		this.climVMC = arg0;
	}
	/*
	 * <!-- Start of user code comment for climVMCAuto getter
	 * End of user code -->
	 */
	public String getClimVMCAuto(){
		return this.climVMCAuto;
	}
	
	/*
	 * <!-- Start of user code comment for climVMCAuto setter
	 * End of user code -->
	 */
	public void setClimVMCAuto(String arg0){
		this.climVMCAuto = arg0;
	}
	/*
	 * <!-- Start of user code comment for climWithNewAir getter
	 * End of user code -->
	 */
	public boolean isClimWithNewAir(){
		return this.climWithNewAir;
	}
	
	/*
	 * <!-- Start of user code comment for climWithNewAir setter
	 * End of user code -->
	 */
	public void setClimWithNewAir(boolean arg0){
		this.climWithNewAir = arg0;
	}
	/*
	 * <!-- Start of user code comment for climWithNewAirAuto getter
	 * End of user code -->
	 */
	public boolean isClimWithNewAirAuto(){
		return this.climWithNewAirAuto;
	}
	
	/*
	 * <!-- Start of user code comment for climWithNewAirAuto setter
	 * End of user code -->
	 */
	public void setClimWithNewAirAuto(boolean arg0){
		this.climWithNewAirAuto = arg0;
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
	 * <!-- Start of user code comment for droppedCeiling getter
	 * End of user code -->
	 */
	public int getDroppedCeiling(){
		return this.droppedCeiling;
	}
	
	/*
	 * <!-- Start of user code comment for droppedCeiling setter
	 * End of user code -->
	 */
	public void setDroppedCeiling(int arg0){
		this.droppedCeiling = arg0;
	}
	/*
	 * <!-- Start of user code comment for droppedFloor getter
	 * End of user code -->
	 */
	public int getDroppedFloor(){
		return this.droppedFloor;
	}
	
	/*
	 * <!-- Start of user code comment for droppedFloor setter
	 * End of user code -->
	 */
	public void setDroppedFloor(int arg0){
		this.droppedFloor = arg0;
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
	 * <!-- Start of user code comment for indicatedVolume getter
	 * End of user code -->
	 */
	public int getIndicatedVolume(){
		return this.indicatedVolume;
	}
	
	/*
	 * <!-- Start of user code comment for indicatedVolume setter
	 * End of user code -->
	 */
	public void setIndicatedVolume(int arg0){
		this.indicatedVolume = arg0;
	}
	/*
	 * <!-- Start of user code comment for mainHeight getter
	 * End of user code -->
	 */
	public int getMainHeight(){
		return this.mainHeight;
	}
	
	/*
	 * <!-- Start of user code comment for mainHeight setter
	 * End of user code -->
	 */
	public void setMainHeight(int arg0){
		this.mainHeight = arg0;
	}
	/*
	 * <!-- Start of user code comment for measuredVolume getter
	 * End of user code -->
	 */
	public int getMeasuredVolume(){
		return this.measuredVolume;
	}
	
	/*
	 * <!-- Start of user code comment for measuredVolume setter
	 * End of user code -->
	 */
	public void setMeasuredVolume(int arg0){
		this.measuredVolume = arg0;
	}
	/*
	 * <!-- Start of user code comment for mecanicalStrength getter
	 * End of user code -->
	 */
	public int getMecanicalStrength(){
		return this.mecanicalStrength;
	}
	
	/*
	 * <!-- Start of user code comment for mecanicalStrength setter
	 * End of user code -->
	 */
	public void setMecanicalStrength(int arg0){
		this.mecanicalStrength = arg0;
	}
	/*
	 * <!-- Start of user code comment for minimalProtectedHeight getter
	 * End of user code -->
	 */
	public int getMinimalProtectedHeight(){
		return this.minimalProtectedHeight;
	}
	
	/*
	 * <!-- Start of user code comment for minimalProtectedHeight setter
	 * End of user code -->
	 */
	public void setMinimalProtectedHeight(int arg0){
		this.minimalProtectedHeight = arg0;
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
	 * <!-- Start of user code comment for netVolume getter
	 * End of user code -->
	 */
	public int getNetVolume(){
		return this.netVolume;
	}
	
	/*
	 * <!-- Start of user code comment for netVolume setter
	 * End of user code -->
	 */
	public void setNetVolume(int arg0){
		this.netVolume = arg0;
	}
	/*
	 * <!-- Start of user code comment for risqueHeight getter
	 * End of user code -->
	 */
	public int getRisqueHeight(){
		return this.risqueHeight;
	}
	
	/*
	 * <!-- Start of user code comment for risqueHeight setter
	 * End of user code -->
	 */
	public void setRisqueHeight(int arg0){
		this.risqueHeight = arg0;
	}
	/*
	 * <!-- Start of user code comment for risqueHeightPercent getter
	 * End of user code -->
	 */
	public double getRisqueHeightPercent(){
		return this.risqueHeightPercent;
	}
	
	/*
	 * <!-- Start of user code comment for risqueHeightPercent setter
	 * End of user code -->
	 */
	public void setRisqueHeightPercent(double arg0){
		this.risqueHeightPercent = arg0;
	}
	/*
	 * <!-- Start of user code comment for totalHeight getter
	 * End of user code -->
	 */
	public int getTotalHeight(){
		return this.totalHeight;
	}
	
	/*
	 * <!-- Start of user code comment for totalHeight setter
	 * End of user code -->
	 */
	public void setTotalHeight(int arg0){
		this.totalHeight = arg0;
	}
	/*
	 * <!-- Start of user code comment for uniformHorizontality getter
	 * End of user code -->
	 */
	public boolean isUniformHorizontality(){
		return this.uniformHorizontality;
	}
	
	/*
	 * <!-- Start of user code comment for uniformHorizontality setter
	 * End of user code -->
	 */
	public void setUniformHorizontality(boolean arg0){
		this.uniformHorizontality = arg0;
	}
	/*
	 * <!-- Start of user code comment for unloadTime getter
	 * End of user code -->
	 */
	public int getUnloadTime(){
		return this.unloadTime;
	}
	
	/*
	 * <!-- Start of user code comment for unloadTime setter
	 * End of user code -->
	 */
	public void setUnloadTime(int arg0){
		this.unloadTime = arg0;
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
	 * <!-- Start of user code comment for volumeCorrection getter
	 * End of user code -->
	 */
	public int getVolumeCorrection(){
		return this.volumeCorrection;
	}
	
	/*
	 * <!-- Start of user code comment for volumeCorrection setter
	 * End of user code -->
	 */
	public void setVolumeCorrection(int arg0){
		this.volumeCorrection = arg0;
	}
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
