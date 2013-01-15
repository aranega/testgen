package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.BottleTypeCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for BottleTypeCriteria Class
 * End of user code -->
 */

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

	/*
	 * <!-- Start of user code comment for BottleTypeCriteria wrapper getter
	 * End of user code -->
	 */
	public BottleTypeCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new BottleTypeCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for BottleTypeCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(BottleTypeCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
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
	/*
	 * <!-- Start of user code comment for volumeMax getter
	 * End of user code -->
	 */
	public Double getVolumeMax(){
		return this.volumeMax;
	}
	
	/*
	 * <!-- Start of user code comment for volumeMax setter
	 * End of user code -->
	 */
	public void setVolumeMax(Double arg0){
		this.volumeMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for volumeMin getter
	 * End of user code -->
	 */
	public Double getVolumeMin(){
		return this.volumeMin;
	}
	
	/*
	 * <!-- Start of user code comment for volumeMin setter
	 * End of user code -->
	 */
	public void setVolumeMin(Double arg0){
		this.volumeMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for weightMax getter
	 * End of user code -->
	 */
	public Double getWeightMax(){
		return this.weightMax;
	}
	
	/*
	 * <!-- Start of user code comment for weightMax setter
	 * End of user code -->
	 */
	public void setWeightMax(Double arg0){
		this.weightMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for weightMin getter
	 * End of user code -->
	 */
	public Double getWeightMin(){
		return this.weightMin;
	}
	
	/*
	 * <!-- Start of user code comment for weightMin setter
	 * End of user code -->
	 */
	public void setWeightMin(Double arg0){
		this.weightMin = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
