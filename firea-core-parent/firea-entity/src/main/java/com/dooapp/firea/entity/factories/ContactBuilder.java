package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Contact;
import com.dooapp.firea.wrapper.PersistentImage;

//Start of user code for imports
// TODO: import me!
//End of user code




/*
 * Class
 * <!-- Start of user code comment for Contact Builder
 * End of user code -->
 */

public class ContactBuilder<BUILDER extends ContactBuilder<?>>
// Start of user code bloc for inerithance

// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private String address2;
	
	private String adress1;
	
	private String city;
	
	private java.util.Date creationDate;
	
	private String email;
	
	private Long id;
	
	private PersistentImage image;
	
	private String kind;
	
	private String name;
	
	private String person;
	
	private String phone;
	
	private String siret;
	
	private java.util.Date updateDate;
	
	private Integer version;
	
	private String zipCode;
	@javax.inject.Inject
	PersistentImageBuilder<?> persistentImageBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for Contact getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected ContactBuilder() {
	}
	
	protected Contact createValue() {
		return new Contact();
	}
	
	/*
	 * <!-- Start of user code comment for Contact build method
	 * End of user code -->
	 */
	public Contact build() throws NullPointerException {
		Contact result =  this.createValue() ;
		if (address2 == null) {
			handleDefaultAddress2(result);
		} else { 
			result.setAddress2(address2);
		}
		if (adress1 == null) {
			handleDefaultAdress1(result);
		} else { 
			result.setAdress1(adress1);
		}
		if (city == null) {
			handleDefaultCity(result);
		} else { 
			result.setCity(city);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else { 
			result.setCreationDate(creationDate);
		}
		if (email == null) {
			handleDefaultEmail(result);
		} else { 
			result.setEmail(email);
		}
		if (id == null) {
			handleDefaultId(result);
		} else { 
			result.setId(id);
		}
		if (image == null) {
			handleDefaultImage(result);
		} else { 
			result.setImage(image);
		}
		if (kind == null) {
			handleDefaultKind(result);
		} else { 
			result.setKind(kind);
		}
		if (name == null) {
			handleDefaultName(result);
		} else { 
			result.setName(name);
		}
		if (person == null) {
			handleDefaultPerson(result);
		} else { 
			result.setPerson(person);
		}
		if (phone == null) {
			handleDefaultPhone(result);
		} else { 
			result.setPhone(phone);
		}
		if (siret == null) {
			handleDefaultSiret(result);
		} else { 
			result.setSiret(siret);
		}
		if (updateDate == null) {
			handleDefaultUpdateDate(result);
		} else { 
			result.setUpdateDate(updateDate);
		}
		if (version == null) {
			handleDefaultVersion(result);
		} else { 
			result.setVersion(version);
		}
		if (zipCode == null) {
			handleDefaultZipCode(result);
		} else { 
			result.setZipCode(zipCode);
		}
		return result;	
	}

	/*
	 * Generated getters and setters
	 */
	/*
	 * <!-- Start of user code comment for address2 default method
	 * End of user code -->
	 */
	private void handleDefaultAddress2(Contact result) {
		// Start of user code default feature for handleDefaultAddress2
		result.setAddress2(cfg.getProperty("defaultValue.Contact.address2"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for adress1 default method
	 * End of user code -->
	 */
	private void handleDefaultAdress1(Contact result) {
		// Start of user code default feature for handleDefaultAdress1
		result.setAdress1(cfg.getProperty("defaultValue.Contact.adress1"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for city default method
	 * End of user code -->
	 */
	private void handleDefaultCity(Contact result) {
		// Start of user code default feature for handleDefaultCity
		result.setCity(cfg.getProperty("defaultValue.Contact.city"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
	private void handleDefaultCreationDate(Contact result) {
		// Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Contact.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Contact.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for email default method
	 * End of user code -->
	 */
	private void handleDefaultEmail(Contact result) {
		// Start of user code default feature for handleDefaultEmail
		result.setEmail(cfg.getProperty("defaultValue.Contact.email"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(Contact result) {
		// Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Contact.id", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for image default method
	 * End of user code -->
	 */
	private void handleDefaultImage(Contact result) {
		// Start of user code default feature for handleDefaultImage
		result.setImage(persistentImageBuilder.build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for kind default method
	 * End of user code -->
	 */
	private void handleDefaultKind(Contact result) {
		// Start of user code default feature for handleDefaultKind
		result.setKind(cfg.getProperty("defaultValue.Contact.kind"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for name default method
	 * End of user code -->
	 */
	private void handleDefaultName(Contact result) {
		// Start of user code default feature for handleDefaultName
		result.setName(cfg.getProperty("defaultValue.Contact.name"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for person default method
	 * End of user code -->
	 */
	private void handleDefaultPerson(Contact result) {
		// Start of user code default feature for handleDefaultPerson
		result.setPerson(cfg.getProperty("defaultValue.Contact.person"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for phone default method
	 * End of user code -->
	 */
	private void handleDefaultPhone(Contact result) {
		// Start of user code default feature for handleDefaultPhone
		result.setPhone(cfg.getProperty("defaultValue.Contact.phone"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for siret default method
	 * End of user code -->
	 */
	private void handleDefaultSiret(Contact result) {
		// Start of user code default feature for handleDefaultSiret
		result.setSiret(cfg.getProperty("defaultValue.Contact.siret"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(Contact result) {
		// Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Contact.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Contact.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(Contact result) {
		// Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Contact.version", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for zipCode default method
	 * End of user code -->
	 */
	private void handleDefaultZipCode(Contact result) {
		// Start of user code default feature for handleDefaultZipCode
		result.setZipCode(cfg.getProperty("defaultValue.Contact.zipCode"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for address2
	 * End of user code -->
	 */
	public BUILDER address2(String myAddress2) {
		this.address2 = myAddress2;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for adress1
	 * End of user code -->
	 */
	public BUILDER adress1(String myAdress1) {
		this.adress1 = myAdress1;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for city
	 * End of user code -->
	 */
	public BUILDER city(String myCity) {
		this.city = myCity;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for creationDate
	 * End of user code -->
	 */
	public BUILDER creationDate(java.util.Date myCreationDate) {
		this.creationDate = myCreationDate;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for email
	 * End of user code -->
	 */
	public BUILDER email(String myEmail) {
		this.email = myEmail;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for id
	 * End of user code -->
	 */
	public BUILDER id(Long myId) {
		this.id = myId;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for image
	 * End of user code -->
	 */
	public BUILDER image(PersistentImage myImage) {
		this.image = myImage;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for kind
	 * End of user code -->
	 */
	public BUILDER kind(String myKind) {
		this.kind = myKind;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for name
	 * End of user code -->
	 */
	public BUILDER name(String myName) {
		this.name = myName;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for person
	 * End of user code -->
	 */
	public BUILDER person(String myPerson) {
		this.person = myPerson;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for phone
	 * End of user code -->
	 */
	public BUILDER phone(String myPhone) {
		this.phone = myPhone;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for siret
	 * End of user code -->
	 */
	public BUILDER siret(String mySiret) {
		this.siret = mySiret;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for updateDate
	 * End of user code -->
	 */
	public BUILDER updateDate(java.util.Date myUpdateDate) {
		this.updateDate = myUpdateDate;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for version
	 * End of user code -->
	 */
	public BUILDER version(Integer myVersion) {
		this.version = myVersion;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for zipCode
	 * End of user code -->
	 */
	public BUILDER zipCode(String myZipCode) {
		this.zipCode = myZipCode;
		return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
