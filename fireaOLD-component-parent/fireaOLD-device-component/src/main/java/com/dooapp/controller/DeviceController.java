package com.dooapp.controller;

import fireaOLD.wrapper.Device;

import com.dooapp.lib.controller.AbstractController;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.scene.Node;
import java.util.ResourceBundle;
import java.net.URL;
import  javafx.scene.control.TextField;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class DeviceController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(DeviceController.class);
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField lastCalibrationDate_data;
	@javafx.fxml.FXML
	private TextField serialNumber_data;
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
	private Device device;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setDevice(Device wrapper){
		this.device = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(device.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), device.creationDateProperty());
		id_data.setText(String.valueOf(device.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), device.idProperty());
		lastCalibrationDate_data.setText(String.valueOf(device.getLastCalibrationDate()));
		this.binder.configureBindingBidirectional(lastCalibrationDate_data.textProperty(), device.lastCalibrationDateProperty());
		serialNumber_data.setText(String.valueOf(device.getSerialNumber()));
		this.binder.configureBindingBidirectional(serialNumber_data.textProperty(), device.serialNumberProperty());
		updateDate_data.setText(String.valueOf(device.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), device.updateDateProperty());
		version_data.setText(String.valueOf(device.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), device.versionProperty());
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
