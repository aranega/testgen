package com.dooapp.testpackage.entity;

import java.util.UUID;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class MyClassBean {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	@Column(name = "ATTRIBUTECOLUMN")
	private String attribute;
	/**
	 * My att qui tue 
	 */
	private short dateMe;
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	private UUID uuid;
    

	
	public MyClassBean ()  {
		uuid = UUID.randomUUID();	
	}

	
	public String getAttribute ()  {
		return this.attribute;	
	}

	
	public short getDateMe ()  {
		return this.dateMe;	
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

	
	public void setDateMe (short myDateMe)  {
		this.dateMe = myDateMe;	
	}

	
	public void setId (Long myId)  {
		this.id = myId;	
	}

	
	public void unsetAttribute ()  {
		this.attribute = null;	
	}

	
	public void unsetDateMe ()  {
		this.dateMe = null;	
	}

	
	public void unsetId ()  {
		this.id = null;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
