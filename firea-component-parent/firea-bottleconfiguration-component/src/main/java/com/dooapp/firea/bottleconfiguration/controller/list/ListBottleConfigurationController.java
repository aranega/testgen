package com.dooapp.firea.bottleconfiguration.controller.list;


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
import com.dooapp.firea.ApplicationDomain;
import com.dooapp.firea.wrapper.BottleConfiguration;

import com.google.inject.Provider;

/**
 * This Controller show list of BottleConfiguration .<br>
 * <br>
 * Created at : date<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
public class ListBottleConfigurationController extends AbstractListController<BottleConfiguration, Node,BottleConfigurationPreviewController,Node> {

	/**
	 * The famous {@link org.slf4j.Logger}
	 */
	private static final Logger logger = LoggerFactory.getLogger(ListBottleConfigurationController.class);
		
	/**
	 * The famous {@link com.dooapp.lib.event.bus.EventBus}
	 */
	@Inject
	private EventBus bus;

	/**
     * The famous {@link java.util.ResourceBundle}
	 */
	@Inject
	private ResourceBundle rb;

	/**
	 * An {@link java.util.concurrent.Executor} going back to the FX-Thread
	 */
	@Inject
	@FX
	private Executor fx;
	/**
	 * the BottleConfiguration list vbox
	 */
	@FXML
	private VBox box;
	/**
	 * Provide a controller for a BottleConfiguration preview
	 */
	@Inject
	private Provider<BottleConfigurationPreviewController> childProvider;
	/**
	 * The list of BottleConfiguration in the context to display
	 */
	@Inject
	@Context
	private ObservableList<BottleConfiguration> context;
	
	/**
	 * protected constructor to prevent non IOC instantiation.
	 */
	@Inject
	protected ListBottleConfigurationController(){}
	
	
	/**
	 * Handle creating a new BottleConfiguration
	 */
	@FXML
	private void create(){
		ApplicationDomain.BOTTLECONFIGURATION.createHandler(null).handle(null);
	}
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected BottleConfigurationPreviewController provideChild() {
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
	protected ObservableList<BottleConfiguration> getData() {
		return context;
	}
}

