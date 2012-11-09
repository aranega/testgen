package com.dooapp.firea.entity.fxcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;
import com.dooapp.firea.entity.services.RisqueService;
import javafx.event.ActionEvent;
import com.dooapp.firea.entity.fxwrapper.RisqueWrapper;
import javafx.fxml.Initializable;
import org.springframework.beans.factory.annotation.Autowired;
import javafx.fxml.FXML;
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
		
		risqueKey.textProperty().bindBidirectional(risqueWrapper.keyProperty(), new javafx.util.converter.NumberStringConverter());
		
			
	}

	public void setRisqueWrapper (RisqueWrapper w) 
	{
		this.risqueWrapper = w;	
	}


}
