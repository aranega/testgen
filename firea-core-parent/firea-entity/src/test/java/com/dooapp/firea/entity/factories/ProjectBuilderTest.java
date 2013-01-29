package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

//Start of user code for imports
// TODO: import me!
//End of user code

//import com.dooapp.firea.entity.factories.ProjectBuilder;
import com.dooapp.firea.wrapper.Project;

/*
 * Test Class
 * <!-- Start of user code comment for Project Test Class
 * End of user code -->
 */


public class ProjectBuilderTest
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	@Inject
	private EntityManager manager;
	
	@Inject
	private ProjectBuilder<?> projectBuilder;
	
	@Before
	public void setup() {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().injectMembers(this);
	}
	

	public static void main(String[] args) throws Exception {
		System.setProperty("WORKSPACE", "target");
		System.setProperty("hibernate.connection.url", "jdbc:h2:~/h2db/test");
		System.setProperty("hibernate.connection.username", "sa");
		System.setProperty("hibernate.connection.password", "");
		IOC.getInjector().getInstance(ProjectBuilderTest.class).justTryToPersiste();
		//Start of user code main of Project
		//End of user code
	}
	
	@Test
	public void justTryToPersiste() throws Exception {
		Project unsavedProject= projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		//Start of user code try to persist for Project
		
		//End of user code
	}
	@Test
	public void setterNGetterDescription() throws Exception {
		//Start of user code getter and setter for description attribute
		Project unsavedProject = projectBuilder.description("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getDescription());
		//End of user code
	}
	@Test
	public void setterNGetterKind() throws Exception {
		//Start of user code getter and setter for kind attribute
		Project unsavedProject = projectBuilder.kind("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getKind());
		//End of user code
	}
	@Test
	public void setterNGetterStatus() throws Exception {
		//Start of user code getter and setter for Status attribute
		Project unsavedProject = projectBuilder.Status("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getStatus());
		//End of user code
	}
	@Test
	public void setterNGetterReference() throws Exception {
		//Start of user code getter and setter for reference attribute
		Project unsavedProject = projectBuilder.reference("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getReference());
		//End of user code
	}
	@Test
	public void setterNGetterNameDo() throws Exception {
		//Start of user code getter and setter for nameDo attribute
		Project unsavedProject = projectBuilder.nameDo("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getNameDo());
		//End of user code
	}
	@Test
	public void setterNGetterId() throws Exception {
		//Start of user code getter and setter for id attribute
		Project unsavedProject = projectBuilder.id(0L).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getId());
		//End of user code
	}
	@Test
	public void setterNGetterCreationDate() throws Exception {
		//Start of user code getter and setter for creationDate attribute
		Project unsavedProject = projectBuilder.creationDate(new java.util.Date()).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getCreationDate());
		//End of user code
	}
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		//Start of user code getter and setter for updateDate attribute
		Project unsavedProject = projectBuilder.updateDate(new java.util.Date()).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getUpdateDate());
		//End of user code
	}
	@Test
	public void setterNGetterVersion() throws Exception {
		//Start of user code getter and setter for version attribute
		Project unsavedProject = projectBuilder.version(0).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getVersion());
		//End of user code
	}
	
	
	/*
	 * Basic Refs tester
	 */
	@Test
	public void refSetterTechnicianTest() throws Exception {	
		//Start of user code basic reference test for technician reference
		com.dooapp.firea.wrapper.Contact elem1 = new com.dooapp.firea.wrapper.Contact();
		Project unsavedProject =  projectBuilder.technician(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getTechnician());
		//End of user code
	}
	
	@Test
	public void refSetterTechnicianClassicTest() throws Exception {
		//Start of user code basic classic reference test for technician reference
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getTechnician());
		//End of user code
	}
	
	@Test
	public void refSetterFirmMaintenanceTest() throws Exception {	
		//Start of user code basic reference test for firmMaintenance reference
		com.dooapp.firea.wrapper.Contact elem1 = new com.dooapp.firea.wrapper.Contact();
		Project unsavedProject =  projectBuilder.firmMaintenance(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getFirmMaintenance());
		//End of user code
	}
	
	@Test
	public void refSetterFirmMaintenanceClassicTest() throws Exception {
		//Start of user code basic classic reference test for firmMaintenance reference
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getFirmMaintenance());
		//End of user code
	}
	
	@Test
	public void refSetterRisqueTest() throws Exception {	
		//Start of user code basic reference test for risque reference
		com.dooapp.firea.wrapper.Risque elem1 = new com.dooapp.firea.wrapper.Risque();
		Project unsavedProject =  projectBuilder.risque(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getRisque());
		//End of user code
	}
	
	@Test
	public void refSetterRisqueClassicTest() throws Exception {
		//Start of user code basic classic reference test for risque reference
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getRisque());
		//End of user code
	}
	
	@Test
	public void refSetterGazconfigurationTest() throws Exception {	
		//Start of user code basic reference test for gazconfiguration reference
		com.dooapp.firea.wrapper.GazConfiguration elem1 = new com.dooapp.firea.wrapper.GazConfiguration();
		Project unsavedProject =  projectBuilder.gazconfiguration(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getGazconfiguration());
		//End of user code
	}
	
	@Test
	public void refSetterGazconfigurationClassicTest() throws Exception {
		//Start of user code basic classic reference test for gazconfiguration reference
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getGazconfiguration());
		//End of user code
	}
	
	@Test
	public void refSetterFirmCustomerTest() throws Exception {	
		//Start of user code basic reference test for firmCustomer reference
		com.dooapp.firea.wrapper.Contact elem1 = new com.dooapp.firea.wrapper.Contact();
		Project unsavedProject =  projectBuilder.firmCustomer(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getFirmCustomer());
		//End of user code
	}
	
	@Test
	public void refSetterFirmCustomerClassicTest() throws Exception {
		//Start of user code basic classic reference test for firmCustomer reference
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getFirmCustomer());
		//End of user code
	}
	
	@Test
	public void refSetterTestedroomTest() throws Exception {	
		//Start of user code basic reference test for testedroom reference
		com.dooapp.firea.wrapper.TestedRoom elem1 = new com.dooapp.firea.wrapper.TestedRoom();
		Project unsavedProject =  projectBuilder.testedroom(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getTestedroom());
		//End of user code
	}
	
	@Test
	public void refSetterTestedroomClassicTest() throws Exception {
		//Start of user code basic classic reference test for testedroom reference
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getTestedroom());
		//End of user code
	}
	
	@Test
	public void refSetterSampleTest() throws Exception {
		//Start of user code basic reference test for sample reference
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		Project unsavedProject =  projectBuilder.sample(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertFalse(dbProject.getSample().isEmpty());
		Assert.assertEquals(1, dbProject.getSample().size());
		//End of user code
	}
	
	@Test
	public void refSetterImageTest() throws Exception {	
		//Start of user code basic reference test for image reference
		com.dooapp.firea.wrapper.PersistentImage elem1 = new com.dooapp.firea.wrapper.PersistentImage();
		Project unsavedProject =  projectBuilder.image(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getImage());
		//End of user code
	}
	
	@Test
	public void refSetterImageClassicTest() throws Exception {
		//Start of user code basic classic reference test for image reference
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getImage());
		//End of user code
	}
	
	@Test
	public void refSetterFirmMoeTest() throws Exception {	
		//Start of user code basic reference test for firmMoe reference
		com.dooapp.firea.wrapper.Contact elem1 = new com.dooapp.firea.wrapper.Contact();
		Project unsavedProject =  projectBuilder.firmMoe(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getFirmMoe());
		//End of user code
	}
	
	@Test
	public void refSetterFirmMoeClassicTest() throws Exception {
		//Start of user code basic classic reference test for firmMoe reference
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getFirmMoe());
		//End of user code
	}
	
		
	/*
	 * Basic Refs opposite tester
	 */
	@Test
	public void oppositeGazconfigurationTest() throws Exception {
		//Start of user code basic opposite test for gazconfiguration reference
		com.dooapp.firea.wrapper.GazConfiguration elem1 = new com.dooapp.firea.wrapper.GazConfiguration();
		Project unsavedProject =  projectBuilder.gazconfiguration(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getGazconfiguration().getProject());
		Assert.assertEquals(dbProject, dbProject.getGazconfiguration().getProject());
		//End of user code
	}
	
	@Test
	public void oppositeGazconfigurationClassicTest() throws Exception {
		//Start of user code basic classic opposite test for gazconfiguration reference
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getGazconfiguration().getProject());
		Assert.assertEquals(dbProject, dbProject.getGazconfiguration().getProject());
		//End of user code
	}
	
	@Test
	public void oppositeTestedroomTest() throws Exception {
		//Start of user code basic opposite test for testedroom reference
		com.dooapp.firea.wrapper.TestedRoom elem1 = new com.dooapp.firea.wrapper.TestedRoom();
		Project unsavedProject =  projectBuilder.testedroom(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getTestedroom().getProject());
		Assert.assertEquals(dbProject, dbProject.getTestedroom().getProject());
		//End of user code
	}
	
	@Test
	public void oppositeTestedroomClassicTest() throws Exception {
		//Start of user code basic classic opposite test for testedroom reference
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getTestedroom().getProject());
		Assert.assertEquals(dbProject, dbProject.getTestedroom().getProject());
		//End of user code
	}
	
	@Test
	public void oppositeSampleTest() throws Exception {
		//Start of user code basic opposite test for sample reference
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		Project unsavedProject =  projectBuilder.sample(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getSample().get(0).getProject());
		Assert.assertEquals(dbProject, dbProject.getSample().get(0).getProject());
		//End of user code
	}
	
	

	//Start of user code for methods
	// Other methods
	//End of user code

}
