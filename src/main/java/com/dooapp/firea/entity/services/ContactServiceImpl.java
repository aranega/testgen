package com.dooapp.firea.entity.services;

import com.dooapp.firea.entity.domain.Contact;
import com.dooapp.firea.entity.repositories.ContactRepository;
import java.util.List;
import com.dooapp.firea.entity.repositories.criteria.ContactCriteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Service(value = "contactService")
@Transactional(readOnly = true)
public class ContactServiceImpl implements ContactService
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@Autowired
	private ContactRepository contactRepository;
    

	public List<Contact> findAll () 
	{
		return this.contactRepository.findAll();	
	}

	public List<Contact> findByCriteria (ContactCriteria criteria) 
	{
		return this.contactRepository.findByCriteria (criteria);	
	}

	public Contact findById (Long id) 
	{
		return this.contactRepository.findById(id);	
	}

	public Contact save (Contact contact) 
	{
		return this.contactRepository.save (contact);	
	}


}
