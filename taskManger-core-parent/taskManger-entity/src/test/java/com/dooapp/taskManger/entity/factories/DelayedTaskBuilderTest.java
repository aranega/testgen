package com.dooapp.taskManger.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.taskManger.entity.Priority;

import com.dooapp.taskManger.wrapper.DelayedTask;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class DelayedTaskBuilderTest
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
	private DelayedTaskBuilder<?> delayedTaskBuilder;
	
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
		DelayedTask unsavedDelayedTask= delayedTaskBuilder.build();
		DelayedTask savedDelayedTask = manager.save(unsavedDelayedTask);
		DelayedTask dbDelayedTask = manager.get(DelayedTask.class, savedDelayedTask.getId());
		Assert.assertNotNull(dbDelayedTask);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterPriority() throws Exception {
		DelayedTask unsavedDelayedTask = delayedTaskBuilder.priority(Priority.LOW).build();
		DelayedTask savedDelayedTask = manager.save(unsavedDelayedTask);
		DelayedTask dbDelayedTask = manager.get(DelayedTask.class, savedDelayedTask.getId());
		Assert.assertNotNull(dbDelayedTask.getPriority());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterTitle() throws Exception {
		DelayedTask unsavedDelayedTask = delayedTaskBuilder.title("").build();
		DelayedTask savedDelayedTask = manager.save(unsavedDelayedTask);
		DelayedTask dbDelayedTask = manager.get(DelayedTask.class, savedDelayedTask.getId());
		Assert.assertNotNull(dbDelayedTask.getTitle());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterIsCompleted() throws Exception {
		DelayedTask unsavedDelayedTask = delayedTaskBuilder.isCompleted(false).build();
		DelayedTask savedDelayedTask = manager.save(unsavedDelayedTask);
		DelayedTask dbDelayedTask = manager.get(DelayedTask.class, savedDelayedTask.getId());
		Assert.assertNotNull(dbDelayedTask.isIsCompleted());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		DelayedTask unsavedDelayedTask = delayedTaskBuilder.id(0L).build();
		DelayedTask savedDelayedTask = manager.save(unsavedDelayedTask);
		DelayedTask dbDelayedTask = manager.get(DelayedTask.class, savedDelayedTask.getId());
		Assert.assertNotNull(dbDelayedTask.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		DelayedTask unsavedDelayedTask = delayedTaskBuilder.creationDate(new java.util.Date()).build();
		DelayedTask savedDelayedTask = manager.save(unsavedDelayedTask);
		DelayedTask dbDelayedTask = manager.get(DelayedTask.class, savedDelayedTask.getId());
		Assert.assertNotNull(dbDelayedTask.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		DelayedTask unsavedDelayedTask = delayedTaskBuilder.updateDate(new java.util.Date()).build();
		DelayedTask savedDelayedTask = manager.save(unsavedDelayedTask);
		DelayedTask dbDelayedTask = manager.get(DelayedTask.class, savedDelayedTask.getId());
		Assert.assertNotNull(dbDelayedTask.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		DelayedTask unsavedDelayedTask = delayedTaskBuilder.version(0).build();
		DelayedTask savedDelayedTask = manager.save(unsavedDelayedTask);
		DelayedTask dbDelayedTask = manager.get(DelayedTask.class, savedDelayedTask.getId());
		Assert.assertNotNull(dbDelayedTask.getVersion());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterStartAt() throws Exception {
		DelayedTask unsavedDelayedTask = delayedTaskBuilder.startAt("").build();
		DelayedTask savedDelayedTask = manager.save(unsavedDelayedTask);
		DelayedTask dbDelayedTask = manager.get(DelayedTask.class, savedDelayedTask.getId());
		Assert.assertNotNull(dbDelayedTask.getStartAt());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterEndAt() throws Exception {
		DelayedTask unsavedDelayedTask = delayedTaskBuilder.endAt("").build();
		DelayedTask savedDelayedTask = manager.save(unsavedDelayedTask);
		DelayedTask dbDelayedTask = manager.get(DelayedTask.class, savedDelayedTask.getId());
		Assert.assertNotNull(dbDelayedTask.getEndAt());
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
	public void refSetterOwnerTest() throws Exception {	
		com.dooapp.taskManger.wrapper.User elem1 = new com.dooapp.taskManger.wrapper.User();
		DelayedTask unsavedDelayedTask =  delayedTaskBuilder.owner(elem1).build();
		DelayedTask savedDelayedTask = manager.save(unsavedDelayedTask);
		DelayedTask dbDelayedTask = manager.get(DelayedTask.class, savedDelayedTask.getId());
		Assert.assertNotNull(dbDelayedTask);
		Assert.assertNotNull(dbDelayedTask.getOwner());
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
	public void oppositeOwnerTest() throws Exception {
		com.dooapp.taskManger.wrapper.User elem1 = new com.dooapp.taskManger.wrapper.User();
		DelayedTask unsavedDelayedTask =  delayedTaskBuilder.owner(elem1).build();
		DelayedTask savedDelayedTask = manager.save(unsavedDelayedTask);
		DelayedTask dbDelayedTask = manager.get(DelayedTask.class, savedDelayedTask.getId());
		Assert.assertNotNull(dbDelayedTask);
		Assert.assertFalse(dbDelayedTask.getOwner().getDuties().isEmpty());
		Assert.assertTrue(dbDelayedTask.getOwner().getDuties().contains(dbDelayedTask));
	}
	
	

}
