package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.MainStep;
//Start of user code for imports
// TODO: import me!
//End of user code




public class MainStepBuilder<BUILDER extends MainStepBuilder<?>> extends StepBuilder<BUILDER>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private Double calculatedELA;
	
	private Double cl;
	
	private Double correlation;
	
	private String direction;
	
	private Double n;
	
	
	/*
	 * Constructors 
	 */
	@javax.inject.Inject
	protected MainStepBuilder() {
	}
	
	protected MainStep createValue() {
		return new MainStep();
	}
	
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
	private void handleDefaultCalculatedELA(MainStep result) {
		//Start of user code default feature for handleDefaultCalculatedELA
		result.setCalculatedELA(Double.valueOf(cfg.getProperty("defaultValue.MainStep.calculatedELA", "0")));
		//End of user code
	}

	private void handleDefaultCl(MainStep result) {
		//Start of user code default feature for handleDefaultCl
		result.setCl(Double.valueOf(cfg.getProperty("defaultValue.MainStep.cl", "0")));
		//End of user code
	}

	private void handleDefaultCorrelation(MainStep result) {
		//Start of user code default feature for handleDefaultCorrelation
		result.setCorrelation(Double.valueOf(cfg.getProperty("defaultValue.MainStep.correlation", "0")));
		//End of user code
	}

	private void handleDefaultDirection(MainStep result) {
		//Start of user code default feature for handleDefaultDirection
		result.setDirection(cfg.getProperty("defaultValue.MainStep.direction"));
		//End of user code
	}

	private void handleDefaultN(MainStep result) {
		//Start of user code default feature for handleDefaultN
		result.setN(Double.valueOf(cfg.getProperty("defaultValue.MainStep.n", "0")));
		//End of user code
	}

	public BUILDER calculatedELA(Double myCalculatedELA) {
			this.calculatedELA = myCalculatedELA;
			return (BUILDER) this;
	}

	public BUILDER cl(Double myCl) {
			this.cl = myCl;
			return (BUILDER) this;
	}

	public BUILDER correlation(Double myCorrelation) {
			this.correlation = myCorrelation;
			return (BUILDER) this;
	}

	public BUILDER direction(String myDirection) {
			this.direction = myDirection;
			return (BUILDER) this;
	}

	public BUILDER n(Double myN) {
			this.n = myN;
			return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
