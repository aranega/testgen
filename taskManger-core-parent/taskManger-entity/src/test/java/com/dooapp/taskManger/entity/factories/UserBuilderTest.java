package com.dooapp.taskManger.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;


import com.dooapp.taskManger.wrapper.User;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class UserBuilderTest
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
	private UserBuilder<?> userBuilder;
	
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
		User unsavedUser= userBuilder.build();
		User savedUser = manager.save(unsavedUser);
		User dbUser = manager.get(User.class, savedUser.getId());
		Assert.assertNotNull(dbUser);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterFirstname() throws Exception {
		User unsavedUser = userBuilder.firstname("").build();
		User savedUser = manager.save(unsavedUser);
		User dbUser = manager.get(User.class, savedUser.getId());
		Assert.assertNotNull(dbUser.getFirstname());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterAge() throws Exception {
		User unsavedUser = userBuilder.age(0).build();
		User savedUser = manager.save(unsavedUser);
		User dbUser = manager.get(User.class, savedUser.getId());
		Assert.assertNotNull(dbUser.getAge());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterLastname() throws Exception {
		User unsavedUser = userBuilder.lastname("").build();
		User savedUser = manager.save(unsavedUser);
		User dbUser = manager.get(User.class, savedUser.getId());
		Assert.assertNotNull(dbUser.getLastname());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		User unsavedUser = userBuilder.id(0L).build();
		User savedUser = manager.save(unsavedUser);
		User dbUser = manager.get(User.class, savedUser.getId());
		Assert.assertNotNull(dbUser.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		User unsavedUser = userBuilder.creationDate(new java.util.Date()).build();
		User savedUser = manager.save(unsavedUser);
		User dbUser = manager.get(User.class, savedUser.getId());
		Assert.assertNotNull(dbUser.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		User unsavedUser = userBuilder.updateDate(new java.util.Date()).build();
		User savedUser = manager.save(unsavedUser);
		User dbUser = manager.get(User.class, savedUser.getId());
		Assert.assertNotNull(dbUser.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		User unsavedUser = userBuilder.version(0).build();
		User savedUser = manager.save(unsavedUser);
		User dbUser = manager.get(User.class, savedUser.getId());
		Assert.assertNotNull(dbUser.getVersion());
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
	public void refSetterDutiesTest() throws Exception {
		com.dooapp.taskManger.wrapper.Task elem1 = new com.dooapp.taskManger.wrapper.Task();
		User unsavedUser =  userBuilder.duties(elem1).build();
		User savedUser = manager.save(unsavedUser);
		User dbUser = manager.get(User.class, savedUser.getId());
		Assert.assertNotNull(dbUser);
		Assert.assertFalse(dbUser.getDuties().isEmpty());
		Assert.assertEquals(1, dbUser.getDuties().size());
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
	public void oppositeDutiesTest() throws Exception {
		com.dooapp.taskManger.wrapper.Task elem1 = new com.dooapp.taskManger.wrapper.Task();
		User unsavedUser =  userBuilder.duties(elem1).build();
		User savedUser = manager.save(unsavedUser);
		User dbUser = manager.get(User.class, savedUser.getId());
		Assert.assertNotNull(dbUser);
		Assert.assertNotNull(dbUser.getDuties().get(0).getOwner());
		Assert.assertEquals(dbUser, dbUser.getDuties().get(0).getOwner());
	}
	
	

}
