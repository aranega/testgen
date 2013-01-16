package com.genmymodel.petshop.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genmymodel.petshop.wrapper.Food;
import com.dooapp.lib.common.entity.Bean;


/*
 * Class
 * <!-- Start of user code comment for Food Class
 * End of user code -->
 */
//Start of user code for queries
//End of user code

@javax.persistence.Entity
public class FoodBean extends ProductBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(FoodBean.class);

	
	@javax.persistence.Column(name = "ATTRIBUTECOLUMN")
	private String attribute;

	@javax.persistence.Transient
	private Food wrapper;
    	
	
	/*
	 * <!-- Start of user code comment for Food wrapper getter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	@Override
	public Food getWrapper() {
		if (wrapper == null) {
			wrapper = new Food(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for Food wrapper setter
	 * End of user code -->
	 */
	@javax.persistence.Transient
	public void setWrapper(Food wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	
	

	/*
	 * <!-- Start of user code comment for attribute getter
	 * End of user code -->
	 */
	public String getAttribute(){
		return this.attribute;
	}
	
	/*
	 * <!-- Start of user code comment for attribute setter
	 * End of user code -->
	 */
	public void setAttribute(String arg0){
		this.attribute = arg0;
	}
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
