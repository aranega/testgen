package com.genmymodel.controller;

import petshop.wrapper.Toying;

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
public class ToyingController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ToyingController.class);
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField description_data;
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
	private Toying toying;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setToying(Toying wrapper){
		this.toying = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(toying.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), toying.creationDateProperty());
		description_data.setText(String.valueOf(toying.getDescription()));
		this.binder.configureBindingBidirectional(description_data.textProperty(), toying.descriptionProperty());
		id_data.setText(String.valueOf(toying.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), toying.idProperty());
		name_data.setText(String.valueOf(toying.getName()));
		this.binder.configureBindingBidirectional(name_data.textProperty(), toying.nameProperty());
		updateDate_data.setText(String.valueOf(toying.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), toying.updateDateProperty());
		version_data.setText(String.valueOf(toying.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), toying.versionProperty());
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
