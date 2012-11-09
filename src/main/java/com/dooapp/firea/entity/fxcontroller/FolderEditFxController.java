package com.dooapp.firea.entity.fxcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import com.dooapp.firea.entity.services.FolderService;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import com.dooapp.firea.entity.fxwrapper.FolderWrapper;
import javafx.fxml.FXML;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

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
		
		folderName.textProperty().bindBidirectional(folderWrapper.nameProperty(), new javafx.util.converter.NumberStringConverter());
		folderDisplayOrder.textProperty().bindBidirectional(folderWrapper.displayOrderProperty(), new javafx.util.converter.NumberStringConverter());
		
			
	}

	public void setFolderWrapper (FolderWrapper w) 
	{
		this.folderWrapper = w;	
	}


}
