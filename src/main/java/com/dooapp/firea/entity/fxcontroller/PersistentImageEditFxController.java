package com.dooapp.firea.entity.fxcontroller;

import javafx.event.ActionEvent;
import java.net.URL;
import javafx.scene.control.TextField;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.dooapp.firea.entity.fxwrapper.PersistentImageWrapper;
import com.dooapp.firea.entity.services.PersistentImageService;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javafx.fxml.FXML;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class PersistentImageEditFxController implements Initializable
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@FXML
	private TextField abstractEntityId;
	@FXML
	private TextField abstractEntityVersion;
	@Autowired
	private MainFxController mainController;
	@FXML
	private TextField persistentImageDataId;
	@FXML
	private TextField persistentImageError;
	@FXML
	private TextField persistentImagePreview;
	@Autowired
	private PersistentImageService persistentImageService;
	@FXML
	private TextField persistentImageSourceFile;
	@FXML
	private TextField persistentImageTitle;
	
	private PersistentImageWrapper persistentImageWrapper;
    

	public void handleCancelButtonAction (ActionEvent event) 
	{
		mainController.show("PersistentImage_search");	
	}

	public void handleSubmitButtonAction (ActionEvent event) 
	{
		persistentImageService.save(persistentImageWrapper.getPersistentImage());
		mainController.show("PersistentImage_search");	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		persistentImageTitle.setText(String.valueOf(persistentImageWrapper.getTitle()));
		persistentImageSourceFile.setText(String.valueOf(persistentImageWrapper.getSourceFile()));
		persistentImagePreview.setText(String.valueOf(persistentImageWrapper.getPreview()));
		persistentImageError.setText(String.valueOf(persistentImageWrapper.getError()));
		persistentImageDataId.setText(String.valueOf(persistentImageWrapper.getDataId()));
		
		persistentImageWrapper.titleProperty().bindBidirectional(persistentImageTitle.textProperty());
		persistentImageWrapper.sourceFileProperty().bindBidirectional(persistentImageSourceFile.textProperty());
		persistentImageWrapper.previewProperty().bindBidirectional(persistentImagePreview.textProperty());
		persistentImageError.textProperty().bindBidirectional(persistentImageWrapper.errorProperty(), new javafx.util.converter.BooleanStringConverter());
		persistentImageWrapper.dataIdProperty().bindBidirectional(persistentImageDataId.textProperty());
		
			
	}

	public void setPersistentImageWrapper (PersistentImageWrapper w) 
	{
		this.persistentImageWrapper = w;	
	}


}
