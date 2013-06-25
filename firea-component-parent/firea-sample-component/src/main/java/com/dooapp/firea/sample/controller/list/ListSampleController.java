package com.dooapp.firea.sample.controller.list;


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
import com.dooapp.firea.wrapper.Sample;

import com.google.inject.Provider;

/**
 * This Controller show list of Sample .<br>
 * <br>
 * Created at : date<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
public class ListSampleController extends AbstractListController<Sample, Node,SamplePreviewController,Node> {

	/**
	 * The famous {@link org.slf4j.Logger}
	 */
	private static final Logger logger = LoggerFactory.getLogger(ListSampleController.class);
		
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
	 * the Sample list vbox
	 */
	@FXML
	private VBox box;
	/**
	 * Provide a controller for a Sample preview
	 */
	@Inject
	private Provider<SamplePreviewController> childProvider;
	/**
	 * The list of Sample in the context to display
	 */
	@Inject
	@Context
	private ObservableList<Sample> context;
	
	/**
	 * protected constructor to prevent non IOC instantiation.
	 */
	@Inject
	protected ListSampleController(){}
	
	
	/**
	 * Handle creating a new Sample
	 */
	@FXML
	private void create(){
		ApplicationDomain.SAMPLE.createHandler(null).handle(null);
	}
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SamplePreviewController provideChild() {
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
	protected ObservableList<Sample> getData() {
		return context;
	}
}

