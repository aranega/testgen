package com.dooapp.firea.entity.repositories;

import javax.persistence.TypedQuery;
import com.dooapp.firea.entity.domain.PersistentImageData;
import java.util.List;
import com.dooapp.firea.entity.repositories.criteria.PersistentImageDataCriteria;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Repository(value = "persistentimagedataRepository")
public class JPAPersistentImageDataRepository implements PersistentImageDataRepository
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@PersistenceContext
	private EntityManager entityManager;
    

	public List<PersistentImageData> findAll () 
	{
		final String hql = "select e from PersistentImageData e order by id";
		TypedQuery<PersistentImageData> query =
			this.entityManager.createQuery(hql, PersistentImageData.class);
		return query.getResultList();	
	}

	public List<PersistentImageData> findByCriteria (PersistentImageDataCriteria persistentImageDataCriteria) 
	{
		javax.persistence.criteria.CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		javax.persistence.criteria.CriteriaQuery<PersistentImageData> c = cb.createQuery(PersistentImageData.class);
		javax.persistence.criteria.Root<PersistentImageData> emp = c.from(PersistentImageData.class);
		c.select(emp);
		
		List<javax.persistence.criteria.Predicate> criteria =
		    new java.util.ArrayList<javax.persistence.criteria.Predicate>();
		    
		if (persistentImageDataCriteria.getCreationDateMin()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (persistentImageDataCriteria.getCreationDateMax()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (persistentImageDataCriteria.getUpdateDateMin()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (persistentImageDataCriteria.getUpdateDateMax()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (persistentImageDataCriteria.getVersionMin()!=null )
		{
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (persistentImageDataCriteria.getVersionMax()!=null )
		{
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (persistentImageDataCriteria.getId()!=null )
		{
			javax.persistence.criteria.Expression<Long> p =  emp.get("id");
			javax.persistence.criteria.Expression<Long> val = cb.parameter(Long.class, "id");	
			criteria.add(cb.equal(p,val));
		
		}
		if (persistentImageDataCriteria.getData()!=null && !persistentImageDataCriteria.getData().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("data");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "data");	
			criteria.add(cb.like(p,val));
		
		}
		   
		
		if (criteria.size()==1) {
			c.where(criteria.get(0));
		}else {
			c.where(cb.and(criteria.toArray(new javax.persistence.criteria.Predicate[0])));
		}		 
		javax.persistence.TypedQuery<PersistentImageData> q = this.entityManager.createQuery(c);
		
		if (persistentImageDataCriteria.getCreationDateMin()!=null ){
			q.setParameter("creationDateMin", persistentImageDataCriteria.getCreationDateMin());
		}
		if (persistentImageDataCriteria.getCreationDateMax()!=null ){
			q.setParameter("creationDateMax", persistentImageDataCriteria.getCreationDateMax());
		}
		if (persistentImageDataCriteria.getUpdateDateMin()!=null ){
			q.setParameter("updateDateMin", persistentImageDataCriteria.getUpdateDateMin());
		}
		if (persistentImageDataCriteria.getUpdateDateMax()!=null ){
			q.setParameter("updateDateMax", persistentImageDataCriteria.getUpdateDateMax());
		}
		if (persistentImageDataCriteria.getVersionMin()!=null ){
			q.setParameter("versionMin", persistentImageDataCriteria.getVersionMin());
		}
		if (persistentImageDataCriteria.getVersionMax()!=null ){
			q.setParameter("versionMax", persistentImageDataCriteria.getVersionMax());
		}
		if (persistentImageDataCriteria.getId()!=null ){
			q.setParameter("id", persistentImageDataCriteria.getId());
		}
		if (persistentImageDataCriteria.getData()!=null && !persistentImageDataCriteria.getData().isEmpty()){
			q.setParameter("data", persistentImageDataCriteria.getData().replace("*","%").replace("?","_"));
		}
		    
		return new java.util.ArrayList<PersistentImageData>(q.getResultList());	
	}

	public PersistentImageData findById (Long id) 
	{
		return this.entityManager.find (PersistentImageData.class, id);	
	}

	public EntityManager getEntityManager () 
	{
		return this.entityManager;	
	}

	public PersistentImageData save (PersistentImageData persistentimagedata) 
	{
		if (persistentimagedata.getId() != null) {
			return this.entityManager.merge(persistentimagedata);
		} else {
			this.entityManager.persist(persistentimagedata);
			return persistentimagedata;
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
