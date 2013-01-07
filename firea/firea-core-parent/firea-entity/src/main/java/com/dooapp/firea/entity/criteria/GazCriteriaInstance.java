package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.GazCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


public class GazCriteriaInstance implements Bean
{
	
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Double densityMax;
	
	private Double densityMin;
	
	private Long idMax;
	
	private Long idMin;
	
	private String name;
	
	private String type;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	
	private com.dooapp.firea.entity.GazWeight weight;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private GazCriteria wrapper;

	public GazCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new GazCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(GazCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
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
	public Double getDensityMax(){
		return this.densityMax;
	}
	
	public void setDensityMax(Double arg0){
		this.densityMax = arg0;
	} 
	public Double getDensityMin(){
		return this.densityMin;
	}
	
	public void setDensityMin(Double arg0){
		this.densityMin = arg0;
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
	public String getName(){
		return this.name;
	}
	
	public void setName(String arg0){
		this.name = arg0;
	} 
	public String getType(){
		return this.type;
	}
	
	public void setType(String arg0){
		this.type = arg0;
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
	public com.dooapp.firea.entity.GazWeight getWeight(){
		return this.weight;
	}
	
	public void setWeight(com.dooapp.firea.entity.GazWeight arg0){
		this.weight = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
