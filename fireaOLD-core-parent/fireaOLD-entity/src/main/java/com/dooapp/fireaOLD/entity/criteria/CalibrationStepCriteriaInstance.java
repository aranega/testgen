package com.dooapp.fireaOLD.entity.criteria;

import com.dooapp.fireaOLD.wrapper.criteria.CalibrationStepCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for CalibrationStepCriteria Class
 * End of user code -->
 */

public class CalibrationStepCriteriaInstance extends StepCriteriaInstance implements Bean
{
	
	
	private Double afterHoleELAMax;
	
	private Double afterHoleELAMin;
	
	private Double beforeHoleELAMax;
	
	private Double beforeHoleELAMin;
	
	private Double errorPercentMax;
	
	private Double errorPercentMin;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private CalibrationStepCriteria wrapper;

	/*
	 * <!-- Start of user code comment for CalibrationStepCriteria wrapper getter
	 * End of user code -->
	 */
	public CalibrationStepCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new CalibrationStepCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for CalibrationStepCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(CalibrationStepCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/*
	 * <!-- Start of user code comment for afterHoleELAMax getter
	 * End of user code -->
	 */
	public Double getAfterHoleELAMax(){
		return this.afterHoleELAMax;
	}
	
	/*
	 * <!-- Start of user code comment for afterHoleELAMax setter
	 * End of user code -->
	 */
	public void setAfterHoleELAMax(Double arg0){
		this.afterHoleELAMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for afterHoleELAMin getter
	 * End of user code -->
	 */
	public Double getAfterHoleELAMin(){
		return this.afterHoleELAMin;
	}
	
	/*
	 * <!-- Start of user code comment for afterHoleELAMin setter
	 * End of user code -->
	 */
	public void setAfterHoleELAMin(Double arg0){
		this.afterHoleELAMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for beforeHoleELAMax getter
	 * End of user code -->
	 */
	public Double getBeforeHoleELAMax(){
		return this.beforeHoleELAMax;
	}
	
	/*
	 * <!-- Start of user code comment for beforeHoleELAMax setter
	 * End of user code -->
	 */
	public void setBeforeHoleELAMax(Double arg0){
		this.beforeHoleELAMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for beforeHoleELAMin getter
	 * End of user code -->
	 */
	public Double getBeforeHoleELAMin(){
		return this.beforeHoleELAMin;
	}
	
	/*
	 * <!-- Start of user code comment for beforeHoleELAMin setter
	 * End of user code -->
	 */
	public void setBeforeHoleELAMin(Double arg0){
		this.beforeHoleELAMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for errorPercentMax getter
	 * End of user code -->
	 */
	public Double getErrorPercentMax(){
		return this.errorPercentMax;
	}
	
	/*
	 * <!-- Start of user code comment for errorPercentMax setter
	 * End of user code -->
	 */
	public void setErrorPercentMax(Double arg0){
		this.errorPercentMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for errorPercentMin getter
	 * End of user code -->
	 */
	public Double getErrorPercentMin(){
		return this.errorPercentMin;
	}
	
	/*
	 * <!-- Start of user code comment for errorPercentMin setter
	 * End of user code -->
	 */
	public void setErrorPercentMin(Double arg0){
		this.errorPercentMin = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
