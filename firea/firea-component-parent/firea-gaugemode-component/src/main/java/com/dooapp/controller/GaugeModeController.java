package com.dooapp.controller;

import firea.wrapper.GaugeMode;

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
public class GaugeModeController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(GaugeModeController.class);
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField gaugeType_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField name_data;
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
	private GaugeMode gaugeMode;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setGaugeMode(GaugeMode wrapper){
		this.gaugeMode = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(gaugeMode.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), gaugeMode.creationDateProperty());
		gaugeType_data.setText(String.valueOf(gaugeMode.getGaugeType()));
		this.binder.configureBindingBidirectional(gaugeType_data.textProperty(), gaugeMode.gaugeTypeProperty());
		id_data.setText(String.valueOf(gaugeMode.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), gaugeMode.idProperty());
		name_data.setText(String.valueOf(gaugeMode.getName()));
		this.binder.configureBindingBidirectional(name_data.textProperty(), gaugeMode.nameProperty());
		updateDate_data.setText(String.valueOf(gaugeMode.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), gaugeMode.updateDateProperty());
		version_data.setText(String.valueOf(gaugeMode.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), gaugeMode.versionProperty());
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
