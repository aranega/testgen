package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.PointBuilder;
import com.dooapp.firea.wrapper.Point;

/*
 * Test Class
 * <!-- Start of user code comment for Point Test Class
 * End of user code -->
 */


public class PointBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private PointBuilder<?> pointBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(PointBuilderTest.class).justTryToPersiste();
		//Start of user code main of Point
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		Point unsavedProject = pointBuilder.build();
		Point savedProject = manager.save(unsavedProject);
		Point dbProject = manager.get(Point.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for Point
		
		//End of user code
	}
	private void setterNGetterPressureGoal() throws Exception {
		//Start of user code getter and setter for pressureGoal attribute
		Point unsavedProject = pointBuilder.pressureGoal(0.0).build();
		Point savedProject = manager.save(unsavedProject);
		Point dbProject = manager.get(Point.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getpressureGoal());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Point unsavedProject = pointBuilder.id(0L).build();
		Point savedProject = manager.save(unsavedProject);
		Point dbProject = manager.get(Point.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Point unsavedProject = pointBuilder.creationDate(new java.util.Date()).build();
		Point savedProject = manager.save(unsavedProject);
		Point dbProject = manager.get(Point.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Point unsavedProject = pointBuilder.updateDate(new java.util.Date()).build();
		Point savedProject = manager.save(unsavedProject);
		Point dbProject = manager.get(Point.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Point unsavedProject = pointBuilder.version(0).build();
		Point savedProject = manager.save(unsavedProject);
		Point dbProject = manager.get(Point.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
