package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import com.dooapp.firea.entity.repositories.criteria.PersistentImageDataCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class PersistentImageDataCriteriaWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private StringProperty dataProperty;
	
	private LongProperty idProperty;
	
	private PersistentImageDataCriteria persistentImageDataCriteria;
	
	private IntegerProperty versionMaxProperty;
	
	private IntegerProperty versionMinProperty;
    

	public PersistentImageDataCriteriaWrapper(final PersistentImageDataCriteria entity)
	{
		this.persistentImageDataCriteria = entity;
		versionMinProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						persistentImageDataCriteria.setVersionMin(arg0);
				};
			};
		versionMaxProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						persistentImageDataCriteria.setVersionMax(arg0);
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
					
						persistentImageDataCriteria.setId(arg0);
				};
			};
		dataProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (persistentImageDataCriteria.getData() != null)
						return persistentImageDataCriteria.getData();
					else
						return "";
					//PersistentImageDataCriteria
				};
				
				@Override
				public void set(String arg0)
				{
					
						persistentImageDataCriteria.setData(arg0);
				};
			};
			
	}

	public PersistentImageDataCriteriaWrapper () 
	{
		this(new PersistentImageDataCriteria());	
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

	public PersistentImageDataCriteria getPersistentImageDataCriteria () 
	{
		return this.persistentImageDataCriteria;	
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

	public void setPersistentImageDataCriteria (PersistentImageDataCriteria myPersistentImageDataCriteria) 
	{
		this.persistentImageDataCriteria = myPersistentImageDataCriteria;	
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

	public void unsetDataProperty () 
	{
		this.dataProperty = null;	
	}

	public void unsetIdProperty () 
	{
		this.idProperty = null;	
	}

	public void unsetPersistentImageDataCriteria () 
	{
		this.persistentImageDataCriteria = null;	
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
