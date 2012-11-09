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
import com.dooapp.firea.entity.repositories.criteria.ContactCriteria;
import javafx.beans.property.LongProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.IntegerProperty;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class ContactCriteriaWrapper
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private StringProperty address2Property;
	
	private StringProperty adress1Property;
	
	private StringProperty cityProperty;
	
	private ContactCriteria contactCriteria;
	
	private StringProperty emailProperty;
	
	private LongProperty idProperty;
	
	private StringProperty nameProperty;
	
	private StringProperty personProperty;
	
	private StringProperty phoneProperty;
	
	private StringProperty siretProperty;
	
	private IntegerProperty versionMaxProperty;
	
	private IntegerProperty versionMinProperty;
	
	private StringProperty zipCodeProperty;
    

	public ContactCriteriaWrapper(final ContactCriteria entity)
	{
		this.contactCriteria = entity;
		versionMinProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (contactCriteria.getVersionMin() != null)
						return contactCriteria.getVersionMin();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						contactCriteria.setVersionMin(arg0);
				};
			};
		versionMaxProperty = new SimpleIntegerProperty()
			{
				@Override
				public int get()
				{
					if (contactCriteria.getVersionMax() != null)
						return contactCriteria.getVersionMax();
					else
						return 0;
				};
				
				@Override
				public void set(int arg0)
				{
					
						contactCriteria.setVersionMax(arg0);
				};
			};
		idProperty = new SimpleLongProperty()
			{
				@Override
				public long get()
				{
					if (contactCriteria.getId() != null)
						return contactCriteria.getId();
					else
						return 0;
				};
				
				@Override
				public void set(long arg0)
				{
					
						contactCriteria.setId(arg0);
				};
			};
		nameProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contactCriteria.getName() != null)
						return contactCriteria.getName();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						contactCriteria.setName(arg0);
				};
			};
		personProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contactCriteria.getPerson() != null)
						return contactCriteria.getPerson();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						contactCriteria.setPerson(arg0);
				};
			};
		adress1Property = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contactCriteria.getAdress1() != null)
						return contactCriteria.getAdress1();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						contactCriteria.setAdress1(arg0);
				};
			};
		address2Property = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contactCriteria.getAddress2() != null)
						return contactCriteria.getAddress2();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						contactCriteria.setAddress2(arg0);
				};
			};
		zipCodeProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contactCriteria.getZipCode() != null)
						return contactCriteria.getZipCode();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						contactCriteria.setZipCode(arg0);
				};
			};
		cityProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contactCriteria.getCity() != null)
						return contactCriteria.getCity();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						contactCriteria.setCity(arg0);
				};
			};
		emailProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contactCriteria.getEmail() != null)
						return contactCriteria.getEmail();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						contactCriteria.setEmail(arg0);
				};
			};
		phoneProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contactCriteria.getPhone() != null)
						return contactCriteria.getPhone();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						contactCriteria.setPhone(arg0);
				};
			};
		siretProperty = new SimpleStringProperty()
			{
				@Override
				public String get()
				{
					if (contactCriteria.getSiret() != null)
						return contactCriteria.getSiret();
					else
						return "";
				};
				
				@Override
				public void set(String arg0)
				{
					
						contactCriteria.setSiret(arg0);
				};
			};
			
	}

	public ContactCriteriaWrapper () 
	{
		this(new ContactCriteria());	
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

	public ContactCriteria getContactCriteria () 
	{
		return this.contactCriteria;	
	}

	public String getEmail () 
	{
		return this.emailProperty.get();	
	}

	public Long getId () 
	{
		return this.idProperty.get();	
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

	public Integer getVersionMax () 
	{
		return this.versionMaxProperty.get();	
	}

	public Integer getVersionMin () 
	{
		return this.versionMinProperty.get();	
	}

	public String getZipCode () 
	{
		return this.zipCodeProperty.get();	
	}

	public LongProperty idProperty () 
	{
		return this.idProperty;	
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

	public void setContactCriteria (ContactCriteria myContactCriteria) 
	{
		this.contactCriteria = myContactCriteria;	
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

	public void unsetContactCriteria () 
	{
		this.contactCriteria = null;	
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

	public void unsetVersionMaxProperty () 
	{
		this.versionMaxProperty = null;	
	}

	public void unsetVersionMinProperty () 
	{
		this.versionMinProperty = null;	
	}

	public void unsetZipCodeProperty () 
	{
		this.zipCodeProperty = null;	
	}

	public IntegerProperty versionMaxProperty () 
	{
		return this.versionMaxProperty;	
	}

	public IntegerProperty versionMinProperty () 
	{
		return this.versionMinProperty;	
	}

	public StringProperty zipCodeProperty () 
	{
		return this.zipCodeProperty;	
	}


}
