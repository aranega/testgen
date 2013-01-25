package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

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
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(RisqueBuilderTest.class).justTryToPersiste();
		//Start of user code main of Risque
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		Risque unsavedProject = risqueBuilder.build();
		Risque savedProject = manager.save(unsavedProject);
		Risque dbProject = manager.get(Risque.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for Risque
		
		//End of user code
	}
	private void setterNGetterKey() throws Exception {
		//Start of user code getter and setter for key attribute
		Risque unsavedProject = risqueBuilder.key("").build();
		Risque savedProject = manager.save(unsavedProject);
		Risque dbProject = manager.get(Risque.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getkey());
		//End of user code
	}
	private void setterNGetterTab() throws Exception {
		//Start of user code getter and setter for tab attribute
		Risque unsavedProject = risqueBuilder.tab(new byte[100]).build();
		Risque savedProject = manager.save(unsavedProject);
		Risque dbProject = manager.get(Risque.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.gettab());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Risque unsavedProject = risqueBuilder.id(0L).build();
		Risque savedProject = manager.save(unsavedProject);
		Risque dbProject = manager.get(Risque.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Risque unsavedProject = risqueBuilder.creationDate(new java.util.Date()).build();
		Risque savedProject = manager.save(unsavedProject);
		Risque dbProject = manager.get(Risque.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Risque unsavedProject = risqueBuilder.updateDate(new java.util.Date()).build();
		Risque savedProject = manager.save(unsavedProject);
		Risque dbProject = manager.get(Risque.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Risque unsavedProject = risqueBuilder.version(0).build();
		Risque savedProject = manager.save(unsavedProject);
		Risque dbProject = manager.get(Risque.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
