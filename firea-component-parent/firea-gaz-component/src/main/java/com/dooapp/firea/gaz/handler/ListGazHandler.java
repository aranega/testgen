package com.dooapp.firea.gaz.handler;

import com.dooapp.firea.gaz.controller.list.ListGazController;

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
import com.dooapp.firea.wrapper.Gaz;

/**
 * This handler show list of Gaz <br>
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
public class ListGazHandler extends AbstractListHandler<Gaz> {
	/**
     * The famous {@link org.slf4j.Logger}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	private static final Logger logger = LoggerFactory.getLogger(ListGazHandler.class);
	
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
	 * The entity manager to get the list of Gaz
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Inject
	private EntityManager manager;
	/**
	 * The controller to display Gaz list.
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Inject
	private ListGazController itemController;
	/**
	 * The context
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Inject
	@Context
	private ObservableList<Gaz> context;

	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Inject
	protected ListGazHandler() {
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
		return ApplicationDomain.GAZ;
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
	protected List<Gaz> loadDataInBackground(LinkEvent<Location> event) {
		//FIXME you may not want to fetch all the database here?
		return manager.list(Gaz.class);
	}

	/**
	 * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Override
	protected void configureContext(List<Gaz> arg0) {
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
	protected void configureLocation(List<Gaz> arg0, ObservableList<MenuItem> items) {
		items.clear();
		//TODO genMyModel => Add the list.Gaz in the application.properties files
		items.add(MenuItemBuilder.create().text(rb.getString("list.Gaz")).onAction(ApplicationDomain.GAZ.listHandler())
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
	protected void toStore(List<Gaz> arg0, ObservableList<Wrapper> arg1) {
		// nothing to store
	}
}
