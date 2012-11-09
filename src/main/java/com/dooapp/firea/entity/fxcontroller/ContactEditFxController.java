package com.dooapp.firea.entity.fxcontroller;

import com.dooapp.firea.entity.fxwrapper.ContactWrapper;
import com.dooapp.firea.entity.services.ContactService;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import com.dooapp.firea.entity.domain.PersistentImage;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import com.dooapp.firea.entity.services.PersistentImageService;
import org.springframework.stereotype.Component;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class ContactEditFxController implements Initializable
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@FXML
	private TextField abstractEntityId;
	@FXML
	private TextField abstractEntityVersion;
	@FXML
	private TextField contactAddress2;
	@FXML
	private TextField contactAdress1;
	@FXML
	private TextField contactCity;
	@FXML
	private TextField contactEmail;
	@FXML
	private ComboBox<PersistentImage> contactImage;
	@FXML
	private TextField contactName;
	@FXML
	private TextField contactPerson;
	@FXML
	private TextField contactPhone;
	@Autowired
	private ContactService contactService;
	@FXML
	private TextField contactSiret;
	
	private ContactWrapper contactWrapper;
	@FXML
	private TextField contactZipCode;
	@Autowired
	private MainFxController mainController;
	@Autowired
	private PersistentImageService persistentImageService;
    

	public void handleCancelButtonAction (ActionEvent event) 
	{
		mainController.show("Contact_search");	
	}

	public void handleSubmitButtonAction (ActionEvent event) 
	{
		contactService.save(contactWrapper.getContact());
		mainController.show("Contact_search");	
	}

	public void imageHandleAction (ActionEvent event) 
	{
		//Start of user code imageHandleAction
		// TODO: implement me! 
		//End of user code	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		contactName.setText(String.valueOf(contactWrapper.getName()));
		contactPerson.setText(String.valueOf(contactWrapper.getPerson()));
		contactAdress1.setText(String.valueOf(contactWrapper.getAdress1()));
		contactAddress2.setText(String.valueOf(contactWrapper.getAddress2()));
		contactZipCode.setText(String.valueOf(contactWrapper.getZipCode()));
		contactCity.setText(String.valueOf(contactWrapper.getCity()));
		contactEmail.setText(String.valueOf(contactWrapper.getEmail()));
		contactPhone.setText(String.valueOf(contactWrapper.getPhone()));
		contactSiret.setText(String.valueOf(contactWrapper.getSiret()));
		
		contactWrapper.nameProperty().bindBidirectional(contactName.textProperty());
		contactWrapper.personProperty().bindBidirectional(contactPerson.textProperty());
		contactWrapper.adress1Property().bindBidirectional(contactAdress1.textProperty());
		contactWrapper.address2Property().bindBidirectional(contactAddress2.textProperty());
		contactWrapper.zipCodeProperty().bindBidirectional(contactZipCode.textProperty());
		contactWrapper.cityProperty().bindBidirectional(contactCity.textProperty());
		contactWrapper.emailProperty().bindBidirectional(contactEmail.textProperty());
		contactWrapper.phoneProperty().bindBidirectional(contactPhone.textProperty());
		contactWrapper.siretProperty().bindBidirectional(contactSiret.textProperty());
		
		refreshImage();
			
	}

	public void refreshImage () 
	{
		//Start of user code refreshImage
		// TODO: Implement me !
		//End of user code	
	}

	public void selectImage () 
	{
		//Start of user code selectImage
		// ex: contactWrapper.setPersistentImage(contactImage.getSelectionModel().getSelectedItem());
		// TODO: Implement me !
		//End of user code	
	}

	public void setContactWrapper (ContactWrapper w) 
	{
		this.contactWrapper = w;	
	}


}
