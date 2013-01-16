package com.genmymodel.controller;

import petshop.wrapper.Item;

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
import petshop.wrappers.Product;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class ItemController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ItemController.class);
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField price_data;
	@javafx.fxml.FXML
	private ComboBox<Product> product_data;
	@javafx.fxml.FXML
	private TextField quantity_data;
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
	private Item item;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setItem(Item wrapper){
		this.item = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(item.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), item.creationDateProperty());
		id_data.setText(String.valueOf(item.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), item.idProperty());
		price_data.setText(String.valueOf(item.getPrice()));
		this.binder.configureBindingBidirectional(price_data.textProperty(), item.priceProperty());
		quantity_data.setText(String.valueOf(item.getQuantity()));
		this.binder.configureBindingBidirectional(quantity_data.textProperty(), item.quantityProperty());
		updateDate_data.setText(String.valueOf(item.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), item.updateDateProperty());
		version_data.setText(String.valueOf(item.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), item.versionProperty());
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
	public void selectProduct () 
	{
		//Start of user code selectProduct
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
