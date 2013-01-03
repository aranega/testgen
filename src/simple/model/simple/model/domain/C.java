package simple.model.simple.model.domain;




public class C
{

	
	
	private B b;
	
	
	private String name;
    

	
	public B getB () 
	{
			
	}

	
	public String getName () 
	{
			
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

	
	public void unsetName () 
	{
		this.name = null;	
	}


}
