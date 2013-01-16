package com.genmymodel.controller;

import petshop.wrapper.Order;

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
import petshop.wrappers.Cart;
import petshop.wrappers.Item;
import petshop.wrappers.Customer;
import petshop.wrappers.Address;
import petshop.wrappers.Address;
import petshop.entity.OrderStatus;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class OrderController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	@javafx.fxml.FXML
	private ComboBox<Cart> cart_data;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private ComboBox<Customer> customer_data;
	@javafx.fxml.FXML
	private TextField date_data;
	@javafx.fxml.FXML
	private ComboBox<Address> deliveryAddress_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private ComboBox<Item> items_data;
	@javafx.fxml.FXML
	private TableView<Item> items_dataview;
	@javafx.fxml.FXML
	private ComboBox<Address> paymentAddress_data;
	@javafx.fxml.FXML
	private TextField reference_data;
	@javafx.fxml.FXML
	private ComboBox<OrderStatus> status_data;
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
	private Order order;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setOrder(Order wrapper){
		this.order = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(order.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), order.creationDateProperty());
		date_data.setText(String.valueOf(order.getDate()));
		this.binder.configureBindingBidirectional(date_data.textProperty(), order.dateProperty());
		id_data.setText(String.valueOf(order.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), order.idProperty());
		reference_data.setText(String.valueOf(order.getReference()));
		this.binder.configureBindingBidirectional(reference_data.textProperty(), order.referenceProperty());
		updateDate_data.setText(String.valueOf(order.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), order.updateDateProperty());
		version_data.setText(String.valueOf(order.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), order.versionProperty());
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
	public void selectCart () 
	{
		//Start of user code selectCart
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
	public void selectDeliveryAddress () 
	{
		//Start of user code selectDeliveryAddress
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
	public void selectPaymentAddress () 
	{
		//Start of user code selectPaymentAddress
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
