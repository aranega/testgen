package simple.model.simple.model.domain;




public class C
{

	
	
	private B b;
	
	
	private Long id;
	
	
	private String name;
    

	
	public B getB () 
	{
		return this.b;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public String getName () 
	{
		return this.name;	
	}

	
	public void setB (B myB) 
	{
		if (this.b != myB) {
			B oldb = this.b;
			this.b = myB;
			if (oldb != null)
				oldb.removeMult (this);
			if (myB != null)
				myB.addMult (this);
		}	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setName (String myName) 
	{
		this.name = myName;	
	}

	
	public void unsetB () 
	{
		if (this.b == null)
			return;
		B oldb = this.b;
		this.b = null;
		oldb.removeMult (this);	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetName () 
	{
		this.name = null;	
	}


}
