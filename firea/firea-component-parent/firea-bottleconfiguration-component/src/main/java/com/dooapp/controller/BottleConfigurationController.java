package com.dooapp.controller;

import firea.wrapper.BottleConfiguration;

import com.dooapp.lib.controller.AbstractController;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.scene.Node;
import java.util.ResourceBundle;
import java.net.URL;
import  javafx.scene.control.ComboBox;
import  javafx.scene.control.TextField;
import firea.wrappers.GazConfiguration;
import firea.wrappers.BottleType;
import firea.entity.BottleUnit;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class BottleConfigurationController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(BottleConfigurationController.class);
	@javafx.fxml.FXML
	private ComboBox<BottleType> bottletype_data;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private ComboBox<GazConfiguration> gazconfiguration_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField load_data;
	@javafx.fxml.FXML
	private TextField quantity_data;
	@javafx.fxml.FXML
	private ComboBox<BottleUnit> unit_data;
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
	private BottleConfiguration bottleConfiguration;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setBottleConfiguration(BottleConfiguration wrapper){
		this.bottleConfiguration = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(bottleConfiguration.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), bottleConfiguration.creationDateProperty());
		id_data.setText(String.valueOf(bottleConfiguration.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), bottleConfiguration.idProperty());
		load_data.setText(String.valueOf(bottleConfiguration.getLoad()));
		this.binder.configureBindingBidirectional(load_data.textProperty(), bottleConfiguration.loadProperty());
		quantity_data.setText(String.valueOf(bottleConfiguration.getQuantity()));
		this.binder.configureBindingBidirectional(quantity_data.textProperty(), bottleConfiguration.quantityProperty());
		updateDate_data.setText(String.valueOf(bottleConfiguration.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), bottleConfiguration.updateDateProperty());
		version_data.setText(String.valueOf(bottleConfiguration.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), bottleConfiguration.versionProperty());
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
	public void selectBottletype () 
	{
		//Start of user code selectBottletype
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectGazconfiguration () 
	{
		//Start of user code selectGazconfiguration
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
