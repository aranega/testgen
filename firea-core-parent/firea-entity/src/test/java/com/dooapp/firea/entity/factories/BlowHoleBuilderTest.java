package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.firea.entity.Discharge;

import com.dooapp.firea.wrapper.BlowHole;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class BlowHoleBuilderTest
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
	private BlowHoleBuilder<?> blowHoleBuilder;
	
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
		BlowHole unsavedBlowHole= blowHoleBuilder.build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterDischarge() throws Exception {
		BlowHole unsavedBlowHole = blowHoleBuilder.Discharge(Discharge.Positive).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getDischarge());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterSurface() throws Exception {
		BlowHole unsavedBlowHole = blowHoleBuilder.surface(0.0).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getSurface());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		BlowHole unsavedBlowHole = blowHoleBuilder.id(0L).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		BlowHole unsavedBlowHole = blowHoleBuilder.creationDate(new java.util.Date()).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		BlowHole unsavedBlowHole = blowHoleBuilder.updateDate(new java.util.Date()).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		BlowHole unsavedBlowHole = blowHoleBuilder.version(0).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getVersion());
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
	public void refSetterTestedroomTest() throws Exception {	
		com.dooapp.firea.wrapper.TestedRoom elem1 = new com.dooapp.firea.wrapper.TestedRoom();
		BlowHole unsavedBlowHole =  blowHoleBuilder.testedroom(elem1).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole);
		Assert.assertNotNull(dbBlowHole.getTestedroom());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void refSetterTestedroomClassicTest() throws Exception {
		BlowHole unsavedBlowHole =  blowHoleBuilder.build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole);
		Assert.assertNotNull(dbBlowHole.getTestedroom());
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
	public void oppositeTestedroomTest() throws Exception {
		com.dooapp.firea.wrapper.TestedRoom elem1 = new com.dooapp.firea.wrapper.TestedRoom();
		BlowHole unsavedBlowHole =  blowHoleBuilder.testedroom(elem1).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole);
		Assert.assertNotNull(dbBlowHole.getTestedroom().getBlowholes());
		Assert.assertEquals(dbBlowHole, dbBlowHole.getTestedroom().getBlowholes());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void oppositeTestedroomClassicTest() throws Exception {
		BlowHole unsavedBlowHole =  blowHoleBuilder.build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole);
		Assert.assertNotNull(dbBlowHole.getTestedroom().getBlowholes());
		Assert.assertEquals(dbBlowHole, dbBlowHole.getTestedroom().getBlowholes());
	}
	
	

}
