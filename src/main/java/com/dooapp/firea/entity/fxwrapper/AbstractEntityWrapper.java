package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import com.dooapp.firea.entity.domain.AbstractEntity;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class AbstractEntityWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private AbstractEntity abstractEntity;
	
	private LongProperty idProperty;
	
	private IntegerProperty versionProperty;
    

	public AbstractEntityWrapper(final AbstractEntity entity)
	{
		this.abstractEntity = entity;
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
					
						abstractEntity.setVersion(arg0);
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
					
						abstractEntity.setId(arg0);
				};
			};
			
	}

	public AbstractEntityWrapper () 
	{
		this(new AbstractEntity());	
	}

	public AbstractEntity getAbstractEntity () 
	{
		return this.abstractEntity;	
	}

	public Long getId () 
	{
		return this.idProperty.get();	
	}

	public Integer getVersion () 
	{
		return this.versionProperty.get();	
	}

	public LongProperty idProperty () 
	{
		return this.idProperty;	
	}

	public void setAbstractEntity (AbstractEntity myAbstractEntity) 
	{
		this.abstractEntity = myAbstractEntity;	
	}

	public void setId (Long myId) 
	{
		this.idProperty.set(myId);	
	}

	public void setIdProperty (LongProperty myIdProperty) 
	{
		this.idProperty = myIdProperty;	
	}

	public void setVersion (Integer myVersion) 
	{
		this.versionProperty.set(myVersion);	
	}

	public void setVersionProperty (IntegerProperty myVersionProperty) 
	{
		this.versionProperty = myVersionProperty;	
	}

	public void unsetAbstractEntity () 
	{
		this.abstractEntity = null;	
	}

	public void unsetIdProperty () 
	{
		this.idProperty = null;	
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
