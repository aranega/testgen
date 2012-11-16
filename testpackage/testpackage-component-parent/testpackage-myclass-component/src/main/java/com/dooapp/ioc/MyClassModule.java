package com.dooapp.ioc;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dooapp.annotation.MyClass;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

/**
 * This is the main Guice module of MyClass<br>
 * As far as it is in the <code>com.dooapp.ioc</code> package, 
 * it will be automatically registered during the application startup.
 * <br>
 * Created at : 1353072342<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
public class MyClassModule extends AbstractModule {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(MyClassModule.class);

	/**
	 * {@inheritDoc}
	 */

	@Override
	protected void configure() {
	}

	@Singleton
	@Provides
	@MyClass
	private ResourceBundle provideResourceBundle() {
		return ResourceBundle.getBundle("MyClass");
	}
}
