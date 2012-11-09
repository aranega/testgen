package com.dooapp.firea.entity.domain.factories;

import com.dooapp.firea.entity.domain.Risque;

//Start of user code for imports
// TODO: import me!
//End of user code

//



public class RisqueBuilder extends AbstractEntityBuilder
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	
	private Risque risque;
    

	public Risque build () 
	{
		return risque;	
	}

	public static RisqueBuilder create () 
	{
		return new RisqueBuilder();	
	}

	public RisqueBuilder initRisque () 
	{
		risque = new Risque();
		return this;	
	}

	public RisqueBuilder key (String key) 
	{
		risque.setKey (key);
		return this;	
	}


}
