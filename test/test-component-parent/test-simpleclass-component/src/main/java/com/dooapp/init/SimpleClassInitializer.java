package com.dooapp.init;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dooapp.annotation.SimpleClass;
import com.dooapp.lib.init.Initializer;
import com.dooapp.lib.init.InitializerOrder;
import com.google.inject.Inject;

/**
 * This class init the SimpleClass module<br>
 * <br>
 * Created at : 1352996815<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
public class SimpleClassInitializer implements Initializer {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(SimpleClassInitializer.class);
	/**
	 * The ResourceBundle 
	 */
	@Inject
	@SimpleClass
	private ResourceBundle rb;

	/**
	 * {@inheritDoc}
	 */

	public void init() {
		// TODO write this method
		logger.error(this.getClass()+" is doing nothing");
	}

	/**
	 * {@inheritDoc}
	 */

	public InitializerOrder getOrder() {
		// TODO write this method
		return InitializerOrder.AFTER_IOC;
	}

	/**
	 * {@inheritDoc}
	 */

	public String getMessage() {
		return rb.getString("init-message");
	}

	/**
	 * {@inheritDoc}
	 */

	public double getInitializationTime() {
		// TODO write this method
		return 1;
	}
}
