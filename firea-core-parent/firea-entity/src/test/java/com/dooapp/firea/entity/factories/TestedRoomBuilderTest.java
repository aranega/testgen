package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

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
	
	@Before
	public void setup() {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().injectMembers(this);
	}
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(TestedRoomBuilderTest.class).justTryToPersiste();
		//Start of user code main of TestedRoom
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		TestedRoom unsavedTestedRoom= testedRoomBuilder.build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		//Start of user code try to persist for TestedRoom
		
		//End of user code
	}
	@Test
	public void setterNGetterClimReclycle() throws Exception {
		//Start of user code getter and setter for climReclycle attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climReclycle(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimReclycle());
		//End of user code
	}
	@Test
	public void setterNGetterClimVMC() throws Exception {
		//Start of user code getter and setter for climVMC attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climVMC(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimVMC());
		//End of user code
	}
	@Test
	public void setterNGetterClimDuct() throws Exception {
		//Start of user code getter and setter for climDuct attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climDuct(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimDuct());
		//End of user code
	}
	@Test
	public void setterNGetterRisqueHeightPercent() throws Exception {
		//Start of user code getter and setter for risqueHeightPercent attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.risqueHeightPercent(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getRisqueHeightPercent());
		//End of user code
	}
	@Test
	public void setterNGetterMecanicalStrength() throws Exception {
		//Start of user code getter and setter for mecanicalStrength attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.mecanicalStrength(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getMecanicalStrength());
		//End of user code
	}
	@Test
	public void setterNGetterMeasuredVolume() throws Exception {
		//Start of user code getter and setter for measuredVolume attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.measuredVolume(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getMeasuredVolume());
		//End of user code
	}
	@Test
	public void setterNGetterChoosenProtectedHeight() throws Exception {
		//Start of user code getter and setter for choosenProtectedHeight attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.choosenProtectedHeight(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getChoosenProtectedHeight());
		//End of user code
	}
	@Test
	public void setterNGetterName() throws Exception {
		//Start of user code getter and setter for name attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.name("").build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getName());
		//End of user code
	}
	@Test
	public void setterNGetterClimWithNewAir() throws Exception {
		//Start of user code getter and setter for climWithNewAir attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climWithNewAir(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimWithNewAir());
		//End of user code
	}
	@Test
	public void setterNGetterNetVolume() throws Exception {
		//Start of user code getter and setter for netVolume attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.netVolume(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getNetVolume());
		//End of user code
	}
	@Test
	public void setterNGetterDroppedCeiling() throws Exception {
		//Start of user code getter and setter for droppedCeiling attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.droppedCeiling(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getDroppedCeiling());
		//End of user code
	}
	@Test
	public void setterNGetterClimVMCAuto() throws Exception {
		//Start of user code getter and setter for climVMCAuto attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climVMCAuto(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimVMCAuto());
		//End of user code
	}
	@Test
	public void setterNGetterVolumeCorrection() throws Exception {
		//Start of user code getter and setter for volumeCorrection attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.volumeCorrection(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getVolumeCorrection());
		//End of user code
	}
	@Test
	public void setterNGetterClimWithNewAirAuto() throws Exception {
		//Start of user code getter and setter for climWithNewAirAuto attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climWithNewAirAuto(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimWithNewAirAuto());
		//End of user code
	}
	@Test
	public void setterNGetterAltitude() throws Exception {
		//Start of user code getter and setter for altitude attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.altitude(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getAltitude());
		//End of user code
	}
	@Test
	public void setterNGetterDroppedFloor() throws Exception {
		//Start of user code getter and setter for droppedFloor attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.droppedFloor(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getDroppedFloor());
		//End of user code
	}
	@Test
	public void setterNGetterIndicatedVolume() throws Exception {
		//Start of user code getter and setter for indicatedVolume attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.indicatedVolume(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getIndicatedVolume());
		//End of user code
	}
	@Test
	public void setterNGetterRisqueHeight() throws Exception {
		//Start of user code getter and setter for risqueHeight attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.risqueHeight(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getRisqueHeight());
		//End of user code
	}
	@Test
	public void setterNGetterUniformHorizontality() throws Exception {
		//Start of user code getter and setter for uniformHorizontality attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.uniformHorizontality(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isUniformHorizontality());
		//End of user code
	}
	@Test
	public void setterNGetterClimReclycleAuto() throws Exception {
		//Start of user code getter and setter for climReclycleAuto attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climReclycleAuto(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimReclycleAuto());
		//End of user code
	}
	@Test
	public void setterNGetterMainHeight() throws Exception {
		//Start of user code getter and setter for mainHeight attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.mainHeight(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getMainHeight());
		//End of user code
	}
	@Test
	public void setterNGetterUnloadTime() throws Exception {
		//Start of user code getter and setter for unloadTime attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.unloadTime(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getUnloadTime());
		//End of user code
	}
	@Test
	public void setterNGetterClapetsCF() throws Exception {
		//Start of user code getter and setter for clapetsCF attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.clapetsCF(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClapetsCF());
		//End of user code
	}
	@Test
	public void setterNGetterMinimalProtectedHeight() throws Exception {
		//Start of user code getter and setter for minimalProtectedHeight attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.minimalProtectedHeight(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getMinimalProtectedHeight());
		//End of user code
	}
	@Test
	public void setterNGetterTotalHeight() throws Exception {
		//Start of user code getter and setter for totalHeight attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.totalHeight(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getTotalHeight());
		//End of user code
	}
	@Test
	public void setterNGetterCommissioningDate() throws Exception {
		//Start of user code getter and setter for CommissioningDate attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.CommissioningDate(new java.util.Date()).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getCommissioningDate());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.id(0L).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.creationDate(new java.util.Date()).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.updateDate(new java.util.Date()).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		TestedRoom unsavedTestedRoom = testedRoomBuilder.version(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterBlowholesTest() throws Exception {
		//Start of user code basic reference test for blowholes reference
		com.dooapp.firea.wrapper.BlowHole elem1 = new com.dooapp.firea.wrapper.BlowHole();
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.blowholes(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertFalse(dbTestedRoom.getBlowholes().isEmpty());
		Assert.assertEquals(1, dbTestedRoom.getBlowholes().size());
		//End of user code
	}
	
	@Test
	public void refSetterProjectTest() throws Exception {	
		//Start of user code basic reference test for project reference
		com.dooapp.firea.wrapper.Project elem1 = new com.dooapp.firea.wrapper.Project();
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.project(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getProject());
		//End of user code
	}
	
	@Test
	public void refSetterProjectClassicTest() throws Exception {
		//Start of user code basic classic reference test for project reference
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getProject());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeBlowholesTest() throws Exception {
		//Start of user code basic opposite test for blowholes reference
		com.dooapp.firea.wrapper.BlowHole elem1 = new com.dooapp.firea.wrapper.BlowHole();
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.blowholes(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getBlowholes().get(0).getTestedroom());
		Assert.assertEquals(dbTestedRoom, dbTestedRoom.getBlowholes().get(0).getTestedroom());
		//End of user code
	}
	
	@Test
	public void oppositeProjectTest() throws Exception {
		//Start of user code basic opposite test for project reference
		com.dooapp.firea.wrapper.Project elem1 = new com.dooapp.firea.wrapper.Project();
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.project(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getProject().getTestedroom());
		Assert.assertEquals(dbTestedRoom, dbTestedRoom.getProject().getTestedroom());
		//End of user code
	}
	
	@Test
	public void oppositeProjectClassicTest() throws Exception {
		//Start of user code basic classic opposite test for project reference
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getProject().getTestedroom());
		Assert.assertEquals(dbTestedRoom, dbTestedRoom.getProject().getTestedroom());
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
