package com.dooapp.controller;

import firea.wrapper.Point;

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
public class PointController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(PointController.class);
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField pressureGoal_data;
	@javafx.fxml.FXML
	private ComboBox<Reading> readings_data;
	@javafx.fxml.FXML
	private TableView<Reading> readings_dataview;
	@javafx.fxml.FXML
	private ComboBox<Step> step_data;
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
	private Point point;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setPoint(Point wrapper){
		this.point = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(point.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), point.creationDateProperty());
		id_data.setText(String.valueOf(point.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), point.idProperty());
		pressureGoal_data.setText(String.valueOf(point.getPressureGoal()));
		this.binder.configureBindingBidirectional(pressureGoal_data.textProperty(), point.pressureGoalProperty());
		updateDate_data.setText(String.valueOf(point.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), point.updateDateProperty());
		version_data.setText(String.valueOf(point.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), point.versionProperty());
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
	public void selectReadings () 
	{
		//Start of user code selectReadings
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
