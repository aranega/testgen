package com.dooapp.firea.entity.repositories;

import javax.persistence.TypedQuery;
import com.dooapp.firea.entity.repositories.criteria.PersistentImageCriteria;
import com.dooapp.firea.entity.domain.PersistentImage;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Repository(value = "persistentimageRepository")
public class JPAPersistentImageRepository implements PersistentImageRepository
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@PersistenceContext
	private EntityManager entityManager;
    

	public List<PersistentImage> findAll () 
	{
		final String hql = "select e from PersistentImage e order by id";
		TypedQuery<PersistentImage> query =
			this.entityManager.createQuery(hql, PersistentImage.class);
		return query.getResultList();	
	}

	public List<PersistentImage> findByCriteria (PersistentImageCriteria persistentImageCriteria) 
	{
		javax.persistence.criteria.CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		javax.persistence.criteria.CriteriaQuery<PersistentImage> c = cb.createQuery(PersistentImage.class);
		javax.persistence.criteria.Root<PersistentImage> emp = c.from(PersistentImage.class);
		c.select(emp);
		
		List<javax.persistence.criteria.Predicate> criteria =
		    new java.util.ArrayList<javax.persistence.criteria.Predicate>();
		    
		if (persistentImageCriteria.getCreationDateMin()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (persistentImageCriteria.getCreationDateMax()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (persistentImageCriteria.getUpdateDateMin()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (persistentImageCriteria.getUpdateDateMax()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (persistentImageCriteria.getVersionMin()!=null )
		{
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (persistentImageCriteria.getVersionMax()!=null )
		{
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (persistentImageCriteria.getId()!=null )
		{
			javax.persistence.criteria.Expression<Long> p =  emp.get("id");
			javax.persistence.criteria.Expression<Long> val = cb.parameter(Long.class, "id");	
			criteria.add(cb.equal(p,val));
		
		}
		if (persistentImageCriteria.getTitle()!=null && !persistentImageCriteria.getTitle().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("title");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "title");	
			criteria.add(cb.like(p,val));
		
		}
		if (persistentImageCriteria.getSourceFile()!=null && !persistentImageCriteria.getSourceFile().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("sourceFile");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "sourceFile");	
			criteria.add(cb.like(p,val));
		
		}
		if (persistentImageCriteria.getPreview()!=null && !persistentImageCriteria.getPreview().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("preview");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "preview");	
			criteria.add(cb.like(p,val));
		
		}
		{
			javax.persistence.criteria.Expression<Boolean> p =  emp.get("error");
			javax.persistence.criteria.Expression<Boolean> val = cb.parameter(Boolean.class, "error");	
			criteria.add(cb.equal(p,val));
		
		}
		if (persistentImageCriteria.getDataId()!=null && !persistentImageCriteria.getDataId().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("dataId");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "dataId");	
			criteria.add(cb.like(p,val));
		
		}
		   
		
		if (criteria.size()==1) {
			c.where(criteria.get(0));
		}else {
			c.where(cb.and(criteria.toArray(new javax.persistence.criteria.Predicate[0])));
		}		 
		javax.persistence.TypedQuery<PersistentImage> q = this.entityManager.createQuery(c);
		
		if (persistentImageCriteria.getCreationDateMin()!=null ){
			q.setParameter("creationDateMin", persistentImageCriteria.getCreationDateMin());
		}
		if (persistentImageCriteria.getCreationDateMax()!=null ){
			q.setParameter("creationDateMax", persistentImageCriteria.getCreationDateMax());
		}
		if (persistentImageCriteria.getUpdateDateMin()!=null ){
			q.setParameter("updateDateMin", persistentImageCriteria.getUpdateDateMin());
		}
		if (persistentImageCriteria.getUpdateDateMax()!=null ){
			q.setParameter("updateDateMax", persistentImageCriteria.getUpdateDateMax());
		}
		if (persistentImageCriteria.getVersionMin()!=null ){
			q.setParameter("versionMin", persistentImageCriteria.getVersionMin());
		}
		if (persistentImageCriteria.getVersionMax()!=null ){
			q.setParameter("versionMax", persistentImageCriteria.getVersionMax());
		}
		if (persistentImageCriteria.getId()!=null ){
			q.setParameter("id", persistentImageCriteria.getId());
		}
		if (persistentImageCriteria.getTitle()!=null && !persistentImageCriteria.getTitle().isEmpty()){
			q.setParameter("title", persistentImageCriteria.getTitle().replace("*","%").replace("?","_"));
		}
		if (persistentImageCriteria.getSourceFile()!=null && !persistentImageCriteria.getSourceFile().isEmpty()){
			q.setParameter("sourceFile", persistentImageCriteria.getSourceFile().replace("*","%").replace("?","_"));
		}
		if (persistentImageCriteria.getPreview()!=null && !persistentImageCriteria.getPreview().isEmpty()){
			q.setParameter("preview", persistentImageCriteria.getPreview().replace("*","%").replace("?","_"));
		}
		q.setParameter("error", persistentImageCriteria.getError());
		
		if (persistentImageCriteria.getDataId()!=null && !persistentImageCriteria.getDataId().isEmpty()){
			q.setParameter("dataId", persistentImageCriteria.getDataId().replace("*","%").replace("?","_"));
		}
		    
		return new java.util.ArrayList<PersistentImage>(q.getResultList());	
	}

	public PersistentImage findById (Long id) 
	{
		return this.entityManager.find (PersistentImage.class, id);	
	}

	public EntityManager getEntityManager () 
	{
		return this.entityManager;	
	}

	public PersistentImage save (PersistentImage persistentimage) 
	{
		if (persistentimage.getId() != null) {
			return this.entityManager.merge(persistentimage);
		} else {
			this.entityManager.persist(persistentimage);
			return persistentimage;
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
