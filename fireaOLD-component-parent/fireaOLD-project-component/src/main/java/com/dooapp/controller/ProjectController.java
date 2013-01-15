package com.dooapp.controller;

import fireaOLD.wrapper.Project;

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
public class ProjectController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	@javafx.fxml.FXML
	private ComboBox<Contact> contacts_data;
	@javafx.fxml.FXML
	private TableView<Contact> contacts_dataview;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField description_data;
	@javafx.fxml.FXML
	private ComboBox<GazConfiguration> gazconfiguration_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private ComboBox<PersistentImage> image_data;
	@javafx.fxml.FXML
	private ComboBox<ProjectKind> kind_data;
	@javafx.fxml.FXML
	private TextField name_data;
	@javafx.fxml.FXML
	private ComboBox<Risque> risque_data;
	@javafx.fxml.FXML
	private ComboBox<Sample> sample_data;
	@javafx.fxml.FXML
	private TableView<Sample> sample_dataview;
	@javafx.fxml.FXML
	private ComboBox<ProjectKind> status_data;
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
	private Project project;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setProject(Project wrapper){
		this.project = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		creationDate_data.setText(String.valueOf(project.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), project.creationDateProperty());
		description_data.setText(String.valueOf(project.getDescription()));
		this.binder.configureBindingBidirectional(description_data.textProperty(), project.descriptionProperty());
		id_data.setText(String.valueOf(project.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), project.idProperty());
		name_data.setText(String.valueOf(project.getName()));
		this.binder.configureBindingBidirectional(name_data.textProperty(), project.nameProperty());
		updateDate_data.setText(String.valueOf(project.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), project.updateDateProperty());
		version_data.setText(String.valueOf(project.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), project.versionProperty());
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
	public void selectContacts () 
	{
		//Start of user code selectContacts
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectGazconfiguration () 
	{
		//Start of user code selectGazconfiguration
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectImage () 
	{
		//Start of user code selectImage
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectRisque () 
	{
		//Start of user code selectRisque
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
