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

//import com.dooapp.firea.entity.factories.GaugeModeBuilder;
import com.dooapp.firea.wrapper.GaugeMode;

/*
 * Test Class
 * <!-- Start of user code comment for GaugeMode Test Class
 * End of user code -->
 */


public class GaugeModeBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private GaugeModeBuilder<?> gaugeModeBuilder;
	
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
		IOC.getInjector().getInstance(GaugeModeBuilderTest.class).justTryToPersiste();
		//Start of user code main of GaugeMode
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		GaugeMode unsavedGaugeMode= gaugeModeBuilder.build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode);
		//Start of user code try to persist for GaugeMode
		
		//End of user code
	}
	@Test
	public void setterNGetterGaugeType() throws Exception {
		//Start of user code getter and setter for gaugeType attribute
		GaugeMode unsavedGaugeMode = gaugeModeBuilder.gaugeType("").build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode.getGaugeType());
		//End of user code
	}
	@Test
	public void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		GaugeMode unsavedGaugeMode = gaugeModeBuilder.name("").build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode.getName());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		GaugeMode unsavedGaugeMode = gaugeModeBuilder.id(0L).build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		GaugeMode unsavedGaugeMode = gaugeModeBuilder.creationDate(new java.util.Date()).build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		GaugeMode unsavedGaugeMode = gaugeModeBuilder.updateDate(new java.util.Date()).build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		GaugeMode unsavedGaugeMode = gaugeModeBuilder.version(0).build();
		GaugeMode savedGaugeMode = manager.save(unsavedGaugeMode);
		GaugeMode dbGaugeMode = manager.get(GaugeMode.class, savedGaugeMode.getId());
		Assert.assertNotNull(dbGaugeMode.getVersion());
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
