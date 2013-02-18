package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;


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
	public void setterNGetterStatus() throws Exception {
		Project unsavedProject = projectBuilder.Status("").build();
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
	public void setterNGetterKind() throws Exception {
		Project unsavedProject = projectBuilder.kind("").build();
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
	public void setterNGetterDescription() throws Exception {
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
	public void setterNGetterName() throws Exception {
		Project unsavedProject = projectBuilder.name("").build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject.getName());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
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
	public void setterNGetterCreationDate() throws Exception {
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
	public void setterNGetterUpdateDate() throws Exception {
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
	public void setterNGetterVersion() throws Exception {
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
	public void refSetterRisqueTest() throws Exception {	
		com.dooapp.firea.wrapper.Risque elem1 = new com.dooapp.firea.wrapper.Risque();
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
	public void refSetterRisqueClassicTest() throws Exception {
		Project unsavedProject =  projectBuilder.build();
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
	public void refSetterSampleTest() throws Exception {	
		com.dooapp.firea.wrapper.Sample elem1 = new com.dooapp.firea.wrapper.Sample();
		Project unsavedProject =  projectBuilder.sample(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterSampleClassicTest() throws Exception {
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getSample());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterImageTest() throws Exception {	
		com.dooapp.firea.wrapper.PersistentImage elem1 = new com.dooapp.firea.wrapper.PersistentImage();
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
	public void refSetterImageClassicTest() throws Exception {
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
	public void refSetterGazconfigurationTest() throws Exception {	
		com.dooapp.firea.wrapper.GazConfiguration elem1 = new com.dooapp.firea.wrapper.GazConfiguration();
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
	public void refSetterGazconfigurationClassicTest() throws Exception {
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
	public void refSetterContactsTest() throws Exception {	
		com.dooapp.firea.wrapper.Contact elem1 = new com.dooapp.firea.wrapper.Contact();
		Project unsavedProject =  projectBuilder.contacts(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getContacts());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterContactsClassicTest() throws Exception {
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getContacts());
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
		Project unsavedProject =  projectBuilder.sample(elem1).build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getSample().getProject());
		Assert.assertEquals(dbProject, dbProject.getSample().getProject());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeSampleClassicTest() throws Exception {
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getSample().getProject());
		Assert.assertEquals(dbProject, dbProject.getSample().getProject());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeGazconfigurationTest() throws Exception {
		com.dooapp.firea.wrapper.GazConfiguration elem1 = new com.dooapp.firea.wrapper.GazConfiguration();
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
	public void oppositeGazconfigurationClassicTest() throws Exception {
		Project unsavedProject =  projectBuilder.build();
		Project savedProject = manager.save(unsavedProject);
		Project dbProject = manager.get(Project.class, savedProject.getId());
		Assert.assertNotNull(dbProject);
		Assert.assertNotNull(dbProject.getGazconfiguration().getProject());
		Assert.assertEquals(dbProject, dbProject.getGazconfiguration().getProject());
	}
	
	

}
