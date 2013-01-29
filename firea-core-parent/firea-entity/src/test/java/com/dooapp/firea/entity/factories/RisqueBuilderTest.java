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

//import com.dooapp.firea.entity.factories.RisqueBuilder;
import com.dooapp.firea.wrapper.Risque;

/*
 * Test Class
 * <!-- Start of user code comment for Risque Test Class
 * End of user code -->
 */


public class RisqueBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private RisqueBuilder<?> risqueBuilder;
	
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
		IOC.getInjector().getInstance(RisqueBuilderTest.class).justTryToPersiste();
		//Start of user code main of Risque
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Risque unsavedRisque= risqueBuilder.build();
		Risque savedRisque = manager.save(unsavedRisque);
		Risque dbRisque = manager.get(Risque.class, savedRisque.getId());
		Assert.assertNotNull(dbRisque);
		//Start of user code try to persist for Risque
		
		//End of user code
	}
	@Test
	public void setterNGetterKey() throws Exception {
		//Start of user code getter and setter for key attribute
		Risque unsavedRisque = risqueBuilder.key("").build();
		Risque savedRisque = manager.save(unsavedRisque);
		Risque dbRisque = manager.get(Risque.class, savedRisque.getId());
		Assert.assertNotNull(dbRisque.getKey());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Risque unsavedRisque = risqueBuilder.id(0L).build();
		Risque savedRisque = manager.save(unsavedRisque);
		Risque dbRisque = manager.get(Risque.class, savedRisque.getId());
		Assert.assertNotNull(dbRisque.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Risque unsavedRisque = risqueBuilder.creationDate(new java.util.Date()).build();
		Risque savedRisque = manager.save(unsavedRisque);
		Risque dbRisque = manager.get(Risque.class, savedRisque.getId());
		Assert.assertNotNull(dbRisque.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Risque unsavedRisque = risqueBuilder.updateDate(new java.util.Date()).build();
		Risque savedRisque = manager.save(unsavedRisque);
		Risque dbRisque = manager.get(Risque.class, savedRisque.getId());
		Assert.assertNotNull(dbRisque.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Risque unsavedRisque = risqueBuilder.version(0).build();
		Risque savedRisque = manager.save(unsavedRisque);
		Risque dbRisque = manager.get(Risque.class, savedRisque.getId());
		Assert.assertNotNull(dbRisque.getVersion());
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
