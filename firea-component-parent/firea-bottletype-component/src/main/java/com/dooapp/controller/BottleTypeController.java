package com.dooapp.controller;

import firea.wrapper.BottleType;

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

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class BottleTypeController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(BottleTypeController.class);
	@javafx.fxml.FXML
	private ComboBox<BottleConfiguration> bottleconfiguration_data;
	@javafx.fxml.FXML
	private TableView<BottleConfiguration> bottleconfiguration_dataview;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField name_data;
	@javafx.fxml.FXML
	private TextField updateDate_data;
	@javafx.fxml.FXML
	private TextField version_data;
	@javafx.fxml.FXML
	private TextField volume_data;
	@javafx.fxml.FXML
	private TextField weight_data;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/*
 	 * Handled Wrapper
	 *
	 */
	private BottleType bottleType;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setBottleType(BottleType wrapper){
		this.bottleType = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(bottleType.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), bottleType.creationDateProperty());
		id_data.setText(String.valueOf(bottleType.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), bottleType.idProperty());
		name_data.setText(String.valueOf(bottleType.getName()));
		this.binder.configureBindingBidirectional(name_data.textProperty(), bottleType.nameProperty());
		updateDate_data.setText(String.valueOf(bottleType.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), bottleType.updateDateProperty());
		version_data.setText(String.valueOf(bottleType.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), bottleType.versionProperty());
		volume_data.setText(String.valueOf(bottleType.getVolume()));
		this.binder.configureBindingBidirectional(volume_data.textProperty(), bottleType.volumeProperty());
		weight_data.setText(String.valueOf(bottleType.getWeight()));
		this.binder.configureBindingBidirectional(weight_data.textProperty(), bottleType.weightProperty());
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
	public void selectBottleconfiguration () 
	{
		//Start of user code selectBottleconfiguration
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
