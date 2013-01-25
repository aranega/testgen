package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.MainStep;

//Start of user code for imports
// TODO: import me!
//End of user code




/*
 * Class
 * <!-- Start of user code comment for MainStep Builder
 * End of user code -->
 */

public class MainStepBuilder<BUILDER extends MainStepBuilder<?>>
// Start of user code bloc for inerithance
 extends StepBuilder<BUILDER>
// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private Double calculatedELA;
	
	private Double cl;
	
	private Double correlation;
	
	private String direction;
	
	private Double n;
	
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for MainStep getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected MainStepBuilder() {
	}
	
	protected MainStep createValue() {
		return new MainStep();
	}
	
	/*
	 * <!-- Start of user code comment for MainStep build method
	 * End of user code -->
	 */
	public MainStep build() throws NullPointerException {
		MainStep result =  (MainStep) super.build();
		if (calculatedELA == null) {
			handleDefaultCalculatedELA(result);
		} else {
			result.setCalculatedELA(calculatedELA);
		}
		if (cl == null) {
			handleDefaultCl(result);
		} else {
			result.setCl(cl);
		}
		if (correlation == null) {
			handleDefaultCorrelation(result);
		} else {
			result.setCorrelation(correlation);
		}
		if (direction == null) {
			handleDefaultDirection(result);
		} else {
			result.setDirection(direction);
		}
		if (n == null) {
			handleDefaultN(result);
		} else {
			result.setN(n);
		}
		return result;	
	}

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for calculatedELA default method
	 * End of user code -->
	 */
	private void handleDefaultCalculatedELA(MainStep result) {
		// Start of user code default feature for handleDefaultCalculatedELA
		result.setCalculatedELA(Double.valueOf(cfg.getProperty("defaultValue.MainStep.calculatedELA", "0.0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for cl default method
	 * End of user code -->
	 */
	private void handleDefaultCl(MainStep result) {
		// Start of user code default feature for handleDefaultCl
		result.setCl(Double.valueOf(cfg.getProperty("defaultValue.MainStep.cl", "0.0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for correlation default method
	 * End of user code -->
	 */
	private void handleDefaultCorrelation(MainStep result) {
		// Start of user code default feature for handleDefaultCorrelation
		result.setCorrelation(Double.valueOf(cfg.getProperty("defaultValue.MainStep.correlation", "0.0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for direction default method
	 * End of user code -->
	 */
	private void handleDefaultDirection(MainStep result) {
		// Start of user code default feature for handleDefaultDirection
		result.setDirection(cfg.getProperty("defaultValue.MainStep.direction"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for n default method
	 * End of user code -->
	 */
	private void handleDefaultN(MainStep result) {
		// Start of user code default feature for handleDefaultN
		result.setN(Double.valueOf(cfg.getProperty("defaultValue.MainStep.n", "0.0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for calculatedELA
	 * End of user code -->
	 */
	public BUILDER calculatedELA(Double myCalculatedELA) {
		this.calculatedELA = myCalculatedELA;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for cl
	 * End of user code -->
	 */
	public BUILDER cl(Double myCl) {
		this.cl = myCl;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for correlation
	 * End of user code -->
	 */
	public BUILDER correlation(Double myCorrelation) {
		this.correlation = myCorrelation;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for direction
	 * End of user code -->
	 */
	public BUILDER direction(String myDirection) {
		this.direction = myDirection;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for n
	 * End of user code -->
	 */
	public BUILDER n(Double myN) {
		this.n = myN;
		return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
