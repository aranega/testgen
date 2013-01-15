package com.dooapp.fireaOLD.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.fireaOLD.wrapper.Sample;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for Sample Class
 * End of user code -->
 */
//Start of user code for queries
//End of user code
@javax.persistence.Entity
public class SampleBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(SampleBean.class);

	
	private int airPressure;
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private com.dooapp.fireaOLD.entity.AirPressureCalculationMethod airPressureCalculationMethod;
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private com.dooapp.fireaOLD.entity.BeaufortScale beaufortScale;
	@javax.persistence.Column(name = "CREATION_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	@javax.persistence.Column(name = "DATECOLUMN")
	private java.util.Date date;
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 10)
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "seq")
	@javax.persistence.Column(name = "ID")
	private long id;
	@javax.persistence.Column(name = "NAMECOLUMN")
	private String name;
	
	private double phiEPercent;
	
	private double phiIPercent;
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private ProjectBean project;
	
	private double roE;
	
	private double roI;
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private com.dooapp.fireaOLD.entity.SampleStatus status;
	@javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER, mappedBy = "sample", cascade = javax.persistence.CascadeType.ALL)
	private java.util.Set<StepBean> step;
	
	private double tetaE;
	
	private double tetaI;
	@javax.persistence.Column(name = "UPDATE_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date updateDate;
	@javax.persistence.Version
	@javax.persistence.Column(name = "VERSIONCOLUMN")
	private int version;
	
	private double windMeasure;

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
	 */
	@javax.persistence.Column(name = "UUID", columnDefinition = "CHAR(36)")
	private String uuid;
	/*
	 * <!-- Start of user code comment for Sample wrapper getter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	@Override
	public Sample getWrapper() {
		if (wrapper == null) {
			wrapper = new Sample(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for Sample wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(Sample wrapper) {
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
	 * <!-- Start of user code comment for airPressure getter
	 * End of user code -->
	 */
	public int getAirPressure(){
		return this.airPressure;
	}
	
	/*
	 * <!-- Start of user code comment for airPressure setter
	 * End of user code -->
	 */
	public void setAirPressure(int arg0){
		this.airPressure = arg0;
	}
	/*
	 * <!-- Start of user code comment for airPressureCalculationMethod getter
	 * End of user code -->
	 */
	public com.dooapp.fireaOLD.entity.AirPressureCalculationMethod getAirPressureCalculationMethod(){
		return this.airPressureCalculationMethod;
	}
	
	/*
	 * <!-- Start of user code comment for airPressureCalculationMethod setter
	 * End of user code -->
	 */
	public void setAirPressureCalculationMethod(com.dooapp.fireaOLD.entity.AirPressureCalculationMethod arg0){
		this.airPressureCalculationMethod = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for airPressureCalculationMethod unsetter
	 * End of user code -->
	 */
	public void unsetAirPressureCalculationMethod(com.dooapp.fireaOLD.entity.AirPressureCalculationMethod arg0){
		this.airPressureCalculationMethod = null;
	}
	/*
	 * <!-- Start of user code comment for beaufortScale getter
	 * End of user code -->
	 */
	public com.dooapp.fireaOLD.entity.BeaufortScale getBeaufortScale(){
		return this.beaufortScale;
	}
	
	/*
	 * <!-- Start of user code comment for beaufortScale setter
	 * End of user code -->
	 */
	public void setBeaufortScale(com.dooapp.fireaOLD.entity.BeaufortScale arg0){
		this.beaufortScale = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for beaufortScale unsetter
	 * End of user code -->
	 */
	public void unsetBeaufortScale(com.dooapp.fireaOLD.entity.BeaufortScale arg0){
		this.beaufortScale = null;
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
	 * <!-- Start of user code comment for date getter
	 * End of user code -->
	 */
	public java.util.Date getDate(){
		return this.date;
	}
	
	/*
	 * <!-- Start of user code comment for date setter
	 * End of user code -->
	 */
	public void setDate(java.util.Date arg0){
		this.date = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for date unsetter
	 * End of user code -->
	 */
	public void unsetDate(java.util.Date arg0){
		this.date = null;
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
	 * <!-- Start of user code comment for phiEPercent getter
	 * End of user code -->
	 */
	public double getPhiEPercent(){
		return this.phiEPercent;
	}
	
	/*
	 * <!-- Start of user code comment for phiEPercent setter
	 * End of user code -->
	 */
	public void setPhiEPercent(double arg0){
		this.phiEPercent = arg0;
	}
	/*
	 * <!-- Start of user code comment for phiIPercent getter
	 * End of user code -->
	 */
	public double getPhiIPercent(){
		return this.phiIPercent;
	}
	
	/*
	 * <!-- Start of user code comment for phiIPercent setter
	 * End of user code -->
	 */
	public void setPhiIPercent(double arg0){
		this.phiIPercent = arg0;
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
			this.project = null;
			
	} 
	/*
	 * <!-- Start of user code comment for roE getter
	 * End of user code -->
	 */
	public double getRoE(){
		return this.roE;
	}
	
	/*
	 * <!-- Start of user code comment for roE setter
	 * End of user code -->
	 */
	public void setRoE(double arg0){
		this.roE = arg0;
	}
	/*
	 * <!-- Start of user code comment for roI getter
	 * End of user code -->
	 */
	public double getRoI(){
		return this.roI;
	}
	
	/*
	 * <!-- Start of user code comment for roI setter
	 * End of user code -->
	 */
	public void setRoI(double arg0){
		this.roI = arg0;
	}
	/*
	 * <!-- Start of user code comment for status getter
	 * End of user code -->
	 */
	public com.dooapp.fireaOLD.entity.SampleStatus getStatus(){
		return this.status;
	}
	
	/*
	 * <!-- Start of user code comment for status setter
	 * End of user code -->
	 */
	public void setStatus(com.dooapp.fireaOLD.entity.SampleStatus arg0){
		this.status = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for status unsetter
	 * End of user code -->
	 */
	public void unsetStatus(com.dooapp.fireaOLD.entity.SampleStatus arg0){
		this.status = null;
	}
	/*
	 * <!-- Start of user code comment for step getter
	 * End of user code -->
	 */
	public java.util.List<StepBean> getStep(){
			if(this.step==null) {
				this.step= new java.util.HashSet<StepBean>();
			}
			return new java.util.ArrayList<StepBean>(this.step);
	}
	
	/*
	 * <!-- Start of user code comment for step adder
	 * End of user code -->
	 */
	public void addStep(StepBean newStep){
		if(this.step==null) {
				this.step= new java.util.HashSet<StepBean>();
			}
				
			this.step.add (newStep);
	} 
	/*
	 * <!-- Start of user code comment for tetaE getter
	 * End of user code -->
	 */
	public double getTetaE(){
		return this.tetaE;
	}
	
	/*
	 * <!-- Start of user code comment for tetaE setter
	 * End of user code -->
	 */
	public void setTetaE(double arg0){
		this.tetaE = arg0;
	}
	/*
	 * <!-- Start of user code comment for tetaI getter
	 * End of user code -->
	 */
	public double getTetaI(){
		return this.tetaI;
	}
	
	/*
	 * <!-- Start of user code comment for tetaI setter
	 * End of user code -->
	 */
	public void setTetaI(double arg0){
		this.tetaI = arg0;
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
	 * <!-- Start of user code comment for windMeasure getter
	 * End of user code -->
	 */
	public double getWindMeasure(){
		return this.windMeasure;
	}
	
	/*
	 * <!-- Start of user code comment for windMeasure setter
	 * End of user code -->
	 */
	public void setWindMeasure(double arg0){
		this.windMeasure = arg0;
	}
    


	//Start of user code for methods
	// Other methods
	//End of user code

}