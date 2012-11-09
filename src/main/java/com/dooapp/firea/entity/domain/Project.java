package com.dooapp.firea.entity.domain;

import java.util.List;
import java.util.Set;
import com.dooapp.firea.entity.domain.ProjectKind;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Column;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Entity
public class Project extends AbstractEntity
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@ManyToMany(fetch = javax.persistence.FetchType.EAGER)
	@JoinTable(name = "PROJECT_CONTACTS")
	private Set<Contact> contacts;
	
	private String description;
	@ManyToOne
	private PersistentImage image;
	
	private com.dooapp.firea.entity.domain.ProjectKind kind;
	@Column(name = "NAMECOLUMN")
	private String name;
	@ManyToOne
	private Risque risque;
    

	public void addContacts (Contact newContacts) 
	{
		if(this.contacts==null) {
			this.contacts= new java.util.HashSet<Contact>();
		}
			
		this.contacts.add (newContacts);
			
	}

	public List<Contact> getContacts () 
	{
		if(this.contacts==null) {
			this.contacts= new java.util.HashSet<Contact>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<Contact>(this.contacts));	
	}

	public String getDescription () 
	{
		return this.description;	
	}

	public PersistentImage getImage () 
	{
		return this.image;	
	}

	public com.dooapp.firea.entity.domain.ProjectKind getKind () 
	{
		return this.kind;	
	}

	public String getName () 
	{
		return this.name;	
	}

	public Risque getRisque () 
	{
		return this.risque;	
	}

	public void removeContacts (Contact oldContacts) 
	{
		if(this.contacts==null) {
			return;
		}
		
		this.contacts.remove (oldContacts);
			
	}

	public void setDescription (String myDescription) 
	{
		this.description = myDescription;	
	}

	public void setImage (PersistentImage myImage) 
	{
		this.image = myImage;	
	}

	public void setKind (com.dooapp.firea.entity.domain.ProjectKind myKind) 
	{
		this.kind = myKind;	
	}

	public void setName (String myName) 
	{
		this.name = myName;	
	}

	public void setRisque (Risque myRisque) 
	{
		this.risque = myRisque;	
	}

	public void unsetDescription () 
	{
		this.description = null;	
	}

	public void unsetImage () 
	{
		this.image = null;	
	}

	public void unsetKind () 
	{
		this.kind = null;	
	}

	public void unsetName () 
	{
		this.name = null;	
	}

	public void unsetRisque () 
	{
		this.risque = null;	
	}


}
