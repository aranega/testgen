package com.dooapp.firea.entity.repositories;

import javax.persistence.TypedQuery;
import com.dooapp.firea.entity.repositories.criteria.AbstractEntityCriteria;
import java.util.List;
import com.dooapp.firea.entity.domain.AbstractEntity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Repository(value = "abstractentityRepository")
public class JPAAbstractEntityRepository implements AbstractEntityRepository
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@PersistenceContext
	private EntityManager entityManager;
    

	public List<AbstractEntity> findAll () 
	{
		final String hql = "select e from AbstractEntity e order by id";
		TypedQuery<AbstractEntity> query =
			this.entityManager.createQuery(hql, AbstractEntity.class);
		return query.getResultList();	
	}

	public List<AbstractEntity> findByCriteria (AbstractEntityCriteria abstractEntityCriteria) 
	{
		javax.persistence.criteria.CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		javax.persistence.criteria.CriteriaQuery<AbstractEntity> c = cb.createQuery(AbstractEntity.class);
		javax.persistence.criteria.Root<AbstractEntity> emp = c.from(AbstractEntity.class);
		c.select(emp);
		
		List<javax.persistence.criteria.Predicate> criteria =
		    new java.util.ArrayList<javax.persistence.criteria.Predicate>();
		    
		if (abstractEntityCriteria.getCreationDateMin()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (abstractEntityCriteria.getCreationDateMax()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (abstractEntityCriteria.getUpdateDateMin()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (abstractEntityCriteria.getUpdateDateMax()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (abstractEntityCriteria.getVersionMin()!=null )
		{
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (abstractEntityCriteria.getVersionMax()!=null )
		{
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (abstractEntityCriteria.getId()!=null )
		{
			javax.persistence.criteria.Expression<Long> p =  emp.get("id");
			javax.persistence.criteria.Expression<Long> val = cb.parameter(Long.class, "id");	
			criteria.add(cb.equal(p,val));
		
		}
		   
		
		if (criteria.size()==1) {
			c.where(criteria.get(0));
		}else {
			c.where(cb.and(criteria.toArray(new javax.persistence.criteria.Predicate[0])));
		}		 
		javax.persistence.TypedQuery<AbstractEntity> q = this.entityManager.createQuery(c);
		
		if (abstractEntityCriteria.getCreationDateMin()!=null ){
			q.setParameter("creationDateMin", abstractEntityCriteria.getCreationDateMin());
		}
		if (abstractEntityCriteria.getCreationDateMax()!=null ){
			q.setParameter("creationDateMax", abstractEntityCriteria.getCreationDateMax());
		}
		if (abstractEntityCriteria.getUpdateDateMin()!=null ){
			q.setParameter("updateDateMin", abstractEntityCriteria.getUpdateDateMin());
		}
		if (abstractEntityCriteria.getUpdateDateMax()!=null ){
			q.setParameter("updateDateMax", abstractEntityCriteria.getUpdateDateMax());
		}
		if (abstractEntityCriteria.getVersionMin()!=null ){
			q.setParameter("versionMin", abstractEntityCriteria.getVersionMin());
		}
		if (abstractEntityCriteria.getVersionMax()!=null ){
			q.setParameter("versionMax", abstractEntityCriteria.getVersionMax());
		}
		if (abstractEntityCriteria.getId()!=null ){
			q.setParameter("id", abstractEntityCriteria.getId());
		}
		    
		return new java.util.ArrayList<AbstractEntity>(q.getResultList());	
	}

	public AbstractEntity findById (Long id) 
	{
		return this.entityManager.find (AbstractEntity.class, id);	
	}

	public EntityManager getEntityManager () 
	{
		return this.entityManager;	
	}

	public AbstractEntity save (AbstractEntity abstractentity) 
	{
		if (abstractentity.getId() != null) {
			return this.entityManager.merge(abstractentity);
		} else {
			this.entityManager.persist(abstractentity);
			return abstractentity;
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
