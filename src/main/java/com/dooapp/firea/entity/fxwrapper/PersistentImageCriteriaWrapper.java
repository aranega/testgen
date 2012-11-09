package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.BooleanProperty;
import com.dooapp.firea.entity.repositories.criteria.PersistentImageCriteria;
import javafx.beans.property.StringProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class PersistentImageCriteriaWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private StringProperty dataIdProperty;
	
	private BooleanProperty errorProperty;
	
	private LongProperty idProperty;
	
	private PersistentImageCriteria persistentImageCriteria;
	
	private StringProperty previewProperty;
	
	private StringProperty sourceFileProperty;
	
	private StringProperty titleProperty;
	
	private IntegerProperty versionMaxProperty;
	
	private IntegerProperty versionMinProperty;
    

	public PersistentImageCriteriaWrapper(final PersistentImageCriteria entity)
	{
		this.persistentImageCriteria = entity;
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
					
						persistentImageCriteria.setVersionMin(arg0);
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
					
						persistentImageCriteria.setVersionMax(arg0);
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
					
						persistentImageCriteria.setId(arg0);
				};
			};
		titleProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (persistentImageCriteria.getTitle() != null)
						return persistentImageCriteria.getTitle();
					else
						return "";
					//PersistentImageCriteria
				};
				
				@Override
				public void set(String arg0)
				{
					
						persistentImageCriteria.setTitle(arg0);
				};
			};
		sourceFileProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (persistentImageCriteria.getSourceFile() != null)
						return persistentImageCriteria.getSourceFile();
					else
						return "";
					//PersistentImageCriteria
				};
				
				@Override
				public void set(String arg0)
				{
					
						persistentImageCriteria.setSourceFile(arg0);
				};
			};
		previewProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (persistentImageCriteria.getPreview() != null)
						return persistentImageCriteria.getPreview();
					else
						return "";
					//PersistentImageCriteria
				};
				
				@Override
				public void set(String arg0)
				{
					
						persistentImageCriteria.setPreview(arg0);
				};
			};
		errorProperty = new SimpleBooleanProperty()
			{
				@Override
				public boolean get()
				{
					return false;
				};
				
				@Override
				public void set(boolean arg0)
				{
					
						persistentImageCriteria.setError(arg0);
				};
			};
		dataIdProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (persistentImageCriteria.getDataId() != null)
						return persistentImageCriteria.getDataId();
					else
						return "";
					//PersistentImageCriteria
				};
				
				@Override
				public void set(String arg0)
				{
					
						persistentImageCriteria.setDataId(arg0);
				};
			};
			
	}

	public PersistentImageCriteriaWrapper () 
	{
		this(new PersistentImageCriteria());	
	}

	public StringProperty dataIdProperty () 
	{
		return this.dataIdProperty;	
	}

	public BooleanProperty errorProperty () 
	{
		return this.errorProperty;	
	}

	public String getDataId () 
	{
		return this.dataIdProperty.get();	
	}

	public boolean getError () 
	{
		return this.errorProperty.get();	
	}

	public Long getId () 
	{
		return this.idProperty.get();	
	}

	public PersistentImageCriteria getPersistentImageCriteria () 
	{
		return this.persistentImageCriteria;	
	}

	public String getPreview () 
	{
		return this.previewProperty.get();	
	}

	public String getSourceFile () 
	{
		return this.sourceFileProperty.get();	
	}

	public String getTitle () 
	{
		return this.titleProperty.get();	
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

	public StringProperty previewProperty () 
	{
		return this.previewProperty;	
	}

	public void setDataId (String myDataId) 
	{
		this.dataIdProperty.set(myDataId);	
	}

	public void setDataIdProperty (StringProperty myDataIdProperty) 
	{
		this.dataIdProperty = myDataIdProperty;	
	}

	public void setError (boolean myError) 
	{
		this.errorProperty.set(myError);	
	}

	public void setErrorProperty (BooleanProperty myErrorProperty) 
	{
		this.errorProperty = myErrorProperty;	
	}

	public void setId (Long myId) 
	{
		this.idProperty.set(myId);	
	}

	public void setIdProperty (LongProperty myIdProperty) 
	{
		this.idProperty = myIdProperty;	
	}

	public void setPersistentImageCriteria (PersistentImageCriteria myPersistentImageCriteria) 
	{
		this.persistentImageCriteria = myPersistentImageCriteria;	
	}

	public void setPreview (String myPreview) 
	{
		this.previewProperty.set(myPreview);	
	}

	public void setPreviewProperty (StringProperty myPreviewProperty) 
	{
		this.previewProperty = myPreviewProperty;	
	}

	public void setSourceFile (String mySourceFile) 
	{
		this.sourceFileProperty.set(mySourceFile);	
	}

	public void setSourceFileProperty (StringProperty mySourceFileProperty) 
	{
		this.sourceFileProperty = mySourceFileProperty;	
	}

	public void setTitle (String myTitle) 
	{
		this.titleProperty.set(myTitle);	
	}

	public void setTitleProperty (StringProperty myTitleProperty) 
	{
		this.titleProperty = myTitleProperty;	
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

	public StringProperty sourceFileProperty () 
	{
		return this.sourceFileProperty;	
	}

	public StringProperty titleProperty () 
	{
		return this.titleProperty;	
	}

	public void unsetDataIdProperty () 
	{
		this.dataIdProperty = null;	
	}

	public void unsetErrorProperty () 
	{
		this.errorProperty = null;	
	}

	public void unsetIdProperty () 
	{
		this.idProperty = null;	
	}

	public void unsetPersistentImageCriteria () 
	{
		this.persistentImageCriteria = null;	
	}

	public void unsetPreviewProperty () 
	{
		this.previewProperty = null;	
	}

	public void unsetSourceFileProperty () 
	{
		this.sourceFileProperty = null;	
	}

	public void unsetTitleProperty () 
	{
		this.titleProperty = null;	
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
