package com.dooapp.init;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dooapp.lib.init.Initializer;
import com.dooapp.lib.init.InitializerOrder;

/**
 * This class init the PersistentImage module<br>
 * <br>
 * Created at : 1359450361<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
public class PersistentImageInitalizer extends Initializer {
	/**
	 * The famous logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(PersistentImageInitalizer.class);

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

	public double getInitializationTime() {
		// TODO write this method
		return 1;
	}
}
