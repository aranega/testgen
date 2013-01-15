package com.genmymodel.handler;

import com.genmymodel.controller.ItemController;

import java.util.ResourceBundle;
import java.util.concurrent.Executor;

import javafx.beans.property.ObjectProperty;
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
import com.dooapp.lib.event.UncaughtExceptionEvent;
import com.dooapp.lib.event.bus.EventBus;
import com.dooapp.lib.handler.AbstractDisplayHandler;
import com.dooapp.lib.location.DisplayLocation;
import com.dooapp.lib.location.Domain;
import com.dooapp.lib.location.event.LinkEvent;
import com.dooapp.lib.manager.EntityManager;
import com.dooapp.lib.manager.ObjectNotFoundException;
import com.genmymodel.petshop.entity.ApplicationDomain;
import com.genmymodel.petshop.wrapper.Item;

/**
 * This handler show  a Item <br>
 * <br>
 * Created at : 1358259855<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 */
public class ShowItemHandler extends AbstractDisplayHandler<Item> {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ShowItemHandler.class);
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
	 * The entity manager to ) get a fresh instance of Item
	 */
	@Inject
	private EntityManager manager;
	/**
	 * The controller we will display.
	 */
	@Inject
	private ItemController itemController;
	/**
	 * The context
	 */
	@Inject
	@Context
	private ObjectProperty<Item> context;
	
	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
	 */
	@Inject
	protected ShowItemHandler() {
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
	protected Class<Item> getClazz() {
		return Item.class;
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
	 */
	@Override
	protected Item loadDataInBackground(LinkEvent<DisplayLocation> arg0) {
		try {
			return entityManager.get(Item.class, arg0.getLocation().getId());
		} catch (ObjectNotFoundException e) {
			logger.error(e.getMessage(), e);
			bus.publish(new UncaughtExceptionEvent(e));
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void toStore(Item configuration, ObservableList<Wrapper> toStore) {
		toStore.add(configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureLocation(final Item item, ObservableList<MenuItem> items) {
		items.clear();
		//TODO genMyModel => Add the list.Item in the application.properties files
		items.add(MenuItemBuilder.create().text(rb.getString("list.Item")).onAction(ApplicationDomain.ITEM.listHandler())
				.build());
		MenuItem currentItem = MenuItemBuilder.create()
				.onAction(ApplicationDomain.ITEM.showHandler(Item.class, item.getId())).build();
		//If there is a nameProperty on Item uncomment me
		//currentItem.textProperty().bind(item.nameProperty());
		items.add(currentItem);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureContext(final Item item) {
		context.set(item);
	}
}
