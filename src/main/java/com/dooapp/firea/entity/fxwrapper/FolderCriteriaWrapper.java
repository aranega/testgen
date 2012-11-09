package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import com.dooapp.firea.entity.repositories.criteria.FolderCriteria;
import javafx.beans.property.StringProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.IntegerProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class FolderCriteriaWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private IntegerProperty displayOrderMaxProperty;
	
	private IntegerProperty displayOrderMinProperty;
	
	private FolderCriteria folderCriteria;
	
	private LongProperty idProperty;
	
	private StringProperty nameProperty;
	
	private IntegerProperty versionMaxProperty;
	
	private IntegerProperty versionMinProperty;
    

	public FolderCriteriaWrapper(final FolderCriteria entity)
	{
		this.folderCriteria = entity;
		versionMinProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (folderCriteria.getVersionMin() != null)
						return folderCriteria.getVersionMin();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						folderCriteria.setVersionMin(arg0);
				};
			};
		versionMaxProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (folderCriteria.getVersionMax() != null)
						return folderCriteria.getVersionMax();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						folderCriteria.setVersionMax(arg0);
				};
			};
		idProperty = new SimpleLongProperty()
			{
				@Override
				public long get()
				{
					if (folderCriteria.getId() != null)
						return folderCriteria.getId();
					else
						return 0;
				};
				
				@Override
				public void set(long arg0)
				{
					
						folderCriteria.setId(arg0);
				};
			};
		nameProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (folderCriteria.getName() != null)
						return folderCriteria.getName();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						folderCriteria.setName(arg0);
				};
			};
		displayOrderMinProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (folderCriteria.getDisplayOrderMin() != null)
						return folderCriteria.getDisplayOrderMin();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						folderCriteria.setDisplayOrderMin(arg0);
				};
			};
		displayOrderMaxProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (folderCriteria.getDisplayOrderMax() != null)
						return folderCriteria.getDisplayOrderMax();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						folderCriteria.setDisplayOrderMax(arg0);
				};
			};
			
	}

	public FolderCriteriaWrapper () 
	{
		this(new FolderCriteria());	
	}

	public IntegerProperty displayOrderMaxProperty () 
	{
		return this.displayOrderMaxProperty;	
	}

	public IntegerProperty displayOrderMinProperty () 
	{
		return this.displayOrderMinProperty;	
	}

	public Integer getDisplayOrderMax () 
	{
		return this.displayOrderMaxProperty.get();	
	}

	public Integer getDisplayOrderMin () 
	{
		return this.displayOrderMinProperty.get();	
	}

	public FolderCriteria getFolderCriteria () 
	{
		return this.folderCriteria;	
	}

	public Long getId () 
	{
		return this.idProperty.get();	
	}

	public String getName () 
	{
		return this.nameProperty.get();	
	}

	public Integer getVersionMax () 
	{
		return this.versionMaxProperty.get();	
	}

	public Integer getVersionMin () 
	{
		return this.versionMinProperty.get();	
	}

	public LongProperty idProperty () 
	{
		return this.idProperty;	
	}

	public StringProperty nameProperty () 
	{
		return this.nameProperty;	
	}

	public void setDisplayOrderMax (Integer myDisplayOrderMax) 
	{
		this.displayOrderMaxProperty.set(myDisplayOrderMax);	
	}

	public void setDisplayOrderMaxProperty (IntegerProperty myDisplayOrderMaxProperty) 
	{
		this.displayOrderMaxProperty = myDisplayOrderMaxProperty;	
	}

	public void setDisplayOrderMin (Integer myDisplayOrderMin) 
	{
		this.displayOrderMinProperty.set(myDisplayOrderMin);	
	}

	public void setDisplayOrderMinProperty (IntegerProperty myDisplayOrderMinProperty) 
	{
		this.displayOrderMinProperty = myDisplayOrderMinProperty;	
	}

	public void setFolderCriteria (FolderCriteria myFolderCriteria) 
	{
		this.folderCriteria = myFolderCriteria;	
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

	public void setVersionMax (Integer myVersionMax) 
	{
		this.versionMaxProperty.set(myVersionMax);	
	}

	public void setVersionMaxProperty (IntegerProperty myVersionMaxProperty) 
	{
		this.versionMaxProperty = myVersionMaxProperty;	
	}

	public void setVersionMin (Integer myVersionMin) 
	{
		this.versionMinProperty.set(myVersionMin);	
	}

	public void setVersionMinProperty (IntegerProperty myVersionMinProperty) 
	{
		this.versionMinProperty = myVersionMinProperty;	
	}

	public void unsetDisplayOrderMaxProperty () 
	{
		this.displayOrderMaxProperty = null;	
	}

	public void unsetDisplayOrderMinProperty () 
	{
		this.displayOrderMinProperty = null;	
	}

	public void unsetFolderCriteria () 
	{
		this.folderCriteria = null;	
	}

	public void unsetIdProperty () 
	{
		this.idProperty = null;	
	}

	public void unsetNameProperty () 
	{
		this.nameProperty = null;	
	}

	public void unsetVersionMaxProperty () 
	{
		this.versionMaxProperty = null;	
	}

	public void unsetVersionMinProperty () 
	{
		this.versionMinProperty = null;	
	}

	public IntegerProperty versionMaxProperty () 
	{
		return this.versionMaxProperty;	
	}

	public IntegerProperty versionMinProperty () 
	{
		return this.versionMinProperty;	
	}


}
