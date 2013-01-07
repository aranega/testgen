package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.EventStep;
import com.dooapp.firea.entity.Direction;
//Start of user code for imports
// TODO: import me!
//End of user code




public class EventStepBuilder<BUILDER extends EventStepBuilder<?>> extends StepBuilder<BUILDER>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private com.dooapp.firea.entity.Direction direction;
	
	
	/*
	 * Constructors 
	 */
	@javax.inject.Inject
	protected EventStepBuilder() {
	}
	
	protected EventStep createValue() {
		return new EventStep();
	}
	
	public EventStep build() throws NullPointerException {
		EventStep result =  (EventStep) super.build();
		if (direction == null) {
			handleDefaultDirection(result);
		} else {
			result.setDirection(direction);
		}
		return result;	
	}

	/*
	 * Generated getters and setters
	 */
	private void handleDefaultDirection(EventStep result) {
		//Start of user code default feature for handleDefaultDirection
		result.setDirection(Direction.valueOf(cfg.getProperty("defaultValue.EventStep.direction", "PRESSURE")));
		//End of user code
	}

	public BUILDER direction(com.dooapp.firea.entity.Direction myDirection) {
			this.direction = myDirection;
			return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
