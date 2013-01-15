package com.genmymodel.handler;

import com.genmymodel.controller.OrderController;

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
import com.genmymodel.petshop.wrapper.Order;

/**
 * This handler show  a Order <br>
 * <br>
 * Created at : 1358259873<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 */
public class ShowOrderHandler extends AbstractDisplayHandler<Order> {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ShowOrderHandler.class);
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
	 * The entity manager to ) get a fresh instance of Order
	 */
	@Inject
	private EntityManager manager;
	/**
	 * The controller we will display.
	 */
	@Inject
	private OrderController itemController;
	/**
	 * The context
	 */
	@Inject
	@Context
	private ObjectProperty<Order> context;
	
	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
	 */
	@Inject
	protected ShowOrderHandler() {
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
	protected Class<Order> getClazz() {
		return Order.class;
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
	protected Order loadDataInBackground(LinkEvent<DisplayLocation> arg0) {
		try {
			return entityManager.get(Order.class, arg0.getLocation().getId());
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
	protected void toStore(Order configuration, ObservableList<Wrapper> toStore) {
		toStore.add(configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureLocation(final Order item, ObservableList<MenuItem> items) {
		items.clear();
		//TODO genMyModel => Add the list.Order in the application.properties files
		items.add(MenuItemBuilder.create().text(rb.getString("list.Order")).onAction(ApplicationDomain.ORDER.listHandler())
				.build());
		MenuItem currentItem = MenuItemBuilder.create()
				.onAction(ApplicationDomain.ORDER.showHandler(Order.class, item.getId())).build();
		//If there is a nameProperty on Order uncomment me
		//currentItem.textProperty().bind(item.nameProperty());
		items.add(currentItem);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureContext(final Order item) {
		context.set(item);
	}
}
