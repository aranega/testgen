package com.dooapp.testpackage.entity;

import java.util.UUID;
import java.util.List;
import java.util.Set;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinTable;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class AInstanceBean {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	@Column(name = "ATTRIBUTECOLUMN")
	private Double attribute;
	
	private Integer attribute2;
	
	private String attribute5;
	@ManyToMany(fetch = javax.persistence.FetchType.EAGER)
	@JoinTable(name = "AINSTANCE_BINSTANCE")
	private Set<BInstanceBean> binstance;
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	private UUID uuid;
    

	
	public AInstance ()  {
		uuid = UUID.randomUUID();	
	}

	
	public void addBinstance (BInstanceBean newBinstance)  {
		if(this.binstance==null) {
			this.binstance= new java.util.HashSet<BInstanceBean>();
		}
			
		this.binstance.add (newBinstance);
			
	}

	
	public Double getAttribute ()  {
		return this.attribute;	
	}

	
	public Integer getAttribute2 ()  {
		return this.attribute2;	
	}

	
	public String getAttribute5 ()  {
		return this.attribute5;	
	}

	
	public List<BInstanceBean> getBinstance ()  {
		if(this.binstance==null) {
			this.binstance= new java.util.HashSet<BInstanceBean>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<BInstanceBean>(this.binstance));	
	}

	
	public Long getId ()  {
		return this.id;	
	}

	
	public UUID getUuid ()  {
		return uuid;	
	}

	
	public void removeBinstance (BInstanceBean oldBinstance)  {
		if(this.binstance==null) {
			return;
		}
		
		this.binstance.remove (oldBinstance);
			
	}

	
	public void setAttribute (Double myAttribute)  {
		this.attribute = myAttribute;	
	}

	
	public void setAttribute2 (Integer myAttribute2)  {
		this.attribute2 = myAttribute2;	
	}

	
	public void setAttribute5 (String myAttribute5)  {
		this.attribute5 = myAttribute5;	
	}

	
	public void setId (Long myId)  {
		this.id = myId;	
	}

	
	public void unsetAttribute ()  {
		this.attribute = null;	
	}

	
	public void unsetAttribute2 ()  {
		this.attribute2 = null;	
	}

	
	public void unsetAttribute5 ()  {
		this.attribute5 = null;	
	}

	
	public void unsetId ()  {
		this.id = null;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
