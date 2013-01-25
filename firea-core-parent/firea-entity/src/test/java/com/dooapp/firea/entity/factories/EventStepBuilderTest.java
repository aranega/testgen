package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.EventStepBuilder;
import com.dooapp.firea.wrapper.EventStep;

/*
 * Test Class
 * <!-- Start of user code comment for EventStep Test Class
 * End of user code -->
 */


public class EventStepBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private EventStepBuilder<?> eventStepBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(EventStepBuilderTest.class).justTryToPersiste();
		//Start of user code main of EventStep
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		EventStep unsavedProject = eventStepBuilder.build();
		EventStep savedProject = manager.save(unsavedProject);
		EventStep dbProject = manager.get(EventStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for EventStep
		
		//End of user code
	}
	private void setterNGetterDate() throws Exception {
		//Start of user code getter and setter for date attribute
		EventStep unsavedProject = eventStepBuilder.date(new java.util.Date()).build();
		EventStep savedProject = manager.save(unsavedProject);
		EventStep dbProject = manager.get(EventStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdate());
		//End of user code
	}
	private void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for status attribute
		EventStep unsavedProject = eventStepBuilder.status("").build();
		EventStep savedProject = manager.save(unsavedProject);
		EventStep dbProject = manager.get(EventStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getstatus());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		EventStep unsavedProject = eventStepBuilder.id(0L).build();
		EventStep savedProject = manager.save(unsavedProject);
		EventStep dbProject = manager.get(EventStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		EventStep unsavedProject = eventStepBuilder.creationDate(new java.util.Date()).build();
		EventStep savedProject = manager.save(unsavedProject);
		EventStep dbProject = manager.get(EventStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		EventStep unsavedProject = eventStepBuilder.updateDate(new java.util.Date()).build();
		EventStep savedProject = manager.save(unsavedProject);
		EventStep dbProject = manager.get(EventStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		EventStep unsavedProject = eventStepBuilder.version(0).build();
		EventStep savedProject = manager.save(unsavedProject);
		EventStep dbProject = manager.get(EventStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	private void setterNGetterDirection() throws Exception {
		//Start of user code getter and setter for direction attribute
		EventStep unsavedProject = eventStepBuilder.direction("").build();
		EventStep savedProject = manager.save(unsavedProject);
		EventStep dbProject = manager.get(EventStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdirection());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
