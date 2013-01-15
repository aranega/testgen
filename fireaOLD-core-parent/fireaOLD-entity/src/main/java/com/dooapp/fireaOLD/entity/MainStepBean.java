package com.dooapp.fireaOLD.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.fireaOLD.wrapper.MainStep;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for MainStep Class
 * End of user code -->
 */
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
    	
	
	/*
	 * <!-- Start of user code comment for MainStep wrapper getter
	 * End of user code -->
	 */
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
	
	/*
	 * <!-- Start of user code comment for MainStep wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(MainStep wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	
	

	/*
	 * <!-- Start of user code comment for calculatedELA getter
	 * End of user code -->
	 */
	public double getCalculatedELA(){
		return this.calculatedELA;
	}
	
	/*
	 * <!-- Start of user code comment for calculatedELA setter
	 * End of user code -->
	 */
	public void setCalculatedELA(double arg0){
		this.calculatedELA = arg0;
	}
	/*
	 * <!-- Start of user code comment for cl getter
	 * End of user code -->
	 */
	public double getCl(){
		return this.cl;
	}
	
	/*
	 * <!-- Start of user code comment for cl setter
	 * End of user code -->
	 */
	public void setCl(double arg0){
		this.cl = arg0;
	}
	/*
	 * <!-- Start of user code comment for correlation getter
	 * End of user code -->
	 */
	public double getCorrelation(){
		return this.correlation;
	}
	
	/*
	 * <!-- Start of user code comment for correlation setter
	 * End of user code -->
	 */
	public void setCorrelation(double arg0){
		this.correlation = arg0;
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
	 * <!-- Start of user code comment for n getter
	 * End of user code -->
	 */
	public double getN(){
		return this.n;
	}
	
	/*
	 * <!-- Start of user code comment for n setter
	 * End of user code -->
	 */
	public void setN(double arg0){
		this.n = arg0;
	}
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
