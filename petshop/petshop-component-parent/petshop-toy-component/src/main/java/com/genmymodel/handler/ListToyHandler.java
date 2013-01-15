package com.genmymodel.handler;

import com.genmymodel.controller.list.ListToyController;

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
import com.genmymodel.petshop.wrapper.Toy;

/**
 * This handler show list of Toy <br>
 * <br>
 * Created at : 1358259881<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 */
public class ListToyHandler extends AbstractListHandler<Toy> {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ListToyHandler.class);
	
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
	 * The entity manager to get the list of Toy
	 */
	@Inject
	private EntityManager manager;
	/**
	 * The controller to display Toy list.
	 */
	@Inject
	private ListToyController itemController;
	/**
	 * The context
	 */
	@Inject
	@Context
	private ObservableList<Toy> context;

	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
	 */
	@Inject
	protected ListToyHandler() {
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Domain getDomain() {
		return ApplicationDomain.TOY;
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
	protected List<Toy> loadDataInBackground(LinkEvent<Location> event) {
		//FIXME you may not want to fetch all the database here?
		return manager.list(Toy.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureContext(List<Toy> arg0) {
		context.clear();
		context.addAll(arg0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureLocation(List<Toy> arg0, ObservableList<MenuItem> items) {
		items.clear();
		//TODO genMyModel => Add the list.Toy in the application.properties files
		items.add(MenuItemBuilder.create().text(rb.getString("list.Toy")).onAction(ApplicationDomain.TOY.listHandler())
				.build());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void toStore(List<Toy> arg0, ObservableList<Wrapper> arg1) {
		// nothing to store
	}
}
