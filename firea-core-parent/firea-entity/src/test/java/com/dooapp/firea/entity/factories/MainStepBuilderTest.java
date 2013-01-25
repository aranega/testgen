package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.MainStepBuilder;
import com.dooapp.firea.wrapper.MainStep;

/*
 * Test Class
 * <!-- Start of user code comment for MainStep Test Class
 * End of user code -->
 */


public class MainStepBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private MainStepBuilder<?> mainStepBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(MainStepBuilderTest.class).justTryToPersiste();
		//Start of user code main of MainStep
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		MainStep unsavedProject = mainStepBuilder.build();
		MainStep savedProject = manager.save(unsavedProject);
		MainStep dbProject = manager.get(MainStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for MainStep
		
		//End of user code
	}
	private void setterNGetterDate() throws Exception {
		//Start of user code getter and setter for date attribute
		MainStep unsavedProject = mainStepBuilder.date(new java.util.Date()).build();
		MainStep savedProject = manager.save(unsavedProject);
		MainStep dbProject = manager.get(MainStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdate());
		//End of user code
	}
	private void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for status attribute
		MainStep unsavedProject = mainStepBuilder.status("").build();
		MainStep savedProject = manager.save(unsavedProject);
		MainStep dbProject = manager.get(MainStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getstatus());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		MainStep unsavedProject = mainStepBuilder.id(0L).build();
		MainStep savedProject = manager.save(unsavedProject);
		MainStep dbProject = manager.get(MainStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		MainStep unsavedProject = mainStepBuilder.creationDate(new java.util.Date()).build();
		MainStep savedProject = manager.save(unsavedProject);
		MainStep dbProject = manager.get(MainStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		MainStep unsavedProject = mainStepBuilder.updateDate(new java.util.Date()).build();
		MainStep savedProject = manager.save(unsavedProject);
		MainStep dbProject = manager.get(MainStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		MainStep unsavedProject = mainStepBuilder.version(0).build();
		MainStep savedProject = manager.save(unsavedProject);
		MainStep dbProject = manager.get(MainStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	private void setterNGetterCorrelation() throws Exception {
		//Start of user code getter and setter for correlation attribute
		MainStep unsavedProject = mainStepBuilder.correlation(0.0).build();
		MainStep savedProject = manager.save(unsavedProject);
		MainStep dbProject = manager.get(MainStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcorrelation());
		//End of user code
	}
	private void setterNGetterCl() throws Exception {
		//Start of user code getter and setter for cl attribute
		MainStep unsavedProject = mainStepBuilder.cl(0.0).build();
		MainStep savedProject = manager.save(unsavedProject);
		MainStep dbProject = manager.get(MainStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcl());
		//End of user code
	}
	private void setterNGetterN() throws Exception {
		//Start of user code getter and setter for n attribute
		MainStep unsavedProject = mainStepBuilder.n(0.0).build();
		MainStep savedProject = manager.save(unsavedProject);
		MainStep dbProject = manager.get(MainStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getn());
		//End of user code
	}
	private void setterNGetterCalculatedELA() throws Exception {
		//Start of user code getter and setter for calculatedELA attribute
		MainStep unsavedProject = mainStepBuilder.calculatedELA(0.0).build();
		MainStep savedProject = manager.save(unsavedProject);
		MainStep dbProject = manager.get(MainStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcalculatedELA());
		//End of user code
	}
	private void setterNGetterDirection() throws Exception {
		//Start of user code getter and setter for direction attribute
		MainStep unsavedProject = mainStepBuilder.direction("").build();
		MainStep savedProject = manager.save(unsavedProject);
		MainStep dbProject = manager.get(MainStep.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdirection());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
