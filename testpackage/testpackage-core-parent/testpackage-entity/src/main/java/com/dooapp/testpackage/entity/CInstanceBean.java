package com.dooapp.testpackage.entity;

import java.util.UUID;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class CInstanceBean {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	@Column(name = "ATTRIBUTECOLUMN")
	private String attribute;
	
	private byte[] attribute2;
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	private UUID uuid;
    

	
	public CInstanceBean ()  {
		uuid = UUID.randomUUID();	
	}

	
	public String getAttribute ()  {
		return this.attribute;	
	}

	
	public byte[] getAttribute2 ()  {
		return this.attribute2;	
	}

	
	public Long getId ()  {
		return this.id;	
	}

	
	public UUID getUuid ()  {
		return uuid;	
	}

	
	public void setAttribute (String myAttribute)  {
		this.attribute = myAttribute;	
	}

	
	public void setAttribute2 (byte[] myAttribute2)  {
		this.attribute2 = myAttribute2;	
	}

	
	public void setId (Long myId)  {
		this.id = myId;	
	}

	
	public void unsetAttribute ()  {
		this.attribute = null;	
	}

	
	public void unsetAttribute2 ()  {
		this.attribute2 = null;	
	}

	
	public void unsetId ()  {
		this.id = null;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
