package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.BlowHoleCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for BlowHoleCriteria Class
 * End of user code -->
 */

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

	/*
	 * <!-- Start of user code comment for BlowHoleCriteria wrapper getter
	 * End of user code -->
	 */
	public BlowHoleCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new BlowHoleCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for BlowHoleCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(BlowHoleCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/*
	 * <!-- Start of user code comment for Discharge getter
	 * End of user code -->
	 */
	public com.dooapp.firea.entity.Discharge getDischarge(){
		return this.Discharge;
	}
	
	/*
	 * <!-- Start of user code comment for Discharge setter
	 * End of user code -->
	 */
	public void setDischarge(com.dooapp.firea.entity.Discharge arg0){
		this.Discharge = arg0;
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
	 * <!-- Start of user code comment for quantityMax getter
	 * End of user code -->
	 */
	public Integer getQuantityMax(){
		return this.quantityMax;
	}
	
	/*
	 * <!-- Start of user code comment for quantityMax setter
	 * End of user code -->
	 */
	public void setQuantityMax(Integer arg0){
		this.quantityMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for quantityMin getter
	 * End of user code -->
	 */
	public Integer getQuantityMin(){
		return this.quantityMin;
	}
	
	/*
	 * <!-- Start of user code comment for quantityMin setter
	 * End of user code -->
	 */
	public void setQuantityMin(Integer arg0){
		this.quantityMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for surfaceMax getter
	 * End of user code -->
	 */
	public Double getSurfaceMax(){
		return this.surfaceMax;
	}
	
	/*
	 * <!-- Start of user code comment for surfaceMax setter
	 * End of user code -->
	 */
	public void setSurfaceMax(Double arg0){
		this.surfaceMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for surfaceMin getter
	 * End of user code -->
	 */
	public Double getSurfaceMin(){
		return this.surfaceMin;
	}
	
	/*
	 * <!-- Start of user code comment for surfaceMin setter
	 * End of user code -->
	 */
	public void setSurfaceMin(Double arg0){
		this.surfaceMin = arg0;
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
