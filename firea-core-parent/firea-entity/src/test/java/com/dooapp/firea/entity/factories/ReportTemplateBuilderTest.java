package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.firea.entity.ProjectKind;

import com.dooapp.firea.wrapper.ReportTemplate;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class ReportTemplateBuilderTest
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
	private ReportTemplateBuilder<?> reportTemplateBuilder;
	
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
		ReportTemplate unsavedReportTemplate= reportTemplateBuilder.build();
		ReportTemplate savedReportTemplate = manager.save(unsavedReportTemplate);
		ReportTemplate dbReportTemplate = manager.get(ReportTemplate.class, savedReportTemplate.getId());
		Assert.assertNotNull(dbReportTemplate);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterKind() throws Exception {
		ReportTemplate unsavedReportTemplate = reportTemplateBuilder.kind(ProjectKind.R13_APSAD).build();
		ReportTemplate savedReportTemplate = manager.save(unsavedReportTemplate);
		ReportTemplate dbReportTemplate = manager.get(ReportTemplate.class, savedReportTemplate.getId());
		Assert.assertNotNull(dbReportTemplate.getKind());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDescription() throws Exception {
		ReportTemplate unsavedReportTemplate = reportTemplateBuilder.description("").build();
		ReportTemplate savedReportTemplate = manager.save(unsavedReportTemplate);
		ReportTemplate dbReportTemplate = manager.get(ReportTemplate.class, savedReportTemplate.getId());
		Assert.assertNotNull(dbReportTemplate.getDescription());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterFile() throws Exception {
		ReportTemplate unsavedReportTemplate = reportTemplateBuilder.file("").build();
		ReportTemplate savedReportTemplate = manager.save(unsavedReportTemplate);
		ReportTemplate dbReportTemplate = manager.get(ReportTemplate.class, savedReportTemplate.getId());
		Assert.assertNotNull(dbReportTemplate.getFile());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterName() throws Exception {
		ReportTemplate unsavedReportTemplate = reportTemplateBuilder.name("").build();
		ReportTemplate savedReportTemplate = manager.save(unsavedReportTemplate);
		ReportTemplate dbReportTemplate = manager.get(ReportTemplate.class, savedReportTemplate.getId());
		Assert.assertNotNull(dbReportTemplate.getName());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		ReportTemplate unsavedReportTemplate = reportTemplateBuilder.id(0L).build();
		ReportTemplate savedReportTemplate = manager.save(unsavedReportTemplate);
		ReportTemplate dbReportTemplate = manager.get(ReportTemplate.class, savedReportTemplate.getId());
		Assert.assertNotNull(dbReportTemplate.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		ReportTemplate unsavedReportTemplate = reportTemplateBuilder.creationDate(new java.util.Date()).build();
		ReportTemplate savedReportTemplate = manager.save(unsavedReportTemplate);
		ReportTemplate dbReportTemplate = manager.get(ReportTemplate.class, savedReportTemplate.getId());
		Assert.assertNotNull(dbReportTemplate.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		ReportTemplate unsavedReportTemplate = reportTemplateBuilder.updateDate(new java.util.Date()).build();
		ReportTemplate savedReportTemplate = manager.save(unsavedReportTemplate);
		ReportTemplate dbReportTemplate = manager.get(ReportTemplate.class, savedReportTemplate.getId());
		Assert.assertNotNull(dbReportTemplate.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		ReportTemplate unsavedReportTemplate = reportTemplateBuilder.version(0).build();
		ReportTemplate savedReportTemplate = manager.save(unsavedReportTemplate);
		ReportTemplate dbReportTemplate = manager.get(ReportTemplate.class, savedReportTemplate.getId());
		Assert.assertNotNull(dbReportTemplate.getVersion());
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
	public void refSetterImageTest() throws Exception {	
		com.dooapp.firea.wrapper.PersistentImage elem1 = new com.dooapp.firea.wrapper.PersistentImage();
		ReportTemplate unsavedReportTemplate =  reportTemplateBuilder.image(elem1).build();
		ReportTemplate savedReportTemplate = manager.save(unsavedReportTemplate);
		ReportTemplate dbReportTemplate = manager.get(ReportTemplate.class, savedReportTemplate.getId());
		Assert.assertNotNull(dbReportTemplate);
		Assert.assertNotNull(dbReportTemplate.getImage());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterImageClassicTest() throws Exception {
		ReportTemplate unsavedReportTemplate =  reportTemplateBuilder.build();
		ReportTemplate savedReportTemplate = manager.save(unsavedReportTemplate);
		ReportTemplate dbReportTemplate = manager.get(ReportTemplate.class, savedReportTemplate.getId());
		Assert.assertNotNull(dbReportTemplate);
		Assert.assertNotNull(dbReportTemplate.getImage());
	}
	
	

	/*****************************
	 * Basic Refs opposite tester
	 *****************************/

	

}
