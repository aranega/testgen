package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import ;
import ;
import ;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.util.ArrayList;
import com.dooapp.firea.entity.domain.Project;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.LongProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class ProjectWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	private ObservableList<ContactWrapper> contactsProperty;
	
	private StringProperty descriptionProperty;
	
	private LongProperty idProperty;
	private ObjectProperty<PersistentImage> imageProperty;
	
	private StringProperty nameProperty;
	
	private Project project;
	private ObjectProperty<Risque> risqueProperty;
	
	private IntegerProperty versionProperty;
    

	public ProjectWrapper(final Project entity)
	{
		this.project = entity;
		versionProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (project.getVersion() != null)
						return project.getVersion();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						project.setVersion(arg0);
				};
			};
		idProperty = new SimpleLongProperty()
			{
				@Override
				public long get()
				{
					if (project.getId() != null)
						return project.getId();
					else
						return 0;
				};
				
				@Override
				public void set(long arg0)
				{
					
						project.setId(arg0);
				};
			};
		nameProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (project.getName() != null)
						return project.getName();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						project.setName(arg0);
				};
			};
		descriptionProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (project.getDescription() != null)
						return project.getDescription();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						project.setDescription(arg0);
				};
			};
		risqueProperty = new SimpleObjectProperty<Risque>()
					{
						@Override
						public Risque get()
						{
							return project.getRisque();
						};
						
						@Override
						public void set(Risque arg0)
						{
							//if (arg0 != null)
							project.setRisque(arg0);
						};
					};
		imageProperty = new SimpleObjectProperty<PersistentImage>()
					{
						@Override
						public PersistentImage get()
						{
							return project.getImage();
						};
						
						@Override
						public void set(PersistentImage arg0)
						{
							//if (arg0 != null)
							project.setImage(arg0);
						};
					};
		contactsProperty = FXCollections.observableList(new ArrayList<ContactWrapper>());
		for (Contact tmp : entity.getContacts()) {
			contactsProperty.add(new ContactWrapper(tmp));
		}
		contactsProperty.addListener(new javafx.collections.ListChangeListener<ContactWrapper>() {
			@Override
			public void onChanged(javafx.collections.ListChangeListener.Change<? extends ContactWrapper> change) {
				while (change.next()) {
					if (change.getAddedSize() > 0) {
						for (ContactWrapper tmp : change.getAddedSubList()) {
							entity.addContacts(tmp.getContact());
						}
					}
					if (change.getRemovedSize() > 0) {
						for (ContactWrapper tmp : change.getRemoved()) {
							entity.getContacts().remove(tmp.getContact());
						}
					}
				}
			}
		});
			
	}

	public ProjectWrapper () 
	{
		this(new Project());	
	}

	public ObservableList<ContactWrapper> contactsProperty()
	{
		return this.contactsProperty;	
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

	public PersistentImage getImage() 
	{
		return this.imageProperty.get();	
	}

	public String getName () 
	{
		return this.nameProperty.get();	
	}

	public Project getProject () 
	{
		return this.project;	
	}

	public Risque getRisque() 
	{
		return this.risqueProperty.get();	
	}

	public Integer getVersion () 
	{
		return this.versionProperty.get();	
	}

	public LongProperty idProperty () 
	{
		return this.idProperty;	
	}

	public ObjectProperty<PersistentImage> imageProperty()
	{
		return this.imageProperty;	
	}

	public StringProperty nameProperty () 
	{
		return this.nameProperty;	
	}

	public ObjectProperty<Risque> risqueProperty()
	{
		return this.risqueProperty;	
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

	public void setImage(PersistentImage myImage) 
	{
		this.imageProperty.set(myImage);	
	}

	public void setName (String myName) 
	{
		this.nameProperty.set(myName);	
	}

	public void setNameProperty (StringProperty myNameProperty) 
	{
		this.nameProperty = myNameProperty;	
	}

	public void setProject (Project myProject) 
	{
		this.project = myProject;	
	}

	public void setRisque(Risque myRisque) 
	{
		this.risqueProperty.set(myRisque);	
	}

	public void setVersion (Integer myVersion) 
	{
		this.versionProperty.set(myVersion);	
	}

	public void setVersionProperty (IntegerProperty myVersionProperty) 
	{
		this.versionProperty = myVersionProperty;	
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

	public void unsetProject () 
	{
		this.project = null;	
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
