package com.dooapp.firea.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.TestedRoom;
import com.dooapp.lib.common.entity.Bean;

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
	
	private boolean climVMCAuto;
	
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
	@javax.persistence.OneToOne(optional = false, cascade = javax.persistence.CascadeType.ALL)
	private ProjectBean project;
	
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
	

	public java.util.Date getCommissioningDate(){
		return this.CommissioningDate;
	}
	
	public void setCommissioningDate(java.util.Date arg0){
		this.CommissioningDate = arg0;
	}
	
	public void unsetCommissioningDate(java.util.Date arg0){
		this.CommissioningDate = null;
	}
	public int getAltitude(){
		return this.altitude;
	}
	
	public void setAltitude(int arg0){
		this.altitude = arg0;
	}
	public java.util.List<BlowHoleBean> getBlowholes(){
			if(this.blowholes==null) {
				this.blowholes= new java.util.HashSet<BlowHoleBean>();
			}
			return new java.util.ArrayList<BlowHoleBean>(this.blowholes);
	}
	
	public void addBlowholes(BlowHoleBean newBlowholes){
		if(this.blowholes==null) {
				this.blowholes= new java.util.HashSet<BlowHoleBean>();
			}
				
			this.blowholes.add (newBlowholes);
	} 
	public int getChoosenProtectedHeight(){
		return this.choosenProtectedHeight;
	}
	
	public void setChoosenProtectedHeight(int arg0){
		this.choosenProtectedHeight = arg0;
	}
	public boolean isClapetsCF(){
		return this.clapetsCF;
	}
	
	public void setClapetsCF(boolean arg0){
		this.clapetsCF = arg0;
	}
	public boolean isClimDuct(){
		return this.climDuct;
	}
	
	public void setClimDuct(boolean arg0){
		this.climDuct = arg0;
	}
	public boolean isClimReclycle(){
		return this.climReclycle;
	}
	
	public void setClimReclycle(boolean arg0){
		this.climReclycle = arg0;
	}
	public boolean isClimReclycleAuto(){
		return this.climReclycleAuto;
	}
	
	public void setClimReclycleAuto(boolean arg0){
		this.climReclycleAuto = arg0;
	}
	public boolean isClimVMC(){
		return this.climVMC;
	}
	
	public void setClimVMC(boolean arg0){
		this.climVMC = arg0;
	}
	public boolean isClimVMCAuto(){
		return this.climVMCAuto;
	}
	
	public void setClimVMCAuto(boolean arg0){
		this.climVMCAuto = arg0;
	}
	public boolean isClimWithNewAir(){
		return this.climWithNewAir;
	}
	
	public void setClimWithNewAir(boolean arg0){
		this.climWithNewAir = arg0;
	}
	public boolean isClimWithNewAirAuto(){
		return this.climWithNewAirAuto;
	}
	
	public void setClimWithNewAirAuto(boolean arg0){
		this.climWithNewAirAuto = arg0;
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
	public int getDroppedCeiling(){
		return this.droppedCeiling;
	}
	
	public void setDroppedCeiling(int arg0){
		this.droppedCeiling = arg0;
	}
	public int getDroppedFloor(){
		return this.droppedFloor;
	}
	
	public void setDroppedFloor(int arg0){
		this.droppedFloor = arg0;
	}
	public long getId(){
		return this.id;
	}
	
	public void setId(long arg0){
		this.id = arg0;
	}
	public int getIndicatedVolume(){
		return this.indicatedVolume;
	}
	
	public void setIndicatedVolume(int arg0){
		this.indicatedVolume = arg0;
	}
	public int getMainHeight(){
		return this.mainHeight;
	}
	
	public void setMainHeight(int arg0){
		this.mainHeight = arg0;
	}
	public int getMeasuredVolume(){
		return this.measuredVolume;
	}
	
	public void setMeasuredVolume(int arg0){
		this.measuredVolume = arg0;
	}
	public int getMecanicalStrength(){
		return this.mecanicalStrength;
	}
	
	public void setMecanicalStrength(int arg0){
		this.mecanicalStrength = arg0;
	}
	public int getMinimalProtectedHeight(){
		return this.minimalProtectedHeight;
	}
	
	public void setMinimalProtectedHeight(int arg0){
		this.minimalProtectedHeight = arg0;
	}
	public String getName(){
		return this.name;
	}
	
	public void setName(String arg0){
		this.name = arg0;
	}
	public int getNetVolume(){
		return this.netVolume;
	}
	
	public void setNetVolume(int arg0){
		this.netVolume = arg0;
	}
	public ProjectBean getProject(){
		return this.project;
	}
	
	public void setProject(ProjectBean arg0){
		this.project = arg0;
	}
	
	public void unsetProject(){
			if (this.project == null) {
				return;
			}
			ProjectBean oldproject = this.project;
			this.project = null;
			oldproject.unsetTestedroom();
	} 
	public int getRisqueHeight(){
		return this.risqueHeight;
	}
	
	public void setRisqueHeight(int arg0){
		this.risqueHeight = arg0;
	}
	public double getRisqueHeightPercent(){
		return this.risqueHeightPercent;
	}
	
	public void setRisqueHeightPercent(double arg0){
		this.risqueHeightPercent = arg0;
	}
	public int getTotalHeight(){
		return this.totalHeight;
	}
	
	public void setTotalHeight(int arg0){
		this.totalHeight = arg0;
	}
	public boolean isUniformHorizontality(){
		return this.uniformHorizontality;
	}
	
	public void setUniformHorizontality(boolean arg0){
		this.uniformHorizontality = arg0;
	}
	public int getUnloadTime(){
		return this.unloadTime;
	}
	
	public void setUnloadTime(int arg0){
		this.unloadTime = arg0;
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
	public int getVolumeCorrection(){
		return this.volumeCorrection;
	}
	
	public void setVolumeCorrection(int arg0){
		this.volumeCorrection = arg0;
	}
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
