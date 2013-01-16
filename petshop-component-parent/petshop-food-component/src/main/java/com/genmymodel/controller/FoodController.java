package com.genmymodel.controller;

import petshop.wrapper.Food;

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
public class FoodController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(FoodController.class);
	@javafx.fxml.FXML
	private TextField attribute_data;
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
	private Food food;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setFood(Food wrapper){
		this.food = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		attribute_data.setText(String.valueOf(food.getAttribute()));
		this.binder.configureBindingBidirectional(attribute_data.textProperty(), food.attributeProperty());
		creationDate_data.setText(String.valueOf(food.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), food.creationDateProperty());
		description_data.setText(String.valueOf(food.getDescription()));
		this.binder.configureBindingBidirectional(description_data.textProperty(), food.descriptionProperty());
		id_data.setText(String.valueOf(food.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), food.idProperty());
		name_data.setText(String.valueOf(food.getName()));
		this.binder.configureBindingBidirectional(name_data.textProperty(), food.nameProperty());
		updateDate_data.setText(String.valueOf(food.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), food.updateDateProperty());
		version_data.setText(String.valueOf(food.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), food.versionProperty());
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
