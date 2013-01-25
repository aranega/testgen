package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.SampleBuilder;
import com.dooapp.firea.wrapper.Sample;

/*
 * Test Class
 * <!-- Start of user code comment for Sample Test Class
 * End of user code -->
 */


public class SampleBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private SampleBuilder<?> sampleBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(SampleBuilderTest.class).justTryToPersiste();
		//Start of user code main of Sample
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		Sample unsavedProject = sampleBuilder.build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for Sample
		
		//End of user code
	}
	private void setterNGetterDate() throws Exception {
		//Start of user code getter and setter for date attribute
		Sample unsavedProject = sampleBuilder.date(new java.util.Date()).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdate());
		//End of user code
	}
	private void setterNGetterRoE() throws Exception {
		//Start of user code getter and setter for roE attribute
		Sample unsavedProject = sampleBuilder.roE(0.0).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getroE());
		//End of user code
	}
	private void setterNGetterRoI() throws Exception {
		//Start of user code getter and setter for roI attribute
		Sample unsavedProject = sampleBuilder.roI(0.0).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getroI());
		//End of user code
	}
	private void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		Sample unsavedProject = sampleBuilder.name("").build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getname());
		//End of user code
	}
	private void setterNGetterWindMeasure() throws Exception {
		//Start of user code getter and setter for windMeasure attribute
		Sample unsavedProject = sampleBuilder.windMeasure(0.0).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getwindMeasure());
		//End of user code
	}
	private void setterNGetterTetaE() throws Exception {
		//Start of user code getter and setter for tetaE attribute
		Sample unsavedProject = sampleBuilder.tetaE(0.0).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.gettetaE());
		//End of user code
	}
	private void setterNGetterPhiEPercent() throws Exception {
		//Start of user code getter and setter for phiEPercent attribute
		Sample unsavedProject = sampleBuilder.phiEPercent(0.0).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getphiEPercent());
		//End of user code
	}
	private void setterNGetterAirPressureCalculationMethod() throws Exception {
		//Start of user code getter and setter for airPressureCalculationMethod attribute
		Sample unsavedProject = sampleBuilder.airPressureCalculationMethod("").build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getairPressureCalculationMethod());
		//End of user code
	}
	private void setterNGetterBeaufortScale() throws Exception {
		//Start of user code getter and setter for beaufortScale attribute
		Sample unsavedProject = sampleBuilder.beaufortScale("").build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getbeaufortScale());
		//End of user code
	}
	private void setterNGetterTetaI() throws Exception {
		//Start of user code getter and setter for tetaI attribute
		Sample unsavedProject = sampleBuilder.tetaI(0.0).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.gettetaI());
		//End of user code
	}
	private void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for status attribute
		Sample unsavedProject = sampleBuilder.status("").build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getstatus());
		//End of user code
	}
	private void setterNGetterAirPressure() throws Exception {
		//Start of user code getter and setter for airPressure attribute
		Sample unsavedProject = sampleBuilder.airPressure(0).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getairPressure());
		//End of user code
	}
	private void setterNGetterPhiIPercent() throws Exception {
		//Start of user code getter and setter for phiIPercent attribute
		Sample unsavedProject = sampleBuilder.phiIPercent(0.0).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getphiIPercent());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Sample unsavedProject = sampleBuilder.id(0L).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Sample unsavedProject = sampleBuilder.creationDate(new java.util.Date()).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Sample unsavedProject = sampleBuilder.updateDate(new java.util.Date()).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Sample unsavedProject = sampleBuilder.version(0).build();
		Sample savedProject = manager.save(unsavedProject);
		Sample dbProject = manager.get(Sample.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
