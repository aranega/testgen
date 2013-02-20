package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.TestedRoom;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class TestedRoomBuilderTest
{	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	private EntityManager manager;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	private TestedRoomBuilder<?> testedRoomBuilder;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@BeforeClass
	public void setupBefore() {
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Before
	public void setup() {
		/*	System.setProperty("WORKSPACE", "target");
			System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
			System.setProperty("hibernate.connection.username", "sa");
			System.setProperty("hibernate.connection.password", "");
		*/
		IOC.getInjector().injectMembers(this);
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void justTryToPersiste() throws Exception {
		TestedRoom unsavedTestedRoom= testedRoomBuilder.build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDroppedFloor() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.droppedFloor(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getDroppedFloor());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterClimWithNewAir() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climWithNewAir(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimWithNewAir());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDroppedCeiling() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.droppedCeiling(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getDroppedCeiling());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUniformHorizontality() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.uniformHorizontality(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isUniformHorizontality());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterMeasuredTemperature() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.measuredTemperature(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getMeasuredTemperature());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterPrescribedTemperature() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.prescribedTemperature(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getPrescribedTemperature());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterClapetsCF() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.clapetsCF(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClapetsCF());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterMainHeight() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.mainHeight(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getMainHeight());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterClimDuct() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climDuct(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimDuct());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterMinimalProtectedHeight() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.minimalProtectedHeight(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getMinimalProtectedHeight());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterMecanicalStrength() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.mecanicalStrength(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getMecanicalStrength());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterIndicatedVolume() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.indicatedVolume(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getIndicatedVolume());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUnloadTime() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.unloadTime(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getUnloadTime());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterClimWithNewAirAuto() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climWithNewAirAuto(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimWithNewAirAuto());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterNetVolume() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.netVolume(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getNetVolume());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterMeasuredPressure() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.measuredPressure(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getMeasuredPressure());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterRisqueHeightPercent() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.risqueHeightPercent(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getRisqueHeightPercent());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterClimVMC() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climVMC(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimVMC());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterAltitude() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.altitude(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getAltitude());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterPrescribedPressure() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.prescribedPressure(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getPrescribedPressure());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVolumeCorrection() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.volumeCorrection(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getVolumeCorrection());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterName() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.name("").build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getName());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterClimReclycleAuto() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climReclycleAuto(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimReclycleAuto());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterMeasuredVolume() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.measuredVolume(0.0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getMeasuredVolume());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCommissioningDate() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.commissioningDate(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getCommissioningDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterClimVMCAuto() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climVMCAuto(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimVMCAuto());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterClimReclycle() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climReclycle(false).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.isClimReclycle());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.id(0L).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.creationDate(new java.util.Date()).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.updateDate(new java.util.Date()).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.version(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getVersion());
	}
	
	
	/********************
	 * Basic Refs tester
	 ********************/

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterBlowholeconfigurationTest() throws Exception {	
		com.dooapp.firea.wrapper.BlowHoleConfiguration elem1 = new com.dooapp.firea.wrapper.BlowHoleConfiguration();
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.blowholeconfiguration(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getBlowholeconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterBlowholeconfigurationClassicTest() throws Exception {
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getBlowholeconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterProjectTest() throws Exception {	
		com.dooapp.firea.wrapper.Project elem1 = new com.dooapp.firea.wrapper.Project();
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.project(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getProject());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterProjectClassicTest() throws Exception {
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getProject());
	}
	
	

	/*****************************
	 * Basic Refs opposite tester
	 *****************************/

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeBlowholeconfigurationTest() throws Exception {
		com.dooapp.firea.wrapper.BlowHoleConfiguration elem1 = new com.dooapp.firea.wrapper.BlowHoleConfiguration();
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.blowholeconfiguration(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getBlowholeconfiguration().getTestedroom());
		Assert.assertEquals(dbTestedRoom, dbTestedRoom.getBlowholeconfiguration().getTestedroom());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeBlowholeconfigurationClassicTest() throws Exception {
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getBlowholeconfiguration().getTestedroom());
		Assert.assertEquals(dbTestedRoom, dbTestedRoom.getBlowholeconfiguration().getTestedroom());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeProjectTest() throws Exception {
		com.dooapp.firea.wrapper.Project elem1 = new com.dooapp.firea.wrapper.Project();
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.project(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getProject().getTestedroom());
		Assert.assertEquals(dbTestedRoom, dbTestedRoom.getProject().getTestedroom());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeProjectClassicTest() throws Exception {
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getProject().getTestedroom());
		Assert.assertEquals(dbTestedRoom, dbTestedRoom.getProject().getTestedroom());
	}
	
	

}
