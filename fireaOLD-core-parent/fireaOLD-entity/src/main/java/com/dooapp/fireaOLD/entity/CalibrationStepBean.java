package com.dooapp.fireaOLD.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.fireaOLD.wrapper.CalibrationStep;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for CalibrationStep Class
 * End of user code -->
 */
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
    	
	
	/*
	 * <!-- Start of user code comment for CalibrationStep wrapper getter
	 * End of user code -->
	 */
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
	
	/*
	 * <!-- Start of user code comment for CalibrationStep wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(CalibrationStep wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	
	

	/*
	 * <!-- Start of user code comment for afterHoleELA getter
	 * End of user code -->
	 */
	public double getAfterHoleELA(){
		return this.afterHoleELA;
	}
	
	/*
	 * <!-- Start of user code comment for afterHoleELA setter
	 * End of user code -->
	 */
	public void setAfterHoleELA(double arg0){
		this.afterHoleELA = arg0;
	}
	/*
	 * <!-- Start of user code comment for beforeHoleELA getter
	 * End of user code -->
	 */
	public double getBeforeHoleELA(){
		return this.beforeHoleELA;
	}
	
	/*
	 * <!-- Start of user code comment for beforeHoleELA setter
	 * End of user code -->
	 */
	public void setBeforeHoleELA(double arg0){
		this.beforeHoleELA = arg0;
	}
	/*
	 * <!-- Start of user code comment for errorPercent getter
	 * End of user code -->
	 */
	public double getErrorPercent(){
		return this.errorPercent;
	}
	
	/*
	 * <!-- Start of user code comment for errorPercent setter
	 * End of user code -->
	 */
	public void setErrorPercent(double arg0){
		this.errorPercent = arg0;
	}
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
