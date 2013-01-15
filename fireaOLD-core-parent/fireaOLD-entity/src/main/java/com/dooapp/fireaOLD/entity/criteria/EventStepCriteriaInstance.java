package com.dooapp.fireaOLD.entity.criteria;

import com.dooapp.fireaOLD.wrapper.criteria.EventStepCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for EventStepCriteria Class
 * End of user code -->
 */

public class EventStepCriteriaInstance extends StepCriteriaInstance implements Bean
{
	
	
	private com.dooapp.fireaOLD.entity.Direction direction;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private EventStepCriteria wrapper;

	/*
	 * <!-- Start of user code comment for EventStepCriteria wrapper getter
	 * End of user code -->
	 */
	public EventStepCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new EventStepCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for EventStepCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(EventStepCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/*
	 * <!-- Start of user code comment for direction getter
	 * End of user code -->
	 */
	public com.dooapp.fireaOLD.entity.Direction getDirection(){
		return this.direction;
	}
	
	/*
	 * <!-- Start of user code comment for direction setter
	 * End of user code -->
	 */
	public void setDirection(com.dooapp.fireaOLD.entity.Direction arg0){
		this.direction = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
