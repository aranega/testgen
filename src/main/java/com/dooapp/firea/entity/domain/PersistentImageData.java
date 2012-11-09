package com.dooapp.firea.entity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class PersistentImageData extends AbstractEntity
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@Column(name = "DATACOLUMN")
	private String data;
    

	public String getData () 
	{
		return this.data;	
	}

	public void setData (String myData) 
	{
		this.data = myData;	
	}

	public void unsetData () 
	{
		this.data = null;	
	}


}
