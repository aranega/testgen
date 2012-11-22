package com.dooapp.controller;

import javafx.scene.control.ComboBox;
import com.dooapp.testpackage.entity.BInstanceBean;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import java.net.URL;
import com.dooapp.testpackage.wrapper.AInstance;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import com.dooapp.testpackage.wrapper.BInstance;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import com.google.inject.Singleton;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Singleton
public class AInstanceController implements Initializable {
	//Start of user code for attributes
	// Other attributes
	//End of user code
	@FXML
	private TextField aInstanceAttribute;
	@FXML
	private TextField aInstanceAttribute2;
	@FXML
	private TextField aInstanceAttribute5;
	@FXML
	private TableView<BInstance> aInstanceBinstance;
	@FXML
	private ComboBox<BInstance> aInstanceBinstanceSelect;
	@FXML
	private TextField aInstanceId;
	
	private AInstance aInstanceWrapper;
    

	@FXML
	public void binstanceHandleAction (ActionEvent event)  {
		//Start of user code binstanceHandleAction
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
		aInstanceAttribute.setText(String.valueOf(aInstanceWrapper.getAttribute()));
		aInstanceAttribute2.setText(String.valueOf(aInstanceWrapper.getAttribute2()));
		aInstanceAttribute5.setText(String.valueOf(aInstanceWrapper.getAttribute5()));
		aInstanceId.setText(String.valueOf(aInstanceWrapper.getId()));
		
		aInstanceAttribute.textProperty().bindBidirectional(aInstanceWrapper.attributeProperty(), new javafx.util.converter.NumberStringConverter());
		aInstanceAttribute2.textProperty().bindBidirectional(aInstanceWrapper.attribute2Property(), new javafx.util.converter.NumberStringConverter());
		aInstanceWrapper.attribute5Property().bindBidirectional(aInstanceAttribute5.textProperty());
		aInstanceId.textProperty().bindBidirectional(aInstanceWrapper.idProperty(), new javafx.util.converter.NumberStringConverter());
		
		refreshBinstanceList();
			
	}

	
	public void refreshBinstance ()  {
		//Start of user code refreshBinstance
		// TODO: Implement me !
		//End of user code	
	}

	
	public void refreshBinstanceList ()  {
		//Start of user code refreshBinstanceList
		// ex: aInstanceBeanBinstance.setItems(javafx.collections.FXCollections.observableList(aInstance.getBinstanceProperty()));	
		// TODO: Implement me !
		//End of user code	
	}

	@FXML
	public void selectBinstance ()  {
		//Start of user code selectBinstance
		// TODO: Implement me !
		//End of user code	
	}

	
	public void setAInstance (AInstance w)  {
		this.aInstanceWrapper = w;	
	}


	//Start of user code for methods
	// Other methods
	//End of user code

}
