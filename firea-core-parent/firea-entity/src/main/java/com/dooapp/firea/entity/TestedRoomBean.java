package com.dooapp.firea.entity;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.TestedRoom;
import com.dooapp.lib.common.entity.Bean;


/**
 * 
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

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
	 * Altitude de la pièce
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int altitude;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private BlowHoleConfigurationBean blowholeconfiguration;
	/**
	 * H.P. Retenue (en m)
	Hauteur protégée retenue = max(minimalProtectedHeight,risqueHeight)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double choosenProtectedHeight;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean clapetsCF;
	/**
	 * 
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
	 * Date de mise en service de la pièce
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int commissioningDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private java.util.Date creationDate;
	/**
	 * Hauteur de faux plafond (en m)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double droppedCeiling;
	/**
	 * Hauteur de faux plancher (en m)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double droppedFloor;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private long id;
	/**
	 * Volume indiqué (en m3)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double indicatedVolume;
	/**
	 * Hauteur d'ambiance (en m)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double mainHeight;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double measuredPressure;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double measuredTemperature;
	/**
	 * Volume mesurée (en m3)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double measuredVolume;
	/**
	 * Résistance mécanique (en Pa)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int mecanicalStrength;
	/**
	 * H.P. min (en m)
	
	H.P. min = risqueHeightPercent * totalHeight
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double minimalProtectedHeight;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String name;
	/**
	 * Volume net (en m3)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double netVolume;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double prescribedPressure;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double prescribedTemperature;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ProjectBean project;
	/**
	 * Hauteur du risque (en m)
	
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double risqueHeight;
	/**
	 * Pourcentage de hauteur du risque (en %)
	(en 0 et 100)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double risqueHeightPercent;
	/**
	 * Hauteur totale (en m)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double totalHeight;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private boolean uniformHorizontality;
	/**
	 * Temps de décharge (en sec)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double unloadTime;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private java.util.Date updateDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int version;
	/**
	 * Correction apporté au volume (en m3)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double volumeCorrection;

	/**
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
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
		if (wrapper == null) {
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
	public BlowHoleConfigurationBean getBlowholeconfiguration(){
		return this.blowholeconfiguration;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setBlowholeconfiguration(BlowHoleConfigurationBean arg0){
		this.blowholeconfiguration = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetBlowholeconfiguration(){
			if (this.blowholeconfiguration == null) {
				return;
			}
			BlowHoleConfigurationBean oldblowholeconfiguration = this.blowholeconfiguration;
			this.blowholeconfiguration = null;
			oldblowholeconfiguration.unsetTestedroom();
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getChoosenProtectedHeight(){
		return this.choosenProtectedHeight;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setChoosenProtectedHeight(double arg0){
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
	public int getCommissioningDate(){
		return this.commissioningDate;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCommissioningDate(int arg0){
		this.commissioningDate = arg0;
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
	public double getDroppedCeiling(){
		return this.droppedCeiling;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedCeiling(double arg0){
		this.droppedCeiling = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getDroppedFloor(){
		return this.droppedFloor;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDroppedFloor(double arg0){
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
	public double getIndicatedVolume(){
		return this.indicatedVolume;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setIndicatedVolume(double arg0){
		this.indicatedVolume = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMainHeight(){
		return this.mainHeight;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMainHeight(double arg0){
		this.mainHeight = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMeasuredPressure(){
		return this.measuredPressure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredPressure(double arg0){
		this.measuredPressure = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMeasuredTemperature(){
		return this.measuredTemperature;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredTemperature(double arg0){
		this.measuredTemperature = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getMeasuredVolume(){
		return this.measuredVolume;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMeasuredVolume(double arg0){
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
	public double getMinimalProtectedHeight(){
		return this.minimalProtectedHeight;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setMinimalProtectedHeight(double arg0){
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
	public double getNetVolume(){
		return this.netVolume;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setNetVolume(double arg0){
		this.netVolume = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedPressure(){
		return this.prescribedPressure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedPressure(double arg0){
		this.prescribedPressure = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPrescribedTemperature(){
		return this.prescribedTemperature;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPrescribedTemperature(double arg0){
		this.prescribedTemperature = arg0;
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
	public double getRisqueHeight(){
		return this.risqueHeight;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRisqueHeight(double arg0){
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
	public double getTotalHeight(){
		return this.totalHeight;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTotalHeight(double arg0){
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
	public double getUnloadTime(){
		return this.unloadTime;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setUnloadTime(double arg0){
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
	public double getVolumeCorrection(){
		return this.volumeCorrection;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setVolumeCorrection(double arg0){
		this.volumeCorrection = arg0;
	}
    

}
