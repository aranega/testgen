package com.dooapp.controller;

import fireaOLD.wrapper.GazConfiguration;

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
public class GazConfigurationController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(GazConfigurationController.class);
	@javafx.fxml.FXML
	private ComboBox<BottleConfiguration> bottleconfigurations_data;
	@javafx.fxml.FXML
	private TableView<BottleConfiguration> bottleconfigurations_dataview;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField droppedCeilFull_data;
	@javafx.fxml.FXML
	private TextField droppedFloorFull_data;
	@javafx.fxml.FXML
	private ComboBox<Gaz> gaz_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField leekRepartitionPercent_data;
	@javafx.fxml.FXML
	private ComboBox<Project> project_data;
	@javafx.fxml.FXML
	private TextField retentionGoal_data;
	@javafx.fxml.FXML
	private TextField retentionInterface_data;
	@javafx.fxml.FXML
	private TextField slowUnloadingValue_data;
	@javafx.fxml.FXML
	private TextField slowUnloading_data;
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
	private GazConfiguration gazConfiguration;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setGazConfiguration(GazConfiguration wrapper){
		this.gazConfiguration = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(gazConfiguration.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), gazConfiguration.creationDateProperty());
		droppedCeilFull_data.setText(String.valueOf(gazConfiguration.getDroppedCeilFull()));
		this.binder.configureBindingBidirectional(droppedCeilFull_data.textProperty(), gazConfiguration.droppedCeilFullProperty());
		droppedFloorFull_data.setText(String.valueOf(gazConfiguration.getDroppedFloorFull()));
		this.binder.configureBindingBidirectional(droppedFloorFull_data.textProperty(), gazConfiguration.droppedFloorFullProperty());
		id_data.setText(String.valueOf(gazConfiguration.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), gazConfiguration.idProperty());
		leekRepartitionPercent_data.setText(String.valueOf(gazConfiguration.getLeekRepartitionPercent()));
		this.binder.configureBindingBidirectional(leekRepartitionPercent_data.textProperty(), gazConfiguration.leekRepartitionPercentProperty());
		retentionGoal_data.setText(String.valueOf(gazConfiguration.getRetentionGoal()));
		this.binder.configureBindingBidirectional(retentionGoal_data.textProperty(), gazConfiguration.retentionGoalProperty());
		retentionInterface_data.setText(String.valueOf(gazConfiguration.getRetentionInterface()));
		this.binder.configureBindingBidirectional(retentionInterface_data.textProperty(), gazConfiguration.retentionInterfaceProperty());
		slowUnloadingValue_data.setText(String.valueOf(gazConfiguration.getSlowUnloadingValue()));
		this.binder.configureBindingBidirectional(slowUnloadingValue_data.textProperty(), gazConfiguration.slowUnloadingValueProperty());
		slowUnloading_data.setText(String.valueOf(gazConfiguration.getSlowUnloading()));
		this.binder.configureBindingBidirectional(slowUnloading_data.textProperty(), gazConfiguration.slowUnloadingProperty());
		updateDate_data.setText(String.valueOf(gazConfiguration.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), gazConfiguration.updateDateProperty());
		version_data.setText(String.valueOf(gazConfiguration.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), gazConfiguration.versionProperty());
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
	public void selectBottleconfigurations () 
	{
		//Start of user code selectBottleconfigurations
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectGaz () 
	{
		//Start of user code selectGaz
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
