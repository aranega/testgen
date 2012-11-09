package com.dooapp.firea.entity.fxcontroller;

import java.util.ResourceBundle;
import com.dooapp.firea.entity.services.FolderService;
import com.dooapp.firea.entity.fxwrapper.FolderWrapper;
import javafx.scene.control.TextField;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class FolderEditFxController implements Initializable
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@FXML
	private TextField abstractEntityId;
	@FXML
	private TextField abstractEntityVersion;
	@FXML
	private TextField folderDisplayOrder;
	@FXML
	private TextField folderName;
	@Autowired
	private FolderService folderService;
	
	private FolderWrapper folderWrapper;
	@Autowired
	private MainFxController mainController;
    

	public void handleCancelButtonAction (ActionEvent event) 
	{
		mainController.show("Folder_search");	
	}

	public void handleSubmitButtonAction (ActionEvent event) 
	{
		folderService.save(folderWrapper.getFolder());
		mainController.show("Folder_search");	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		folderName.setText(String.valueOf(folderWrapper.getName()));
		folderDisplayOrder.setText(String.valueOf(folderWrapper.getDisplayOrder()));
		
		folderWrapper.nameProperty().bindBidirectional(folderName.textProperty());
		folderDisplayOrder.textProperty().bindBidirectional(folderWrapper.displayOrderProperty(), new javafx.util.converter.NumberStringConverter());
		
			
	}

	public void setFolderWrapper (FolderWrapper w) 
	{
		this.folderWrapper = w;	
	}


}
