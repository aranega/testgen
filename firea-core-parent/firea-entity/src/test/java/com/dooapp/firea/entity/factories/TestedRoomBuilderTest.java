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
	public void setterNGetterChoosenProtectedHeight() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.choosenProtectedHeight(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getChoosenProtectedHeight());
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
	public void setterNGetterTotalHeight() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.totalHeight(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getTotalHeight());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVolumeCorrection() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.volumeCorrection(0).build();
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
	public void setterNGetterCommissioningDate() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.CommissioningDate(new java.util.Date()).build();
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
	public void setterNGetterIndicatedVolume() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.indicatedVolume(0).build();
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
	public void setterNGetterDroppedFloor() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.droppedFloor(0).build();
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
	public void setterNGetterMainHeight() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.mainHeight(0).build();
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
	public void setterNGetterNetVolume() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.netVolume(0).build();
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
	public void setterNGetterRisqueHeight() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.risqueHeight(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getRisqueHeight());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterClimVMCAuto() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.climVMCAuto("").build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getClimVMCAuto());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUnloadTime() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.unloadTime(0).build();
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
	public void setterNGetterMinimalProtectedHeight() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.minimalProtectedHeight(0).build();
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
	public void setterNGetterDroppedCeiling() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.droppedCeiling(0).build();
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
	public void setterNGetterMeasuredVolume() throws Exception {
		TestedRoom unsavedTestedRoom = testedRoomBuilder.measuredVolume(0).build();
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
	public void refSetterBlowholesTest() throws Exception {	
		com.dooapp.firea.wrapper.BlowHole elem1 = new com.dooapp.firea.wrapper.BlowHole();
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.blowholes(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getBlowholes());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterBlowholesClassicTest() throws Exception {
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getBlowholes());
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
	public void oppositeBlowholesTest() throws Exception {
		com.dooapp.firea.wrapper.BlowHole elem1 = new com.dooapp.firea.wrapper.BlowHole();
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.blowholes(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getBlowholes().getTestedroom());
		Assert.assertEquals(dbTestedRoom, dbTestedRoom.getBlowholes().getTestedroom());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeBlowholesClassicTest() throws Exception {
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getBlowholes().getTestedroom());
		Assert.assertEquals(dbTestedRoom, dbTestedRoom.getBlowholes().getTestedroom());
	}
	
	

}
