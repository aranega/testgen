package com.dooapp.controller;

import firea.wrapper.CalibrationStep;

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
public class CalibrationStepController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(CalibrationStepController.class);
	@javafx.fxml.FXML
	private TextField afterHoleELA_data;
	@javafx.fxml.FXML
	private TextField beforeHoleELA_data;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField date_data;
	@javafx.fxml.FXML
	private TextField errorPercent_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private ComboBox<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@77d110fc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3eb24dd8 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> points_data;
	@javafx.fxml.FXML
	private TableView<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@77d110fc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3eb24dd8 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> points_dataview;
	@javafx.fxml.FXML
	private ComboBox<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@77d110fc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3eb24dd8 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> sample_data;
	@javafx.fxml.FXML
	private ComboBox<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@77d110fc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3eb24dd8 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> status_data;
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
	private CalibrationStep calibrationStep;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setCalibrationStep(CalibrationStep wrapper){
		this.calibrationStep = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		afterHoleELA_data.setText(String.valueOf(calibrationStep.getAfterHoleELA()));
		this.binder.configureBindingBidirectional(afterHoleELA_data.textProperty(), calibrationStep.afterHoleELAProperty());
		beforeHoleELA_data.setText(String.valueOf(calibrationStep.getBeforeHoleELA()));
		this.binder.configureBindingBidirectional(beforeHoleELA_data.textProperty(), calibrationStep.beforeHoleELAProperty());
		creationDate_data.setText(String.valueOf(calibrationStep.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), calibrationStep.creationDateProperty());
		date_data.setText(String.valueOf(calibrationStep.getDate()));
		this.binder.configureBindingBidirectional(date_data.textProperty(), calibrationStep.dateProperty());
		errorPercent_data.setText(String.valueOf(calibrationStep.getErrorPercent()));
		this.binder.configureBindingBidirectional(errorPercent_data.textProperty(), calibrationStep.errorPercentProperty());
		id_data.setText(String.valueOf(calibrationStep.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), calibrationStep.idProperty());
		updateDate_data.setText(String.valueOf(calibrationStep.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), calibrationStep.updateDateProperty());
		version_data.setText(String.valueOf(calibrationStep.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), calibrationStep.versionProperty());
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
