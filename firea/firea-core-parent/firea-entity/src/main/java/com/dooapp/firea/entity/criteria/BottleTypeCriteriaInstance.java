package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.BottleTypeCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


public class BottleTypeCriteriaInstance implements Bean
{
	
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Long idMax;
	
	private Long idMin;
	
	private String name;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	
	private Double volumeMax;
	
	private Double volumeMin;
	
	private Double weightMax;
	
	private Double weightMin;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private BottleTypeCriteria wrapper;

	public BottleTypeCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new BottleTypeCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(BottleTypeCriteria wrapper) {
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
	public Double getVolumeMax(){
		return this.volumeMax;
	}
	
	public void setVolumeMax(Double arg0){
		this.volumeMax = arg0;
	} 
	public Double getVolumeMin(){
		return this.volumeMin;
	}
	
	public void setVolumeMin(Double arg0){
		this.volumeMin = arg0;
	} 
	public Double getWeightMax(){
		return this.weightMax;
	}
	
	public void setWeightMax(Double arg0){
		this.weightMax = arg0;
	} 
	public Double getWeightMin(){
		return this.weightMin;
	}
	
	public void setWeightMin(Double arg0){
		this.weightMin = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
