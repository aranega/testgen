package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Contact;
import com.dooapp.firea.wrapper.PersistentImage;


import com.dooapp.firea.entity.ContactKind;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ContactBuilder<BUILDER extends ContactBuilder<?>>
// Start of user code bloc for inerithance

// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String address2;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String adress1;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String city;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private java.util.Date creationDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String email;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Long id;
	/**
	 *  
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private PersistentImage image;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private ContactKind kind;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String name;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String person;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String phone;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String siret;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private java.util.Date updateDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private Integer version;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String zipCode;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	PersistentImageBuilder<?> persistentImageBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.inject.Inject
	java.util.Properties cfg;
	
	/**
	 * Just a helpful {@link DateFormat}
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.inject.Inject
	protected ContactBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected Contact createValue() {
		return new Contact();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
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

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultAddress2(Contact result) {
		result.setAddress2(cfg.getProperty("defaultValue.Contact.address2"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultAdress1(Contact result) {
		result.setAdress1(cfg.getProperty("defaultValue.Contact.adress1"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultCity(Contact result) {
		result.setCity(cfg.getProperty("defaultValue.Contact.city"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultCreationDate(Contact result) {
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Contact.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Contact.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultEmail(Contact result) {
		result.setEmail(cfg.getProperty("defaultValue.Contact.email"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultId(Contact result) {
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Contact.id", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultImage(Contact result) {
		result.setImage(persistentImageBuilder.build());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultKind(Contact result) {
		result.setKind(ContactKind.valueOf(cfg.getProperty("defaultValue.Contact.kind", "TECHNICIAN")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultName(Contact result) {
		result.setName(cfg.getProperty("defaultValue.Contact.name"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultPerson(Contact result) {
		result.setPerson(cfg.getProperty("defaultValue.Contact.person"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultPhone(Contact result) {
		result.setPhone(cfg.getProperty("defaultValue.Contact.phone"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultSiret(Contact result) {
		result.setSiret(cfg.getProperty("defaultValue.Contact.siret"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultUpdateDate(Contact result) {
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Contact.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Contact.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultVersion(Contact result) {
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Contact.version", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private void handleDefaultZipCode(Contact result) {
		result.setZipCode(cfg.getProperty("defaultValue.Contact.zipCode"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER address2(String myAddress2) {
		this.address2 = myAddress2;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER adress1(String myAdress1) {
		this.adress1 = myAdress1;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER city(String myCity) {
		this.city = myCity;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER creationDate(java.util.Date myCreationDate) {
		this.creationDate = myCreationDate;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER email(String myEmail) {
		this.email = myEmail;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER id(Long myId) {
		this.id = myId;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER image(PersistentImage myImage) {
		this.image = myImage;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER kind(ContactKind myKind) {
		this.kind = myKind;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER name(String myName) {
		this.name = myName;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER person(String myPerson) {
		this.person = myPerson;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER phone(String myPhone) {
		this.phone = myPhone;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER siret(String mySiret) {
		this.siret = mySiret;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER updateDate(java.util.Date myUpdateDate) {
		this.updateDate = myUpdateDate;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER version(Integer myVersion) {
		this.version = myVersion;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER zipCode(String myZipCode) {
		this.zipCode = myZipCode;
		return (BUILDER) this;
	}

}
