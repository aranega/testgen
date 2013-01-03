package com.dooapp.controller;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.junit.Ignore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dooapp.ioc.BottleConfigurationModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * This class allow us to show a simple view<br>
 * <br>
 * Created at : 1357210569<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
@Ignore
public class BottleConfigurationControllerTest extends Application {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(BottleConfigurationControllerTest.class);

	/**
	 * {@inheritDoc}
	 */

	@Override
	public void start(Stage arg0) throws Exception {
		Injector injector = Guice.createInjector(new BottleConfigurationModule());
		Scene scene = new Scene((Parent) injector.getInstance(BottleConfigurationController.class).getNode());
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}