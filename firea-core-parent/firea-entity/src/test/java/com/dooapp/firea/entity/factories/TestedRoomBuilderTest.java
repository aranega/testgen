package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.TestedRoomBuilder;
import com.dooapp.firea.wrapper.TestedRoom;

/*
 * Test Class
 * <!-- Start of user code comment for TestedRoom Test Class
 * End of user code -->
 */


public class TestedRoomBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private TestedRoomBuilder<?> testedRoomBuilder;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(TestedRoomBuilderTest.class).justTryToPersiste();
		//Start of user code main of TestedRoom
		//End of user code
	}
	
	private void justTryToPersiste() throws Exception {
		TestedRoom unsavedProject = testedRoomBuilder.build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject);
		//Start of user code try to persist for TestedRoom
		
		//End of user code
	}
	private void setterNGetterClapetsCF() throws Exception {
		//Start of user code getter and setter for clapetsCF attribute
		TestedRoom unsavedProject = testedRoomBuilder.clapetsCF(false).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getclapetsCF());
		//End of user code
	}
	private void setterNGetterClimWithNewAirAuto() throws Exception {
		//Start of user code getter and setter for climWithNewAirAuto attribute
		TestedRoom unsavedProject = testedRoomBuilder.climWithNewAirAuto(false).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getclimWithNewAirAuto());
		//End of user code
	}
	private void setterNGetterCommissioningDate() throws Exception {
		//Start of user code getter and setter for CommissioningDate attribute
		TestedRoom unsavedProject = testedRoomBuilder.CommissioningDate(new java.util.Date()).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getCommissioningDate());
		//End of user code
	}
	private void setterNGetterClimReclycle() throws Exception {
		//Start of user code getter and setter for climReclycle attribute
		TestedRoom unsavedProject = testedRoomBuilder.climReclycle(false).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getclimReclycle());
		//End of user code
	}
	private void setterNGetterClimVMC() throws Exception {
		//Start of user code getter and setter for climVMC attribute
		TestedRoom unsavedProject = testedRoomBuilder.climVMC(false).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getclimVMC());
		//End of user code
	}
	private void setterNGetterRisqueHeightPercent() throws Exception {
		//Start of user code getter and setter for risqueHeightPercent attribute
		TestedRoom unsavedProject = testedRoomBuilder.risqueHeightPercent(0.0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getrisqueHeightPercent());
		//End of user code
	}
	private void setterNGetterAltitude() throws Exception {
		//Start of user code getter and setter for altitude attribute
		TestedRoom unsavedProject = testedRoomBuilder.altitude(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getaltitude());
		//End of user code
	}
	private void setterNGetterNetVolume() throws Exception {
		//Start of user code getter and setter for netVolume attribute
		TestedRoom unsavedProject = testedRoomBuilder.netVolume(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getnetVolume());
		//End of user code
	}
	private void setterNGetterUnloadTime() throws Exception {
		//Start of user code getter and setter for unloadTime attribute
		TestedRoom unsavedProject = testedRoomBuilder.unloadTime(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getunloadTime());
		//End of user code
	}
	private void setterNGetterClimReclycleAuto() throws Exception {
		//Start of user code getter and setter for climReclycleAuto attribute
		TestedRoom unsavedProject = testedRoomBuilder.climReclycleAuto(false).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getclimReclycleAuto());
		//End of user code
	}
	private void setterNGetterTotalHeight() throws Exception {
		//Start of user code getter and setter for totalHeight attribute
		TestedRoom unsavedProject = testedRoomBuilder.totalHeight(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.gettotalHeight());
		//End of user code
	}
	private void setterNGetterIndicatedVolume() throws Exception {
		//Start of user code getter and setter for indicatedVolume attribute
		TestedRoom unsavedProject = testedRoomBuilder.indicatedVolume(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getindicatedVolume());
		//End of user code
	}
	private void setterNGetterMinimalProtectedHeight() throws Exception {
		//Start of user code getter and setter for minimalProtectedHeight attribute
		TestedRoom unsavedProject = testedRoomBuilder.minimalProtectedHeight(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getminimalProtectedHeight());
		//End of user code
	}
	private void setterNGetterClimVMCAuto() throws Exception {
		//Start of user code getter and setter for climVMCAuto attribute
		TestedRoom unsavedProject = testedRoomBuilder.climVMCAuto("").build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getclimVMCAuto());
		//End of user code
	}
	private void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		TestedRoom unsavedProject = testedRoomBuilder.name("").build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getname());
		//End of user code
	}
	private void setterNGetterChoosenProtectedHeight() throws Exception {
		//Start of user code getter and setter for choosenProtectedHeight attribute
		TestedRoom unsavedProject = testedRoomBuilder.choosenProtectedHeight(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getchoosenProtectedHeight());
		//End of user code
	}
	private void setterNGetterMeasuredVolume() throws Exception {
		//Start of user code getter and setter for measuredVolume attribute
		TestedRoom unsavedProject = testedRoomBuilder.measuredVolume(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getmeasuredVolume());
		//End of user code
	}
	private void setterNGetterDroppedFloor() throws Exception {
		//Start of user code getter and setter for droppedFloor attribute
		TestedRoom unsavedProject = testedRoomBuilder.droppedFloor(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdroppedFloor());
		//End of user code
	}
	private void setterNGetterDroppedCeiling() throws Exception {
		//Start of user code getter and setter for droppedCeiling attribute
		TestedRoom unsavedProject = testedRoomBuilder.droppedCeiling(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getdroppedCeiling());
		//End of user code
	}
	private void setterNGetterClimWithNewAir() throws Exception {
		//Start of user code getter and setter for climWithNewAir attribute
		TestedRoom unsavedProject = testedRoomBuilder.climWithNewAir(false).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getclimWithNewAir());
		//End of user code
	}
	private void setterNGetterMecanicalStrength() throws Exception {
		//Start of user code getter and setter for mecanicalStrength attribute
		TestedRoom unsavedProject = testedRoomBuilder.mecanicalStrength(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getmecanicalStrength());
		//End of user code
	}
	private void setterNGetterRisqueHeight() throws Exception {
		//Start of user code getter and setter for risqueHeight attribute
		TestedRoom unsavedProject = testedRoomBuilder.risqueHeight(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getrisqueHeight());
		//End of user code
	}
	private void setterNGetterMainHeight() throws Exception {
		//Start of user code getter and setter for mainHeight attribute
		TestedRoom unsavedProject = testedRoomBuilder.mainHeight(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getmainHeight());
		//End of user code
	}
	private void setterNGetterUniformHorizontality() throws Exception {
		//Start of user code getter and setter for uniformHorizontality attribute
		TestedRoom unsavedProject = testedRoomBuilder.uniformHorizontality(false).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getuniformHorizontality());
		//End of user code
	}
	private void setterNGetterVolumeCorrection() throws Exception {
		//Start of user code getter and setter for volumeCorrection attribute
		TestedRoom unsavedProject = testedRoomBuilder.volumeCorrection(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getvolumeCorrection());
		//End of user code
	}
	private void setterNGetterClimDuct() throws Exception {
		//Start of user code getter and setter for climDuct attribute
		TestedRoom unsavedProject = testedRoomBuilder.climDuct(false).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getclimDuct());
		//End of user code
	}
	private void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		TestedRoom unsavedProject = testedRoomBuilder.id(0L).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getid());
		//End of user code
	}
	private void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		TestedRoom unsavedProject = testedRoomBuilder.creationDate(new java.util.Date()).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getcreationDate());
		//End of user code
	}
	private void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		TestedRoom unsavedProject = testedRoomBuilder.updateDate(new java.util.Date()).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getupdateDate());
		//End of user code
	}
	private void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		TestedRoom unsavedProject = testedRoomBuilder.version(0).build();
		TestedRoom savedProject = manager.save(unsavedProject);
		TestedRoom dbProject = manager.get(TestedRoom.class, savedProject.getId());
		// Assert.assertNotNull(dbProject.getversion());
		//End of user code
	}
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
