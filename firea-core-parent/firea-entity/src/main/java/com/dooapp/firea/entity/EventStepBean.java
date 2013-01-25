package com.dooapp.firea.entity;

import org.jdom2.Attribute;
import org.jdom2.Element;

//Start of user code for imports
// TODO: import me!
//End of user code


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.EventStep;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for EventStep Class
 * End of user code -->
 */
//Start of user code for queries
//End of user code

@javax.persistence.Entity
public class EventStepBean
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
	private static final Logger logger = LoggerFactory.getLogger(EventStepBean.class);

	
	private String direction;

	@javax.persistence.Transient
	private EventStep wrapper;
    	
	
	/*
	 * <!-- Start of user code comment for EventStep wrapper getter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	@Override
	public EventStep getWrapper() {
		if (wrapper == null) {
			wrapper = new EventStep(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for EventStep wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(EventStep wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	
	

	/*
	 * <!-- Start of user code comment for direction getter
	 * End of user code -->
	 */
	public String getDirection(){
		return this.direction;
	}
	
	/*
	 * <!-- Start of user code comment for direction setter
	 * End of user code -->
	 */
	public void setDirection(String arg0){
		this.direction = arg0;
	}
    

	public Element toXML(){
		Element e = new Element("EventStep");
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
		if (getDirection() != null)
			e.setAttribute(new Attribute("direction", getDirection()));
		
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
