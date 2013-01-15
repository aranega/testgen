package com.dooapp.fireaOLD.entity.factories;


import com.dooapp.fireaOLD.wrapper.EventStep;
import com.dooapp.fireaOLD.entity.Direction;
//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Class
 * <!-- Start of user code comment for EventStep Builder
 * End of user code -->
 */

public class EventStepBuilder<BUILDER extends EventStepBuilder<?>> extends StepBuilder<BUILDER>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private com.dooapp.fireaOLD.entity.Direction direction;
	
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for EventStep getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected EventStepBuilder() {
	}
	
	protected EventStep createValue() {
		return new EventStep();
	}
	
	/*
	 * <!-- Start of user code comment for EventStep build method
	 * End of user code -->
	 */
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
	/*
	 * <!-- Start of user code comment for direction default method
	 * End of user code -->
	 */
	private void handleDefaultDirection(EventStep result) {
		//Start of user code default feature for handleDefaultDirection
		result.setDirection(Direction.valueOf(cfg.getProperty("defaultValue.EventStep.direction", "PRESSURE")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for direction
	 * End of user code -->
	 */
	public BUILDER direction(com.dooapp.fireaOLD.entity.Direction myDirection) {
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
