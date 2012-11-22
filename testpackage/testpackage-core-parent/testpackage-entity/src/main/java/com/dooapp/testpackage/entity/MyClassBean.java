package com.dooapp.testpackage.entity;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class MyClassBean {
	//Start of user code for attributes
    private String myAtt;
	//End of user code
	
	private Date dateMe;
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	private UUID uuid;
    

	
	public MyClassBean ()  {
		uuid = UUID.randomUUID();	
	}

	
	public Date getDateMe ()  {
		return this.dateMe;	
	}

	
	public Long getId ()  {
		return this.id;	
	}

	
	public UUID getUuid ()  {
		return uuid;	
	}

	
	public void setDateMe (Date myDateMe)  {
		this.dateMe = myDateMe;	
	}

	
	public void setId (Long myId)  {
		this.id = myId;	
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
