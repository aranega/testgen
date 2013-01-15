package com.dooapp.controller;

import fireaOLD.wrapper.Reading;

import com.dooapp.lib.controller.AbstractController;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.scene.Node;
import java.util.ResourceBundle;
import java.net.URL;
import  javafx.scene.control.TableView;
import  javafx.scene.control.ComboBox;
import  javafx.scene.control.TextField;
import fireaOLD.wrappers.Point;
import fireaOLD.wrappers.Device;
import fireaOLD.wrappers.GaugeMode;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class ReadingController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ReadingController.class);
	@javafx.fxml.FXML
	private TextField buildingPressure_data;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private ComboBox<Device> device_data;
	@javafx.fxml.FXML
	private TableView<Device> device_dataview;
	@javafx.fxml.FXML
	private TextField fanPressure_data;
	@javafx.fxml.FXML
	private ComboBox<GaugeMode> gaugemode_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField lowFlow_data;
	@javafx.fxml.FXML
	private ComboBox<Point> point_data;
	@javafx.fxml.FXML
	private TextField timeAverage_data;
	@javafx.fxml.FXML
	private TextField updateDate_data;
	@javafx.fxml.FXML
	private TextField version_data;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/*
 	 * Handled Wrapper
	 *
	 */
	private Reading reading;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setReading(Reading wrapper){
		this.reading = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		buildingPressure_data.setText(String.valueOf(reading.getBuildingPressure()));
		this.binder.configureBindingBidirectional(buildingPressure_data.textProperty(), reading.buildingPressureProperty());
		creationDate_data.setText(String.valueOf(reading.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), reading.creationDateProperty());
		fanPressure_data.setText(String.valueOf(reading.getFanPressure()));
		this.binder.configureBindingBidirectional(fanPressure_data.textProperty(), reading.fanPressureProperty());
		id_data.setText(String.valueOf(reading.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), reading.idProperty());
		lowFlow_data.setText(String.valueOf(reading.getLowFlow()));
		this.binder.configureBindingBidirectional(lowFlow_data.textProperty(), reading.lowFlowProperty());
		timeAverage_data.setText(String.valueOf(reading.getTimeAverage()));
		this.binder.configureBindingBidirectional(timeAverage_data.textProperty(), reading.timeAverageProperty());
		updateDate_data.setText(String.valueOf(reading.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), reading.updateDateProperty());
		version_data.setText(String.valueOf(reading.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), reading.versionProperty());
	}

	@javafx.fxml.FXML
	public void handleCancelButtonAction () 
	{
		//Start of user code handleCancelButtonAction
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void handleSubmitButtonAction () 
	{
		//Start of user code handleSubmitButtonAction
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectDevice () 
	{
		//Start of user code selectDevice
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectGaugemode () 
	{
		//Start of user code selectGaugemode
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectPoint () 
	{
		//Start of user code selectPoint
		// TODO: implement me! 
		//End of user code	
	}


	

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void registerObservables() {
		//Start of user code user code register observables
		//End of user code
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void onFirstView() {
		//Start of user code user code first view
		//End of user code
	}
	

	

	//Start of user code for methods
	// Other methods
	//End of user code
}
