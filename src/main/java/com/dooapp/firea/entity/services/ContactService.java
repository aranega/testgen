package com.dooapp.firea.entity.services;

import java.util.List;
import com.dooapp.firea.entity.repositories.criteria.ContactCriteria;
import com.dooapp.firea.entity.domain.Contact;
import org.springframework.transaction.annotation.Transactional;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface ContactService 
{

	public List<Contact> findAll () ;
	public List<Contact> findByCriteria (ContactCriteria criteria) ;
	public Contact findById (Long id) ;
	public Contact save (Contact contact) ;

}
