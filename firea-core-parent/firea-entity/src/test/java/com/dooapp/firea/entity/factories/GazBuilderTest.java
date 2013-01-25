package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.GazBuilder;
import com.dooapp.firea.wrapper.Gaz;

/*
 * Test Class
 * <!-- Start of user code comment for Gaz Test Class
 * End of user code -->
 */


public class GazBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private GazBuilder<?> gazBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(GazBuilderTest.class).justTryToPersiste();
		//Start of user code main of Gaz
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		Gaz unsavedProject = gazBuilder.build();
		Gaz savedProject = manager.save(unsavedProject);
		Gaz dbProject = manager.get(Gaz.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for Gaz
		
		//End of user code
	}
	private void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		Gaz unsavedProject = gazBuilder.name("").build();
		Gaz savedProject = manager.save(unsavedProject);
		Gaz dbProject = manager.get(Gaz.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getname());
		//End of user code
	}
	private void setterNGetterWeight() throws Exception {
		//Start of user code getter and setter for weight attribute
		Gaz unsavedProject = gazBuilder.weight("").build();
		Gaz savedProject = manager.save(unsavedProject);
		Gaz dbProject = manager.get(Gaz.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getweight());
		//End of user code
	}
	private void setterNGetterType() throws Exception {
		//Start of user code getter and setter for type attribute
		Gaz unsavedProject = gazBuilder.type("").build();
		Gaz savedProject = manager.save(unsavedProject);
		Gaz dbProject = manager.get(Gaz.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.gettype());
		//End of user code
	}
	private void setterNGetterDensity() throws Exception {
		//Start of user code getter and setter for density attribute
		Gaz unsavedProject = gazBuilder.density(0.0).build();
		Gaz savedProject = manager.save(unsavedProject);
		Gaz dbProject = manager.get(Gaz.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdensity());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Gaz unsavedProject = gazBuilder.id(0L).build();
		Gaz savedProject = manager.save(unsavedProject);
		Gaz dbProject = manager.get(Gaz.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Gaz unsavedProject = gazBuilder.creationDate(new java.util.Date()).build();
		Gaz savedProject = manager.save(unsavedProject);
		Gaz dbProject = manager.get(Gaz.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Gaz unsavedProject = gazBuilder.updateDate(new java.util.Date()).build();
		Gaz savedProject = manager.save(unsavedProject);
		Gaz dbProject = manager.get(Gaz.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Gaz unsavedProject = gazBuilder.version(0).build();
		Gaz savedProject = manager.save(unsavedProject);
		Gaz dbProject = manager.get(Gaz.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
