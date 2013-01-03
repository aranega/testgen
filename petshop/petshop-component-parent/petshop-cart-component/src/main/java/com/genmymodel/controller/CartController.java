package com.genmymodel.controller;

import petshop.wrapper.Cart;

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
import petshop.wrappers.Item;
import petshop.wrappers.Customer;
import petshop.wrappers.Order;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class CartController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(CartController.class);
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private ComboBox<Customer> customer_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private ComboBox<Item> items_data;
	@javafx.fxml.FXML
	private TableView<Item> items_dataview;
	@javafx.fxml.FXML
	private ComboBox<Order> order_data;
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
	private Cart cart;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setCart(Cart wrapper){
		this.cart = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(cart.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), cart.creationDateProperty());
		creationDate_data.setText(String.valueOf(cart.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), cart.creationDateProperty());
		id_data.setText(String.valueOf(cart.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), cart.idProperty());
		updateDate_data.setText(String.valueOf(cart.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), cart.updateDateProperty());
		version_data.setText(String.valueOf(cart.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), cart.versionProperty());
	}

	@javafx.fxml.FXML
	public void create () 
	{
		//Start of user code create
		// TODO: implement me! 
		//End of user code	
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
	public void selectCustomer () 
	{
		//Start of user code selectCustomer
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectItems () 
	{
		//Start of user code selectItems
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectOrder () 
	{
		//Start of user code selectOrder
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
