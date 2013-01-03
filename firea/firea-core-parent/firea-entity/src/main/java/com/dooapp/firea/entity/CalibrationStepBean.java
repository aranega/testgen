package com.dooapp.firea.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.CalibrationStep;
import com.dooapp.lib.common.entity.Bean;

//Start of user code for queries
//End of user code
@javax.persistence.Entity
public class CalibrationStepBean extends StepBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(CalibrationStepBean.class);

	
	private double afterHoleELA;
	
	private double beforeHoleELA;
	
	private double errorPercent;

	@javax.persistence.Transient
	private CalibrationStep wrapper;
    	
	
	@javax.persistence.Transient
	@Override
	public CalibrationStep getWrapper() {
		if (wrapper == null) {
			wrapper = new CalibrationStep(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	@javax.persistence.Transient
	public void setWrapper(CalibrationStep wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	
	

	public double getAfterHoleELA(){
		return this.afterHoleELA;
	}
	
	public void setAfterHoleELA(double arg0){
		this.afterHoleELA = arg0;
	}
	public double getBeforeHoleELA(){
		return this.beforeHoleELA;
	}
	
	public void setBeforeHoleELA(double arg0){
		this.beforeHoleELA = arg0;
	}
	public double getErrorPercent(){
		return this.errorPercent;
	}
	
	public void setErrorPercent(double arg0){
		this.errorPercent = arg0;
	}
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
