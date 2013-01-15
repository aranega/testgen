package com.genmymodel.controller;

import petshop.wrapper.Address;

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
public class AddressController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(AddressController.class);
	@javafx.fxml.FXML
	private TextField city_data;
	@javafx.fxml.FXML
	private TextField country_data;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField line1_data;
	@javafx.fxml.FXML
	private TextField line2_data;
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
	private Address address;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setAddress(Address wrapper){
		this.address = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		city_data.setText(String.valueOf(address.getCity()));
		this.binder.configureBindingBidirectional(city_data.textProperty(), address.cityProperty());
		country_data.setText(String.valueOf(address.getCountry()));
		this.binder.configureBindingBidirectional(country_data.textProperty(), address.countryProperty());
		creationDate_data.setText(String.valueOf(address.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), address.creationDateProperty());
		id_data.setText(String.valueOf(address.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), address.idProperty());
		line1_data.setText(String.valueOf(address.getLine1()));
		this.binder.configureBindingBidirectional(line1_data.textProperty(), address.line1Property());
		line2_data.setText(String.valueOf(address.getLine2()));
		this.binder.configureBindingBidirectional(line2_data.textProperty(), address.line2Property());
		updateDate_data.setText(String.valueOf(address.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), address.updateDateProperty());
		version_data.setText(String.valueOf(address.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), address.versionProperty());
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
