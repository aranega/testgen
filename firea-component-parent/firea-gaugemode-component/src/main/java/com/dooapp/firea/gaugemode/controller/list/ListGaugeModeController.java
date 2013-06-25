package com.dooapp.firea.gaugemode.controller.list;


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
import com.dooapp.firea.wrapper.GaugeMode;

import com.google.inject.Provider;

/**
 * This Controller show list of GaugeMode .<br>
 * <br>
 * Created at : date<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
public class ListGaugeModeController extends AbstractListController<GaugeMode, Node,GaugeModePreviewController,Node> {

	/**
	 * The famous {@link org.slf4j.Logger}
	 */
	private static final Logger logger = LoggerFactory.getLogger(ListGaugeModeController.class);
		
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
	 * the GaugeMode list vbox
	 */
	@FXML
	private VBox box;
	/**
	 * Provide a controller for a GaugeMode preview
	 */
	@Inject
	private Provider<GaugeModePreviewController> childProvider;
	/**
	 * The list of GaugeMode in the context to display
	 */
	@Inject
	@Context
	private ObservableList<GaugeMode> context;
	
	/**
	 * protected constructor to prevent non IOC instantiation.
	 */
	@Inject
	protected ListGaugeModeController(){}
	
	
	/**
	 * Handle creating a new GaugeMode
	 */
	@FXML
	private void create(){
		ApplicationDomain.GAUGEMODE.createHandler(null).handle(null);
	}
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected GaugeModePreviewController provideChild() {
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
	protected ObservableList<GaugeMode> getData() {
		return context;
	}
}

