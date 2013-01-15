package com.genmymodel.handler;

import com.genmymodel.controller.list.ListItemController;

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
import com.genmymodel.petshop.wrapper.Item;

/**
 * This handler show list of Item <br>
 * <br>
 * Created at : 1358259855<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 */
public class ListItemHandler extends AbstractListHandler<Item> {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ListItemHandler.class);
	
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
	 * The entity manager to get the list of Item
	 */
	@Inject
	private EntityManager manager;
	/**
	 * The controller to display Item list.
	 */
	@Inject
	private ListItemController itemController;
	/**
	 * The context
	 */
	@Inject
	@Context
	private ObservableList<Item> context;

	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
	 */
	@Inject
	protected ListItemHandler() {
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Domain getDomain() {
		return ApplicationDomain.ITEM;
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
	protected List<Item> loadDataInBackground(LinkEvent<Location> event) {
		//FIXME you may not want to fetch all the database here?
		return manager.list(Item.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureContext(List<Item> arg0) {
		context.clear();
		context.addAll(arg0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureLocation(List<Item> arg0, ObservableList<MenuItem> items) {
		items.clear();
		//TODO genMyModel => Add the list.Item in the application.properties files
		items.add(MenuItemBuilder.create().text(rb.getString("list.Item")).onAction(ApplicationDomain.ITEM.listHandler())
				.build());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void toStore(List<Item> arg0, ObservableList<Wrapper> arg1) {
		// nothing to store
	}
}
