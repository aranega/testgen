package com.dooapp.firea.folder.handler;

import com.dooapp.firea.folder.controller.list.ListFolderController;

import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.Executor;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuItemBuilder;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.dooapp.lib.annotation.Context;
import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.common.entity.Wrapper;
import com.dooapp.lib.controller.Controller;
import com.dooapp.lib.event.bus.EventBus;
import com.dooapp.lib.handler.AbstractListHandler;
import com.dooapp.lib.location.Domain;
import com.dooapp.lib.location.Location;
import com.dooapp.lib.location.event.LinkEvent;
import com.dooapp.lib.manager.EntityManager;
import com.dooapp.firea.ApplicationDomain;
import com.dooapp.firea.wrapper.Folder;

/**
 * This handler show list of Folder <br>
 * <br>
 * Created at : date<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */
public class ListFolderHandler extends AbstractListHandler<Folder> {
	/**
     * The famous {@link org.slf4j.Logger}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	private static final Logger logger = LoggerFactory.getLogger(ListFolderHandler.class);
	
	/**
	 * The famous {@link com.dooapp.lib.event.bus.EventBus}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
 	*/
	@Inject
	private EventBus bus;

	/**
 	 * The famous {@link java.util.ResourceBundle}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
 	*/
	@Inject
	private ResourceBundle rb;

	/**
 	 * An {@link java.util.concurrent.Executor} going back to the FX-Thread
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
 	*/
	@Inject
	@FX
	private Executor fx;
	/**
	 * The entity manager to get the list of Folder
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Inject
	private EntityManager manager;
	/**
	 * The controller to display Folder list.
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Inject
	private ListFolderController itemController;
	/**
	 * The context
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Inject
	@Context
	private ObservableList<Folder> context;

	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Inject
	protected ListFolderHandler() {
	}
	/**
	 * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Override
	protected Domain getDomain() {
		return ApplicationDomain.FOLDER;
	}

	/**
	 * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Override
	protected Controller<? extends Node> getMainViewController() {
		return itemController;
	}

	/**
	 * {@inheritDoc}
	 * 
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Override
	protected List<Folder> loadDataInBackground(LinkEvent<Location> event) {
		//FIXME you may not want to fetch all the database here?
		return manager.list(Folder.class);
	}

	/**
	 * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Override
	protected void configureContext(List<Folder> arg0) {
		context.clear();
		context.addAll(arg0);
	}

	/**
	 * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Override
	protected void configureLocation(List<Folder> arg0, ObservableList<MenuItem> items) {
		items.clear();
		//TODO genMyModel => Add the list.Folder in the application.properties files
		items.add(MenuItemBuilder.create().text(rb.getString("list.Folder")).onAction(ApplicationDomain.FOLDER.listHandler())
				.build());
	}

	/**
	 * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Override
	protected void toStore(List<Folder> arg0, ObservableList<Wrapper> arg1) {
		// nothing to store
	}
}
