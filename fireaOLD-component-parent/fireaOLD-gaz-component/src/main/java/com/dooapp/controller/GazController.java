package com.dooapp.controller;

import fireaOLD.wrapper.Gaz;

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
import fireaOLD.wrappers.BottleType;
import fireaOLD.wrappers.GazConfiguration;
import fireaOLD.entity.GazWeight;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class GazController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(GazController.class);
	@javafx.fxml.FXML
	private ComboBox<BottleType> bottletypes_data;
	@javafx.fxml.FXML
	private TableView<BottleType> bottletypes_dataview;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField density_data;
	@javafx.fxml.FXML
	private ComboBox<GazConfiguration> gazconfiguration_data;
	@javafx.fxml.FXML
	private TableView<GazConfiguration> gazconfiguration_dataview;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField name_data;
	@javafx.fxml.FXML
	private TextField type_data;
	@javafx.fxml.FXML
	private TextField updateDate_data;
	@javafx.fxml.FXML
	private TextField version_data;
	@javafx.fxml.FXML
	private ComboBox<GazWeight> weight_data;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/*
 	 * Handled Wrapper
	 *
	 */
	private Gaz gaz;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setGaz(Gaz wrapper){
		this.gaz = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(gaz.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), gaz.creationDateProperty());
		density_data.setText(String.valueOf(gaz.getDensity()));
		this.binder.configureBindingBidirectional(density_data.textProperty(), gaz.densityProperty());
		id_data.setText(String.valueOf(gaz.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), gaz.idProperty());
		name_data.setText(String.valueOf(gaz.getName()));
		this.binder.configureBindingBidirectional(name_data.textProperty(), gaz.nameProperty());
		type_data.setText(String.valueOf(gaz.getType()));
		this.binder.configureBindingBidirectional(type_data.textProperty(), gaz.typeProperty());
		updateDate_data.setText(String.valueOf(gaz.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), gaz.updateDateProperty());
		version_data.setText(String.valueOf(gaz.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), gaz.versionProperty());
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
	public void selectBottletypes () 
	{
		//Start of user code selectBottletypes
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
