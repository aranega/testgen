package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.ProjectBuilder;
import com.dooapp.firea.wrapper.Project;

/*
 * Test Class
 * <!-- Start of user code comment for Project Test Class
 * End of user code -->
 */


public class ProjectBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private ProjectBuilder<?> projectBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(ProjectBuilderTest.class).justTryToPersiste();
		//Start of user code main of Project
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		Project unsavedProject = projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for Project
		
		//End of user code
	}
	private void setterNGetterKind() throws Exception {
		//Start of user code getter and setter for kind attribute
		Project unsavedProject = projectBuilder.kind("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getkind());
		//End of user code
	}
	private void setterNGetterDescription() throws Exception {
		//Start of user code getter and setter for description attribute
		Project unsavedProject = projectBuilder.description("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdescription());
		//End of user code
	}
	private void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		Project unsavedProject = projectBuilder.name("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getname());
		//End of user code
	}
	private void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for Status attribute
		Project unsavedProject = projectBuilder.Status("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getStatus());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Project unsavedProject = projectBuilder.id(0L).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Project unsavedProject = projectBuilder.creationDate(new java.util.Date()).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Project unsavedProject = projectBuilder.updateDate(new java.util.Date()).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Project unsavedProject = projectBuilder.version(0).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
