package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.firea.entity.GazWeight;

import com.dooapp.firea.wrapper.Gaz;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class GazBuilderTest
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
	private GazBuilder<?> gazBuilder;
	
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
		Gaz unsavedGaz= gazBuilder.build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterWeight() throws Exception {
		Gaz unsavedGaz = gazBuilder.weight(GazWeight.HEAVY).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getWeight());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterType() throws Exception {
		Gaz unsavedGaz = gazBuilder.type("").build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getType());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterLoaelConcentration() throws Exception {
		Gaz unsavedGaz = gazBuilder.loaelConcentration(0.0).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getLoaelConcentration());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterName() throws Exception {
		Gaz unsavedGaz = gazBuilder.name("").build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getName());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		Gaz unsavedGaz = gazBuilder.id(0L).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		Gaz unsavedGaz = gazBuilder.creationDate(new java.util.Date()).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		Gaz unsavedGaz = gazBuilder.updateDate(new java.util.Date()).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		Gaz unsavedGaz = gazBuilder.version(0).build();
		Gaz savedGaz = manager.save(unsavedGaz);
		Gaz dbGaz = manager.get(Gaz.class, savedGaz.getId());
		Assert.assertNotNull(dbGaz.getVersion());
	}
	
	
	/********************
	 * Basic Refs tester
	 ********************/

	

	/*****************************
	 * Basic Refs opposite tester
	 *****************************/

	

}
