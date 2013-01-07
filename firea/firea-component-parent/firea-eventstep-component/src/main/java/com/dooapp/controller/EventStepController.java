package com.dooapp.controller;

import firea.wrapper.EventStep;

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
import firea.entity.Direction;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class EventStepController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(EventStepController.class);
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField date_data;
	@javafx.fxml.FXML
	private ComboBox<Direction> direction_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private ComboBox<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5962700 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@44da73dd (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> points_data;
	@javafx.fxml.FXML
	private TableView<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5962700 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@44da73dd (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> points_dataview;
	@javafx.fxml.FXML
	private ComboBox<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5962700 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@44da73dd (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> sample_data;
	@javafx.fxml.FXML
	private ComboBox<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5962700 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@44da73dd (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> status_data;
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
	private EventStep eventStep;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setEventStep(EventStep wrapper){
		this.eventStep = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(eventStep.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), eventStep.creationDateProperty());
		date_data.setText(String.valueOf(eventStep.getDate()));
		this.binder.configureBindingBidirectional(date_data.textProperty(), eventStep.dateProperty());
		id_data.setText(String.valueOf(eventStep.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), eventStep.idProperty());
		updateDate_data.setText(String.valueOf(eventStep.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), eventStep.updateDateProperty());
		version_data.setText(String.valueOf(eventStep.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), eventStep.versionProperty());
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
	public void selectPoints () 
	{
		//Start of user code selectPoints
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectSample () 
	{
		//Start of user code selectSample
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
