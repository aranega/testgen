package com.dooapp.firea.entity.repositories;

import javax.persistence.TypedQuery;
import com.dooapp.firea.entity.domain.Project;
import com.dooapp.firea.entity.repositories.criteria.ProjectCriteria;
import javax.persistence.EntityManager;
import java.util.List;
import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Repository(value = "projectRepository")
public class JPAProjectRepository implements ProjectRepository
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@PersistenceContext
	private EntityManager entityManager;
    

	public List<Project> findAll () 
	{
		final String hql = "select e from Project e order by id";
		TypedQuery<Project> query =
			this.entityManager.createQuery(hql, Project.class);
		return query.getResultList();	
	}

	public List<Project> findByCriteria (ProjectCriteria projectCriteria) 
	{
		javax.persistence.criteria.CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		javax.persistence.criteria.CriteriaQuery<Project> c = cb.createQuery(Project.class);
		javax.persistence.criteria.Root<Project> emp = c.from(Project.class);
		c.select(emp);
		
		List<javax.persistence.criteria.Predicate> criteria =
		    new java.util.ArrayList<javax.persistence.criteria.Predicate>();
		    
		if (projectCriteria.getCreationDateMin()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (projectCriteria.getCreationDateMax()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("creationDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "creationDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (projectCriteria.getUpdateDateMin()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (projectCriteria.getUpdateDateMax()!=null )
		{
			javax.persistence.criteria.Expression<java.util.Date> p =  emp.get("updateDate");
			javax.persistence.criteria.Expression<java.util.Date> val = cb.parameter(java.util.Date.class, "updateDateMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (projectCriteria.getVersionMin()!=null )
		{
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMin");	
			criteria.add(cb.greaterThanOrEqualTo(p,val));
		
		}
		if (projectCriteria.getVersionMax()!=null )
		{
			javax.persistence.criteria.Expression<Integer> p =  emp.get("version");
			javax.persistence.criteria.Expression<Integer> val = cb.parameter(Integer.class, "versionMax");	
			criteria.add(cb.lessThanOrEqualTo(p,val));
		
		}
		if (projectCriteria.getId()!=null )
		{
			javax.persistence.criteria.Expression<Long> p =  emp.get("id");
			javax.persistence.criteria.Expression<Long> val = cb.parameter(Long.class, "id");	
			criteria.add(cb.equal(p,val));
		
		}
		if (projectCriteria.getName()!=null && !projectCriteria.getName().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("name");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "name");	
			criteria.add(cb.like(p,val));
		
		}
		if (projectCriteria.getDescription()!=null && !projectCriteria.getDescription().isEmpty())
		{
			javax.persistence.criteria.Expression<String> p =  emp.get("description");
			javax.persistence.criteria.Expression<String> val = cb.parameter(String.class, "description");	
			criteria.add(cb.like(p,val));
		
		}
		if (projectCriteria.getKind()!=null )
		{
			javax.persistence.criteria.Expression<com.dooapp.firea.entity.domain.ProjectKind> p =  emp.get("kind");
			javax.persistence.criteria.Expression<com.dooapp.firea.entity.domain.ProjectKind> val = cb.parameter(com.dooapp.firea.entity.domain.ProjectKind.class, "kind");	
			criteria.add(cb.equal(p,val));
		
		}
		   
		
		if (criteria.size()==1) {
			c.where(criteria.get(0));
		}else {
			c.where(cb.and(criteria.toArray(new javax.persistence.criteria.Predicate[0])));
		}		 
		javax.persistence.TypedQuery<Project> q = this.entityManager.createQuery(c);
		
		if (projectCriteria.getCreationDateMin()!=null ){
			q.setParameter("creationDateMin", projectCriteria.getCreationDateMin());
		}
		if (projectCriteria.getCreationDateMax()!=null ){
			q.setParameter("creationDateMax", projectCriteria.getCreationDateMax());
		}
		if (projectCriteria.getUpdateDateMin()!=null ){
			q.setParameter("updateDateMin", projectCriteria.getUpdateDateMin());
		}
		if (projectCriteria.getUpdateDateMax()!=null ){
			q.setParameter("updateDateMax", projectCriteria.getUpdateDateMax());
		}
		if (projectCriteria.getVersionMin()!=null ){
			q.setParameter("versionMin", projectCriteria.getVersionMin());
		}
		if (projectCriteria.getVersionMax()!=null ){
			q.setParameter("versionMax", projectCriteria.getVersionMax());
		}
		if (projectCriteria.getId()!=null ){
			q.setParameter("id", projectCriteria.getId());
		}
		if (projectCriteria.getName()!=null && !projectCriteria.getName().isEmpty()){
			q.setParameter("name", projectCriteria.getName().replace("*","%").replace("?","_"));
		}
		if (projectCriteria.getDescription()!=null && !projectCriteria.getDescription().isEmpty()){
			q.setParameter("description", projectCriteria.getDescription().replace("*","%").replace("?","_"));
		}
		if (projectCriteria.getKind()!=null ){
			q.setParameter("kind", projectCriteria.getKind());
		}
		    
		return new java.util.ArrayList<Project>(q.getResultList());	
	}

	public Project findById (Long id) 
	{
		return this.entityManager.find (Project.class, id);	
	}

	public EntityManager getEntityManager () 
	{
		return this.entityManager;	
	}

	public Project save (Project project) 
	{
		if (project.getId() != null) {
			return this.entityManager.merge(project);
		} else {
			this.entityManager.persist(project);
			return project;
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
