package com.dooapp.firea.entity.fxcontroller;

import java.util.ResourceBundle;
import com.dooapp.firea.entity.fxwrapper.AbstractEntityWrapper;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.net.URL;
import com.dooapp.firea.entity.services.AbstractEntityService;
import javafx.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import javafx.fxml.FXML;
import org.springframework.stereotype.Component;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class AbstractEntityEditFxController implements Initializable
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@FXML
	private TextField abstractEntityId;
	@Autowired
	private AbstractEntityService abstractEntityService;
	@FXML
	private TextField abstractEntityVersion;
	
	private AbstractEntityWrapper abstractEntityWrapper;
	@Autowired
	private MainFxController mainController;
    

	public void handleCancelButtonAction (ActionEvent event) 
	{
		mainController.show("AbstractEntity_search");	
	}

	public void handleSubmitButtonAction (ActionEvent event) 
	{
		abstractEntityService.save(abstractEntityWrapper.getAbstractEntity());
		mainController.show("AbstractEntity_search");	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		abstractEntityVersion.setText(String.valueOf(abstractEntityWrapper.getVersion()));
		abstractEntityId.setText(String.valueOf(abstractEntityWrapper.getId()));
		
		abstractEntityVersion.textProperty().bindBidirectional(abstractEntityWrapper.versionProperty(), new javafx.util.converter.NumberStringConverter());
		abstractEntityId.textProperty().bindBidirectional(abstractEntityWrapper.idProperty(), new javafx.util.converter.NumberStringConverter());
		
			
	}

	public void setAbstractEntityWrapper (AbstractEntityWrapper w) 
	{
		this.abstractEntityWrapper = w;	
	}


}
