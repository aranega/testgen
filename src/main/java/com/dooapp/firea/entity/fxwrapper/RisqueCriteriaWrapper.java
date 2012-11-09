package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.IntegerProperty;
import com.dooapp.firea.entity.repositories.criteria.RisqueCriteria;
import javafx.beans.property.LongProperty;
import javafx.beans.property.StringProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class RisqueCriteriaWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private LongProperty idProperty;
	
	private StringProperty keyProperty;
	
	private RisqueCriteria risqueCriteria;
	
	private IntegerProperty versionMaxProperty;
	
	private IntegerProperty versionMinProperty;
    

	public RisqueCriteriaWrapper(final RisqueCriteria entity)
	{
		this.risqueCriteria = entity;
		versionMinProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (risqueCriteria.getVersionMin() != null)
						return risqueCriteria.getVersionMin();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						risqueCriteria.setVersionMin(arg0);
				};
			};
		versionMaxProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (risqueCriteria.getVersionMax() != null)
						return risqueCriteria.getVersionMax();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						risqueCriteria.setVersionMax(arg0);
				};
			};
		idProperty = new SimpleLongProperty()
			{
				@Override
				public long get()
				{
					if (risqueCriteria.getId() != null)
						return risqueCriteria.getId();
					else
						return 0;
				};
				
				@Override
				public void set(long arg0)
				{
					
						risqueCriteria.setId(arg0);
				};
			};
		keyProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (risqueCriteria.getKey() != null)
						return risqueCriteria.getKey();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						risqueCriteria.setKey(arg0);
				};
			};
			
	}

	public RisqueCriteriaWrapper () 
	{
		this(new RisqueCriteria());	
	}

	public Long getId () 
	{
		return this.idProperty.get();	
	}

	public String getKey () 
	{
		return this.keyProperty.get();	
	}

	public RisqueCriteria getRisqueCriteria () 
	{
		return this.risqueCriteria;	
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

	public StringProperty keyProperty () 
	{
		return this.keyProperty;	
	}

	public void setId (Long myId) 
	{
		this.idProperty.set(myId);	
	}

	public void setIdProperty (LongProperty myIdProperty) 
	{
		this.idProperty = myIdProperty;	
	}

	public void setKey (String myKey) 
	{
		this.keyProperty.set(myKey);	
	}

	public void setKeyProperty (StringProperty myKeyProperty) 
	{
		this.keyProperty = myKeyProperty;	
	}

	public void setRisqueCriteria (RisqueCriteria myRisqueCriteria) 
	{
		this.risqueCriteria = myRisqueCriteria;	
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

	public void unsetIdProperty () 
	{
		this.idProperty = null;	
	}

	public void unsetKeyProperty () 
	{
		this.keyProperty = null;	
	}

	public void unsetRisqueCriteria () 
	{
		this.risqueCriteria = null;	
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
