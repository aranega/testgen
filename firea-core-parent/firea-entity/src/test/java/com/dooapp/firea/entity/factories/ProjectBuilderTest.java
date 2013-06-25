package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;

import com.dooapp.firea.enumeration.ProjectStatus;
import com.dooapp.firea.enumeration.ProjectKind;

import com.dooapp.firea.wrapper.Project;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class ProjectBuilderTest
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
	private ProjectBuilder<?> projectBuilder;
	
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
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject= projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterStatus() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject = projectBuilder.Status(ProjectStatus.TO_PLAN).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getStatus());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterCreationDate() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject = projectBuilder.creationDate(new java.util.Date()).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getCreationDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterDescription() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject = projectBuilder.description("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getDescription());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterId() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject = projectBuilder.id(0L).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getId());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterKind() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject = projectBuilder.kind(ProjectKind.R13_APSAD).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getKind());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterNameDo() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject = projectBuilder.nameDo("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getNameDo());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterReference() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject = projectBuilder.reference("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getReference());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterUpdateDate() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject = projectBuilder.updateDate(new java.util.Date()).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getUpdateDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterVersion() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject = projectBuilder.version(0).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getVersion());
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
	public void refSetterFirmCustomerTest() throws Exception {	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
		
		com.dooapp.firea.wrapper.Contact elem1 = (new com.dooapp.firea.entity.ContactBean()).getWrapper(); 
		Project unsavedProject =  projectBuilder.firmCustomer(elem1).build();
		Assert.assertNotNull(unsavedProject);
		Assert.assertNotNull(unsavedProject.getFirmCustomer());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refSetterSerializeFirmCustomerTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		com.dooapp.firea.wrapper.Contact elem1 = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		Project unsavedProject =  projectBuilder.firmCustomer(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getFirmCustomer());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterFirmMaintenanceTest() throws Exception {	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
		
		com.dooapp.firea.wrapper.Contact elem1 = (new com.dooapp.firea.entity.ContactBean()).getWrapper(); 
		Project unsavedProject =  projectBuilder.firmMaintenance(elem1).build();
		Assert.assertNotNull(unsavedProject);
		Assert.assertNotNull(unsavedProject.getFirmMaintenance());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refSetterSerializeFirmMaintenanceTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		com.dooapp.firea.wrapper.Contact elem1 = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		Project unsavedProject =  projectBuilder.firmMaintenance(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getFirmMaintenance());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterFirmMoeTest() throws Exception {	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		
		com.dooapp.firea.wrapper.Contact elem1 = (new com.dooapp.firea.entity.ContactBean()).getWrapper(); 
		Project unsavedProject =  projectBuilder.firmMoe(elem1).build();
		Assert.assertNotNull(unsavedProject);
		Assert.assertNotNull(unsavedProject.getFirmMoe());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refSetterSerializeFirmMoeTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
	
		com.dooapp.firea.wrapper.Contact elem1 = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		Project unsavedProject =  projectBuilder.firmMoe(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getFirmMoe());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterGazconfigurationTest() throws Exception {	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
		
		com.dooapp.firea.wrapper.GazConfiguration elem1 = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper(); 
		Project unsavedProject =  projectBuilder.gazconfiguration(elem1).build();
		Assert.assertNotNull(unsavedProject);
		Assert.assertNotNull(unsavedProject.getGazconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refAutoSetterGazconfigurationTest() throws Exception {	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject =  projectBuilder.build();
		Assert.assertNotNull(unsavedProject);
		Assert.assertNotNull(unsavedProject.getGazconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refSetterSerializeGazconfigurationTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		com.dooapp.firea.wrapper.GazConfiguration elem1 = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		Project unsavedProject =  projectBuilder.gazconfiguration(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getGazconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refAutoSetterSerializeGazconfigurationTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getGazconfiguration());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterImageTest() throws Exception {	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
		
		com.dooapp.firea.wrapper.PersistentImage elem1 = (new com.dooapp.firea.entity.PersistentImageBean()).getWrapper(); 
		Project unsavedProject =  projectBuilder.image(elem1).build();
		Assert.assertNotNull(unsavedProject);
		Assert.assertNotNull(unsavedProject.getImage());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refAutoSetterImageTest() throws Exception {	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject =  projectBuilder.build();
		Assert.assertNotNull(unsavedProject);
		Assert.assertNotNull(unsavedProject.getImage());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refSetterSerializeImageTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		com.dooapp.firea.wrapper.PersistentImage elem1 = (new com.dooapp.firea.entity.PersistentImageBean()).getWrapper();
		Project unsavedProject =  projectBuilder.image(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getImage());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refAutoSetterSerializeImageTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getImage());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterRisqueTest() throws Exception {	
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
		
		com.dooapp.firea.wrapper.Risque elem1 = (new com.dooapp.firea.entity.RisqueBean()).getWrapper(); 
		Project unsavedProject =  projectBuilder.risque(elem1).build();
		Assert.assertNotNull(unsavedProject);
		Assert.assertNotNull(unsavedProject.getRisque());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refSetterSerializeRisqueTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		com.dooapp.firea.wrapper.Risque elem1 = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		Project unsavedProject =  projectBuilder.risque(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getRisque());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refSetterSampleTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		com.dooapp.firea.wrapper.Sample elem1 = (new com.dooapp.firea.entity.SampleBean()).getWrapper(); 
		Project unsavedProject =  projectBuilder.sample(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertFalse(dbProject.getSample().isEmpty());
		Assert.assertEquals(1, dbProject.getSample().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterTechnicianTest() throws Exception {	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
		
		com.dooapp.firea.wrapper.Contact elem1 = (new com.dooapp.firea.entity.ContactBean()).getWrapper(); 
		Project unsavedProject =  projectBuilder.technician(elem1).build();
		Assert.assertNotNull(unsavedProject);
		Assert.assertNotNull(unsavedProject.getTechnician());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refSetterSerializeTechnicianTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		com.dooapp.firea.wrapper.Contact elem1 = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		Project unsavedProject =  projectBuilder.technician(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getTechnician());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterTestedroomTest() throws Exception {	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
		
		com.dooapp.firea.wrapper.TestedRoom elem1 = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper(); 
		Project unsavedProject =  projectBuilder.testedroom(elem1).build();
		Assert.assertNotNull(unsavedProject);
		Assert.assertNotNull(unsavedProject.getTestedroom());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refAutoSetterTestedroomTest() throws Exception {	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject =  projectBuilder.build();
		Assert.assertNotNull(unsavedProject);
		Assert.assertNotNull(unsavedProject.getTestedroom());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refSetterSerializeTestedroomTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		com.dooapp.firea.wrapper.TestedRoom elem1 = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper();
		Project unsavedProject =  projectBuilder.testedroom(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getTestedroom());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void refAutoSetterSerializeTestedroomTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getTestedroom());
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
	public void oppositeGazconfigurationTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		com.dooapp.firea.wrapper.GazConfiguration elem1 = (new com.dooapp.firea.entity.GazConfigurationBean()).getWrapper();
		Project unsavedProject =  projectBuilder.gazconfiguration(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getGazconfiguration().getProject());
		Assert.assertEquals(dbProject, dbProject.getGazconfiguration().getProject());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void oppositeSampleTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		com.dooapp.firea.wrapper.Sample elem1 = (new com.dooapp.firea.entity.SampleBean()).getWrapper(); 
		Project unsavedProject =  projectBuilder.sample(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getSample().get(0).getProject());
		Assert.assertEquals(dbProject, dbProject.getSample().get(0).getProject());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void oppositeTestedroomTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.Risque risqueWrapper = (new com.dooapp.firea.entity.RisqueBean()).getWrapper();
		projectBuilder.risque(risqueWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMaintenanceWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMaintenance(firmMaintenanceWrapper);
		
		com.dooapp.firea.wrapper.Contact firmCustomerWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmCustomer(firmCustomerWrapper);
		
		com.dooapp.firea.wrapper.Contact technicianWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.technician(technicianWrapper);
		
		com.dooapp.firea.wrapper.Contact firmMoeWrapper = (new com.dooapp.firea.entity.ContactBean()).getWrapper();
		projectBuilder.firmMoe(firmMoeWrapper);
		
	
		com.dooapp.firea.wrapper.TestedRoom elem1 = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper();
		Project unsavedProject =  projectBuilder.testedroom(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getTestedroom().getProject());
		Assert.assertEquals(dbProject, dbProject.getTestedroom().getProject());
	}
	
	
}
