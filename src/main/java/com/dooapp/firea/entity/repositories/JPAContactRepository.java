package com.dooapp.firea.entity.repositories;

import javax.persistence.TypedQuery;
import com.dooapp.firea.entity.repositories.criteria.ContactCriteria;
import com.dooapp.firea.entity.domain.Contact;
import javax.persistence.EntityManager;
import java.util.List;
import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Repository(value = "contactRepository")
public class JPAContactRepository implements ContactRepository
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@PersistenceContext
	private EntityManager entityManager;
    

	public List<Contact> findAll () 
	{
		final String hql = "select e from Contact e order by id";
		TypedQuery<Contact> query =
			this.entityManager.createQuery(hql, Contact.class);
		return query.getResultList();	
	}

	public List<Contact> findByCriteria (ContactCriteria contactCriteria) 
	{
		javax.persistence.criteria.CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		javax.persistence.criteria.CriteriaQuery<Contact> c = cb.createQuery(Contact.class);
		javax.persistence.criteria.Root<Contact> emp = c.from(Contact.class);
		c.select(emp);
		
		List<javax.persistence.criteria.Predicate> criteria =
		    new java.util.ArrayList<javax.persistence.criteria.Predicate>();
		    
		if (contactCriteria.getCreationDateMin()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (contactCriteria.getCreationDateMax()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (contactCriteria.getUpdateDateMin()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (contactCriteria.getUpdateDateMax()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (contactCriteria.getVersionMin()!=null )
		{
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (contactCriteria.getVersionMax()!=null )
		{
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (contactCriteria.getId()!=null )
		{
			javax.persistence.criteria.Expression<Long> p =  emp.get("id");
			javax.persistence.criteria.Expression<Long> val = cb.parameter(Long.class, "id");	
			criteria.add(cb.equal(p,val));
		
		}
		if (contactCriteria.getName()!=null && !contactCriteria.getName().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("name");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "name");	
			criteria.add(cb.like(p,val));
		
		}
		if (contactCriteria.getPerson()!=null && !contactCriteria.getPerson().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("person");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "person");	
			criteria.add(cb.like(p,val));
		
		}
		if (contactCriteria.getAdress1()!=null && !contactCriteria.getAdress1().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("adress1");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "adress1");	
			criteria.add(cb.like(p,val));
		
		}
		if (contactCriteria.getAddress2()!=null && !contactCriteria.getAddress2().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("address2");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "address2");	
			criteria.add(cb.like(p,val));
		
		}
		if (contactCriteria.getZipCode()!=null && !contactCriteria.getZipCode().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("zipCode");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "zipCode");	
			criteria.add(cb.like(p,val));
		
		}
		if (contactCriteria.getCity()!=null && !contactCriteria.getCity().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("city");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "city");	
			criteria.add(cb.like(p,val));
		
		}
		if (contactCriteria.getEmail()!=null && !contactCriteria.getEmail().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("email");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "email");	
			criteria.add(cb.like(p,val));
		
		}
		if (contactCriteria.getPhone()!=null && !contactCriteria.getPhone().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("phone");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "phone");	
			criteria.add(cb.like(p,val));
		
		}
		if (contactCriteria.getSiret()!=null && !contactCriteria.getSiret().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("siret");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "siret");	
			criteria.add(cb.like(p,val));
		
		}
		if (contactCriteria.getKind()!=null )
		{
			javax.persistence.criteria.Expression<com.dooapp.firea.entity.domain.ContactKind> p =  emp.get("kind");
			javax.persistence.criteria.Expression<com.dooapp.firea.entity.domain.ContactKind> val = cb.parameter(com.dooapp.firea.entity.domain.ContactKind.class, "kind");	
			criteria.add(cb.equal(p,val));
		
		}
		   
		
		if (criteria.size()==1) {
			c.where(criteria.get(0));
		}else {
			c.where(cb.and(criteria.toArray(new javax.persistence.criteria.Predicate[0])));
		}		 
		javax.persistence.TypedQuery<Contact> q = this.entityManager.createQuery(c);
		
		if (contactCriteria.getCreationDateMin()!=null ){
			q.setParameter("creationDateMin", contactCriteria.getCreationDateMin());
		}
		if (contactCriteria.getCreationDateMax()!=null ){
			q.setParameter("creationDateMax", contactCriteria.getCreationDateMax());
		}
		if (contactCriteria.getUpdateDateMin()!=null ){
			q.setParameter("updateDateMin", contactCriteria.getUpdateDateMin());
		}
		if (contactCriteria.getUpdateDateMax()!=null ){
			q.setParameter("updateDateMax", contactCriteria.getUpdateDateMax());
		}
		if (contactCriteria.getVersionMin()!=null ){
			q.setParameter("versionMin", contactCriteria.getVersionMin());
		}
		if (contactCriteria.getVersionMax()!=null ){
			q.setParameter("versionMax", contactCriteria.getVersionMax());
		}
		if (contactCriteria.getId()!=null ){
			q.setParameter("id", contactCriteria.getId());
		}
		if (contactCriteria.getName()!=null && !contactCriteria.getName().isEmpty()){
			q.setParameter("name", contactCriteria.getName().replace("*","%").replace("?","_"));
		}
		if (contactCriteria.getPerson()!=null && !contactCriteria.getPerson().isEmpty()){
			q.setParameter("person", contactCriteria.getPerson().replace("*","%").replace("?","_"));
		}
		if (contactCriteria.getAdress1()!=null && !contactCriteria.getAdress1().isEmpty()){
			q.setParameter("adress1", contactCriteria.getAdress1().replace("*","%").replace("?","_"));
		}
		if (contactCriteria.getAddress2()!=null && !contactCriteria.getAddress2().isEmpty()){
			q.setParameter("address2", contactCriteria.getAddress2().replace("*","%").replace("?","_"));
		}
		if (contactCriteria.getZipCode()!=null && !contactCriteria.getZipCode().isEmpty()){
			q.setParameter("zipCode", contactCriteria.getZipCode().replace("*","%").replace("?","_"));
		}
		if (contactCriteria.getCity()!=null && !contactCriteria.getCity().isEmpty()){
			q.setParameter("city", contactCriteria.getCity().replace("*","%").replace("?","_"));
		}
		if (contactCriteria.getEmail()!=null && !contactCriteria.getEmail().isEmpty()){
			q.setParameter("email", contactCriteria.getEmail().replace("*","%").replace("?","_"));
		}
		if (contactCriteria.getPhone()!=null && !contactCriteria.getPhone().isEmpty()){
			q.setParameter("phone", contactCriteria.getPhone().replace("*","%").replace("?","_"));
		}
		if (contactCriteria.getSiret()!=null && !contactCriteria.getSiret().isEmpty()){
			q.setParameter("siret", contactCriteria.getSiret().replace("*","%").replace("?","_"));
		}
		if (contactCriteria.getKind()!=null ){
			q.setParameter("kind", contactCriteria.getKind());
		}
		    
		return new java.util.ArrayList<Contact>(q.getResultList());	
	}

	public Contact findById (Long id) 
	{
		return this.entityManager.find (Contact.class, id);	
	}

	public EntityManager getEntityManager () 
	{
		return this.entityManager;	
	}

	public Contact save (Contact contact) 
	{
		if (contact.getId() != null) {
			return this.entityManager.merge(contact);
		} else {
			this.entityManager.persist(contact);
			return contact;
		}	
	}

	public void setEntityManager (EntityManager myEntityManager) 
	{
		this.entityManager = myEntityManager;	
	}

	public void unsetEntityManager () 
	{
		this.entityManager = null;	
	}


}
