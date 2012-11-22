package com.dooapp.controller;

import java.net.URL;
import javafx.fxml.Initializable;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import com.dooapp.testpackage.wrapper.BInstance;
import com.dooapp.testpackage.entity.CInstanceBean;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import com.google.inject.Singleton;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Singleton
public class BInstanceController implements Initializable {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	@FXML
	private TextField bInstanceAttribute;
	@FXML
	private ComboBox<CInstance> bInstanceCinstance;
	@FXML
	private TextField bInstanceId;
	
	private BInstance bInstanceWrapper;
    

	@FXML
	public void cinstanceHandleAction (ActionEvent event)  {
		//Start of user code cinstanceHandleAction
		// TODO: implement me! 
		//End of user code	
	}

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
		bInstanceAttribute.setText(String.valueOf(bInstanceWrapper.getAttribute()));
		bInstanceId.setText(String.valueOf(bInstanceWrapper.getId()));
		
		bInstanceAttribute.textProperty().bindBidirectional(bInstanceWrapper.attributeProperty(), new javafx.util.converter.NumberStringConverter());
		bInstanceId.textProperty().bindBidirectional(bInstanceWrapper.idProperty(), new javafx.util.converter.NumberStringConverter());
		
		refreshCinstance();
			
	}

	
	public void refreshCinstance ()  {
		//Start of user code refreshCinstance
		// TODO: Implement me !
		//End of user code	
	}

	@FXML
	public void selectCinstance ()  {
		//Start of user code selectCinstance
		// ex: bInstance.setCInstance(bInstanceCinstance.getSelectionModel().getSelectedItem());
		// TODO: Implement me !
		//End of user code	
	}

	
	public void setBInstance (BInstance w)  {
		this.bInstanceWrapper = w;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
