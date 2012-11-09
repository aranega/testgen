package com.dooapp.firea.entity.fxcontroller;

import com.dooapp.firea.entity.services.PersistentImageService;
import com.dooapp.firea.entity.fxwrapper.PersistentImageWrapper;
import java.net.URL;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import javafx.fxml.FXML;
import org.springframework.stereotype.Component;

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
		
		persistentImageTitle.textProperty().bindBidirectional(persistentImageWrapper.titleProperty(), new javafx.util.converter.NumberStringConverter());
		persistentImageSourceFile.textProperty().bindBidirectional(persistentImageWrapper.sourceFileProperty(), new javafx.util.converter.NumberStringConverter());
		persistentImagePreview.textProperty().bindBidirectional(persistentImageWrapper.previewProperty(), new javafx.util.converter.NumberStringConverter());
		persistentImageError.textProperty().bindBidirectional(persistentImageWrapper.errorProperty(), new javafx.util.converter.BooleanStringConverter());
		persistentImageDataId.textProperty().bindBidirectional(persistentImageWrapper.dataIdProperty(), new javafx.util.converter.NumberStringConverter());
		
			
	}

	public void setPersistentImageWrapper (PersistentImageWrapper w) 
	{
		this.persistentImageWrapper = w;	
	}


}
