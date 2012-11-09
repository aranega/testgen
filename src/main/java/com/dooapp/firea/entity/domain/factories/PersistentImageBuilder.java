package com.dooapp.firea.entity.domain.factories;

import com.dooapp.firea.entity.domain.PersistentImage;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class PersistentImageBuilder extends AbstractEntityBuilder
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private PersistentImage persistentimage;
    

	public PersistentImage build () 
	{
		return persistentimage;	
	}

	public static PersistentImageBuilder create () 
	{
		return new PersistentImageBuilder();	
	}

	public PersistentImageBuilder dataId (String dataId) 
	{
		persistentimage.setDataId (dataId);
		return this;	
	}

	public PersistentImageBuilder error (boolean error) 
	{
		persistentimage.setError (error);
		return this;	
	}

	public PersistentImageBuilder initPersistentImage () 
	{
		persistentimage = new PersistentImage();
		return this;	
	}

	public PersistentImageBuilder preview (String preview) 
	{
		persistentimage.setPreview (preview);
		return this;	
	}

	public PersistentImageBuilder sourceFile (String sourceFile) 
	{
		persistentimage.setSourceFile (sourceFile);
		return this;	
	}

	public PersistentImageBuilder title (String title) 
	{
		persistentimage.setTitle (title);
		return this;	
	}


}
