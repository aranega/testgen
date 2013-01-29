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

//import com.dooapp.firea.entity.factories.BlowHoleBuilder;
import com.dooapp.firea.wrapper.BlowHole;

/*
 * Test Class
 * <!-- Start of user code comment for BlowHole Test Class
 * End of user code -->
 */


public class BlowHoleBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private BlowHoleBuilder<?> blowHoleBuilder;
	
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
		IOC.getInjector().getInstance(BlowHoleBuilderTest.class).justTryToPersiste();
		//Start of user code main of BlowHole
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		BlowHole unsavedBlowHole= blowHoleBuilder.build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole);
		//Start of user code try to persist for BlowHole
		
		//End of user code
	}
	@Test
	public void setterNGetterDischarge() throws Exception {
		//Start of user code getter and setter for Discharge attribute
		BlowHole unsavedBlowHole = blowHoleBuilder.Discharge("").build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getDischarge());
		//End of user code
	}
	@Test
	public void setterNGetterSurface() throws Exception {
		//Start of user code getter and setter for surface attribute
		BlowHole unsavedBlowHole = blowHoleBuilder.surface(0.0).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getSurface());
		//End of user code
	}
	@Test
	public void setterNGetterQuantity() throws Exception {
		//Start of user code getter and setter for quantity attribute
		BlowHole unsavedBlowHole = blowHoleBuilder.quantity(0).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getQuantity());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		BlowHole unsavedBlowHole = blowHoleBuilder.id(0L).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		BlowHole unsavedBlowHole = blowHoleBuilder.creationDate(new java.util.Date()).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		BlowHole unsavedBlowHole = blowHoleBuilder.updateDate(new java.util.Date()).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		BlowHole unsavedBlowHole = blowHoleBuilder.version(0).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterTestedroomTest() throws Exception {	
		//Start of user code basic reference test for testedroom reference
		com.dooapp.firea.wrapper.TestedRoom elem1 = new com.dooapp.firea.wrapper.TestedRoom();
		BlowHole unsavedBlowHole =  blowHoleBuilder.testedroom(elem1).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole);
		Assert.assertNotNull(dbBlowHole.getTestedroom());
		//End of user code
	}
	
	@Test
	public void refSetterTestedroomClassicTest() throws Exception {
		//Start of user code basic classic reference test for testedroom reference
		BlowHole unsavedBlowHole =  blowHoleBuilder.build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole);
		Assert.assertNotNull(dbBlowHole.getTestedroom());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeTestedroomTest() throws Exception {
		//Start of user code basic opposite test for testedroom reference
		com.dooapp.firea.wrapper.TestedRoom elem1 = new com.dooapp.firea.wrapper.TestedRoom();
		BlowHole unsavedBlowHole =  blowHoleBuilder.testedroom(elem1).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole);
		Assert.assertFalse(dbBlowHole.getTestedroom().getBlowholes().isEmpty());
		Assert.assertTrue(dbBlowHole.getTestedroom().getBlowholes().contains(dbBlowHole));
		//End of user code
	}
	
	@Test
	public void oppositeTestedroomClassicTest() throws Exception {
		//Start of user code basic classic reference test for testedroom reference
		BlowHole unsavedBlowHole =  blowHoleBuilder.build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole);
		Assert.assertFalse(dbBlowHole.getTestedroom().getBlowholes().isEmpty());
		Assert.assertTrue(dbBlowHole.getTestedroom().getBlowholes().contains(dbBlowHole));
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
