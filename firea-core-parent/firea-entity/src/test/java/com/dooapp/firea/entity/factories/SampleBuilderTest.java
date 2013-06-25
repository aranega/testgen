package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;

import com.dooapp.firea.enumeration.BeaufortScale;
import com.dooapp.firea.enumeration.AirPressureCalculationMethod;
import com.dooapp.firea.enumeration.SampleStatus;

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
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterAirPressure() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterAirPressureCalculationMethod() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
		Sample unsavedSample = sampleBuilder.airPressureCalculationMethod(AirPressureCalculationMethod.MEASURE).build();
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
	@Ignore
	public void setterNGetterBeaufortScale() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
		Sample unsavedSample = sampleBuilder.beaufortScale(BeaufortScale.FORCE0).build();
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
	@Ignore
	public void setterNGetterCreationDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterHighUp() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
		Sample unsavedSample = sampleBuilder.highUp(0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getHighUp());
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
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterName() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterPhiEPercent() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterPhiIPercent() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterRoE() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterRoI() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterStatus() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
		Sample unsavedSample = sampleBuilder.status(SampleStatus.NO_STARTED).build();
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
	@Ignore
	public void setterNGetterTetaE() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterTetaI() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterUpdateDate() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
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
	@Ignore
	public void setterNGetterVersion() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
		Sample unsavedSample = sampleBuilder.version(0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getVersion());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterWindMeasure() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
		Sample unsavedSample = sampleBuilder.windMeasure(0.0).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample.getWindMeasure());
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
		
		com.dooapp.firea.wrapper.Project elem1 = (new com.dooapp.firea.entity.ProjectBean()).getWrapper(); 
		Sample unsavedSample =  sampleBuilder.project(elem1).build();
		Assert.assertNotNull(unsavedSample);
		Assert.assertNotNull(unsavedSample.getProject());
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
	@Ignore
	public void refSetterStepTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
		com.dooapp.firea.wrapper.Step elem1 = (new com.dooapp.firea.entity.StepBean()).getWrapper(); 
		Sample unsavedSample =  sampleBuilder.step(elem1).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertFalse(dbSample.getStep().isEmpty());
		Assert.assertEquals(1, dbSample.getStep().size());
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
	public void oppositeProjectTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
	
		com.dooapp.firea.wrapper.Project elem1 = (new com.dooapp.firea.entity.ProjectBean()).getWrapper(); 
		Sample unsavedSample =  sampleBuilder.project(elem1).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertFalse(dbSample.getProject().getSample().isEmpty());
		Assert.assertTrue(dbSample.getProject().getSample().contains(dbSample));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void oppositeStepTest() throws Exception {
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Risque via risque()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMaintenance()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmCustomer()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via technician()  	
		// FIXME: Warning, the test will probably failed because Project required to be linked to a Contact via firmMoe()  	
		com.dooapp.firea.wrapper.Project projectWrapper = (new com.dooapp.firea.entity.ProjectBean()).getWrapper();
		sampleBuilder.project(projectWrapper);
		
	
		com.dooapp.firea.wrapper.Step elem1 = (new com.dooapp.firea.entity.StepBean()).getWrapper(); 
		Sample unsavedSample =  sampleBuilder.step(elem1).build();
		Sample savedSample = manager.save(unsavedSample);
		Sample dbSample = manager.get(Sample.class, savedSample.getId());
		Assert.assertNotNull(dbSample);
		Assert.assertNotNull(dbSample.getStep().get(0).getSample());
		Assert.assertEquals(dbSample, dbSample.getStep().get(0).getSample());
	}
	
	
}
