package com.dooapp.firea.entity.repositories;

import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;
import com.dooapp.firea.entity.repositories.criteria.RisqueCriteria;
import java.util.List;
import com.dooapp.firea.entity.domain.Risque;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Repository(value = "risqueRepository")
public class JPARisqueRepository implements RisqueRepository
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@PersistenceContext
	private EntityManager entityManager;
    

	public List<Risque> findAll () 
	{
		final String hql = "select e from Risque e order by id";
		TypedQuery<Risque> query =
			this.entityManager.createQuery(hql, Risque.class);
		return query.getResultList();	
	}

	public List<Risque> findByCriteria (RisqueCriteria risqueCriteria) 
	{
		javax.persistence.criteria.CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		javax.persistence.criteria.CriteriaQuery<Risque> c = cb.createQuery(Risque.class);
		javax.persistence.criteria.Root<Risque> emp = c.from(Risque.class);
		c.select(emp);
		
		List<javax.persistence.criteria.Predicate> criteria =
		    new java.util.ArrayList<javax.persistence.criteria.Predicate>();
		    
		if (risqueCriteria.getCreationDateMin()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (risqueCriteria.getCreationDateMax()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (risqueCriteria.getUpdateDateMin()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (risqueCriteria.getUpdateDateMax()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (risqueCriteria.getVersionMin()!=null )
		{
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (risqueCriteria.getVersionMax()!=null )
		{
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (risqueCriteria.getId()!=null )
		{
			javax.persistence.criteria.Expression<Long> p =  emp.get("id");
			javax.persistence.criteria.Expression<Long> val = cb.parameter(Long.class, "id");	
			criteria.add(cb.equal(p,val));
		
		}
		if (risqueCriteria.getKey()!=null && !risqueCriteria.getKey().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("key");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "key");	
			criteria.add(cb.like(p,val));
		
		}
		   
		
		if (criteria.size()==1) {
			c.where(criteria.get(0));
		}else {
			c.where(cb.and(criteria.toArray(new javax.persistence.criteria.Predicate[0])));
		}		 
		javax.persistence.TypedQuery<Risque> q = this.entityManager.createQuery(c);
		
		if (risqueCriteria.getCreationDateMin()!=null ){
			q.setParameter("creationDateMin", risqueCriteria.getCreationDateMin());
		}
		if (risqueCriteria.getCreationDateMax()!=null ){
			q.setParameter("creationDateMax", risqueCriteria.getCreationDateMax());
		}
		if (risqueCriteria.getUpdateDateMin()!=null ){
			q.setParameter("updateDateMin", risqueCriteria.getUpdateDateMin());
		}
		if (risqueCriteria.getUpdateDateMax()!=null ){
			q.setParameter("updateDateMax", risqueCriteria.getUpdateDateMax());
		}
		if (risqueCriteria.getVersionMin()!=null ){
			q.setParameter("versionMin", risqueCriteria.getVersionMin());
		}
		if (risqueCriteria.getVersionMax()!=null ){
			q.setParameter("versionMax", risqueCriteria.getVersionMax());
		}
		if (risqueCriteria.getId()!=null ){
			q.setParameter("id", risqueCriteria.getId());
		}
		if (risqueCriteria.getKey()!=null && !risqueCriteria.getKey().isEmpty()){
			q.setParameter("key", risqueCriteria.getKey().replace("*","%").replace("?","_"));
		}
		    
		return new java.util.ArrayList<Risque>(q.getResultList());	
	}

	public Risque findById (Long id) 
	{
		return this.entityManager.find (Risque.class, id);	
	}

	public EntityManager getEntityManager () 
	{
		return this.entityManager;	
	}

	public Risque save (Risque risque) 
	{
		if (risque.getId() != null) {
			return this.entityManager.merge(risque);
		} else {
			this.entityManager.persist(risque);
			return risque;
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
