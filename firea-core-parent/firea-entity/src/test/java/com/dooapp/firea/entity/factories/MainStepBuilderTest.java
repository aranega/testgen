package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.MainStep;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class MainStepBuilderTest
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
	private MainStepBuilder<?> mainStepBuilder;
	
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
		MainStep unsavedMainStep= mainStepBuilder.build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterAttribute() throws Exception {
		MainStep unsavedMainStep = mainStepBuilder.attribute("").build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getAttribute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterStatus() throws Exception {
		MainStep unsavedMainStep = mainStepBuilder.status("").build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getStatus());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		MainStep unsavedMainStep = mainStepBuilder.id(0L).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		MainStep unsavedMainStep = mainStepBuilder.creationDate(new java.util.Date()).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		MainStep unsavedMainStep = mainStepBuilder.updateDate(new java.util.Date()).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		MainStep unsavedMainStep = mainStepBuilder.version(0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getVersion());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCl() throws Exception {
		MainStep unsavedMainStep = mainStepBuilder.cl(0.0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getCl());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCalculatedELA() throws Exception {
		MainStep unsavedMainStep = mainStepBuilder.calculatedELA(0.0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getCalculatedELA());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDirection() throws Exception {
		MainStep unsavedMainStep = mainStepBuilder.direction("").build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getDirection());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterN() throws Exception {
		MainStep unsavedMainStep = mainStepBuilder.n(0.0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getN());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCorrelation() throws Exception {
		MainStep unsavedMainStep = mainStepBuilder.correlation(0.0).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep.getCorrelation());
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
	public void refSetterSampleTest() throws Exception {	
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		MainStep unsavedMainStep =  mainStepBuilder.sample(elem1).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterSampleClassicTest() throws Exception {
		MainStep unsavedMainStep =  mainStepBuilder.build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterPointsTest() throws Exception {	
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		MainStep unsavedMainStep =  mainStepBuilder.points(elem1).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getPoints());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterPointsClassicTest() throws Exception {
		MainStep unsavedMainStep =  mainStepBuilder.build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getPoints());
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
	public void oppositeSampleTest() throws Exception {
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		MainStep unsavedMainStep =  mainStepBuilder.sample(elem1).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getSample().getStep());
		Assert.assertEquals(dbMainStep, dbMainStep.getSample().getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeSampleClassicTest() throws Exception {
		MainStep unsavedMainStep =  mainStepBuilder.build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getSample().getStep());
		Assert.assertEquals(dbMainStep, dbMainStep.getSample().getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositePointsTest() throws Exception {
		com.dooapp.firea.wrapper.Point elem1 = new com.dooapp.firea.wrapper.Point();
		MainStep unsavedMainStep =  mainStepBuilder.points(elem1).build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getPoints().getStep());
		Assert.assertEquals(dbMainStep, dbMainStep.getPoints().getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositePointsClassicTest() throws Exception {
		MainStep unsavedMainStep =  mainStepBuilder.build();
		MainStep savedMainStep = manager.save(unsavedMainStep);
		MainStep dbMainStep = manager.get(MainStep.class, savedMainStep.getId());
		Assert.assertNotNull(dbMainStep);
		Assert.assertNotNull(dbMainStep.getPoints().getStep());
		Assert.assertEquals(dbMainStep, dbMainStep.getPoints().getStep());
	}
	
	

}
