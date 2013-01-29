package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.ContactBuilder;
import com.dooapp.firea.wrapper.Contact;

/*
 * Test Class
 * <!-- Start of user code comment for Contact Test Class
 * End of user code -->
 */


public class ContactBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private ContactBuilder<?> contactBuilder;
	
	@Before
	public void setup() {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().injectMembers(this);
	}
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(ContactBuilderTest.class).justTryToPersiste();
		//Start of user code main of Contact
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Contact unsavedContact= contactBuilder.build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact);
		//Start of user code try to persist for Contact
		
		//End of user code
	}
	@Test
	public void setterNGetterEmail() throws Exception {
		//Start of user code getter and setter for email attribute
		Contact unsavedContact = contactBuilder.email("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getEmail());
		//End of user code
	}
	@Test
	public void setterNGetterAddress2() throws Exception {
		//Start of user code getter and setter for address2 attribute
		Contact unsavedContact = contactBuilder.address2("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getAddress2());
		//End of user code
	}
	@Test
	public void setterNGetterPhone() throws Exception {
		//Start of user code getter and setter for phone attribute
		Contact unsavedContact = contactBuilder.phone("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getPhone());
		//End of user code
	}
	@Test
	public void setterNGetterPerson() throws Exception {
		//Start of user code getter and setter for person attribute
		Contact unsavedContact = contactBuilder.person("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getPerson());
		//End of user code
	}
	@Test
	public void setterNGetterCity() throws Exception {
		//Start of user code getter and setter for city attribute
		Contact unsavedContact = contactBuilder.city("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getCity());
		//End of user code
	}
	@Test
	public void setterNGetterSiret() throws Exception {
		//Start of user code getter and setter for siret attribute
		Contact unsavedContact = contactBuilder.siret("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getSiret());
		//End of user code
	}
	@Test
	public void setterNGetterAdress1() throws Exception {
		//Start of user code getter and setter for adress1 attribute
		Contact unsavedContact = contactBuilder.adress1("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getAdress1());
		//End of user code
	}
	@Test
	public void setterNGetterKind() throws Exception {
		//Start of user code getter and setter for kind attribute
		Contact unsavedContact = contactBuilder.kind("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getKind());
		//End of user code
	}
	@Test
	public void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		Contact unsavedContact = contactBuilder.name("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getName());
		//End of user code
	}
	@Test
	public void setterNGetterZipCode() throws Exception {
		//Start of user code getter and setter for zipCode attribute
		Contact unsavedContact = contactBuilder.zipCode("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getZipCode());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Contact unsavedContact = contactBuilder.id(0L).build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Contact unsavedContact = contactBuilder.creationDate(new java.util.Date()).build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Contact unsavedContact = contactBuilder.updateDate(new java.util.Date()).build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Contact unsavedContact = contactBuilder.version(0).build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterImageTest() throws Exception {	
		//Start of user code basic reference test for image reference
		com.dooapp.firea.wrapper.PersistentImage elem1 = new com.dooapp.firea.wrapper.PersistentImage();
		Contact unsavedContact =  contactBuilder.image(elem1).build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact);
		Assert.assertNotNull(dbContact.getImage());
		//End of user code
	}
	
	@Test
	public void refSetterImageClassicTest() throws Exception {
		//Start of user code basic classic reference test for image reference
		Contact unsavedContact =  contactBuilder.build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact);
		Assert.assertNotNull(dbContact.getImage());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
