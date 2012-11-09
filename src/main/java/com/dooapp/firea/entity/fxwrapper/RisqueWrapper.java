package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.StringProperty;
import com.dooapp.firea.entity.domain.Risque;
import javafx.beans.property.IntegerProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class RisqueWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private LongProperty idProperty;
	
	private StringProperty keyProperty;
	
	private Risque risque;
	
	private IntegerProperty versionProperty;
    

	public RisqueWrapper(final Risque entity)
	{
		this.risque = entity;
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
					
						risque.setVersion(arg0);
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
					
						risque.setId(arg0);
				};
			};
		keyProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (risque.getKey() != null)
						return risque.getKey();
					else
						return "";
					//Risque
				};
				
				@Override
				public void set(String arg0)
				{
					
						risque.setKey(arg0);
				};
			};
			
	}

	public RisqueWrapper () 
	{
		this(new Risque());	
	}

	public Long getId () 
	{
		return this.idProperty.get();	
	}

	public String getKey () 
	{
		return this.keyProperty.get();	
	}

	public Risque getRisque () 
	{
		return this.risque;	
	}

	public Integer getVersion () 
	{
		return this.versionProperty.get();	
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

	public void setRisque (Risque myRisque) 
	{
		this.risque = myRisque;	
	}

	public void setVersion (Integer myVersion) 
	{
		this.versionProperty.set(myVersion);	
	}

	public void setVersionProperty (IntegerProperty myVersionProperty) 
	{
		this.versionProperty = myVersionProperty;	
	}

	public void unsetIdProperty () 
	{
		this.idProperty = null;	
	}

	public void unsetKeyProperty () 
	{
		this.keyProperty = null;	
	}

	public void unsetRisque () 
	{
		this.risque = null;	
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
