package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.firea.entity.ContactKind;

import com.dooapp.firea.wrapper.Contact;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class ContactBuilderTest
{	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	private EntityManager manager;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	private ContactBuilder<?> contactBuilder;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@BeforeClass
	public void setupBefore() {
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Before
	public void setup() {
		/*	System.setProperty("WORKSPACE", "target");
			System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
			System.setProperty("hibernate.connection.username", "sa");
			System.setProperty("hibernate.connection.password", "");
		*/
		IOC.getInjector().injectMembers(this);
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void justTryToPersiste() throws Exception {
		Contact unsavedContact= contactBuilder.build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterAddress2() throws Exception {
		Contact unsavedContact = contactBuilder.address2("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getAddress2());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterEmail() throws Exception {
		Contact unsavedContact = contactBuilder.email("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getEmail());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCity() throws Exception {
		Contact unsavedContact = contactBuilder.city("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getCity());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterSiret() throws Exception {
		Contact unsavedContact = contactBuilder.siret("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getSiret());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterKind() throws Exception {
		Contact unsavedContact = contactBuilder.kind(ContactKind.TECHNICIAN).build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getKind());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterAdress1() throws Exception {
		Contact unsavedContact = contactBuilder.adress1("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getAdress1());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterZipCode() throws Exception {
		Contact unsavedContact = contactBuilder.zipCode("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getZipCode());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterName() throws Exception {
		Contact unsavedContact = contactBuilder.name("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getName());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterPhone() throws Exception {
		Contact unsavedContact = contactBuilder.phone("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getPhone());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterPerson() throws Exception {
		Contact unsavedContact = contactBuilder.person("").build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getPerson());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		Contact unsavedContact = contactBuilder.id(0L).build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		Contact unsavedContact = contactBuilder.creationDate(new java.util.Date()).build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		Contact unsavedContact = contactBuilder.updateDate(new java.util.Date()).build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		Contact unsavedContact = contactBuilder.version(0).build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact.getVersion());
	}
	
	
	/********************
	 * Basic Refs tester
	 ********************/

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterImageTest() throws Exception {	
		com.dooapp.firea.wrapper.PersistentImage elem1 = new com.dooapp.firea.wrapper.PersistentImage();
		Contact unsavedContact =  contactBuilder.image(elem1).build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact);
		Assert.assertNotNull(dbContact.getImage());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterImageClassicTest() throws Exception {
		Contact unsavedContact =  contactBuilder.build();
		Contact savedContact = manager.save(unsavedContact);
		Contact dbContact = manager.get(Contact.class, savedContact.getId());
		Assert.assertNotNull(dbContact);
		Assert.assertNotNull(dbContact.getImage());
	}
	
	

	/*****************************
	 * Basic Refs opposite tester
	 *****************************/

	

}
