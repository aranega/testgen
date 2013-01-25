package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

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
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(ContactBuilderTest.class).justTryToPersiste();
		//Start of user code main of Contact
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		Contact unsavedProject = contactBuilder.build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for Contact
		
		//End of user code
	}
	private void setterNGetterCity() throws Exception {
		//Start of user code getter and setter for city attribute
		Contact unsavedProject = contactBuilder.city("").build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcity());
		//End of user code
	}
	private void setterNGetterPhone() throws Exception {
		//Start of user code getter and setter for phone attribute
		Contact unsavedProject = contactBuilder.phone("").build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getphone());
		//End of user code
	}
	private void setterNGetterAdress1() throws Exception {
		//Start of user code getter and setter for adress1 attribute
		Contact unsavedProject = contactBuilder.adress1("").build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getadress1());
		//End of user code
	}
	private void setterNGetterZipCode() throws Exception {
		//Start of user code getter and setter for zipCode attribute
		Contact unsavedProject = contactBuilder.zipCode("").build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getzipCode());
		//End of user code
	}
	private void setterNGetterSiret() throws Exception {
		//Start of user code getter and setter for siret attribute
		Contact unsavedProject = contactBuilder.siret("").build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getsiret());
		//End of user code
	}
	private void setterNGetterEmail() throws Exception {
		//Start of user code getter and setter for email attribute
		Contact unsavedProject = contactBuilder.email("").build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getemail());
		//End of user code
	}
	private void setterNGetterKind() throws Exception {
		//Start of user code getter and setter for kind attribute
		Contact unsavedProject = contactBuilder.kind("").build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getkind());
		//End of user code
	}
	private void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		Contact unsavedProject = contactBuilder.name("").build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getname());
		//End of user code
	}
	private void setterNGetterAddress2() throws Exception {
		//Start of user code getter and setter for address2 attribute
		Contact unsavedProject = contactBuilder.address2("").build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getaddress2());
		//End of user code
	}
	private void setterNGetterPerson() throws Exception {
		//Start of user code getter and setter for person attribute
		Contact unsavedProject = contactBuilder.person("").build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getperson());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Contact unsavedProject = contactBuilder.id(0L).build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Contact unsavedProject = contactBuilder.creationDate(new java.util.Date()).build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Contact unsavedProject = contactBuilder.updateDate(new java.util.Date()).build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Contact unsavedProject = contactBuilder.version(0).build();
		Contact savedProject = manager.save(unsavedProject);
		Contact dbProject = manager.get(Contact.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
