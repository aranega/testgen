package com.dooapp.taskManger.entity.factories;


import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.guice.IOC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javax.inject.Inject;

import com.dooapp.taskManger.entity.Priority;

import com.dooapp.taskManger.wrapper.Task;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class TaskBuilderTest
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
	private TaskBuilder<?> taskBuilder;
	
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
		Task unsavedTask= taskBuilder.build();
		Task savedTask = manager.save(unsavedTask);
		Task dbTask = manager.get(Task.class, savedTask.getId());
		Assert.assertNotNull(dbTask);	
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterTitle() throws Exception {
		Task unsavedTask = taskBuilder.title("").build();
		Task savedTask = manager.save(unsavedTask);
		Task dbTask = manager.get(Task.class, savedTask.getId());
		Assert.assertNotNull(dbTask.getTitle());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterPriority() throws Exception {
		Task unsavedTask = taskBuilder.priority(Priority.LOW).build();
		Task savedTask = manager.save(unsavedTask);
		Task dbTask = manager.get(Task.class, savedTask.getId());
		Assert.assertNotNull(dbTask.getPriority());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterIsCompleted() throws Exception {
		Task unsavedTask = taskBuilder.isCompleted(false).build();
		Task savedTask = manager.save(unsavedTask);
		Task dbTask = manager.get(Task.class, savedTask.getId());
		Assert.assertNotNull(dbTask.isIsCompleted());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterId() throws Exception {
		Task unsavedTask = taskBuilder.id(0L).build();
		Task savedTask = manager.save(unsavedTask);
		Task dbTask = manager.get(Task.class, savedTask.getId());
		Assert.assertNotNull(dbTask.getId());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterCreationDate() throws Exception {
		Task unsavedTask = taskBuilder.creationDate(new java.util.Date()).build();
		Task savedTask = manager.save(unsavedTask);
		Task dbTask = manager.get(Task.class, savedTask.getId());
		Assert.assertNotNull(dbTask.getCreationDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterUpdateDate() throws Exception {
		Task unsavedTask = taskBuilder.updateDate(new java.util.Date()).build();
		Task savedTask = manager.save(unsavedTask);
		Task dbTask = manager.get(Task.class, savedTask.getId());
		Assert.assertNotNull(dbTask.getUpdateDate());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Test
	public void setterNGetterVersion() throws Exception {
		Task unsavedTask = taskBuilder.version(0).build();
		Task savedTask = manager.save(unsavedTask);
		Task dbTask = manager.get(Task.class, savedTask.getId());
		Assert.assertNotNull(dbTask.getVersion());
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
		Task unsavedTask =  taskBuilder.owner(elem1).build();
		Task savedTask = manager.save(unsavedTask);
		Task dbTask = manager.get(Task.class, savedTask.getId());
		Assert.assertNotNull(dbTask);
		Assert.assertNotNull(dbTask.getOwner());
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
		Task unsavedTask =  taskBuilder.owner(elem1).build();
		Task savedTask = manager.save(unsavedTask);
		Task dbTask = manager.get(Task.class, savedTask.getId());
		Assert.assertNotNull(dbTask);
		Assert.assertFalse(dbTask.getOwner().getDuties().isEmpty());
		Assert.assertTrue(dbTask.getOwner().getDuties().contains(dbTask));
	}
	
	

}
