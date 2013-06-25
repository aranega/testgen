package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;


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
		// FIXME: Warning, the test will probably failed because Step required to be linked to a Sample via sample()  	
		com.dooapp.firea.wrapper.Step stepWrapper = (new com.dooapp.firea.entity.StepBean()).getWrapper();
		pointBuilder.step(stepWrapper);
		
	
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
	@Ignore
	public void setterNGetterCreationDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Step required to be linked to a Sample via sample()  	
		com.dooapp.firea.wrapper.Step stepWrapper = (new com.dooapp.firea.entity.StepBean()).getWrapper();
		pointBuilder.step(stepWrapper);
		
	
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
	@Ignore
	public void setterNGetterId() throws Exception {
		// FIXME: Warning, the test will probably failed because Step required to be linked to a Sample via sample()  	
		com.dooapp.firea.wrapper.Step stepWrapper = (new com.dooapp.firea.entity.StepBean()).getWrapper();
		pointBuilder.step(stepWrapper);
		
	
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
	@Ignore
	public void setterNGetterPressureGoal() throws Exception {
		// FIXME: Warning, the test will probably failed because Step required to be linked to a Sample via sample()  	
		com.dooapp.firea.wrapper.Step stepWrapper = (new com.dooapp.firea.entity.StepBean()).getWrapper();
		pointBuilder.step(stepWrapper);
		
	
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
	@Ignore
	public void setterNGetterUpdateDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Step required to be linked to a Sample via sample()  	
		com.dooapp.firea.wrapper.Step stepWrapper = (new com.dooapp.firea.entity.StepBean()).getWrapper();
		pointBuilder.step(stepWrapper);
		
	
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
	@Ignore
	public void setterNGetterVersion() throws Exception {
		// FIXME: Warning, the test will probably failed because Step required to be linked to a Sample via sample()  	
		com.dooapp.firea.wrapper.Step stepWrapper = (new com.dooapp.firea.entity.StepBean()).getWrapper();
		pointBuilder.step(stepWrapper);
		
	
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
	@Ignore
	public void refSetterReadingsTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Step required to be linked to a Sample via sample()  	
		com.dooapp.firea.wrapper.Step stepWrapper = (new com.dooapp.firea.entity.StepBean()).getWrapper();
		pointBuilder.step(stepWrapper);
		
	
		com.dooapp.firea.wrapper.Reading elem1 = (new com.dooapp.firea.entity.ReadingBean()).getWrapper(); 
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
		
		com.dooapp.firea.wrapper.Step elem1 = (new com.dooapp.firea.entity.StepBean()).getWrapper(); 
		Point unsavedPoint =  pointBuilder.step(elem1).build();
		Assert.assertNotNull(unsavedPoint);
		Assert.assertNotNull(unsavedPoint.getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refSetterSerializeStepTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Step required to be linked to a Sample via sample()  	
	
		com.dooapp.firea.wrapper.Step elem1 = (new com.dooapp.firea.entity.StepBean()).getWrapper();
		Point unsavedPoint =  pointBuilder.step(elem1).build();
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
	@Ignore
	public void oppositeReadingsTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Step required to be linked to a Sample via sample()  	
		com.dooapp.firea.wrapper.Step stepWrapper = (new com.dooapp.firea.entity.StepBean()).getWrapper();
		pointBuilder.step(stepWrapper);
		
	
		com.dooapp.firea.wrapper.Reading elem1 = (new com.dooapp.firea.entity.ReadingBean()).getWrapper(); 
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
	@Ignore
	public void oppositeStepTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Step required to be linked to a Sample via sample()  	
	
		com.dooapp.firea.wrapper.Step elem1 = (new com.dooapp.firea.entity.StepBean()).getWrapper(); 
		Point unsavedPoint =  pointBuilder.step(elem1).build();
		Point savedPoint = manager.save(unsavedPoint);
		Point dbPoint = manager.get(Point.class, savedPoint.getId());
		Assert.assertNotNull(dbPoint);
		Assert.assertFalse(dbPoint.getStep().getPoints().isEmpty());
		Assert.assertTrue(dbPoint.getStep().getPoints().contains(dbPoint));
	}
	
	
}
