package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import com.dooapp.firea.entity.repositories.criteria.ProjectCriteria;
import javafx.beans.property.LongProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.IntegerProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class ProjectCriteriaWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private StringProperty descriptionProperty;
	
	private LongProperty idProperty;
	
	private StringProperty nameProperty;
	
	private ProjectCriteria projectCriteria;
	
	private IntegerProperty versionMaxProperty;
	
	private IntegerProperty versionMinProperty;
    

	public ProjectCriteriaWrapper(final ProjectCriteria entity)
	{
		this.projectCriteria = entity;
		versionMinProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (projectCriteria.getVersionMin() != null)
						return projectCriteria.getVersionMin();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						projectCriteria.setVersionMin(arg0);
				};
			};
		versionMaxProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (projectCriteria.getVersionMax() != null)
						return projectCriteria.getVersionMax();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						projectCriteria.setVersionMax(arg0);
				};
			};
		idProperty = new SimpleLongProperty()
			{
				@Override
				public long get()
				{
					if (projectCriteria.getId() != null)
						return projectCriteria.getId();
					else
						return 0;
				};
				
				@Override
				public void set(long arg0)
				{
					
						projectCriteria.setId(arg0);
				};
			};
		nameProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (projectCriteria.getName() != null)
						return projectCriteria.getName();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						projectCriteria.setName(arg0);
				};
			};
		descriptionProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (projectCriteria.getDescription() != null)
						return projectCriteria.getDescription();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						projectCriteria.setDescription(arg0);
				};
			};
			
	}

	public ProjectCriteriaWrapper () 
	{
		this(new ProjectCriteria());	
	}

	public StringProperty descriptionProperty () 
	{
		return this.descriptionProperty;	
	}

	public String getDescription () 
	{
		return this.descriptionProperty.get();	
	}

	public Long getId () 
	{
		return this.idProperty.get();	
	}

	public String getName () 
	{
		return this.nameProperty.get();	
	}

	public ProjectCriteria getProjectCriteria () 
	{
		return this.projectCriteria;	
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

	public void setDescription (String myDescription) 
	{
		this.descriptionProperty.set(myDescription);	
	}

	public void setDescriptionProperty (StringProperty myDescriptionProperty) 
	{
		this.descriptionProperty = myDescriptionProperty;	
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

	public void setProjectCriteria (ProjectCriteria myProjectCriteria) 
	{
		this.projectCriteria = myProjectCriteria;	
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

	public void unsetDescriptionProperty () 
	{
		this.descriptionProperty = null;	
	}

	public void unsetIdProperty () 
	{
		this.idProperty = null;	
	}

	public void unsetNameProperty () 
	{
		this.nameProperty = null;	
	}

	public void unsetProjectCriteria () 
	{
		this.projectCriteria = null;	
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
