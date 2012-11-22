package com.dooapp.testpackage.entity;

import java.util.UUID;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Column;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class BInstanceBean {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	@Column(name = "ATTRIBUTECOLUMN")
	private Long attribute;
	@ManyToOne
	private CInstanceBean cinstance;
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	private UUID uuid;
    

	
	public BInstanceBean ()  {
		uuid = UUID.randomUUID();	
	}

	
	public Long getAttribute ()  {
		return this.attribute;	
	}

	
	public CInstanceBean getCinstance ()  {
		return this.cinstance;	
	}

	
	public Long getId ()  {
		return this.id;	
	}

	
	public UUID getUuid ()  {
		return uuid;	
	}

	
	public void setAttribute (Long myAttribute)  {
		this.attribute = myAttribute;	
	}

	
	public void setCinstance (CInstanceBean myCinstance)  {
		this.cinstance = myCinstance;	
	}

	
	public void setId (Long myId)  {
		this.id = myId;	
	}

	
	public void unsetAttribute ()  {
		this.attribute = null;	
	}

	
	public void unsetCinstance ()  {
		this.cinstance = null;	
	}

	
	public void unsetId ()  {
		this.id = null;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
