package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.Reading;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class ReadingBuilderTest
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
	private ReadingBuilder<?> readingBuilder;
	
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
	
	public void justTryToPersiste() throws Exception {
	
		Reading unsavedReading= readingBuilder.build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterBuildingPressure() throws Exception {
	
		Reading unsavedReading = readingBuilder.buildingPressure(0.0).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getBuildingPressure());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterCreationDate() throws Exception {
	
		Reading unsavedReading = readingBuilder.creationDate(new java.util.Date()).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getCreationDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterFanPressure() throws Exception {
	
		Reading unsavedReading = readingBuilder.fanPressure(0.0).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getFanPressure());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterId() throws Exception {
	
		Reading unsavedReading = readingBuilder.id(0L).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getId());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterLowFlow() throws Exception {
	
		Reading unsavedReading = readingBuilder.lowFlow(false).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.isLowFlow());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterTimeAverage() throws Exception {
	
		Reading unsavedReading = readingBuilder.timeAverage(0).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getTimeAverage());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterUpdateDate() throws Exception {
	
		Reading unsavedReading = readingBuilder.updateDate(new java.util.Date()).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getUpdateDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterVersion() throws Exception {
	
		Reading unsavedReading = readingBuilder.version(0).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading.getVersion());
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
	
	public void refSetterDeviceTest() throws Exception {
	
		com.dooapp.firea.wrapper.Device elem1 = (new com.dooapp.firea.entity.DeviceBean()).getWrapper(); 
		Reading unsavedReading =  readingBuilder.device(elem1).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading);
		Assert.assertFalse(dbReading.getDevice().isEmpty());
		Assert.assertEquals(1, dbReading.getDevice().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterGaugemodeTest() throws Exception {	
		
		com.dooapp.firea.wrapper.GaugeMode elem1 = (new com.dooapp.firea.entity.GaugeModeBean()).getWrapper(); 
		Reading unsavedReading =  readingBuilder.gaugemode(elem1).build();
		Assert.assertNotNull(unsavedReading);
		Assert.assertNotNull(unsavedReading.getGaugemode());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializeGaugemodeTest() throws Exception {
	
		com.dooapp.firea.wrapper.GaugeMode elem1 = (new com.dooapp.firea.entity.GaugeModeBean()).getWrapper();
		Reading unsavedReading =  readingBuilder.gaugemode(elem1).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading);
		Assert.assertNotNull(dbReading.getGaugemode());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterPointTest() throws Exception {	
		
		com.dooapp.firea.wrapper.Point elem1 = (new com.dooapp.firea.entity.PointBean()).getWrapper(); 
		Reading unsavedReading =  readingBuilder.point(elem1).build();
		Assert.assertNotNull(unsavedReading);
		Assert.assertNotNull(unsavedReading.getPoint());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void refSetterSerializePointTest() throws Exception {
	
		com.dooapp.firea.wrapper.Point elem1 = (new com.dooapp.firea.entity.PointBean()).getWrapper();
		Reading unsavedReading =  readingBuilder.point(elem1).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading);
		Assert.assertNotNull(dbReading.getPoint());
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
	
	public void oppositePointTest() throws Exception {
	
		com.dooapp.firea.wrapper.Point elem1 = (new com.dooapp.firea.entity.PointBean()).getWrapper(); 
		Reading unsavedReading =  readingBuilder.point(elem1).build();
		Reading savedReading = manager.save(unsavedReading);
		Reading dbReading = manager.get(Reading.class, savedReading.getId());
		Assert.assertNotNull(dbReading);
		Assert.assertFalse(dbReading.getPoint().getReadings().isEmpty());
		Assert.assertTrue(dbReading.getPoint().getReadings().contains(dbReading));
	}
	
	
}
