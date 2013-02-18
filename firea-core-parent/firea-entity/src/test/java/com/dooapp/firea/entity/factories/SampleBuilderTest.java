package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.Sample;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class SampleBuilderTest
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
	private SampleBuilder<?> sampleBuilder;
	
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
		Sample unsavedSample= sampleBuilder.build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterPhiIPercent() throws Exception {
		Sample unsavedSample = sampleBuilder.phiIPercent(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getPhiIPercent());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterTetaI() throws Exception {
		Sample unsavedSample = sampleBuilder.tetaI(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getTetaI());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterStatus() throws Exception {
		Sample unsavedSample = sampleBuilder.status("").build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getStatus());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterAirPressure() throws Exception {
		Sample unsavedSample = sampleBuilder.airPressure(0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getAirPressure());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterName() throws Exception {
		Sample unsavedSample = sampleBuilder.name("").build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getName());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterBeaufortScale() throws Exception {
		Sample unsavedSample = sampleBuilder.beaufortScale("").build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getBeaufortScale());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterRoE() throws Exception {
		Sample unsavedSample = sampleBuilder.roE(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getRoE());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterTetaE() throws Exception {
		Sample unsavedSample = sampleBuilder.tetaE(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getTetaE());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterAirPressureCalculationMethod() throws Exception {
		Sample unsavedSample = sampleBuilder.airPressureCalculationMethod("").build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getAirPressureCalculationMethod());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterWindMeasure() throws Exception {
		Sample unsavedSample = sampleBuilder.windMeasure(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getWindMeasure());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDate() throws Exception {
		Sample unsavedSample = sampleBuilder.date(new java.util.Date()).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterRoI() throws Exception {
		Sample unsavedSample = sampleBuilder.roI(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getRoI());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterPhiEPercent() throws Exception {
		Sample unsavedSample = sampleBuilder.phiEPercent(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getPhiEPercent());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		Sample unsavedSample = sampleBuilder.id(0L).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		Sample unsavedSample = sampleBuilder.creationDate(new java.util.Date()).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		Sample unsavedSample = sampleBuilder.updateDate(new java.util.Date()).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		Sample unsavedSample = sampleBuilder.version(0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getVersion());
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
	public void refSetterProjectTest() throws Exception {	
		com.dooapp.firea.wrapper.Project elem1 = new com.dooapp.firea.wrapper.Project();
		Sample unsavedSample =  sampleBuilder.project(elem1).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertNotNull(dbSample.getProject());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterProjectClassicTest() throws Exception {
		Sample unsavedSample =  sampleBuilder.build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertNotNull(dbSample.getProject());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterStepTest() throws Exception {	
		com.dooapp.firea.wrapper.Step elem1 = new com.dooapp.firea.wrapper.Step();
		Sample unsavedSample =  sampleBuilder.step(elem1).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertNotNull(dbSample.getStep());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterStepClassicTest() throws Exception {
		Sample unsavedSample =  sampleBuilder.build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertNotNull(dbSample.getStep());
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
	public void oppositeProjectTest() throws Exception {
		com.dooapp.firea.wrapper.Project elem1 = new com.dooapp.firea.wrapper.Project();
		Sample unsavedSample =  sampleBuilder.project(elem1).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertNotNull(dbSample.getProject().getSample());
		Assert.assertEquals(dbSample, dbSample.getProject().getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeProjectClassicTest() throws Exception {
		Sample unsavedSample =  sampleBuilder.build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertNotNull(dbSample.getProject().getSample());
		Assert.assertEquals(dbSample, dbSample.getProject().getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeStepTest() throws Exception {
		com.dooapp.firea.wrapper.Step elem1 = new com.dooapp.firea.wrapper.Step();
		Sample unsavedSample =  sampleBuilder.step(elem1).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertNotNull(dbSample.getStep().getSample());
		Assert.assertEquals(dbSample, dbSample.getStep().getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeStepClassicTest() throws Exception {
		Sample unsavedSample =  sampleBuilder.build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertNotNull(dbSample.getStep().getSample());
		Assert.assertEquals(dbSample, dbSample.getStep().getSample());
	}
	
	

}
