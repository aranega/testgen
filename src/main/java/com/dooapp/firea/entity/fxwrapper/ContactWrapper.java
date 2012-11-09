package com.dooapp.firea.entity.fxwrapper;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleStringProperty;
import ;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import com.dooapp.firea.entity.domain.Contact;
import javafx.beans.property.StringProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class ContactWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private StringProperty address2Property;
	
	private StringProperty adress1Property;
	
	private StringProperty cityProperty;
	
	private Contact contact;
	
	private StringProperty emailProperty;
	
	private LongProperty idProperty;
	private ObjectProperty<PersistentImage> imageProperty;
	
	private StringProperty nameProperty;
	
	private StringProperty personProperty;
	
	private StringProperty phoneProperty;
	
	private StringProperty siretProperty;
	
	private IntegerProperty versionProperty;
	
	private StringProperty zipCodeProperty;
    

	public ContactWrapper(final Contact entity)
	{
		this.contact = entity;
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
					
						contact.setVersion(arg0);
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
					
						contact.setId(arg0);
				};
			};
		nameProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contact.getName() != null)
						return contact.getName();
					else
						return "";
					//Contact
				};
				
				@Override
				public void set(String arg0)
				{
					
						contact.setName(arg0);
				};
			};
		personProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contact.getPerson() != null)
						return contact.getPerson();
					else
						return "";
					//Contact
				};
				
				@Override
				public void set(String arg0)
				{
					
						contact.setPerson(arg0);
				};
			};
		adress1Property = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contact.getAdress1() != null)
						return contact.getAdress1();
					else
						return "";
					//Contact
				};
				
				@Override
				public void set(String arg0)
				{
					
						contact.setAdress1(arg0);
				};
			};
		address2Property = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contact.getAddress2() != null)
						return contact.getAddress2();
					else
						return "";
					//Contact
				};
				
				@Override
				public void set(String arg0)
				{
					
						contact.setAddress2(arg0);
				};
			};
		zipCodeProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contact.getZipCode() != null)
						return contact.getZipCode();
					else
						return "";
					//Contact
				};
				
				@Override
				public void set(String arg0)
				{
					
						contact.setZipCode(arg0);
				};
			};
		cityProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contact.getCity() != null)
						return contact.getCity();
					else
						return "";
					//Contact
				};
				
				@Override
				public void set(String arg0)
				{
					
						contact.setCity(arg0);
				};
			};
		emailProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contact.getEmail() != null)
						return contact.getEmail();
					else
						return "";
					//Contact
				};
				
				@Override
				public void set(String arg0)
				{
					
						contact.setEmail(arg0);
				};
			};
		phoneProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contact.getPhone() != null)
						return contact.getPhone();
					else
						return "";
					//Contact
				};
				
				@Override
				public void set(String arg0)
				{
					
						contact.setPhone(arg0);
				};
			};
		siretProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contact.getSiret() != null)
						return contact.getSiret();
					else
						return "";
					//Contact
				};
				
				@Override
				public void set(String arg0)
				{
					
						contact.setSiret(arg0);
				};
			};
		imageProperty = new SimpleObjectProperty<PersistentImage>()
					{
						@Override
						public PersistentImage get()
						{
							return contact.getImage();
						};
						
						@Override
						public void set(PersistentImage arg0)
						{
							//if (arg0 != null)
							contact.setImage(arg0);
						};
					};
			
	}

	public ContactWrapper () 
	{
		this(new Contact());	
	}

	public StringProperty address2Property () 
	{
		return this.address2Property;	
	}

	public StringProperty adress1Property () 
	{
		return this.adress1Property;	
	}

	public StringProperty cityProperty () 
	{
		return this.cityProperty;	
	}

	public StringProperty emailProperty () 
	{
		return this.emailProperty;	
	}

	public String getAddress2 () 
	{
		return this.address2Property.get();	
	}

	public String getAdress1 () 
	{
		return this.adress1Property.get();	
	}

	public String getCity () 
	{
		return this.cityProperty.get();	
	}

	public Contact getContact () 
	{
		return this.contact;	
	}

	public String getEmail () 
	{
		return this.emailProperty.get();	
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

	public String getPerson () 
	{
		return this.personProperty.get();	
	}

	public String getPhone () 
	{
		return this.phoneProperty.get();	
	}

	public String getSiret () 
	{
		return this.siretProperty.get();	
	}

	public Integer getVersion () 
	{
		return this.versionProperty.get();	
	}

	public String getZipCode () 
	{
		return this.zipCodeProperty.get();	
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

	public StringProperty personProperty () 
	{
		return this.personProperty;	
	}

	public StringProperty phoneProperty () 
	{
		return this.phoneProperty;	
	}

	public void setAddress2 (String myAddress2) 
	{
		this.address2Property.set(myAddress2);	
	}

	public void setAddress2Property (StringProperty myAddress2Property) 
	{
		this.address2Property = myAddress2Property;	
	}

	public void setAdress1 (String myAdress1) 
	{
		this.adress1Property.set(myAdress1);	
	}

	public void setAdress1Property (StringProperty myAdress1Property) 
	{
		this.adress1Property = myAdress1Property;	
	}

	public void setCity (String myCity) 
	{
		this.cityProperty.set(myCity);	
	}

	public void setCityProperty (StringProperty myCityProperty) 
	{
		this.cityProperty = myCityProperty;	
	}

	public void setContact (Contact myContact) 
	{
		this.contact = myContact;	
	}

	public void setEmail (String myEmail) 
	{
		this.emailProperty.set(myEmail);	
	}

	public void setEmailProperty (StringProperty myEmailProperty) 
	{
		this.emailProperty = myEmailProperty;	
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

	public void setPerson (String myPerson) 
	{
		this.personProperty.set(myPerson);	
	}

	public void setPersonProperty (StringProperty myPersonProperty) 
	{
		this.personProperty = myPersonProperty;	
	}

	public void setPhone (String myPhone) 
	{
		this.phoneProperty.set(myPhone);	
	}

	public void setPhoneProperty (StringProperty myPhoneProperty) 
	{
		this.phoneProperty = myPhoneProperty;	
	}

	public void setSiret (String mySiret) 
	{
		this.siretProperty.set(mySiret);	
	}

	public void setSiretProperty (StringProperty mySiretProperty) 
	{
		this.siretProperty = mySiretProperty;	
	}

	public void setVersion (Integer myVersion) 
	{
		this.versionProperty.set(myVersion);	
	}

	public void setVersionProperty (IntegerProperty myVersionProperty) 
	{
		this.versionProperty = myVersionProperty;	
	}

	public void setZipCode (String myZipCode) 
	{
		this.zipCodeProperty.set(myZipCode);	
	}

	public void setZipCodeProperty (StringProperty myZipCodeProperty) 
	{
		this.zipCodeProperty = myZipCodeProperty;	
	}

	public StringProperty siretProperty () 
	{
		return this.siretProperty;	
	}

	public void unsetAddress2Property () 
	{
		this.address2Property = null;	
	}

	public void unsetAdress1Property () 
	{
		this.adress1Property = null;	
	}

	public void unsetCityProperty () 
	{
		this.cityProperty = null;	
	}

	public void unsetContact () 
	{
		this.contact = null;	
	}

	public void unsetEmailProperty () 
	{
		this.emailProperty = null;	
	}

	public void unsetIdProperty () 
	{
		this.idProperty = null;	
	}

	public void unsetNameProperty () 
	{
		this.nameProperty = null;	
	}

	public void unsetPersonProperty () 
	{
		this.personProperty = null;	
	}

	public void unsetPhoneProperty () 
	{
		this.phoneProperty = null;	
	}

	public void unsetSiretProperty () 
	{
		this.siretProperty = null;	
	}

	public void unsetVersionProperty () 
	{
		this.versionProperty = null;	
	}

	public void unsetZipCodeProperty () 
	{
		this.zipCodeProperty = null;	
	}

	public IntegerProperty versionProperty () 
	{
		return this.versionProperty;	
	}

	public StringProperty zipCodeProperty () 
	{
		return this.zipCodeProperty;	
	}


}
