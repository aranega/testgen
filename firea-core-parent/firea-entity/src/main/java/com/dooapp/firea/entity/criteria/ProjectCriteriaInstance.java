package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.ProjectCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for ProjectCriteria Class
 * End of user code -->
 */

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

	/*
	 * <!-- Start of user code comment for ProjectCriteria wrapper getter
	 * End of user code -->
	 */
	public ProjectCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new ProjectCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for ProjectCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(ProjectCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/*
	 * <!-- Start of user code comment for Status getter
	 * End of user code -->
	 */
	public com.dooapp.firea.entity.ProjectKind getStatus(){
		return this.Status;
	}
	
	/*
	 * <!-- Start of user code comment for Status setter
	 * End of user code -->
	 */
	public void setStatus(com.dooapp.firea.entity.ProjectKind arg0){
		this.Status = arg0;
	} 
	/*
	 * <!-- Start of user code comment for creationDateMax getter
	 * End of user code -->
	 */
	public java.util.Date getCreationDateMax(){
		return this.creationDateMax;
	}
	
	/*
	 * <!-- Start of user code comment for creationDateMax setter
	 * End of user code -->
	 */
	public void setCreationDateMax(java.util.Date arg0){
		this.creationDateMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for creationDateMin getter
	 * End of user code -->
	 */
	public java.util.Date getCreationDateMin(){
		return this.creationDateMin;
	}
	
	/*
	 * <!-- Start of user code comment for creationDateMin setter
	 * End of user code -->
	 */
	public void setCreationDateMin(java.util.Date arg0){
		this.creationDateMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for description getter
	 * End of user code -->
	 */
	public String getDescription(){
		return this.description;
	}
	
	/*
	 * <!-- Start of user code comment for description setter
	 * End of user code -->
	 */
	public void setDescription(String arg0){
		this.description = arg0;
	} 
	/*
	 * <!-- Start of user code comment for idMax getter
	 * End of user code -->
	 */
	public Long getIdMax(){
		return this.idMax;
	}
	
	/*
	 * <!-- Start of user code comment for idMax setter
	 * End of user code -->
	 */
	public void setIdMax(Long arg0){
		this.idMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for idMin getter
	 * End of user code -->
	 */
	public Long getIdMin(){
		return this.idMin;
	}
	
	/*
	 * <!-- Start of user code comment for idMin setter
	 * End of user code -->
	 */
	public void setIdMin(Long arg0){
		this.idMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for kind getter
	 * End of user code -->
	 */
	public com.dooapp.firea.entity.ProjectKind getKind(){
		return this.kind;
	}
	
	/*
	 * <!-- Start of user code comment for kind setter
	 * End of user code -->
	 */
	public void setKind(com.dooapp.firea.entity.ProjectKind arg0){
		this.kind = arg0;
	} 
	/*
	 * <!-- Start of user code comment for name getter
	 * End of user code -->
	 */
	public String getName(){
		return this.name;
	}
	
	/*
	 * <!-- Start of user code comment for name setter
	 * End of user code -->
	 */
	public void setName(String arg0){
		this.name = arg0;
	} 
	/*
	 * <!-- Start of user code comment for updateDateMax getter
	 * End of user code -->
	 */
	public java.util.Date getUpdateDateMax(){
		return this.updateDateMax;
	}
	
	/*
	 * <!-- Start of user code comment for updateDateMax setter
	 * End of user code -->
	 */
	public void setUpdateDateMax(java.util.Date arg0){
		this.updateDateMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for updateDateMin getter
	 * End of user code -->
	 */
	public java.util.Date getUpdateDateMin(){
		return this.updateDateMin;
	}
	
	/*
	 * <!-- Start of user code comment for updateDateMin setter
	 * End of user code -->
	 */
	public void setUpdateDateMin(java.util.Date arg0){
		this.updateDateMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for version getter
	 * End of user code -->
	 */
	public Integer getVersion(){
		return this.version;
	}
	
	/*
	 * <!-- Start of user code comment for version setter
	 * End of user code -->
	 */
	public void setVersion(Integer arg0){
		this.version = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
