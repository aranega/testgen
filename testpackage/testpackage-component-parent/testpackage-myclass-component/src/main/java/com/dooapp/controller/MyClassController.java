package com.dooapp.controller;

import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import com.dooapp.testpackage.wrapper.MyClass;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import com.google.inject.Singleton;

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
	private TextField myClassDateMe;
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
		myClassDateMe.setText(String.valueOf(myClassWrapper.getDateMe()));
		myClassId.setText(String.valueOf(myClassWrapper.getId()));
		
		myClassDateMe.textProperty().bindBidirectional(myClassWrapper.dateMeProperty(), new javafx.util.converter.DateStringConverter());
		myClassId.textProperty().bindBidirectional(myClassWrapper.idProperty(), new javafx.util.converter.NumberStringConverter());
		
			
	}

	
	public void setMyClass (MyClass w)  {
		this.myClassWrapper = w;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
