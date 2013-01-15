package com.genmymodel.controller;

import petshop.wrapper.Customer;

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
import petshop.wrappers.Address;
import petshop.wrappers.Cart;
import petshop.wrappers.Order;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class CustomerController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@javafx.fxml.FXML
	private ComboBox<Address> address_data;
	@javafx.fxml.FXML
	private ComboBox<Cart> carts_data;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField firstName_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField lastName_data;
	@javafx.fxml.FXML
	private ComboBox<Order> orders_data;
	@javafx.fxml.FXML
	private TableView<Order> orders_dataview;
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
	private Customer customer;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setCustomer(Customer wrapper){
		this.customer = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(customer.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), customer.creationDateProperty());
		firstName_data.setText(String.valueOf(customer.getFirstName()));
		this.binder.configureBindingBidirectional(firstName_data.textProperty(), customer.firstNameProperty());
		id_data.setText(String.valueOf(customer.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), customer.idProperty());
		lastName_data.setText(String.valueOf(customer.getLastName()));
		this.binder.configureBindingBidirectional(lastName_data.textProperty(), customer.lastNameProperty());
		updateDate_data.setText(String.valueOf(customer.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), customer.updateDateProperty());
		version_data.setText(String.valueOf(customer.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), customer.versionProperty());
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
	public void selectAddress () 
	{
		//Start of user code selectAddress
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectCarts () 
	{
		//Start of user code selectCarts
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectOrders () 
	{
		//Start of user code selectOrders
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
