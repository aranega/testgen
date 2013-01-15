package com.genmymodel.controller.list;


import java.util.ResourceBundle;
import java.util.concurrent.Executor;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dooapp.lib.annotation.Context;
import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.controller.AbstractListController;
import com.dooapp.lib.event.bus.EventBus;
import com.genmymodel.petshop.entity.ApplicationDomain;
import com.genmymodel.petshop.wrapper.Order;

import com.google.inject.Provider;

/**
 * This Controller show list of Order .<br>
 * <br>
 * Created at : 1358259873<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
public class ListOrderController extends AbstractListController<Order,OrderPreviewController,Node> {

	/**
	 * The famous {@link Logger}
	 */
	private static final Logger logger = LoggerFactory.getLogger(ListOrderController.class);
		
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
	 * the Order list vbox
	 */
	@FXML
	private VBox box;
	/**
	 * Provide a controller for a Order preview
	 */
	@Inject
	private Provider<OrderPreviewController> childProvider;
	/**
	 * The list of Order in the context to display
	 */
	@Inject
	@Context
	private ObservableList<Order> context;
	
	/**
	 * protected constructor to prevent non IOC instantiation.
	 */
	@Inject
	protected ListOrderController(){}
	
	
	/**
	 * Handle creating a new Order
	 */
	@FXML
	private void create(){
		ApplicationDomain.ORDER.createHandler(null).handle(null);
	}
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected OrderPreviewController provideChild() {
		return childProvider.get();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void addInNode(Node node) {
		box.getChildren().add(node);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void clearNodeItems() {
		box.getChildren().clear();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ObservableList<Order> getData() {
		return context;
	}
}

