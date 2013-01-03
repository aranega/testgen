package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.CalibrationStep;
//Start of user code for imports
// TODO: import me!
//End of user code




public class CalibrationStepBuilder<BUILDER extends CalibrationStepBuilder<?>> extends StepBuilder<BUILDER>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private Double afterHoleELA;
	
	private Double beforeHoleELA;
	
	private Double errorPercent;
	
	
	/*
	 * Constructors 
	 */
	@javax.inject.Inject
	protected CalibrationStepBuilder() {
	}
	
	protected CalibrationStep createValue() {
		return new CalibrationStep();
	}
	
	public CalibrationStep build() throws NullPointerException {
		CalibrationStep result =  (CalibrationStep) super.build();
		if (afterHoleELA == null) {
			handleDefaultAfterHoleELA(result);
		} else {
			result.setAfterHoleELA(afterHoleELA);
		}
		if (beforeHoleELA == null) {
			handleDefaultBeforeHoleELA(result);
		} else {
			result.setBeforeHoleELA(beforeHoleELA);
		}
		if (errorPercent == null) {
			handleDefaultErrorPercent(result);
		} else {
			result.setErrorPercent(errorPercent);
		}
		return result;	
	}

	/*
	 * Generated getters and setters
	 */
	private void handleDefaultAfterHoleELA(CalibrationStep result) {
		//Start of user code default feature for handleDefaultAfterHoleELA
		result.setAfterHoleELA(Double.valueOf(cfg.getProperty("defaultValue.CalibrationStep.afterHoleELA", "0")));
		//End of user code
	}

	private void handleDefaultBeforeHoleELA(CalibrationStep result) {
		//Start of user code default feature for handleDefaultBeforeHoleELA
		result.setBeforeHoleELA(Double.valueOf(cfg.getProperty("defaultValue.CalibrationStep.beforeHoleELA", "0")));
		//End of user code
	}

	private void handleDefaultErrorPercent(CalibrationStep result) {
		//Start of user code default feature for handleDefaultErrorPercent
		result.setErrorPercent(Double.valueOf(cfg.getProperty("defaultValue.CalibrationStep.errorPercent", "0")));
		//End of user code
	}

	public BUILDER afterHoleELA(Double myAfterHoleELA) {
			this.afterHoleELA = myAfterHoleELA;
			return (BUILDER) this;
	}

	public BUILDER beforeHoleELA(Double myBeforeHoleELA) {
			this.beforeHoleELA = myBeforeHoleELA;
			return (BUILDER) this;
	}

	public BUILDER errorPercent(Double myErrorPercent) {
			this.errorPercent = myErrorPercent;
			return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
