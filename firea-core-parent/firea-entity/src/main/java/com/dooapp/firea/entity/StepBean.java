package com.dooapp.firea.entity;

import org.jdom2.Attribute;
import org.jdom2.Element;

//Start of user code for imports
// TODO: import me!
//End of user code


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.Step;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for Step Class
 * End of user code -->
 */
//Start of user code for queries
//End of user code

@javax.persistence.Entity
public class StepBean
//Start of user code bloc for inheritance

//End of user code
//Start of user code bloc for interfaces
 implements Bean
//End of user code
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(StepBean.class);

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
	
	@javax.persistence.OneToOne(optional = false, cascade = javax.persistence.CascadeType.ALL, mappedBy = "step")
	private PointBean points;
	
	@javax.persistence.OneToOne(optional = false, cascade = javax.persistence.CascadeType.ALL, mappedBy = "step")
	private SampleBean sample;
	
	private String status;
	@javax.persistence.Column(name = "UPDATE_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date updateDate;
	@javax.persistence.Version
	@javax.persistence.Column(name = "VERSIONCOLUMN")
	private int version;

	@javax.persistence.Transient
	private Step wrapper;
    	
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
	protected String uuid;
	/*
	 * <!-- Start of user code comment for Step wrapper getter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	@Override
	public Step getWrapper() {
		if (wrapper == null) {
			wrapper = new Step(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for Step wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(Step wrapper) {
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
	 * <!-- Start of user code comment for points getter
	 * End of user code -->
	 */
	public PointBean getPoints(){
		return this.points;
	}
	
	/*
	 * <!-- Start of user code comment for points setter
	 * End of user code -->
	 */
	public void setPoints(PointBean arg0){
		this.points = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for points unsetter
	 * End of user code -->
	 */
	public void unsetPoints(){
			if (this.points == null) {
				return;
			}
			PointBean oldpoints = this.points;
			this.points = null;
			oldpoints.unsetStep();
	} 
	/*
	 * <!-- Start of user code comment for sample getter
	 * End of user code -->
	 */
	public SampleBean getSample(){
		return this.sample;
	}
	
	/*
	 * <!-- Start of user code comment for sample setter
	 * End of user code -->
	 */
	public void setSample(SampleBean arg0){
		this.sample = arg0;
	}
	
	/*
	 * <!-- Start of user code comment for sample unsetter
	 * End of user code -->
	 */
	public void unsetSample(){
			if (this.sample == null) {
				return;
			}
			SampleBean oldsample = this.sample;
			this.sample = null;
			oldsample.unsetStep();
	} 
	/*
	 * <!-- Start of user code comment for status getter
	 * End of user code -->
	 */
	public String getStatus(){
		return this.status;
	}
	
	/*
	 * <!-- Start of user code comment for status setter
	 * End of user code -->
	 */
	public void setStatus(String arg0){
		this.status = arg0;
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
    

	public Element toXML(){
		Element e = new Element("Step");
		if (uuid != null)
			e.setAttribute(new Attribute("uuid", uuid));
		if (getDate() != null)
			e.setAttribute(new Attribute("date", getDate().toString()));
		if (getStatus() != null)
			e.setAttribute(new Attribute("status", getStatus()));
		e.setAttribute(new Attribute("id", String.valueOf(getId())));
		if (getCreationDate() != null)
			e.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getUpdateDate() != null)
			e.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		e.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		
		if (getSample() != null)
			e.setAttribute("sample", String.valueOf(getSample().getId()));
		if (getPoints() != null)
			e.setAttribute("points", String.valueOf(getPoints().getId()));
		
		return e;
	}

	//Start of user code for methods
	// Other methods
	//End of user code

}
