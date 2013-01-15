package com.dooapp.controller;

import firea.wrapper.MainStep;

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

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class MainStepController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(MainStepController.class);
	@javafx.fxml.FXML
	private TextField calculatedELA_data;
	@javafx.fxml.FXML
	private TextField cl_data;
	@javafx.fxml.FXML
	private TextField correlation_data;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField date_data;
	@javafx.fxml.FXML
	private TextField direction_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField n_data;
	@javafx.fxml.FXML
	private ComboBox<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1a7712d4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7f7529de (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> points_data;
	@javafx.fxml.FXML
	private TableView<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1a7712d4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7f7529de (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> points_dataview;
	@javafx.fxml.FXML
	private ComboBox<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1a7712d4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7f7529de (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> sample_data;
	@javafx.fxml.FXML
	private ComboBox<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1a7712d4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7f7529de (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> status_data;
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
	private MainStep mainStep;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setMainStep(MainStep wrapper){
		this.mainStep = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		calculatedELA_data.setText(String.valueOf(mainStep.getCalculatedELA()));
		this.binder.configureBindingBidirectional(calculatedELA_data.textProperty(), mainStep.calculatedELAProperty());
		cl_data.setText(String.valueOf(mainStep.getCl()));
		this.binder.configureBindingBidirectional(cl_data.textProperty(), mainStep.clProperty());
		correlation_data.setText(String.valueOf(mainStep.getCorrelation()));
		this.binder.configureBindingBidirectional(correlation_data.textProperty(), mainStep.correlationProperty());
		creationDate_data.setText(String.valueOf(mainStep.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), mainStep.creationDateProperty());
		date_data.setText(String.valueOf(mainStep.getDate()));
		this.binder.configureBindingBidirectional(date_data.textProperty(), mainStep.dateProperty());
		direction_data.setText(String.valueOf(mainStep.getDirection()));
		this.binder.configureBindingBidirectional(direction_data.textProperty(), mainStep.directionProperty());
		id_data.setText(String.valueOf(mainStep.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), mainStep.idProperty());
		n_data.setText(String.valueOf(mainStep.getN()));
		this.binder.configureBindingBidirectional(n_data.textProperty(), mainStep.nProperty());
		updateDate_data.setText(String.valueOf(mainStep.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), mainStep.updateDateProperty());
		version_data.setText(String.valueOf(mainStep.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), mainStep.versionProperty());
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
