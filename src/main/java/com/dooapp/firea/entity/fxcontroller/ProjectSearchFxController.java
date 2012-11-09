package com.dooapp.firea.entity.fxcontroller;

import com.dooapp.firea.entity.fxwrapper.ProjectWrapper;
import java.net.URL;
import javafx.event.ActionEvent;
import com.dooapp.firea.entity.services.ProjectService;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import com.dooapp.firea.entity.fxwrapper.ProjectCriteriaWrapper;
import java.util.ResourceBundle;
import javafx.scene.control.TableView;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javafx.fxml.FXML;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class ProjectSearchFxController implements Initializable
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@FXML
	private TextField abstractEntityCriteriaId;
	@FXML
	private TextField abstractEntityCriteriaVersionMax;
	@FXML
	private TextField abstractEntityCriteriaVersionMin;
	@Autowired
	private MainFxController mainController;
	@FXML
	private TextField projectCriteriaDescription;
	@FXML
	private TextField projectCriteriaName;
	
	private ProjectCriteriaWrapper projectCriteriaWrapper;
	@Autowired
	private ProjectEditFxController projectEditFxController;
	@Autowired
	private ProjectService projectService;
	@FXML
	private TableView<ProjectWrapper> projectTable;
    

	public ProjectSearchFxController () 
	{
		projectCriteriaWrapper= new ProjectCriteriaWrapper();	
	}

	public void handleAdd (ActionEvent event) 
	{
		projectEditFxController.setProjectWrapper(new ProjectWrapper());
		mainController.show("Project_edit");	
	}

	public void handleSearchButtonAction (ActionEvent event) 
	{
		refreshList();	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		projectCriteriaName.setText(String.valueOf(projectCriteriaWrapper.getName()));
		projectCriteriaDescription.setText(String.valueOf(projectCriteriaWrapper.getDescription()));
		
		projectCriteriaName.textProperty().bindBidirectional(projectCriteriaWrapper.nameProperty(), new javafx.util.converter.NumberStringConverter());
		projectCriteriaDescription.textProperty().bindBidirectional(projectCriteriaWrapper.descriptionProperty(), new javafx.util.converter.NumberStringConverter());
		
		projectTable.setOnMouseClicked(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(javafx.scene.input.MouseEvent arg0)
					{
						if (arg0.getClickCount() > 1)
						{
							javafx.scene.control.SelectionModel<com.dooapp.firea.entity.fxwrapper.ProjectWrapper> model = projectTable.getSelectionModel(); 
							projectEditFxController.setProjectWrapper
								(model.getSelectedItem());
							mainController.show("Project_edit");
						}
						
					}
				});
				
				refreshList();	
	}

	public void refreshList () 
	{
		java.util.List<com.dooapp.firea.entity.fxwrapper.ProjectWrapper> all = new java.util.ArrayList<com.dooapp.firea.entity.fxwrapper.ProjectWrapper>();
		for (com.dooapp.firea.entity.domain.Project o : projectService.findByCriteria(projectCriteriaWrapper.getProjectCriteria()))
			all.add(new com.dooapp.firea.entity.fxwrapper.ProjectWrapper(o));
				
		javafx.collections.ObservableList<com.dooapp.firea.entity.fxwrapper.ProjectWrapper> proObs = javafx.collections.FXCollections.observableList(all);
		projectTable.setItems(proObs);		
	}


}
