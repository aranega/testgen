package com.dooapp.ioc;


import javafx.beans.property.ObjectProperty;
import javafx.collections.ObservableList;

import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dooapp.firea.wrapper.PersistentImage;

import com.dooapp.lib.annotation.Context;
import com.dooapp.lib.controller.ContextProvider;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * This is the main Guice module of PersistentImage<br>
 * As far as it is in the <code>com.dooapp.ioc</code> package, 
 * it will be automatically registered during the application startup.
 * <br>
 * Created at : date<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
public class PersistentImageModule extends AbstractModule {
	/**
	 * The famous {@link org.slf4j.Logger}
	 */
	private static final Logger logger = LoggerFactory.getLogger(PersistentImageModule.class);

	/**
	 * {@inheritDoc}
	 */

	@Override
	protected void configure() {
	}
	
	/**
	 * Provide PersistentImage context
	 */
	@Provides
	@Context
	@Singleton
	private ObjectProperty<PersistentImage> providePersistentImageContext(ContextProvider provider) {
		return provider.provideObjectProperty();
	}
	
	/**
	 * Provide PersistentImage list context
	 */
	@Provides
	@Context
	@Singleton
	private ObservableList<PersistentImage> providePersistentImageList(ContextProvider provider) {
		return provider.provideObservableList();
	}


}
