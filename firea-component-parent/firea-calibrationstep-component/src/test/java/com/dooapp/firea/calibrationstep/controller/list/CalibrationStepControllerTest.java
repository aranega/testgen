package com.dooapp.firea.calibrationstep.controller.list;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.junit.Ignore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dooapp.ioc.CalibrationStepModule;
import com.dooapp.lib.guice.IOC;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * This class allow us to show a simple view<br>
 * <br>
 * Created at : date<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
@Ignore
public class CalibrationStepControllerTest extends Application {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(CalibrationStepControllerTest.class);

	/**
	 * {@inheritDoc}
	 */

	@Override
	public void start(Stage arg0) throws Exception {
		Injector injector = IOC.getInjector();
		Scene scene = new Scene((Parent) injector.getInstance(ListCalibrationStepController.class).getNode());
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
