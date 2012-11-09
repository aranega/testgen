package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import com.dooapp.firea.entity.domain.PersistentImageData;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.LongProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class PersistentImageDataWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private StringProperty dataProperty;
	
	private LongProperty idProperty;
	
	private PersistentImageData persistentImageData;
	
	private IntegerProperty versionProperty;
    

	public PersistentImageDataWrapper(final PersistentImageData entity)
	{
		this.persistentImageData = entity;
		versionProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						persistentImageData.setVersion(arg0);
				};
			};
		idProperty = new SimpleLongProperty()
			{
				@Override
				public long get()
				{
					return 0;
				};
				
				@Override
				public void set(long arg0)
				{
					
						persistentImageData.setId(arg0);
				};
			};
		dataProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (persistentImageData.getData() != null)
						return persistentImageData.getData();
					else
						return "";
					//PersistentImageData
				};
				
				@Override
				public void set(String arg0)
				{
					
						persistentImageData.setData(arg0);
				};
			};
			
	}

	public PersistentImageDataWrapper () 
	{
		this(new PersistentImageData());	
	}

	public StringProperty dataProperty () 
	{
		return this.dataProperty;	
	}

	public String getData () 
	{
		return this.dataProperty.get();	
	}

	public Long getId () 
	{
		return this.idProperty.get();	
	}

	public PersistentImageData getPersistentImageData () 
	{
		return this.persistentImageData;	
	}

	public Integer getVersion () 
	{
		return this.versionProperty.get();	
	}

	public LongProperty idProperty () 
	{
		return this.idProperty;	
	}

	public void setData (String myData) 
	{
		this.dataProperty.set(myData);	
	}

	public void setDataProperty (StringProperty myDataProperty) 
	{
		this.dataProperty = myDataProperty;	
	}

	public void setId (Long myId) 
	{
		this.idProperty.set(myId);	
	}

	public void setIdProperty (LongProperty myIdProperty) 
	{
		this.idProperty = myIdProperty;	
	}

	public void setPersistentImageData (PersistentImageData myPersistentImageData) 
	{
		this.persistentImageData = myPersistentImageData;	
	}

	public void setVersion (Integer myVersion) 
	{
		this.versionProperty.set(myVersion);	
	}

	public void setVersionProperty (IntegerProperty myVersionProperty) 
	{
		this.versionProperty = myVersionProperty;	
	}

	public void unsetDataProperty () 
	{
		this.dataProperty = null;	
	}

	public void unsetIdProperty () 
	{
		this.idProperty = null;	
	}

	public void unsetPersistentImageData () 
	{
		this.persistentImageData = null;	
	}

	public void unsetVersionProperty () 
	{
		this.versionProperty = null;	
	}

	public IntegerProperty versionProperty () 
	{
		return this.versionProperty;	
	}


}
