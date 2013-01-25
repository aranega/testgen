package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.ReadingBuilder;
import com.dooapp.firea.wrapper.Reading;

/*
 * Test Class
 * <!-- Start of user code comment for Reading Test Class
 * End of user code -->
 */


public class ReadingBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private ReadingBuilder<?> readingBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(ReadingBuilderTest.class).justTryToPersiste();
		//Start of user code main of Reading
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		Reading unsavedProject = readingBuilder.build();
		Reading savedProject = manager.save(unsavedProject);
		Reading dbProject = manager.get(Reading.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for Reading
		
		//End of user code
	}
	private void setterNGetterTimeAverage() throws Exception {
		//Start of user code getter and setter for timeAverage attribute
		Reading unsavedProject = readingBuilder.timeAverage(0).build();
		Reading savedProject = manager.save(unsavedProject);
		Reading dbProject = manager.get(Reading.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.gettimeAverage());
		//End of user code
	}
	private void setterNGetterFanPressure() throws Exception {
		//Start of user code getter and setter for fanPressure attribute
		Reading unsavedProject = readingBuilder.fanPressure(0.0).build();
		Reading savedProject = manager.save(unsavedProject);
		Reading dbProject = manager.get(Reading.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getfanPressure());
		//End of user code
	}
	private void setterNGetterLowFlow() throws Exception {
		//Start of user code getter and setter for lowFlow attribute
		Reading unsavedProject = readingBuilder.lowFlow(false).build();
		Reading savedProject = manager.save(unsavedProject);
		Reading dbProject = manager.get(Reading.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getlowFlow());
		//End of user code
	}
	private void setterNGetterBuildingPressure() throws Exception {
		//Start of user code getter and setter for buildingPressure attribute
		Reading unsavedProject = readingBuilder.buildingPressure(0.0).build();
		Reading savedProject = manager.save(unsavedProject);
		Reading dbProject = manager.get(Reading.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getbuildingPressure());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Reading unsavedProject = readingBuilder.id(0L).build();
		Reading savedProject = manager.save(unsavedProject);
		Reading dbProject = manager.get(Reading.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Reading unsavedProject = readingBuilder.creationDate(new java.util.Date()).build();
		Reading savedProject = manager.save(unsavedProject);
		Reading dbProject = manager.get(Reading.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Reading unsavedProject = readingBuilder.updateDate(new java.util.Date()).build();
		Reading savedProject = manager.save(unsavedProject);
		Reading dbProject = manager.get(Reading.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Reading unsavedProject = readingBuilder.version(0).build();
		Reading savedProject = manager.save(unsavedProject);
		Reading dbProject = manager.get(Reading.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
