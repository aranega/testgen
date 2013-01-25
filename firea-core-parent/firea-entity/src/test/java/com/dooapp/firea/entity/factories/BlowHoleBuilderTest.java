package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.BlowHoleBuilder;
import com.dooapp.firea.wrapper.BlowHole;

/*
 * Test Class
 * <!-- Start of user code comment for BlowHole Test Class
 * End of user code -->
 */


public class BlowHoleBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private BlowHoleBuilder<?> blowHoleBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(BlowHoleBuilderTest.class).justTryToPersiste();
		//Start of user code main of BlowHole
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		BlowHole unsavedProject = blowHoleBuilder.build();
		BlowHole savedProject = manager.save(unsavedProject);
		BlowHole dbProject = manager.get(BlowHole.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for BlowHole
		
		//End of user code
	}
	private void setterNGetterSurface() throws Exception {
		//Start of user code getter and setter for surface attribute
		BlowHole unsavedProject = blowHoleBuilder.surface(0.0).build();
		BlowHole savedProject = manager.save(unsavedProject);
		BlowHole dbProject = manager.get(BlowHole.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getsurface());
		//End of user code
	}
	private void setterNGetterDischarge() throws Exception {
		//Start of user code getter and setter for Discharge attribute
		BlowHole unsavedProject = blowHoleBuilder.Discharge("").build();
		BlowHole savedProject = manager.save(unsavedProject);
		BlowHole dbProject = manager.get(BlowHole.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getDischarge());
		//End of user code
	}
	private void setterNGetterQuantity() throws Exception {
		//Start of user code getter and setter for quantity attribute
		BlowHole unsavedProject = blowHoleBuilder.quantity(0).build();
		BlowHole savedProject = manager.save(unsavedProject);
		BlowHole dbProject = manager.get(BlowHole.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getquantity());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		BlowHole unsavedProject = blowHoleBuilder.id(0L).build();
		BlowHole savedProject = manager.save(unsavedProject);
		BlowHole dbProject = manager.get(BlowHole.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		BlowHole unsavedProject = blowHoleBuilder.creationDate(new java.util.Date()).build();
		BlowHole savedProject = manager.save(unsavedProject);
		BlowHole dbProject = manager.get(BlowHole.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		BlowHole unsavedProject = blowHoleBuilder.updateDate(new java.util.Date()).build();
		BlowHole savedProject = manager.save(unsavedProject);
		BlowHole dbProject = manager.get(BlowHole.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		BlowHole unsavedProject = blowHoleBuilder.version(0).build();
		BlowHole savedProject = manager.save(unsavedProject);
		BlowHole dbProject = manager.get(BlowHole.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
