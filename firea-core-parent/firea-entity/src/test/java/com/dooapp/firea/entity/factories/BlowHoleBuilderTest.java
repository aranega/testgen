package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;

import com.dooapp.firea.enumeration.Discharge;

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
		com.dooapp.firea.wrapper.TestedRoom testedroomWrapper = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper();
		blowHoleBuilder.testedroom(testedroomWrapper);
		
	
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
	@Ignore
	public void setterNGetterDischarge() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.TestedRoom testedroomWrapper = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper();
		blowHoleBuilder.testedroom(testedroomWrapper);
		
	
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
	@Ignore
	public void setterNGetterCreationDate() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.TestedRoom testedroomWrapper = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper();
		blowHoleBuilder.testedroom(testedroomWrapper);
		
	
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
	@Ignore
	public void setterNGetterId() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.TestedRoom testedroomWrapper = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper();
		blowHoleBuilder.testedroom(testedroomWrapper);
		
	
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
	@Ignore
	public void setterNGetterQuantity() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.TestedRoom testedroomWrapper = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper();
		blowHoleBuilder.testedroom(testedroomWrapper);
		
	
		BlowHole unsavedBlowHole = blowHoleBuilder.quantity(0).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole.getQuantity());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	@Ignore
	public void setterNGetterSurface() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.TestedRoom testedroomWrapper = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper();
		blowHoleBuilder.testedroom(testedroomWrapper);
		
	
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
	@Ignore
	public void setterNGetterUpdateDate() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.TestedRoom testedroomWrapper = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper();
		blowHoleBuilder.testedroom(testedroomWrapper);
		
	
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
	@Ignore
	public void setterNGetterVersion() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
		com.dooapp.firea.wrapper.TestedRoom testedroomWrapper = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper();
		blowHoleBuilder.testedroom(testedroomWrapper);
		
	
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
		
		com.dooapp.firea.wrapper.TestedRoom elem1 = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper(); 
		BlowHole unsavedBlowHole =  blowHoleBuilder.testedroom(elem1).build();
		Assert.assertNotNull(unsavedBlowHole);
		Assert.assertNotNull(unsavedBlowHole.getTestedroom());
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
	
		com.dooapp.firea.wrapper.TestedRoom elem1 = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper();
		BlowHole unsavedBlowHole =  blowHoleBuilder.testedroom(elem1).build();
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
	@Ignore
	public void oppositeTestedroomTest() throws Exception {
		// FIXME: Warning, the test will probably failed because TestedRoom required to be linked to a Project via project()  	
	
		com.dooapp.firea.wrapper.TestedRoom elem1 = (new com.dooapp.firea.entity.TestedRoomBean()).getWrapper(); 
		BlowHole unsavedBlowHole =  blowHoleBuilder.testedroom(elem1).build();
		BlowHole savedBlowHole = manager.save(unsavedBlowHole);
		BlowHole dbBlowHole = manager.get(BlowHole.class, savedBlowHole.getId());
		Assert.assertNotNull(dbBlowHole);
		Assert.assertFalse(dbBlowHole.getTestedroom().getBlowholes().isEmpty());
		Assert.assertTrue(dbBlowHole.getTestedroom().getBlowholes().contains(dbBlowHole));
	}
	
	
}
