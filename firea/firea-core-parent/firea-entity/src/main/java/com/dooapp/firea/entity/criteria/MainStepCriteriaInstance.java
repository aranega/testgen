package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.MainStepCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


public class MainStepCriteriaInstance extends StepCriteriaInstance implements Bean
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
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private MainStepCriteria wrapper;

	public MainStepCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new MainStepCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(MainStepCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	public Double getCalculatedELAMax(){
		return this.calculatedELAMax;
	}
	
	public void setCalculatedELAMax(Double arg0){
		this.calculatedELAMax = arg0;
	} 
	public Double getCalculatedELAMin(){
		return this.calculatedELAMin;
	}
	
	public void setCalculatedELAMin(Double arg0){
		this.calculatedELAMin = arg0;
	} 
	public Double getClMax(){
		return this.clMax;
	}
	
	public void setClMax(Double arg0){
		this.clMax = arg0;
	} 
	public Double getClMin(){
		return this.clMin;
	}
	
	public void setClMin(Double arg0){
		this.clMin = arg0;
	} 
	public Double getCorrelationMax(){
		return this.correlationMax;
	}
	
	public void setCorrelationMax(Double arg0){
		this.correlationMax = arg0;
	} 
	public Double getCorrelationMin(){
		return this.correlationMin;
	}
	
	public void setCorrelationMin(Double arg0){
		this.correlationMin = arg0;
	} 
	public String getDirection(){
		return this.direction;
	}
	
	public void setDirection(String arg0){
		this.direction = arg0;
	} 
	public Double getNMax(){
		return this.nMax;
	}
	
	public void setNMax(Double arg0){
		this.nMax = arg0;
	} 
	public Double getNMin(){
		return this.nMin;
	}
	
	public void setNMin(Double arg0){
		this.nMin = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
