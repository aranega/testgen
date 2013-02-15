package com.genmymodel.petshop.entity;

import org.jdom2.Attribute;
import org.jdom2.Element;

//Start of user code for imports
// TODO: import me!
//End of user code


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genmymodel.petshop.wrapper.Toy;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for Toy Class
 * End of user code -->
 */
//Start of user code for queries
//End of user code

/**
 *  
 */
@javax.persistence.Entity
public class ToyBean
//Start of user code bloc for inheritance
 extends ProductBean
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
	private static final Logger logger = LoggerFactory.getLogger(ToyBean.class);


	@javax.persistence.Transient
	private Toy wrapper;
    	
	
	/*
	 * <!-- Start of user code comment for Toy wrapper getter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	@Override
	public Toy getWrapper() {
		if (wrapper == null) {
			wrapper = new Toy(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for Toy wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(Toy wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	
	

    

	public Element toXML(){
		Element xmlElement = new Element("Toy");
		if (uuid != null)
			xmlElement.setAttribute(new Attribute("uuid", uuid));
		if (getDescription() != null)
			xmlElement.setAttribute(new Attribute("description", getDescription()));
		if (getName() != null)
			xmlElement.setAttribute(new Attribute("name", getName()));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		
		
		return xmlElement;
	}

	//Start of user code for methods
	// Other methods
	//End of user code

}
