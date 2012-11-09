package com.dooapp.firea.entity.domain.factories;

import com.dooapp.firea.entity.domain.PersistentImageData;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class PersistentImageDataBuilder extends AbstractEntityBuilder
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private PersistentImageData persistentimagedata;
    

	public PersistentImageData build () 
	{
		return persistentimagedata;	
	}

	public static PersistentImageDataBuilder create () 
	{
		return new PersistentImageDataBuilder();	
	}

	public PersistentImageDataBuilder data (String data) 
	{
		persistentimagedata.setData (data);
		return this;	
	}

	public PersistentImageDataBuilder initPersistentImageData () 
	{
		persistentimagedata = new PersistentImageData();
		return this;	
	}


}
