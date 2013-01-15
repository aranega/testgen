package com.dooapp.fireaOLD.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.fireaOLD.wrapper.EventStep;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for EventStep Class
 * End of user code -->
 */
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
	private com.dooapp.fireaOLD.entity.Direction direction;

	@javax.persistence.Transient
	private EventStep wrapper;
    	
	
	/*
	 * <!-- Start of user code comment for EventStep wrapper getter
	 * End of user code -->
	 */
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
	
	/*
	 * <!-- Start of user code comment for EventStep wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(EventStep wrapper) {
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
	
	/*
	 * <!-- Start of user code comment for direction unsetter
	 * End of user code -->
	 */
	public void unsetDirection(com.dooapp.fireaOLD.entity.Direction arg0){
		this.direction = null;
	}
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
