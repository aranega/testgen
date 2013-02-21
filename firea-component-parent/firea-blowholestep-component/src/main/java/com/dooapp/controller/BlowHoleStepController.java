package com.dooapp.controller;


import java.util.ResourceBundle;
import java.util.concurrent.Executor;

import javafx.scene.Node;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.controller.AbstractController;
import com.dooapp.lib.event.bus.EventBus;

/**
 * Just a simple handler to show you how to do it.<br>
 * <br>
 * Created at : 1361452042<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
public class BlowHoleStepController extends AbstractController<Node> {

	/**
	 * The famous {@link Logger}
	 */
	private static final Logger logger = LoggerFactory.getLogger(BlowHoleStepController.class);
		
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
	 * protected constructor to prevent non IOC instantiation.
	 */
	@Inject
	protected BlowHoleStepController(){}

	
	/**
	 * {@inheritDoc}<br>
	 * Use {@link #addObservables(javafx.collections.ObservableList...)} and
	 * {@link #addObservables(javafx.beans.value.ObservableValue...)} to register every value that will call
	 * {@link #configure()} and {@link #unconfigure()} when they change.<br>
	 * To have more information see http://gitlab.jack.dooapp.com/dooapp-lib/wikis/controller.registerObservables
	 * 
	 * @see http://gitlab.jack.dooapp.com/dooapp-lib/wikis/controller.registerObservables
	 */
	@Override
	protected void registerObservables() {
		//TODO write this method
	}

}

