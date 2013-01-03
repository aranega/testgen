package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.ProjectCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


public class ProjectCriteriaInstance implements Bean
{
	
	
	private com.dooapp.firea.entity.ProjectKind Status;
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private String description;
	
	private Long idMax;
	
	private Long idMin;
	
	private com.dooapp.firea.entity.ProjectKind kind;
	
	private String name;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private ProjectCriteria wrapper;

	public ProjectCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new ProjectCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(ProjectCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	public com.dooapp.firea.entity.ProjectKind getStatus(){
		return this.Status;
	}
	
	public void setStatus(com.dooapp.firea.entity.ProjectKind arg0){
		this.Status = arg0;
	} 
	public java.util.Date getCreationDateMax(){
		return this.creationDateMax;
	}
	
	public void setCreationDateMax(java.util.Date arg0){
		this.creationDateMax = arg0;
	} 
	public java.util.Date getCreationDateMin(){
		return this.creationDateMin;
	}
	
	public void setCreationDateMin(java.util.Date arg0){
		this.creationDateMin = arg0;
	} 
	public String getDescription(){
		return this.description;
	}
	
	public void setDescription(String arg0){
		this.description = arg0;
	} 
	public Long getIdMax(){
		return this.idMax;
	}
	
	public void setIdMax(Long arg0){
		this.idMax = arg0;
	} 
	public Long getIdMin(){
		return this.idMin;
	}
	
	public void setIdMin(Long arg0){
		this.idMin = arg0;
	} 
	public com.dooapp.firea.entity.ProjectKind getKind(){
		return this.kind;
	}
	
	public void setKind(com.dooapp.firea.entity.ProjectKind arg0){
		this.kind = arg0;
	} 
	public String getName(){
		return this.name;
	}
	
	public void setName(String arg0){
		this.name = arg0;
	} 
	public java.util.Date getUpdateDateMax(){
		return this.updateDateMax;
	}
	
	public void setUpdateDateMax(java.util.Date arg0){
		this.updateDateMax = arg0;
	} 
	public java.util.Date getUpdateDateMin(){
		return this.updateDateMin;
	}
	
	public void setUpdateDateMin(java.util.Date arg0){
		this.updateDateMin = arg0;
	} 
	public Integer getVersion(){
		return this.version;
	}
	
	public void setVersion(Integer arg0){
		this.version = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}