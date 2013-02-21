package com.dooapp.firea.entity;



import com.dooapp.firea.entity.BeaufortScale;
import com.dooapp.firea.entity.AirPressureCalculationMethod;
import com.dooapp.firea.entity.SampleStatus;
import com.dooapp.firea.entity.PointDirection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.Sample;
import com.dooapp.lib.common.entity.Bean;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
public class SampleBean
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
	private static final Logger logger = LoggerFactory.getLogger(SampleBean.class);

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int airPressure;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private AirPressureCalculationMethod airPressureCalculationMethod;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private BeaufortScale beaufortScale;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private CalibrationStepBean calibrationStep;
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
	@javax.persistence.Column(name = "DATECOLUMN")
	private java.util.Date date;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private BlowHoleStepBean depressureEventStep;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private MainStepBean depressureMainStep;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int elevation;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double highTarget;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private int highUp;
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
	
	private double lowTarget;
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
	
	private int numberOfPoint;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double phiEPercent;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double phiIPercent;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private PointDirection pointDirection;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private StaticStepBean postStaticStep;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private StaticStepBean preStaticStep;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private BlowHoleStepBean pressureEventStep;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private MainStepBean pressureMainStep;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private ProjectBean project;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double roE;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double roI;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private SampleStatus status;
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double tetaE;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double tetaI;
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
	
	private double windMeasure;

	/**
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	@javax.persistence.Transient
	private Sample wrapper;
    	
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
	public Sample getWrapper() {
		if (wrapper == null) {
			wrapper = new Sample(this);
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
	public void setWrapper(Sample wrapper) {
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
	public int getAirPressure(){
		return this.airPressure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAirPressure(int arg0){
		this.airPressure = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public AirPressureCalculationMethod getAirPressureCalculationMethod(){
		return this.airPressureCalculationMethod;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAirPressureCalculationMethod(AirPressureCalculationMethod arg0){
		this.airPressureCalculationMethod = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetAirPressureCalculationMethod(AirPressureCalculationMethod arg0){
		this.airPressureCalculationMethod = null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BeaufortScale getBeaufortScale(){
		return this.beaufortScale;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setBeaufortScale(BeaufortScale arg0){
		this.beaufortScale = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetBeaufortScale(BeaufortScale arg0){
		this.beaufortScale = null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public CalibrationStepBean getCalibrationStep(){
		return this.calibrationStep;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCalibrationStep(CalibrationStepBean arg0){
		this.calibrationStep = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetCalibrationStep(){
			this.calibrationStep = null;
			
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
	public java.util.Date getDate(){
		return this.date;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDate(java.util.Date arg0){
		this.date = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BlowHoleStepBean getDepressureEventStep(){
		return this.depressureEventStep;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDepressureEventStep(BlowHoleStepBean arg0){
		this.depressureEventStep = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetDepressureEventStep(){
			this.depressureEventStep = null;
			
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MainStepBean getDepressureMainStep(){
		return this.depressureMainStep;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDepressureMainStep(MainStepBean arg0){
		this.depressureMainStep = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetDepressureMainStep(){
			this.depressureMainStep = null;
			
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getElevation(){
		return this.elevation;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setElevation(int arg0){
		this.elevation = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getHighTarget(){
		return this.highTarget;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setHighTarget(double arg0){
		this.highTarget = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public int getHighUp(){
		return this.highUp;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setHighUp(int arg0){
		this.highUp = arg0;
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
	public double getLowTarget(){
		return this.lowTarget;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setLowTarget(double arg0){
		this.lowTarget = arg0;
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
	public int getNumberOfPoint(){
		return this.numberOfPoint;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setNumberOfPoint(int arg0){
		this.numberOfPoint = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPhiEPercent(){
		return this.phiEPercent;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPhiEPercent(double arg0){
		this.phiEPercent = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getPhiIPercent(){
		return this.phiIPercent;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPhiIPercent(double arg0){
		this.phiIPercent = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public PointDirection getPointDirection(){
		return this.pointDirection;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPointDirection(PointDirection arg0){
		this.pointDirection = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetPointDirection(PointDirection arg0){
		this.pointDirection = null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStepBean getPostStaticStep(){
		return this.postStaticStep;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPostStaticStep(StaticStepBean arg0){
		this.postStaticStep = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetPostStaticStep(){
			this.postStaticStep = null;
			
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStepBean getPreStaticStep(){
		return this.preStaticStep;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPreStaticStep(StaticStepBean arg0){
		this.preStaticStep = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetPreStaticStep(){
			this.preStaticStep = null;
			
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BlowHoleStepBean getPressureEventStep(){
		return this.pressureEventStep;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPressureEventStep(BlowHoleStepBean arg0){
		this.pressureEventStep = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetPressureEventStep(){
			this.pressureEventStep = null;
			
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MainStepBean getPressureMainStep(){
		return this.pressureMainStep;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setPressureMainStep(MainStepBean arg0){
		this.pressureMainStep = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetPressureMainStep(){
			this.pressureMainStep = null;
			
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
			this.project = null;
			
	} 
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRoE(){
		return this.roE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRoE(double arg0){
		this.roE = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getRoI(){
		return this.roI;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setRoI(double arg0){
		this.roI = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public SampleStatus getStatus(){
		return this.status;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setStatus(SampleStatus arg0){
		this.status = arg0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void unsetStatus(SampleStatus arg0){
		this.status = null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getTetaE(){
		return this.tetaE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTetaE(double arg0){
		this.tetaE = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getTetaI(){
		return this.tetaI;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setTetaI(double arg0){
		this.tetaI = arg0;
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
	public double getWindMeasure(){
		return this.windMeasure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setWindMeasure(double arg0){
		this.windMeasure = arg0;
	}
    

}
