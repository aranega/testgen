package com.dooapp.dooapptest.e.handler;

import com.dooapp.dooapptest.e.controller.EController;

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


import com.dooapp.dooappTest.wrapper.E;
import com.dooapp.dooappTest.e.controller.EController;
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
import com.dooapp.dooappTest.ApplicationDomain;
import com.dooapp.dooapptest.ApplicationDomain;
import com.dooapp.dooapptest.wrapper.E;

/**
 * This handler show  a <br> E </br>
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @author genmymodel
 * @since 1.0-SNAPSHOT	
 * @generated
 */
public class ShowEHandler extends AbstractDisplayHandler<E>  {
	/**
	 * The logger
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private static final Logger logger = LoggerFactory.getLogger(ShowEHandler.class);
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
	 * The entity manager to get a fresh instance of E
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
	private EController itemController;
	/**
	 * The context
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	@Context
	private ObjectProperty<E> context;
	
	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	protected ShowEHandler() {
	}

	/**
	 * {@inheritDoc}
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected Domain getDomain() {
		return ApplicationDomain.E;
	}

	/**
	 * {@inheritDoc}
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected Class<E> getClazz() {
		return E.class;
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
	protected E loadDataInBackground(LinkEvent<DisplayLocation> arg0) {
		try {
			return entityManager.get(E.class, arg0.getLocation().getId());
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
	protected void toStore(E configuration, ObservableList<Wrapper> toStore) {
		toStore.add(configuration);
	}

	/**
	 * {@inheritDoc}
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected void configureLocation(final E item, ObservableList<MenuItem> items) {
		items.clear();
		items.add(MenuItemBuilder.create().text(rb.getString("list.E")).onAction(ApplicationDomain.E.listHandler())
				.build());
		MenuItem currentItem = MenuItemBuilder.create()
				.onAction(ApplicationDomain.E.showHandler(E.class, item.getId())).build();
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
	protected void configureContext(final E item) {
		context.set(item);
	}
}
