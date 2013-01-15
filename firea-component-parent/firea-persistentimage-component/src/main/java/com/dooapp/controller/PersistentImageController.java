package com.dooapp.controller;

import firea.wrapper.PersistentImage;

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
import firea.wrappers.Contact;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class PersistentImageController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(PersistentImageController.class);
	@javafx.fxml.FXML
	private ComboBox<Contact> contact_data;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField dataId_data;
	@javafx.fxml.FXML
	private TextField error_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField preview_data;
	@javafx.fxml.FXML
	private TextField sourceFile_data;
	@javafx.fxml.FXML
	private TextField title_data;
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
	private PersistentImage persistentImage;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setPersistentImage(PersistentImage wrapper){
		this.persistentImage = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(persistentImage.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), persistentImage.creationDateProperty());
		dataId_data.setText(String.valueOf(persistentImage.getDataId()));
		this.binder.configureBindingBidirectional(dataId_data.textProperty(), persistentImage.dataIdProperty());
		error_data.setText(String.valueOf(persistentImage.getError()));
		this.binder.configureBindingBidirectional(error_data.textProperty(), persistentImage.errorProperty());
		id_data.setText(String.valueOf(persistentImage.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), persistentImage.idProperty());
		preview_data.setText(String.valueOf(persistentImage.getPreview()));
		this.binder.configureBindingBidirectional(preview_data.textProperty(), persistentImage.previewProperty());
		sourceFile_data.setText(String.valueOf(persistentImage.getSourceFile()));
		this.binder.configureBindingBidirectional(sourceFile_data.textProperty(), persistentImage.sourceFileProperty());
		title_data.setText(String.valueOf(persistentImage.getTitle()));
		this.binder.configureBindingBidirectional(title_data.textProperty(), persistentImage.titleProperty());
		updateDate_data.setText(String.valueOf(persistentImage.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), persistentImage.updateDateProperty());
		version_data.setText(String.valueOf(persistentImage.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), persistentImage.versionProperty());
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
	public void selectContact () 
	{
		//Start of user code selectContact
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
