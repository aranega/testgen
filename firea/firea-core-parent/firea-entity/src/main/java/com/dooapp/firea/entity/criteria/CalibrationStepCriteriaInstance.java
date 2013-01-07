package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.CalibrationStepCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


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

	public CalibrationStepCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new CalibrationStepCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(CalibrationStepCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	public Double getAfterHoleELAMax(){
		return this.afterHoleELAMax;
	}
	
	public void setAfterHoleELAMax(Double arg0){
		this.afterHoleELAMax = arg0;
	} 
	public Double getAfterHoleELAMin(){
		return this.afterHoleELAMin;
	}
	
	public void setAfterHoleELAMin(Double arg0){
		this.afterHoleELAMin = arg0;
	} 
	public Double getBeforeHoleELAMax(){
		return this.beforeHoleELAMax;
	}
	
	public void setBeforeHoleELAMax(Double arg0){
		this.beforeHoleELAMax = arg0;
	} 
	public Double getBeforeHoleELAMin(){
		return this.beforeHoleELAMin;
	}
	
	public void setBeforeHoleELAMin(Double arg0){
		this.beforeHoleELAMin = arg0;
	} 
	public Double getErrorPercentMax(){
		return this.errorPercentMax;
	}
	
	public void setErrorPercentMax(Double arg0){
		this.errorPercentMax = arg0;
	} 
	public Double getErrorPercentMin(){
		return this.errorPercentMin;
	}
	
	public void setErrorPercentMin(Double arg0){
		this.errorPercentMin = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
