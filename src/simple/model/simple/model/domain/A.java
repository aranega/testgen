package simple.model.simple.model.domain;

import java.util.List;
import java.util.Set;



public class A
{

	
	
	private Long longNum;
	
	
	private Set<B> mult;
	
	
	private String name;
	
	
	private Integer num;
    

	
	public void addMult (B newMult) 
	{
		if(this.mult==null) {
			this.mult= new java.util.HashSet<B>();
		}
			
		this.mult.add (newMult);
			
	}

	
	public Long getLongNum () 
	{
			
	}

	
	public List<B> getMult () 
	{
		if(this.mult==null) {
			this.mult= new java.util.HashSet<B>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<B>(this.mult));	
	}

	
	public String getName () 
	{
			
	}

	
	public Integer getNum () 
	{
			
	}

	
	public void removeMult (B oldMult) 
	{
		if(this.mult==null) {
			return;
		}
		
		this.mult.remove (oldMult);
			
	}

	
	public void setLongNum (Long myLongNum) 
	{
		this.longNum = myLongNum;	
	}

	
	public void setName (String myName) 
	{
		this.name = myName;	
	}

	
	public void setNum (Integer myNum) 
	{
		this.num = myNum;	
	}

	
	public void unsetLongNum () 
	{
		this.longNum = null;	
	}

	
	public void unsetName () 
	{
		this.name = null;	
	}

	
	public void unsetNum () 
	{
		this.num = null;	
	}


}
