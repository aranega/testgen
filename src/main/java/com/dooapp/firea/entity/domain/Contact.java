package com.dooapp.firea.entity.domain;

import com.dooapp.firea.entity.domain.ContactKind;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class Contact extends AbstractEntity
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private String address2;
	
	private String adress1;
	
	private String city;
	
	private String email;
	@ManyToOne
	private PersistentImage image;
	
	private com.dooapp.firea.entity.domain.ContactKind kind;
	@Column(name = "NAMECOLUMN")
	private String name;
	
	private String person;
	
	private String phone;
	
	private String siret;
	
	private String zipCode;
    

	public String getAddress2 () 
	{
		return this.address2;	
	}

	public String getAdress1 () 
	{
		return this.adress1;	
	}

	public String getCity () 
	{
		return this.city;	
	}

	public String getEmail () 
	{
		return this.email;	
	}

	public PersistentImage getImage () 
	{
		return this.image;	
	}

	public com.dooapp.firea.entity.domain.ContactKind getKind () 
	{
		return this.kind;	
	}

	public String getName () 
	{
		return this.name;	
	}

	public String getPerson () 
	{
		return this.person;	
	}

	public String getPhone () 
	{
		return this.phone;	
	}

	public String getSiret () 
	{
		return this.siret;	
	}

	public String getZipCode () 
	{
		return this.zipCode;	
	}

	public void setAddress2 (String myAddress2) 
	{
		this.address2 = myAddress2;	
	}

	public void setAdress1 (String myAdress1) 
	{
		this.adress1 = myAdress1;	
	}

	public void setCity (String myCity) 
	{
		this.city = myCity;	
	}

	public void setEmail (String myEmail) 
	{
		this.email = myEmail;	
	}

	public void setImage (PersistentImage myImage) 
	{
		this.image = myImage;	
	}

	public void setKind (com.dooapp.firea.entity.domain.ContactKind myKind) 
	{
		this.kind = myKind;	
	}

	public void setName (String myName) 
	{
		this.name = myName;	
	}

	public void setPerson (String myPerson) 
	{
		this.person = myPerson;	
	}

	public void setPhone (String myPhone) 
	{
		this.phone = myPhone;	
	}

	public void setSiret (String mySiret) 
	{
		this.siret = mySiret;	
	}

	public void setZipCode (String myZipCode) 
	{
		this.zipCode = myZipCode;	
	}

	public void unsetAddress2 () 
	{
		this.address2 = null;	
	}

	public void unsetAdress1 () 
	{
		this.adress1 = null;	
	}

	public void unsetCity () 
	{
		this.city = null;	
	}

	public void unsetEmail () 
	{
		this.email = null;	
	}

	public void unsetImage () 
	{
		this.image = null;	
	}

	public void unsetKind () 
	{
		this.kind = null;	
	}

	public void unsetName () 
	{
		this.name = null;	
	}

	public void unsetPerson () 
	{
		this.person = null;	
	}

	public void unsetPhone () 
	{
		this.phone = null;	
	}

	public void unsetSiret () 
	{
		this.siret = null;	
	}

	public void unsetZipCode () 
	{
		this.zipCode = null;	
	}


}
