package com.dooapp.firea.entity.domain.factories;

import com.dooapp.firea.entity.domain.Contact;
import com.dooapp.firea.entity.domain.ContactKind;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class ContactBuilder extends AbstractEntityBuilder
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private Contact contact;
    

	public ContactBuilder address2 (String address2) 
	{
		contact.setAddress2 (address2);
		return this;	
	}

	public ContactBuilder adress1 (String adress1) 
	{
		contact.setAdress1 (adress1);
		return this;	
	}

	public Contact build () 
	{
		return contact;	
	}

	public ContactBuilder city (String city) 
	{
		contact.setCity (city);
		return this;	
	}

	public static ContactBuilder create () 
	{
		return new ContactBuilder();	
	}

	public ContactBuilder email (String email) 
	{
		contact.setEmail (email);
		return this;	
	}

	public ContactBuilder initContact () 
	{
		contact = new Contact();
		return this;	
	}

	public ContactBuilder kind (com.dooapp.firea.entity.domain.ContactKind kind) 
	{
		contact.setKind (kind);
		return this;	
	}

	public ContactBuilder name (String name) 
	{
		contact.setName (name);
		return this;	
	}

	public ContactBuilder person (String person) 
	{
		contact.setPerson (person);
		return this;	
	}

	public ContactBuilder phone (String phone) 
	{
		contact.setPhone (phone);
		return this;	
	}

	public ContactBuilder siret (String siret) 
	{
		contact.setSiret (siret);
		return this;	
	}

	public ContactBuilder zipCode (String zipCode) 
	{
		contact.setZipCode (zipCode);
		return this;	
	}


}
