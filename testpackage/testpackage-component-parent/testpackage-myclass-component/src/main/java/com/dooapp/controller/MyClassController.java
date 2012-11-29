package com.dooapp.controller;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import com.dooapp.testpackage.wrapper.MyClass;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import com.google.inject.Singleton;
import javafx.fxml.FXML;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Singleton
public class MyClassController implements Initializable {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	@FXML
	private TextField myClassAttribute;
	@FXML
	private TextField myClassId;
	
	private MyClass myClassWrapper;
    

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
		myClassAttribute.setText(String.valueOf(myClassWrapper.getAttribute()));
		myClassId.setText(String.valueOf(myClassWrapper.getId()));
		
		myClassWrapper.attributeProperty().bindBidirectional(myClassAttribute.textProperty());
		myClassId.textProperty().bindBidirectional(myClassWrapper.idProperty(), new javafx.util.converter.NumberStringConverter());
		
			
	}

	
	public void setMyClass (MyClass w)  {
		this.myClassWrapper = w;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
