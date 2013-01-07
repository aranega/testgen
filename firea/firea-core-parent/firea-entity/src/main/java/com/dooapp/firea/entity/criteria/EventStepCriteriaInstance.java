package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.EventStepCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


public class EventStepCriteriaInstance extends StepCriteriaInstance implements Bean
{
	
	
	private com.dooapp.firea.entity.Direction direction;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private EventStepCriteria wrapper;

	public EventStepCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new EventStepCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(EventStepCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	public com.dooapp.firea.entity.Direction getDirection(){
		return this.direction;
	}
	
	public void setDirection(com.dooapp.firea.entity.Direction arg0){
		this.direction = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
