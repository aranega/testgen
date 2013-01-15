package com.genmymodel.handler;

import com.genmymodel.controller.ProductController;

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
import com.genmymodel.petshop.wrapper.Product;

/**
 * This handler show  a Product <br>
 * <br>
 * Created at : 1358259850<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 */
public class ShowProductHandler extends AbstractDisplayHandler<Product> {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ShowProductHandler.class);
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
	 * The entity manager to ) get a fresh instance of Product
	 */
	@Inject
	private EntityManager manager;
	/**
	 * The controller we will display.
	 */
	@Inject
	private ProductController itemController;
	/**
	 * The context
	 */
	@Inject
	@Context
	private ObjectProperty<Product> context;
	
	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
	 */
	@Inject
	protected ShowProductHandler() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Domain getDomain() {
		return ApplicationDomain.PRODUCT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Class<Product> getClazz() {
		return Product.class;
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
	protected Product loadDataInBackground(LinkEvent<DisplayLocation> arg0) {
		try {
			return entityManager.get(Product.class, arg0.getLocation().getId());
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
	protected void toStore(Product configuration, ObservableList<Wrapper> toStore) {
		toStore.add(configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureLocation(final Product item, ObservableList<MenuItem> items) {
		items.clear();
		//TODO genMyModel => Add the list.Product in the application.properties files
		items.add(MenuItemBuilder.create().text(rb.getString("list.Product")).onAction(ApplicationDomain.PRODUCT.listHandler())
				.build());
		MenuItem currentItem = MenuItemBuilder.create()
				.onAction(ApplicationDomain.PRODUCT.showHandler(Product.class, item.getId())).build();
		//If there is a nameProperty on Product uncomment me
		//currentItem.textProperty().bind(item.nameProperty());
		items.add(currentItem);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureContext(final Product item) {
		context.set(item);
	}
}
