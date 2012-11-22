package com.dooapp.controller;

import java.net.URL;
import com.dooapp.testpackage.wrapper.CInstance;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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
		cInstanceAttribute.setText(String.valueOf(cInstanceWrapper.getAttribute()));
		cInstanceId.setText(String.valueOf(cInstanceWrapper.getId()));
		
		cInstanceWrapper.attributeProperty().bindBidirectional(cInstanceAttribute.textProperty());
		cInstanceId.textProperty().bindBidirectional(cInstanceWrapper.idProperty(), new javafx.util.converter.NumberStringConverter());
		
			
	}

	
	public void setCInstance (CInstance w)  {
		this.cInstanceWrapper = w;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
