package com.dooapp.controller;

import firea.wrapper.Sample;

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
import firea.wrappers.Project;
import firea.wrappers.Step;
import firea.entity.SampleStatus;
import firea.entity.AirPressureCalculationMethod;
import firea.entity.BeaufortScale;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class SampleController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	@javafx.fxml.FXML
	private ComboBox<AirPressureCalculationMethod> airPressureCalculationMethod_data;
	@javafx.fxml.FXML
	private TextField airPressure_data;
	@javafx.fxml.FXML
	private ComboBox<BeaufortScale> beaufortScale_data;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField date_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField name_data;
	@javafx.fxml.FXML
	private TextField phiEPercent_data;
	@javafx.fxml.FXML
	private TextField phiIPercent_data;
	@javafx.fxml.FXML
	private ComboBox<Project> project_data;
	@javafx.fxml.FXML
	private TextField roE_data;
	@javafx.fxml.FXML
	private TextField roI_data;
	@javafx.fxml.FXML
	private ComboBox<SampleStatus> status_data;
	@javafx.fxml.FXML
	private ComboBox<Step> step_data;
	@javafx.fxml.FXML
	private TableView<Step> step_dataview;
	@javafx.fxml.FXML
	private TextField tetaE_data;
	@javafx.fxml.FXML
	private TextField tetaI_data;
	@javafx.fxml.FXML
	private TextField updateDate_data;
	@javafx.fxml.FXML
	private TextField version_data;
	@javafx.fxml.FXML
	private TextField windMeasure_data;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/*
 	 * Handled Wrapper
	 *
	 */
	private Sample sample;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setSample(Sample wrapper){
		this.sample = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		airPressure_data.setText(String.valueOf(sample.getAirPressure()));
		this.binder.configureBindingBidirectional(airPressure_data.textProperty(), sample.airPressureProperty());
		creationDate_data.setText(String.valueOf(sample.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), sample.creationDateProperty());
		date_data.setText(String.valueOf(sample.getDate()));
		this.binder.configureBindingBidirectional(date_data.textProperty(), sample.dateProperty());
		id_data.setText(String.valueOf(sample.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), sample.idProperty());
		name_data.setText(String.valueOf(sample.getName()));
		this.binder.configureBindingBidirectional(name_data.textProperty(), sample.nameProperty());
		phiEPercent_data.setText(String.valueOf(sample.getPhiEPercent()));
		this.binder.configureBindingBidirectional(phiEPercent_data.textProperty(), sample.phiEPercentProperty());
		phiIPercent_data.setText(String.valueOf(sample.getPhiIPercent()));
		this.binder.configureBindingBidirectional(phiIPercent_data.textProperty(), sample.phiIPercentProperty());
		roE_data.setText(String.valueOf(sample.getRoE()));
		this.binder.configureBindingBidirectional(roE_data.textProperty(), sample.roEProperty());
		roI_data.setText(String.valueOf(sample.getRoI()));
		this.binder.configureBindingBidirectional(roI_data.textProperty(), sample.roIProperty());
		tetaE_data.setText(String.valueOf(sample.getTetaE()));
		this.binder.configureBindingBidirectional(tetaE_data.textProperty(), sample.tetaEProperty());
		tetaI_data.setText(String.valueOf(sample.getTetaI()));
		this.binder.configureBindingBidirectional(tetaI_data.textProperty(), sample.tetaIProperty());
		updateDate_data.setText(String.valueOf(sample.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), sample.updateDateProperty());
		version_data.setText(String.valueOf(sample.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), sample.versionProperty());
		windMeasure_data.setText(String.valueOf(sample.getWindMeasure()));
		this.binder.configureBindingBidirectional(windMeasure_data.textProperty(), sample.windMeasureProperty());
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
	public void selectProject () 
	{
		//Start of user code selectProject
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectStep () 
	{
		//Start of user code selectStep
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
