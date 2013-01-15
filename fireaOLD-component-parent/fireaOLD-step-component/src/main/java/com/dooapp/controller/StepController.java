package com.dooapp.controller;

import fireaOLD.wrapper.Step;

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
import fireaOLD.wrappers.Sample;
import fireaOLD.wrappers.Point;
import fireaOLD.entity.StepStatus;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class StepController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(StepController.class);
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField date_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private ComboBox<Point> points_data;
	@javafx.fxml.FXML
	private TableView<Point> points_dataview;
	@javafx.fxml.FXML
	private ComboBox<Sample> sample_data;
	@javafx.fxml.FXML
	private ComboBox<StepStatus> status_data;
	@javafx.fxml.FXML
	private TextField ununsefuleAtt_data;
	@javafx.fxml.FXML
	private TextField ununsefuleAtt_data;
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
	private Step step;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setStep(Step wrapper){
		this.step = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(step.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), step.creationDateProperty());
		date_data.setText(String.valueOf(step.getDate()));
		this.binder.configureBindingBidirectional(date_data.textProperty(), step.dateProperty());
		id_data.setText(String.valueOf(step.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), step.idProperty());
		ununsefuleAtt_data.setText(String.valueOf(step.getUnunsefuleAtt()));
		this.binder.configureBindingBidirectional(ununsefuleAtt_data.textProperty(), step.ununsefuleAttProperty());
		ununsefuleAtt_data.setText(String.valueOf(step.getUnunsefuleAtt()));
		this.binder.configureBindingBidirectional(ununsefuleAtt_data.textProperty(), step.ununsefuleAttProperty());
		updateDate_data.setText(String.valueOf(step.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), step.updateDateProperty());
		version_data.setText(String.valueOf(step.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), step.versionProperty());
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
