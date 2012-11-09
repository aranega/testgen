package com.dooapp.firea.entity.domain;

import javax.persistence.Entity;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class PersistentImage extends AbstractEntity
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private String dataId;
	
	private boolean error;
	
	private String preview;
	
	private String sourceFile;
	
	private String title;
    

	public String getDataId () 
	{
		return this.dataId;	
	}

	public boolean getError () 
	{
		return this.error;	
	}

	public String getPreview () 
	{
		return this.preview;	
	}

	public String getSourceFile () 
	{
		return this.sourceFile;	
	}

	public String getTitle () 
	{
		return this.title;	
	}

	public void setDataId (String myDataId) 
	{
		this.dataId = myDataId;	
	}

	public void setError (boolean myError) 
	{
		this.error = myError;	
	}

	public void setPreview (String myPreview) 
	{
		this.preview = myPreview;	
	}

	public void setSourceFile (String mySourceFile) 
	{
		this.sourceFile = mySourceFile;	
	}

	public void setTitle (String myTitle) 
	{
		this.title = myTitle;	
	}

	public void unsetDataId () 
	{
		this.dataId = null;	
	}

	public void unsetPreview () 
	{
		this.preview = null;	
	}

	public void unsetSourceFile () 
	{
		this.sourceFile = null;	
	}

	public void unsetTitle () 
	{
		this.title = null;	
	}


}
