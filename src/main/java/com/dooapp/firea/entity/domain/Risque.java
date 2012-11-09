package com.dooapp.firea.entity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class Risque extends AbstractEntity
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@Column(name = "KEYCOLUMN")
	private String key;
    

	public String getKey () 
	{
		return this.key;	
	}

	public void setKey (String myKey) 
	{
		this.key = myKey;	
	}

	public void unsetKey () 
	{
		this.key = null;	
	}


}
