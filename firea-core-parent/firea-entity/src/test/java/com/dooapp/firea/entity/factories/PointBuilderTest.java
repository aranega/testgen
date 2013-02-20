package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.firea.entity.PointStatus;

import com.dooapp.firea.wrapper.Point;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class PointBuilderTest
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
	private PointBuilder<?> pointBuilder;
	
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
		Point unsavedPoint= pointBuilder.build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCl() throws Exception {
		Point unsavedPoint = pointBuilder.cl(0.0).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getCl());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterPressureGoal() throws Exception {
		Point unsavedPoint = pointBuilder.pressureGoal(0.0).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getPressureGoal());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVl() throws Exception {
		Point unsavedPoint = pointBuilder.vl(0.0).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getVl());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterN() throws Exception {
		Point unsavedPoint = pointBuilder.n(0.0).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getN());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterEla() throws Exception {
		Point unsavedPoint = pointBuilder.ela(0.0).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getEla());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDeltaPm() throws Exception {
		Point unsavedPoint = pointBuilder.deltaPm(0.0).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getDeltaPm());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterStatus() throws Exception {
		Point unsavedPoint = pointBuilder.status(PointStatus.NO_STARTED).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getStatus());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		Point unsavedPoint = pointBuilder.id(0L).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		Point unsavedPoint = pointBuilder.creationDate(new java.util.Date()).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		Point unsavedPoint = pointBuilder.updateDate(new java.util.Date()).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		Point unsavedPoint = pointBuilder.version(0).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint.getVersion());
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
	public void refSetterReadingsTest() throws Exception {
		com.dooapp.firea.wrapper.Reading elem1 = new com.dooapp.firea.wrapper.Reading();
		Point unsavedPoint =  pointBuilder.readings(elem1).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertFalse(dbPoint.getReadings().isEmpty());
		Assert.assertEquals(1, dbPoint.getReadings().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterStepTest() throws Exception {	
		com.dooapp.firea.wrapper.Step elem1 = new com.dooapp.firea.wrapper.Step();
		Point unsavedPoint =  pointBuilder.step(elem1).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertNotNull(dbPoint.getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterStepClassicTest() throws Exception {
		Point unsavedPoint =  pointBuilder.build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertNotNull(dbPoint.getStep());
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
	public void oppositeReadingsTest() throws Exception {
		com.dooapp.firea.wrapper.Reading elem1 = new com.dooapp.firea.wrapper.Reading();
		Point unsavedPoint =  pointBuilder.readings(elem1).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertNotNull(dbPoint.getReadings().get(0).getPoint());
		Assert.assertEquals(dbPoint, dbPoint.getReadings().get(0).getPoint());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeStepTest() throws Exception {
		com.dooapp.firea.wrapper.Step elem1 = new com.dooapp.firea.wrapper.Step();
		Point unsavedPoint =  pointBuilder.step(elem1).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertFalse(dbPoint.getStep().getPoints().isEmpty());
		Assert.assertTrue(dbPoint.getStep().getPoints().contains(dbPoint));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeStepClassicTest() throws Exception {
		Point unsavedPoint =  pointBuilder.build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertFalse(dbPoint.getStep().getPoints().isEmpty());
		Assert.assertTrue(dbPoint.getStep().getPoints().contains(dbPoint));
	}
	
	

}
