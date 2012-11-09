package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.LongProperty;
import com.dooapp.firea.entity.domain.PersistentImage;
import javafx.beans.property.IntegerProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class PersistentImageWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private StringProperty dataIdProperty;
	
	private BooleanProperty errorProperty;
	
	private LongProperty idProperty;
	
	private PersistentImage persistentImage;
	
	private StringProperty previewProperty;
	
	private StringProperty sourceFileProperty;
	
	private StringProperty titleProperty;
	
	private IntegerProperty versionProperty;
    

	public PersistentImageWrapper(final PersistentImage entity)
	{
		this.persistentImage = entity;
		versionProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (persistentImage.getVersion() != null)
						return persistentImage.getVersion();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						persistentImage.setVersion(arg0);
				};
			};
		idProperty = new SimpleLongProperty()
			{
				@Override
				public long get()
				{
					if (persistentImage.getId() != null)
						return persistentImage.getId();
					else
						return 0;
				};
				
				@Override
				public void set(long arg0)
				{
					
						persistentImage.setId(arg0);
				};
			};
		titleProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (persistentImage.getTitle() != null)
						return persistentImage.getTitle();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						persistentImage.setTitle(arg0);
				};
			};
		sourceFileProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (persistentImage.getSourceFile() != null)
						return persistentImage.getSourceFile();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						persistentImage.setSourceFile(arg0);
				};
			};
		previewProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (persistentImage.getPreview() != null)
						return persistentImage.getPreview();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						persistentImage.setPreview(arg0);
				};
			};
		errorProperty = new SimpleBooleanProperty()
			{
				@Override
				public  get()
				{
					if (persistentImage.getError() != null)
						return persistentImage.getError();
					else
						return ;
				};
				
				@Override
				public void set( arg0)
				{
					
						persistentImage.setError(arg0);
				};
			};
		dataIdProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (persistentImage.getDataId() != null)
						return persistentImage.getDataId();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						persistentImage.setDataId(arg0);
				};
			};
			
	}

	public PersistentImageWrapper () 
	{
		this(new PersistentImage());	
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

	public PersistentImage getPersistentImage () 
	{
		return this.persistentImage;	
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

	public Integer getVersion () 
	{
		return this.versionProperty.get();	
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

	public void setPersistentImage (PersistentImage myPersistentImage) 
	{
		this.persistentImage = myPersistentImage;	
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

	public void setVersion (Integer myVersion) 
	{
		this.versionProperty.set(myVersion);	
	}

	public void setVersionProperty (IntegerProperty myVersionProperty) 
	{
		this.versionProperty = myVersionProperty;	
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

	public void unsetPersistentImage () 
	{
		this.persistentImage = null;	
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

	public void unsetVersionProperty () 
	{
		this.versionProperty = null;	
	}

	public IntegerProperty versionProperty () 
	{
		return this.versionProperty;	
	}


}
