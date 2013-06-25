package com.dooapp.firea.point.handler;

import com.dooapp.firea.point.controller.PointController;

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
import com.dooapp.firea.ApplicationDomain;
import com.dooapp.firea.wrapper.Point;

/**
 * This handler show  a <br> Point </br>
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @author genmymodel
 * @since 1.0-SNAPSHOT	
 * @generated
 */
public class ShowPointHandler extends AbstractDisplayHandler<Point> {
	/**
	 * The logger
	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	private static final Logger logger = LoggerFactory.getLogger(ShowPointHandler.class);
	/**
 	 * The famous {@link EventBus}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
 	 */
	@Inject
	private EventBus bus;

	/**
 	 * The famous {@link ResourceBundle}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
 	 */
	@Inject
	private ResourceBundle rb;

	/**
 	 * An {@link Executor} going back to the FX-Thread
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
 	 */
	@Inject
	@FX
	private Executor fx;
	/**
	 * The entity manager to get a fresh instance of Point
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	private EntityManager manager;
	/**
	 * The controller we will display.
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	private PointController itemController;
	/**
	 * The context
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	@Context
	private ObjectProperty<Point> context;
	
	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	protected ShowPointHandler() {
	}

	/**
	 * {@inheritDoc}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected Domain getDomain() {
		return ApplicationDomain.POINT;
	}

	/**
	 * {@inheritDoc}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected Class<Point> getClazz() {
		return Point.class;
	}

	/**
	 * {@inheritDoc}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected Controller<? extends Node> getMainViewController() {
		return itemController;
	}

	/**
	 * {@inheritDoc}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected Point loadDataInBackground(LinkEvent<DisplayLocation> arg0) {
		try {
			return entityManager.get(Point.class, arg0.getLocation().getId());
		} catch (ObjectNotFoundException e) {
			logger.error(e.getMessage(), e);
			bus.publish(new UncaughtExceptionEvent(e));
			return null;
		}
	}

	/**
	 * {@inheritDoc}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected void toStore(Point configuration, ObservableList<Wrapper> toStore) {
		toStore.add(configuration);
	}

	/**
	 * {@inheritDoc}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected void configureLocation(final Point item, ObservableList<MenuItem> items) {
		items.clear();
		items.add(MenuItemBuilder.create().text(rb.getString("list.Point")).onAction(ApplicationDomain.POINT.listHandler())
				.build());
		MenuItem currentItem = MenuItemBuilder.create()
				.onAction(ApplicationDomain.POINT.showHandler(Point.class, item.getId())).build();
		//currentItem.textProperty().bind(item.nameProperty());
		items.add(currentItem);
	}

	/**
	 * {@inheritDoc}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected void configureContext(final Point item) {
		context.set(item);
	}
}
