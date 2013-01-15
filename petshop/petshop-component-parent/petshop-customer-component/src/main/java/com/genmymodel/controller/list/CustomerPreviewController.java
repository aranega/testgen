package com.genmymodel.controller.list;


import java.util.ResourceBundle;
import java.util.concurrent.Executor;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.Node;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.controller.AbstractController;
import com.dooapp.lib.controller.ChildController;
import com.dooapp.lib.event.bus.EventBus;
import com.genmymodel.petshop.entity.ApplicationDomain;
import com.genmymodel.petshop.wrapper.Customer;

/**
 * Controller to show the Customer in the list.<br>
 * <br>
 * Created at : 1358259859<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
public class CustomerPreviewController extends AbstractController<Node> implements ChildController<Customer, Node>{

	/**
	 * The famous {@link Logger}
	 */
	private static final Logger logger = LoggerFactory.getLogger(CustomerPreviewController.class);
		
	/**
	 * The famous {@link EventBus}
	 */
	@Inject
	private EventBus bus;

	/**
	 * The famous {@link ResourceBundle}
	 */
	@Inject
	private ResourceBundle rb;

	/**
	 * An {@link Executor} going back to the FX-Thread
	 */
	@Inject
	@FX
	private Executor fx;
	
	/* You should add FXML component here
	 * 
	 * example :
	 * 
	 * 	@FXML
	 *  private Label name;	 
	 *   
	 * 	@FXML
	 *  private Label date;
	 *  
	 *  
	 *  Note : in preview nothing is editable, so you should often use Label to display things
	 *  
	*/
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureView() {
		/* In this method you should configure view to link it with the model
		 * 
		 * example with a String: 
		 * 
		 * viewBinder.bind(getItem().nameProperty(), name);
		 * 
		 * 
		 * If it's an ObjectProperty, you need to add the class of the generic parameter. example :
		 * 
		 *  
		 *  viewBinder.bind(getItem().dateProperty(), date, Date.class);
		 * 
		 */
	}

	/**
	 * protected constructor to prevent non IOC instantiation.
	 */
	@Inject
	protected CustomerPreviewController(){}
	/**
	 * The Customer we will display
	 */
	private ObjectProperty<Customer> itemProperty;
	/**
	 * The Customer we will display
	 */
	public ObjectProperty<Customer> itemProperty(){
		if(itemProperty==null){
			itemProperty = new SimpleObjectProperty<Customer>();
		}
		return itemProperty;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setItem(Customer item) {
		itemProperty().set(item);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Customer getItem() {
		return itemProperty().get();
	}
	
	/**
	 * Handle when someone click on the delete button
	 */
	@FXML
	private void delete(){
		ApplicationDomain.CUSTOMER.deleteHandler(getItem()).handle(null);
	}
	/**
	 * Handle when someone click to open the Customer
	 */
	@FXML 
	private void open(){
		ApplicationDomain.CUSTOMER.showHandler(Customer.class, getItem().getId()).handle(null);
	}
	
	/**
	 * {@inheritDoc}<br>
	 * Use {@link #addObservables(javafx.collections.ObservableList...)} and
	 * {@link #addObservables(javafx.beans.value.ObservableValue...)} to register every value that will call
	 * {@link #configure()} and {@link #unconfigure()} when they change.<br>
	 * To have more information see http://gitlab.jack.dooapp.com/dooapp-lib/wikis/controller.registerObservables
	 * 
	 * @see http://gitlab.jack.dooapp.com/dooapp-lib/wikis/controller.registerObservables
	 */
	@Override
	protected void registerObservables() {
		addObservables(itemProperty());
	}

}

