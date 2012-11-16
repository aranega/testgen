package com.dooapp.controller;

import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import java.net.URL;
import javafx.event.ActionEvent;
import java.util.ResourceBundle;
import com.dooapp.test.wrapper.SimpleClassWrapper;
import javafx.fxml.FXML;
import com.google.inject.Singleton;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Singleton
public class SimpleClassController implements Initializable
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	@FXML
	private TextField simpleClassId;
	
	private SimpleClassWrapper simpleClassWrapper;
    

	@FXML
	public void handleCancelButtonAction (ActionEvent event) 
	{
		//Start of user code handleCancelButtonAction
		// TOTO: handleCancelButtonAction
		// End of user code	
	}

	@FXML
	public void handleSubmitButtonAction (ActionEvent event) 
	{
		//Start of user code handleSubmitButtonAction
		// TOTO: handleSubmitButtonAction
		// End of user code	
	}

	
	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		simpleClassId.setText(String.valueOf(simpleClassWrapper.getId()));
		
		simpleClassId.textProperty().bindBidirectional(simpleClassWrapper.idProperty(), new javafx.util.converter.NumberStringConverter());
		
			
	}

	
	public void setSimpleClassWrapper (SimpleClassWrapper w) 
	{
		this.simpleClassWrapper = w;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
