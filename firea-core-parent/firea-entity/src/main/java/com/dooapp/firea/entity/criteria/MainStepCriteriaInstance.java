package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.MainStepCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code


import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for MainStepCriteria Class
 * End of user code -->
 */

public class MainStepCriteriaInstance
// Start of user code bloc for inheritance
 extends StepCriteriaInstance
// End of user code
// Start of user code bloc for interface
 implements Bean
// End of user code
{
	
	
	private Double calculatedELAMax;
	
	private Double calculatedELAMin;
	
	private Double clMax;
	
	private Double clMin;
	
	private Double correlationMax;
	
	private Double correlationMin;
	
	private String direction;
	
	private Double nMax;
	
	private Double nMin;
	// Start of user code for attributes
	// Other attributes
	// End of user code

	private MainStepCriteria wrapper;

	/*
	 * <!-- Start of user code comment for MainStepCriteria wrapper getter
	 * End of user code -->
	 */
	public MainStepCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new MainStepCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for MainStepCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(MainStepCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/*
	 * <!-- Start of user code comment for calculatedELAMax getter
	 * End of user code -->
	 */
	public Double getCalculatedELAMax(){
		return this.calculatedELAMax;
	}
	
	/*
	 * <!-- Start of user code comment for calculatedELAMax setter
	 * End of user code -->
	 */
	public void setCalculatedELAMax(Double arg0){
		this.calculatedELAMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for calculatedELAMin getter
	 * End of user code -->
	 */
	public Double getCalculatedELAMin(){
		return this.calculatedELAMin;
	}
	
	/*
	 * <!-- Start of user code comment for calculatedELAMin setter
	 * End of user code -->
	 */
	public void setCalculatedELAMin(Double arg0){
		this.calculatedELAMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for clMax getter
	 * End of user code -->
	 */
	public Double getClMax(){
		return this.clMax;
	}
	
	/*
	 * <!-- Start of user code comment for clMax setter
	 * End of user code -->
	 */
	public void setClMax(Double arg0){
		this.clMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for clMin getter
	 * End of user code -->
	 */
	public Double getClMin(){
		return this.clMin;
	}
	
	/*
	 * <!-- Start of user code comment for clMin setter
	 * End of user code -->
	 */
	public void setClMin(Double arg0){
		this.clMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for correlationMax getter
	 * End of user code -->
	 */
	public Double getCorrelationMax(){
		return this.correlationMax;
	}
	
	/*
	 * <!-- Start of user code comment for correlationMax setter
	 * End of user code -->
	 */
	public void setCorrelationMax(Double arg0){
		this.correlationMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for correlationMin getter
	 * End of user code -->
	 */
	public Double getCorrelationMin(){
		return this.correlationMin;
	}
	
	/*
	 * <!-- Start of user code comment for correlationMin setter
	 * End of user code -->
	 */
	public void setCorrelationMin(Double arg0){
		this.correlationMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for direction getter
	 * End of user code -->
	 */
	public String getDirection(){
		return this.direction;
	}
	
	/*
	 * <!-- Start of user code comment for direction setter
	 * End of user code -->
	 */
	public void setDirection(String arg0){
		this.direction = arg0;
	} 
	/*
	 * <!-- Start of user code comment for nMax getter
	 * End of user code -->
	 */
	public Double getNMax(){
		return this.nMax;
	}
	
	/*
	 * <!-- Start of user code comment for nMax setter
	 * End of user code -->
	 */
	public void setNMax(Double arg0){
		this.nMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for nMin getter
	 * End of user code -->
	 */
	public Double getNMin(){
		return this.nMin;
	}
	
	/*
	 * <!-- Start of user code comment for nMin setter
	 * End of user code -->
	 */
	public void setNMin(Double arg0){
		this.nMin = arg0;
	} 


	// Start of user code for methods
	// Other methods
	// End of user code

}
