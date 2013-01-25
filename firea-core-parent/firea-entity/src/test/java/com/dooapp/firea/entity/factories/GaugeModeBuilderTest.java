package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

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
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(GaugeModeBuilderTest.class).justTryToPersiste();
		//Start of user code main of GaugeMode
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		GaugeMode unsavedProject = gaugeModeBuilder.build();
		GaugeMode savedProject = manager.save(unsavedProject);
		GaugeMode dbProject = manager.get(GaugeMode.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for GaugeMode
		
		//End of user code
	}
	private void setterNGetterGaugeType() throws Exception {
		//Start of user code getter and setter for gaugeType attribute
		GaugeMode unsavedProject = gaugeModeBuilder.gaugeType("").build();
		GaugeMode savedProject = manager.save(unsavedProject);
		GaugeMode dbProject = manager.get(GaugeMode.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getgaugeType());
		//End of user code
	}
	private void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		GaugeMode unsavedProject = gaugeModeBuilder.name("").build();
		GaugeMode savedProject = manager.save(unsavedProject);
		GaugeMode dbProject = manager.get(GaugeMode.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getname());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		GaugeMode unsavedProject = gaugeModeBuilder.id(0L).build();
		GaugeMode savedProject = manager.save(unsavedProject);
		GaugeMode dbProject = manager.get(GaugeMode.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		GaugeMode unsavedProject = gaugeModeBuilder.creationDate(new java.util.Date()).build();
		GaugeMode savedProject = manager.save(unsavedProject);
		GaugeMode dbProject = manager.get(GaugeMode.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		GaugeMode unsavedProject = gaugeModeBuilder.updateDate(new java.util.Date()).build();
		GaugeMode savedProject = manager.save(unsavedProject);
		GaugeMode dbProject = manager.get(GaugeMode.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		GaugeMode unsavedProject = gaugeModeBuilder.version(0).build();
		GaugeMode savedProject = manager.save(unsavedProject);
		GaugeMode dbProject = manager.get(GaugeMode.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
