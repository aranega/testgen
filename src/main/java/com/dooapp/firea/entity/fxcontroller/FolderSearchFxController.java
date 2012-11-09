package com.dooapp.firea.entity.fxcontroller;

import com.dooapp.firea.entity.services.FolderService;
import javafx.fxml.Initializable;
import java.net.URL;
import com.dooapp.firea.entity.fxwrapper.FolderWrapper;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import com.dooapp.firea.entity.fxwrapper.FolderCriteriaWrapper;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javafx.fxml.FXML;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class FolderSearchFxController implements Initializable
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
	@FXML
	private TextField folderCriteriaDisplayOrderMax;
	@FXML
	private TextField folderCriteriaDisplayOrderMin;
	@FXML
	private TextField folderCriteriaName;
	
	private FolderCriteriaWrapper folderCriteriaWrapper;
	@Autowired
	private FolderEditFxController folderEditFxController;
	@Autowired
	private FolderService folderService;
	@FXML
	private TableView<FolderWrapper> folderTable;
	@Autowired
	private MainFxController mainController;
    

	public FolderSearchFxController () 
	{
		folderCriteriaWrapper= new FolderCriteriaWrapper();	
	}

	public void handleAdd (ActionEvent event) 
	{
		folderEditFxController.setFolderWrapper(new FolderWrapper());
		mainController.show("Folder_edit");	
	}

	public void handleSearchButtonAction (ActionEvent event) 
	{
		refreshList();	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		folderCriteriaName.setText(String.valueOf(folderCriteriaWrapper.getName()));
		folderCriteriaDisplayOrderMin.setText(String.valueOf(folderCriteriaWrapper.getDisplayOrderMin()));
		folderCriteriaDisplayOrderMax.setText(String.valueOf(folderCriteriaWrapper.getDisplayOrderMax()));
		
		folderCriteriaWrapper.nameProperty().bindBidirectional(folderCriteriaName.textProperty());
		folderCriteriaDisplayOrderMin.textProperty().bindBidirectional(folderCriteriaWrapper.displayOrderMinProperty(), new javafx.util.converter.NumberStringConverter());
		folderCriteriaDisplayOrderMax.textProperty().bindBidirectional(folderCriteriaWrapper.displayOrderMaxProperty(), new javafx.util.converter.NumberStringConverter());
		
		folderTable.setOnMouseClicked(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(javafx.scene.input.MouseEvent arg0)
					{
						if (arg0.getClickCount() > 1)
						{
							javafx.scene.control.SelectionModel<com.dooapp.firea.entity.fxwrapper.FolderWrapper> model = folderTable.getSelectionModel(); 
							folderEditFxController.setFolderWrapper
								(model.getSelectedItem());
							mainController.show("Folder_edit");
						}
						
					}
				});
				
				refreshList();	
	}

	public void refreshList () 
	{
		java.util.List<com.dooapp.firea.entity.fxwrapper.FolderWrapper> all = new java.util.ArrayList<com.dooapp.firea.entity.fxwrapper.FolderWrapper>();
		for (com.dooapp.firea.entity.domain.Folder o : folderService.findByCriteria(folderCriteriaWrapper.getFolderCriteria()))
			all.add(new com.dooapp.firea.entity.fxwrapper.FolderWrapper(o));
				
		javafx.collections.ObservableList<com.dooapp.firea.entity.fxwrapper.FolderWrapper> proObs = javafx.collections.FXCollections.observableList(all);
		folderTable.setItems(proObs);		
	}


}
