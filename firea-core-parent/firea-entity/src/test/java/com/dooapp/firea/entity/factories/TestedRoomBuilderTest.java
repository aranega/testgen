package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

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
	public static void setupBefore() {
		
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
	@Ignore
	public void justTryToPersiste() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterCommissioningDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterAltitude() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterChoosenProtectedHeight() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterClapetsCF() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterClimDuct() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterClimReclycle() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterClimReclycleAuto() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterClimVMC() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterClimVMCAuto() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterClimWithNewAir() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterClimWithNewAirAuto() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterCreationDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterDroppedCeiling() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterDroppedFloor() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterId() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterIndicatedVolume() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterMainHeight() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterMeasuredVolume() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterMecanicalStrength() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterMinimalProtectedHeight() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterName() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterNetVolume() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterRisqueHeight() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterRisqueHeightPercent() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterTotalHeight() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterUniformHorizontality() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterUnloadTime() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterUpdateDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterVersion() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
		TestedRoom unsavedTestedRoom = testedRoomBuilder.version(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getVersion());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterVolumeCorrection() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
		TestedRoom unsavedTestedRoom = testedRoomBuilder.volumeCorrection(0).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom.getVolumeCorrection());
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
	@Ignore
	public void refSetterBlowholesTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
		com.dooapp.firea.wrapper.BlowHole elem1 = (new com.dooapp.firea.entity.BlowHoleBean()).getWrapper(); 
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.blowholes(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertFalse(dbTestedRoom.getBlowholes().isEmpty());
		Assert.assertEquals(1, dbTestedRoom.getBlowholes().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refAutoSetterSerializeBlowholesTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertFalse(dbTestedRoom.getBlowholes().isEmpty());
		Assert.assertEquals(1, dbTestedRoom.getBlowholes().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterProjectTest() throws Exception {	
		
		com.dooapp.firea.wrapper.Project elem1 = (new com.dooapp.firea.entity.ProjectBean()).getWrapper(); 
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.project(elem1).build();
		Assert.assertNotNull(unsavedTestedRoom);
		Assert.assertNotNull(unsavedTestedRoom.getProject());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refSetterSerializeProjectTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
	
		com.dooapp.firea.wrapper.Project elem1 = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.project(elem1).build();
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
	@Ignore
	public void oppositeBlowholesTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		testedRoomBuilder.project(projectWrapper);
		
	
		com.dooapp.firea.wrapper.BlowHole elem1 = (new com.dooapp.firea.entity.BlowHoleBean()).getWrapper(); 
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.blowholes(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getBlowholes().get(0).getTestedroom());
		Assert.assertEquals(dbTestedRoom, dbTestedRoom.getBlowholes().get(0).getTestedroom());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void oppositeProjectTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
	
		com.dooapp.firea.wrapper.Project elem1 = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		TestedRoom unsavedTestedRoom =  testedRoomBuilder.project(elem1).build();
		TestedRoom savedTestedRoom = manager.save(unsavedTestedRoom);
		TestedRoom dbTestedRoom = manager.get(TestedRoom.class, savedTestedRoom.getId());
		Assert.assertNotNull(dbTestedRoom);
		Assert.assertNotNull(dbTestedRoom.getProject().getTestedroom());
		Assert.assertEquals(dbTestedRoom, dbTestedRoom.getProject().getTestedroom());
	}
	
	
}
