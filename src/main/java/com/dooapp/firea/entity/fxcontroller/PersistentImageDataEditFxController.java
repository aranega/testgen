package com.dooapp.firea.entity.fxcontroller;

import javafx.event.ActionEvent;
import java.net.URL;
import javafx.scene.control.TextField;
import com.dooapp.firea.entity.services.PersistentImageDataService;
import com.dooapp.firea.entity.fxwrapper.PersistentImageDataWrapper;
import javafx.fxml.Initializable;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import javafx.fxml.FXML;
import org.springframework.stereotype.Component;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class PersistentImageDataEditFxController implements Initializable
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
	private TextField persistentImageDataData;
	@Autowired
	private PersistentImageDataService persistentImageDataService;
	
	private PersistentImageDataWrapper persistentImageDataWrapper;
    

	public void handleCancelButtonAction (ActionEvent event) 
	{
		mainController.show("PersistentImageData_search");	
	}

	public void handleSubmitButtonAction (ActionEvent event) 
	{
		persistentImageDataService.save(persistentImageDataWrapper.getPersistentImageData());
		mainController.show("PersistentImageData_search");	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		persistentImageDataData.setText(String.valueOf(persistentImageDataWrapper.getData()));
		
		persistentImageDataWrapper.dataProperty().bindBidirectional(persistentImageDataData.textProperty());
		
			
	}

	public void setPersistentImageDataWrapper (PersistentImageDataWrapper w) 
	{
		this.persistentImageDataWrapper = w;	
	}


}
