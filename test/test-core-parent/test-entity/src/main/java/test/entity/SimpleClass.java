package test.entity;

import java.util.UUID;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class SimpleClass
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	private UUID uuid;
    

	
	public SimpleClass () 
	{
		uuid = UUID.randomUUID();	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public UUID getUuid () 
	{
		return uuid;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
