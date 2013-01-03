package com.dooapp.firea.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.EventStep;
import com.dooapp.lib.common.entity.Bean;

//Start of user code for queries
//End of user code
@javax.persistence.Entity
public class EventStepBean extends StepBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(EventStepBean.class);

	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	private com.dooapp.firea.entity.Direction direction;

	@javax.persistence.Transient
	private EventStep wrapper;
    	
	
	@javax.persistence.Transient
	@Override
	public EventStep getWrapper() {
		if (wrapper == null) {
			wrapper = new EventStep(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	@javax.persistence.Transient
	public void setWrapper(EventStep wrapper) {
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
	
	public void unsetDirection(com.dooapp.firea.entity.Direction arg0){
		this.direction = null;
	}
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
