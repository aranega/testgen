package com.dooapp.fireaOLD.entity.criteria;

import com.dooapp.fireaOLD.wrapper.criteria.DeviceCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for DeviceCriteria Class
 * End of user code -->
 */

public class DeviceCriteriaInstance implements Bean
{
	
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private Long idMax;
	
	private Long idMin;
	
	private java.util.Date lastCalibrationDateMax;
	
	private java.util.Date lastCalibrationDateMin;
	
	private String serialNumber;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private DeviceCriteria wrapper;

	/*
	 * <!-- Start of user code comment for DeviceCriteria wrapper getter
	 * End of user code -->
	 */
	public DeviceCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new DeviceCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for DeviceCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(DeviceCriteria wrapper) {
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
	 * <!-- Start of user code comment for lastCalibrationDateMax getter
	 * End of user code -->
	 */
	public java.util.Date getLastCalibrationDateMax(){
		return this.lastCalibrationDateMax;
	}
	
	/*
	 * <!-- Start of user code comment for lastCalibrationDateMax setter
	 * End of user code -->
	 */
	public void setLastCalibrationDateMax(java.util.Date arg0){
		this.lastCalibrationDateMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for lastCalibrationDateMin getter
	 * End of user code -->
	 */
	public java.util.Date getLastCalibrationDateMin(){
		return this.lastCalibrationDateMin;
	}
	
	/*
	 * <!-- Start of user code comment for lastCalibrationDateMin setter
	 * End of user code -->
	 */
	public void setLastCalibrationDateMin(java.util.Date arg0){
		this.lastCalibrationDateMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for serialNumber getter
	 * End of user code -->
	 */
	public String getSerialNumber(){
		return this.serialNumber;
	}
	
	/*
	 * <!-- Start of user code comment for serialNumber setter
	 * End of user code -->
	 */
	public void setSerialNumber(String arg0){
		this.serialNumber = arg0;
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
