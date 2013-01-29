package com.dooapp.firea.entity;

import org.jdom2.Attribute;
import org.jdom2.Element;

//Start of user code for imports
// TODO: import me!
//End of user code


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.CalibrationStep;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for CalibrationStep Class
 * End of user code -->
 */
//Start of user code for queries
//End of user code

@javax.persistence.Entity
public class CalibrationStepBean
//Start of user code bloc for inheritance
 extends StepBean
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
	private static final Logger logger = LoggerFactory.getLogger(CalibrationStepBean.class);

	
	private double afterHoleELA;
	
	private double beforeHoleELA;
	
	private double errorPercent;

	@javax.persistence.Transient
	private CalibrationStep wrapper;
    	
	
	/*
	 * <!-- Start of user code comment for CalibrationStep wrapper getter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	@Override
	public CalibrationStep getWrapper() {
		if (wrapper == null) {
			wrapper = new CalibrationStep(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for CalibrationStep wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(CalibrationStep wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	
	

	/*
	 * <!-- Start of user code comment for afterHoleELA getter
	 * End of user code -->
	 */
	public double getAfterHoleELA(){
		return this.afterHoleELA;
	}
	
	/*
	 * <!-- Start of user code comment for afterHoleELA setter
	 * End of user code -->
	 */
	public void setAfterHoleELA(double arg0){
		this.afterHoleELA = arg0;
	}
	/*
	 * <!-- Start of user code comment for beforeHoleELA getter
	 * End of user code -->
	 */
	public double getBeforeHoleELA(){
		return this.beforeHoleELA;
	}
	
	/*
	 * <!-- Start of user code comment for beforeHoleELA setter
	 * End of user code -->
	 */
	public void setBeforeHoleELA(double arg0){
		this.beforeHoleELA = arg0;
	}
	/*
	 * <!-- Start of user code comment for errorPercent getter
	 * End of user code -->
	 */
	public double getErrorPercent(){
		return this.errorPercent;
	}
	
	/*
	 * <!-- Start of user code comment for errorPercent setter
	 * End of user code -->
	 */
	public void setErrorPercent(double arg0){
		this.errorPercent = arg0;
	}
    

	public Element toXML(){
		Element xmlElement = new Element("CalibrationStep");
		if (uuid != null)
			xmlElement.setAttribute(new Attribute("uuid", uuid));
		if (getStatus() != null)
			xmlElement.setAttribute(new Attribute("status", getStatus()));
		if (getDate() != null)
			xmlElement.setAttribute(new Attribute("date", getDate().toString()));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		xmlElement.setAttribute(new Attribute("errorPercent", String.valueOf(getErrorPercent())));
		xmlElement.setAttribute(new Attribute("beforeHoleELA", String.valueOf(getBeforeHoleELA())));
		xmlElement.setAttribute(new Attribute("afterHoleELA", String.valueOf(getAfterHoleELA())));
		
		if (!getPoints().isEmpty()) {
			Element points = new Element("points");
			for (PointBean tmp : getPoints())
				points.addContent(new Element("Point", String.valueOf(tmp.getId())));
			xmlElement.addContent(points);
		}
		if (getSample() != null)
			xmlElement.setAttribute("sample", String.valueOf(getSample().getId()));
		
		return xmlElement;
	}

	//Start of user code for methods
	// Other methods
	//End of user code

}
