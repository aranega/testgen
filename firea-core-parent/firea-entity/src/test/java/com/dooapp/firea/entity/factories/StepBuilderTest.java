package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.StepBuilder;
import com.dooapp.firea.wrapper.Step;

/*
 * Test Class
 * <!-- Start of user code comment for Step Test Class
 * End of user code -->
 */


public class StepBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private StepBuilder<?> stepBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(StepBuilderTest.class).justTryToPersiste();
		//Start of user code main of Step
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		Step unsavedProject = stepBuilder.build();
		Step savedProject = manager.save(unsavedProject);
		Step dbProject = manager.get(Step.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for Step
		
		//End of user code
	}
	private void setterNGetterDate() throws Exception {
		//Start of user code getter and setter for date attribute
		Step unsavedProject = stepBuilder.date(new java.util.Date()).build();
		Step savedProject = manager.save(unsavedProject);
		Step dbProject = manager.get(Step.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdate());
		//End of user code
	}
	private void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for status attribute
		Step unsavedProject = stepBuilder.status("").build();
		Step savedProject = manager.save(unsavedProject);
		Step dbProject = manager.get(Step.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getstatus());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Step unsavedProject = stepBuilder.id(0L).build();
		Step savedProject = manager.save(unsavedProject);
		Step dbProject = manager.get(Step.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Step unsavedProject = stepBuilder.creationDate(new java.util.Date()).build();
		Step savedProject = manager.save(unsavedProject);
		Step dbProject = manager.get(Step.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Step unsavedProject = stepBuilder.updateDate(new java.util.Date()).build();
		Step savedProject = manager.save(unsavedProject);
		Step dbProject = manager.get(Step.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Step unsavedProject = stepBuilder.version(0).build();
		Step savedProject = manager.save(unsavedProject);
		Step dbProject = manager.get(Step.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
