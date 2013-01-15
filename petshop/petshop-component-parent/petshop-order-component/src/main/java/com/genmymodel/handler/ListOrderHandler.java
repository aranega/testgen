package com.genmymodel.handler;

import com.genmymodel.controller.list.ListOrderController;

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
import com.genmymodel.petshop.entity.ApplicationDomain;
import com.genmymodel.petshop.wrapper.Order;

/**
 * This handler show list of Order <br>
 * <br>
 * Created at : 1358259873<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 */
public class ListOrderHandler extends AbstractListHandler<Order> {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ListOrderHandler.class);
	
	/**
	* The famous {@link EventBus}
 	*/
	@Inject
	private EventBus bus;

	/**
 	* The famous {@link ResourceBundle}
 	*/
	@Inject
	private ResourceBundle rb;

	/**
 	* An {@link Executor} going back to the FX-Thread
 	*/
	@Inject
	@FX
	private Executor fx;
	/**
	 * The entity manager to get the list of Order
	 */
	@Inject
	private EntityManager manager;
	/**
	 * The controller to display Order list.
	 */
	@Inject
	private ListOrderController itemController;
	/**
	 * The context
	 */
	@Inject
	@Context
	private ObservableList<Order> context;

	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
	 */
	@Inject
	protected ListOrderHandler() {
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Domain getDomain() {
		return ApplicationDomain.ORDER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Controller<? extends Node> getMainViewController() {
		return itemController;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws IOException
	 */
	@Override
	protected List<Order> loadDataInBackground(LinkEvent<Location> event) {
		//FIXME you may not want to fetch all the database here?
		return manager.list(Order.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureContext(List<Order> arg0) {
		context.clear();
		context.addAll(arg0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureLocation(List<Order> arg0, ObservableList<MenuItem> items) {
		items.clear();
		//TODO genMyModel => Add the list.Order in the application.properties files
		items.add(MenuItemBuilder.create().text(rb.getString("list.Order")).onAction(ApplicationDomain.ORDER.listHandler())
				.build());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void toStore(List<Order> arg0, ObservableList<Wrapper> arg1) {
		// nothing to store
	}
}
