package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.BlowHoleCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


public class BlowHoleCriteriaInstance implements Bean
{
	
	
	private com.dooapp.firea.entity.Discharge Discharge;
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Long idMax;
	
	private Long idMin;
	
	private Integer quantityMax;
	
	private Integer quantityMin;
	
	private Double surfaceMax;
	
	private Double surfaceMin;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private BlowHoleCriteria wrapper;

	public BlowHoleCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new BlowHoleCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(BlowHoleCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	public com.dooapp.firea.entity.Discharge getDischarge(){
		return this.Discharge;
	}
	
	public void setDischarge(com.dooapp.firea.entity.Discharge arg0){
		this.Discharge = arg0;
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
	public Double getSurfaceMax(){
		return this.surfaceMax;
	}
	
	public void setSurfaceMax(Double arg0){
		this.surfaceMax = arg0;
	} 
	public Double getSurfaceMin(){
		return this.surfaceMin;
	}
	
	public void setSurfaceMin(Double arg0){
		this.surfaceMin = arg0;
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
