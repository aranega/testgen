package com.dooapp.firea.entity.repositories;

import javax.persistence.TypedQuery;
import com.dooapp.firea.entity.domain.Folder;
import java.util.List;
import javax.persistence.EntityManager;
import com.dooapp.firea.entity.repositories.criteria.FolderCriteria;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Repository(value = "folderRepository")
public class JPAFolderRepository implements FolderRepository
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@PersistenceContext
	private EntityManager entityManager;
    

	public List<Folder> findAll () 
	{
		final String hql = "select e from Folder e order by id";
		TypedQuery<Folder> query =
			this.entityManager.createQuery(hql, Folder.class);
		return query.getResultList();	
	}

	public List<Folder> findByCriteria (FolderCriteria folderCriteria) 
	{
		javax.persistence.criteria.CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		javax.persistence.criteria.CriteriaQuery<Folder> c = cb.createQuery(Folder.class);
		javax.persistence.criteria.Root<Folder> emp = c.from(Folder.class);
		c.select(emp);
		
		List<javax.persistence.criteria.Predicate> criteria =
		    new java.util.ArrayList<javax.persistence.criteria.Predicate>();
		    
		if (folderCriteria.getCreationDateMin()!=null ){
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (folderCriteria.getCreationDateMax()!=null ){
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (folderCriteria.getUpdateDateMin()!=null ){
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (folderCriteria.getUpdateDateMax()!=null ){
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (folderCriteria.getVersionMin()!=null ){
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (folderCriteria.getVersionMax()!=null ){
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (folderCriteria.getId()!=null ){
			javax.persistence.criteria.Expression<Long> p =  emp.get("id");
			javax.persistence.criteria.Expression<Long> val = cb.parameter(Long.class, "id");	
			criteria.add(cb.equal(p,val));
		
		}
		if (folderCriteria.getName()!=null && !folderCriteria.getName().isEmpty()){
			javax.persistence.criteria.Expression<String> p =  emp.get("name");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "name");	
			criteria.add(cb.like(p,val));
		
		}
		if (folderCriteria.getDisplayOrderMin()!=null ){
			javax.persistence.criteria.Expression<Integer> p =  emp.get("displayOrder");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "displayOrderMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (folderCriteria.getDisplayOrderMax()!=null ){
			javax.persistence.criteria.Expression<Integer> p =  emp.get("displayOrder");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "displayOrderMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		   
		
		if (criteria.size()==1) {
			c.where(criteria.get(0));
		}else {
			c.where(cb.and(criteria.toArray(new javax.persistence.criteria.Predicate[0])));
		}		 
		javax.persistence.TypedQuery<Folder> q = this.entityManager.createQuery(c);
		
		if (folderCriteria.getCreationDateMin()!=null ){
			q.setParameter("creationDateMin", folderCriteria.getCreationDateMin());
		}
		if (folderCriteria.getCreationDateMax()!=null ){
			q.setParameter("creationDateMax", folderCriteria.getCreationDateMax());
		}
		if (folderCriteria.getUpdateDateMin()!=null ){
			q.setParameter("updateDateMin", folderCriteria.getUpdateDateMin());
		}
		if (folderCriteria.getUpdateDateMax()!=null ){
			q.setParameter("updateDateMax", folderCriteria.getUpdateDateMax());
		}
		if (folderCriteria.getVersionMin()!=null ){
			q.setParameter("versionMin", folderCriteria.getVersionMin());
		}
		if (folderCriteria.getVersionMax()!=null ){
			q.setParameter("versionMax", folderCriteria.getVersionMax());
		}
		if (folderCriteria.getId()!=null ){
			q.setParameter("id", folderCriteria.getId());
		}
		if (folderCriteria.getName()!=null && !folderCriteria.getName().isEmpty()){
			q.setParameter("name", folderCriteria.getName().replace("*","%").replace("?","_"));
		}
		if (folderCriteria.getDisplayOrderMin()!=null ){
			q.setParameter("displayOrderMin", folderCriteria.getDisplayOrderMin());
		}
		if (folderCriteria.getDisplayOrderMax()!=null ){
			q.setParameter("displayOrderMax", folderCriteria.getDisplayOrderMax());
		}
		    
		return new java.util.ArrayList<Folder>(q.getResultList());	
	}

	public Folder findById (Long id) 
	{
		return this.entityManager.find (Folder.class, id);	
	}

	public EntityManager getEntityManager () 
	{
		return this.entityManager;	
	}

	public Folder save (Folder folder) 
	{
		if (folder.getId() != null) {
			return this.entityManager.merge(folder);
		} else {
			this.entityManager.persist(folder);
			return folder;
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
