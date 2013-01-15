package com.dooapp.controller;

import firea.wrapper.BlowHole;

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
import firea.wrappers.TestedRoom;
import firea.entity.Discharge;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class BlowHoleController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(BlowHoleController.class);
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private ComboBox<Discharge> discharge_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField quantity_data;
	@javafx.fxml.FXML
	private TextField surface_data;
	@javafx.fxml.FXML
	private ComboBox<TestedRoom> testedroom_data;
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
	private BlowHole blowHole;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setBlowHole(BlowHole wrapper){
		this.blowHole = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(blowHole.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), blowHole.creationDateProperty());
		id_data.setText(String.valueOf(blowHole.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), blowHole.idProperty());
		quantity_data.setText(String.valueOf(blowHole.getQuantity()));
		this.binder.configureBindingBidirectional(quantity_data.textProperty(), blowHole.quantityProperty());
		surface_data.setText(String.valueOf(blowHole.getSurface()));
		this.binder.configureBindingBidirectional(surface_data.textProperty(), blowHole.surfaceProperty());
		updateDate_data.setText(String.valueOf(blowHole.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), blowHole.updateDateProperty());
		version_data.setText(String.valueOf(blowHole.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), blowHole.versionProperty());
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
	public void selectTestedroom () 
	{
		//Start of user code selectTestedroom
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
