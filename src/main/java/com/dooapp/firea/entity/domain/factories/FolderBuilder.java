package com.dooapp.firea.entity.domain.factories;

import com.dooapp.firea.entity.domain.Folder;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class FolderBuilder extends AbstractEntityBuilder
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private Folder folder;
    

	public Folder build () 
	{
		return folder;	
	}

	public static FolderBuilder create () 
	{
		return new FolderBuilder();	
	}

	public FolderBuilder displayOrder (Integer displayOrder) 
	{
		folder.setDisplayOrder (displayOrder);
		return this;	
	}

	public FolderBuilder initFolder () 
	{
		folder = new Folder();
		return this;	
	}

	public FolderBuilder name (String name) 
	{
		folder.setName (name);
		return this;	
	}


}
