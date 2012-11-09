package com.dooapp.firea.entity.fxcontroller;

import javafx.scene.control.TextField;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import com.dooapp.firea.entity.services.RisqueService;
import javafx.fxml.Initializable;
import java.net.URL;
import com.dooapp.firea.entity.fxwrapper.RisqueWrapper;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class RisqueEditFxController implements Initializable
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
	private TextField risqueKey;
	@Autowired
	private RisqueService risqueService;
	
	private RisqueWrapper risqueWrapper;
    

	public void handleCancelButtonAction (ActionEvent event) 
	{
		mainController.show("Risque_search");	
	}

	public void handleSubmitButtonAction (ActionEvent event) 
	{
		risqueService.save(risqueWrapper.getRisque());
		mainController.show("Risque_search");	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		risqueKey.setText(String.valueOf(risqueWrapper.getKey()));
		
		risqueWrapper.keyProperty().bindBidirectional(risqueKey.textProperty());
		
			
	}

	public void setRisqueWrapper (RisqueWrapper w) 
	{
		this.risqueWrapper = w;	
	}


}
