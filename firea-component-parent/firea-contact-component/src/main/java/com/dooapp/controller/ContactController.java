package com.dooapp.controller;

import firea.wrapper.Contact;

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
import firea.wrappers.PersistentImage;
import firea.entity.ContactKind;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class ContactController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ContactController.class);
	@javafx.fxml.FXML
	private TextField address2_data;
	@javafx.fxml.FXML
	private TextField adress1_data;
	@javafx.fxml.FXML
	private TextField city_data;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField email_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private ComboBox<PersistentImage> image_data;
	@javafx.fxml.FXML
	private ComboBox<ContactKind> kind_data;
	@javafx.fxml.FXML
	private TextField name_data;
	@javafx.fxml.FXML
	private TextField person_data;
	@javafx.fxml.FXML
	private TextField phone_data;
	@javafx.fxml.FXML
	private TextField siret_data;
	@javafx.fxml.FXML
	private TextField updateDate_data;
	@javafx.fxml.FXML
	private TextField version_data;
	@javafx.fxml.FXML
	private TextField zipCode_data;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/*
 	 * Handled Wrapper
	 *
	 */
	private Contact contact;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setContact(Contact wrapper){
		this.contact = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		address2_data.setText(String.valueOf(contact.getAddress2()));
		this.binder.configureBindingBidirectional(address2_data.textProperty(), contact.address2Property());
		adress1_data.setText(String.valueOf(contact.getAdress1()));
		this.binder.configureBindingBidirectional(adress1_data.textProperty(), contact.adress1Property());
		city_data.setText(String.valueOf(contact.getCity()));
		this.binder.configureBindingBidirectional(city_data.textProperty(), contact.cityProperty());
		creationDate_data.setText(String.valueOf(contact.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), contact.creationDateProperty());
		email_data.setText(String.valueOf(contact.getEmail()));
		this.binder.configureBindingBidirectional(email_data.textProperty(), contact.emailProperty());
		id_data.setText(String.valueOf(contact.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), contact.idProperty());
		name_data.setText(String.valueOf(contact.getName()));
		this.binder.configureBindingBidirectional(name_data.textProperty(), contact.nameProperty());
		person_data.setText(String.valueOf(contact.getPerson()));
		this.binder.configureBindingBidirectional(person_data.textProperty(), contact.personProperty());
		phone_data.setText(String.valueOf(contact.getPhone()));
		this.binder.configureBindingBidirectional(phone_data.textProperty(), contact.phoneProperty());
		siret_data.setText(String.valueOf(contact.getSiret()));
		this.binder.configureBindingBidirectional(siret_data.textProperty(), contact.siretProperty());
		updateDate_data.setText(String.valueOf(contact.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), contact.updateDateProperty());
		version_data.setText(String.valueOf(contact.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), contact.versionProperty());
		zipCode_data.setText(String.valueOf(contact.getZipCode()));
		this.binder.configureBindingBidirectional(zipCode_data.textProperty(), contact.zipCodeProperty());
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
	public void selectImage () 
	{
		//Start of user code selectImage
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
