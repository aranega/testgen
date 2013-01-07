package com.dooapp.firea.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.MainStep;
import com.dooapp.lib.common.entity.Bean;

//Start of user code for queries
//End of user code
@javax.persistence.Entity
public class MainStepBean extends StepBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(MainStepBean.class);

	
	private double calculatedELA;
	
	private double cl;
	
	private double correlation;
	
	private String direction;
	
	private double n;

	@javax.persistence.Transient
	private MainStep wrapper;
    	
	
	@javax.persistence.Transient
	@Override
	public MainStep getWrapper() {
		if (wrapper == null) {
			wrapper = new MainStep(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	@javax.persistence.Transient
	public void setWrapper(MainStep wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	
	

	public double getCalculatedELA(){
		return this.calculatedELA;
	}
	
	public void setCalculatedELA(double arg0){
		this.calculatedELA = arg0;
	}
	public double getCl(){
		return this.cl;
	}
	
	public void setCl(double arg0){
		this.cl = arg0;
	}
	public double getCorrelation(){
		return this.correlation;
	}
	
	public void setCorrelation(double arg0){
		this.correlation = arg0;
	}
	public String getDirection(){
		return this.direction;
	}
	
	public void setDirection(String arg0){
		this.direction = arg0;
	}
	public double getN(){
		return this.n;
	}
	
	public void setN(double arg0){
		this.n = arg0;
	}
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
