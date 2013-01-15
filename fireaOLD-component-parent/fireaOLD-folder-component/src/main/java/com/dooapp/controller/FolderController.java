package com.dooapp.controller;

import fireaOLD.wrapper.Folder;

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
public class FolderController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(FolderController.class);
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField displayOrder_data;
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
	private Folder folder;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setFolder(Folder wrapper){
		this.folder = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(folder.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), folder.creationDateProperty());
		displayOrder_data.setText(String.valueOf(folder.getDisplayOrder()));
		this.binder.configureBindingBidirectional(displayOrder_data.textProperty(), folder.displayOrderProperty());
		id_data.setText(String.valueOf(folder.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), folder.idProperty());
		name_data.setText(String.valueOf(folder.getName()));
		this.binder.configureBindingBidirectional(name_data.textProperty(), folder.nameProperty());
		updateDate_data.setText(String.valueOf(folder.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), folder.updateDateProperty());
		version_data.setText(String.valueOf(folder.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), folder.versionProperty());
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
