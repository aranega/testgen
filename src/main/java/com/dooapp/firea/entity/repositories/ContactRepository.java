package com.dooapp.firea.entity.repositories;

import com.dooapp.firea.entity.repositories.criteria.ContactCriteria;
import java.util.List;
import com.dooapp.firea.entity.domain.Contact;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface ContactRepository 
{

	public List<Contact> findAll () ;
	public List<Contact> findByCriteria (ContactCriteria contactCriteria) ;
	public Contact findById (Long id) ;
	public Contact save (Contact contact) ;

}
