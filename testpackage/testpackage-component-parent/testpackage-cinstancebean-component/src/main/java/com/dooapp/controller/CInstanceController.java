package com.dooapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import com.dooapp.testpackage.wrapper.CInstance;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;
import java.net.URL;
import com.google.inject.Singleton;
import javafx.fxml.FXML;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Singleton
public class CInstanceController implements Initializable {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	@FXML
	private TextField cInstanceAttribute;
	@FXML
	private TextField cInstanceId;
	
	private CInstance cInstanceWrapper;
    

	@FXML
	public void handleCancelButtonAction (ActionEvent event)  {
		//Start of user code handleCancelButtonAction
		// TOTO: handleCancelButtonAction
		// End of user code	
	}

	@FXML
	public void handleSubmitButtonAction (ActionEvent event)  {
		//Start of user code handleSubmitButtonAction
		// TOTO: handleSubmitButtonAction
		// End of user code	
	}

	
	public void initialize (URL args0, ResourceBundle args1)  {
		// Bindings
		cInstanceAttribute.setText(String.valueOf(cInstance.getAttribute()));
		cInstanceId.setText(String.valueOf(cInstance.getId()));
		
		cInstanceWrapper.attributeProperty().bindBidirectional(cInstanceAttribute.textProperty());
		cInstanceId.textProperty().bindBidirectional(cInstanceWrapper.idProperty(), new javafx.util.converter.NumberStringConverter());
		
			
	}

	
	public void setCInstance (CInstance w)  {
		this.cInstance = w;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
