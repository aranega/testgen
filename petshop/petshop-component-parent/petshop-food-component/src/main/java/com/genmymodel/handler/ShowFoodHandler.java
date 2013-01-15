package com.genmymodel.handler;

import com.genmymodel.controller.FoodController;

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
import com.genmymodel.petshop.wrapper.Food;

/**
 * This handler show  a Food <br>
 * <br>
 * Created at : 1358259877<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 */
public class ShowFoodHandler extends AbstractDisplayHandler<Food> {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ShowFoodHandler.class);
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
	 * The entity manager to ) get a fresh instance of Food
	 */
	@Inject
	private EntityManager manager;
	/**
	 * The controller we will display.
	 */
	@Inject
	private FoodController itemController;
	/**
	 * The context
	 */
	@Inject
	@Context
	private ObjectProperty<Food> context;
	
	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
	 */
	@Inject
	protected ShowFoodHandler() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Domain getDomain() {
		return ApplicationDomain.FOOD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Class<Food> getClazz() {
		return Food.class;
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
	protected Food loadDataInBackground(LinkEvent<DisplayLocation> arg0) {
		try {
			return entityManager.get(Food.class, arg0.getLocation().getId());
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
	protected void toStore(Food configuration, ObservableList<Wrapper> toStore) {
		toStore.add(configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureLocation(final Food item, ObservableList<MenuItem> items) {
		items.clear();
		//TODO genMyModel => Add the list.Food in the application.properties files
		items.add(MenuItemBuilder.create().text(rb.getString("list.Food")).onAction(ApplicationDomain.FOOD.listHandler())
				.build());
		MenuItem currentItem = MenuItemBuilder.create()
				.onAction(ApplicationDomain.FOOD.showHandler(Food.class, item.getId())).build();
		//If there is a nameProperty on Food uncomment me
		//currentItem.textProperty().bind(item.nameProperty());
		items.add(currentItem);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureContext(final Food item) {
		context.set(item);
	}
}
