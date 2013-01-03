package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.BottleConfigurationCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


public class BottleConfigurationCriteriaInstance implements Bean
{
	
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Long idMax;
	
	private Long idMin;
	
	private Double loadMax;
	
	private Double loadMin;
	
	private Integer quantityMax;
	
	private Integer quantityMin;
	
	private com.dooapp.firea.entity.BottleUnit unit;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private BottleConfigurationCriteria wrapper;

	public BottleConfigurationCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new BottleConfigurationCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(BottleConfigurationCriteria wrapper) {
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
	public Double getLoadMax(){
		return this.loadMax;
	}
	
	public void setLoadMax(Double arg0){
		this.loadMax = arg0;
	} 
	public Double getLoadMin(){
		return this.loadMin;
	}
	
	public void setLoadMin(Double arg0){
		this.loadMin = arg0;
	} 
	public Integer getQuantityMax(){
		return this.quantityMax;
	}
	
	public void setQuantityMax(Integer arg0){
		this.quantityMax = arg0;
	} 
	public Integer getQuantityMin(){
		return this.quantityMin;
	}
	
	public void setQuantityMin(Integer arg0){
		this.quantityMin = arg0;
	} 
	public com.dooapp.firea.entity.BottleUnit getUnit(){
		return this.unit;
	}
	
	public void setUnit(com.dooapp.firea.entity.BottleUnit arg0){
		this.unit = arg0;
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
