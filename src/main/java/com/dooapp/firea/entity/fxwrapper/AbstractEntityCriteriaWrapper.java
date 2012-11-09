package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.IntegerProperty;
import com.dooapp.firea.entity.repositories.criteria.AbstractEntityCriteria;
import javafx.beans.property.LongProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class AbstractEntityCriteriaWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private AbstractEntityCriteria abstractEntityCriteria;
	
	private LongProperty idProperty;
	
	private IntegerProperty versionMaxProperty;
	
	private IntegerProperty versionMinProperty;
    

	public AbstractEntityCriteriaWrapper(final AbstractEntityCriteria entity)
	{
		this.abstractEntityCriteria = entity;
		versionMinProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (abstractEntityCriteria.getVersionMin() != null)
						return abstractEntityCriteria.getVersionMin();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						abstractEntityCriteria.setVersionMin(arg0);
				};
			};
		versionMaxProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (abstractEntityCriteria.getVersionMax() != null)
						return abstractEntityCriteria.getVersionMax();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						abstractEntityCriteria.setVersionMax(arg0);
				};
			};
		idProperty = new SimpleLongProperty()
			{
				@Override
				public long get()
				{
					if (abstractEntityCriteria.getId() != null)
						return abstractEntityCriteria.getId();
					else
						return 0;
				};
				
				@Override
				public void set(long arg0)
				{
					
						abstractEntityCriteria.setId(arg0);
				};
			};
			
	}

	public AbstractEntityCriteriaWrapper () 
	{
		this(new AbstractEntityCriteria());	
	}

	public AbstractEntityCriteria getAbstractEntityCriteria () 
	{
		return this.abstractEntityCriteria;	
	}

	public Long getId () 
	{
		return this.idProperty.get();	
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

	public void setAbstractEntityCriteria (AbstractEntityCriteria myAbstractEntityCriteria) 
	{
		this.abstractEntityCriteria = myAbstractEntityCriteria;	
	}

	public void setId (Long myId) 
	{
		this.idProperty.set(myId);	
	}

	public void setIdProperty (LongProperty myIdProperty) 
	{
		this.idProperty = myIdProperty;	
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

	public void unsetAbstractEntityCriteria () 
	{
		this.abstractEntityCriteria = null;	
	}

	public void unsetIdProperty () 
	{
		this.idProperty = null;	
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
