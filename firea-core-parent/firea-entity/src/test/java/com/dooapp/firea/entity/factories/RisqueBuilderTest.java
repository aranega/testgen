package com.dooapp.firea.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

import javax.inject.Inject;


import com.dooapp.firea.wrapper.Risque;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class RisqueBuilderTest
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
	private RisqueBuilder<?> risqueBuilder;
	
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
	
	public void justTryToPersiste() throws Exception {
	
		Risque unsavedRisque= risqueBuilder.build();
		Risque savedRisque = manager.save(unsavedRisque);
		Risque dbRisque = manager.get(Risque.class, savedRisque.getId());
		Assert.assertNotNull(dbRisque);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterCreationDate() throws Exception {
	
		Risque unsavedRisque = risqueBuilder.creationDate(new java.util.Date()).build();
		Risque savedRisque = manager.save(unsavedRisque);
		Risque dbRisque = manager.get(Risque.class, savedRisque.getId());
		Assert.assertNotNull(dbRisque.getCreationDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterId() throws Exception {
	
		Risque unsavedRisque = risqueBuilder.id(0L).build();
		Risque savedRisque = manager.save(unsavedRisque);
		Risque dbRisque = manager.get(Risque.class, savedRisque.getId());
		Assert.assertNotNull(dbRisque.getId());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterKey() throws Exception {
	
		Risque unsavedRisque = risqueBuilder.key("").build();
		Risque savedRisque = manager.save(unsavedRisque);
		Risque dbRisque = manager.get(Risque.class, savedRisque.getId());
		Assert.assertNotNull(dbRisque.getKey());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterUpdateDate() throws Exception {
	
		Risque unsavedRisque = risqueBuilder.updateDate(new java.util.Date()).build();
		Risque savedRisque = manager.save(unsavedRisque);
		Risque dbRisque = manager.get(Risque.class, savedRisque.getId());
		Assert.assertNotNull(dbRisque.getUpdateDate());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	
	public void setterNGetterVersion() throws Exception {
	
		Risque unsavedRisque = risqueBuilder.version(0).build();
		Risque savedRisque = manager.save(unsavedRisque);
		Risque dbRisque = manager.get(Risque.class, savedRisque.getId());
		Assert.assertNotNull(dbRisque.getVersion());
	}
	
	
	
	/********************
	 * Basic Refs tester
	 ********************/
	
	
	/*****************************
	 * Basic Refs opposite tester
	 *****************************/

	
}
