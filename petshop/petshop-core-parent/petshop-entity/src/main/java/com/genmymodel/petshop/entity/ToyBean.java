package com.genmymodel.petshop.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genmymodel.petshop.wrapper.Toy;
import com.dooapp.lib.common.entity.Bean;

//Start of user code for queries
//End of user code

@javax.persistence.Entity
public class ToyBean extends ProductBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ToyBean.class);


	@javax.persistence.Transient
	private Toy wrapper;
    	
	
	@javax.persistence.Transient
	@Override
	public Toy getWrapper() {
		if (wrapper == null) {
			wrapper = new Toy(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	@javax.persistence.Transient
	public void setWrapper(Toy wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	
	

    


	//Start of user code for methods
	// Other methods
	//End of user code

}
