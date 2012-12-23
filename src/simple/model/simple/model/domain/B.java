package simple.model.simple.model.domain;

import java.util.Set;
import java.util.List;



public class B
{

	
	
	private Set<C> mult;
	
	
	private String name;
	
	
	private C single;
    

	
	public void addMult (C newMult) 
	{
		if(this.mult==null) {
			this.mult= new java.util.HashSet<C>();
		}
			
		if (this.mult.add (newMult))
			newMult.setB (this);
			
	}

	
	public List<C> getMult () 
	{
		if(this.mult==null) {
			this.mult= new java.util.HashSet<C>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<C>(this.mult));	
	}

	
	public String getName () 
	{
		return this.name;	
	}

	
	public C getSingle () 
	{
		return this.single;	
	}

	
	public void removeMult (C oldMult) 
	{
		if(this.mult==null) {
			return;
		}
		
		this.mult.remove (oldMult);
			
	}

	
	public void setName (String myName) 
	{
		this.name = myName;	
	}

	
	public void setSingle (C mySingle) 
	{
		this.single = mySingle;	
	}

	
	public void unsetName () 
	{
		this.name = null;	
	}

	
	public void unsetSingle () 
	{
		this.single = null;	
	}


}
