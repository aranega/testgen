package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import com.dooapp.firea.entity.domain.Folder;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.StringProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class FolderWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private IntegerProperty displayOrderProperty;
	
	private Folder folder;
	
	private LongProperty idProperty;
	
	private StringProperty nameProperty;
	
	private IntegerProperty versionProperty;
    

	public FolderWrapper(final Folder entity)
	{
		this.folder = entity;
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
					
						folder.setVersion(arg0);
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
					
						folder.setId(arg0);
				};
			};
		nameProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (folder.getName() != null)
						return folder.getName();
					else
						return "";
					//Folder
				};
				
				@Override
				public void set(String arg0)
				{
					
						folder.setName(arg0);
				};
			};
		displayOrderProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						folder.setDisplayOrder(arg0);
				};
			};
			
	}

	public FolderWrapper () 
	{
		this(new Folder());	
	}

	public IntegerProperty displayOrderProperty () 
	{
		return this.displayOrderProperty;	
	}

	public Integer getDisplayOrder () 
	{
		return this.displayOrderProperty.get();	
	}

	public Folder getFolder () 
	{
		return this.folder;	
	}

	public Long getId () 
	{
		return this.idProperty.get();	
	}

	public String getName () 
	{
		return this.nameProperty.get();	
	}

	public Integer getVersion () 
	{
		return this.versionProperty.get();	
	}

	public LongProperty idProperty () 
	{
		return this.idProperty;	
	}

	public StringProperty nameProperty () 
	{
		return this.nameProperty;	
	}

	public void setDisplayOrder (Integer myDisplayOrder) 
	{
		this.displayOrderProperty.set(myDisplayOrder);	
	}

	public void setDisplayOrderProperty (IntegerProperty myDisplayOrderProperty) 
	{
		this.displayOrderProperty = myDisplayOrderProperty;	
	}

	public void setFolder (Folder myFolder) 
	{
		this.folder = myFolder;	
	}

	public void setId (Long myId) 
	{
		this.idProperty.set(myId);	
	}

	public void setIdProperty (LongProperty myIdProperty) 
	{
		this.idProperty = myIdProperty;	
	}

	public void setName (String myName) 
	{
		this.nameProperty.set(myName);	
	}

	public void setNameProperty (StringProperty myNameProperty) 
	{
		this.nameProperty = myNameProperty;	
	}

	public void setVersion (Integer myVersion) 
	{
		this.versionProperty.set(myVersion);	
	}

	public void setVersionProperty (IntegerProperty myVersionProperty) 
	{
		this.versionProperty = myVersionProperty;	
	}

	public void unsetDisplayOrderProperty () 
	{
		this.displayOrderProperty = null;	
	}

	public void unsetFolder () 
	{
		this.folder = null;	
	}

	public void unsetIdProperty () 
	{
		this.idProperty = null;	
	}

	public void unsetNameProperty () 
	{
		this.nameProperty = null;	
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
