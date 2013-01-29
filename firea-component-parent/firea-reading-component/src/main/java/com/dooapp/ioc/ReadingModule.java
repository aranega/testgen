package com.dooapp.ioc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.AbstractModule;

/**
 * This is the main Guice module of Reading<br>
 * As far as it is in the <code>com.dooapp.ioc</code> package, 
 * it will be automatically registered during the application startup.
 * <br>
 * Created at : 1359450336<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
public class ReadingModule extends AbstractModule {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ReadingModule.class);

	/**
	 * {@inheritDoc}
	 */

	@Override
	protected void configure() {
	}

}
