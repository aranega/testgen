package com.genmymodel.petshop.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.genmymodel.petshop.entity.factories.AddressBuilder;
import com.genmymodel.petshop.wrapper.Address;

/*
 * Test Class
 * <!-- Start of user code comment for Address Test Class
 * End of user code -->
 */

/**
 *  
 */

public class AddressBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private AddressBuilder<?> addressBuilder;
	
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
		IOC.getInjector().getInstance(AddressBuilderTest.class).justTryToPersiste();
		//Start of user code main of Address
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Address unsavedAddress= addressBuilder.build();
		Address savedAddress = manager.save(unsavedAddress);
		Address dbAddress = manager.get(Address.class, savedAddress.getId());
		Assert.assertNotNull(dbAddress);
		//Start of user code try to persist for Address
		
		//End of user code
	}
	@Test
	public void setterNGetterLine2() throws Exception {
		//Start of user code getter and setter for line2 attribute
		Address unsavedAddress = addressBuilder.line2("").build();
		Address savedAddress = manager.save(unsavedAddress);
		Address dbAddress = manager.get(Address.class, savedAddress.getId());
		Assert.assertNotNull(dbAddress.getLine2());
		//End of user code
	}
	@Test
	public void setterNGetterLine1() throws Exception {
		//Start of user code getter and setter for line1 attribute
		Address unsavedAddress = addressBuilder.line1("").build();
		Address savedAddress = manager.save(unsavedAddress);
		Address dbAddress = manager.get(Address.class, savedAddress.getId());
		Assert.assertNotNull(dbAddress.getLine1());
		//End of user code
	}
	@Test
	public void setterNGetterCountry() throws Exception {
		//Start of user code getter and setter for country attribute
		Address unsavedAddress = addressBuilder.country("").build();
		Address savedAddress = manager.save(unsavedAddress);
		Address dbAddress = manager.get(Address.class, savedAddress.getId());
		Assert.assertNotNull(dbAddress.getCountry());
		//End of user code
	}
	@Test
	public void setterNGetterCity() throws Exception {
		//Start of user code getter and setter for city attribute
		Address unsavedAddress = addressBuilder.city("").build();
		Address savedAddress = manager.save(unsavedAddress);
		Address dbAddress = manager.get(Address.class, savedAddress.getId());
		Assert.assertNotNull(dbAddress.getCity());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Address unsavedAddress = addressBuilder.id(0L).build();
		Address savedAddress = manager.save(unsavedAddress);
		Address dbAddress = manager.get(Address.class, savedAddress.getId());
		Assert.assertNotNull(dbAddress.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Address unsavedAddress = addressBuilder.creationDate(new java.util.Date()).build();
		Address savedAddress = manager.save(unsavedAddress);
		Address dbAddress = manager.get(Address.class, savedAddress.getId());
		Assert.assertNotNull(dbAddress.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Address unsavedAddress = addressBuilder.updateDate(new java.util.Date()).build();
		Address savedAddress = manager.save(unsavedAddress);
		Address dbAddress = manager.get(Address.class, savedAddress.getId());
		Assert.assertNotNull(dbAddress.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Address unsavedAddress = addressBuilder.version(0).build();
		Address savedAddress = manager.save(unsavedAddress);
		Address dbAddress = manager.get(Address.class, savedAddress.getId());
		Assert.assertNotNull(dbAddress.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
		
	/*
	 * Basic Refs opposite tester
	 */
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
