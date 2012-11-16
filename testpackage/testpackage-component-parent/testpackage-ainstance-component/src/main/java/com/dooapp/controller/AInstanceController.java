package com.dooapp.controller;


import java.util.ResourceBundle;


import javafx.scene.Node;



import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


import com.dooapp.annotation.AInstance;

import com.dooapp.lib.controller.AbstractController;
import com.google.inject.Inject;



/**
 * TODO write documentation<br>
 * <br>
 * Created at : 1353072330<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */

public class AInstanceController extends AbstractController<Object, Node> {

	/**

	 * The logger

	 */

	private static final Logger logger = LoggerFactory.getLogger(AInstanceController.class);

	/**
	 * The ResourceBundle 
	 */
	@Inject
	@AInstance
	private ResourceBundle rb;
	

	/**

	 * {@inheritDoc}

	 */



	@Override

	protected void configureView(Object configuration) {

		// TODO write this method

	}



	/**

	 * {@inheritDoc}

	 */



	@Override

	protected void unconfigureView(Object configuration) {

		// TODO write this method

	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	protected ResourceBundle getResourceBundle() {
		return rb;
	}




}

